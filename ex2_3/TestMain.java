package ex2_3;

public class TestMain {
    public static void main(String[] args) {
        Author a1=new Author("Nguyen Le Dang Khoa","nguyenle2005dangkhoa@gmail.com");
        System.out.println(a1);

        a1.setEmail("nguyenle2005dangkhoa@gmail.com");
        System.out.println(a1);
        System.out.println("Email: "+a1.getEmail());
        System.out.println("Name: "+a1.getName());

        Book b1=new Book("12345", "Java for dummies",a1,8.8,88);
        System.out.println(b1);

        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn: "+b1.getIsbn());
        System.out.println("name: "+b1.getName());
        System.out.println("price: "+b1.getPrice());
        System.out.println("qty: "+b1.getQty());

        System.out.println("author: "+b1.getAuthor());
        System.out.println("author's name: "+b1.getAuthorName());
        System.out.println("author's name: "+b1.getAuthor().getName());
        System.out.println("author's email: "+b1.getAuthor().getEmail());
    }
}
