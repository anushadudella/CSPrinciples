package com.simplerjava;
//resource used for indenting and formatting the display according to requirements
//https://www.homeandlearn.co.uk/java/java_formatted_strings.html
public class Matrix
{
    public static void main(String[] args) {
        //declare two 2d arrays Matrix A and Matrix B
        //these arrays size and values can be chnaged to where the adding and multiplying methods
        //still work the same
        int[][] matrixA= {{2,3},{4,5}};
        int[][] matrixB={{9,8},{1,5}};
        //prints the addition of matrix A and B
        addValues(matrixA,matrixB);
        System.out.println();
        //Prints the multiplication of Matrix A and B
        multiplyMatrices(matrixA,matrixB);
        System.out.println();
        //Prints out the multiplication of Matrix B and A
        multiplyMatrices(matrixB,matrixA);
    }

    //Void method that adds two 2D arrays by creating enw array and traversing through each 2d array
    //to get the values at each index added together with the value at the same index in the other 2D
    //array
    //@ param: takes 2 arrays whose indices are to be added with the respective index in the other array
    //prints the result array instead of returning an array (it is a void method)
    public static void addValues(int[][] arr1, int[][] arr2)
    {
        int sums[][]= new int [arr1.length][arr2[0].length];
        if(!checkArrayLength(arr1,arr2))
        {
            System.out.println("###Undefined");
        }
        else
        {
            for(int row=0;row<arr1.length;row++)
            {
                for(int col=0;col<arr2[0].length;col++)
                {
                    sums[row][col]= arr1[row][col]+ arr2[row][col];
                }
            }

            //prints the result of the 2D arrays being added together
            //shows the resltant 2d array that has all the indices added together
            for(int[] row:arr1)
            {
                for(int col: row)
                {
                    System.out.printf(" "+"%-3d",col);
                }
                System.out.println();
            }
            System.out.println("+");
            for(int[] row:arr2)
            {
                for(int col: row)
                {
                    System.out.printf(" "+"%-3d",col);
                }
                System.out.println();
            }
            System.out.println("=");
            for(int[] row: sums)
            {
                for(int col: row)
                {
                    System.out.printf(" "+"%-3d",col);
                }
                System.out.println();
            }
        }
    }

    //method multiplies the values in the 2D arrays
    //traverses through the row of each value
    //traverses through the column of each value
    //then adds the second value to the multiplied value
    //@param: takes two 2dArrays and multiplies each value with the resepctive value in the other 2d array
    //doesn't return a value because this is a void method, although prints the multiplied 2D array
    //the method makes sure that the numebr of columns in the first array is equal to the number of rows in the second array
    //by using the checkMultiplyArrayLength method
    //there are three loops so that the algorithm can work by multiplying the elements in a row of the first 2d array with the numbers in the column of the second 2d array
    public static void multiplyMatrices(int[][] multiplyArr1, int[][] multiplyArr2)
    {
        int[][] multipliedArr= new int[multiplyArr1.length][multiplyArr2[0].length];
        //the if statement checks if the arrays are of the same size using the boolean method checkArrayLength
        //if the method returns false, the output code will display "undefined"
        //if the 2D arrays are of the same size, the multiplication will exceute
        if(!checkMultiplyArrayLength(multiplyArr1,multiplyArr2))
        {
            System.out.println("@@@@Undefined");
        }
        else
        {
            for(int rows=0; rows<multiplyArr1.length; rows++)
            {
                for(int cols=0; cols<multiplyArr2[0].length; cols++)
                {
                    for(int rowsandcols =0; rowsandcols< multiplyArr1[0].length;rowsandcols++)
                    {
                        multipliedArr[rows][cols]+= multiplyArr1[rows][rowsandcols]*multiplyArr2[rowsandcols][cols];
                    }
                }
            }
            //prints the values of the mutlipliedArr
            //shows the 2D arrays that were multiplied together
            for(int[] row:multiplyArr1)
            {
                for(int col: row)
                {
                    System.out.printf(" "+"%-3d",col);
                }
                System.out.println();
            }
            System.out.println("*");

            for(int[] row:multiplyArr2)
            {
                for(int col: row)
                {
                    System.out.printf(" "+"%-3d",col);
                }
                System.out.println();
            }
            System.out.println("=");
            for(int[] rows: multipliedArr)
            {
                for(int cols: rows)
                {
                    System.out.printf(" "+"%-3d",cols);
                }
                System.out.println();
            }
        }
    }

    //boolean method returns whether the 2D arrays are of the same size
    //@param: takes two 2D arrays and compares their sizes to check if they are of the same size or TypeNotPresentException
    //@return: returns true is the 2D arrays are not the same length, returns false if they are of different sizes in comparison with each other
    public static boolean checkArrayLength(int[][] matrix1, int[][]matrix2)
    {
        return (matrix1.length!=matrix2.length||matrix1[0].length!=matrix2[0].length) ? false : true;

    }


    //boolean method checks condition for multiplying 2D arrays
    //for this to wrok, the 2D arrays need the saem number of rows and columns
    //@param: takes two 2D arrays and checks whether or not they have teh saem number of rows and columns
    //@return: returns false if the number of rows and columns is not equal
    //returns true if they have the same number of columns in the first 2d array is equal to the number or rows in the second 2D array
    public static boolean checkMultiplyArrayLength(int[][] array1, int[][] array2)
    {
        if(array1[0].length!=array2.length)
        {
            return false;
        }
        return true;
    }

}







