public class TestStaff {
    public static void main(String[] args) {
        Staff s1 = new Staff("Eduardo", "São Vicente - SP", "IFSP Cubatão", 3000.00);

        System.out.println(s1.toString());

        s1.setAddress("Santos - SP");
        s1.setSchool("Unisantos");
        s1.setPay(8245.00);

        System.out.println(s1.getAddress());
        System.out.println(s1.getSchool());
        System.out.println(s1.getPay());
    }
}
