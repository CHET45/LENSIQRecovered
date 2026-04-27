package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lqh {
    @jjf(version = "1.3")
    @t28
    @yh5
    private static final short[] UShortArray(int i, qy6<? super Integer, iqh> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "init");
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = qy6Var.invoke(Integer.valueOf(i2)).m30374unboximpl();
        }
        return jqh.m30546constructorimpl(sArr);
    }

    @jjf(version = "1.3")
    @t28
    @yh5
    /* JADX INFO: renamed from: ushortArrayOf-rL5Bavg, reason: not valid java name */
    private static final short[] m30887ushortArrayOfrL5Bavg(short... sArr) {
        md8.checkNotNullParameter(sArr, "elements");
        return sArr;
    }
}
