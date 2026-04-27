package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@aq2(qualifier = sq8.class)
@k18
@Documented
@Repeatable(InterfaceC12862a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface t25 {

    /* JADX INFO: renamed from: t25$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @aq2(qualifier = sq8.class)
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC12862a {
        t25[] value();
    }

    String[] expression();

    @vi8
    @skd("value")
    String[] map();

    boolean result();
}
