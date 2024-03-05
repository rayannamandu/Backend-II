import java.util.Arrays;

public class arrayAula {
    public static void main(String[] args) {
        int [] arrayUm = {12, 3 ,5 ,68, 9, 6, 73, 44, 456, 65};

        Arrays.sort(arrayUm);

        for (int i = 0; i < arrayUm.length; i++) {
            System.out.println(arrayUm[i]);
        }
    }
}
