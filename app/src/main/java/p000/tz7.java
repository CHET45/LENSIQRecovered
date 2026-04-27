package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({})
@nmg(allowedTargets = {})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface tz7 {

    /* JADX INFO: renamed from: tz7$a */
    public enum EnumC13297a {
        ASC,
        DESC
    }

    String name() default "";

    EnumC13297a[] orders() default {};

    boolean unique() default false;

    String[] value();
}
