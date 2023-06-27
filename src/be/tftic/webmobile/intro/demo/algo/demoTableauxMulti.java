package be.tftic.webmobile.intro.demo.algo;

public class demoTableauxMulti {

    public static void main(String[] args) {

        int[] tab = {1,2};

        int[][] tab2Dim = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][][] tab3Dim = {
                { {1,2}, {3,4} },
                { {5,6}, {7,8} }
        };

        int[][] echiquier = new int[8][8];
        // echiquier[0][0] = 1;
        // echiquier[7][7] = 8;
        // int[] range1 = echiquier[0];

        // On affiche pas un tableau comme ça!
        // System.out.println(echiquier);
        // Mais comme ça...
        for (int i = 0; i < echiquier.length; i++) {
            for (int j = 0; j < echiquier.length; i++) {
                echiquier[i][j] = i+j;
            }
        }
    }
}
