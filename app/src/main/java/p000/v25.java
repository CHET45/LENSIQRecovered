package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.ymh;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@aq2(qualifier = kt8.class)
@k18
@Documented
@Repeatable(InterfaceC13820a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface v25 {

    /* JADX INFO: renamed from: v25$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @aq2(qualifier = kt8.class)
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC13820a {
        v25[] value();
    }

    String[] expression();

    @vi8
    @skd(ymh.InterfaceC15724c.f102156R)
    String[] offset() default {};

    boolean result();

    @vi8
    @skd("value")
    String[] targetValue();
}
