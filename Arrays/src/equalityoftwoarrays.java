import java.util.*;
public class equalityoftwoarrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[6];
        int[] arr2 = new int[6];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean isequal = true;
        if (arr1.length != arr2.length) {
            isequal = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isequal = false;
                    break;
                }
            }
        }
        if (isequal) {
            System.out.print("true");
        } else {
            System.out.print("False");
        }
    }
}
