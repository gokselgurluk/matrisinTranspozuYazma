import java.util.Arrays;

public class Main {


    public static void matrisTranspozu(int[][] matris) {

        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(matris[j][i] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 4}};

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matris Transpozu:");
        matrisTranspozu(matris);

    }
}
