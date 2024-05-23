/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dapp;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dell
 */
public class CustomerApplet extends JPanel  {
    
    public CustomerApplet() {
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Customer Name:"));
        add(new JTextField());

        add(new JLabel("Customer Number:"));
        add(new JTextField());

        add(new JLabel("Age:"));
        add(new JTextField());

        add(new JLabel("Address:"));
        add(new JTextField());
    }
}