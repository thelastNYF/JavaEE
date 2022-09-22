package content;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Component;

/**
 * @author 24047
 * @date 2022/9/20
 */
@Component
@AllArgsConstructor
public class LenovoComputer extends Computer{
    public void work(){
        this.display();
        this.print();
    }

}
