/**/
public class ReverseArrayElement {
    public static void reverseElements(int[][] twoDimArray) {
        for (int x = 0; x < twoDimArray.length; x++) {
            int length = twoDimArray[x].length;
            for (int y = 0; y < (length / 2); y++) {
                int temp = twoDimArray[x][y];
                twoDimArray[x][y] = twoDimArray[x][length - 1 - y];
                twoDimArray[x][length - 1 - y] = temp;
            }
        }
    }
}
