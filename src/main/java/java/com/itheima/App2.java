package java.com.itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.com.itheima.service.BookService;

public class App2 {
    public static void main(String[] args) {
        // access to IoC container
        // 获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取资源
        BookService bookservice = (BookService) ctx.getBean('bookService');


    }
}
