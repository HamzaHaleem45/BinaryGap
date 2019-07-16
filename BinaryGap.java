package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryGap {

    public static void zeros(){

        int number;
        int remainder;
        int firstonevalue=0;
        int firstindex=0;
        int count;
        int maxcount=0;

        System.out.println("Please enter the number");
        Scanner S = new Scanner(System.in);
        number = S.nextInt();

        System.out.print("Binary of "+number+" is: ");

        ArrayList<Integer> binary= new ArrayList<>();
        int j=0;

        while (number!=0){
            remainder = number %2;
            number = number / 2;
            binary.add(j,remainder);
            j++;
        }

        for (int i = binary.size()-1; i >=0; i--) {
            System.out.print(binary.get(i)+" ");
        }

        for (int k=binary.size()-1; k>=0; k--){

            if(binary.get(k)==1){

                if (firstonevalue==1){
                    count = firstindex - k;
                    if (count>maxcount) maxcount=count;
                    if(count==1) {firstonevalue=1; firstindex=k;}
                    else {firstonevalue=0;}
                }
                else if (firstonevalue==0){
                    firstonevalue=1;
                    firstindex=k;
                }

            }
        }
        maxcount = maxcount -1;
        if (maxcount == -1) maxcount = 0;

        System.out.println("\n"+"Maximum no. of Zeros between 1s are "+ (maxcount));
    }
}
