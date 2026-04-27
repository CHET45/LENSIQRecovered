package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: s1 */
/* JADX INFO: loaded from: classes5.dex */
@xx4
public abstract class AbstractC12390s1 implements wh7 {
    @Override // p000.wh7
    @op1
    public <T> wh7 putObject(@hgc T instance, s07<? super T> funnel) {
        funnel.funnel(instance, this);
        return this;
    }

    @Override // p000.wh7, p000.obd
    @op1
    public final wh7 putBoolean(boolean z) {
        return putByte(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.wh7, p000.obd
    @op1
    public wh7 putChar(char c) {
        putByte((byte) c);
        putByte((byte) (c >>> '\b'));
        return this;
    }

    @Override // p000.wh7, p000.obd
    @op1
    public final wh7 putDouble(double d) {
        return putLong(Double.doubleToRawLongBits(d));
    }

    @Override // p000.wh7, p000.obd
    @op1
    public final wh7 putFloat(float f) {
        return putInt(Float.floatToRawIntBits(f));
    }

    @Override // p000.wh7, p000.obd
    @op1
    public wh7 putInt(int i) {
        putByte((byte) i);
        putByte((byte) (i >>> 8));
        putByte((byte) (i >>> 16));
        putByte((byte) (i >>> 24));
        return this;
    }

    @Override // p000.wh7, p000.obd
    @op1
    public wh7 putLong(long l) {
        for (int i = 0; i < 64; i += 8) {
            putByte((byte) (l >>> i));
        }
        return this;
    }

    @Override // p000.wh7, p000.obd
    @op1
    public wh7 putShort(short s) {
        putByte((byte) s);
        putByte((byte) (s >>> 8));
        return this;
    }

    @Override // p000.wh7, p000.obd
    @op1
    public wh7 putString(CharSequence charSequence, Charset charset) {
        return putBytes(charSequence.toString().getBytes(charset));
    }

    @Override // p000.wh7, p000.obd
    @op1
    public wh7 putUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            putChar(charSequence.charAt(i));
        }
        return this;
    }

    @Override // p000.wh7, p000.obd
    @op1
    public wh7 putBytes(byte[] bytes) {
        return putBytes(bytes, 0, bytes.length);
    }

    @Override // p000.wh7, p000.obd
    @op1
    public wh7 putBytes(byte[] bytes, int off, int len) {
        v7d.checkPositionIndexes(off, off + len, bytes.length);
        for (int i = 0; i < len; i++) {
            putByte(bytes[off + i]);
        }
        return this;
    }

    @Override // p000.wh7, p000.obd
    @op1
    public wh7 putBytes(ByteBuffer b) {
        if (b.hasArray()) {
            putBytes(b.array(), b.arrayOffset() + b.position(), b.remaining());
            ji8.m14107d(b, b.limit());
        } else {
            for (int iRemaining = b.remaining(); iRemaining > 0; iRemaining--) {
                putByte(b.get());
            }
        }
        return this;
    }
}
