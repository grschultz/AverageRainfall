/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagerainfall;

import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

/**
 *
 * @author Greg
 */
public class AverageRainfall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rainfall rainfall = new Rainfall();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nEnter the number of years.> ");
        rainfall.setYearsMonths(keyboard.nextInt());

        while(rainfall.years() < 1) //Attempting Input Validation
        {
                System.out.print("\nERROR: Number of years must be one or greater.");
                rainfall.setYearsMonths(keyboard.nextInt());
        }
        

        rainfall.Totals();
        
        rainfall.Averages();
			

    }
    
}
