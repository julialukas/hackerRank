package org.example.demo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ReadFile {
    public static void main(String[] args) {


        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("data.json"));

            JSONObject jsonObject = (JSONObject) obj;

            String name = (String) jsonObject.get("person");
            System.out.println(name);


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
