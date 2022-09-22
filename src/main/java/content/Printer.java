package content;

/**
 * @author 24047
 * @date 2022/9/20
 */
public class Printer implements Output{

    @Override
    public void output() {
        System.out.println("Printer"+"正在打印");
    }
}
