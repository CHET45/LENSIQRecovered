package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@j4b
@Target({ElementType.TYPE, ElementType.TYPE_USE})
@nmg(allowedTargets = {EnumC12373rz.f80142d, EnumC12373rz.f80139a, EnumC12373rz.f80133M})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface x0f {
    Class<? extends lp8<?>> with() default lp8.class;
}
