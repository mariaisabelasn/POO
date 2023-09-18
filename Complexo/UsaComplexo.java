public class UsaComplexo {
    public static void main(String[] args){
        Complexo nome = new Complexo();
        Complexo nome2 =  new Complexo();

        nome.inicializaNumero(2, 5);
        nome2.inicializaNumero(2, 3);

        System.out.println("E igual? " + nome.elgual(nome2));

        Complexo sum = new Complexo();
        sum = nome.soma(nome2);
        System.out.printf("Soma: ");
        sum.imprimeNumero();

        Complexo subtrai = new Complexo();
        subtrai = nome.subtrai(nome2);
        System.out.printf("Subtracao: ");
        subtrai.imprimeNumero();

        Complexo multiplica = new Complexo();
        multiplica = nome.multiplica(nome2);
        System.out.printf("Multiplicacao: ");
        multiplica.imprimeNumero();

        Complexo divide = new Complexo();
        divide = nome.divide(nome2);
        System.out.printf("Divisao: ");
        divide.imprimeNumero();
        
    }
}
