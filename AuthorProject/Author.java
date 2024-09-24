public class Author {
    private String nome;
    private String email;
    private char gender; //m or f

    public Author(String nome, String email, char gender){
        this.nome = nome;
        this.email = email;
        this.gender = gender;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }
    public char getGender() {
        return gender;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Author[name=" + nome + ",email=" + email + ",gender=" + gender + "]";
    }


}

