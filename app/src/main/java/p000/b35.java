package p000;

import java.lang.annotation.Annotation;
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
@Repeatable(InterfaceC1716a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface b35 {

    /* JADX INFO: renamed from: b35$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1716a {
        b35[] value();
    }

    String[] expression();

    Class<? extends Annotation> qualifier();
}
