package top.chengyunlai.creation_patten.factory_method_pattern;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factory(ConcereteProduct.class);
    }
}
