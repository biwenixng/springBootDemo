package com.example.bbbbSys.Study.Annotaion;

import java.lang.annotation.*;

/**
 * @author Administrator
 */
//public @interface MyAnnotation {
//    String[] value() default "abc";
//}
//声明注解生命周期 不声明默认CLASS级别 ，在class文件保留
@Retention(RetentionPolicy.SOURCE)
//申明使用该注解的类型
@Target({ElementType.TYPE})
//使用该注解就会被javaDoc提取到API中  使用少
@Documented
//使注解具备继承性
@Inherited
public @interface MyAnnotation {
    String[] value();
}