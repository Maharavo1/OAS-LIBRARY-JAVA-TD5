import Test.AuthorCrudTest;

import static Test.AuthorCrudTest.AuthorTest;
import static Test.BookCrudTest.BookTest;
import static Test.SubscribersCrudTest.SubscribersTest;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AuthorTest();
        BookTest();
        SubscribersTest()
    }
}