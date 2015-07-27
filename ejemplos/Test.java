/*
 * Test.java
 * This file is part of ISIS1206
 *
 * Copyright (C) 2015 - ISIS1206 Team 
 *
 */


import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test
{
     public static void main(String... args) 
     {
        try 
        {
            System.out.println("Ingrese un número por favor: ");
            BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            double number = Double.parseDouble(s);
            System.out.println("El número ingresado es:" + number);
        } 
        catch (Exception e) 
        {
            System.err.println("Error:" + e.getMessage());
        }
    }
}
