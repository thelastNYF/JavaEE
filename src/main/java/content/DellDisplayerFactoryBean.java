package content;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 24047
 * @date 2022/9/20
 */
@Configuration
public class DellDisplayerFactoryBean extends AbstractFactoryBean<DellDisplayer> {

    @Override
    public Class<?> getObjectType() {
        return DellDisplayer.class;
    }

    @Override
    protected DellDisplayer createInstance() throws Exception {
        System.out.println("creating DellDisplayer....................");
        DellDisplayer displayer=new DellDisplayer("Hello，I am DellDisplayer","U2520DR");
//        System.out.println("after creating....................");
        return displayer;
    }
}
