package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,545:1\n653#2,24:546\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n498#1:546,24\n*E\n"})
public final class hvg {

    /* JADX INFO: renamed from: hvg$a */
    public /* synthetic */ class C7037a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45006a;

        static {
            int[] iArr = new int[o08.values().length];
            try {
                iArr[o08.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o08.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o08.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o08.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f45006a = iArr;
        }
    }

    @fdi
    public static final int calculateAdjacentCursorPosition(@yfb String str, int i, boolean z, @yfb jeh jehVar) {
        int iFindFollowingBreak = z ? u7g.findFollowingBreak(str, i) : u7g.findPrecedingBreak(str, i);
        if (iFindFollowingBreak == -1) {
            return i;
        }
        long jM30514mapFromTransformedjx7JFs = jehVar.m30514mapFromTransformedjx7JFs(iFindFollowingBreak);
        long jM30517mapToTransformedGEjPoXI = jehVar.m30517mapToTransformedGEjPoXI(jM30514mapFromTransformedjx7JFs);
        int i2 = C7037a.f45006a[((jvg.m30587getCollapsedimpl(jM30514mapFromTransformedjx7JFs) && jvg.m30587getCollapsedimpl(jM30517mapToTransformedGEjPoXI)) ? o08.Untransformed : (jvg.m30587getCollapsedimpl(jM30514mapFromTransformedjx7JFs) || jvg.m30587getCollapsedimpl(jM30517mapToTransformedGEjPoXI)) ? (!jvg.m30587getCollapsedimpl(jM30514mapFromTransformedjx7JFs) || jvg.m30587getCollapsedimpl(jM30517mapToTransformedGEjPoXI)) ? o08.Deletion : o08.Insertion : o08.Replacement).ordinal()];
        if (i2 == 1 || i2 == 2) {
            return iFindFollowingBreak;
        }
        if (i2 == 3) {
            return z ? jvg.m30588getEndimpl(jM30517mapToTransformedGEjPoXI) : jvg.m30593getStartimpl(jM30517mapToTransformedGEjPoXI);
        }
        if (i2 != 4) {
            throw new ceb();
        }
        if (z) {
            if (iFindFollowingBreak == jvg.m30593getStartimpl(jM30517mapToTransformedGEjPoXI)) {
                jehVar.setSelectionWedgeAffinity(new hxe(hki.Start));
                return iFindFollowingBreak;
            }
            jehVar.setSelectionWedgeAffinity(new hxe(hki.End));
            return i;
        }
        if (iFindFollowingBreak == jvg.m30588getEndimpl(jM30517mapToTransformedGEjPoXI)) {
            jehVar.setSelectionWedgeAffinity(new hxe(hki.End));
            return iFindFollowingBreak;
        }
        jehVar.setSelectionWedgeAffinity(new hxe(hki.Start));
        return i;
    }
}
