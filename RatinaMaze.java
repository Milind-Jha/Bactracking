import java.util.ArrayList;

public class RatinaMaze {
    public static boolean ratinamaze(int[][] arr) {                //arr[i][j] =1 travel possible arr[i][j]  = 0 not possible
        int[][] mazeTravel = new int[arr.length][arr.length];     //square matrix if arr[i][j] =1 already traveled
        return solution(arr, mazeTravel, 0, 0);        //arr[i][j] =0 not traveled
    }

    private static boolean solution(int[][] arr, int[][] mazeTravel, int row, int column) { //travel from 0,0 to n-1,n-1
        //Check if travel row,columnn isvalid or not
        //Check if path is travelled or not i.e. mazetravel!=1
        //Check if it is a blocked cell

        int size = arr.length;

        if (row < 0 || row >= size || column < 0 || column >= size || arr[row][column] == 0 || mazeTravel[row][column] == 1 ) {
            return false;
        }
        //Mark position as travelled
        mazeTravel[row][column] = 1;
        //Check if reached destination
        if(row== arr.length-1&&column== arr.length-1){
            return true;
        }
        //Top direction
        if (solution(arr, mazeTravel, row - 1, column) ) {
            return true;
        }
        //Right direction
        if (solution(arr, mazeTravel, row, column + 1)) {
            return true;
        }

        //Left direction
        if (solution(arr, mazeTravel, row, column - 1)) {
            return true;
        }

        //Down direction
        if (solution(arr, mazeTravel, row + 1, column)) {
            return true;
        }
        //Above 4 Conditions not satisfied
        return false;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 0, 1}, {0, 1, 0}, {1, 1, 1}};
        System.out.println(ratinamaze(input));
    }
}
