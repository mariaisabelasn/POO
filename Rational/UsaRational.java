public class UsaRational {
    public static void main(String[] a){
        Rational n1 = new Rational(2, 4);
        Rational n2 = new Rational(1, 2);

        Rational soma = new Rational();
        soma = n1.soma(n2);
        System.out.println("Soma: ");
        soma.imprimir();
        soma.imprimirDouble(3);

        Rational subtrai = new Rational();
        subtrai = n1.subtrai(n2);
        System.out.println("Subtracao: ");
        subtrai.imprimir();
        subtrai.imprimirDouble(3);

        Rational divide = new Rational();
        divide = n1.dividi(n2);
        System.out.println("Divisao: ");
        divide.imprimir();
        divide.imprimirDouble(3);

        Rational multiplica = new Rational();
        multiplica = n1.multiplica(n2);
        System.out.println("Multiplicacao: ");
        multiplica.imprimir();
        multiplica.imprimirDouble(3);

    }
}
