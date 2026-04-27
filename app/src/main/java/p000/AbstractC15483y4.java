package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: y4 */
/* JADX INFO: loaded from: classes5.dex */
@xx4
public abstract class AbstractC15483y4 extends AbstractC12390s1 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f100314a;

    /* JADX INFO: renamed from: b */
    public final int f100315b;

    /* JADX INFO: renamed from: c */
    public final int f100316c;

    public AbstractC15483y4(int chunkSize) {
        this(chunkSize, chunkSize);
    }

    private void munch() {
        ji8.m14105b(this.f100314a);
        while (this.f100314a.remaining() >= this.f100316c) {
            mo10528b(this.f100314a);
        }
        this.f100314a.compact();
    }

    private void munchIfFull() {
        if (this.f100314a.remaining() < 8) {
            munch();
        }
    }

    @op1
    private wh7 putBytesInternal(ByteBuffer readBuffer) {
        if (readBuffer.remaining() <= this.f100314a.remaining()) {
            this.f100314a.put(readBuffer);
            munchIfFull();
            return this;
        }
        int iPosition = this.f100315b - this.f100314a.position();
        for (int i = 0; i < iPosition; i++) {
            this.f100314a.put(readBuffer.get());
        }
        munch();
        while (readBuffer.remaining() >= this.f100316c) {
            mo10528b(readBuffer);
        }
        this.f100314a.put(readBuffer);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public abstract jh7 mo10527a();

    /* JADX INFO: renamed from: b */
    public abstract void mo10528b(ByteBuffer bb);

    /* JADX INFO: renamed from: c */
    public void mo10529c(ByteBuffer bb) {
        ji8.m14107d(bb, bb.limit());
        ji8.m14106c(bb, this.f100316c + 7);
        while (true) {
            int iPosition = bb.position();
            int i = this.f100316c;
            if (iPosition >= i) {
                ji8.m14106c(bb, i);
                ji8.m14105b(bb);
                mo10528b(bb);
                return;
            }
            bb.putLong(0L);
        }
    }

    @Override // p000.wh7
    public final jh7 hash() {
        munch();
        ji8.m14105b(this.f100314a);
        if (this.f100314a.remaining() > 0) {
            mo10529c(this.f100314a);
            ByteBuffer byteBuffer = this.f100314a;
            ji8.m14107d(byteBuffer, byteBuffer.limit());
        }
        return mo10527a();
    }

    public AbstractC15483y4(int chunkSize, int bufferSize) {
        v7d.checkArgument(bufferSize % chunkSize == 0);
        this.f100314a = ByteBuffer.allocate(bufferSize + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f100315b = bufferSize;
        this.f100316c = chunkSize;
    }

    @Override // p000.wh7, p000.obd
    @op1
    public final wh7 putByte(byte b) {
        this.f100314a.put(b);
        munchIfFull();
        return this;
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public final wh7 putChar(char c) {
        this.f100314a.putChar(c);
        munchIfFull();
        return this;
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public final wh7 putInt(int i) {
        this.f100314a.putInt(i);
        munchIfFull();
        return this;
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public final wh7 putLong(long l) {
        this.f100314a.putLong(l);
        munchIfFull();
        return this;
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public final wh7 putShort(short s) {
        this.f100314a.putShort(s);
        munchIfFull();
        return this;
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public final wh7 putBytes(byte[] bytes, int off, int len) {
        return putBytesInternal(ByteBuffer.wrap(bytes, off, len).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // p000.AbstractC12390s1, p000.wh7, p000.obd
    @op1
    public final wh7 putBytes(ByteBuffer readBuffer) {
        ByteOrder byteOrderOrder = readBuffer.order();
        try {
            readBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return putBytesInternal(readBuffer);
        } finally {
            readBuffer.order(byteOrderOrder);
        }
    }
}
