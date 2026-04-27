package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@nmg(allowedTargets = {EnumC12373rz.f80130F, EnumC12373rz.f80145m, EnumC12373rz.f80143e, EnumC12373rz.f80139a})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface olh {
    gg1 builtInTypeConverters() default @gg1;

    Class<?>[] value() default {};
}
