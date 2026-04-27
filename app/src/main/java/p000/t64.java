package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@j4b
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@jjf(version = "1.4")
@nmg(allowedTargets = {EnumC12373rz.f80139a, EnumC12373rz.f80130F, EnumC12373rz.f80142d, EnumC12373rz.f80140b, EnumC12373rz.f80129C, EnumC12373rz.f80132L, EnumC12373rz.f80131H, EnumC12373rz.f80136X})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface t64 {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}
