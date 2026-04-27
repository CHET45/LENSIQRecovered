package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({})
@nmg(allowedTargets = {})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface gg1 {

    /* JADX INFO: renamed from: gg1$a */
    public enum EnumC6301a {
        ENABLED,
        DISABLED,
        INHERITED
    }

    EnumC6301a enums() default EnumC6301a.INHERITED;

    EnumC6301a uuid() default EnumC6301a.INHERITED;
}
