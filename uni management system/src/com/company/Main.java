package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        University uni = new University("Federal Urdu");

        boolean loop = true;
        while (loop) {

            print("\n\nWellcome to Uni Management System");
            print("");
            print("1. Add Teacher");
            print("2. Find Teacher");
            print("3. View All Teacher");
            print("4. Delete a Teacher");
            print("");
            print("5. Add Student");
            print("6. Find Student");
            print("7. View All Student");
            print("8. Delete a Student");
            print("9. Exit");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    uni.addTeacher();
                    break;

                case 2:
                    uni.findTeacher();
                    break;

                case 3:
                    uni.viewAllTeacher();
                    break;
                case 4:
                    uni.deleteTeacher();
                    break;


                case 5:
                    uni.addStudent();
                    break;

                case 6:
                    uni.findStudent();
                    break;

                case 7:
                    uni.viewAllStudent();
                    break;
                case 8:
                    uni.deleteStudent();
                    break;
                case 9:
                    loop = false;
                    break;
                default:
                    print("invalid input");
            }


        }


//        uni.addTeacher();
        //uni.addStudent();


    }

    public static void print(String line) {
        System.out.println(line);
    }

    ;

}
