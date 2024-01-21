package java.com.itheima.service.impl;

import java.com.itheima.dao.BookDao;
import java.com.itheima.dao.impl.BookDaoImpl;
import java.com.itheima.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();
    public void save(){
        System.out.println("book service save ...");
    }
}
