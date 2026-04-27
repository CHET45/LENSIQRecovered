package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@k18
@Documented
@Repeatable(InterfaceC14365a.class)
@Retention(RetentionPolicy.RUNTIME)
@u5d(qualifier = qh9.class)
public @interface w25 {

    /* JADX INFO: renamed from: w25$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @u5d(qualifier = qh9.class)
    public @interface InterfaceC14365a {
        w25[] value();
    }

    String[] value();
}
