package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IsPresentInFile {
    public IsPresentInFile() throws IOException {
    }

    public boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
        File file = new File(filePath);

        Scanner scanner = new Scanner(file);

        // read the file line by line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains(str)) {
                scanner.close();
                return true;
            }
        }
        scanner.close();
        return false;
    }

    @Test
    public void readFile() throws FileNotFoundException {
        String path = "/Users/karynavladymyrova/Desktop/App.java";
        Assert.assertTrue(findStringInFile(path,"public class App "));
    }
}
