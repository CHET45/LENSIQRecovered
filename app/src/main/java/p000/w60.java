package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class w60 extends gl9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final long[] f93390a;

    /* JADX INFO: renamed from: b */
    public int f93391b;

    public w60(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "array");
        this.f93390a = jArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93391b < this.f93390a.length;
    }

    @Override // p000.gl9
    public long nextLong() {
        try {
            long[] jArr = this.f93390a;
            int i = this.f93391b;
            this.f93391b = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f93391b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
