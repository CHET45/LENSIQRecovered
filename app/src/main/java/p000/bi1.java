package p000;

import java.io.DataInput;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public interface bi1 extends DataInput {
    @Override // java.io.DataInput
    @op1
    boolean readBoolean();

    @Override // java.io.DataInput
    @op1
    byte readByte();

    @Override // java.io.DataInput
    @op1
    char readChar();

    @Override // java.io.DataInput
    @op1
    double readDouble();

    @Override // java.io.DataInput
    @op1
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] b);

    @Override // java.io.DataInput
    void readFully(byte[] b, int off, int len);

    @Override // java.io.DataInput
    @op1
    int readInt();

    @Override // java.io.DataInput
    @op1
    @wx1
    String readLine();

    @Override // java.io.DataInput
    @op1
    long readLong();

    @Override // java.io.DataInput
    @op1
    short readShort();

    @Override // java.io.DataInput
    @op1
    String readUTF();

    @Override // java.io.DataInput
    @op1
    int readUnsignedByte();

    @Override // java.io.DataInput
    @op1
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int n);
}
