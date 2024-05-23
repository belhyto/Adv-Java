/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dapp;
import javax.swing.*;
/**
 *
 * @author dell
 */
public class SimpleApplet {
    public void show() {
        // Create a JFrame
        JFrame frame = new JFrame("Simple Applet");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Add components to the frame
        JLabel label = new JLabel("This is a simple applet.");
        frame.add(label);

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
