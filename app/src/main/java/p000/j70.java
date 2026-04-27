package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class j70 extends uaf {

    /* JADX INFO: renamed from: a */
    @yfb
    public final short[] f49659a;

    /* JADX INFO: renamed from: b */
    public int f49660b;

    public j70(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "array");
        this.f49659a = sArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f49660b < this.f49659a.length;
    }

    @Override // p000.uaf
    public short nextShort() {
        try {
            short[] sArr = this.f49659a;
            int i = this.f49660b;
            this.f49660b = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f49660b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
