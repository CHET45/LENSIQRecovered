package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD})
@k18
@Repeatable(InterfaceC6141a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface g63 {

    /* JADX INFO: renamed from: g63$a */
    @Target({ElementType.METHOD})
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC6141a {
        g63[] value();
    }

    @vi8
    String value() default "this";
}
