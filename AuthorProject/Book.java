public class Book {
    private Author authors[];
    private String name;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }


    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        String authorsString = "";
        for (Author author : authors) {
            authorsString += author.toString() + ",";
        }
        return "Book[name=" + name + ",authors={" + authorsString + "},price=" + price + ",qty=" + qty + "]";
    }
}
