package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.lzh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i72 extends nj1 {

    /* JADX INFO: renamed from: c */
    public static final Logger f45866c = Logger.getLogger(i72.class.getName());

    /* JADX INFO: renamed from: d */
    public static final boolean f45867d = evh.m10256J();

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final int f45868e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f45869f = 4096;

    /* JADX INFO: renamed from: a */
    public k72 f45870a;

    /* JADX INFO: renamed from: b */
    public boolean f45871b;

    /* JADX INFO: renamed from: i72$b */
    public static abstract class AbstractC7162b extends i72 {

        /* JADX INFO: renamed from: g */
        public final byte[] f45872g;

        /* JADX INFO: renamed from: h */
        public final int f45873h;

        /* JADX INFO: renamed from: i */
        public int f45874i;

        /* JADX INFO: renamed from: j */
        public int f45875j;

        public AbstractC7162b(int bufferSize) {
            super();
            if (bufferSize < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(bufferSize, 20)];
            this.f45872g = bArr;
            this.f45873h = bArr.length;
        }

        @Override // p000.i72
        public final int getTotalBytesWritten() {
            return this.f45875j;
        }

        /* JADX INFO: renamed from: q */
        public final void m12839q(byte value) {
            byte[] bArr = this.f45872g;
            int i = this.f45874i;
            this.f45874i = i + 1;
            bArr[i] = value;
            this.f45875j++;
        }

        /* JADX INFO: renamed from: r */
        public final void m12840r(int value) {
            byte[] bArr = this.f45872g;
            int i = this.f45874i;
            int i2 = i + 1;
            this.f45874i = i2;
            bArr[i] = (byte) (value & 255);
            int i3 = i + 2;
            this.f45874i = i3;
            bArr[i2] = (byte) ((value >> 8) & 255);
            int i4 = i + 3;
            this.f45874i = i4;
            bArr[i3] = (byte) ((value >> 16) & 255);
            this.f45874i = i + 4;
            bArr[i4] = (byte) ((value >> 24) & 255);
            this.f45875j += 4;
        }

        /* JADX INFO: renamed from: s */
        public final void m12841s(long value) {
            byte[] bArr = this.f45872g;
            int i = this.f45874i;
            int i2 = i + 1;
            this.f45874i = i2;
            bArr[i] = (byte) (value & 255);
            int i3 = i + 2;
            this.f45874i = i3;
            bArr[i2] = (byte) ((value >> 8) & 255);
            int i4 = i + 3;
            this.f45874i = i4;
            bArr[i3] = (byte) ((value >> 16) & 255);
            int i5 = i + 4;
            this.f45874i = i5;
            bArr[i4] = (byte) (255 & (value >> 24));
            int i6 = i + 5;
            this.f45874i = i6;
            bArr[i5] = (byte) (((int) (value >> 32)) & 255);
            int i7 = i + 6;
            this.f45874i = i7;
            bArr[i6] = (byte) (((int) (value >> 40)) & 255);
            int i8 = i + 7;
            this.f45874i = i8;
            bArr[i7] = (byte) (((int) (value >> 48)) & 255);
            this.f45874i = i + 8;
            bArr[i8] = (byte) (((int) (value >> 56)) & 255);
            this.f45875j += 8;
        }

        @Override // p000.i72
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* JADX INFO: renamed from: t */
        public final void m12842t(final int value) {
            if (value >= 0) {
                m12844v(value);
            } else {
                m12845w(value);
            }
        }

        /* JADX INFO: renamed from: u */
        public final void m12843u(final int fieldNumber, final int wireType) {
            m12844v(gpi.m11819a(fieldNumber, wireType));
        }

        /* JADX INFO: renamed from: v */
        public final void m12844v(int value) {
            if (!i72.f45867d) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.f45872g;
                    int i = this.f45874i;
                    this.f45874i = i + 1;
                    bArr[i] = (byte) ((value | 128) & 255);
                    this.f45875j++;
                    value >>>= 7;
                }
                byte[] bArr2 = this.f45872g;
                int i2 = this.f45874i;
                this.f45874i = i2 + 1;
                bArr2[i2] = (byte) value;
                this.f45875j++;
                return;
            }
            long j = this.f45874i;
            while ((value & (-128)) != 0) {
                byte[] bArr3 = this.f45872g;
                int i3 = this.f45874i;
                this.f45874i = i3 + 1;
                evh.m10265S(bArr3, i3, (byte) ((value | 128) & 255));
                value >>>= 7;
            }
            byte[] bArr4 = this.f45872g;
            int i4 = this.f45874i;
            this.f45874i = i4 + 1;
            evh.m10265S(bArr4, i4, (byte) value);
            this.f45875j += (int) (((long) this.f45874i) - j);
        }

        /* JADX INFO: renamed from: w */
        public final void m12845w(long value) {
            if (!i72.f45867d) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.f45872g;
                    int i = this.f45874i;
                    this.f45874i = i + 1;
                    bArr[i] = (byte) ((((int) value) | 128) & 255);
                    this.f45875j++;
                    value >>>= 7;
                }
                byte[] bArr2 = this.f45872g;
                int i2 = this.f45874i;
                this.f45874i = i2 + 1;
                bArr2[i2] = (byte) value;
                this.f45875j++;
                return;
            }
            long j = this.f45874i;
            while ((value & (-128)) != 0) {
                byte[] bArr3 = this.f45872g;
                int i3 = this.f45874i;
                this.f45874i = i3 + 1;
                evh.m10265S(bArr3, i3, (byte) ((((int) value) | 128) & 255));
                value >>>= 7;
            }
            byte[] bArr4 = this.f45872g;
            int i4 = this.f45874i;
            this.f45874i = i4 + 1;
            evh.m10265S(bArr4, i4, (byte) value);
            this.f45875j += (int) (((long) this.f45874i) - j);
        }
    }

    /* JADX INFO: renamed from: i72$c */
    public static class C7163c extends i72 {

        /* JADX INFO: renamed from: g */
        public final byte[] f45876g;

        /* JADX INFO: renamed from: h */
        public final int f45877h;

        /* JADX INFO: renamed from: i */
        public final int f45878i;

        /* JADX INFO: renamed from: j */
        public int f45879j;

        public C7163c(byte[] buffer, int offset, int length) {
            super();
            if (buffer == null) {
                throw new NullPointerException("buffer");
            }
            int i = offset + length;
            if ((offset | length | (buffer.length - i)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(buffer.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            this.f45876g = buffer;
            this.f45877h = offset;
            this.f45879j = offset;
            this.f45878i = i;
        }

        @Override // p000.i72
        public void flush() {
        }

        @Override // p000.i72
        public final int getTotalBytesWritten() {
            return this.f45879j - this.f45877h;
        }

        @Override // p000.i72
        /* JADX INFO: renamed from: o */
        public final void mo12837o(final int fieldNumber, final psa value, upe schema) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(((AbstractC0027a3) value).mo83d(schema));
            schema.writeTo(value, this.f45870a);
        }

        @Override // p000.i72
        /* JADX INFO: renamed from: p */
        public final void mo12838p(final psa value, upe schema) throws IOException {
            writeUInt32NoTag(((AbstractC0027a3) value).mo83d(schema));
            schema.writeTo(value, this.f45870a);
        }

        @Override // p000.i72
        public final int spaceLeft() {
            return this.f45878i - this.f45879j;
        }

        @Override // p000.i72, p000.nj1
        public final void write(byte value) throws IOException {
            try {
                byte[] bArr = this.f45876g;
                int i = this.f45879j;
                this.f45879j = i + 1;
                bArr[i] = value;
            } catch (IndexOutOfBoundsException e) {
                throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45879j), Integer.valueOf(this.f45878i), 1), e);
            }
        }

        @Override // p000.i72
        public final void writeBool(int i, boolean z) throws IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.i72
        public final void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // p000.i72
        public final void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // p000.i72
        public final void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // p000.i72
        public final void writeBytes(final int fieldNumber, final wj1 value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // p000.i72
        public final void writeBytesNoTag(final wj1 value) throws IOException {
            writeUInt32NoTag(value.size());
            value.mo9868p(this);
        }

        @Override // p000.i72
        public final void writeFixed32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // p000.i72
        public final void writeFixed32NoTag(int value) throws IOException {
            try {
                byte[] bArr = this.f45876g;
                int i = this.f45879j;
                int i2 = i + 1;
                this.f45879j = i2;
                bArr[i] = (byte) (value & 255);
                int i3 = i + 2;
                this.f45879j = i3;
                bArr[i2] = (byte) ((value >> 8) & 255);
                int i4 = i + 3;
                this.f45879j = i4;
                bArr[i3] = (byte) ((value >> 16) & 255);
                this.f45879j = i + 4;
                bArr[i4] = (byte) ((value >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45879j), Integer.valueOf(this.f45878i), 1), e);
            }
        }

        @Override // p000.i72
        public final void writeFixed64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // p000.i72
        public final void writeFixed64NoTag(long value) throws IOException {
            try {
                byte[] bArr = this.f45876g;
                int i = this.f45879j;
                int i2 = i + 1;
                this.f45879j = i2;
                bArr[i] = (byte) (((int) value) & 255);
                int i3 = i + 2;
                this.f45879j = i3;
                bArr[i2] = (byte) (((int) (value >> 8)) & 255);
                int i4 = i + 3;
                this.f45879j = i4;
                bArr[i3] = (byte) (((int) (value >> 16)) & 255);
                int i5 = i + 4;
                this.f45879j = i5;
                bArr[i4] = (byte) (((int) (value >> 24)) & 255);
                int i6 = i + 5;
                this.f45879j = i6;
                bArr[i5] = (byte) (((int) (value >> 32)) & 255);
                int i7 = i + 6;
                this.f45879j = i7;
                bArr[i6] = (byte) (((int) (value >> 40)) & 255);
                int i8 = i + 7;
                this.f45879j = i8;
                bArr[i7] = (byte) (((int) (value >> 48)) & 255);
                this.f45879j = i + 8;
                bArr[i8] = (byte) (((int) (value >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45879j), Integer.valueOf(this.f45878i), 1), e);
            }
        }

        @Override // p000.i72
        public final void writeInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // p000.i72
        public final void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // p000.i72, p000.nj1
        public final void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // p000.i72
        public final void writeMessage(final int fieldNumber, final psa value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // p000.i72
        public final void writeMessageNoTag(final psa value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // p000.i72
        public final void writeMessageSetExtension(final int fieldNumber, final psa value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // p000.i72
        public final void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            mi8.m17323a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // p000.i72
        public final void writeRawMessageSetExtension(final int fieldNumber, final wj1 value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // p000.i72
        public final void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // p000.i72
        public final void writeStringNoTag(String value) throws IOException {
            int i = this.f45879j;
            try {
                int iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(value.length() * 3);
                int iComputeUInt32SizeNoTag2 = i72.computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i2 = i + iComputeUInt32SizeNoTag2;
                    this.f45879j = i2;
                    int iM16491i = lzh.m16491i(value, this.f45876g, i2, spaceLeft());
                    this.f45879j = i;
                    writeUInt32NoTag((iM16491i - i) - iComputeUInt32SizeNoTag2);
                    this.f45879j = iM16491i;
                } else {
                    writeUInt32NoTag(lzh.m16493k(value));
                    this.f45879j = lzh.m16491i(value, this.f45876g, this.f45879j, spaceLeft());
                }
            } catch (IndexOutOfBoundsException e) {
                throw new C7166f(e);
            } catch (lzh.C9060d e2) {
                this.f45879j = i;
                m12833h(value, e2);
            }
        }

        @Override // p000.i72
        public final void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(gpi.m11819a(fieldNumber, wireType));
        }

        @Override // p000.i72
        public final void writeUInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // p000.i72
        public final void writeUInt32NoTag(int value) throws IOException {
            while ((value & (-128)) != 0) {
                try {
                    byte[] bArr = this.f45876g;
                    int i = this.f45879j;
                    this.f45879j = i + 1;
                    bArr[i] = (byte) ((value | 128) & 255);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45879j), Integer.valueOf(this.f45878i), 1), e);
                }
            }
            byte[] bArr2 = this.f45876g;
            int i2 = this.f45879j;
            this.f45879j = i2 + 1;
            bArr2[i2] = (byte) value;
        }

        @Override // p000.i72
        public final void writeUInt64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // p000.i72
        public final void writeUInt64NoTag(long value) throws IOException {
            if (i72.f45867d && spaceLeft() >= 10) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.f45876g;
                    int i = this.f45879j;
                    this.f45879j = i + 1;
                    evh.m10265S(bArr, i, (byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                }
                byte[] bArr2 = this.f45876g;
                int i2 = this.f45879j;
                this.f45879j = i2 + 1;
                evh.m10265S(bArr2, i2, (byte) value);
                return;
            }
            while ((value & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f45876g;
                    int i3 = this.f45879j;
                    this.f45879j = i3 + 1;
                    bArr3[i3] = (byte) ((((int) value) | 128) & 255);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45879j), Integer.valueOf(this.f45878i), 1), e);
                }
            }
            byte[] bArr4 = this.f45876g;
            int i4 = this.f45879j;
            this.f45879j = i4 + 1;
            bArr4[i4] = (byte) value;
        }

        @Override // p000.i72
        public final void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // p000.i72, p000.nj1
        public final void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // p000.i72, p000.nj1
        public final void write(byte[] value, int offset, int length) throws IOException {
            try {
                System.arraycopy(value, offset, this.f45876g, this.f45879j, length);
                this.f45879j += length;
            } catch (IndexOutOfBoundsException e) {
                throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45879j), Integer.valueOf(this.f45878i), Integer.valueOf(length)), e);
            }
        }

        @Override // p000.i72, p000.nj1
        public final void write(ByteBuffer value) throws IOException {
            int iRemaining = value.remaining();
            try {
                value.get(this.f45876g, this.f45879j, iRemaining);
                this.f45879j += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45879j), Integer.valueOf(this.f45878i), Integer.valueOf(iRemaining)), e);
            }
        }
    }

    /* JADX INFO: renamed from: i72$d */
    public static final class C7164d extends AbstractC7162b {

        /* JADX INFO: renamed from: k */
        public final nj1 f45880k;

        public C7164d(nj1 out, int bufferSize) {
            super(bufferSize);
            if (out == null) {
                throw new NullPointerException("out");
            }
            this.f45880k = out;
        }

        private void doFlush() throws IOException {
            this.f45880k.write(this.f45872g, 0, this.f45874i);
            this.f45874i = 0;
        }

        private void flushIfNotAvailable(int requiredSize) throws IOException {
            if (this.f45873h - this.f45874i < requiredSize) {
                doFlush();
            }
        }

        @Override // p000.i72
        public void flush() throws IOException {
            if (this.f45874i > 0) {
                doFlush();
            }
        }

        @Override // p000.i72
        /* JADX INFO: renamed from: o */
        public void mo12837o(final int fieldNumber, final psa value, upe schema) throws IOException {
            writeTag(fieldNumber, 2);
            mo12838p(value, schema);
        }

        @Override // p000.i72
        /* JADX INFO: renamed from: p */
        public void mo12838p(final psa value, upe schema) throws IOException {
            writeUInt32NoTag(((AbstractC0027a3) value).mo83d(schema));
            schema.writeTo(value, this.f45870a);
        }

        @Override // p000.i72, p000.nj1
        public void write(byte value) throws IOException {
            if (this.f45874i == this.f45873h) {
                doFlush();
            }
            m12839q(value);
        }

        @Override // p000.i72
        public void writeBool(int i, boolean z) throws IOException {
            flushIfNotAvailable(11);
            m12843u(i, 0);
            m12839q(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.i72
        public void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // p000.i72
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // p000.i72
        public void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // p000.i72
        public void writeBytes(final int fieldNumber, final wj1 value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // p000.i72
        public void writeBytesNoTag(final wj1 value) throws IOException {
            writeUInt32NoTag(value.size());
            value.mo9868p(this);
        }

        @Override // p000.i72
        public void writeFixed32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(14);
            m12843u(fieldNumber, 5);
            m12840r(value);
        }

        @Override // p000.i72
        public void writeFixed32NoTag(final int value) throws IOException {
            flushIfNotAvailable(4);
            m12840r(value);
        }

        @Override // p000.i72
        public void writeFixed64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(18);
            m12843u(fieldNumber, 1);
            m12841s(value);
        }

        @Override // p000.i72
        public void writeFixed64NoTag(final long value) throws IOException {
            flushIfNotAvailable(8);
            m12841s(value);
        }

        @Override // p000.i72
        public void writeInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            m12843u(fieldNumber, 0);
            m12842t(value);
        }

        @Override // p000.i72
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // p000.i72, p000.nj1
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            flush();
            this.f45880k.writeLazy(value, offset, length);
            this.f45875j += length;
        }

        @Override // p000.i72
        public void writeMessage(final int fieldNumber, final psa value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // p000.i72
        public void writeMessageNoTag(final psa value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // p000.i72
        public void writeMessageSetExtension(final int fieldNumber, final psa value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // p000.i72
        public void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            mi8.m17323a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // p000.i72
        public void writeRawMessageSetExtension(final int fieldNumber, final wj1 value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // p000.i72
        public void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // p000.i72
        public void writeStringNoTag(String value) throws IOException {
            int length = value.length() * 3;
            int iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(length);
            int i = iComputeUInt32SizeNoTag + length;
            int i2 = this.f45873h;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM16491i = lzh.m16491i(value, bArr, 0, length);
                writeUInt32NoTag(iM16491i);
                writeLazy(bArr, 0, iM16491i);
                return;
            }
            if (i > i2 - this.f45874i) {
                doFlush();
            }
            int i3 = this.f45874i;
            try {
                int iComputeUInt32SizeNoTag2 = i72.computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i4 = i3 + iComputeUInt32SizeNoTag2;
                    this.f45874i = i4;
                    int iM16491i2 = lzh.m16491i(value, this.f45872g, i4, this.f45873h - i4);
                    this.f45874i = i3;
                    int i5 = (iM16491i2 - i3) - iComputeUInt32SizeNoTag2;
                    m12844v(i5);
                    this.f45874i = iM16491i2;
                    this.f45875j += i5;
                } else {
                    int iM16493k = lzh.m16493k(value);
                    m12844v(iM16493k);
                    this.f45874i = lzh.m16491i(value, this.f45872g, this.f45874i, iM16493k);
                    this.f45875j += iM16493k;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new C7166f(e);
            } catch (lzh.C9060d e2) {
                this.f45875j -= this.f45874i - i3;
                this.f45874i = i3;
                m12833h(value, e2);
            }
        }

        @Override // p000.i72
        public void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(gpi.m11819a(fieldNumber, wireType));
        }

        @Override // p000.i72
        public void writeUInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            m12843u(fieldNumber, 0);
            m12844v(value);
        }

        @Override // p000.i72
        public void writeUInt32NoTag(int value) throws IOException {
            flushIfNotAvailable(5);
            m12844v(value);
        }

        @Override // p000.i72
        public void writeUInt64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(20);
            m12843u(fieldNumber, 0);
            m12845w(value);
        }

        @Override // p000.i72
        public void writeUInt64NoTag(long value) throws IOException {
            flushIfNotAvailable(10);
            m12845w(value);
        }

        @Override // p000.i72
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // p000.i72, p000.nj1
        public void write(byte[] value, int offset, int length) throws IOException {
            flush();
            this.f45880k.write(value, offset, length);
            this.f45875j += length;
        }

        @Override // p000.i72, p000.nj1
        public void writeLazy(ByteBuffer value) throws IOException {
            flush();
            int iRemaining = value.remaining();
            this.f45880k.writeLazy(value);
            this.f45875j += iRemaining;
        }

        @Override // p000.i72, p000.nj1
        public void write(ByteBuffer value) throws IOException {
            flush();
            int iRemaining = value.remaining();
            this.f45880k.write(value);
            this.f45875j += iRemaining;
        }
    }

    /* JADX INFO: renamed from: i72$e */
    public static final class C7165e extends C7163c {

        /* JADX INFO: renamed from: k */
        public final ByteBuffer f45881k;

        /* JADX INFO: renamed from: l */
        public int f45882l;

        public C7165e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f45881k = byteBuffer;
            this.f45882l = byteBuffer.position();
        }

        @Override // p000.i72.C7163c, p000.i72
        public void flush() {
            mi8.m17327e(this.f45881k, this.f45882l + getTotalBytesWritten());
        }
    }

    /* JADX INFO: renamed from: i72$f */
    public static class C7166f extends IOException {

        /* JADX INFO: renamed from: a */
        public static final String f45883a = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public C7166f() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public C7166f(String explanationMessage) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + explanationMessage);
        }

        public C7166f(Throwable cause) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", cause);
        }

        public C7166f(String explanationMessage, Throwable cause) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + explanationMessage, cause);
        }
    }

    /* JADX INFO: renamed from: i72$g */
    public static final class C7167g extends AbstractC7162b {

        /* JADX INFO: renamed from: k */
        public final OutputStream f45884k;

        public C7167g(OutputStream out, int bufferSize) {
            super(bufferSize);
            if (out == null) {
                throw new NullPointerException("out");
            }
            this.f45884k = out;
        }

        private void doFlush() throws IOException {
            this.f45884k.write(this.f45872g, 0, this.f45874i);
            this.f45874i = 0;
        }

        private void flushIfNotAvailable(int requiredSize) throws IOException {
            if (this.f45873h - this.f45874i < requiredSize) {
                doFlush();
            }
        }

        @Override // p000.i72
        public void flush() throws IOException {
            if (this.f45874i > 0) {
                doFlush();
            }
        }

        @Override // p000.i72
        /* JADX INFO: renamed from: o */
        public void mo12837o(final int fieldNumber, final psa value, upe schema) throws IOException {
            writeTag(fieldNumber, 2);
            mo12838p(value, schema);
        }

        @Override // p000.i72
        /* JADX INFO: renamed from: p */
        public void mo12838p(final psa value, upe schema) throws IOException {
            writeUInt32NoTag(((AbstractC0027a3) value).mo83d(schema));
            schema.writeTo(value, this.f45870a);
        }

        @Override // p000.i72, p000.nj1
        public void write(byte value) throws IOException {
            if (this.f45874i == this.f45873h) {
                doFlush();
            }
            m12839q(value);
        }

        @Override // p000.i72
        public void writeBool(int i, boolean z) throws IOException {
            flushIfNotAvailable(11);
            m12843u(i, 0);
            m12839q(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.i72
        public void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // p000.i72
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // p000.i72
        public void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // p000.i72
        public void writeBytes(final int fieldNumber, final wj1 value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // p000.i72
        public void writeBytesNoTag(final wj1 value) throws IOException {
            writeUInt32NoTag(value.size());
            value.mo9868p(this);
        }

        @Override // p000.i72
        public void writeFixed32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(14);
            m12843u(fieldNumber, 5);
            m12840r(value);
        }

        @Override // p000.i72
        public void writeFixed32NoTag(final int value) throws IOException {
            flushIfNotAvailable(4);
            m12840r(value);
        }

        @Override // p000.i72
        public void writeFixed64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(18);
            m12843u(fieldNumber, 1);
            m12841s(value);
        }

        @Override // p000.i72
        public void writeFixed64NoTag(final long value) throws IOException {
            flushIfNotAvailable(8);
            m12841s(value);
        }

        @Override // p000.i72
        public void writeInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            m12843u(fieldNumber, 0);
            m12842t(value);
        }

        @Override // p000.i72
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // p000.i72, p000.nj1
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // p000.i72
        public void writeMessage(final int fieldNumber, final psa value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // p000.i72
        public void writeMessageNoTag(final psa value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // p000.i72
        public void writeMessageSetExtension(final int fieldNumber, final psa value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // p000.i72
        public void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            mi8.m17323a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // p000.i72
        public void writeRawMessageSetExtension(final int fieldNumber, final wj1 value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // p000.i72
        public void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // p000.i72
        public void writeStringNoTag(String value) throws IOException {
            int iM16493k;
            try {
                int length = value.length() * 3;
                int iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(length);
                int i = iComputeUInt32SizeNoTag + length;
                int i2 = this.f45873h;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iM16491i = lzh.m16491i(value, bArr, 0, length);
                    writeUInt32NoTag(iM16491i);
                    writeLazy(bArr, 0, iM16491i);
                    return;
                }
                if (i > i2 - this.f45874i) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = i72.computeUInt32SizeNoTag(value.length());
                int i3 = this.f45874i;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i4 = i3 + iComputeUInt32SizeNoTag2;
                        this.f45874i = i4;
                        int iM16491i2 = lzh.m16491i(value, this.f45872g, i4, this.f45873h - i4);
                        this.f45874i = i3;
                        iM16493k = (iM16491i2 - i3) - iComputeUInt32SizeNoTag2;
                        m12844v(iM16493k);
                        this.f45874i = iM16491i2;
                    } else {
                        iM16493k = lzh.m16493k(value);
                        m12844v(iM16493k);
                        this.f45874i = lzh.m16491i(value, this.f45872g, this.f45874i, iM16493k);
                    }
                    this.f45875j += iM16493k;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new C7166f(e);
                } catch (lzh.C9060d e2) {
                    this.f45875j -= this.f45874i - i3;
                    this.f45874i = i3;
                    throw e2;
                }
            } catch (lzh.C9060d e3) {
                m12833h(value, e3);
            }
        }

        @Override // p000.i72
        public void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(gpi.m11819a(fieldNumber, wireType));
        }

        @Override // p000.i72
        public void writeUInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            m12843u(fieldNumber, 0);
            m12844v(value);
        }

        @Override // p000.i72
        public void writeUInt32NoTag(int value) throws IOException {
            flushIfNotAvailable(5);
            m12844v(value);
        }

        @Override // p000.i72
        public void writeUInt64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(20);
            m12843u(fieldNumber, 0);
            m12845w(value);
        }

        @Override // p000.i72
        public void writeUInt64NoTag(long value) throws IOException {
            flushIfNotAvailable(10);
            m12845w(value);
        }

        @Override // p000.i72
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // p000.i72, p000.nj1
        public void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // p000.i72, p000.nj1
        public void write(byte[] value, int offset, int length) throws IOException {
            int i = this.f45873h;
            int i2 = this.f45874i;
            if (i - i2 >= length) {
                System.arraycopy(value, offset, this.f45872g, i2, length);
                this.f45874i += length;
                this.f45875j += length;
                return;
            }
            int i3 = i - i2;
            System.arraycopy(value, offset, this.f45872g, i2, i3);
            int i4 = offset + i3;
            int i5 = length - i3;
            this.f45874i = this.f45873h;
            this.f45875j += i3;
            doFlush();
            if (i5 <= this.f45873h) {
                System.arraycopy(value, i4, this.f45872g, 0, i5);
                this.f45874i = i5;
            } else {
                this.f45884k.write(value, i4, i5);
            }
            this.f45875j += i5;
        }

        @Override // p000.i72, p000.nj1
        public void write(ByteBuffer value) throws IOException {
            int iRemaining = value.remaining();
            int i = this.f45873h;
            int i2 = this.f45874i;
            if (i - i2 >= iRemaining) {
                value.get(this.f45872g, i2, iRemaining);
                this.f45874i += iRemaining;
                this.f45875j += iRemaining;
                return;
            }
            int i3 = i - i2;
            value.get(this.f45872g, i2, i3);
            int i4 = iRemaining - i3;
            this.f45874i = this.f45873h;
            this.f45875j += i3;
            doFlush();
            while (true) {
                int i5 = this.f45873h;
                if (i4 > i5) {
                    value.get(this.f45872g, 0, i5);
                    this.f45884k.write(this.f45872g, 0, this.f45873h);
                    int i6 = this.f45873h;
                    i4 -= i6;
                    this.f45875j += i6;
                } else {
                    value.get(this.f45872g, 0, i4);
                    this.f45874i = i4;
                    this.f45875j += i4;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i72$h */
    public static final class C7168h extends i72 {

        /* JADX INFO: renamed from: g */
        public final ByteBuffer f45885g;

        /* JADX INFO: renamed from: h */
        public final ByteBuffer f45886h;

        /* JADX INFO: renamed from: i */
        public final int f45887i;

        public C7168h(ByteBuffer buffer) {
            super();
            this.f45885g = buffer;
            this.f45886h = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f45887i = buffer.position();
        }

        private void encode(String value) throws IOException {
            try {
                lzh.m16492j(value, this.f45886h);
            } catch (IndexOutOfBoundsException e) {
                throw new C7166f(e);
            }
        }

        @Override // p000.i72
        public void flush() {
            mi8.m17327e(this.f45885g, this.f45886h.position());
        }

        @Override // p000.i72
        public int getTotalBytesWritten() {
            return this.f45886h.position() - this.f45887i;
        }

        @Override // p000.i72
        /* JADX INFO: renamed from: o */
        public void mo12837o(final int fieldNumber, final psa value, upe schema) throws IOException {
            writeTag(fieldNumber, 2);
            mo12838p(value, schema);
        }

        @Override // p000.i72
        /* JADX INFO: renamed from: p */
        public void mo12838p(final psa value, upe schema) throws IOException {
            writeUInt32NoTag(((AbstractC0027a3) value).mo83d(schema));
            schema.writeTo(value, this.f45870a);
        }

        @Override // p000.i72
        public int spaceLeft() {
            return this.f45886h.remaining();
        }

        @Override // p000.i72, p000.nj1
        public void write(byte value) throws IOException {
            try {
                this.f45886h.put(value);
            } catch (BufferOverflowException e) {
                throw new C7166f(e);
            }
        }

        @Override // p000.i72
        public void writeBool(int i, boolean z) throws IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.i72
        public void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // p000.i72
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // p000.i72
        public void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // p000.i72
        public void writeBytes(final int fieldNumber, final wj1 value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // p000.i72
        public void writeBytesNoTag(final wj1 value) throws IOException {
            writeUInt32NoTag(value.size());
            value.mo9868p(this);
        }

        @Override // p000.i72
        public void writeFixed32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // p000.i72
        public void writeFixed32NoTag(int value) throws IOException {
            try {
                this.f45886h.putInt(value);
            } catch (BufferOverflowException e) {
                throw new C7166f(e);
            }
        }

        @Override // p000.i72
        public void writeFixed64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // p000.i72
        public void writeFixed64NoTag(long value) throws IOException {
            try {
                this.f45886h.putLong(value);
            } catch (BufferOverflowException e) {
                throw new C7166f(e);
            }
        }

        @Override // p000.i72
        public void writeInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // p000.i72
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // p000.i72, p000.nj1
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // p000.i72
        public void writeMessage(final int fieldNumber, final psa value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // p000.i72
        public void writeMessageNoTag(final psa value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // p000.i72
        public void writeMessageSetExtension(final int fieldNumber, final psa value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // p000.i72
        public void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            mi8.m17323a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // p000.i72
        public void writeRawMessageSetExtension(final int fieldNumber, final wj1 value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // p000.i72
        public void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // p000.i72
        public void writeStringNoTag(String value) throws IOException {
            int iPosition = this.f45886h.position();
            try {
                int iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(value.length() * 3);
                int iComputeUInt32SizeNoTag2 = i72.computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iPosition2 = this.f45886h.position() + iComputeUInt32SizeNoTag2;
                    mi8.m17327e(this.f45886h, iPosition2);
                    encode(value);
                    int iPosition3 = this.f45886h.position();
                    mi8.m17327e(this.f45886h, iPosition);
                    writeUInt32NoTag(iPosition3 - iPosition2);
                    mi8.m17327e(this.f45886h, iPosition3);
                } else {
                    writeUInt32NoTag(lzh.m16493k(value));
                    encode(value);
                }
            } catch (lzh.C9060d e) {
                mi8.m17327e(this.f45886h, iPosition);
                m12833h(value, e);
            } catch (IllegalArgumentException e2) {
                throw new C7166f(e2);
            }
        }

        @Override // p000.i72
        public void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(gpi.m11819a(fieldNumber, wireType));
        }

        @Override // p000.i72
        public void writeUInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // p000.i72
        public void writeUInt32NoTag(int value) throws IOException {
            while ((value & (-128)) != 0) {
                try {
                    this.f45886h.put((byte) ((value | 128) & 255));
                    value >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new C7166f(e);
                }
            }
            this.f45886h.put((byte) value);
        }

        @Override // p000.i72
        public void writeUInt64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // p000.i72
        public void writeUInt64NoTag(long value) throws IOException {
            while (((-128) & value) != 0) {
                try {
                    this.f45886h.put((byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new C7166f(e);
                }
            }
            this.f45886h.put((byte) value);
        }

        @Override // p000.i72
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // p000.i72, p000.nj1
        public void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // p000.i72, p000.nj1
        public void write(byte[] value, int offset, int length) throws IOException {
            try {
                this.f45886h.put(value, offset, length);
            } catch (IndexOutOfBoundsException e) {
                throw new C7166f(e);
            } catch (BufferOverflowException e2) {
                throw new C7166f(e2);
            }
        }

        @Override // p000.i72, p000.nj1
        public void write(ByteBuffer value) throws IOException {
            try {
                this.f45886h.put(value);
            } catch (BufferOverflowException e) {
                throw new C7166f(e);
            }
        }
    }

    /* JADX INFO: renamed from: i72$i */
    public static final class C7169i extends i72 {

        /* JADX INFO: renamed from: g */
        public final ByteBuffer f45888g;

        /* JADX INFO: renamed from: h */
        public final ByteBuffer f45889h;

        /* JADX INFO: renamed from: i */
        public final long f45890i;

        /* JADX INFO: renamed from: j */
        public final long f45891j;

        /* JADX INFO: renamed from: k */
        public final long f45892k;

        /* JADX INFO: renamed from: l */
        public final long f45893l;

        /* JADX INFO: renamed from: m */
        public long f45894m;

        public C7169i(ByteBuffer buffer) {
            super();
            this.f45888g = buffer;
            this.f45889h = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jM10288k = evh.m10288k(buffer);
            this.f45890i = jM10288k;
            long jPosition = ((long) buffer.position()) + jM10288k;
            this.f45891j = jPosition;
            long jLimit = jM10288k + ((long) buffer.limit());
            this.f45892k = jLimit;
            this.f45893l = jLimit - 10;
            this.f45894m = jPosition;
        }

        private int bufferPos(long pos) {
            return (int) (pos - this.f45890i);
        }

        public static boolean isSupported() {
            return evh.m10257K();
        }

        private void repositionBuffer(long pos) {
            mi8.m17327e(this.f45889h, bufferPos(pos));
        }

        @Override // p000.i72
        public void flush() {
            mi8.m17327e(this.f45888g, bufferPos(this.f45894m));
        }

        @Override // p000.i72
        public int getTotalBytesWritten() {
            return (int) (this.f45894m - this.f45891j);
        }

        @Override // p000.i72
        /* JADX INFO: renamed from: o */
        public void mo12837o(int fieldNumber, psa value, upe schema) throws IOException {
            writeTag(fieldNumber, 2);
            mo12838p(value, schema);
        }

        @Override // p000.i72
        /* JADX INFO: renamed from: p */
        public void mo12838p(psa value, upe schema) throws IOException {
            writeUInt32NoTag(((AbstractC0027a3) value).mo83d(schema));
            schema.writeTo(value, this.f45870a);
        }

        @Override // p000.i72
        public int spaceLeft() {
            return (int) (this.f45892k - this.f45894m);
        }

        @Override // p000.i72, p000.nj1
        public void write(byte value) throws IOException {
            long j = this.f45894m;
            if (j >= this.f45892k) {
                throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45894m), Long.valueOf(this.f45892k), 1));
            }
            this.f45894m = 1 + j;
            evh.m10263Q(j, value);
        }

        @Override // p000.i72
        public void writeBool(int i, boolean z) throws IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.i72
        public void writeByteArray(int fieldNumber, byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // p000.i72
        public void writeByteArrayNoTag(byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // p000.i72
        public void writeByteBuffer(int fieldNumber, ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // p000.i72
        public void writeBytes(int fieldNumber, wj1 value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // p000.i72
        public void writeBytesNoTag(wj1 value) throws IOException {
            writeUInt32NoTag(value.size());
            value.mo9868p(this);
        }

        @Override // p000.i72
        public void writeFixed32(int fieldNumber, int value) throws IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // p000.i72
        public void writeFixed32NoTag(int value) throws IOException {
            this.f45889h.putInt(bufferPos(this.f45894m), value);
            this.f45894m += 4;
        }

        @Override // p000.i72
        public void writeFixed64(int fieldNumber, long value) throws IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // p000.i72
        public void writeFixed64NoTag(long value) throws IOException {
            this.f45889h.putLong(bufferPos(this.f45894m), value);
            this.f45894m += 8;
        }

        @Override // p000.i72
        public void writeInt32(int fieldNumber, int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // p000.i72
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // p000.i72, p000.nj1
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // p000.i72
        public void writeMessage(int fieldNumber, psa value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // p000.i72
        public void writeMessageNoTag(psa value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // p000.i72
        public void writeMessageSetExtension(int fieldNumber, psa value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // p000.i72
        public void writeRawBytes(ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            mi8.m17323a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // p000.i72
        public void writeRawMessageSetExtension(int fieldNumber, wj1 value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // p000.i72
        public void writeString(int fieldNumber, String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // p000.i72
        public void writeStringNoTag(String value) throws IOException {
            long j = this.f45894m;
            try {
                int iComputeUInt32SizeNoTag = i72.computeUInt32SizeNoTag(value.length() * 3);
                int iComputeUInt32SizeNoTag2 = i72.computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iBufferPos = bufferPos(this.f45894m) + iComputeUInt32SizeNoTag2;
                    mi8.m17327e(this.f45889h, iBufferPos);
                    lzh.m16492j(value, this.f45889h);
                    int iPosition = this.f45889h.position() - iBufferPos;
                    writeUInt32NoTag(iPosition);
                    this.f45894m += (long) iPosition;
                } else {
                    int iM16493k = lzh.m16493k(value);
                    writeUInt32NoTag(iM16493k);
                    repositionBuffer(this.f45894m);
                    lzh.m16492j(value, this.f45889h);
                    this.f45894m += (long) iM16493k;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new C7166f(e);
            } catch (lzh.C9060d e2) {
                this.f45894m = j;
                repositionBuffer(j);
                m12833h(value, e2);
            } catch (IllegalArgumentException e3) {
                throw new C7166f(e3);
            }
        }

        @Override // p000.i72
        public void writeTag(int fieldNumber, int wireType) throws IOException {
            writeUInt32NoTag(gpi.m11819a(fieldNumber, wireType));
        }

        @Override // p000.i72
        public void writeUInt32(int fieldNumber, int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // p000.i72
        public void writeUInt32NoTag(int value) throws IOException {
            if (this.f45894m <= this.f45893l) {
                while ((value & (-128)) != 0) {
                    long j = this.f45894m;
                    this.f45894m = j + 1;
                    evh.m10263Q(j, (byte) ((value | 128) & 255));
                    value >>>= 7;
                }
                long j2 = this.f45894m;
                this.f45894m = 1 + j2;
                evh.m10263Q(j2, (byte) value);
                return;
            }
            while (true) {
                long j3 = this.f45894m;
                if (j3 >= this.f45892k) {
                    throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45894m), Long.valueOf(this.f45892k), 1));
                }
                if ((value & (-128)) == 0) {
                    this.f45894m = 1 + j3;
                    evh.m10263Q(j3, (byte) value);
                    return;
                } else {
                    this.f45894m = j3 + 1;
                    evh.m10263Q(j3, (byte) ((value | 128) & 255));
                    value >>>= 7;
                }
            }
        }

        @Override // p000.i72
        public void writeUInt64(int fieldNumber, long value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // p000.i72
        public void writeUInt64NoTag(long value) throws IOException {
            if (this.f45894m <= this.f45893l) {
                while ((value & (-128)) != 0) {
                    long j = this.f45894m;
                    this.f45894m = j + 1;
                    evh.m10263Q(j, (byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                }
                long j2 = this.f45894m;
                this.f45894m = 1 + j2;
                evh.m10263Q(j2, (byte) value);
                return;
            }
            while (true) {
                long j3 = this.f45894m;
                if (j3 >= this.f45892k) {
                    throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45894m), Long.valueOf(this.f45892k), 1));
                }
                if ((value & (-128)) == 0) {
                    this.f45894m = 1 + j3;
                    evh.m10263Q(j3, (byte) value);
                    return;
                } else {
                    this.f45894m = j3 + 1;
                    evh.m10263Q(j3, (byte) ((((int) value) | 128) & 255));
                    value >>>= 7;
                }
            }
        }

        @Override // p000.i72
        public void writeByteArray(int fieldNumber, byte[] value, int offset, int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // p000.i72, p000.nj1
        public void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // p000.i72, p000.nj1
        public void write(byte[] value, int offset, int length) throws IOException {
            if (value != null && offset >= 0 && length >= 0 && value.length - length >= offset) {
                long j = length;
                long j2 = this.f45892k - j;
                long j3 = this.f45894m;
                if (j2 >= j3) {
                    evh.m10291n(value, offset, j3, j);
                    this.f45894m += j;
                    return;
                }
            }
            if (value == null) {
                throw new NullPointerException("value");
            }
            throw new C7166f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45894m), Long.valueOf(this.f45892k), Integer.valueOf(length)));
        }

        @Override // p000.i72, p000.nj1
        public void write(ByteBuffer value) throws IOException {
            try {
                int iRemaining = value.remaining();
                repositionBuffer(this.f45894m);
                this.f45889h.put(value);
                this.f45894m += (long) iRemaining;
            } catch (BufferOverflowException e) {
                throw new C7166f(e);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static int m12824b(final int fieldNumber, final psa value, upe schema) {
        return (computeTagSize(fieldNumber) * 2) + m12825c(value, schema);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static int m12825c(final psa value, upe schema) {
        return ((AbstractC0027a3) value).mo83d(schema);
    }

    public static int computeBoolSize(final int fieldNumber, final boolean value) {
        return computeTagSize(fieldNumber) + computeBoolSizeNoTag(value);
    }

    public static int computeBoolSizeNoTag(final boolean unused) {
        return 1;
    }

    public static int computeByteArraySize(final int fieldNumber, final byte[] value) {
        return computeTagSize(fieldNumber) + computeByteArraySizeNoTag(value);
    }

    public static int computeByteArraySizeNoTag(final byte[] value) {
        return m12826d(value.length);
    }

    public static int computeByteBufferSize(final int fieldNumber, final ByteBuffer value) {
        return computeTagSize(fieldNumber) + computeByteBufferSizeNoTag(value);
    }

    public static int computeByteBufferSizeNoTag(final ByteBuffer value) {
        return m12826d(value.capacity());
    }

    public static int computeBytesSize(final int fieldNumber, final wj1 value) {
        return computeTagSize(fieldNumber) + computeBytesSizeNoTag(value);
    }

    public static int computeBytesSizeNoTag(final wj1 value) {
        return m12826d(value.size());
    }

    public static int computeDoubleSize(final int fieldNumber, final double value) {
        return computeTagSize(fieldNumber) + computeDoubleSizeNoTag(value);
    }

    public static int computeDoubleSizeNoTag(final double unused) {
        return 8;
    }

    public static int computeEnumSize(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeEnumSizeNoTag(value);
    }

    public static int computeEnumSizeNoTag(final int value) {
        return computeInt32SizeNoTag(value);
    }

    public static int computeFixed32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeFixed32SizeNoTag(value);
    }

    public static int computeFixed32SizeNoTag(final int unused) {
        return 4;
    }

    public static int computeFixed64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeFixed64SizeNoTag(value);
    }

    public static int computeFixed64SizeNoTag(final long unused) {
        return 8;
    }

    public static int computeFloatSize(final int fieldNumber, final float value) {
        return computeTagSize(fieldNumber) + computeFloatSizeNoTag(value);
    }

    public static int computeFloatSizeNoTag(final float unused) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(final int fieldNumber, final psa value) {
        return (computeTagSize(fieldNumber) * 2) + value.getSerializedSize();
    }

    @r28(replacement = "value.getSerializedSize()")
    @Deprecated
    public static int computeGroupSizeNoTag(final psa value) {
        return value.getSerializedSize();
    }

    public static int computeInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeInt32SizeNoTag(value);
    }

    public static int computeInt32SizeNoTag(final int value) {
        return computeUInt64SizeNoTag(value);
    }

    public static int computeInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeInt64SizeNoTag(value);
    }

    public static int computeInt64SizeNoTag(final long value) {
        return computeUInt64SizeNoTag(value);
    }

    public static int computeLazyFieldMessageSetExtensionSize(final int fieldNumber, final qx8 value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeLazyFieldSize(3, value);
    }

    public static int computeLazyFieldSize(final int fieldNumber, final qx8 value) {
        return computeTagSize(fieldNumber) + computeLazyFieldSizeNoTag(value);
    }

    public static int computeLazyFieldSizeNoTag(final qx8 value) {
        return m12826d(value.getSerializedSize());
    }

    public static int computeMessageSetExtensionSize(final int fieldNumber, final psa value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeMessageSize(3, value);
    }

    public static int computeMessageSize(final int fieldNumber, final psa value) {
        return computeTagSize(fieldNumber) + computeMessageSizeNoTag(value);
    }

    public static int computeMessageSizeNoTag(final psa value) {
        return m12826d(value.getSerializedSize());
    }

    public static int computeRawMessageSetExtensionSize(final int fieldNumber, final wj1 value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeBytesSize(3, value);
    }

    @r28(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt32SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint32Size(final int value) {
        return computeUInt32SizeNoTag(value);
    }

    @r28(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt64SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint64Size(long value) {
        return computeUInt64SizeNoTag(value);
    }

    public static int computeSFixed32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeSFixed32SizeNoTag(value);
    }

    public static int computeSFixed32SizeNoTag(final int unused) {
        return 4;
    }

    public static int computeSFixed64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeSFixed64SizeNoTag(value);
    }

    public static int computeSFixed64SizeNoTag(final long unused) {
        return 8;
    }

    public static int computeSInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeSInt32SizeNoTag(value);
    }

    public static int computeSInt32SizeNoTag(final int value) {
        return computeUInt32SizeNoTag(encodeZigZag32(value));
    }

    public static int computeSInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeSInt64SizeNoTag(value);
    }

    public static int computeSInt64SizeNoTag(final long value) {
        return computeUInt64SizeNoTag(encodeZigZag64(value));
    }

    public static int computeStringSize(final int fieldNumber, final String value) {
        return computeTagSize(fieldNumber) + computeStringSizeNoTag(value);
    }

    public static int computeStringSizeNoTag(final String value) {
        int length;
        try {
            length = lzh.m16493k(value);
        } catch (lzh.C9060d unused) {
            length = value.getBytes(v98.f90380b).length;
        }
        return m12826d(length);
    }

    public static int computeTagSize(final int fieldNumber) {
        return computeUInt32SizeNoTag(gpi.m11819a(fieldNumber, 0));
    }

    public static int computeUInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeUInt32SizeNoTag(value);
    }

    public static int computeUInt32SizeNoTag(final int value) {
        return (352 - (Integer.numberOfLeadingZeros(value) * 9)) >>> 6;
    }

    public static int computeUInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeUInt64SizeNoTag(value);
    }

    public static int computeUInt64SizeNoTag(long value) {
        return (640 - (Long.numberOfLeadingZeros(value) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: d */
    public static int m12826d(int fieldLength) {
        return computeUInt32SizeNoTag(fieldLength) + fieldLength;
    }

    /* JADX INFO: renamed from: e */
    public static int m12827e(final int fieldNumber, final psa value, final upe schema) {
        return computeTagSize(fieldNumber) + m12828f(value, schema);
    }

    public static int encodeZigZag32(final int n) {
        return (n >> 31) ^ (n << 1);
    }

    public static long encodeZigZag64(final long n) {
        return (n >> 63) ^ (n << 1);
    }

    /* JADX INFO: renamed from: f */
    public static int m12828f(final psa value, final upe schema) {
        return m12826d(((AbstractC0027a3) value).mo83d(schema));
    }

    /* JADX INFO: renamed from: g */
    public static int m12829g(int dataLength) {
        if (dataLength > 4096) {
            return 4096;
        }
        return dataLength;
    }

    /* JADX INFO: renamed from: j */
    public static i72 m12830j(nj1 byteOutput, int bufferSize) {
        if (bufferSize >= 0) {
            return new C7164d(byteOutput, bufferSize);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    /* JADX INFO: renamed from: k */
    public static i72 m12831k(ByteBuffer buffer) {
        return new C7168h(buffer);
    }

    /* JADX INFO: renamed from: l */
    public static i72 m12832l(ByteBuffer buffer) {
        return new C7169i(buffer);
    }

    public static i72 newInstance(final OutputStream output) {
        return newInstance(output, 4096);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    /* JADX INFO: renamed from: h */
    public final void m12833h(String value, lzh.C9060d cause) throws IOException {
        f45866c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cause);
        byte[] bytes = value.getBytes(v98.f90380b);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C7166f(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m12834i() {
        return this.f45871b;
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public final void m12835m(final int fieldNumber, final psa value, upe schema) throws IOException {
        writeTag(fieldNumber, 3);
        m12836n(value, schema);
        writeTag(fieldNumber, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public final void m12836n(final psa value, upe schema) throws IOException {
        schema.writeTo(value, this.f45870a);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo12837o(final int fieldNumber, final psa value, upe schema) throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract void mo12838p(final psa value, upe schema) throws IOException;

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.f45871b = true;
    }

    @Override // p000.nj1
    public abstract void write(byte value) throws IOException;

    @Override // p000.nj1
    public abstract void write(ByteBuffer value) throws IOException;

    @Override // p000.nj1
    public abstract void write(byte[] value, int offset, int length) throws IOException;

    public abstract void writeBool(int fieldNumber, boolean value) throws IOException;

    public final void writeBoolNoTag(boolean z) throws IOException {
        write(z ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int fieldNumber, byte[] value) throws IOException;

    public abstract void writeByteArray(int fieldNumber, byte[] value, int offset, int length) throws IOException;

    public final void writeByteArrayNoTag(final byte[] value) throws IOException {
        writeByteArrayNoTag(value, 0, value.length);
    }

    public abstract void writeByteArrayNoTag(final byte[] value, final int offset, final int length) throws IOException;

    public abstract void writeByteBuffer(int fieldNumber, ByteBuffer value) throws IOException;

    public abstract void writeBytes(int fieldNumber, wj1 value) throws IOException;

    public abstract void writeBytesNoTag(final wj1 value) throws IOException;

    public final void writeDouble(final int fieldNumber, final double value) throws IOException {
        writeFixed64(fieldNumber, Double.doubleToRawLongBits(value));
    }

    public final void writeDoubleNoTag(final double value) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(value));
    }

    public final void writeEnum(final int fieldNumber, final int value) throws IOException {
        writeInt32(fieldNumber, value);
    }

    public final void writeEnumNoTag(final int value) throws IOException {
        writeInt32NoTag(value);
    }

    public abstract void writeFixed32(int fieldNumber, int value) throws IOException;

    public abstract void writeFixed32NoTag(int value) throws IOException;

    public abstract void writeFixed64(int fieldNumber, long value) throws IOException;

    public abstract void writeFixed64NoTag(long value) throws IOException;

    public final void writeFloat(final int fieldNumber, final float value) throws IOException {
        writeFixed32(fieldNumber, Float.floatToRawIntBits(value));
    }

    public final void writeFloatNoTag(final float value) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(value));
    }

    @Deprecated
    public final void writeGroup(final int fieldNumber, final psa value) throws IOException {
        writeTag(fieldNumber, 3);
        writeGroupNoTag(value);
        writeTag(fieldNumber, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(final psa value) throws IOException {
        value.writeTo(this);
    }

    public abstract void writeInt32(int fieldNumber, int value) throws IOException;

    public abstract void writeInt32NoTag(final int value) throws IOException;

    public final void writeInt64(final int fieldNumber, final long value) throws IOException {
        writeUInt64(fieldNumber, value);
    }

    public final void writeInt64NoTag(final long value) throws IOException {
        writeUInt64NoTag(value);
    }

    @Override // p000.nj1
    public abstract void writeLazy(ByteBuffer value) throws IOException;

    @Override // p000.nj1
    public abstract void writeLazy(byte[] value, int offset, int length) throws IOException;

    public abstract void writeMessage(final int fieldNumber, final psa value) throws IOException;

    public abstract void writeMessageNoTag(final psa value) throws IOException;

    public abstract void writeMessageSetExtension(final int fieldNumber, final psa value) throws IOException;

    public final void writeRawByte(final byte value) throws IOException {
        write(value);
    }

    public abstract void writeRawBytes(final ByteBuffer value) throws IOException;

    public final void writeRawBytes(final byte[] value) throws IOException {
        write(value, 0, value.length);
    }

    @r28(replacement = "this.writeFixed32NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian32(final int value) throws IOException {
        writeFixed32NoTag(value);
    }

    @r28(replacement = "this.writeFixed64NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian64(final long value) throws IOException {
        writeFixed64NoTag(value);
    }

    public abstract void writeRawMessageSetExtension(final int fieldNumber, final wj1 value) throws IOException;

    @r28(replacement = "this.writeUInt32NoTag(value)")
    @Deprecated
    public final void writeRawVarint32(int value) throws IOException {
        writeUInt32NoTag(value);
    }

    @r28(replacement = "this.writeUInt64NoTag(value)")
    @Deprecated
    public final void writeRawVarint64(long value) throws IOException {
        writeUInt64NoTag(value);
    }

    public final void writeSFixed32(final int fieldNumber, final int value) throws IOException {
        writeFixed32(fieldNumber, value);
    }

    public final void writeSFixed32NoTag(final int value) throws IOException {
        writeFixed32NoTag(value);
    }

    public final void writeSFixed64(final int fieldNumber, final long value) throws IOException {
        writeFixed64(fieldNumber, value);
    }

    public final void writeSFixed64NoTag(final long value) throws IOException {
        writeFixed64NoTag(value);
    }

    public final void writeSInt32(final int fieldNumber, final int value) throws IOException {
        writeUInt32(fieldNumber, encodeZigZag32(value));
    }

    public final void writeSInt32NoTag(final int value) throws IOException {
        writeUInt32NoTag(encodeZigZag32(value));
    }

    public final void writeSInt64(final int fieldNumber, final long value) throws IOException {
        writeUInt64(fieldNumber, encodeZigZag64(value));
    }

    public final void writeSInt64NoTag(final long value) throws IOException {
        writeUInt64NoTag(encodeZigZag64(value));
    }

    public abstract void writeString(int fieldNumber, String value) throws IOException;

    public abstract void writeStringNoTag(String value) throws IOException;

    public abstract void writeTag(int fieldNumber, int wireType) throws IOException;

    public abstract void writeUInt32(int fieldNumber, int value) throws IOException;

    public abstract void writeUInt32NoTag(int value) throws IOException;

    public abstract void writeUInt64(int fieldNumber, long value) throws IOException;

    public abstract void writeUInt64NoTag(long value) throws IOException;

    private i72() {
    }

    public static i72 newInstance(final OutputStream output, final int bufferSize) {
        return new C7167g(output, bufferSize);
    }

    public final void writeRawByte(final int value) throws IOException {
        write((byte) value);
    }

    public final void writeRawBytes(final byte[] value, int offset, int length) throws IOException {
        write(value, offset, length);
    }

    public static i72 newInstance(final byte[] flatArray) {
        return newInstance(flatArray, 0, flatArray.length);
    }

    public final void writeRawBytes(final wj1 value) throws IOException {
        value.mo9868p(this);
    }

    public static i72 newInstance(final byte[] flatArray, final int offset, final int length) {
        return new C7163c(flatArray, offset, length);
    }

    public static i72 newInstance(ByteBuffer buffer) {
        if (buffer.hasArray()) {
            return new C7165e(buffer);
        }
        if (buffer.isDirect() && !buffer.isReadOnly()) {
            if (C7169i.isSupported()) {
                return m12832l(buffer);
            }
            return m12831k(buffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static i72 newInstance(ByteBuffer byteBuffer, int unused) {
        return newInstance(byteBuffer);
    }
}
