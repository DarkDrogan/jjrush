package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by drogan on 22.12.15.
 */
public class ImageReaderFactory
{
    private static ImageReader reader;
    public static ImageReader getReader(ImageTypes type){
        if(type == ImageTypes.BMP){
            reader = new BmpReader();
        }else if(type == ImageTypes.JPG){
            reader = new JpgReader();
        }else if(type == ImageTypes.PNG){
            reader = new PngReader();
        }else{
            throw new IllegalArgumentException();
        }
        return reader;
    }
}
