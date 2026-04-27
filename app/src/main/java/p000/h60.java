package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class h60 extends o68 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final int[] f42434a;

    /* JADX INFO: renamed from: b */
    public int f42435b;

    public h60(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "array");
        this.f42434a = iArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f42435b < this.f42434a.length;
    }

    @Override // p000.o68
    public int nextInt() {
        try {
            int[] iArr = this.f42434a;
            int i = this.f42435b;
            this.f42435b = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f42435b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
