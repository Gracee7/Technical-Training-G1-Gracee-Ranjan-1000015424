public class ReverseSentence {
    static String reverse(String str){
        int i=0;
        int j=str.length()-1;
        char wordArr[]=str.toCharArray();
        char temp = '\0';
        while (i<j){
            temp = wordArr[i];
            wordArr[i]=wordArr[j];
            wordArr[j] = temp;
            i++;
            j++;
        }

        return String.valueOf(wordArr);
    }
    public static void main(String[] args){
        String str = " the sky is blue";
        String WholeString = reverse(str);
        String words[] = WholeString.split(" ");
        String sentence = "";
        for(String word : words){
            sentence += reverse(word) + " ";
        }
        System.out.println(sentence);
    }
}
