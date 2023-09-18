public class Pessoa{

	private String nome, cpf;
	private int anoNasc;

	public Pessoa(){
		nome = "sem nome"; cpf = "sem cpf"; anoNasc = -99;
	}

	public void setNome(String n){
		nome = n;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public void setAnoNasc(int a){
		anoNasc = a;
	}
	
	public void imprimirDados(){
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Ano: " + anoNasc);
	 
 }	  
}// fim da classe
