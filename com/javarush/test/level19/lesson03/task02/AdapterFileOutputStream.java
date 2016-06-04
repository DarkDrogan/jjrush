package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter{

    FileOutputStream origin;

    public AdapterFileOutputStream(FileOutputStream origin){
        this.origin = origin;
    }

    @Override
    public void flush() throws IOException
    {
        origin.flush();
    }

    @Override
    public void writeString(String s) throws IOException
    {
        byte [] array = s.getBytes();
        origin.write(array);
    }

    @Override
    public void close() throws IOException
    {
        origin.close();
    }
}

