/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Menu {
    public int getChoice(Object[] arrObject)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        for (int i = 0; i < arrObject.length; i++) {
            System.out.println((i+1)+"-"+arrObject[i]);
        }
        System.out.println("--------------------");
        System.out.println("Enter selection: ");
        int choice = sc.nextInt();
        return choice;
    }
    
}
