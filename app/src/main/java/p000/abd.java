package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface abd {
    int limit() default Integer.MAX_VALUE;

    Class<? extends bbd<?>> provider();
}
