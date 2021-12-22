package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class ApiTest {
    public static void main(String[] args) {
        System.out.println(getResponce("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY"));
    }

    public static String getResponce(String endpoint){
        StringBuilder sb = new StringBuilder();
        URLConnection urlConnection = null;

            try{
            URL url =  new URL(endpoint);
                HttpURLConnection conn =  (HttpURLConnection) url.openConnection();
if(conn!=null){
    InputStream input =  conn.getInputStream();
    ObjectMapper mapper = new ObjectMapper();
    APOD apod= mapper.readValue(input,APOD.class);
    System.out.println(apod.title);
return apod.title;


}
            }catch(Exception e){
                e.printStackTrace();
            }

return "Exception happend";
    }
}
