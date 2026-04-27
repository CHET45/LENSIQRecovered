package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class g60 extends m46 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final float[] f38877a;

    /* JADX INFO: renamed from: b */
    public int f38878b;

    public g60(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "array");
        this.f38877a = fArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38878b < this.f38877a.length;
    }

    @Override // p000.m46
    public float nextFloat() {
        try {
            float[] fArr = this.f38877a;
            int i = this.f38878b;
            this.f38878b = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f38878b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
