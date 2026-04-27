package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface hc0 {

    /* JADX INFO: renamed from: hc0$a */
    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6791a {
        int mask() default 0;

        @efb
        String name();

        int value();
    }

    @efb
    InterfaceC6791a[] intMapping() default {};

    @efb
    String value();
}
