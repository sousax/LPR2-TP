public class TestBook {
    public static void main(String[] args) {
        //Dupla: Eduardo Miranda e Cauã Barros
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');


        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);

        System.out.println(testeBook);

        System.out.println("Nome: " + testeBook.getName());
        System.out.println("Preço: " + testeBook.getPrice());
        System.out.println("Quantidade: " + testeBook.getQty());
        for (Author author : testeBook.getAuthors()) {
            System.out.println(author);
        }

        testeBook.setPrice(29.99);
        testeBook.setQty(50);
        System.out.println("Preço atualizado: " + testeBook.getPrice());
        System.out.println("Quantidade atualizada: " + testeBook.getQty());
}}
