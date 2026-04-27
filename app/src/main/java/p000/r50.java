package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class r50 extends lj1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final byte[] f77063a;

    /* JADX INFO: renamed from: b */
    public int f77064b;

    public r50(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "array");
        this.f77063a = bArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f77064b < this.f77063a.length;
    }

    @Override // p000.lj1
    public byte nextByte() {
        try {
            byte[] bArr = this.f77063a;
            int i = this.f77064b;
            this.f77064b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f77064b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
