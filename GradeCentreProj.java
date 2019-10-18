package com.company;

import java.util.Scanner;

public class GradeCentreProj {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double grade1;
        System.out.printf("Enter grade number 1: ");
        grade1 = keyboard.nextDouble();
        grade1 = gradecheck(grade1);
        String letter1 = gradeletter(grade1);

        double grade2;
        System.out.printf("Enter grade number 2: ");
        grade2 = keyboard.nextDouble();
        grade2 = gradecheck(grade2);
        String letter2 = gradeletter(grade2);

        double grade3;
        System.out.printf("Enter grade number 3: ");
        grade3 = keyboard.nextDouble();
        grade3 = gradecheck(grade3);
        String letter3 = gradeletter(grade3);

        double grade4;
        System.out.printf("Enter grade number 4: ");
        grade4 = keyboard.nextDouble();
        grade4 = gradecheck(grade4);
        String letter4 = gradeletter(grade4);

        double grade5;
        System.out.printf("Enter grade number 5: ");
        grade5 = keyboard.nextDouble();
        grade5 = gradecheck(grade5);
        String letter5 = gradeletter(grade5);

        double grade6;
        System.out.printf("Enter grade number 6: ");
        grade6 = keyboard.nextDouble();
        grade6 = gradecheck(grade6);
        String letter6 = gradeletter(grade6);

        double avg;
        avg = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6) / 6;
        String letteravg = gradeletter(avg);
        System.out.printf("Grade average is %.1f%% ( %s ) %n", avg, letteravg);

        printavg(1, grade1, letter1);
        printavg(2, grade2, letter2);
        printavg(3, grade3, letter3);
        printavg(4, grade4, letter4);
        printavg(5, grade5, letter5);
        printavg(6, grade6, letter6);
    }

    public static double gradecheck(double grade) {
        Scanner keyboard = new Scanner(System.in);
        if (grade < 0 || grade > 100) {
            System.out.printf("%nGrade is invalid, re-enter: ");
            grade = keyboard.nextDouble();
        }
        return grade;
    }

    public static String gradeletter(double grade) {
        if (grade <= 49){
            return "E";
        }
        else if (grade <= 54 && grade > 49){
            return "D";
        }
        else if (grade <= 59 && grade > 54){
            return "D+";
        }
        else if (grade <= 64 && grade > 59){
            return "C";
        }
        else if (grade <= 69 && grade > 64){
            return "C+";
        }
        else if (grade <= 74 && grade > 69){
            return "B";
        }
        else if (grade <= 79 && grade > 74){
            return "B+";
        }
        else if (grade <= 89 && grade > 79){
            return "A";
        }
        else {
            return "A+";
        }
    }

    public static void printavg( int order, double grade, String letter) {
        System.out.printf("Grade %d is %.1f%% ( %s ) %n", order, grade, letter);
    }
}