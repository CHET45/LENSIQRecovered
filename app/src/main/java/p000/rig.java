package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@bmh(applicableTo = CharSequence.class)
public @interface rig {
    String value();

    oki when() default oki.ALWAYS;
}
