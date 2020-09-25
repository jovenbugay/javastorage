
package javastorage;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;



public class JavaStorage {

    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        try{
       FileWriter writer = new FileWriter("Database.txt", true);
       writer.write("MOMO");
       writer.write("\r\n");
       writer.close();
       
       FileReader reader = new FileReader("Database.txt");
       BufferedReader buffread = new BufferedReader(reader);
       while(buffread.ready()){
            list.add((String)buffread.readLine());
       for(String x : list){
           System.out.println(x);
       }
            
           
       } 
        }
        catch(Exception e){
           
            
        }
    }
    
}
