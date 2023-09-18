public class Banco {
    public static void main(String[] a){
        ContaBancaria2[] bank = new ContaBancaria2[10];

        bank[0] = new ContaBancaria2("Chaves", 500);
        bank[2] = new ContaBancaria2("Chiquinha", 700);
        bank[8] = new ContaBancaria2("Kiko", 1500);

        System.out.print("Capital do Banco: ");
        System.out.println(total(bank));
    }

    public static double total(ContaBancaria2[] x){
        double total = 0;
        for(ContaBancaria2 c : x)
            if(c != null)
                total += c.getSaldo();

        return total;
    }
}
