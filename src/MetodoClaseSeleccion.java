
public class MetodoClaseSeleccion {
    int[] arreglo;

    public MetodoClaseSeleccion(int[] arreglo){
        this.arreglo = arreglo;
    }




    public void sort(int[] arr) {
        int tam = arr.length;
        for (int i =  0; i < tam -1 ; i++){
            int indiceDelMenor = i;
            
            for (int j = i + 1; j < tam; j++){
                if (arr[indiceDelMenor] > arr[j]){
                    indiceDelMenor = j; // actualizo del indice
                }
            }
            if(i != indiceDelMenor){ // intercambio
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;


                
            }

        }
    }

    public void sortDest(int[] arr) {
        int n = arr.length;
        for (int i =  0; i < n -1 ; i++){
            int indiceDelMenor = i;
            
            for (int j = i + 1; j < n; j++){
                if (arr[indiceDelMenor] < arr[j]){
                    indiceDelMenor = j; // actualizo del indice
                }
            }
            if(i != indiceDelMenor){ // intercambio
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;


                
            }

        }
    }    






        
    public void impArreglo(){
        for(int num : arreglo){
            System.out.print(num + ", ");
        }
        System.out.println();
    }


}
