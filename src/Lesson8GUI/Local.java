package Lesson8GUI;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Local {

    String path = "C:\\Users\\Karen\\OneDrive\\Рабочий стол\\New folder\\local.txt";


    //    public void fileMethod(String num, String date) throws FileNotFoundException {
//        String path = "C:\\Users\\Karen\\OneDrive\\Рабочий стол\\New folder\\" + date + ".txt";
//        File file = new File(path);
//        PrintWriter printWriter = new PrintWriter(file);
//        printWriter.println(num);
//        printWriter.close();
//    }

    public void fileWriteMethod(String num, String date) {
        File file = new File(path);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(num + "\n");
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void fileWriteMethod(Data data) {
        File file = new File(path);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(data + "\n");
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void fileReadMethod() {
        File file = new File(path);
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    line = reader.readLine();
                } catch (IOException e) {

                    e.printStackTrace();
                }
                if (line == null)
                    break;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<String> infoList() {
        ArrayList<String> lines = new ArrayList<>();
        File file = new File(path);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s;
            while ((s = reader.readLine()) != null) {
                lines.add(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}
