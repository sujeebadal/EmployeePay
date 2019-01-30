package com.company;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter Employee number");
        int Employee_Number = Keyboard.nextInt();
        System.out.println("Enter Pay Rate");
        int Pay_Rate = Keyboard.nextInt();
        System.out.println("Enter Hours Worked");
        int Hours_Worked = Keyboard.nextInt();

        //if pay is greater than 25, terminate program and output message

        if (Pay_Rate > 25) {
            System.out.println("Pay Rate Out of Range");
            System.exit(0);
        }
        //if hours worked is greater than 60, terminate program and output message
        else if (Hours_Worked > 60) {
            System.out.println("Hours Worked Out of Range");
            System.exit(0);
        } else if (Hours_Worked >= 36 && Hours_Worked <= 60) {
            int Overtime_Hours = Hours_Worked - 35;
            double Overtime_Pay = (Overtime_Hours) * (Pay_Rate * 1.5);
            double Weekly_Pay = (Overtime_Pay) + (35 * Pay_Rate);
            System.out.println("Employee_Number" + Employee_Number + "Pay_Rate" + Pay_Rate + "Hours_Worked" + Hours_Worked + "Weekly_Pay" + Weekly_Pay);
        } else if (Hours_Worked <= 35) {
            double Weekly_Pay = (Hours_Worked) * (Pay_Rate);
            System.out.println("Employee_Number" + Employee_Number + "Pay_Rate" + Pay_Rate + "Hours_Worked" + Hours_Worked + "Weekly_Pay" + Weekly_Pay);
        }
    }
}
