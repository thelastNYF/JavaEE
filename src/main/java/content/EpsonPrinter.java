package content;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

/**
 * @author 24047
 * @date 2022/9/20
 */
@AllArgsConstructor
@NoArgsConstructor
@Configuration
public class EpsonPrinter extends Printer{
    public String msg;//打印的内容
    public String model;//型号

    @Override
    public void output() {
        System.out.println(msg+"\n我的型号是： "+model);
    }
}