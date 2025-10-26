package com.soft.demo.window;

import javax.swing.*;

public class GameFrame {

    private JFrame jFrame;

    public GameFrame(GamePanel gamePanel) {
        jFrame = new JFrame();

        jFrame.setTitle("Demo Game");
        jFrame.add(gamePanel);
        jFrame.pack();
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
