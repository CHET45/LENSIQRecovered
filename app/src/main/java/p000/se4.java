package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class se4 {
    private se4() {
        throw new UnsupportedOperationException();
    }

    public static bi7 fixIfDisliked(bi7 bi7Var) {
        return isDisliked(bi7Var) ? bi7.from(bi7Var.getHue(), bi7Var.getChroma(), 70.0d) : bi7Var;
    }

    public static boolean isDisliked(bi7 bi7Var) {
        return ((((double) Math.round(bi7Var.getHue())) > 90.0d ? 1 : (((double) Math.round(bi7Var.getHue())) == 90.0d ? 0 : -1)) >= 0 && (((double) Math.round(bi7Var.getHue())) > 111.0d ? 1 : (((double) Math.round(bi7Var.getHue())) == 111.0d ? 0 : -1)) <= 0) && ((((double) Math.round(bi7Var.getChroma())) > 16.0d ? 1 : (((double) Math.round(bi7Var.getChroma())) == 16.0d ? 0 : -1)) > 0) && ((((double) Math.round(bi7Var.getTone())) > 70.0d ? 1 : (((double) Math.round(bi7Var.getTone())) == 70.0d ? 0 : -1)) < 0);
    }
}
