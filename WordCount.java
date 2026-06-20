import java.util.*;

class WordCount {

    public static int countWords(String sentence) {

        if(sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String words[] = sentence.split("\\s+");
        return words.length;

    }
    public static void main(String args[]) {

        System.out.println("ENter the sentence: ");
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        int count = countWords(sentence);
        System.out.println("Total count : "+ count);
        scanner.close();
    }
}