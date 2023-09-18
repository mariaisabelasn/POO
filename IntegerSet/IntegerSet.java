public class IntegerSet{
    private boolean[] a;

    public IntegerSet(){
        a = new boolean[101];
    }

    public IntegerSet union(IntegerSet x){
        IntegerSet c = new IntegerSet();
    
        for(int i=0; i<101; i++){
            if(a[i]==true || x.a[i]==true)
                c.a[i] = true;
            else
                c.a[i] = false;
        }
        
        return c;
    }

    public IntegerSet intersection(IntegerSet x){
        IntegerSet c = new IntegerSet();
    
        for(int i=0; i<101; i++){
            if(a[i]==false || x.a[i]==false)
                c.a[i] = false;
            else
                c.a[i] = true;
        }
        
        return c;
    }

    public void insertElement(int elemento){
        if(elemento>=0 && elemento<=100)
            a[elemento] = true;
    }

    public void deleteElement(int elemento){
        if(elemento>=0 && elemento<=100)
            a[elemento] = false;
    }

    public String toSetString() {
        String s = "";

        for(int i=0; i<a.length; i++){
            if(this.a[i])
                s += i+ " ";
        }
        if(s == "")
            return "--";
        return s;
    
    }

    public boolean isEqualTo(IntegerSet x){

        for(int i=0; i<a.length; i++){
            if((this.a[i] != x.a[i]))
                return false;
        }
         
        return true;
    }

    
        
}



