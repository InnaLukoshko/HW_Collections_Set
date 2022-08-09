import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class General {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//      Задание1
        Set<Integer> numbers = new HashSet<>();
        System.out.println("Введите набор чисел в виде одной строки");
        String s0 = reader.readLine();
        for (int i = 0; i < s0.length(); i++) {
            if(s0.charAt(i) != ' ' && s0.charAt(i) != ',') {
                numbers.add(Integer.parseInt(String.valueOf(s0.charAt(i))));
            }
        }
        numbers.forEach( x -> System.out.print(x + " "));

//      Задача 16 (с. 284)
        Set<String> text = new HashSet<>();
        System.out.println("Введите текст на английском");
        StringBuffer sBuf = new StringBuffer(reader.readLine());
        for (int i = 0; i < sBuf.length(); i++) {
            if (sBuf.charAt(i) == ',' || sBuf.charAt(i) == '.' || sBuf.charAt(i) == '?' || sBuf.charAt(i) == '!') {
                sBuf.deleteCharAt(i);
            }
        }
        String s = new String(sBuf);
        String[] strArr = new String[s.length()];
        strArr = s.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            text.add(strArr[i].toLowerCase());
        }
        text.forEach(x -> System.out.print(x + " "));

    }
}
