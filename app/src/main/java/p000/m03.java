package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class m03 {

    /* JADX INFO: renamed from: a */
    public z3h f59519a;

    /* JADX INFO: renamed from: b */
    public z3h f59520b;

    /* JADX INFO: renamed from: c */
    public z3h f59521c;

    /* JADX INFO: renamed from: d */
    public z3h f59522d;

    /* JADX INFO: renamed from: e */
    public z3h f59523e;

    /* JADX INFO: renamed from: f */
    public z3h f59524f;

    private m03(int i, boolean z) {
        bi7 bi7VarFromInt = bi7.fromInt(i);
        double hue = bi7VarFromInt.getHue();
        double chroma = bi7VarFromInt.getChroma();
        if (z) {
            this.f59519a = z3h.fromHueAndChroma(hue, chroma);
            this.f59520b = z3h.fromHueAndChroma(hue, chroma / 3.0d);
            this.f59521c = z3h.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f59522d = z3h.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f59523e = z3h.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f59519a = z3h.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f59520b = z3h.fromHueAndChroma(hue, 16.0d);
            this.f59521c = z3h.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f59522d = z3h.fromHueAndChroma(hue, 4.0d);
            this.f59523e = z3h.fromHueAndChroma(hue, 8.0d);
        }
        this.f59524f = z3h.fromHueAndChroma(25.0d, 84.0d);
    }

    public static m03 contentOf(int i) {
        return new m03(i, true);
    }

    /* JADX INFO: renamed from: of */
    public static m03 m16540of(int i) {
        return new m03(i, false);
    }
}
