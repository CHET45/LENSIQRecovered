package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes5.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@gd7
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface gd7 {
    boolean emulated() default false;

    boolean serializable() default false;
}
