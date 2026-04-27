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
@Documented
@Repeatable(InterfaceC8204a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface k5e {

    /* JADX INFO: renamed from: k5e$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC8204a {
        k5e[] value();
    }

    String[] expression();

    Class<? extends Annotation> qualifier();
}
