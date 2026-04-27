package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class s50 extends wv1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final char[] f80684a;

    /* JADX INFO: renamed from: b */
    public int f80685b;

    public s50(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "array");
        this.f80684a = cArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f80685b < this.f80684a.length;
    }

    @Override // p000.wv1
    public char nextChar() {
        try {
            char[] cArr = this.f80684a;
            int i = this.f80685b;
            this.f80685b = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f80685b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
