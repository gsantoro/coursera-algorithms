package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by gsantoro on 19/04/15.
 */
public class IOUtils {
    public String[] getLines(String filename) throws IOException {
        InputStream is = this.getClass().getResourceAsStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        ArrayList<String> resultList = new ArrayList<>();
        while(br.ready()) {
            resultList.add(br.readLine());
        }

        String[] result = new String[resultList.size()];

        resultList.toArray(result);
        return result;
    }

    public int[] parseLine(String line) {
        String[] parts = line.split(" ");

        int[] results = new int[parts.length];
        for(int i = 0; i < parts.length; i++) {
            results[i] = Integer.parseInt(parts[i]);
        }

        return results;
    }
}
