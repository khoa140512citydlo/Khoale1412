package ex2_1;

public class TestBook {
    public static void main(String[] args) {
        Author ahTeck = new Author("Nguyen Le Dang Khoa", "nguyenle2005dangkhoa@gmail.com", 'm');
        System.out.println(ahTeck);

        Book dummyBook = new Book("java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("author is: " + dummyBook.getAuthor());
        System.out.println("author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook=new Book("more java",new Author("Nguyen Le Dang Khoa", "khoanld.23ai@vku.udn.vn", 'm'), 29.95, 100);
        System.out.println(anotherBook);

    }
}
