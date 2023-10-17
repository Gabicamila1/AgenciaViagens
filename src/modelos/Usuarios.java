package modelos;
public class Usuários {
private int id;
private string nome;
private string sobrenome;
private float telefone;
private string email;

//construtor 
public Usuarios () {
}

public Usuarios (Int id, String nome, String email, String sobrenome, Float telefone){
this.nome
this.email
this.sobrenome
this.telefone
this.id
}
public Usuarios (String nome, String email, String sobrenome, Float telefone){
this.nome
this.email
this.sobrenome
this.telefone
}



//getters e setters

public Usuarios(Int id,String nome, String sobrenome, String email, Float telefone) {
        this.nome = nome;
		this.id = id;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
public void setNome(String nome){
this.nome = nome

    }
	public int getId() {
		return id;
	}
      public void setId(int id){
this.id = id
}

	public int getSobrenome() {
		return sobrenome;
	}
      public void setSobrenome(String sobrenome){
           this.sobrenome = sobrenome

	public int getEmail() {

		return email;
	}
       public void setEmail(String email){
           this.email = email

	public int getTelefone() {

		return telefone;
	}
public void setTelefone(Float telefone){
this.telefone= telefone
	
}

// tostring

public String toString() {
       return ?Usuarios [id =? +id ?, nome = +nome + ?, sobrenome =?+sobrenome ?, telefone =?+telefone?]
}