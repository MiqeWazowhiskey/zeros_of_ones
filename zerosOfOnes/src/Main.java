import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please enter the game square board's edge size (bigger than 2) ->> ");
        Scanner inp = new Scanner(System.in);
        int input=inp.nextInt();
        int[][] arrayc= Board(input);
        while(true){
            System.out.println("Which state? ?x?");
            System.out.println("1-> ");
            int one = inp.nextInt();
            System.out.println("2-> ");
            int two = inp.nextInt();
            if(arrayc[one-1][two-1]==1){
                System.out.println("GAME OVER ! ! !");
                finalBoardPrinter(arrayc,input);
                System.out.print("GAME OVER ! ! !");
                break;}
        }

    }
    public static int[][] Board(int input){
        Random random = new Random();
        int counter = 0;
        int[][] array = new int[input][input];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("_"+" ");
                counter++;
            }
            if (counter % input == 0) {
                System.out.print("\n");
            }
        }
        int a = (input-1);
        for (int j=0; j<a-1; j++) {
            for (int i = 0; i <=a; i++) {
                int mine = random.nextInt(array.length);
                int mine2 = random.nextInt(array[i].length);
                array[mine][mine2] = 1;
            }
        }
        return array;
    }
    public static void finalBoardPrinter (int[][]initalBoard,int input){
        int counter =0;
        for(int i=0; i<initalBoard.length; i++){
            for(int j=0; j<initalBoard[i].length; j++){
                System.out.print(initalBoard[i][j]+ " ");
                counter ++;
            }
            if(counter%input==0){
                System.out.print("\n");
            }
        }

    }
}
