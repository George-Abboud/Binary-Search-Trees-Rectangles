/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problem_1;

/**
 *
 * @author dell
 */
public class Node {
    char data;
    int width,height;
    Node left,right;

    public Node(char data,int width,int height)
    {
        this.data=data;
        this.width=width;
        this.height=height;
        left=right=null;
        
    }
}
