package Homework.Seminar_2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате

public class sem_2_1 
{
   public static void main(String[] args) 
   {
    Scanner num = new Scanner(System.in);
    System.out.println("ВВедите число");
    Logger logger = Logger.getLogger(sem_2_1.class.getName());
    ConsoleHandler ch = new ConsoleHandler();
    logger.addHandler(ch);
    SimpleFormatter sFormatter = new SimpleFormatter();
    ch.setFormatter(sFormatter);
    try
    {
        byte num_byte = num.nextByte();
        File file = new File("result.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(num_byte);
        pw.close();
        num.close();
    }
    catch (Exception e)
    {
        logger.info("Exepttion: " + e.getMessage());
        
    }     
   
    }
    
   
}
