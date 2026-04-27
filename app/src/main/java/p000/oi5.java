package p000;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class oi5 extends ByteArrayOutputStream {
    public oi5(int i) {
        super(i);
    }

    @yfb
    public final byte[] getBuffer() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        md8.checkNotNullExpressionValue(bArr, "buf");
        return bArr;
    }
}
