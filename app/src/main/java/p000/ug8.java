package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ug8 extends InputStream {

    /* JADX INFO: renamed from: C */
    public int f87978C;

    /* JADX INFO: renamed from: F */
    public long f87979F;

    /* JADX INFO: renamed from: a */
    public Iterator<ByteBuffer> f87980a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f87981b;

    /* JADX INFO: renamed from: c */
    public int f87982c = 0;

    /* JADX INFO: renamed from: d */
    public int f87983d;

    /* JADX INFO: renamed from: e */
    public int f87984e;

    /* JADX INFO: renamed from: f */
    public boolean f87985f;

    /* JADX INFO: renamed from: m */
    public byte[] f87986m;

    public ug8(Iterable<ByteBuffer> data) {
        this.f87980a = data.iterator();
        for (ByteBuffer byteBuffer : data) {
            this.f87982c++;
        }
        this.f87983d = -1;
        if (getNextByteBuffer()) {
            return;
        }
        this.f87981b = v98.f90384f;
        this.f87983d = 0;
        this.f87984e = 0;
        this.f87979F = 0L;
    }

    private boolean getNextByteBuffer() {
        this.f87983d++;
        if (!this.f87980a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f87980a.next();
        this.f87981b = next;
        this.f87984e = next.position();
        if (this.f87981b.hasArray()) {
            this.f87985f = true;
            this.f87986m = this.f87981b.array();
            this.f87978C = this.f87981b.arrayOffset();
        } else {
            this.f87985f = false;
            this.f87979F = evh.m10288k(this.f87981b);
            this.f87986m = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int numberOfBytesRead) {
        int i = this.f87984e + numberOfBytesRead;
        this.f87984e = i;
        if (i == this.f87981b.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f87983d == this.f87982c) {
            return -1;
        }
        if (this.f87985f) {
            int i = this.f87986m[this.f87984e + this.f87978C] & 255;
            updateCurrentByteBufferPos(1);
            return i;
        }
        int iM10296s = evh.m10296s(((long) this.f87984e) + this.f87979F) & 255;
        updateCurrentByteBufferPos(1);
        return iM10296s;
    }

    @Override // java.io.InputStream
    public int read(byte[] output, int offset, int length) throws IOException {
        if (this.f87983d == this.f87982c) {
            return -1;
        }
        int iLimit = this.f87981b.limit();
        int i = this.f87984e;
        int i2 = iLimit - i;
        if (length > i2) {
            length = i2;
        }
        if (this.f87985f) {
            System.arraycopy(this.f87986m, i + this.f87978C, output, offset, length);
            updateCurrentByteBufferPos(length);
        } else {
            int iPosition = this.f87981b.position();
            mi8.m17327e(this.f87981b, this.f87984e);
            this.f87981b.get(output, offset, length);
            mi8.m17327e(this.f87981b, iPosition);
            updateCurrentByteBufferPos(length);
        }
        return length;
    }
}
