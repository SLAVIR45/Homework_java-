package Homework.Seminar_1;
import java.util.Arrays;
import java.util.Scanner;

public class sem_1_2 
{
    public static void main(String[] args) 
    {
    Scanner num = new Scanner(System.in);
    System.out.println("Введите длинну массива:");
    int long_= num.nextInt();
    int[] random_arr = arr(long_);
    System.out.println(Arrays.toString(random_arr));  
    System.out.println(Arrays.toString(bubble_sorting(random_arr, long_)));
    System.out.println(Arrays.toString(bubble_sorting_2(random_arr, long_)));
    num.close();
    }


    public static int [] bubble_sorting_2(int[] arr, int long_)
    {
    boolean sorted = false;
    int temp;
    while(!sorted) 
    {
        sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                sorted = false;
            }
        }
    }
    return arr;
    }


    public static int [] bubble_sorting(int[] arr, int long_)
    {
    int temp;
    for (int i = 0; i< long_; i++)
    {
        for (int j = 0; j < long_-1; j++)
        {
            if (arr[j] > arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    return arr;
    }   

    public static int[] arr(int long_) // создание массива с заданной длинной 
    {
        int [] array = new int [long_];
        for (int i = 0; i < array.length-1; i++)
        {
            array[i] = (int)Math.round(Math.random()*300);
        } 
        return array;
        
    }
}

