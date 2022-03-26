package org.example.demo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {
    public static void main(String[] args) throws IOException {
    /*
WRITE TO FILE
     */
//            FileWriter myWriter = new FileWriter("data.txt");
//            myWriter.write("Files in Java might be tricky, but it is fun enough!");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");


        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("data.json"));

            JSONObject jsonObject = (JSONObject) obj;
            JSONArray arr = (JSONArray) jsonObject.get("emergencyContacts");


            System.out.println(jsonObject);


//            // loop array
//            JSONArray cars = (JSONArray) jsonObject.get("cars");
//            Iterator<String> iterator = cars.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
