package q3;

import java.util.Scanner;
public class Strings {
    
    public static void main(String[] args) {
        int size;
        Comparable[] stringList;
       Scanner scan = new Scanner(System.in); 
        System.out.println("How many strings do you want to sort?");
        size=scan.nextInt();
        stringList = new String[size];
        System.out.println("Enter the strings...");
        for(int i =0; i <size;i++)
            stringList[i]=scan.next();
        Sorting.selectionSort(stringList);
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(stringList[i] + " ");
        System.out.println();
              
    }

}
