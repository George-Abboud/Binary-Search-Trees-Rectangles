/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problem_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author dell
 */
public class BT {
    // 1)insert:

    public static Node[] arrOfNodes = new Node[11];
    public static int[][] info = new int[11][2];
    public static Node root;
    public static int maxNodes;
    public static String leftSubTree[] = new String[100];
    public static int leftSubTreeCount = 0;
    String s = "";

    public static void fillInfo() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 2; j++) {
                info[i][j] = -1;
            }
        }

        for (int i = 0; i < 11; i++) {
            arrOfNodes[i] = null;
        }
    }

    // Note: in the root case: num==0 and destination null !!!
    public static void insert(char data, int width, int height, int num, String destination) {
        Node node = new Node(data, width, height);

        if (num == 0 && destination == null) {
            arrOfNodes[0] = node;
            return;
        }

        int index = 0;

        for (int i = 1; i < 11; i++) {
            if (arrOfNodes[i] == null) {
                arrOfNodes[i] = node;
                index = i;
                break;
            }
        }

        if (destination == "Left") {
            info[num - 1][0] = index;
        }

        if (destination == "Right") {
            info[num - 1][1] = index;
        }

    }

    public static void buildTree(Node[] Nodes, int[][] information) {
        root = Nodes[0];
        Node tNode;
        int temp;

        for (int i = 0; i < 11; i++) {
            tNode = Nodes[i];

            for (int j = 0; j < 2; j++) {
                if (information[i][j] != -1) {
                    temp = information[i][j];
                    if (j == 0) {
                        tNode.left = Nodes[temp];
                    }

                    if (j == 1) {
                        tNode.right = Nodes[temp];
                    }
                }
            }
        }
    }

    public static String printNodesInformation() {
        String str = "";
        String data = "";
        String index = "";
        for (int i = 0; i < 11; i++) {
            if (arrOfNodes[i] != null) {
                data = data + arrOfNodes[i].data + "\t";
                index = index + Integer.toString(i + 1) + "\t";
            }
        }
        str = index + "\n" + data;
        return str;
    }

    // 2)Export:
    // public static String formula="";
    public static String export_From_Tree_To_Formula(Node root) {
        String str = exp(root);
        boolean b = str.contains("(");
        if (b) {
            str = str.substring(2, str.length() - 2);
        }

        return str;
    }

    // Note: this function to make a formula but with more '(' and ')'
    public static String exp(Node root) {
        String str = "";
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            str = str + root.data + "[" + root.width + "," + root.height + "]" + " ";
            return str;
        }

        str = str + "( ";
        str = str + exp(root.left);

        if (root.data == '|' || root.data == '-') {
            str = str + root.data + " ";
        }

        str = str + exp(root.right);
        str = str + ") ";
        return str;
    }

    // 2)import:
    public static Node import_From_Formula_To_Tree(String str) {
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '|' || str.charAt(i) == '-' || str.charAt(i) == '(' || str.charAt(i) == ')') {
                Node tNode = new Node(str.charAt(i), 0, 0);
                nodes.add(tNode);
            }

            if (((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) || ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122)) {
                char data = str.charAt(i);

                int j = i + 2;
                int startInd = j;
                while ((int) str.charAt(j) >= 48 && (int) str.charAt(j) <= 57) {
                    j++;
                }

                int width = Integer.parseInt(str.substring(startInd, j));

                j++;
                startInd = j;
                while ((int) str.charAt(j) >= 48 && (int) str.charAt(j) <= 57) {
                    j++;
                }

                int height = Integer.parseInt(str.substring(startInd, j));

                Node tNode = new Node(data, width, height);
                nodes.add(new Node('(', 0, 0));
                nodes.add(tNode);
                nodes.add(new Node(')', 0, 0));
            }

        }

        if (nodes.size() == 3 && nodes.get(0).data == '(' && nodes.get(2).data == ')') {
            return buildBinaryTree(nodes.subList(1, 2));
        }

        Node root = buildBinaryTree(nodes);
        return root;
    }

    // text area (export and import):
    // public static String text_Area="";
    public static String text_Area_Import(Node root) {
        String str = "";
        str = str + "The tree with Pre Order:\n";
        str = str + printPreOrder(root);

        str = str + "\n\nThe tree with In Order:\n";
        str = str + printInOrder(root);

        str = str + "\n\nThe tree with Post Order:\n";
        str = str + printPostOrder(root);

        return str;
    }

    public static String printInOrder(Node root) {
        String str = "";
        if (root == null) {
            return "";
        }

        str = str + printInOrder(root.left);
        str = str + root.data + " ";
        str = str + printInOrder(root.right);

        return str;
    }

    public static String printPreOrder(Node root) {
        String str = "";
        if (root == null) {
            return "";
        }

        str = str + root.data + " ";
        str = str + printPreOrder(root.left);
        str = str + printPreOrder(root.right);

        return str;
    }

    public static String printPostOrder(Node root) {
        String str = "";
        if (root == null) {
            return "";
        }

        str = str + printPostOrder(root.left);
        str = str + printPostOrder(root.right);
        str = str + root.data + " ";

        return str;
    }

    // ----------------------------------------------------------------------------------------------------------------
    // 2) BuildBinaryTree for: import from formula to BT && create a tree from a
    // group of cards!
    public static Node buildBinaryTree(List<Node> nodes) {

        int index = 0;
        index = findRootIndex(nodes);

        if (index == 0) {
            return nodes.get(0);
        }

        if (index == 1) {
            Node root = nodes.get(1);
            root.left = buildBinaryTree(nodes.subList(0, 1));
            root.right = buildBinaryTree(nodes.subList(2, nodes.size()));
            return root;
        } else {
            Node root = nodes.get(index);
            root.left = buildBinaryTree(nodes.subList(1, index - 1));
            root.right = buildBinaryTree(nodes.subList(index + 2, nodes.size() - 1));
            return root;
        }

    }

    /*
     * ---------------------------------------------------------------------------
     * 3) Export
     * ---------------------------------------------------------------------------
     */
    public static List<Node> convert_to_inorderList(Node root) {
        List<Node> nodes = new ArrayList<>();
        nodes = inorderList(root);
        nodes.remove(nodes.size() - 1);
        nodes.remove(0);
        return nodes;
    }

    public static List<Node> inorderList(Node root) {
        List<Node> nodes = new ArrayList<>();
        if (root.left == null && root.right == null) {
            nodes.add(new Node('(', 0, 0));
            nodes.add(root);
            nodes.add(new Node(')', 0, 0));
            return nodes;
        }

        nodes.add(new Node('(', 0, 0));
        nodes.addAll(inorderList(root.left));
        nodes.add(root);
        nodes.addAll(inorderList(root.right));
        nodes.add(new Node(')', 0, 0));

        return nodes;

    }

//------------------------------------------------------------------------------------------------------
    public static int findRootIndex(List<Node> nodes) {
        if (nodes.size() == 1) {
            return 0;
        }

        if (nodes.get(0).data != '(' && nodes.get(nodes.size() - 1).data != ')') {
            return 1;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < nodes.size(); i++) {
            if (start != 0 && end != 0 && start == end) {
                return i;
            }

            if (nodes.get(i).data == '(') {
                start++;
            }

            if (nodes.get(i).data == ')') {
                end++;
            }

        }

        return 1;
    }

    public static int totalWidth(Node root) {
        if (root.left == null && root.right == null) {
            return root.width;
        }

        int width = 0;

        int w1 = totalWidth(root.left);
        int w2 = totalWidth(root.right);

        if (root.data == '-') {
            width += w1;
        } else {
            width += w1 + w2;
        }

        return width;

    }

    public static int totalHeight(Node root) {
        if (root.left == null && root.right == null) {
            return root.height;
        }

        int height = 0;
        int h1 = totalHeight(root.left);
        int h2 = totalHeight(root.right);

        if (root.data == '|') {
            height += h1;
        } else {
            height += h1 + h2;
        }

        return height;
    }

    public static char[][] scaleTool(char[][] bigRec) {
        int width = bigRec[0].length;
        int height = bigRec.length;
        int heightScale = 0;

        if (height % 2 == 0) {
            heightScale = height / 2;
            char[][] rec = new char[heightScale][width];

            for (int i = 0; i < height / 2; i++) {
                for (int j = 0; j < width; j++) {
                    if ((bigRec[i * 2][j] == '-' && bigRec[i * 2 + 1][j] == '|') || (bigRec[i * 2][j] == '|' && bigRec[i * 2 + 1][j] == '-') || (bigRec[i * 2][j] == '-' && bigRec[i * 2 + 1][j] == ' ') || (bigRec[i * 2][j] == ' ' && bigRec[i * 2 + 1][j] == '-')) {
                        rec[i][j] = '-';
                    }

                    if ((bigRec[i * 2][j] == '|' && bigRec[i * 2 + 1][j] == '|')) {
                        rec[i][j] = '|';
                    }

                    if ((bigRec[i * 2][j] == ' ' && bigRec[i * 2 + 1][j] == ' ')) {
                        rec[i][j] = ' ';
                    }

                    if ((bigRec[i * 2][j] == ' ' && ((int) bigRec[i * 2 + 1][j] >= 65 && (int) bigRec[i * 2 + 1][j] <= 90)) || (bigRec[i * 2][j] == ' ' && (int) bigRec[i * 2 + 1][j] >= 97 && (int) bigRec[i * 2 + 1][j] <= 122)) {
                        rec[i][j] = bigRec[i * 2 + 1][j];
                    }

                    if ((bigRec[i * 2 + 1][j] == ' ' && ((int) bigRec[i * 2][j] >= 65 && (int) bigRec[i * 2][j] <= 90)) || (bigRec[i * 2 + 1][j] == ' ' && (int) bigRec[i * 2][j] >= 97 && (int) bigRec[i * 2][j] <= 122)) {
                        rec[i][j] = bigRec[i * 2][j];
                    }

                }
            }
            return rec;

        } else {
            heightScale = height / 2 + 1;
            char[][] rec = new char[heightScale][width];
            for (int j = 0; j < width; j++) {
                rec[heightScale - 1][j] = bigRec[height - 1][j];
            }

            for (int i = 0; i < height / 2; i++) {
                for (int j = 0; j < width; j++) {
                    if ((bigRec[i * 2][j] == '-' && bigRec[i * 2 + 1][j] == '|') || (bigRec[i * 2][j] == '|' && bigRec[i * 2 + 1][j] == '-') || (bigRec[i * 2][j] == '-' && bigRec[i * 2 + 1][j] == ' ') || (bigRec[i * 2][j] == ' ' && bigRec[i * 2 + 1][j] == '-')) {
                        rec[i][j] = '-';
                    }

                    if ((bigRec[i * 2][j] == '|' && bigRec[i * 2 + 1][j] == '|')) {
                        rec[i][j] = '|';
                    }

                    if ((bigRec[i * 2][j] == ' ' && bigRec[i * 2 + 1][j] == ' ')) {
                        rec[i][j] = ' ';
                    }

                    if ((bigRec[i * 2][j] == ' ' && ((int) bigRec[i * 2 + 1][j] >= 65 && (int) bigRec[i * 2 + 1][j] <= 90)) || (bigRec[i * 2][j] == ' ' && (int) bigRec[i * 2 + 1][j] >= 97 && (int) bigRec[i * 2 + 1][j] <= 122)) {
                        rec[i][j] = bigRec[i * 2 + 1][j];
                    }

                    if ((bigRec[i * 2 + 1][j] == ' ' && ((int) bigRec[i * 2][j] >= 65 && (int) bigRec[i * 2][j] <= 90)) || (bigRec[i * 2 + 1][j] == ' ' && (int) bigRec[i * 2][j] >= 97 && (int) bigRec[i * 2][j] <= 122)) {
                        rec[i][j] = bigRec[i * 2][j];
                    }

                }
            }

            return rec;
        }
    }

    public static char[][] exp_rec(List<Node> nodes) {
        if (nodes == null) {
            return null;
        }

        if (nodes.size() == 1) {
            int totalWidth = totalWidth(buildBinaryTree(nodes));
            int totalHeight = totalHeight(buildBinaryTree(nodes));
            char[][] rec = drawCard(nodes, totalWidth, totalHeight);
            return rec;
        }

        int index = findRootIndex(nodes);
        char[][] left = exp_rec(nodes.subList(1, index - 1));
        char[][] right = exp_rec(nodes.subList(index + 2, nodes.size() - 1));

        if (nodes.get(index).data == '|') {
            int totalWidth = totalWidth(buildBinaryTree(nodes));
            int totalHeight = totalHeight(buildBinaryTree(nodes));
            char[][] rec = new char[totalHeight][totalWidth];

            for (int i = 1; i < left.length - 1; i++) {

                if (left[i][left[0].length - 2] == '-') {
                    left[i][left[0].length - 1] = '-';
                } else {
                    left[i][left[0].length - 1] = ' ';
                }
            }

            for (int i = 0; i < totalHeight; i++) {
                for (int j = 0; j < totalWidth; j++) {

                    if (i < left.length && j < left[0].length) {
                        rec[i][j] = left[i][j];
                    }

                    if (i < right.length && j < right[0].length) {
                        if (right[i][0] == '|' && left[i][left[0].length - 2] == '-') {
                            right[i][j] = '-';
                        }
                        rec[i][j + left[0].length] = right[i][j];
                    }

                }
            }
            return rec;
        } else {

            int totalWidth = totalWidth(buildBinaryTree(nodes));
            int totalHeight = totalHeight(buildBinaryTree(nodes));
            char[][] rec = new char[totalHeight][totalWidth];

            for (int i = 0; i < left[0].length; i++) {
                if (i == 0 || i == left[0].length - 1 || left[left.length - 2][i] == '|') {
                    left[left.length - 1][i] = '|';
                } else {
                    left[left.length - 1][i] = ' ';
                }
            }

            for (int i = 0; i < totalHeight; i++) {
                for (int j = 0; j < totalWidth; j++) {

                    if (i < left.length && j < left[0].length) {
                        rec[i][j] = left[i][j];
                    }

                    if (i < right.length && j < right[0].length) {
                        rec[i + left.length][j] = right[i][j];
                    }

                }
            }
            return rec;
        }

    }

    public static String export_from_tree_to_rectangle(Node root, String fileName) throws FileNotFoundException {
        List<Node> nodes = new ArrayList<>();
        nodes = convert_to_inorderList(root);

        String rectangleTowrite = "";

        int totalWidth = totalWidth(root);
        int totalHeight = totalHeight(root);

        char[][] rec = new char[totalHeight][totalWidth];
        rec = exp_rec(nodes);
        for (int i = 0; i < rec.length; i++) {
            for (int j = 0; j < rec[0].length; j++) {
                rectangleTowrite += Character.toString(rec[i][j]);
            }

            rectangleTowrite += "\n";
        }
        // //!Write On File
        PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
        pw.write(rectangleTowrite);
        pw.flush();

        rec = scaleTool(rec);
        rec = scaleTool(rec);
        String scalableRec = "";
        for (int i = 0; i < rec.length; i++) {
            for (int j = 0; j < rec[0].length; j++) {
                scalableRec += Character.toString(rec[i][j]);
            }

            scalableRec += "\n";
        }

        return scalableRec;
    }

    public static char[][] drawCard(List<Node> nodes, int totalWidth, int totalHeight) {
        char[][] rec = new char[totalHeight][totalWidth];

        for (int i = 0; i < totalHeight; i++) {
            for (int j = 0; j < totalWidth; j++) {
                if (i == 0 || i == totalHeight - 1) {
                    rec[i][j] = '-';
                } else if (j == 0 || j == totalWidth - 1) {
                    if (i > 0 && i < totalHeight - 1) {
                        rec[i][j] = '|';
                    }
                } else if (i == totalHeight / 2 && j == totalWidth / 2) {
                    rec[i][j] = nodes.get(0).data;
                } else {
                    rec[i][j] = ' ';
                }
            }

        }

        return rec;

    }

//import:
    public static char[][] convert_From_String_to_Draw(String rectangle) {

        String[] temp = rectangle.split("\n");
        char[][] rec = new char[temp.length][temp[0].length()];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length(); j++) {
                rec[i][j] = temp[i].charAt(j);
            }
        }

        return rec;

    }

    public static Node find_Root_From_Rectangle(char[][] rec) {
        if (rec.length == 0 || rec[0].length == 0) {
            return null;
        }

        List<Integer> lineVertical = new ArrayList<>();
        List<Integer> lineHorizontal = new ArrayList<>();

        for (int i = 1; i < rec[0].length - 1; i++) {
            if (rec[1][i] == '|') {
                lineVertical.add(i);

            }
        }

        for (int i = 1; i < rec.length - 1; i++) {
            if (rec[i][1] == '-') {
                lineHorizontal.add(i);

            }
        }

        //note: this case for card!
        if (lineHorizontal.isEmpty() && lineVertical.isEmpty()) {
            int width = (rec[0].length) / 10 * 10;
            int height = (rec.length) / 10 * 10;
            char data = rec[height / 2][width / 2];

            Node node = new Node(data, width, height);
            return node;
        }

        if (!lineHorizontal.isEmpty()) {
            for (int j : lineHorizontal) {
                for (int i = 1; i < rec[0].length; i++) {
                    if (i == rec[0].length - 1) {

                        Node root = new Node('-', 0, j);
                        return root;

                    }

                    if (rec[j][i] == ' ') {
                        break;
                    }
                }
            }
        }

        if (!lineVertical.isEmpty()) {
            for (int j : lineVertical) {
                for (int i = 1; i < rec.length; i++) {
                    if (i == rec.length - 1) {
                        Node root = new Node('|', j, 0);
                        return root;

                    }

                    if (rec[i][j] == ' ') {
                        break;
                    }
                }

            }
        }

        return null;
    }

    public static char[][] getArray(char[][] rec, int heightStart, int heightEnd, int widthStart, int widthEnd) {

        char[][] card = new char[heightEnd - heightStart + 1][widthEnd - widthStart + 1];

        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[0].length; j++) {
                card[i][j] = rec[heightStart + i][widthStart + j];
            }
        }
        return card;
    }

    public static Node import_from_rectangle_to_BT() throws FileNotFoundException {
        // //!Read From File
        Scanner in = new Scanner(new FileInputStream("mainTree.txt"));
        String rectangleFromFile = "";
        while (in.hasNextLine()) {
            rectangleFromFile = rectangleFromFile + in.nextLine() + '\n';
        }

        char[][] rec = convert_From_String_to_Draw(rectangleFromFile);

        if (rec.length == 0 && rec[0].length == 0) {
            return null;
        }

        Node root = imp_rec(rec);
        return root;
    }

    public static Node imp_rec(char[][] rec) {

        Node root = find_Root_From_Rectangle(rec);

        if (root.data != '-' && root.data != '|') {
            return root;
        }

        if (root.data == '-') {

            char[][] left = getArray(rec, 0, root.height, 0, rec[0].length - 1);
            char[][] right = getArray(rec, root.height, rec.length - 1, 0, rec[0].length - 1);
            root.left = imp_rec(left);
            root.right = imp_rec(right);
            root.width = root.height = 0;

            return root;
        }

        if (root.data == '|') {
            char[][] left = getArray(rec, 0, rec.length - 1, 0, root.width);
            char[][] right = getArray(rec, 0, rec.length - 1, root.width, rec[0].length - 1);
            root.left = imp_rec(left);
            root.right = imp_rec(right);
            root.width = root.height = 0;

            return root;
        }

        return root;

    }

    //The 4th Function :
    public static List<Node> create_Recatangle(List<Node> Papers) {
        List<Node> rectangle = new ArrayList<>();
        if (isRectangle(Papers).isEmpty()) {
            return null;
        } else {
            rectangle = isRectangle(Papers).get(0);
            return rectangle;
        }
    }

    public static List<List<Node>> isRectangle(List<Node> Papers) {
        List<List<Node>> FinalResult = new ArrayList<>();
        List<List<Node>> firstResult = new ArrayList<>();
        List<List<Node>> secondResult = new ArrayList<>();
        List<Node> firstCombination = new ArrayList<>();
        List<Node> secondCombination = new ArrayList<>();

        //Base Case
        if (Papers.size() == 1) {
            FinalResult.add(Papers);
            return FinalResult;
        }

        //Check if equals.
        List<Node> widthEquals = widthEquals(Papers);
        List<Node> heightEquals = heightEquals(Papers);

        if (!widthEquals.isEmpty() && !heightEquals.isEmpty()) {
            FinalResult.add(heightEquals);
            FinalResult.add(widthEquals);
            return FinalResult;
        } else if (!widthEquals.isEmpty()) {
            FinalResult.add(widthEquals);
            return FinalResult;
        } else if (!heightEquals.isEmpty()) {
            FinalResult.add(heightEquals);
            return FinalResult;
        }

        //Generate Permutations
        List<List<Node>> permutations = generatePermutations(Papers);
        for (int per = 0; per < permutations.size(); per += (int) Math.pow(Papers.size(), 4)) {
            //Take a permute :
            Papers = permutations.get(per);
            for (int k = 0; k < Papers.size(); k++) {
                //Fill the first combination
                firstCombination.add(Papers.get(k));
                //Fill the second combination
                for (Node Paper : Papers) {
                    if (!firstCombination.contains(Paper) && !secondCombination.contains(Paper)) {
                        secondCombination.add(Paper);
                    }
                }

                //The main Algorithm :
                for (int i = 0; i < Papers.size(); i++) {
                    //Find the parts solution
                    firstResult = isRectangle(firstCombination);
                    secondResult = isRectangle(secondCombination);

                    if (!firstResult.isEmpty()) {
                        if (!secondResult.isEmpty()) {

                            for (int f = 0; f < firstResult.size(); f++) {

                                //Find the First Result Sum.
                                int firstHeight = getHeight(firstResult.get(f));
                                int firstWidth = getWidth(firstResult.get(f));
//
                                for (int s = 0; s < secondResult.size(); s++) {

                                    //Find the Second Result Sum.
                                    int secondHeight = getHeight(secondResult.get(s));
                                    int secondWidth = getWidth(secondResult.get(s));

                                    //Compare time :
                                    List<Node> temp = new ArrayList<>();
                                    if (firstHeight == secondHeight) {
                                        temp.add(new Node('(', 0, 0));
                                        temp.addAll(firstResult.get(f));
                                        temp.add(new Node(')', 0, 0));
                                        temp.add(new Node('|', 0, 0));
                                        temp.add(new Node('(', 0, 0));
                                        temp.addAll(secondResult.get(s));
                                        temp.add(new Node(')', 0, 0));
                                        FinalResult.add(temp);
                                        return FinalResult;
                                    } else if (firstWidth == secondWidth) {
                                        temp.add(new Node('(', 0, 0));
                                        temp.addAll(firstResult.get(f));
                                        temp.add(new Node(')', 0, 0));
                                        temp.add(new Node('-', 0, 0));
                                        temp.add(new Node('(', 0, 0));
                                        temp.addAll(secondResult.get(s));
                                        temp.add(new Node(')', 0, 0));
                                        FinalResult.add(temp);
                                        return FinalResult;
                                    }
                                }
                            }
                        } else {
                            if (!secondCombination.isEmpty()) {
                                Node deleted = secondCombination.remove(0);
                                firstCombination.add(deleted);
                            }
                        }
                    } else {
                        if (!firstCombination.isEmpty() || !secondCombination.isEmpty()) {
                            secondCombination.add(firstCombination.remove(firstCombination.size() - 1));
                            firstCombination.add(secondCombination.remove(0));
                        }
                    }

                }

                //Reset and take another case
                firstResult.clear();
                secondResult.clear();
                firstCombination.clear();
                secondCombination.clear();
            }
        }
        return FinalResult;
    }

    /////// Generate Permutations
    public static List<List<Node>> generatePermutations(List<Node> paperList) {
        List<List<Node>> result = new ArrayList<>();
        permute(paperList, 0, result);
        return result;
    }

    private static void permute(List<Node> paperList, int start, List<List<Node>> result) {
        if (start == paperList.size() - 1) {
            result.add(new ArrayList<>(paperList));
            return;
        }
        for (int i = start; i < paperList.size(); i++) {
            Collections.swap(paperList, start, i);
            permute(paperList, start + 1, result);
            Collections.swap(paperList, start, i); // backtrack
        }
    }

    //Check if the papers equals in width
    public static List<Node> widthEquals(List<Node> Papers) {
        List<Node> FinalResult = new ArrayList<>();
        for (int i = 0; i < Papers.size() - 1; i++) {
            if (Papers.get(i).width == Papers.get(i + 1).width) {

                FinalResult.add(Papers.get(i));
                FinalResult.add(new Node('-', 0, 0));
            } else {
                FinalResult.clear();
                break;
            }
        }
        if (!FinalResult.isEmpty()) {
            FinalResult.add(Papers.get(Papers.size() - 1));
            return FinalResult;
        }
        return FinalResult;
    }

    //Check if the papers equals in height
    public static List<Node> heightEquals(List<Node> Papers) {
        List<Node> FinalResult = new ArrayList<>();
        for (int i = 0; i < Papers.size() - 1; i++) {

            if (Papers.get(i).height == Papers.get(i + 1).height) {
                FinalResult.add(Papers.get(i));
                FinalResult.add(new Node('|', 0, 0));
            } else {
                FinalResult.clear();
                break;
            }
        }
        if (!FinalResult.isEmpty()) {
            FinalResult.add(Papers.get(Papers.size() - 1));
        }
        return FinalResult;
    }

    //get the width of a rectangle
    public static int getWidth(List<Node> Papers) {
        Stack<Node> stk = new Stack<>();
        int width = 0;
        if (Papers.size() == 1) {
            width += Papers.get(0).width;
            return width;
        } else {
            for (int i = 0; i < Papers.size(); i++) {
                if (Papers.get(i).data == '(') {
                    stk.push(Papers.get(i));
                } else if (Papers.get(i).data == ')') {
                    if (!stk.isEmpty()) {
                        stk.pop();
                    }

                    //First case (Return)
                    if ((i + 1) < Papers.size()) {
                        if (stk.isEmpty() && Papers.get(i + 1).data == '-') // () - ()
                        {
                            return width;
                        }
                    } //Second Case
                    else if (!stk.isEmpty() && Papers.get(i + 1).data == '-') { // ( ()-() ) - ()
                        int j = i + 2;
                        for (; j < Papers.size() - 1; j++) {
                            if (Papers.get(j).data == '(') {
                                stk.push(Papers.get(j));
                            }
                            if (Papers.get(j).data == ')') {
                                stk.pop();
                            }
                            if (stk.isEmpty()) {
                                break;
                            }
                        }
                        i = j - 1;
                    }
                } else {
                    if (i > 0) {
                        if (Papers.get(i - 1).data == '-') {
                            continue;
                        }
                        width += Papers.get(i).width;
                    } else {
                        width += Papers.get(i).width;
                    }
                }
            }
            return width;
        }
    }

    //get the height of a rectangle
    public static int getHeight(List<Node> Papers) {
        Stack<Node> stk = new Stack<>();
        int height = 0;

        if (Papers.size() == 1) {
            height = Papers.get(0).height;
            return height;
        } else {
            for (int i = 0; i < Papers.size(); i++) {
                if (Papers.get(i).data == '(') {
                    stk.push(Papers.get(i));
                    continue;
                } else if (Papers.get(i).data == ')') {
                    if (!stk.isEmpty()) {
                        stk.pop();
                    }

                    //First Case : (Best)
                    if ((i + 1) < Papers.size()) {
                        if (stk.isEmpty() && Papers.get(i + 1).data == '|') /// () | ()
                        {
                            return height;
                        }
                    } //Second Case :
                    else if (!stk.isEmpty() && Papers.get(i + 1).data == '|') {  /// ( ()|() ) | ()
                        int j = i + 2;
                        for (; j < Papers.size(); j++) {
                            if (Papers.get(j).data == '(') {
                                stk.push(Papers.get(j));
                            }
                            if (Papers.get(j).data == ')') {
                                stk.pop();
                            }
                            if (stk.isEmpty()) {
                                break;
                            }
                        }
                        i = j - 1;
                    }
                } else {
                    if (i > 0) {
                        if (Papers.get(i - 1).data == '|') {
                            continue;
                        }
                        height += Papers.get(i).height;
                    } else {
                        height += Papers.get(i).height;
                    }
                }
            }
        }
        return height;
    }

    //------------------------------------------------------------------------------------------------------------
    public static int possibleRectangles(List<Node> papers) {
        List<List<Node>> combinations = generateCombinations(papers);
        int counter = 0;
        for (List<Node> combination : combinations) {
            for (Node node : combination) {
                System.out.print(node.data + " ");
            }
            System.out.println("");
        }
        for (List<Node> combination : combinations) {
            List<List<Node>> Result = isRectangle(combination);
            if (!Result.isEmpty()) {
                counter++;
            }
        }
        return counter;
    }

    public static List<List<Node>> generateCombinations(List<Node> papers) {
        List<List<Node>> combinations = new ArrayList<>();
        int numItems = papers.size();
        for (int i = 0; i < (1 << numItems); i++) {
            ArrayList<Node> combination = new ArrayList<>();
            for (int j = 0; j < numItems; j++) {
                if ((i & (1 << j)) != 0) {
                    combination.add(papers.get(j));
                }
            }
            combinations.add(combination);
        }
        return combinations;
    }

    /*-------------------------------------------------------------------------------------
       6) Routation and Draw Tree
    ---------------------------------------------------------------------------------------
     */
    // Draw :
    public static int get_Row(int height) {
        if (height == 0) {
            return 1;
        }

        int row = 0;
        int lineCount = 0;
        if (height > 2) {
            int temp = 2;
            for (int i = 0; i < height - 2; i++) {
                temp = temp * 2 + 1;
            }
            lineCount = temp;
            row = lineCount;
            for (int i = 1; i <= height; i++) {
                row += lineCount / (2 * i);

            }
            row += height + 1;

        } else {
            row += 3 * height;

        }
        return row;
    }

    public static int get_Col(int row) {
        int col = 2 * row - 1;
        return col;

    }

    public static int get_Line_Count(int height) {

        int lineCount = 0;
        if (height > 2) {
            int temp = 2;
            for (int i = 0; i < height - 2; i++) {
                temp = temp * 2 + 1;
            }
            lineCount = temp;
        } else {
            lineCount = height;
        }
        return lineCount;
    }

    public static int get_Height_Tree(Node root) {
        if (root == null) {
            return -1;
        }

        int left = get_Height_Tree(root.left);
        int right = get_Height_Tree(root.right);

        int height = Math.max(left, right);
        return height + 1;
    }

    public static String draw_Tree(Node root) {
        String str = "";
        int height = get_Height_Tree(root);

        int row = get_Row(height);
        int col = get_Col(row);

        char[][] binaryTree = new char[row][col];

        binaryTree = draw_BT(root);

        for (int i = 0; i < binaryTree.length; i++) {
            for (int j = 0; j < binaryTree[0].length; j++) {
                str += Character.toString(binaryTree[i][j]);
            }
            str += "\n";
        }

        return str;

    }

    public static char[][] draw_BT(Node root) {
        int height = get_Height_Tree(root);
        if (height == 0) {
            char[][] binaryTree = new char[1][1];
            binaryTree[0][0] = root.data;
            return binaryTree;
        }

        int row = get_Row(height);
        int col = get_Col(row);

        char[][] binaryTree = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                binaryTree[i][j] = ' ';
            }
        }
        int edgeIndex = col / 2;
        int count = 1;
        int temp1 = 0;
        int temp2 = 0;
        binaryTree[0][edgeIndex] = root.data;
        int lineCount = get_Line_Count(height);

        for (int i = 0; i < lineCount; i++) {

            binaryTree[i + 1][edgeIndex - count] = '/';
            binaryTree[i + 1][edgeIndex + count] = '\\';
            temp1 = edgeIndex - count;
            temp2 = edgeIndex + count;
            count++;
        }

        char[][] left = draw_BT(root.left);
        char[][] right = draw_BT(root.right);

        int rIndex = lineCount + 1;

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[0].length; j++) {

                binaryTree[rIndex + i][temp1 - 1 - left[0].length / 2 + j] = left[i][j];

            }
        }

        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < right[0].length; j++) {
                binaryTree[rIndex + i][temp2 + 1 - right[0].length / 2 + j] = right[i][j];

            }
        }

        return binaryTree;
    }

    //Routation:
    public static Node routation_paper(Node root) {
        if (root == null) {
            return null;
        }

        char data = root.data;
        Node routation = routation(root, data);

        return routation;
    }

    public static Node routation(Node root, char data) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            int temp = root.height;
            root.height = root.width;
            root.width = temp;
            return root;
        }

        routation(root.left, data);
        routation(root.right, data);

        if (root.data == data) {
            Node tNode = root.left;
            root.left = root.right;
            root.right = tNode;
        }

        if (root.data == '-') {
            root.data = '|';
        } else {
            root.data = '-';
        }

        return root;
    }

}
