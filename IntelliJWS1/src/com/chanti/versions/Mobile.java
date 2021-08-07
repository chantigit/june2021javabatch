package com.chanti.versions;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Mobile
{
    String version() default "OppoF5";
    int ram() default 2;
    int rom() default 64;
    float cost() default 10000;
}
