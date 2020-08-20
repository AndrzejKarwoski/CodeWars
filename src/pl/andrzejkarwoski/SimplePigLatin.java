package pl.andrzejkarwoski;


/*
    Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
*/

public class SimplePigLatin {
    public static String pigIt(String str) {
        StringBuilder sb = new StringBuilder();
        String[] array = str.split(" ");
        for(String s : array){
           char c = s.charAt(0);
           if(Character.isLetter(c)) sb.append(s.substring(1)).append(c).append("ay ");
           else sb.append(s).append(" ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }

    public static void main(String[] args){
        System.out.println(pigIt("Pig latin is cool")); // igPay atinlay siay oolcay
        System.out.println(pigIt("This is my string"));    // hisTay siay ymay tringsay
        System.out.println(pigIt("oratay oay oresmay ![]"));
    }

}
