package Ej_3_Pasaje_Decimal_a_Binario;
import java.util.ArrayList;
public class Ej_3 {
    ArrayList<Integer> aux= new ArrayList<>();
    public ArrayList<Integer> binario(int n){
        int divisor=2;
        if(n>=divisor){
            aux.add(0,n%2);
            return (binario(n/2));
        }
        else if(n<divisor){
            aux.add(0,1);
        }

        imprimir(aux);
        return aux;
    }

    public void imprimir (ArrayList<Integer> arr){
        for(int i=0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
}
