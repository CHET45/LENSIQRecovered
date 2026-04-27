package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class kqe extends zu4 {
    public kqe(bi7 bi7Var, boolean z, double d) {
        super(bi7Var, w2i.CONTENT, z, d, z3h.fromHueAndChroma(bi7Var.getHue(), bi7Var.getChroma()), z3h.fromHueAndChroma(bi7Var.getHue(), Math.max(bi7Var.getChroma() - 32.0d, bi7Var.getChroma() * 0.5d)), z3h.fromHct(se4.fixIfDisliked(new kog(bi7Var).getAnalogousColors(3, 6).get(2))), z3h.fromHueAndChroma(bi7Var.getHue(), bi7Var.getChroma() / 8.0d), z3h.fromHueAndChroma(bi7Var.getHue(), (bi7Var.getChroma() / 8.0d) + 4.0d));
    }
}
