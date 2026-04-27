package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@nmg(allowedTargets = {EnumC12373rz.f80140b})
@i8e(EnumC11189pz.f72536a)
@Retention(RetentionPolicy.SOURCE)
public @interface bl9 {
    boolean flag() default false;

    boolean open() default false;

    long[] value() default {};
}
