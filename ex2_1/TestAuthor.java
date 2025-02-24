package ex2_1;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck= new Author("Tan Ah Teck", "nguyenle2005dangkhoa@gmail.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("khoanld.23ai@vku.udn.vn");
        System.out.println("name is: "+ahTeck.getName());
        System.out.println("email is: "+ahTeck.getEmail());
        System.out.println("gender is: "+ahTeck.getGender());

    }
}
