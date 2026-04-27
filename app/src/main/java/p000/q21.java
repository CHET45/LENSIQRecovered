package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD})
public @interface q21 {
    boolean requireAll() default true;

    String[] value();
}
