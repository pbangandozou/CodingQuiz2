import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        
    int counter = 0;
    int size = s.length();
    int num = size/3;
    //Take in the array of strings
    // divide by three to know how many SOS we should have
    //forloop that goes thru num
    for(int i = 0; i < num; i++){
        if(num[i]!= "SOS"){
         counter++;   
        }
            //if the for every 3 letters in the num if it doesnt = SOS add to total
        else{
            return 0;
        }
    return counter;    
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
