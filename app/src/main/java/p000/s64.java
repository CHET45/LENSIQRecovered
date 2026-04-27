package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@j4b
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@nmg(allowedTargets = {EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80140b, EnumC12373rz.f80139a, EnumC12373rz.f80129C})
@i8e(EnumC11189pz.f72537b)
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface s64 {
    int api();

    String message() default "";
}
