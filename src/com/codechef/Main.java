package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	A 

    Input
    The first line contains an integer T, total number of testcases. Then follow T lines,
    each line contains three numbers hardness, carbon content and tensile strength of the steel.

    Output
    For each test case, print Grade of the steel depending on Conditions, in a new line.

    Constraints
    1 ≤ T ≤ 1000
    0 ≤ hardness, carbon content, tensile strength ≤ 10000
    Sample Input
    3
    53 0.6 5602
    45 0 4500
    0 0 0
    Sample Output
    10
    6
    6
	 */
    Scanner sc = new Scanner(System.in);
    int t,hardness,tensile,grade;
    float carbonC;
    t = sc.nextInt();
        while (t-->0) {
            hardness = sc.nextInt();
            carbonC = sc.nextFloat();
            tensile = sc.nextInt();
            if(hardness>50 && carbonC<0.7 && tensile>5600){
                grade = 10;
                System.out.println(grade);
            }
            else if(hardness>50 && carbonC<0.7 && tensile<5600){
                grade = 9;
                System.out.println(grade);
            }
            else if(hardness<50 && carbonC<0.7 && tensile>5600){
                grade = 8;
                System.out.println(grade);
            } else if (hardness > 50 && carbonC > 0.7 && tensile > 5600) {
                grade = 7;
                System.out.println(grade);
            }
            else if(hardness>50 || carbonC<0.7 || tensile>5600){
                grade = 6;
                System.out.println(grade);
            }
            else if(hardness<50 && carbonC>0.7 && tensile<5600){
                grade = 5;
                System.out.println(grade);
            }
        }
    }
}
