package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({})
@nmg(allowedTargets = {})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface dn8 {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}
