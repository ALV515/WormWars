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


    public static int findInfected(int population, double infectionCoefficient){
        return 0;
    }

    public static int findSurvived(int population, double infectionCoefficient){
        return 0;
    }

    public static int findImmune(int population, double infectionCoefficient){
        return 0;
    }

    public static void main(String[] args) throws IOException {
        double infectedC = 0;
        double immuneC = 0;
        double survivedC = 0;
        int initialPopulation = 0;

        BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));

        String strLine = userIn.readLine();

        String[] input = strLine.split(" ");

        if(input.length != 4){
            throw new IOException("Usage: Must pass a population size, initial infected, and coefficients");
        }

        int infected = findInfected(initialPopulation, infectedC);

        int survived = findSurvived(initialPopulation, survivedC);

        int immune  = findImmune(initialPopulation, immuneC);
    }

}
