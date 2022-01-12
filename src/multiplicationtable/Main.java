/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multiplicationtable;

import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        MultiplicationTable frame = new MultiplicationTable();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 700);
        frame.setLocationRelativeTo(null);
    }
}
