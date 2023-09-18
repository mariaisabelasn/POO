public class DieDemo{
    public static void main(String []args){
        Die d1 = new Die();
        Die d2 = new Die();

        d1.roll();
        d2.roll();
        System.out.println("Dado 1: " + d1.getSideUp() + " Dado 2: " + d2.getSideUp() + " Soma: " + (d1.getSideUp() + d2.getSideUp()));
    }
}