import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat bean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        System.out.println("Сравниваем пары бинов по ссылке" + " " + (bean == bean1) + " " + (bean2 == bean3));
        System.out.println(bean);
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean3);

    }

}