package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.i5e;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@i5e(level = i5e.EnumC7153a.f45800a, message = "Inheriting from this kotlinx.coroutines API is unstable. Either new methods may be added in the future, which would break the inheritance, or correctly inheriting from it requires fulfilling contracts that may change in the future.")
@nmg(allowedTargets = {EnumC12373rz.f80139a})
@Retention(RetentionPolicy.RUNTIME)
public @interface zg5 {
}
