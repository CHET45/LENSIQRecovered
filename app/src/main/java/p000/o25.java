package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Repeatable(InterfaceC10148a.class)
@u5d(qualifier = no1.class)
public @interface o25 {

    /* JADX INFO: renamed from: o25$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @k18
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC10148a {
        o25[] value();
    }

    @skd("value")
    String[] methods();

    String[] value();
}
