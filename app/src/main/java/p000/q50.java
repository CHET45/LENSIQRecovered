package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class q50 extends wa1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final boolean[] f73227a;

    /* JADX INFO: renamed from: b */
    public int f73228b;

    public q50(@yfb boolean[] zArr) {
        md8.checkNotNullParameter(zArr, "array");
        this.f73227a = zArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f73228b < this.f73227a.length;
    }

    @Override // p000.wa1
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.f73227a;
            int i = this.f73228b;
            this.f73228b = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f73228b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
