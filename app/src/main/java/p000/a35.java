package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@aq2(qualifier = dfb.class)
@k18
@Documented
@Repeatable(InterfaceC0037a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface a35 {

    /* JADX INFO: renamed from: a35$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @aq2(qualifier = dfb.class)
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC0037a {
        a35[] value();
    }

    String[] expression();

    boolean result();
}
