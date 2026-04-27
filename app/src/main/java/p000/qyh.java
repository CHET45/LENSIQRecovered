package p000;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@q64(message = "This annotation has been replaced by `@OptIn`", replaceWith = @i2e(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
@nmg(allowedTargets = {EnumC12373rz.f80139a, EnumC12373rz.f80142d, EnumC12373rz.f80144f, EnumC12373rz.f80145m, EnumC12373rz.f80129C, EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80135Q, EnumC12373rz.f80136X})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface qyh {
    Class<? extends Annotation>[] markerClass();
}
