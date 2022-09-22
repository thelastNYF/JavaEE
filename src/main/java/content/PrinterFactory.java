package content;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 24047
 * @date 2022/9/20
 */
@Component
public class PrinterFactory {
    @Bean
    public HPPrinter getHPPrinter(){
    System.out.println("before HPPrinter()....................");
    HPPrinter hpPrinter=new HPPrinter("滴滴滴，我是惠普打印机","hp36412897");
    System.out.println("after HPPrinter()....................");
    return hpPrinter;


}
    @Bean
    public EpsonPrinter getEpsonPrinter(){
        System.out.println("before EpsonPrinter()....................");
        EpsonPrinter epsonPrinter=new EpsonPrinter("滴滴滴，我是易普森打印机","epson36412897");
        System.out.println("after EpsonPrinter()....................");
        return epsonPrinter;
    }
}
