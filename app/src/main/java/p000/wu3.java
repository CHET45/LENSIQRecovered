package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class wu3 implements zj5 {

    /* JADX INFO: renamed from: i */
    public static final int f95517i = 65536;

    /* JADX INFO: renamed from: j */
    public static final int f95518j = 524288;

    /* JADX INFO: renamed from: k */
    public static final int f95519k = 4096;

    /* JADX INFO: renamed from: c */
    public final ah3 f95521c;

    /* JADX INFO: renamed from: d */
    public final long f95522d;

    /* JADX INFO: renamed from: e */
    public long f95523e;

    /* JADX INFO: renamed from: g */
    public int f95525g;

    /* JADX INFO: renamed from: h */
    public int f95526h;

    /* JADX INFO: renamed from: f */
    public byte[] f95524f = new byte[65536];

    /* JADX INFO: renamed from: b */
    public final byte[] f95520b = new byte[4096];

    static {
        lf5.registerModule("goog.exo.extractor");
    }

    public wu3(ah3 ah3Var, long j, long j2) {
        this.f95521c = ah3Var;
        this.f95523e = j;
        this.f95522d = j2;
    }

    private void commitBytesRead(int i) {
        if (i != -1) {
            this.f95523e += (long) i;
        }
    }

    private void ensureSpaceForPeek(int i) {
        int i2 = this.f95525g + i;
        byte[] bArr = this.f95524f;
        if (i2 > bArr.length) {
            this.f95524f = Arrays.copyOf(this.f95524f, x0i.constrainValue(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int readFromPeekBuffer(byte[] bArr, int i, int i2) {
        int i3 = this.f95526h;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f95524f, 0, bArr, i, iMin);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private int readFromUpstream(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f95521c.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private int skipFromPeekBuffer(int i) {
        int iMin = Math.min(this.f95526h, i);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private void updatePeekBuffer(int i) {
        int i2 = this.f95526h - i;
        this.f95526h = i2;
        this.f95525g = 0;
        byte[] bArr = this.f95524f;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f95524f = bArr2;
    }

    @Override // p000.zj5
    public boolean advancePeekPosition(int i, boolean z) throws IOException {
        ensureSpaceForPeek(i);
        int fromUpstream = this.f95526h - this.f95525g;
        while (fromUpstream < i) {
            fromUpstream = readFromUpstream(this.f95524f, this.f95525g, i, fromUpstream, z);
            if (fromUpstream == -1) {
                return false;
            }
            this.f95526h = this.f95525g + fromUpstream;
        }
        this.f95525g += i;
        return true;
    }

    @Override // p000.zj5
    public long getLength() {
        return this.f95522d;
    }

    @Override // p000.zj5
    public long getPeekPosition() {
        return this.f95523e + ((long) this.f95525g);
    }

    @Override // p000.zj5
    public long getPosition() {
        return this.f95523e;
    }

    @Override // p000.zj5
    public int peek(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        ensureSpaceForPeek(i2);
        int i3 = this.f95526h;
        int i4 = this.f95525g;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = readFromUpstream(this.f95524f, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f95526h += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f95524f, this.f95525g, bArr, i, iMin);
        this.f95525g += iMin;
        return iMin;
    }

    @Override // p000.zj5
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!advancePeekPosition(i2, z)) {
            return false;
        }
        System.arraycopy(this.f95524f, this.f95525g - i2, bArr, i, i2);
        return true;
    }

    @Override // p000.zj5, p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i, i2);
        if (fromPeekBuffer == 0) {
            fromPeekBuffer = readFromUpstream(bArr, i, i2, 0, true);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer;
    }

    @Override // p000.zj5
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i, i2);
        while (fromPeekBuffer < i2 && fromPeekBuffer != -1) {
            fromPeekBuffer = readFromUpstream(bArr, i, i2, fromPeekBuffer, z);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer != -1;
    }

    @Override // p000.zj5
    public void resetPeekPosition() {
        this.f95525g = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // p000.zj5
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        u80.checkArgument(j >= 0);
        this.f95523e = j;
        throw e;
    }

    @Override // p000.zj5
    public int skip(int i) throws IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i);
        if (iSkipFromPeekBuffer == 0) {
            byte[] bArr = this.f95520b;
            iSkipFromPeekBuffer = readFromUpstream(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer;
    }

    @Override // p000.zj5
    public boolean skipFully(int i, boolean z) throws IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i);
        while (iSkipFromPeekBuffer < i && iSkipFromPeekBuffer != -1) {
            iSkipFromPeekBuffer = readFromUpstream(this.f95520b, -iSkipFromPeekBuffer, Math.min(i, this.f95520b.length + iSkipFromPeekBuffer), iSkipFromPeekBuffer, z);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer != -1;
    }

    @Override // p000.zj5
    public void peekFully(byte[] bArr, int i, int i2) throws IOException {
        peekFully(bArr, i, i2, false);
    }

    @Override // p000.zj5
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        readFully(bArr, i, i2, false);
    }

    @Override // p000.zj5
    public void skipFully(int i) throws IOException {
        skipFully(i, false);
    }

    @Override // p000.zj5
    public void advancePeekPosition(int i) throws IOException {
        advancePeekPosition(i, false);
    }
}
