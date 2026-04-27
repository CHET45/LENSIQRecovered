package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.i5e;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@i5e(level = i5e.EnumC7153a.f45800a, message = "This is a kotlinx.coroutines API that is not intended to be inherited from, as the library may handle predefined instances of this in a special manner. This will be an error in a future release. If you need to inherit from this, please describe your use case in https://github.com/Kotlin/kotlinx.coroutines/issues, so that we can provide a stable API for inheritance. ")
@nmg(allowedTargets = {EnumC12373rz.f80139a})
@Retention(RetentionPolicy.RUNTIME)
public @interface na8 {
}
