package p000;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class tj1 {

    /* JADX INFO: renamed from: a */
    public static final int f85012a = 8192;

    /* JADX INFO: renamed from: b */
    public static final int f85013b = 524288;

    /* JADX INFO: renamed from: c */
    public static final int f85014c = 2147483639;

    /* JADX INFO: renamed from: d */
    public static final int f85015d = 20;

    /* JADX INFO: renamed from: e */
    public static final OutputStream f85016e = new C13069a();

    /* JADX INFO: renamed from: tj1$a */
    public class C13069a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int b) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] b) {
            v7d.checkNotNull(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b, int off, int len) {
            v7d.checkNotNull(b);
            v7d.checkPositionIndexes(off, len + off, b.length);
        }
    }

    private tj1() {
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m22680a() {
        return new byte[8192];
    }

    /* JADX INFO: renamed from: b */
    public static long m22681b(InputStream in, long n) throws IOException {
        byte[] bArr = null;
        long j = 0;
        while (j < n) {
            long j2 = n - j;
            long jSkipSafely = skipSafely(in, j2);
            if (jSkipSafely == 0) {
                int iMin = (int) Math.min(j2, 8192L);
                if (bArr == null) {
                    bArr = new byte[iMin];
                }
                jSkipSafely = in.read(bArr, 0, iMin);
                if (jSkipSafely == -1) {
                    break;
                }
            }
            j += jSkipSafely;
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m22682c(InputStream in, long expectedSize) throws IOException {
        v7d.checkArgument(expectedSize >= 0, "expectedSize (%s) must be non-negative", expectedSize);
        if (expectedSize > 2147483639) {
            throw new OutOfMemoryError(expectedSize + " bytes is too large to fit in a byte array");
        }
        int i = (int) expectedSize;
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int i4 = in.read(bArr, i3, i2);
            if (i4 == -1) {
                return Arrays.copyOf(bArr, i3);
            }
            i2 -= i4;
        }
        int i5 = in.read();
        if (i5 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i5});
        return toByteArrayInternal(in, arrayDeque, i + 1);
    }

    private static byte[] combineBuffers(Queue<byte[]> bufs, int totalLen) {
        if (bufs.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = bufs.remove();
        if (bArrRemove.length == totalLen) {
            return bArrRemove;
        }
        int length = totalLen - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, totalLen);
        while (length > 0) {
            byte[] bArrRemove2 = bufs.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, totalLen - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    @op1
    public static long copy(InputStream from, OutputStream to) throws IOException {
        v7d.checkNotNull(from);
        v7d.checkNotNull(to);
        byte[] bArrM22680a = m22680a();
        long j = 0;
        while (true) {
            int i = from.read(bArrM22680a);
            if (i == -1) {
                return j;
            }
            to.write(bArrM22680a, 0, i);
            j += (long) i;
        }
    }

    @op1
    public static long exhaust(InputStream in) throws IOException {
        byte[] bArrM22680a = m22680a();
        long j = 0;
        while (true) {
            long j2 = in.read(bArrM22680a);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    public static InputStream limit(InputStream in, long limit) {
        return new C13072d(in, limit);
    }

    public static bi1 newDataInput(byte[] bytes) {
        return newDataInput(new ByteArrayInputStream(bytes));
    }

    public static ci1 newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    public static OutputStream nullOutputStream() {
        return f85016e;
    }

    @op1
    public static int read(InputStream in, byte[] b, int off, int len) throws IOException {
        v7d.checkNotNull(in);
        v7d.checkNotNull(b);
        if (len < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(len)));
        }
        v7d.checkPositionIndexes(off, off + len, b.length);
        int i = 0;
        while (i < len) {
            int i2 = in.read(b, off + i, len - i);
            if (i2 == -1) {
                break;
            }
            i += i2;
        }
        return i;
    }

    @jgc
    @op1
    public static <T> T readBytes(InputStream input, oj1<T> processor) throws IOException {
        int i;
        v7d.checkNotNull(input);
        v7d.checkNotNull(processor);
        byte[] bArrM22680a = m22680a();
        do {
            i = input.read(bArrM22680a);
            if (i == -1) {
                break;
            }
        } while (processor.processBytes(bArrM22680a, 0, i));
        return processor.getResult();
    }

    public static void readFully(InputStream in, byte[] b) throws IOException {
        readFully(in, b, 0, b.length);
    }

    public static void skipFully(InputStream in, long n) throws IOException {
        long jM22681b = m22681b(in, n);
        if (jM22681b >= n) {
            return;
        }
        throw new EOFException("reached end of stream after skipping " + jM22681b + " bytes; " + n + " bytes expected");
    }

    private static long skipSafely(InputStream in, long n) throws IOException {
        int iAvailable = in.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return in.skip(Math.min(iAvailable, n));
    }

    public static byte[] toByteArray(InputStream in) throws IOException {
        v7d.checkNotNull(in);
        return toByteArrayInternal(in, new ArrayDeque(20), 0);
    }

    private static byte[] toByteArrayInternal(InputStream in, Queue<byte[]> bufs, int totalLen) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(totalLen) * 2));
        while (totalLen < 2147483639) {
            int iMin2 = Math.min(iMin, f85014c - totalLen);
            byte[] bArr = new byte[iMin2];
            bufs.add(bArr);
            int i = 0;
            while (i < iMin2) {
                int i2 = in.read(bArr, i, iMin2 - i);
                if (i2 == -1) {
                    return combineBuffers(bufs, totalLen);
                }
                i += i2;
                totalLen += i2;
            }
            iMin = w68.saturatedMultiply(iMin, iMin < 4096 ? 4 : 2);
        }
        if (in.read() == -1) {
            return combineBuffers(bufs, f85014c);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX INFO: renamed from: tj1$b */
    public static class C13070b implements bi1 {

        /* JADX INFO: renamed from: a */
        public final DataInput f85017a;

        public C13070b(ByteArrayInputStream byteArrayInputStream) {
            this.f85017a = new DataInputStream(byteArrayInputStream);
        }

        @Override // p000.bi1, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.f85017a.readBoolean();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public byte readByte() {
            try {
                return this.f85017a.readByte();
            } catch (EOFException e) {
                throw new IllegalStateException(e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public char readChar() {
            try {
                return this.f85017a.readChar();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public double readDouble() {
            try {
                return this.f85017a.readDouble();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public float readFloat() {
            try {
                return this.f85017a.readFloat();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public void readFully(byte[] b) {
            try {
                this.f85017a.readFully(b);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public int readInt() {
            try {
                return this.f85017a.readInt();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        @wx1
        public String readLine() {
            try {
                return this.f85017a.readLine();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public long readLong() {
            try {
                return this.f85017a.readLong();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public short readShort() {
            try {
                return this.f85017a.readShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public String readUTF() {
            try {
                return this.f85017a.readUTF();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.f85017a.readUnsignedByte();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.f85017a.readUnsignedShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public int skipBytes(int n) {
            try {
                return this.f85017a.skipBytes(n);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // p000.bi1, java.io.DataInput
        public void readFully(byte[] b, int off, int len) {
            try {
                this.f85017a.readFully(b, off, len);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: renamed from: tj1$c */
    public static class C13071c implements ci1 {

        /* JADX INFO: renamed from: a */
        public final DataOutput f85018a;

        /* JADX INFO: renamed from: b */
        public final ByteArrayOutputStream f85019b;

        public C13071c(ByteArrayOutputStream byteArrayOutputStream) {
            this.f85019b = byteArrayOutputStream;
            this.f85018a = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // p000.ci1
        public byte[] toByteArray() {
            return this.f85019b.toByteArray();
        }

        @Override // p000.ci1, java.io.DataOutput
        public void write(int b) {
            try {
                this.f85018a.write(b);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeBoolean(boolean v) {
            try {
                this.f85018a.writeBoolean(v);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeByte(int v) {
            try {
                this.f85018a.writeByte(v);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeBytes(String s) {
            try {
                this.f85018a.writeBytes(s);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeChar(int v) {
            try {
                this.f85018a.writeChar(v);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeChars(String s) {
            try {
                this.f85018a.writeChars(s);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeDouble(double v) {
            try {
                this.f85018a.writeDouble(v);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeFloat(float v) {
            try {
                this.f85018a.writeFloat(v);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeInt(int v) {
            try {
                this.f85018a.writeInt(v);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeLong(long v) {
            try {
                this.f85018a.writeLong(v);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeShort(int v) {
            try {
                this.f85018a.writeShort(v);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void writeUTF(String s) {
            try {
                this.f85018a.writeUTF(s);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void write(byte[] b) {
            try {
                this.f85018a.write(b);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // p000.ci1, java.io.DataOutput
        public void write(byte[] b, int off, int len) {
            try {
                this.f85018a.write(b, off, len);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static bi1 newDataInput(byte[] bytes, int start) {
        v7d.checkPositionIndex(start, bytes.length);
        return newDataInput(new ByteArrayInputStream(bytes, start, bytes.length - start));
    }

    public static ci1 newDataOutput(int size) {
        if (size >= 0) {
            return newDataOutput(new ByteArrayOutputStream(size));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(size)));
    }

    public static void readFully(InputStream in, byte[] b, int off, int len) throws IOException {
        int i = read(in, b, off, len);
        if (i == len) {
            return;
        }
        throw new EOFException("reached end of stream after reading " + i + " bytes; " + len + " bytes expected");
    }

    /* JADX INFO: renamed from: tj1$d */
    public static final class C13072d extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        public long f85020a;

        /* JADX INFO: renamed from: b */
        public long f85021b;

        public C13072d(InputStream in, long limit) {
            super(in);
            this.f85021b = -1L;
            v7d.checkNotNull(in);
            v7d.checkArgument(limit >= 0, "limit must be non-negative");
            this.f85020a = limit;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f85020a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int readLimit) {
            ((FilterInputStream) this).in.mark(readLimit);
            this.f85021b = this.f85020a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f85020a == 0) {
                return -1;
            }
            int i = ((FilterInputStream) this).in.read();
            if (i != -1) {
                this.f85020a--;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f85021b == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f85020a = this.f85021b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long n) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(n, this.f85020a));
            this.f85020a -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] b, int off, int len) throws IOException {
            long j = this.f85020a;
            if (j == 0) {
                return -1;
            }
            int i = ((FilterInputStream) this).in.read(b, off, (int) Math.min(len, j));
            if (i != -1) {
                this.f85020a -= (long) i;
            }
            return i;
        }
    }

    public static bi1 newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new C13070b((ByteArrayInputStream) v7d.checkNotNull(byteArrayInputStream));
    }

    public static ci1 newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new C13071c((ByteArrayOutputStream) v7d.checkNotNull(byteArrayOutputStream));
    }

    @op1
    public static long copy(ReadableByteChannel from, WritableByteChannel to) throws IOException {
        v7d.checkNotNull(from);
        v7d.checkNotNull(to);
        long jWrite = 0;
        if (from instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) from;
            long jPosition = fileChannel.position();
            long j = jPosition;
            while (true) {
                long jTransferTo = fileChannel.transferTo(j, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, to);
                j += jTransferTo;
                fileChannel.position(j);
                if (jTransferTo <= 0 && j >= fileChannel.size()) {
                    return j - jPosition;
                }
            }
        } else {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(m22680a());
            while (from.read(byteBufferWrap) != -1) {
                ki8.m14758b(byteBufferWrap);
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += (long) to.write(byteBufferWrap);
                }
                ki8.m14757a(byteBufferWrap);
            }
            return jWrite;
        }
    }
}
