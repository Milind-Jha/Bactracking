public class PrintAllPathsforRatinaMaze {
    public static void ratInAMaze(int[][] arr, int size) {                //arr[i][j] =1 travel possible arr[i][j]  = 0 not possible
        int[][] mazeTravel = new int[size][size];     //square matrix if arr[i][j] =1 already traveled
        solution(arr, mazeTravel, 0, 0);        //arr[i][j] =0 not traveled
    }


private static void solution(int[][] arr, int[][] mazeTravel, int row, int column) { //travel from 0,0 to n-1,n-1

    int size = arr.length;

    if (row < 0 || row >= size || column < 0 || column >= size || arr[row][column] == 0
            || mazeTravel[row][column] == 1 ) {
        return;
    }
    mazeTravel[row][column] = 1;

    if(row== arr.length-1&&column== arr.length-1){
        for(int i=0;i<=row;i++){
            for(int j=0;j<=column;j++){
                System.out.print(mazeTravel[i][j]+ " ");
            }
        }

        System.out.println();
        mazeTravel[row][column]=0;
        return;
    }
    //Top direction
    solution(arr, mazeTravel, row - 1, column);
    //Right direction
    solution(arr, mazeTravel, row, column + 1);
    //Left direction
    solution(arr, mazeTravel, row, column - 1);
    //Down direction
    solution(arr, mazeTravel, row + 1, column);

    mazeTravel[row][column]=0;
    return;
}
    public static void main(String[] args) {
        int[][] input = {{1,0, 1}, {1, 1 , 1},{1,1,1}};
        int size = input.length;
        ratInAMaze(input, size);
    }
    //    private static void solution(int[][] arr, int[][] mazeTravel, int row, int column) { //travel from 0,0 to n-1,n-1
//
//
//        int size = arr.length;
//
//        if (row < 0 || row >= size || column < 0 || column >= size || arr[row][column] == 0
//                || mazeTravel[row][column] == 1 ) {
//            return;
//        }
//        mazeTravel[row][column] = 1;
//
//        if(row== arr.length-1&&column== arr.length-1){
//            for(int i=0;i<=row;i++){
//                for(int j=0;j<=column;j++){
//                    System.out.print(mazeTravel[i][j]+ " ");
//                }
//                System.out.println();
//
//            }
//            mazeTravel[row][column]=0;
//            return;
//        }
//        //Top direction
//        solution(arr, mazeTravel, row - 1, column);
//        //Right direction
//        solution(arr, mazeTravel, row, column + 1);
//        //Left direction
//        solution(arr, mazeTravel, row, column - 1);
//        //Down direction
//        solution(arr, mazeTravel, row + 1, column);
//
//        mazeTravel[row][column]=0;
//        return;
//    }
}
