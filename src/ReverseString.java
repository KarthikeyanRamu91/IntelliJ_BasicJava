public class ReverseString {
    public static void main(String[] args) {
        String sentence = "My name is karthik";
        String[] words = sentence.split(" ");
        String reversedSentence = "";
        for (int i = words.length-1; i >=0; i--) {
            char[] word = words[i].toCharArray();
            for (int j = word.length - 1; j >= 0; j--) {
                reversedSentence += word[j];
            }
            reversedSentence += " ";
        }
        System.out.println(reversedSentence);
    }
}
