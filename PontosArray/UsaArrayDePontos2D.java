public class UsaArrayDePontos2D {
    public static void main(String[] a){
        ArrayDePontos2D ponto = new ArrayDePontos2D(5);

        ponto.modifica(0, new Ponto2D(-1, -3));
        ponto.modifica(3, new Ponto2D(5, 3));
        ponto.modifica(4, new Ponto2D(0, 1));

        System.out.println(ponto);
    }
    
}
