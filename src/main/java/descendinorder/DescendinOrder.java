package descendinorder;

import java.util.Arrays;
import java.util.Collections;

public class DescendinOrder {

    public static void main(String[] args) {

        System.out.println(sortDesc(42145));
    }

    public static int sortDesc(int num) {
        String numeroStr = String.valueOf(num);
        Integer[] digitos = new Integer[numeroStr.length()];

        for (int i = 0; i < numeroStr.length(); i++) {
            digitos[i] = Character.getNumericValue(numeroStr.charAt(i));
        }

        Arrays.sort(digitos, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int d : digitos){
            sb.append(d);
        }

        return Integer.parseInt(sb.toString());
    }

}