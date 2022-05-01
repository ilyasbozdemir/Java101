package odev.array.transpose;
public class App
{
    public static void main(String[] args) {
       int[][] matrix = {{6,5,4},{3,2,1}};
       
        System.out.println("Matris : ");
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++) {
                   System.out.print(matrix[i][j]+" ");
                }
            System.out.println();
        }
        
        System.out.println("Transpoze : ");
        
        for (int i = 0; i <matrix[0].length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
