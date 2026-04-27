package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@nmg(allowedTargets = {EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80129C})
@i8e(EnumC11189pz.f72536a)
@Retention(RetentionPolicy.SOURCE)
public @interface gzg {
    Class<? extends Throwable>[] exceptionClasses();
}
