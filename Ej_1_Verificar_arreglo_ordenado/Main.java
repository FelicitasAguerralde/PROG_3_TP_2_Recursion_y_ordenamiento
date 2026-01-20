package Ej_1_Verificar_arreglo_ordenado;

public class Main {
    public static void main (String []args){
        int arregloOrdenado[] = {1, 2, 3, 4, 5};
        int arregloDesordenado[]= {1,2,3,5,4};
        Ej_1 verificador = new Ej_1();

        verificador.imprimir(arregloOrdenado, 0);
        verificador.imprimir(arregloDesordenado,0);
    }
}
