package com.javarush.test.level09.lesson11.home01;

import java.awt.*;
import javax.swing.*;

/**
 * Created by drogan on 03.09.15.
 */

public class SizedFrameTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                SizedFrame sizedFrame = new SizedFrame();
                sizedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sizedFrame.setVisible(true);
            }
        });
    }
}

class SizedFrame extends JFrame
{
    public SizedFrame()
    {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dimen = kit.getScreenSize();
        int screenHeight = dimen.height;
        int screenWidth = dimen.getSize().width;

        setSize(screenWidth, screenHeight);
        setLocationByPlatform(true);

        Image img = kit.getImage("icon.jpg");
        setIconImage(img);
        setTitle("SizedFrame");
    }
}