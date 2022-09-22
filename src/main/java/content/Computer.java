package content;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 24047
 * @date 2022/9/20
 */
@Getter
@Setter
public class Computer {
    private Displayer myDisplayer;
    private Printer myPrinter;

    public void display(){
        myDisplayer.output();
    }

    public void print(){
        myPrinter.output();
    }

}
