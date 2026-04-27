package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@jjf(version = "1.2")
@Retention(RetentionPolicy.SOURCE)
@a2e
@nmg(allowedTargets = {EnumC12373rz.f80139a, EnumC12373rz.f80130F, EnumC12373rz.f80142d, EnumC12373rz.f80129C, EnumC12373rz.f80136X})
@i8e(EnumC11189pz.f72536a)
@Repeatable(InterfaceC12435a.class)
public @interface s4e {

    /* JADX INFO: renamed from: s4e$a */
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @nmg(allowedTargets = {EnumC12373rz.f80139a, EnumC12373rz.f80130F, EnumC12373rz.f80142d, EnumC12373rz.f80129C, EnumC12373rz.f80136X})
    @b2e
    @i8e(EnumC11189pz.f72536a)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12435a {
        s4e[] value();
    }

    int errorCode() default -1;

    u64 level() default u64.f86866b;

    String message() default "";

    String version();

    t4e versionKind() default t4e.f83713a;
}
