package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@ct9
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface hl9 {
    long value();
}
