public class TestStudent {
    public static void main(String[] args) {
        Student a1 = new Student("Cauã", "Cubatão - SP", "Java", 2021, 7.25);

        System.out.println(a1.toString());

        a1.setAddress("Cubatão - SP");
        a1.setProgram("Cobbol");
        a1.setYear(2024);
        a1.setFee(10.00);

        System.out.println(a1.getAddress());
        System.out.println(a1.getProgram());
        System.out.println(a1.getYear());
        System.out.println(a1.getFee());
    }
}
