package cn.fougert.dataStructrues.array;

/**
 * @author luhuan
 * @date 2024/7/23
 * @description  稀疏数组 demo
 **/
public class SparseArray {

    public static void main(String[] args) {

        //1、初始二维数组
        int[][] cheeseArr = new int[11][11];
        cheeseArr[1][2] = 1;
        cheeseArr[2][3] = 2;
        cheeseArr[4][5] = 2;
        System.out.println("------- 输出原始数组 --------");
        for (int[] row : cheeseArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }


        //2、将二维数组转换成稀疏数组
        int valueNum = 0;
        for (int[] row : cheeseArr) {
            for (int data : row) {
                if (data != 0)
                    valueNum ++ ;
            }
        }
        int sparseArr[][] = new int[valueNum + 1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = valueNum;

        int count = 0 ;   //记录第几行
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++){
                if (cheeseArr[i][j] != 0){
                    //记录非0值
                    count = count + 1 ;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = cheeseArr[i][j];
                }
            }
        }
        //输出数组
        System.out.println("--------- 转成成的稀疏数组 ----------");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }
        System.out.println();


        //3、稀疏数组恢复成二维数组
        int row = sparseArr[0][0];
        int col = sparseArr[0][1];
        int[][] cheeseArray2 = new int[row][col];
        for (int i = 1; i < sparseArr.length; i++) {
            cheeseArray2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        System.out.println("---------- 稀疏数组转换成的二维数组 -----------");
        for (int[] rows : cheeseArray2) {
            for (int data : rows) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }


}
