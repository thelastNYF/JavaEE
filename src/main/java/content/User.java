package content;

/**
 * @author 24047
 * @date 2022/9/20
 * 用于测试项目是否能够正常运作
 */

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("my name is: "+name);
    }
}
