package java.com.itheima.dao.impl;

import java.com.itheima.dao.BookDao;
//import java.com.itheima.service.BookService;

public class BookDaoImpl implements BookDao {

    // 删除业务层中使用new的方式创建的Dao对象
    //private BookDao bookDao = new BookDaoImpl();
    private BookDao  ;

    public void save(){
        System.out.println("");
    }

    // 提供对应的set方法
    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }

}
