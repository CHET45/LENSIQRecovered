package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class m60 {
    @yfb
    public static final lj1 iterator(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "array");
        return new r50(bArr);
    }

    @yfb
    public static final wv1 iterator(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "array");
        return new s50(cArr);
    }

    @yfb
    public static final uaf iterator(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "array");
        return new j70(sArr);
    }

    @yfb
    public static final o68 iterator(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "array");
        return new h60(iArr);
    }

    @yfb
    public static final gl9 iterator(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "array");
        return new w60(jArr);
    }

    @yfb
    public static final m46 iterator(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "array");
        return new g60(fArr);
    }

    @yfb
    public static final ck4 iterator(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "array");
        return new f60(dArr);
    }

    @yfb
    public static final wa1 iterator(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "array");
        return new q50(zArr);
    }
}
