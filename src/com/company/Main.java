package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
	    Scanner sc = new Scanner(new File("MyData.txt"));

        int maxIndex = -1;
        String text[] = new String[1000];

        while (sc.hasNext())
        {
            maxIndex++;
            text[maxIndex] = sc.nextLine();
        }

        sc.close();
        for (int j = 0; j<=maxIndex; j++)
        {
            System.out.println(text[j]);
        }


        FileWriter fw = new FileWriter("output.txt", true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("Jellybeans");
        pw.println(1);


        Scanner kbIn = new Scanner(System.in);
        System.out.println("Enter Your Password");
        String password = kbIn.nextLine();
        pw.println(password);

        pw.close();
        fw.close();

    }
}
