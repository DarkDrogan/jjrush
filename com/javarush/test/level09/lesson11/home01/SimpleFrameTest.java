package com.javarush.test.level09.lesson11.home01;

import javax.swing.*;
import java.awt.*;

/**
 * Created by drogan on 03.09.15.
 */
public class SimpleFrameTest
{
    public static void main(String[] args){
        SimpleFrame simpleFrame = new SimpleFrame();
        simpleFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        simpleFrame.setVisible(true);
    }
}

class SimpleFrame extends JFrame
{
    public SimpleFrame(){
        /*Toolkit toolkit = Toolkit.getDefaultToolkit(); - take object toolkit - window-system of OS
        * Dimension dimen = toolkit.getScreenSize(); - get ScreenSize of this Screen
        * int width = (int) dimen.getWidth(); - take and cast width
        * int height = (int) dimen.getHeight(); - take and cast height
        */
        //setSize(width, height); - I'll do it first time. but original example is:
        setSize(DEFAULT_HEIGHT, DEFAULT_WIDTH);
    }

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
}
