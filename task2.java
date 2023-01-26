package homework2;

/*Напишите метод, который составит строку,
состоящую из 100 повторений слова TEST и метод,
который запишет эту строку в простой текстовый файл, обработайте исключения.*/

import java.lang.StringBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class task2 {
    public static void main(String [] args){
        String test = "";
        test = "TEST";
        System.out.println(get100String(test));
        file("C:\\Users\\User\\IdeaProjects\\homework\\src\\main\\resources\\lib/log.txt");

    }
    private static void file(String s) {
        file(s);
        StringBuilder sb = new StringBuilder();
        for (String fileName : convertPathToNamesArr(s)) {
            sb.append(fileName).append(System.lineSeparator());
        }

        try(PrintWriter pw = new PrintWriter("src\\main\\resources\\lib/log.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static String[] convertPathToNamesArr(String s) {
        File dir = new File(s);
        return dir.list();
    }

    private static String get100String (String test){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            stringBuilder.append(test);
        }

        String result = stringBuilder.toString();

        return result;
    }
}
