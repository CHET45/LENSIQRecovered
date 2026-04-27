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
@k18
@Documented
@Repeatable(InterfaceC13321a.class)
@Retention(RetentionPolicy.RUNTIME)
@u5d(qualifier = kt8.class)
public @interface u25 {

    /* JADX INFO: renamed from: u25$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @u5d(qualifier = kt8.class)
    public @interface InterfaceC13321a {
        u25[] value();
    }

    @vi8
    @skd(ymh.InterfaceC15724c.f102156R)
    String[] offset() default {};

    @vi8
    @skd("value")
    String[] targetValue();

    @vi8
    String[] value();
}
