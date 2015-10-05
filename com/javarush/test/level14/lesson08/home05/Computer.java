package com.javarush.test.level14.lesson08.home05;

/**
 * Created by drogan on 15.09.15.
 */
public class Computer
{
    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor)
    {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Computer()
    {
        this.monitor = new Monitor();
        this.mouse = new Mouse();
        this.keyboard = new Keyboard();
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
}
