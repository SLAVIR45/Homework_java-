package Homework.Seminar_3;

import java.util.ArrayList;

// Пусть дан произвольный список целых чисел
// Нужно удалить из него четные числа
// Найти минимальное значение
// Найти максимальное значение

public class Sem_3_1
{
    public static void main(String[] args) 
    {
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=0; i<10; i++)
    {
        arr.add((int) (Math.random()*11));
    }
    System.out.println(arr);
    System.out.println(removeEvenValue(arr) + " - Удалены чётные числа");
    System.out.println(max(arr) + " - max");
    System.out.println(min(arr) + " - min");
    System.out.println(average(arr) + " - average");

    }
    public static ArrayList<Integer> removeEvenValue(ArrayList<Integer> list) //удаление чётных чисел
    {
        ArrayList<Integer> result_arr = new ArrayList<>();
        for (int i=0; i<list.toArray().length; i++)
        {
            if((int) list.toArray()[i]%2 !=0)
            {
                result_arr.add((int) (list.toArray()[i]));
            }
        }
        return result_arr;
    }
    public static int max(ArrayList<Integer> list) //нахождение максимума
    {
        int max = (int) list.toArray()[0];
        for (int item:list)
        {
            if (item > max) max = item; 
        }
        return max;
    } 
    public static int min(ArrayList<Integer> list) //нахождение минимума
    {
        int min = (int) list.toArray()[0];
        for (int item:list)
        {
            if (item < min) min = item; 
        }
        return min;
    } 
    public static double average(ArrayList<Integer> list) //нахождение нахождение среднеарефметического
    {
        double average;
        int sum = 0;
        for (int item:list) sum += item;
        average = sum/(int)(list.toArray().length); 
        return average;
    } 

}

