package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class rph {
    @jjf(version = "1.3")
    @t28
    @yh5
    private static final long[] ULongArray(int i, qy6<? super Integer, oph> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "init");
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = qy6Var.invoke(Integer.valueOf(i2)).m31585unboximpl();
        }
        return pph.m31838constructorimpl(jArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: ulongArrayOf-QwZRm1k, reason: not valid java name */
    private static final long[] m32164ulongArrayOfQwZRm1k(long... jArr) {
        md8.checkNotNullParameter(jArr, "elements");
        return jArr;
    }
}
