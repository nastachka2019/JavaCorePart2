public class Lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n = scanner.nextInt(); // число строк
       // Scanner scanner2 = new Scanner(System.in);  // вводим строки
        String shortestString = null;
        String longestString = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter line №" + (i + 1));
            String str = scanner2.nextLine();
            if (i == 0) {
                shortestString = str;
                longestString = str;
            } else if (shortestString.length() > str.length()) {
                shortestString = str;
            }
            if (longestString.length() < str.length()) {
                longestString = str;
            }
        }
        System.out.println("The length of the longest line is " + longestString.length());
        System.out.println("The longest line is " + longestString);
        System.out.println("The length of the shortest line is " + shortestString.length());
        System.out.println("The shortest line is " + shortestString);
    }

}
////////////////////
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int vowels = 0;
        int consonants = 0;
        int numWordsWithSameLetters = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n = scanner.nextInt(); // число строк
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter line №" + (i + 1)); //вводим строки
            String text = scanner1.nextLine();
            if (text.matches("[a-zA-Z]+")) {
                count++;
            }
            String[] words = text.split(" ", n);
            if (text.matches("[e,y,u,o,a]+")) {
                vowels++;
            }
            if (text.matches("[q,w,r,t,p,s,d,f,g,h,j,k,l,z,x,c,v,b,n,m]+")) {
                consonants++;
            }
            if (consonants == vowels) {
                numWordsWithSameLetters++;
            }
        }
        System.out.println("Quantity with the same vowels and consonants: " + " " + numWordsWithSameLetters);
        System.out.println("Quantity of words with letters: " + " " + count);
    }
}


//////////////
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n = scanner.nextInt(); // число строк
        Scanner scanner2 = new Scanner(System.in);  // вводим строки
        String shortestString = null;
        String longestString = null;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter line №" + (i + 1));
            String str = scanner2.nextLine();
            if (i == 0) {
                shortestString = str;
                longestString = str;
            } else if (shortestString.length() > str.length()) {
                shortestString = str;
            }
            if (longestString.length() < str.length()) {
                longestString = str;
            }
        }
        System.out.println("The length of the longest line is " + longestString.length());
        System.out.println("The longest line is " + longestString);
        System.out.println("The length of the shortest line is " + shortestString.length());
        System.out.println("The shortest line is " + shortestString);
    }
}
/////////////
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n1 = scanner.nextInt(); // число строк
        String[] array = new String[n1];

        for (int i = 0; i < n1; i++) {
            System.out.println("Enter line №" + (i + 1)); //вводим строки
            array[i] = scanner.next();
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() > array[j + 1].length()) {

                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
///////////////
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int n1 = scanner.nextInt(); // число строк
        int averageLength = 0;
        String[] array = new String[n1];
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter line №" + (i + 1)); //вводим строки
            array[i] = scanner.next();
            averageLength = averageLength + array[i].length();
        }
        averageLength = averageLength / n1;
        System.out.println("The average length is" + averageLength);
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < averageLength) {
                out.println("The lines, which has less length than average: " + array[i]);
            }
        }
    }
}
