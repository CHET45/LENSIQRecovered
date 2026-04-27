package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@sg5
@nmg(allowedTargets = {EnumC12373rz.f80130F, EnumC12373rz.f80129C})
@Retention(RetentionPolicy.RUNTIME)
public @interface fm3 {
    /* JADX INFO: renamed from: id */
    long m10987id();

    String name();
}
