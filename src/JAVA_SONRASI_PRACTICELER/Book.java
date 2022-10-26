package JAVA_SONRASI_PRACTICELER;

public class Book {
    public String name;
    public int pageNumber;
    public String author;
    public String publisher;
    public double price;

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Seker Portakali";
        book1.author = "Jose Mauro de Vasconcelos";
        book1.pageNumber = 180;
        book1.price = 25;
        book1.publisher = "Can Yayinlari";
       // Book book2 = new Book("Kiraz Mesimi","Mirac", 145, 20,"Can yayinlari");

      /*  Java Encapsulation aslında java sınıfı içerisinde tanımladığımız değişkenlerimizi
        korumak veya saklamak anlamına gelmektedir. Tanımladığımız bir
        sınıf içerisindeki değişkenin direk olarak değiştirilememesi,
        bunun yerine bizim izin verdiğimiz ölçüde, metotlar aracılığıyla
        değiştirilmesi gerekmektedir. Bir değişkene sadece okuma yetkisi
        verebilir, sadece yazma yetkisi verebilir veya hem okuma hem yazma
        yetkisi verebiliriz.

       */




    }
}
