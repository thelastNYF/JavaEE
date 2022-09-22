package content;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 24047
 * @date 2022/9/20
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DellDisplayer extends Displayer{
    public String msg;//打印的内容
    public String model;//型号

    @Override
    public void output() {
        System.out.println(msg+"\nMy model is: "+model);
    }
}
