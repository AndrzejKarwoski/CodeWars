package pl.andrzejkarwoski;

public class Scramblies {

    /*
    Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

    Notes:

    Only lower case letters will be used (a-z). No punctuation or digits will be included.
    Performance needs to be considered
    Input strings s1 and s2 are null terminated.

    Examples
    scramble('rkqodlw', 'world') ==> True
    scramble('cedewaraaossoqqyt', 'codewars') ==> True
    scramble('katas', 'steak') ==> False
     */



    public static boolean scramble(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);   // stringbuilder because efficiency matters
        for(char c : str2.toCharArray()){
            int i = sb.toString().indexOf(c);
            if(i != -1){
                sb.deleteCharAt(i);
            }
            else{
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        System.out.println(scramble("rkqodlw", "world"));  //true
        System.out.println(scramble("cedewaraaossoqqyt", "codewars")); // ture
        System.out.println(scramble("katas", "steak")); //false
        System.out.println(scramble("scriptjavx","javascript")); // false
        System.out.println(scramble("scriptingjava","javascript")); // true
        System.out.println(scramble("scriptsjava","javascripts")); // true
        System.out.println(scramble("javscripts","javascript")); // false
        System.out.println(scramble("aabbcamaomsccdd","commas")); //true
        System.out.println(scramble("commas","commas")); // true
        System.out.println(scramble("sammoc","commas")); // true
    }

}
