package org.example.constructionCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Logger logger= (Logger) LogManager.getLogger();

        logger.info("Enter material type :-");
        String material= scanner.nextLine();
        logger.info("Enter area :-");
        int area= scanner.nextInt();
        logger.info("Enter automation type :-");
        String automation=scanner.next();

        Cost cost = new Cost(material,area,automation);
        logger.info("The Final Cost : Rs."+ cost.calculateCost());
    }
}
