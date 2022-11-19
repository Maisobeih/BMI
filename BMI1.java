/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi1;

import java.util.Scanner;

/**
 *
 * @author Mai
 */
public class BMI1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BMI = mass / height2
/*
Health assessment if:
BMI < 18.5		Underweight
18.5 ≤ BMI < 25	Normal weight
25 ≤ BMI < 30	Overweight
30 ≤ BMI		Obese
         */

       Scanner OBJ = new Scanner(System.in);
        System.out.println("Hello There ");
        System.out.println("Please Enter Your Weight in kilograms");
        double Weight = OBJ.nextDouble();
        System.out.println("Please Enter Your Height");
        double Height = OBJ.nextDouble();
        Height = Height * Height;
        double BMI = (Weight / Height);
        System.out.println(BMI);
        if (18.5 > BMI) {
            System.out.println("You are  Underweight , Try To eat  more healthy Food");
        }
        if (18.5 <= BMI && BMI < 25) {
            System.out.println(" Good Job ,You are at Normal weight");
        }
        if (25 <= BMI && BMI < 30) {
            System.out.println(" Be Careful ,You are Overweight");
        }
        if (30 <= BMI) {
            System.out.println("Warning !! You are Obese");

        }
   
}}
