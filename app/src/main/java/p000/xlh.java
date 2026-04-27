package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.wgc;

/* JADX INFO: loaded from: classes7.dex */
@a2e
@Target({ElementType.TYPE})
@nmg(allowedTargets = {EnumC12373rz.f80139a, EnumC12373rz.f80142d})
@i8e(EnumC11189pz.f72536a)
@Repeatable(InterfaceC15188a.class)
@Retention(RetentionPolicy.SOURCE)
public @interface xlh<T, P extends wgc<? super T>> {

    /* JADX INFO: renamed from: xlh$a */
    @Target({ElementType.TYPE})
    @nmg(allowedTargets = {EnumC12373rz.f80139a, EnumC12373rz.f80142d})
    @b2e
    @i8e(EnumC11189pz.f72536a)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15188a {
        xlh[] value();
    }
}
