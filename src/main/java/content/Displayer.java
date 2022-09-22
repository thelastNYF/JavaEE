package content;

/**
 * @author 24047
 * @date 2022/9/20
 */
public class Displayer implements Output{

    @Override
    public void output() {
        System.out.println("Displayer"+"正在播放");
    }
}
