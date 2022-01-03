

public class Burbuja{

    public static void main(String[] args){

        int[] arreglo = new int[]{50,40,30,20,10};
        int comparaciones = 0;
        int intercambios = 0;
        int desordenados = arreglo.length - 1;
        boolean ordenado = false;
        int temp = 0;

        while(!ordenado){
            ordenado = true;
            for(int i=0; i < desordenados; i++){
                comparaciones ++;
                if(arreglo[i] > arreglo[i+1]){
                    intercambios ++;
                    ordenado = false;
                    temp = arreglo[i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = temp;
                }
            }
            desordenados --;
        }
        System.out.println("Comparaciones totales: " + comparaciones);
        System.out.println("Intercambios totales: " + intercambios);
    }
}