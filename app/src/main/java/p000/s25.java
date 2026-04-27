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
@Repeatable(InterfaceC12407a.class)
@Retention(RetentionPolicy.RUNTIME)
@u5d(qualifier = sq8.class)
public @interface s25 {

    /* JADX INFO: renamed from: s25$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @u5d(qualifier = sq8.class)
    public @interface InterfaceC12407a {
        s25[] value();
    }

    @vi8
    @skd("value")
    String[] map();

    String[] value();
}
