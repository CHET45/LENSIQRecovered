package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@aq2(qualifier = tva.class)
@k18
@Documented
@Repeatable(InterfaceC15405a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface y25 {

    /* JADX INFO: renamed from: y25$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @aq2(qualifier = tva.class)
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC15405a {
        y25[] value();
    }

    String[] expression();

    boolean result();

    @skd("value")
    int targetValue() default 0;
}
