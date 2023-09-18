public class UsaIntegerSet {
    public static void main(String[] args){
        IntegerSet vet = new IntegerSet();
        IntegerSet vet2 = new IntegerSet();

        vet.insertElement(2);
        vet.insertElement(5);
        vet.insertElement(10);
        vet.deleteElement(5);

        vet2.insertElement(6);
        vet2.insertElement(12);

        System.out.println("Conjunto 1: " + vet.toSetString());
        System.out.println("Conjunto 2: " + vet2.toSetString());

        IntegerSet uniao = new IntegerSet();
        uniao = vet.union(vet2);
        System.out.println("Uniao: " + uniao.toSetString());

        IntegerSet intersecao = new IntegerSet();
        intersecao = vet.intersection(vet2);
        System.out.println("Intersecao: " + intersecao.toSetString());

        if(vet.isEqualTo(vet2))
            System.out.println("Sao iguais");
        else
            System.out.println("Nao sao iguais");

        }
        
}
