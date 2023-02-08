package Homework.Seminar_1;

// Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
// Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

public class sem_1_3
{
    public static void main(String[] args)
    {
    for (int i = 2; i<=100; i++)
    {
        boolean flag = true;
        for(int j = 2; j < i; j++)
        {
            if (i % j==0) flag = false;
        }
        if (flag) System.out.print(i+ " ");
        
    }
    }
}

