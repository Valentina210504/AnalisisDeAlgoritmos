
package matrices;

public class Matrices {
    public static void main(String[] args) {
        int matriz[][]= new int [3000][3000];
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*9+1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
       
        long endTime = System.currentTimeMillis();
        System.out.println("el programa demoro " + (endTime - startTime) + " milisegundos");
    }
    
}
