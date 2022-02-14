package com.task.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Helper {

    public static int generateRandomNumber()
    {
        Random rand = new Random();
        return rand.nextInt(10000);
    }

    public static void WriteToFile(String textToAppend, String filePath) throws IOException {
        File file = new File(filePath);
        file.createNewFile();

        textToAppend+="\r\n";

        FileOutputStream outputStream = new FileOutputStream(filePath, true);
        byte[] strToBytes = textToAppend.getBytes();
        outputStream.write(strToBytes);

        outputStream.close();
        }
    }


