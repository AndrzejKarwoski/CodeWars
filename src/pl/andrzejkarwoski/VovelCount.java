package pl.andrzejkarwoski;

public class VovelCount {

    public static int getCountVovels(String str) {
        int vowelsCount = 0;
        for(int i =0;i<str.length();i++){
            if(     str.charAt(i) == 'a' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args){
        System.out.println(getCountVovels("abracadabra"));
    }
}
