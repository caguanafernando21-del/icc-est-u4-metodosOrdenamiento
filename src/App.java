public class App {
    public static void main(String[] args) throws Exception {
        metodoBurbuja();        
        MetodoBurbujaAvanzado();
    }
    public static void metodoBurbuja(){
        System.out.println("Metodo Burbuja");
        int[] arreglo = new int[]{10,-5,0,2,7};

        
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        System.out.println("Orden Ascendente");
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarAscendente();
        metodoBurbuja.imprimirArreglo();

        System.out.println("Orden descendente");


        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenarDescendente();
        metodoBurbuja.imprimirArreglo();


        

    }



    public static void MetodoBurbujaAvanzado() {
        int[] arreglo = new int[]{50,5,20,30,0,-10,15};

        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        System.out.println("Metodo Avanzado");


        mBurbujaAvanzado.printArreglo();
        System.out.println("Ascendente");
        mBurbujaAvanzado.sort(true);
        mBurbujaAvanzado.printArreglo();
        
        System.out.println("Descendente");
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.printArreglo();
        
    }


}
