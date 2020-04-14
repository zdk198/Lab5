
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachkorte
 */
public class TestArray {
    int getTotal(int[] array) {
int sum = 0;
for (int i = 0; i < array.length; i++)
sum = sum + array[i];
return sum;
}

double getAverage(int[] array) {
int sum = 0;
for (int i = 0; i < array.length; i++)
sum = sum + array[i];
return sum / array.length;
}

int getHighest(int[] array) {
Arrays.sort(array);
return array[array.length - 1];
}

int getLowest(int[] array) {
Arrays.sort(array);
return array[0];
}

public static void main(String[] args) {
int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
TestArray ta = new TestArray();
System.out.println("Total : " + ta.getTotal(array));
System.out.println("Average : " + ta.getAverage(array));
System.out.println("Highest : " + ta.getHighest(array));
System.out.println("Lowest : " + ta.getLowest(array));
}
}
