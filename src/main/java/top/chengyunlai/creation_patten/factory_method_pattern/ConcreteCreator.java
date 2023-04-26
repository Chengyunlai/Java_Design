package top.chengyunlai.creation_patten.factory_method_pattern;

/**
 * @ClassName
 * @Description 具体工厂
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ConcreteCreator implements Creator{
    @Override
    public <T extends Product> T factory(Class<T> c) {
        Product product = null;
        try {
             product = (Product) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) product;
    }
}
