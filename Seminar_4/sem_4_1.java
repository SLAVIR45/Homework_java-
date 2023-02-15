package Homework.Seminar_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class sem_4_1 
{
// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,3,2,1));
        boolean result = checkOn(deque);
        if(result == true) System.out.println("последовательность цифр является палиндромом");
        else System.out.println("последовательность цифр не является палиндромом");
    }
    public static boolean checkOn(Deque<Integer> deque)
    {
        while (deque.size()>1)
        {
            if (deque.pollFirst() != deque.pollLast())
            {
                break;
            }
        }
        if (deque.size()>1)
        {
            return false;
        }
        return true;
    }
}
