package top.chengyunlai.uml.aggregation;

import top.chengyunlai.uml.class_.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Company company = new Company();
        company.setPerson(person);
    }
}
