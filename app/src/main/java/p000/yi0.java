package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@nmg(allowedTargets = {EnumC12373rz.f80139a})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface yi0 {
    int from();

    Class<?> spec() default Object.class;

    /* JADX INFO: renamed from: to */
    int m26082to();
}
