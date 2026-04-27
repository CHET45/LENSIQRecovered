package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class tg8 extends InputStream {

    /* JADX INFO: renamed from: C */
    public int f84636C;

    /* JADX INFO: renamed from: F */
    public long f84637F;

    /* JADX INFO: renamed from: a */
    public Iterator<ByteBuffer> f84638a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f84639b;

    /* JADX INFO: renamed from: c */
    public int f84640c = 0;

    /* JADX INFO: renamed from: d */
    public int f84641d;

    /* JADX INFO: renamed from: e */
    public int f84642e;

    /* JADX INFO: renamed from: f */
    public boolean f84643f;

    /* JADX INFO: renamed from: m */
    public byte[] f84644m;

    public tg8(Iterable<ByteBuffer> data) {
        this.f84638a = data.iterator();
        for (ByteBuffer byteBuffer : data) {
            this.f84640c++;
        }
        this.f84641d = -1;
        if (getNextByteBuffer()) {
            return;
        }
        this.f84639b = w98.f93678f;
        this.f84641d = 0;
        this.f84642e = 0;
        this.f84637F = 0L;
    }

    private boolean getNextByteBuffer() {
        this.f84641d++;
        if (!this.f84638a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f84638a.next();
        this.f84639b = next;
        this.f84642e = next.position();
        if (this.f84639b.hasArray()) {
            this.f84643f = true;
            this.f84644m = this.f84639b.array();
            this.f84636C = this.f84639b.arrayOffset();
        } else {
            this.f84643f = false;
            this.f84637F = dvh.m9479k(this.f84639b);
            this.f84644m = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int numberOfBytesRead) {
        int i = this.f84642e + numberOfBytesRead;
        this.f84642e = i;
        if (i == this.f84639b.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f84641d == this.f84640c) {
            return -1;
        }
        if (this.f84643f) {
            int i = this.f84644m[this.f84642e + this.f84636C] & 255;
            updateCurrentByteBufferPos(1);
            return i;
        }
        int iM9487s = dvh.m9487s(((long) this.f84642e) + this.f84637F) & 255;
        updateCurrentByteBufferPos(1);
        return iM9487s;
    }

    @Override // java.io.InputStream
    public int read(byte[] output, int offset, int length) throws IOException {
        if (this.f84641d == this.f84640c) {
            return -1;
        }
        int iLimit = this.f84639b.limit();
        int i = this.f84642e;
        int i2 = iLimit - i;
        if (length > i2) {
            length = i2;
        }
        if (this.f84643f) {
            System.arraycopy(this.f84644m, i + this.f84636C, output, offset, length);
            updateCurrentByteBufferPos(length);
        } else {
            int iPosition = this.f84639b.position();
            li8.m16163e(this.f84639b, this.f84642e);
            this.f84639b.get(output, offset, length);
            li8.m16163e(this.f84639b, iPosition);
            updateCurrentByteBufferPos(length);
        }
        return length;
    }
}
