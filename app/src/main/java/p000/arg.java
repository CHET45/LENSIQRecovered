package p000;

/* JADX INFO: loaded from: classes.dex */
@xn8(name = "TextDrawStyleKt")
public final class arg {
    @yfb
    public static final btg lerp(@yfb btg btgVar, @yfb btg btgVar2, float f) {
        boolean z = btgVar instanceof ke1;
        return (z || (btgVar2 instanceof ke1)) ? (z && (btgVar2 instanceof ke1)) ? btg.f14745a.from((he1) twf.lerpDiscrete(((ke1) btgVar).getBrush(), ((ke1) btgVar2).getBrush(), f), m3a.lerp(btgVar.getAlpha(), btgVar2.getAlpha(), f)) : (btg) twf.lerpDiscrete(btgVar, btgVar2, f) : btg.f14745a.m28156from8_81llA(j92.m30487lerpjxsXWHM(btgVar.mo28155getColor0d7_KjU(), btgVar2.mo28155getColor0d7_KjU(), f));
    }

    /* JADX INFO: renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m27876modulateDxMtmZc(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : w82.m32950copywmQWz5c$default(j, w82.m32953getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f, ny6<Float> ny6Var) {
        return Float.isNaN(f) ? ny6Var.invoke().floatValue() : f;
    }
}
