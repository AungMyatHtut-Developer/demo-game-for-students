package com.soft.demo.input;

import com.soft.demo.window.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputListener implements KeyListener {

    private GamePanel gamePanel;

    public KeyboardInputListener(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_A-> gamePanel.left(); //left
            case KeyEvent.VK_D-> gamePanel.right(); //right
            case KeyEvent.VK_W-> gamePanel.up(); //up
            case KeyEvent.VK_S-> gamePanel.down(); //down
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
