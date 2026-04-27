package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class p51 {
    private p51() {
    }

    public static int cam16Ucs(int i, int i2, double d) {
        xo1 xo1VarFromInt = xo1.fromInt(i);
        xo1 xo1VarFromInt2 = xo1.fromInt(i2);
        double jstar = xo1VarFromInt.getJstar();
        double astar = xo1VarFromInt.getAstar();
        double bstar = xo1VarFromInt.getBstar();
        return xo1.fromUcs(jstar + ((xo1VarFromInt2.getJstar() - jstar) * d), astar + ((xo1VarFromInt2.getAstar() - astar) * d), bstar + ((xo1VarFromInt2.getBstar() - bstar) * d)).toInt();
    }

    public static int harmonize(int i, int i2) {
        bi7 bi7VarFromInt = bi7.fromInt(i);
        bi7 bi7VarFromInt2 = bi7.fromInt(i2);
        return bi7.from(s3a.sanitizeDegreesDouble(bi7VarFromInt.getHue() + (Math.min(s3a.differenceDegrees(bi7VarFromInt.getHue(), bi7VarFromInt2.getHue()) * 0.5d, 15.0d) * s3a.rotationDirection(bi7VarFromInt.getHue(), bi7VarFromInt2.getHue()))), bi7VarFromInt.getChroma(), bi7VarFromInt.getTone()).toInt();
    }

    public static int hctHue(int i, int i2, double d) {
        return bi7.from(xo1.fromInt(cam16Ucs(i, i2, d)).getHue(), xo1.fromInt(i).getChroma(), xa2.lstarFromArgb(i)).toInt();
    }
}
