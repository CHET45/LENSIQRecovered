package p000;

import p000.wqg;

/* JADX INFO: loaded from: classes.dex */
public final class zvg {

    /* JADX INFO: renamed from: zvg$a */
    public /* synthetic */ class C16263a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f106163a;

        static {
            int[] iArr = new int[ov8.values().length];
            try {
                iArr[ov8.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ov8.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f106163a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zxc createPlatformTextStyleInternal(qxc qxcVar, mxc mxcVar) {
        if (qxcVar == null && mxcVar == null) {
            return null;
        }
        return C11142pv.createPlatformTextStyle(qxcVar, mxcVar);
    }

    @yfb
    public static final yvg lerp(@yfb yvg yvgVar, @yfb yvg yvgVar2, float f) {
        return new yvg(twf.lerp(yvgVar.toSpanStyle(), yvgVar2.toSpanStyle(), f), ldc.lerp(yvgVar.toParagraphStyle(), yvgVar2.toParagraphStyle(), f));
    }

    @yfb
    public static final yvg resolveDefaults(@yfb yvg yvgVar, @yfb ov8 ov8Var) {
        return new yvg(twf.resolveSpanStyleDefaults(yvgVar.getSpanStyle$ui_text_release()), ldc.resolveParagraphStyleDefaults(yvgVar.getParagraphStyle$ui_text_release(), ov8Var), yvgVar.getPlatformStyle());
    }

    /* JADX INFO: renamed from: resolveTextDirection-IhaHGbI, reason: not valid java name */
    public static final int m33537resolveTextDirectionIhaHGbI(@yfb ov8 ov8Var, int i) {
        wqg.C14751a c14751a = wqg.f95173b;
        if (wqg.m33087equalsimpl0(i, c14751a.m33091getContents_7Xco())) {
            int i2 = C16263a.f106163a[ov8Var.ordinal()];
            if (i2 == 1) {
                return c14751a.m33092getContentOrLtrs_7Xco();
            }
            if (i2 == 2) {
                return c14751a.m33093getContentOrRtls_7Xco();
            }
            throw new ceb();
        }
        if (!wqg.m33087equalsimpl0(i, c14751a.m33096getUnspecifieds_7Xco())) {
            return i;
        }
        int i3 = C16263a.f106163a[ov8Var.ordinal()];
        if (i3 == 1) {
            return c14751a.m33094getLtrs_7Xco();
        }
        if (i3 == 2) {
            return c14751a.m33095getRtls_7Xco();
        }
        throw new ceb();
    }
}
