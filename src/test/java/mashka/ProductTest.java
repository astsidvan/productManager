package mashka;
import Repository.ProductRepository;
import domein.Product;
import domein.Book;
import domein.Smartphone;
import Manager.ProductManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ProductTest {

    ProductManager product = new ProductManager(new ProductRepository());
    ProductRepository repo = new ProductRepository();

    Book book1 = new Book(1, "Harry", 10,  "Sem" );
    Book book2 = new Book(2, "Game Of trones", 20,  "Martin" );
    Book book3 = new Book(3, "Harry ad Proekt", 30,  "Find" );

    Smartphone phone1 = new Smartphone(4, "Xiomi", 40, "kitae");
    Smartphone phone2 = new Smartphone(5, "Harry", 50, "Kitae");
    Smartphone phone3 = new Smartphone(6, "ipfone", 60, "Russia");


    @Test
    public void test1 (){

        product.add(book1);
        product.add(book2);
        product.add(book3);
        Product[] expected = {book1 , book3};
        Product[] actual = product.searchBy( "Harry");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2 (){

        product.add(phone1);
        product.add(phone2);
        product.add(phone3);
        Product[] expected = {phone3};
        Product[] actual = product.searchBy("ipfone");
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void test3 (){

        product.add(book1);
        product.add(book2);
        product.add(book3);
        product.add(phone1);
        product.add(phone2);
        Product[] expected = {book1,book3, phone2};
        Product[] actual = product.searchBy( "Harry");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4(){

        product.add(book1);
        product.add(book2);
        product.add(book3);
        product.add(phone1);
        product.add(phone2);
        product.add(phone3);


        Product[] expected = {book1,book2,book3,phone1,phone2,phone3};
        Product[] actual = product.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void test5(){

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);
        repo.add(phone2);
        repo.add(phone3);


        Product[] expected = {book1,book3,phone1,phone2,phone3};
        Product[] actual = repo.removeId(2);
        Assertions.assertArrayEquals(expected, actual);

    }



}
