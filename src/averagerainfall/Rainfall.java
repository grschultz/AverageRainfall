package averagerainfall;


import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Greg
 */
public class Rainfall {
    
    private int years, months;
    private double totalInchesOfRainfall = 0; 
    DecimalFormat formatter = new DecimalFormat("0.00");
    public double[] totals = new double[12];
    private double[] averages = new double[12];
    
    public static Object Rainfall = 0;
    
    public enum Month {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December;

        public static Month get(int n) {
            return Month.values()[n-1];
        }
    }
    
    public void test() {
        for(int i = 1; i <= 12; i++) {
            System.out.println("Month " + i + ": " + Month.get(i));
        }
    }
    
    // Get number of years
    public void setYearsMonths(int y) {
        years = y;
        months = y * 12;
    }
    
    public int years() {
        return years;
    }
    
    public int months() {
        return months;
    }
    
    public double[] Totals() {
        for(int year=1; year <= years; year++) {
            int i = 1;
            do {
                Scanner inputRainfall = new Scanner(System.in);
                System.out.print("\nEnter the rainfall for " + Month.get(i) + ", year #" + year + ".> ");

                totalInchesOfRainfall = inputRainfall.nextDouble();

                while(totalInchesOfRainfall < 0) //Attempting Input Validation
                {
                        System.out.print("\nInvalid entry.");
                        totalInchesOfRainfall = inputRainfall.nextDouble();
                }
                totals[i-1] += totalInchesOfRainfall;

                i++;
            } while (i <= 12);

        }
        
        return totals;

    }
    
    public double[] Averages() {
        
        for(int i = 1; i <= 12; i++) {
            averages[i-1] = totals[i-1]/years;
            System.out.print("\nAverage " + Month.get(i) + " rainfall: " + averages[i-1] + " inches");
        }
        
        return averages;
    }

}
