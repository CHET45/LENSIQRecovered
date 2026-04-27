package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pzd {
    @f0g
    @yfb
    /* JADX INFO: renamed from: BlurEffect-3YTHUZs, reason: not valid java name */
    public static final x91 m31889BlurEffect3YTHUZs(float f, float f2, int i) {
        return new x91(null, f, f2, i, null);
    }

    /* JADX INFO: renamed from: BlurEffect-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ x91 m31890BlurEffect3YTHUZs$default(float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = tzg.f86446b.m32476getClamp3opZhB0();
        }
        return m31889BlurEffect3YTHUZs(f, f2, i);
    }

    @f0g
    @yfb
    public static final lzb OffsetEffect(float f, float f2) {
        return new lzb(null, mzb.Offset(f, f2), null);
    }
}
