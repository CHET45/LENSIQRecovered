package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@aq2(qualifier = no1.class)
@k18
@Documented
@Repeatable(InterfaceC10761a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface p25 {

    /* JADX INFO: renamed from: p25$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @aq2(qualifier = no1.class)
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC10761a {
        p25[] value();
    }

    String[] expression();

    @skd("value")
    String[] methods();

    boolean result();
}
