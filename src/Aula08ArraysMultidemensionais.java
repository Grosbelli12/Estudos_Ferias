public class Aula08ArraysMultidemensionais {
    public static void main(String[] args) {

        // meses 1,2,3,4,5
        // Dias 31,28,31,30

        int num[][] = new int[1][5];

        num[0][0] = 31;
        num[0][1] = 28;
        num[0][2] = 31;
        num[0][3] = 30;
        num[0][4] = 31;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print(num[i][j]);
            }
        }
    }
}
