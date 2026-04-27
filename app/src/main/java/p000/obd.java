package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@w01
public interface obd {
    @op1
    obd putBoolean(boolean b);

    @op1
    obd putByte(byte b);

    @op1
    obd putBytes(ByteBuffer bytes);

    @op1
    obd putBytes(byte[] bytes);

    @op1
    obd putBytes(byte[] bytes, int off, int len);

    @op1
    obd putChar(char c);

    @op1
    obd putDouble(double d);

    @op1
    obd putFloat(float f);

    @op1
    obd putInt(int i);

    @op1
    obd putLong(long l);

    @op1
    obd putShort(short s);

    @op1
    obd putString(CharSequence charSequence, Charset charset);

    @op1
    obd putUnencodedChars(CharSequence charSequence);
}
