package org.geekster;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        URL url = null;
        HttpURLConnection connection = null;
        int responseCode = 0;
        String urlString = "https://api.zippopotam.us/us/33162";

        try{
            url = new URL(urlString);
        }
        catch (MalformedURLException e)
        {
            System.out.println("Issues in Url!!!");
        }

        try {
            connection = (HttpURLConnection) url.openConnection();
            responseCode = connection.getResponseCode();
        }
        catch (Exception e)
        {
            System.out.println("Connection to Url Failed!!!");
        }

        if(responseCode == 200)
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder apiData = new StringBuilder();
            String readLine = null;

            while((readLine = in.readLine()) != null)
            {
                apiData.append(readLine);
            }

            try
            {
                in.close();
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }

            JSONObject jsonApiResponse = new JSONObject(apiData.toString());

            System.out.println(jsonApiResponse);
        }
        else
        {
            System.out.println("Api call Failed unexpectedly!!!");
        }
    }
}