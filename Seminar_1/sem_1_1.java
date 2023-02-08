package Homework.Seminar_1;

import java.util.Arrays;
import java.util.Scanner;


// Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(),
// который возвращает значение в промежутке [0, 300].

public class sem_1_1 {
    public static void main(String[] args) 
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int long_= num.nextInt();
        int[] random_arr = array(long_);
        System.out.println(Arrays.toString(random_arr));
        System.out.println("min: " + min(random_arr));
        System.out.println("max: " + max(random_arr));
        System.out.println("average: " + average(random_arr));
        num.close();
    }
    
    public static int[] array(int long_) // создание массива с заданной длинной 
    {
        int [] array = new int [long_];
        for (int i = 0; i < array.length-1; i++)
        {
            array[i] = (int)Math.round(Math.random()*300);
        } 
        return array;
    }

    
    public static int min(int[] arr) //нахождение минимуму
    {
        int min = arr[1];
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    } 
    
    public static int max(int[] arr) //нахождение максимума
    {
        int max = arr[1];
        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    } 

    public static int average(int[] arr) // нахождение среднеарефметического
    {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum+=arr[i];
        }
        average = sum/arr.length;
        return (int)average;
    } 
}
