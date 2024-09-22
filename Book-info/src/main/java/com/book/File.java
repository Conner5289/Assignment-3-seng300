
package com.book;

import java.io.FileReader;
import java.util.Scanner;

import com.opencsv.CSVReader;

public class File {

    public void fileIn() {

        // Just for testing this should be selected in the gui
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the abs path of the csv file ");
        String csvFilePath = scnr.next();

        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {

            String[] rowHolder;
            while ((rowHolder = reader.readNext()) != null)
                ;

            {

            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
