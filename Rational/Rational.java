public class Rational {
    private int numerador;
    private int denominador;

    public Rational(){
        denominador = 0;
        numerador = 0;
    }

    public Rational(int numerador){
        denominador = 0;
        this.numerador = numerador;
    }

    public Rational(int numerador, int denominador){
        int mdc = mdc(numerador, denominador);
        this.denominador = denominador/mdc;
        this.numerador = numerador/mdc;
    }

    public int mdc(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
        

    public Rational soma(Rational c){
        Rational novo = new Rational();
        novo.numerador = (this.numerador * c.denominador) + (c.numerador * this.denominador);
        novo.denominador = this.denominador * c.denominador;
        return novo;
    }

    public Rational subtrai(Rational c){
        Rational novo = new Rational();
        novo.numerador = (this.numerador * c.denominador) - (c.numerador * this.denominador);
        novo.denominador = this.denominador * c.denominador;
        return novo;
    }

    public Rational dividi(Rational c){
        Rational novo = new Rational();
        novo.denominador = this.denominador * c.numerador;
        novo.numerador = this.numerador * c.denominador;
        return novo;
    }
    
    public Rational multiplica(Rational c){
        Rational novo = new Rational();
        novo.numerador = this.numerador * c.numerador;
        novo.denominador = this.denominador * c.denominador;
        return novo;
    }

    public void imprimir(){
        System.out.println(numerador + "/" + denominador);
    }

    public void imprimirDouble(int a){
        double resultado;
        resultado = (double)this.numerador/this.denominador;
        System.out.printf("%."+a+"f", resultado);
        System.out.println("");
    }
}
