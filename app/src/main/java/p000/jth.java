package p000;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface jth {
    u9d prefix() default u9d.one;

    Class<? extends Annotation> quantity();
}
