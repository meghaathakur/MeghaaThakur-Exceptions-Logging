package org.example.interest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Logger logger= (Logger) LogManager.getLogger();

        double principle,rate;
        int time;

        logger.info("Enter Principle : ");
        principle=scanner.nextDouble();
        logger.info("Rate : ");
        rate=scanner.nextDouble();
        logger.info("Time : ");
        time=scanner.nextInt();

        Interest interest=new Interest(principle,rate,time);
        logger.info("Simple Interest :- "+interest.getSimpleInterest());
        logger.info("Compound Interest :- "+interest.getCompoundInterest());
    }
}
