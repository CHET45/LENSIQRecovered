package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@afg({n4b.class})
@hv3({pmh.EXCEPTION_PARAMETER, pmh.UPPER_BOUND})
@Retention(RetentionPolicy.RUNTIME)
@ry3
public @interface l4b {
    String[] value() default {};
}
