// 2. Напишите метод, который составит строку, состоящую из 100 повторений 
// слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

package Homework.HomeworkJava2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class TaskSecond {
    public static void main(String[] args) {
        String TST = "TEST ";
        String OutStr = RepeatStr(100, TST);
        System.out.println(OutStr);
 
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
 
            if (file.createNewFile()) {
                System.out.println("file.created");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(OutStr);
                fileWriter.close();
            } else {
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(OutStr);
                fileWriter.close();
            }
        }
        catch(IOException e){ System.out.println(e.getMessage());}
        finally{
                System.out.println("Complete");
            }
    }
    public static String RepeatStr(int num, String strToAdd){
        StringBuilder StrOut = new StringBuilder(strToAdd);
        for(int i = 0; i < num; i++) {
            StrOut.append(strToAdd);
        }
        return StrOut.toString();
    }
}
