package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@j4b
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@nmg(allowedTargets = {EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80145m, EnumC12373rz.f80143e, EnumC12373rz.f80144f, EnumC12373rz.f80140b})
@i8e(EnumC11189pz.f72537b)
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface y46 {
    double from() default Double.NEGATIVE_INFINITY;

    boolean fromInclusive() default true;

    /* JADX INFO: renamed from: to */
    double m25645to() default Double.POSITIVE_INFINITY;

    boolean toInclusive() default true;
}
