package content;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author 24047
 * @date 2022/9/20
 */
@Component
@AllArgsConstructor
public class LenovoComputer extends Computer{
//    其实应该在这里做依赖注入，使用@Qualifier
    public LenovoComputer(@Qualifier Displayer displayer,@Qualifier Printer printer){
        this.setMyDisplayer(displayer);
        this.setMyPrinter(printer);
    }
//    写在变量上用的是反射，写在方法上是……
    public void work(){
        this.display();
        this.print();
    }

}
