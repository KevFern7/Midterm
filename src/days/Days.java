/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 jn 22nd
 * This class prints the names of all the days
 * by using the Weekday enum.
 *
 * @author sivagamasrinivasan
 */
public class Days {

    public static void main(String[] args) {
        System.out.println("All days of the week:");

        // Loop through each day in the Weekday enum and print it
        for (Weekdays day : Weekdays.values()) {
            System.out.println(day);
        }
    }
}
