package foo.bar;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(foo.bar.CDPlayerConfig.class);

        CompactDisc player = (CompactDisc) context.getBean("sgtPeppers");
        player.play();

        int cnt = context.getBeanDefinitionCount();


        System.out.println(cnt);

    }
}
