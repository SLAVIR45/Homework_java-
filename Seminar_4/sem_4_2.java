package Homework.Seminar_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class sem_4_2 
{
//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public static void main(String[] args) {
    Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
    Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
    // result [6,6,0,1]
    Deque<Integer> sum_deque = sum(d1, d2);
    System.out.println(sum_deque);

}


public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) 
{
    Deque<Integer> result = new ArrayDeque<>();
    int len = d1.size() < d2.size() ? d1.size():d2.size();
    int temp_sum;
    int temp = 0;
    while(len > 0)
    {
        temp_sum = d1.pollFirst() + d2.pollFirst();
        temp_sum += temp;
        if (temp_sum > 9)
        {
            result.addLast(temp_sum % 10);
            temp = 1;
            if (len == 1) result.addLast(temp);
        }
        else
        {
            result.addLast(temp_sum);
            temp = 0;
         }
        len --;
    }
    return result;
}
}
