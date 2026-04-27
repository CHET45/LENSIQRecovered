package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pp6 {
    public static final void forEachOneBit(int i, @yfb gz6<? super Integer, ? super Integer, bth> gz6Var) {
        int i2 = 0;
        while (i != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i);
            gz6Var.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i2));
            i2++;
            i ^= iLowestOneBit;
        }
    }
}
