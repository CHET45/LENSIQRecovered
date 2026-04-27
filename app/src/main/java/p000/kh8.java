package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface kh8 {
    boolean deserialize() default true;

    String format() default "";

    String name() default "";

    int ordinal() default 0;

    rp5[] parseFeatures() default {};

    boolean serialize() default true;

    a2f[] serialzeFeatures() default {};
}
