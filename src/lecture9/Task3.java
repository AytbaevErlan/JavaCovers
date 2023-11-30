package lecture9;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileInputStream files = new FileInputStream("/Users/erlanaytbaev/Desktop/JavaCovers/JavaCovers/src/Vistula.txt");

            InputStreamReader secondf = new InputStreamReader(files);
            BufferedReader br = new BufferedReader(secondf);
            File a = new File("/Users/erlanaytbaev/Desktop/JavaCovers/JavaCovers/src/Vistula.txt");

            File b = new File("Copied.txt");

            while(true){
                String line = br.readLine();

                if(line != null){
                    System.out.println(line.replace(" ", ""));
                } else{
                    br.close();
                    break;
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Error: " + e.getMessage()) ;
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
