package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@aq2(qualifier = qh9.class)
@k18
@Documented
@Repeatable(InterfaceC14884a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface x25 {

    /* JADX INFO: renamed from: x25$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @aq2(qualifier = qh9.class)
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC14884a {
        x25[] value();
    }

    String[] expression();

    boolean result();
}
