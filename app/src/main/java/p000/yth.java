package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@afg({})
@hv3({pmh.LOCAL_VARIABLE, pmh.RESOURCE_VARIABLE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface yth {
    Class<?> value() default Object.class;
}
