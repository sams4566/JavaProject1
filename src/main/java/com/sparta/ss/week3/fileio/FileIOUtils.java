package com.sparta.ss.week3.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileIOUtils {
    static void readFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
//                System.out.println(line);
//            }
            bufferedReader.readLine();
            String line = bufferedReader.readLine();
            FileWriter writer = new FileWriter("src/main/java/com/sparta/ss/week3/fileio/ValidEntries.csv");
            while (line != null) {
                String[] employeeData = line.split(",");
                EmployeeDTO employeeDTO = new EmployeeDTO(
                        employeeData[0],
                        employeeData[1],
                        employeeData[2],
                        employeeData[3],
                        employeeData[4],
                        employeeData[5],
                        employeeData[6],
                        employeeData[7],
                        employeeData[8],
                        employeeData[9]
                );
                System.out.println(employeeDTO);
                line = bufferedReader.readLine();
                writer.write(String.valueOf(employeeDTO));
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
