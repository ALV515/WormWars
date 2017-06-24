/**
 * Created by alexvaccari on 6/21/17.
 */

/*
* Simple SIR model to find the number of generations a virus survives until a population is immune or infected.
 */

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class WW {


     public static int iPrime(int population, double cInfected){
            int gInfected = (int) (population * cInfected);
            return gInfected;
 }

    public static int rPrime(int population, int numInfected, double cSurvived,  double cImmune){
        int popImmune = (int) (population * cImmune);
        int infImmune = (int) (numInfected * cSurvived);

        int totalImmune = popImmune + infImmune;
        return totalImmune;

    }

    public static void main(String[] args) throws IOException {
        double infectedC = 0;
        double immuneC = 0;
        double survivedC = 0;
        int numInfected = 0;
        int initialPopulation = 0;

        BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));

        String strLine = userIn.readLine();

        String[] input = strLine.split(" ");

        if(input.length != 5){
            throw new IOException("Usage: Must pass a population size, initial infected, and coefficients");
        }

        initialPopulation = Integer.parseInt(input[0]);
        numInfected = Integer.parseInt((input[1]));
        int immune = 0;

        if(numInfected > initialPopulation){
            throw new IOException(("Error: population too small"));
        }

        infectedC = Double.parseDouble(input[2]);
        immuneC = Double.parseDouble(input[3]);
        survivedC = Double.parseDouble(input[4]);

        int population = initialPopulation;
        int generation = 0;

        do{
            System.out.println("GENERATION: " + generation + " Population: " + population + " Infected: " + numInfected + " Immune: " + immune);
            generation++;
            numInfected = numInfected + iPrime(population, infectedC);
            immune = immune + rPrime(population, numInfected, survivedC, immuneC);

            population = population - (numInfected + immune);

        }while(population >= 0);

        System.out.println("There were " + generation + " generations until the population died or became immune");
    }

}
