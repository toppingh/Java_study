package Reference_type;

import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        double[] ab = {1.2, 3.4, 5.6};
        double[] bc = ab;
        bc[0] = 7.8;
        System.out.println(Arrays.toString(ab));
        System.out.println(Arrays.toString(bc));

        int[] cd = new int[]{1, 2, 3, 4, 5};
        for (int i: cd) {
            System.out.println(cd[i-1]);
        }

        int[][] de = new int[2][];
        de[0] = new int[]{1, 3, 5};
        de[1] = new int[]{7, 9};

        for (int i = 0; i < de.length; i++) { // i = 0
            for (int j = 0; j < de[i].length; j++) {
                System.out.println(de[i][j]);
            }
        }

        String a = "방가";
        String b = new String("방가");
        String c = "방가";
        String d = new String("방가");
        String e = "방가";
        String f = new String("방가");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a == e);
        System.out.println(a == f);
        System.out.println();

        System.out.println(b == c);
        System.out.println(b == d);
        System.out.println(b == e);
        System.out.println(b == f);
        System.out.println();

        String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
        String name;
        int age;

        int start1 = str.indexOf("[");
        int end1 = str.indexOf("]");
        name = str.substring(start1 + 1, end1);

        int start2 = str.lastIndexOf("[");
        int end2 = str.lastIndexOf("]");
        age = Integer.parseInt(str.substring(start2 + 1, end2));

        System.out.println(name);
        System.out.println(age);
    }
}
