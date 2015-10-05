package com.javarush.test.level09.lesson11.home01;

import java.awt.*;
import javax.swing.*;

/**
 * Created by drogan on 04.09.15.
 */
public class NotHelloWorld
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                NotHelloWorldFrame frame = new NotHelloWorldFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class NotHelloWorldFrame extends JFrame
{
    public NotHelloWorldFrame()
    {
        setTitle("NotHelloWorld");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setResizable(true);//My change for watch save it text from frame. My English is very bad)))

        NotHelloWorldPanel panel = new NotHelloWorldPanel();
        add(panel);
    }

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
}

class NotHelloWorldPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        g.drawString("Watch down", 100, 87);//just my changes
        g.drawString("Just pull it down", 100, 107);//it too
        g.drawString("I don't understand it", MESS_X, MESS_Y);//this ought be "Not a hello, World programm"
    }

    public static final int MESS_X = 75;
    public static final int MESS_Y = 375;//In original 100, but I want to know save it, not it
}