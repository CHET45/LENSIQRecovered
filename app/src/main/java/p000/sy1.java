package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@j4b
@Target({ElementType.FIELD, ElementType.METHOD})
@nmg(allowedTargets = {EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80143e})
@i8e(EnumC11189pz.f72537b)
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface sy1 {
    int api() default -1;

    String codename() default "";

    int extension() default 0;

    int lambda() default -1;

    int parameter() default -1;
}
