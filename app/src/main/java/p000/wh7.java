package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@w01
public interface wh7 extends obd {
    jh7 hash();

    @Deprecated
    int hashCode();

    @Override // p000.obd
    @op1
    wh7 putBoolean(boolean b);

    @Override // p000.obd
    @op1
    wh7 putByte(byte b);

    @Override // p000.obd
    @op1
    wh7 putBytes(ByteBuffer bytes);

    @Override // p000.obd
    @op1
    wh7 putBytes(byte[] bytes);

    @Override // p000.obd
    @op1
    wh7 putBytes(byte[] bytes, int off, int len);

    @Override // p000.obd
    @op1
    wh7 putChar(char c);

    @Override // p000.obd
    @op1
    wh7 putDouble(double d);

    @Override // p000.obd
    @op1
    wh7 putFloat(float f);

    @Override // p000.obd
    @op1
    wh7 putInt(int i);

    @Override // p000.obd
    @op1
    wh7 putLong(long l);

    @op1
    <T> wh7 putObject(@hgc T instance, s07<? super T> funnel);

    @Override // p000.obd
    @op1
    wh7 putShort(short s);

    @Override // p000.obd
    @op1
    wh7 putString(CharSequence charSequence, Charset charset);

    @Override // p000.obd
    @op1
    wh7 putUnencodedChars(CharSequence charSequence);
}
