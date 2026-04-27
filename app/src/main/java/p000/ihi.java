package p000;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@nmg(allowedTargets = {EnumC12373rz.f80139a, EnumC12373rz.f80142d, EnumC12373rz.f80129C, EnumC12373rz.f80130F, EnumC12373rz.f80136X})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface ihi {
    Class<? extends Annotation>[] markerClass();
}
