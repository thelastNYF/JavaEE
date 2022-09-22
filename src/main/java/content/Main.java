package content;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 24047
 * @date 2022/9/20
 */
@Configuration
@ComponentScan("content")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(Main.class);
//        获取beanDefinition
//        for (String beanDefinitionName:applicationContext.getBeanDefinitionNames())
//        {
//            System.out.println(beanDefinitionName);
//        }
        DellDisplayer myDisplayer=(DellDisplayer) applicationContext.getBean("dellDisplayerFactoryBean");
        PrinterFactory myPrinterFactory=(PrinterFactory)applicationContext.getBean("printerFactory");
        HPPrinter myPrinter=myPrinterFactory.getHPPrinter();
        LenovoComputer myComputer =(LenovoComputer) applicationContext.getBean("lenovoComputer");
        System.out.println("开始工作");
        myComputer.setMyDisplayer(myDisplayer);
        myComputer.setMyPrinter(myPrinter);
        myComputer.work();
        System.out.println("结束工作");
//        DellDisplayer myDisplayer=(DellDisplayer) applicationContext.getBean("dellDisplayerFactoryBean");
//        myDisplayer.output();
    }
}
