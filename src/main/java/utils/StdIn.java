package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by gsantoro on 19/04/15.
 */
public class StdIn {
    protected BufferedReader br = null;

    public StdIn() {
        br = null;
    }

    public void init(String filename) {
        InputStream is = this.getClass().getResourceAsStream(filename);
        br = new BufferedReader(new InputStreamReader(is));
    }

    public boolean isEmpty() throws IOException {
        return !br.ready();
    }

    public String readString() throws IOException {
        return br.readLine();
    }

    public String[] readStrings() throws IOException {
        String line = readString();

        String[] results = line.split(" ");

        return results;
    }

    public Integer[] readIntegers() throws IOException {
        String[] parts = readStrings();

        Integer[] result = new Integer[parts.length];

        for (int i=0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }

        return result;
    }
}
