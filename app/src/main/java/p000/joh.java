package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class joh {
    @jjf(version = "1.3")
    @t28
    @yh5
    private static final byte[] UByteArray(int i, qy6<? super Integer, goh> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "init");
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = qy6Var.invoke(Integer.valueOf(i2)).m29836unboximpl();
        }
        return hoh.m30083constructorimpl(bArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: ubyteArrayOf-GBYM_sE, reason: not valid java name */
    private static final byte[] m30528ubyteArrayOfGBYM_sE(byte... bArr) {
        md8.checkNotNullParameter(bArr, "elements");
        return bArr;
    }
}
