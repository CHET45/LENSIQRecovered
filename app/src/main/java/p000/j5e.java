package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@j4b
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@nmg(allowedTargets = {EnumC12373rz.f80140b, EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80129C, EnumC12373rz.f80143e, EnumC12373rz.f80145m})
@i8e(EnumC11189pz.f72537b)
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface j5e {

    /* JADX INFO: renamed from: j5e$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @nmg(allowedTargets = {EnumC12373rz.f80143e, EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80145m})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC7744a {
        j5e value() default @j5e;
    }

    /* JADX INFO: renamed from: j5e$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @nmg(allowedTargets = {EnumC12373rz.f80143e, EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80145m})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC7745b {
        j5e value() default @j5e;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
