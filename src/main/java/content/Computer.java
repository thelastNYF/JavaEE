package content;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
