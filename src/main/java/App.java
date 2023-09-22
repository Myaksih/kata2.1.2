import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");

        ApplicationContext applicationContext2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat = (Cat) applicationContext2.getBean("cat");

        System.out.println(bean.equals(bean1));
        System.out.println(bean.equals(beanCat));

    }
}