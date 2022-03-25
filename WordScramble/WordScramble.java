package WordScramble;

public class WordScramble {
    public static void main(String[] args) { 
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

        String answer = getAnswer(strArr); 
        String question = getScrambledWord(answer); 

        System.out.println("Question : "+question); 
        System.out.println("Answer : "+answer); 
    }

    public static String getAnswer(String[] strArr) { 
        
        return strArr[(int)(Math.random() * strArr.length)];
    
    } 
  
    public static String getScrambledWord(String str) { 

        char[] chArr = str.toCharArray();

        for(int i = 0; i < str.length(); i++) {
            int index = (int)(Math.random() * str.length());

            char temporaryStorage = chArr[i];
            chArr[i] = chArr[index];
            chArr[index] = temporaryStorage;
        }
        
        return new String(chArr);
    
    } 
}