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
    final int initalPopulation = 10000;

    public static void main(String[] args){
        double infectedC;
        double immuneC;
        double survivedC;

        Console c = System.console();
        String y = c.readLine();

        String[] parts = y.split(" ");

        if(parts.length != 4){
            System.out.print("Error: 4 args required");
            System.exit(0);
        }

        int infected = findInfected(initialPopulation, infectedC);

        int survived = findSurvived();

        int immune  = findImmune();
    }

    public static int findInfected
}
