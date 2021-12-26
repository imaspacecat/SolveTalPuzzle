import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private int[][] board;

    public Board(int tiling) {
        switch (tiling) {
            case 1:
                board = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {6, 6, 6, 7, 7}, {8, 8, 8, 9, 9}};
            //add all the possible arrangements of the shapes here
        }
    }

    public void printBoard() {
        for (int a = 0; a < board.length; a++) {
            for (int b = 0; b < board[0].length; b++) {
                System.out.print(board[a][b]);
            }
            System.out.println();
        }
    }

    public void findPatterns() {

        ArrayList<Integer> arrayL1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19));
        int[] combination = new int[9];

        long startTm = System.currentTimeMillis();
        long startIterTm = startTm;
        long iterCount = 0;

        for (int i1 = 0; i1 < arrayL1.size(); i1++) {
            combination[0] = arrayL1.get(i1);
            ArrayList<Integer> arrayL2 = (ArrayList<Integer>) arrayL1.clone();
            arrayL2.remove(i1);
            arrayL2.remove((i1 + arrayL1.size()/2) % arrayL2.size());
            for (int i2 = 0; i2 < arrayL2.size(); i2++) {
                combination[1] = arrayL2.get(i2);
                ArrayList<Integer> arrayL3 = (ArrayList<Integer>) arrayL2.clone();
                arrayL3.remove(i2);
                arrayL3.remove((i2 + arrayL2.size()/2) % arrayL3.size());
                for (int i3 = 0; i3 < arrayL3.size(); i3++) {
                    combination[2] = arrayL3.get(i3);
                    ArrayList<Integer> arrayL4 = (ArrayList<Integer>) arrayL3.clone();
                    arrayL4.remove(i3);
                    arrayL4.remove((i3 + arrayL3.size()/2) % arrayL4.size());
                    for (int i4 = 0; i4 < arrayL4.size(); i4++) {
                        combination[3] = arrayL4.get(i4);
                        ArrayList<Integer> arrayL5 = (ArrayList<Integer>) arrayL4.clone();
                        arrayL5.remove(i4);
                        arrayL5.remove((i4 + arrayL4.size()/2) % arrayL5.size());
                        for (int i5 = 0; i5 < arrayL5.size(); i5++) {
                            combination[4] = arrayL5.get(i5);
                            ArrayList<Integer> arrayL6 = (ArrayList<Integer>) arrayL5.clone();
                            arrayL6.remove(i5);
                            arrayL6.remove((i5 + arrayL5.size()/2) % arrayL6.size());
                            for (int i6 = 0; i6 < arrayL6.size(); i6++) {
                                combination[5] = arrayL6.get(i6);
                                ArrayList<Integer> arrayL7 = (ArrayList<Integer>) arrayL6.clone();
                                arrayL7.remove(i6);
                                arrayL7.remove((i6 + arrayL6.size()/2) % arrayL7.size());
                                for (int i7 = 0; i7 < arrayL7.size(); i7++) {
                                    combination[6] = arrayL7.get(i7);
                                    ArrayList<Integer> arrayL8 = (ArrayList<Integer>) arrayL7.clone();
                                    arrayL8.remove(i7);
                                    arrayL8.remove((i7 + arrayL7.size()/2) % arrayL8.size());
                                    for (int i8 = 0; i8 < arrayL8.size(); i8++) {
                                        combination[7] = arrayL8.get(i8);
                                        ArrayList<Integer> arrayL9 = (ArrayList<Integer>) arrayL8.clone();
                                        arrayL9.remove(i8);
                                        arrayL9.remove((i8 + arrayL8.size()/2) % arrayL9.size());
                                        for (int i9 = 0; i9 < arrayL9.size(); i9++) {
                                            combination[8] = arrayL9.get(i9);
                                            ++iterCount;
                                            long tm = System.currentTimeMillis();
                                            if (tm > startIterTm + 1000)
                                            {
                                                System.out.println("Iter rate is " + iterCount*1000 / (tm - startTm) + " [iter/Sec], Iterations " + iterCount + ", elapsed " + (tm-startIterTm));
                                                startIterTm = tm;
                                            }
//                                            for(int a = 0; a < combination.length; a++){
//                                                System.out.print(" " + combination[a] + " ");
//                                            }
//                                            System.out.println();

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Iter rate is " + iterCount*1000 / (System.currentTimeMillis() - startTm) + " [iter/Sec], Iterations " + iterCount + ", elapsed " + (System.currentTimeMillis()-startIterTm));
    }

    private void checkBoard(int[] combination) {
        /*
        triangle = 1
        circle = 2
        star = 3
        swirl = 4
        decagon = 5

        these + their inverses are the possible shapes (inverse meaning 1 = 1, 2, 3; 1 = 3, 2, 1)
        1 = 1, 2, 3
        2 = 3, 4, 2
        3 = 5, 1, 4
        4 = 2, 5, 1
        5 = 4, 3, 5
        6 = 4, 5, 3
        7 = 4, 5, 2
        8 = 1, 2
        9 = 3, 1
         */


    }
}
