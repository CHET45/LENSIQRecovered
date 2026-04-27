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
@Repeatable(InterfaceC15938a.class)
@Retention(RetentionPolicy.RUNTIME)
@u5d(qualifier = dfb.class)
public @interface z25 {

    /* JADX INFO: renamed from: z25$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @u5d(qualifier = dfb.class)
    public @interface InterfaceC15938a {
        z25[] value();
    }

    String[] value();
}
