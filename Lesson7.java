import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scanner.nextLine();
        int size = word.length();
        char[] array = word.toCharArray();
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(array[i]);
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter index for replace");
        int index = scanner1.nextInt();
        char symbol = '%';
        for (int i = index - 1; i <= size - 1; i = i + index) {
            array[i] = symbol;
        }
        Word word1 = new Word();
        String result = String.valueOf(word1.printTextFromArray(array));
        System.out.println("Changed word: " + result);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = scanner.nextLine();
        int size1 = text.length();
        char array1[] = text.toCharArray();
        for (int i = 0; i <= size1 - 1; i++) {
            System.out.print(array1[i]);
        }
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter index for replace");
        int index1 = scanner3.nextInt();
        for (int i = index1 - 1; i <= size1 - 1; i = i + index1)
            array1[i] = symbol;
        Sentence sentence = new Sentence();
        String result1 = String.valueOf(sentence.printTextFromArray(array1));
        System.out.println("Changed text: " + result1);

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter your paragraph");
        String text1 = scanner4.nextLine();
        int size2 = text1.length();
        char array2[] = text1.toCharArray();
        for (int i = 0; i <= size2 - 1; i++) {
            System.out.print(array2[i]);
        }
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter index for replace");
        int index2 = scanner5.nextInt();
        for (int i = index2 - 1; i <= size2 - 1; i = i + index2)
            array2[i] = symbol;
        Paragraph paragraph = new Paragraph();
        String result2 = String.valueOf(sentence.printTextFromArray(array2));
        System.out.println("Changed text: " + result2);

    }
}
public class Word {

    char[] array;

    public char[] printTextFromArray(char[] array) {
        return array;
    }
}
public class Paragraph extends Word {
    char[] array2;

    @Override
    public char[] printTextFromArray(char[] array2) {
        return super.printTextFromArray(array2);
    }
}
public class Sentence extends Word {
    char[] array1;

    @Override
    public char[] printTextFromArray(char[] array1) {
        return super.printTextFromArray(array1);
    }
}

