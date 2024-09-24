public class Teste {
    public static void main(String[] args){
        Author a1 = new Author("Eduardo", "eduardo@ifsp.edu", 'm');
        System.out.println(a1.toString());
        System.out.println("O nome do(a) Autor(a) é: " + a1.getNome() + ", seu email de contato é: "+ a1.getEmail() + ", e seu gênero é: " + a1.getGender());
        a1.setEmail("cauanbarros@ifsp.edu.br");
        System.out.println("Email alterado para: " + a1.getEmail());

        Author a2 = new Author("Fernanda","fernanda@ifsp.edu", 'f');
        System.out.println(a2.toString());
        System.out.println("O nome do(a) Autor(a) é: " + a2.getNome() + ", seu email de contato é: "+ a2.getEmail() + ", e seu gênero é: " + a2.getGender());
        a2.setEmail("marcella@ifsp.edu.br");
        System.out.println("Email alterado para: " + a2.getEmail());
    }
}
