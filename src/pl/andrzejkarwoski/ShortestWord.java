package pl.andrzejkarwoski;

public class ShortestWord {

    public static int findShort(String s) {
        String[] words = s.split(" ");
        int minSize = words[0].length();
        for(String str : words) if(str.length() < minSize) minSize = str.length();
        return minSize;
    }


    public static void main(String[] args){

        String s = "bitcoin take over the world maybe who knows perhaps";

        System.out.println(findShort(s));


    }


}
