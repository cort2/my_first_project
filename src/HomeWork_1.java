import java.util.Arrays;

public class HomeWork_1 {
    public static void main(String[] args) {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String hi2 = hi.replaceAll(" ", "");
        world = world.toLowerCase();
        String result = hi2 + world + newLine + hi2 + world + newLine + hi2 + world;
        System.out.println(result);

        String str = "=";
        String repeated = str.repeat(30);
        System.out.println(repeated);

        double myHeight = 1.84;
        int myWeight = 82;
        int index = (int) (myWeight / (myHeight * myHeight));
        System.out.println(index);

        System.out.println(repeated);

        String[] myArray = new String[]{"a", "b", "c", "d", "e"};
        String myArrayString = Arrays.toString(myArray);
        System.out.println(myArrayString);
        myArray[3] = "h";
        String myArrayString2 = Arrays.toString(myArray);
        System.out.println(myArrayString2);

        System.out.println(repeated);

        System.out.println("Продвинутый Уровень");

        var number = Integer.parseInt("234");
        String string = "some_text";
        System.out.println(number + string);

        System.out.println(repeated);

        int a = 3;
        int b = 5;
        int c = (a + b) * 2;
        System.out.println(c);

        System.out.println(repeated);

        int[] array = new int[]{1, 2, 5, 7, 10};
        int[] array2 = new int[]{2, 3, 2, 17, 15};
        int[] array3 = new int[15];
        array3[0] = array[0];
        array3[1] = array[1];
        array3[2] = array[2];
        array3[3] = array[3];
        array3[4] = array[4];
        array3[5] = array2[0];
        array3[6] = array2[1];
        array3[7] = array2[2];
        array3[8] = array2[3];
        array3[9] = array2[4];
        array3[10] = array[0] * array2[0];
        array3[11] = array[1] * array2[1];
        array3[12] = array[2] * array2[2];
        array3[13] = array[3] * array2[3];
        array3[14] = array[4] * array2[4];
        for (int i = 0; i < 15; i++){
            System.out.print(array3[i]);
        }

        System.out.println();
        System.out.println(repeated);

        String word = ("Hello world!");
        System.out.println(word);
        System.out.println(word.replace('l', 'r'));
        String word2 = word.toUpperCase();
        System.out.println(word2);
        System.out.println(word.substring(0,9));












    }
}
