package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@afg({muh.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface g78 {
    long from() default Long.MIN_VALUE;

    /* JADX INFO: renamed from: to */
    long m11421to() default Long.MAX_VALUE;
}
