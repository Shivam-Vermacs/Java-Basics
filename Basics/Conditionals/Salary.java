package Basics.Conditionals;

import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your monthly salary: ");
        double salary = sc.nextDouble();
        if (salary>10000) {
            salary=salary + 2000;
            
        }
        else{
            salary=salary + 500;
        }
        System.out.println("Your updated salary is: " + salary);
    }
}
