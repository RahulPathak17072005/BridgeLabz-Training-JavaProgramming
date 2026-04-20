
import java.util.*;
public class TicTacToe {
    static char[][] board={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    public static void printBoard(){
        System.out.println("-----------------");
        for(int i=0;i<3;i++){
            //System.out.print("| ");
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+"| ");
            }
            System.out.println();
            System.out.println("----------------");
        }
    }
    public static boolean boardFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' '){
                    return false;
                }

            }
        }
        return true;

    }
    public static boolean CheckBoard(char player){
        // edges k liye horizontal and vertical
        for(int i=0;i<3;i++){
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player )return true;
        }
        for(int j=0;j<3;j++){
            if(board[0][j]==player && board[1][j]==player && board[2][j]==player )return true;
        }
        // for diagonal 
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("WelCOme to TIC-TAC-TOE");
        char currentPlayer='X';
        boolean gameEnded=false;
        printBoard();
        while(!gameEnded){
            System.out.print("Player "+currentPlayer+" Enter your Move:  row-  ");
            int row=sc.nextInt();
            System.out.println("Player"+currentPlayer+"Enter your Move: col - ");
            int col=sc.nextInt();
            if(row<0|| row>2 || col<0 || col>2 || board[row][col]!=' '){
                System.out.println("Invalid Move");
                continue;

            }


            board[row][col]=currentPlayer;
            printBoard();
    

            if(CheckBoard(currentPlayer)){
                System.out.println("player "+currentPlayer+" wins");
                gameEnded=true;
            }else if(boardFull()){
                System.out.println("its draw");
                gameEnded=true;
            }else{
                currentPlayer=(currentPlayer=='X')?'O':'X';// using ternary operator
            }
            
            
        }
        sc.close();
        
    }

}