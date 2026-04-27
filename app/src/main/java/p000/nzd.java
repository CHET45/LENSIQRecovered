package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@nmg(allowedTargets = {EnumC12373rz.f80139a})
@i8e(EnumC11189pz.f72537b)
@Repeatable(InterfaceC10124a.class)
@Retention(RetentionPolicy.CLASS)
public @interface nzd {

    /* JADX INFO: renamed from: nzd$a */
    @Target({ElementType.TYPE})
    @nmg(allowedTargets = {EnumC12373rz.f80139a})
    @i8e(EnumC11189pz.f72537b)
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC10124a {
        nzd[] value();
    }

    String fromTableName();

    String toTableName();
}
