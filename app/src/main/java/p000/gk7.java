package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@o7d(qualifier = qh9.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface gk7 {
    String[] value();
}
