package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,141:1\n26#2:142\n26#2:144\n1#3:143\n168#4:145\n168#4:146\n482#4:147\n198#5:148\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n69#1:142\n86#1:144\n92#1:145\n102#1:146\n125#1:147\n135#1:148\n*E\n"})
@vw7
public interface c64 extends dp6 {

    /* JADX INFO: renamed from: c64$a */
    public static final class C2211a {
        @f0g
        public static /* synthetic */ void getDensity$annotations() {
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m28210roundToPxR2X_6o(@yfb c64 c64Var, long j) {
            return c64.super.mo27166roundToPxR2X_6o(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m28211roundToPx0680j_4(@yfb c64 c64Var, float f) {
            return c64.super.mo27167roundToPx0680j_4(f);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m28212toDpGaN1DYA(@yfb c64 c64Var, long j) {
            return c64.super.mo27168toDpGaN1DYA(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m28214toDpu2uoSUM(@yfb c64 c64Var, int i) {
            return c64.super.mo27170toDpu2uoSUM(i);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m28215toDpSizekrfVVM(@yfb c64 c64Var, long j) {
            return c64.super.mo27171toDpSizekrfVVM(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m28216toPxR2X_6o(@yfb c64 c64Var, long j) {
            return c64.super.mo27172toPxR2X_6o(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m28217toPx0680j_4(@yfb c64 c64Var, float f) {
            return c64.super.mo27173toPx0680j_4(f);
        }

        @f0g
        @yfb
        @Deprecated
        public static rud toRect(@yfb c64 c64Var, @yfb on4 on4Var) {
            return c64.super.toRect(on4Var);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m28218toSizeXkaWNTQ(@yfb c64 c64Var, long j) {
            return c64.super.mo27174toSizeXkaWNTQ(j);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m28219toSp0xMU5do(@yfb c64 c64Var, float f) {
            return c64.super.mo27175toSp0xMU5do(f);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m28221toSpkPz2Gy4(@yfb c64 c64Var, int i) {
            return c64.super.mo27177toSpkPz2Gy4(i);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m28213toDpu2uoSUM(@yfb c64 c64Var, float f) {
            return c64.super.mo27169toDpu2uoSUM(f);
        }

        @f0g
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m28220toSpkPz2Gy4(@yfb c64 c64Var, float f) {
            return c64.super.mo27176toSpkPz2Gy4(f);
        }
    }

    float getDensity();

    @f0g
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    default int mo27166roundToPxR2X_6o(long j) {
        return Math.round(mo27172toPxR2X_6o(j));
    }

    @f0g
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    default int mo27167roundToPx0680j_4(float f) {
        float fMo27173toPx0680j_4 = mo27173toPx0680j_4(f);
        if (Float.isInfinite(fMo27173toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo27173toPx0680j_4);
    }

    @f0g
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo27170toDpu2uoSUM(int i) {
        return kn4.m30705constructorimpl(i / getDensity());
    }

    @f0g
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo27171toDpSizekrfVVM(long j) {
        return j != j28.f49422d ? mn4.m30998DpSizeYgX7TsA(mo27169toDpu2uoSUM(wpf.m33069getWidthimpl(j)), mo27169toDpu2uoSUM(wpf.m33066getHeightimpl(j))) : pn4.f71480b.m31824getUnspecifiedMYxV2XQ();
    }

    @f0g
    /* JADX INFO: renamed from: toPx--R2X_6o */
    default float mo27172toPxR2X_6o(long j) {
        if (lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(j), lwg.f59101b.m30923getSpUIouoOA())) {
            return mo27173toPx0680j_4(mo27168toDpGaN1DYA(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @f0g
    /* JADX INFO: renamed from: toPx-0680j_4 */
    default float mo27173toPx0680j_4(float f) {
        return f * getDensity();
    }

    @f0g
    @yfb
    default rud toRect(@yfb on4 on4Var) {
        return new rud(mo27173toPx0680j_4(on4Var.m31507getLeftD9Ej5fM()), mo27173toPx0680j_4(on4Var.m31509getTopD9Ej5fM()), mo27173toPx0680j_4(on4Var.m31508getRightD9Ej5fM()), mo27173toPx0680j_4(on4Var.m31506getBottomD9Ej5fM()));
    }

    @f0g
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo27174toSizeXkaWNTQ(long j) {
        return j != j28.f49422d ? eqf.Size(mo27173toPx0680j_4(pn4.m31815getWidthD9Ej5fM(j)), mo27173toPx0680j_4(pn4.m31813getHeightD9Ej5fM(j))) : wpf.f95046b.m33077getUnspecifiedNHjbRc();
    }

    @f0g
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo27177toSpkPz2Gy4(int i) {
        return mo27175toSp0xMU5do(mo27170toDpu2uoSUM(i));
    }

    @f0g
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo27176toSpkPz2Gy4(float f) {
        return mo27175toSp0xMU5do(mo27169toDpu2uoSUM(f));
    }

    @f0g
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo27169toDpu2uoSUM(float f) {
        return kn4.m30705constructorimpl(f / getDensity());
    }
}
