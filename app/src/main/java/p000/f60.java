package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class f60 extends ck4 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final double[] f35391a;

    /* JADX INFO: renamed from: b */
    public int f35392b;

    public f60(@yfb double[] dArr) {
        md8.checkNotNullParameter(dArr, "array");
        this.f35391a = dArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35392b < this.f35391a.length;
    }

    @Override // p000.ck4
    public double nextDouble() {
        try {
            double[] dArr = this.f35391a;
            int i = this.f35392b;
            this.f35392b = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f35392b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
