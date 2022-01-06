/**
  *@author: Ali Kagan Yilmaz
  *@version: 2.0
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                System.out.print("Please enter the game square board's edge size (bigger than 2) ->> ");
                Scanner inp = new Scanner(System.in);
                int input=inp.nextInt();
                String[][] arrayc= Board(input);
                int[][]mineBoard=mineBoard(input);
                while(true){
                    BoardWriter(arrayc,input);
                    System.out.println("Which state? ?x?");
                    System.out.println("1-> ");
                    int one = inp.nextInt();
                    System.out.println("2-> ");
                    int two = inp.nextInt();
                    arrayc[one-1][two-1] = "O ";
                    if(mineBoard[one-1][two-1]==1){
                        System.out.println("GAME OVER ! ! !");
                        finalBoardPrinter(mineBoard,input);
                        System.out.print("GAME OVER ! ! !");
                        break;}
                }

            }
            public static String[][] Board(int input){
                Random random = new Random();
                int counter = 0;
                String[][] boardArray = new String [input][input];
                for (int i = 0; i < boardArray.length; i++) {
                    Arrays.fill(boardArray[i], "_ ");
                }
                return boardArray;
            }
            public static void finalBoardPrinter (int[][]mineBoard,int input){
                int counter =0;
                for(int i=0; i<mineBoard.length; i++){
                    for(int j=0; j<mineBoard[i].length; j++){
                        System.out.print(mineBoard[i][j]+ " ");
                        counter ++;
                    }
                    if(counter%input==0){
                        System.out.print("\n");
                    }
                }
            }
            public static void BoardWriter (String[][]array,int input){
                int counter=0;
                for (int i =0; i<array.length; i++){
                    for(int j=0; j<array[i].length; j++){
                        System.out.print(array[i][j]);
                        counter++;
                    }
                    if(counter%input==0){
                        System.out.print("\n");
                    }
                }
            }
            public static int[][] mineBoard (int input){
                Random random = new Random();
                int[][] array= new int[input][input];
                for(int i=0; i< input*0.2; i++){
                    for(int j=0; j< input; j++){
                        int mine = random.nextInt(array.length);
                        int mine2 = random.nextInt(array.length);
                        array[mine][mine2] = 1;
                    }
                }
                return array;
            }
        }

