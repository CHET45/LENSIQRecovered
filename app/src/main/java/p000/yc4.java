package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@j4b
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@nmg(allowedTargets = {EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80145m, EnumC12373rz.f80143e, EnumC12373rz.f80144f, EnumC12373rz.f80140b})
@i8e(EnumC11189pz.f72537b)
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface yc4 {

    /* JADX INFO: renamed from: w */
    @yfb
    public static final C15613a f101086w = C15613a.f101090a;

    /* JADX INFO: renamed from: x */
    public static final int f101087x = 0;

    /* JADX INFO: renamed from: y */
    public static final int f101088y = 1;

    /* JADX INFO: renamed from: z */
    public static final int f101089z = 2;

    /* JADX INFO: renamed from: yc4$a */
    public static final class C15613a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C15613a f101090a = new C15613a();

        /* JADX INFO: renamed from: b */
        public static final int f101091b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f101092c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f101093d = 2;

        private C15613a() {
        }
    }

    int unit() default 1;
}
