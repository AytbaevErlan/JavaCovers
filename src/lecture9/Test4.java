package lecture9;

import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/erlanaytbaev/Desktop/JavaCovers/JavaCovers/src/students.txt"));
             FileWriter fw = new FileWriter("studentsENWith5.txt")) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s");
                String surname = words[0].trim();
                String name = words[1].trim();
                String score = words[2].trim();
                if (score.equals("5")) {
                    System.out.println("Surname: " + surname + " name: " + name + " score: " + score);
                    fw.write(surname + "\n" + name + "\n" + score + "\n");
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
