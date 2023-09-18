public class Complexo{
    private double parteReal;
    private double parteImaginaria;

    public Complexo(){
        parteReal = 1;
        parteImaginaria = 2;
    }

    public Complexo(double parteReal){
        this.parteReal = parteReal;
        parteImaginaria = 2;
    }

    public void inicializaNumero(double parteReal, double parteImaginaria){ 
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public void imprimeNumero(){
        System.out.println(parteReal + " + " + parteImaginaria + "i");
    }

    public boolean elgual(Complexo numero2){
        return (this.parteReal == numero2.parteReal) && (this.parteImaginaria == numero2.parteImaginaria);
    }

    public Complexo soma(Complexo c2){
      
        Complexo novo = new Complexo();
        novo.parteReal = this.parteReal + c2.parteReal;
        novo.parteImaginaria = this.parteImaginaria + c2.parteImaginaria;

        return novo;

    }

    public Complexo subtrai(Complexo c2){

        Complexo novo = new Complexo();
        novo.parteReal = this.parteReal - c2.parteReal;
        novo.parteImaginaria = this.parteImaginaria - c2.parteImaginaria;

        return novo;

    }

    public Complexo multiplica(Complexo c2){

        Complexo novo = new Complexo();
        novo.parteReal = (this.parteReal * c2.parteReal) - (this.parteImaginaria * c2.parteImaginaria);
        novo.parteImaginaria = (this.parteReal * c2.parteImaginaria) + (this.parteImaginaria * c2.parteReal) ;

        return novo;

    }

    public Complexo divide(Complexo c2){

        Complexo novo = new Complexo();
        novo.parteReal = (this.parteReal * c2.parteReal + this.parteImaginaria * c2.parteImaginaria)/ (c2.parteReal * c2.parteReal + c2.parteImaginaria * c2.parteImaginaria);
        novo.parteImaginaria = (this.parteImaginaria * c2.parteReal - this.parteReal * c2.parteImaginaria) / (c2.parteReal * c2.parteReal + c2.parteImaginaria * c2.parteImaginaria);

        return novo;
        
    }
}