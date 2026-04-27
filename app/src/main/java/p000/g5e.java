package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@o7d(qualifier = dfb.class)
@Documented
@Repeatable(InterfaceC6135a.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface g5e {

    /* JADX INFO: renamed from: g5e$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @o7d(qualifier = dfb.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC6135a {
        g5e[] value();
    }

    String[] value();
}
