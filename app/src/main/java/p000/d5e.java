package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@o7d(qualifier = no1.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface d5e {

    /* JADX INFO: renamed from: d5e$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC4619a {
        d5e[] value();
    }

    @skd("value")
    String[] methods();

    String[] value();
}
