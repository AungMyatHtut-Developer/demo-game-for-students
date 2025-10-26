package com.soft.demo.window;

import com.soft.demo.input.KeyboardInputListener;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel {

    Random rand = new Random();

    private int x = 100, y = 100;
    private int speed =3;
    private int directionX = 1, directionY = 1;
    private Color color;

    public GamePanel() {
        color = Color.WHITE;
        Dimension screenSize = new Dimension(500, 300);
        setPreferredSize(screenSize);
        setBackground(Color.BLACK);
        addKeyListener(new KeyboardInputListener(this));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        update();
        render(g);

        repaint();
    }

    public void update() {

    }

    public void left() {
        x -= speed;
    }

    public void right() {
        x += speed;
    }

    public void up() {
        y -= speed;
    }

    public void down() {
        y += speed;
    }

    public void render(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, 20, 20);
    }

    public void updateColor() {
        int r = rand.nextInt(256); // 0 - 255
        int g = rand.nextInt(256); // 0 - 255
        int b = rand.nextInt(256); // 0 - 255
        color = new Color(r, g, b);
    }
}
