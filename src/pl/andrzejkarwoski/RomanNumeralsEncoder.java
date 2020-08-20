package pl.andrzejkarwoski;

public class RomanNumeralsEncoder {

    public static String solution(int n) {
        System.out.println(n);
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<n;i++)
        {
            result.append("I");
        }
        String roman = result.toString();
        roman = roman.replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
        System.out.println(roman);
        return roman;
    }

    public static void main(String[] args){
        solution(111);
        solution(1111);
        solution(211);
        solution(1211);
        solution(2111);

    }


}
