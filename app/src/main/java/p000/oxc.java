package p000;

import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class oxc {
    @jjf(version = "1.3")
    @yfb
    public static final Random asJavaRandom(@yfb tod todVar) {
        Random impl;
        md8.checkNotNullParameter(todVar, "<this>");
        AbstractC12415s3 abstractC12415s3 = todVar instanceof AbstractC12415s3 ? (AbstractC12415s3) todVar : null;
        return (abstractC12415s3 == null || (impl = abstractC12415s3.getImpl()) == null) ? new ws8(todVar) : impl;
    }

    @jjf(version = "1.3")
    @yfb
    public static final tod asKotlinRandom(@yfb Random random) {
        tod impl;
        md8.checkNotNullParameter(random, "<this>");
        ws8 ws8Var = random instanceof ws8 ? (ws8) random : null;
        return (ws8Var == null || (impl = ws8Var.getImpl()) == null) ? new nxc(random) : impl;
    }

    @t28
    private static final tod defaultPlatformRandom() {
        return dxc.f31254a.defaultPlatformRandom();
    }

    public static final double doubleFromParts(int i, int i2) {
        return ((((long) i) << 27) + ((long) i2)) / 9.007199254740992E15d;
    }
}
