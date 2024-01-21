package java.com.itheima;

import java.com.itheima.service.BookService;
import java.com.itheima.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
