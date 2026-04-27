package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@fl2
@Retention(RetentionPolicy.RUNTIME)
@a2e
@nmg(allowedTargets = {EnumC12373rz.f80139a})
@i8e(EnumC11189pz.f72538c)
@Repeatable(InterfaceC7707a.class)
public @interface j07 {

    /* JADX INFO: renamed from: j07$a */
    @Target({ElementType.TYPE})
    @nmg(allowedTargets = {EnumC12373rz.f80139a})
    @b2e
    @i8e(EnumC11189pz.f72538c)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC7707a {
        j07[] value();
    }

    int endOffset();

    int key();

    int startOffset();
}
