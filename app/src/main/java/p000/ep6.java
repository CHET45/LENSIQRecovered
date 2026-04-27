package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontScaling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingLinear\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
@p7e({p7e.EnumC10826a.f69935b})
@vw7
public interface ep6 {

    /* JADX INFO: renamed from: ep6$a */
    public static final class C5430a {
        @f0g
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m28832toDpGaN1DYA(@yfb ep6 ep6Var, long j) {
            return ep6.super.m28830toDpGaN1DYA(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m28833toSp0xMU5do(@yfb ep6 ep6Var, float f) {
            return ep6.super.m28831toSp0xMU5do(f);
        }
    }

    float getFontScale();

    @f0g
    /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
    default float m28830toDpGaN1DYA(long j) {
        if (lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(j), lwg.f59101b.m30923getSpUIouoOA())) {
            return kn4.m30705constructorimpl(jwg.m30613getValueimpl(j) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @f0g
    /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
    default long m28831toSp0xMU5do(float f) {
        return kwg.getSp(f / getFontScale());
    }
}
