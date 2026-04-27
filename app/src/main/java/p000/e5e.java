package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@j4b
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
@a2e
@nmg(allowedTargets = {EnumC12373rz.f80140b, EnumC12373rz.f80139a, EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80129C, EnumC12373rz.f80143e, EnumC12373rz.f80135Q})
@i8e(EnumC11189pz.f72537b)
@Documented
@Repeatable(InterfaceC5127a.class)
public @interface e5e {

    /* JADX INFO: renamed from: e5e$a */
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @nmg(allowedTargets = {EnumC12373rz.f80140b, EnumC12373rz.f80139a, EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80129C, EnumC12373rz.f80143e, EnumC12373rz.f80135Q})
    @b2e
    @i8e(EnumC11189pz.f72537b)
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC5127a {
        e5e[] value();
    }

    int extension();

    int version();
}
