package p000;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class ib9 extends FilterInputStream implements DataInput {
    public ib9(InputStream in) {
        super((InputStream) v7d.checkNotNull(in));
    }

    private byte readAndCheckByte() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (-1 != i) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @op1
    public boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    @op1
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    @op1
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @op1
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    @op1
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] b) throws IOException {
        tj1.readFully(this, b);
    }

    @Override // java.io.DataInput
    @op1
    public int readInt() throws IOException {
        byte andCheckByte = readAndCheckByte();
        byte andCheckByte2 = readAndCheckByte();
        return rd8.fromBytes(readAndCheckByte(), readAndCheckByte(), andCheckByte2, andCheckByte);
    }

    @Override // java.io.DataInput
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    @op1
    public long readLong() throws IOException {
        byte andCheckByte = readAndCheckByte();
        byte andCheckByte2 = readAndCheckByte();
        byte andCheckByte3 = readAndCheckByte();
        byte andCheckByte4 = readAndCheckByte();
        byte andCheckByte5 = readAndCheckByte();
        byte andCheckByte6 = readAndCheckByte();
        return im9.fromBytes(readAndCheckByte(), readAndCheckByte(), andCheckByte6, andCheckByte5, andCheckByte4, andCheckByte3, andCheckByte2, andCheckByte);
    }

    @Override // java.io.DataInput
    @op1
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @op1
    public String readUTF() throws IOException {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    @op1
    public int readUnsignedByte() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @op1
    public int readUnsignedShort() throws IOException {
        return rd8.fromBytes((byte) 0, (byte) 0, readAndCheckByte(), readAndCheckByte());
    }

    @Override // java.io.DataInput
    public int skipBytes(int n) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(n);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] b, int off, int len) throws IOException {
        tj1.readFully(this, b, off, len);
    }
}
