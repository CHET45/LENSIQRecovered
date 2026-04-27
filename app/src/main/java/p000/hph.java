package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class hph {
    @jjf(version = "1.3")
    @t28
    @yh5
    private static final int[] UIntArray(int i, qy6<? super Integer, woh> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "init");
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = qy6Var.invoke(Integer.valueOf(i2)).m33056unboximpl();
        }
        return fph.m29585constructorimpl(iArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: uintArrayOf--ajY-9A, reason: not valid java name */
    private static final int[] m30100uintArrayOfajY9A(int... iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        return iArr;
    }
}
