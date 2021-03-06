package solution;

import java.util.*;


public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0;

        Set colores = new HashSet();
        for(int i = 0; i < n; i++){
            if(colores.contains(ar[i])){//Nos ayuda a ver si ya encontramos un par.
                colores.remove(ar[i]);//Si lo encontramos eliminamos el color.
                count += 1;//Indicamos en el contador que encontramos un par.
            }else{
            colores.add(ar[i]);//Si el color actual no esta en la coleccion lo agregamos, para buscar su par.
            }
        }
        return count;//Retornamos el numero de pares que encontramos.

    }
    
}
