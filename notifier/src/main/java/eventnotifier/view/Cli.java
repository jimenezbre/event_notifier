/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventnotifier.view;

import java.util.Scanner;

/**
 *
 * @author Victor J.B
 */
public class Cli{
    Scanner sc = new Scanner(System.in);
    
    public String requestInput()
    {
      return sc.nextLine();
    }
}
