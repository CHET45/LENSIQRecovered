package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.pzh;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j72 extends mj1 {

    /* JADX INFO: renamed from: c */
    public static final Logger f49661c = Logger.getLogger(j72.class.getName());

    /* JADX INFO: renamed from: d */
    public static final boolean f49662d = dvh.m9447J();

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final int f49663e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f49664f = 4096;

    /* JADX INFO: renamed from: a */
    public l72 f49665a;

    /* JADX INFO: renamed from: b */
    public boolean f49666b;

    /* JADX INFO: renamed from: j72$b */
    public static abstract class AbstractC7763b extends j72 {

        /* JADX INFO: renamed from: g */
        public final byte[] f49667g;

        /* JADX INFO: renamed from: h */
        public final int f49668h;

        /* JADX INFO: renamed from: i */
        public int f49669i;

        /* JADX INFO: renamed from: j */
        public int f49670j;

        public AbstractC7763b(int bufferSize) {
            super();
            if (bufferSize < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(bufferSize, 20)];
            this.f49667g = bArr;
            this.f49668h = bArr.length;
        }

        @Override // p000.j72
        public final int getTotalBytesWritten() {
            return this.f49670j;
        }

        /* JADX INFO: renamed from: q */
        public final void m13771q(byte value) {
            byte[] bArr = this.f49667g;
            int i = this.f49669i;
            this.f49669i = i + 1;
            bArr[i] = value;
            this.f49670j++;
        }

        /* JADX INFO: renamed from: r */
        public final void m13772r(int value) {
            byte[] bArr = this.f49667g;
            int i = this.f49669i;
            int i2 = i + 1;
            this.f49669i = i2;
            bArr[i] = (byte) (value & 255);
            int i3 = i + 2;
            this.f49669i = i3;
            bArr[i2] = (byte) ((value >> 8) & 255);
            int i4 = i + 3;
            this.f49669i = i4;
            bArr[i3] = (byte) ((value >> 16) & 255);
            this.f49669i = i + 4;
            bArr[i4] = (byte) ((value >> 24) & 255);
            this.f49670j += 4;
        }

        /* JADX INFO: renamed from: s */
        public final void m13773s(long value) {
            byte[] bArr = this.f49667g;
            int i = this.f49669i;
            int i2 = i + 1;
            this.f49669i = i2;
            bArr[i] = (byte) (value & 255);
            int i3 = i + 2;
            this.f49669i = i3;
            bArr[i2] = (byte) ((value >> 8) & 255);
            int i4 = i + 3;
            this.f49669i = i4;
            bArr[i3] = (byte) ((value >> 16) & 255);
            int i5 = i + 4;
            this.f49669i = i5;
            bArr[i4] = (byte) (255 & (value >> 24));
            int i6 = i + 5;
            this.f49669i = i6;
            bArr[i5] = (byte) (((int) (value >> 32)) & 255);
            int i7 = i + 6;
            this.f49669i = i7;
            bArr[i6] = (byte) (((int) (value >> 40)) & 255);
            int i8 = i + 7;
            this.f49669i = i8;
            bArr[i7] = (byte) (((int) (value >> 48)) & 255);
            this.f49669i = i + 8;
            bArr[i8] = (byte) (((int) (value >> 56)) & 255);
            this.f49670j += 8;
        }

        @Override // p000.j72
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* JADX INFO: renamed from: t */
        public final void m13774t(final int value) {
            if (value >= 0) {
                m13776v(value);
            } else {
                m13777w(value);
            }
        }

        /* JADX INFO: renamed from: u */
        public final void m13775u(final int fieldNumber, final int wireType) {
            m13776v(hpi.m12536a(fieldNumber, wireType));
        }

        /* JADX INFO: renamed from: v */
        public final void m13776v(int value) {
            if (!j72.f49662d) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.f49667g;
                    int i = this.f49669i;
                    this.f49669i = i + 1;
                    bArr[i] = (byte) ((value & 127) | 128);
                    this.f49670j++;
                    value >>>= 7;
                }
                byte[] bArr2 = this.f49667g;
                int i2 = this.f49669i;
                this.f49669i = i2 + 1;
                bArr2[i2] = (byte) value;
                this.f49670j++;
                return;
            }
            long j = this.f49669i;
            while ((value & (-128)) != 0) {
                byte[] bArr3 = this.f49667g;
                int i3 = this.f49669i;
                this.f49669i = i3 + 1;
                dvh.m9456S(bArr3, i3, (byte) ((value & 127) | 128));
                value >>>= 7;
            }
            byte[] bArr4 = this.f49667g;
            int i4 = this.f49669i;
            this.f49669i = i4 + 1;
            dvh.m9456S(bArr4, i4, (byte) value);
            this.f49670j += (int) (((long) this.f49669i) - j);
        }

        /* JADX INFO: renamed from: w */
        public final void m13777w(long value) {
            if (!j72.f49662d) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.f49667g;
                    int i = this.f49669i;
                    this.f49669i = i + 1;
                    bArr[i] = (byte) ((((int) value) & 127) | 128);
                    this.f49670j++;
                    value >>>= 7;
                }
                byte[] bArr2 = this.f49667g;
                int i2 = this.f49669i;
                this.f49669i = i2 + 1;
                bArr2[i2] = (byte) value;
                this.f49670j++;
                return;
            }
            long j = this.f49669i;
            while ((value & (-128)) != 0) {
                byte[] bArr3 = this.f49667g;
                int i3 = this.f49669i;
                this.f49669i = i3 + 1;
                dvh.m9456S(bArr3, i3, (byte) ((((int) value) & 127) | 128));
                value >>>= 7;
            }
            byte[] bArr4 = this.f49667g;
            int i4 = this.f49669i;
            this.f49669i = i4 + 1;
            dvh.m9456S(bArr4, i4, (byte) value);
            this.f49670j += (int) (((long) this.f49669i) - j);
        }
    }

    /* JADX INFO: renamed from: j72$c */
    public static class C7764c extends j72 {

        /* JADX INFO: renamed from: g */
        public final byte[] f49671g;

        /* JADX INFO: renamed from: h */
        public final int f49672h;

        /* JADX INFO: renamed from: i */
        public final int f49673i;

        /* JADX INFO: renamed from: j */
        public int f49674j;

        public C7764c(byte[] buffer, int offset, int length) {
            super();
            if (buffer == null) {
                throw new NullPointerException("buffer");
            }
            int i = offset + length;
            if ((offset | length | (buffer.length - i)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(buffer.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            this.f49671g = buffer;
            this.f49672h = offset;
            this.f49674j = offset;
            this.f49673i = i;
        }

        @Override // p000.j72
        public void flush() {
        }

        @Override // p000.j72
        public final int getTotalBytesWritten() {
            return this.f49674j - this.f49672h;
        }

        @Override // p000.j72
        /* JADX INFO: renamed from: o */
        public final void mo13769o(final int fieldNumber, final qsa value, tpe schema) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(((AbstractC1714b3) value).mo2859e(schema));
            schema.writeTo(value, this.f49665a);
        }

        @Override // p000.j72
        /* JADX INFO: renamed from: p */
        public final void mo13770p(final qsa value, tpe schema) throws IOException {
            writeUInt32NoTag(((AbstractC1714b3) value).mo2859e(schema));
            schema.writeTo(value, this.f49665a);
        }

        @Override // p000.j72
        public final int spaceLeft() {
            return this.f49673i - this.f49674j;
        }

        @Override // p000.j72, p000.mj1
        public final void write(byte value) throws IOException {
            try {
                byte[] bArr = this.f49671g;
                int i = this.f49674j;
                this.f49674j = i + 1;
                bArr[i] = value;
            } catch (IndexOutOfBoundsException e) {
                throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49674j), Integer.valueOf(this.f49673i), 1), e);
            }
        }

        @Override // p000.j72
        public final void writeBool(int i, boolean z) throws IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.j72
        public final void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // p000.j72
        public final void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // p000.j72
        public final void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // p000.j72
        public final void writeBytes(final int fieldNumber, final vj1 value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // p000.j72
        public final void writeBytesNoTag(final vj1 value) throws IOException {
            writeUInt32NoTag(value.size());
            value.mo9056o(this);
        }

        @Override // p000.j72
        public final void writeFixed32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // p000.j72
        public final void writeFixed32NoTag(int value) throws IOException {
            try {
                byte[] bArr = this.f49671g;
                int i = this.f49674j;
                int i2 = i + 1;
                this.f49674j = i2;
                bArr[i] = (byte) (value & 255);
                int i3 = i + 2;
                this.f49674j = i3;
                bArr[i2] = (byte) ((value >> 8) & 255);
                int i4 = i + 3;
                this.f49674j = i4;
                bArr[i3] = (byte) ((value >> 16) & 255);
                this.f49674j = i + 4;
                bArr[i4] = (byte) ((value >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49674j), Integer.valueOf(this.f49673i), 1), e);
            }
        }

        @Override // p000.j72
        public final void writeFixed64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // p000.j72
        public final void writeFixed64NoTag(long value) throws IOException {
            try {
                byte[] bArr = this.f49671g;
                int i = this.f49674j;
                int i2 = i + 1;
                this.f49674j = i2;
                bArr[i] = (byte) (((int) value) & 255);
                int i3 = i + 2;
                this.f49674j = i3;
                bArr[i2] = (byte) (((int) (value >> 8)) & 255);
                int i4 = i + 3;
                this.f49674j = i4;
                bArr[i3] = (byte) (((int) (value >> 16)) & 255);
                int i5 = i + 4;
                this.f49674j = i5;
                bArr[i4] = (byte) (((int) (value >> 24)) & 255);
                int i6 = i + 5;
                this.f49674j = i6;
                bArr[i5] = (byte) (((int) (value >> 32)) & 255);
                int i7 = i + 6;
                this.f49674j = i7;
                bArr[i6] = (byte) (((int) (value >> 40)) & 255);
                int i8 = i + 7;
                this.f49674j = i8;
                bArr[i7] = (byte) (((int) (value >> 48)) & 255);
                this.f49674j = i + 8;
                bArr[i8] = (byte) (((int) (value >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49674j), Integer.valueOf(this.f49673i), 1), e);
            }
        }

        @Override // p000.j72
        public final void writeInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // p000.j72
        public final void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // p000.j72, p000.mj1
        public final void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // p000.j72
        public final void writeMessage(final int fieldNumber, final qsa value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // p000.j72
        public final void writeMessageNoTag(final qsa value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // p000.j72
        public final void writeMessageSetExtension(final int fieldNumber, final qsa value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // p000.j72
        public final void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            li8.m16159a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // p000.j72
        public final void writeRawMessageSetExtension(final int fieldNumber, final vj1 value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // p000.j72
        public final void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // p000.j72
        public final void writeStringNoTag(String value) throws IOException {
            int i = this.f49674j;
            try {
                int iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(value.length() * 3);
                int iComputeUInt32SizeNoTag2 = j72.computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i2 = i + iComputeUInt32SizeNoTag2;
                    this.f49674j = i2;
                    int iM19869i = pzh.m19869i(value, this.f49671g, i2, spaceLeft());
                    this.f49674j = i;
                    writeUInt32NoTag((iM19869i - i) - iComputeUInt32SizeNoTag2);
                    this.f49674j = iM19869i;
                } else {
                    writeUInt32NoTag(pzh.m19871k(value));
                    this.f49674j = pzh.m19869i(value, this.f49671g, this.f49674j, spaceLeft());
                }
            } catch (IndexOutOfBoundsException e) {
                throw new C7767f(e);
            } catch (pzh.C11196d e2) {
                this.f49674j = i;
                m13765h(value, e2);
            }
        }

        @Override // p000.j72
        public final void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(hpi.m12536a(fieldNumber, wireType));
        }

        @Override // p000.j72
        public final void writeUInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // p000.j72
        public final void writeUInt32NoTag(int value) throws IOException {
            while ((value & (-128)) != 0) {
                try {
                    byte[] bArr = this.f49671g;
                    int i = this.f49674j;
                    this.f49674j = i + 1;
                    bArr[i] = (byte) ((value & 127) | 128);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49674j), Integer.valueOf(this.f49673i), 1), e);
                }
            }
            byte[] bArr2 = this.f49671g;
            int i2 = this.f49674j;
            this.f49674j = i2 + 1;
            bArr2[i2] = (byte) value;
        }

        @Override // p000.j72
        public final void writeUInt64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // p000.j72
        public final void writeUInt64NoTag(long value) throws IOException {
            if (j72.f49662d && spaceLeft() >= 10) {
                while ((value & (-128)) != 0) {
                    byte[] bArr = this.f49671g;
                    int i = this.f49674j;
                    this.f49674j = i + 1;
                    dvh.m9456S(bArr, i, (byte) ((((int) value) & 127) | 128));
                    value >>>= 7;
                }
                byte[] bArr2 = this.f49671g;
                int i2 = this.f49674j;
                this.f49674j = i2 + 1;
                dvh.m9456S(bArr2, i2, (byte) value);
                return;
            }
            while ((value & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f49671g;
                    int i3 = this.f49674j;
                    this.f49674j = i3 + 1;
                    bArr3[i3] = (byte) ((((int) value) & 127) | 128);
                    value >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49674j), Integer.valueOf(this.f49673i), 1), e);
                }
            }
            byte[] bArr4 = this.f49671g;
            int i4 = this.f49674j;
            this.f49674j = i4 + 1;
            bArr4[i4] = (byte) value;
        }

        @Override // p000.j72
        public final void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // p000.j72, p000.mj1
        public final void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // p000.j72, p000.mj1
        public final void write(byte[] value, int offset, int length) throws IOException {
            try {
                System.arraycopy(value, offset, this.f49671g, this.f49674j, length);
                this.f49674j += length;
            } catch (IndexOutOfBoundsException e) {
                throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49674j), Integer.valueOf(this.f49673i), Integer.valueOf(length)), e);
            }
        }

        @Override // p000.j72, p000.mj1
        public final void write(ByteBuffer value) throws IOException {
            int iRemaining = value.remaining();
            try {
                value.get(this.f49671g, this.f49674j, iRemaining);
                this.f49674j += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49674j), Integer.valueOf(this.f49673i), Integer.valueOf(iRemaining)), e);
            }
        }
    }

    /* JADX INFO: renamed from: j72$d */
    public static final class C7765d extends AbstractC7763b {

        /* JADX INFO: renamed from: k */
        public final mj1 f49675k;

        public C7765d(mj1 out, int bufferSize) {
            super(bufferSize);
            if (out == null) {
                throw new NullPointerException("out");
            }
            this.f49675k = out;
        }

        private void doFlush() throws IOException {
            this.f49675k.write(this.f49667g, 0, this.f49669i);
            this.f49669i = 0;
        }

        private void flushIfNotAvailable(int requiredSize) throws IOException {
            if (this.f49668h - this.f49669i < requiredSize) {
                doFlush();
            }
        }

        @Override // p000.j72
        public void flush() throws IOException {
            if (this.f49669i > 0) {
                doFlush();
            }
        }

        @Override // p000.j72
        /* JADX INFO: renamed from: o */
        public void mo13769o(final int fieldNumber, final qsa value, tpe schema) throws IOException {
            writeTag(fieldNumber, 2);
            mo13770p(value, schema);
        }

        @Override // p000.j72
        /* JADX INFO: renamed from: p */
        public void mo13770p(final qsa value, tpe schema) throws IOException {
            writeUInt32NoTag(((AbstractC1714b3) value).mo2859e(schema));
            schema.writeTo(value, this.f49665a);
        }

        @Override // p000.j72, p000.mj1
        public void write(byte value) throws IOException {
            if (this.f49669i == this.f49668h) {
                doFlush();
            }
            m13771q(value);
        }

        @Override // p000.j72
        public void writeBool(int i, boolean z) throws IOException {
            flushIfNotAvailable(11);
            m13775u(i, 0);
            m13771q(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.j72
        public void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // p000.j72
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // p000.j72
        public void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // p000.j72
        public void writeBytes(final int fieldNumber, final vj1 value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // p000.j72
        public void writeBytesNoTag(final vj1 value) throws IOException {
            writeUInt32NoTag(value.size());
            value.mo9056o(this);
        }

        @Override // p000.j72
        public void writeFixed32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(14);
            m13775u(fieldNumber, 5);
            m13772r(value);
        }

        @Override // p000.j72
        public void writeFixed32NoTag(final int value) throws IOException {
            flushIfNotAvailable(4);
            m13772r(value);
        }

        @Override // p000.j72
        public void writeFixed64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(18);
            m13775u(fieldNumber, 1);
            m13773s(value);
        }

        @Override // p000.j72
        public void writeFixed64NoTag(final long value) throws IOException {
            flushIfNotAvailable(8);
            m13773s(value);
        }

        @Override // p000.j72
        public void writeInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            m13775u(fieldNumber, 0);
            m13774t(value);
        }

        @Override // p000.j72
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // p000.j72, p000.mj1
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            flush();
            this.f49675k.writeLazy(value, offset, length);
            this.f49670j += length;
        }

        @Override // p000.j72
        public void writeMessage(final int fieldNumber, final qsa value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // p000.j72
        public void writeMessageNoTag(final qsa value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // p000.j72
        public void writeMessageSetExtension(final int fieldNumber, final qsa value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // p000.j72
        public void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            li8.m16159a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // p000.j72
        public void writeRawMessageSetExtension(final int fieldNumber, final vj1 value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // p000.j72
        public void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // p000.j72
        public void writeStringNoTag(String value) throws IOException {
            int length = value.length() * 3;
            int iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(length);
            int i = iComputeUInt32SizeNoTag + length;
            int i2 = this.f49668h;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iM19869i = pzh.m19869i(value, bArr, 0, length);
                writeUInt32NoTag(iM19869i);
                writeLazy(bArr, 0, iM19869i);
                return;
            }
            if (i > i2 - this.f49669i) {
                doFlush();
            }
            int i3 = this.f49669i;
            try {
                int iComputeUInt32SizeNoTag2 = j72.computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i4 = i3 + iComputeUInt32SizeNoTag2;
                    this.f49669i = i4;
                    int iM19869i2 = pzh.m19869i(value, this.f49667g, i4, this.f49668h - i4);
                    this.f49669i = i3;
                    int i5 = (iM19869i2 - i3) - iComputeUInt32SizeNoTag2;
                    m13776v(i5);
                    this.f49669i = iM19869i2;
                    this.f49670j += i5;
                } else {
                    int iM19871k = pzh.m19871k(value);
                    m13776v(iM19871k);
                    this.f49669i = pzh.m19869i(value, this.f49667g, this.f49669i, iM19871k);
                    this.f49670j += iM19871k;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new C7767f(e);
            } catch (pzh.C11196d e2) {
                this.f49670j -= this.f49669i - i3;
                this.f49669i = i3;
                m13765h(value, e2);
            }
        }

        @Override // p000.j72
        public void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(hpi.m12536a(fieldNumber, wireType));
        }

        @Override // p000.j72
        public void writeUInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            m13775u(fieldNumber, 0);
            m13776v(value);
        }

        @Override // p000.j72
        public void writeUInt32NoTag(int value) throws IOException {
            flushIfNotAvailable(5);
            m13776v(value);
        }

        @Override // p000.j72
        public void writeUInt64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(20);
            m13775u(fieldNumber, 0);
            m13777w(value);
        }

        @Override // p000.j72
        public void writeUInt64NoTag(long value) throws IOException {
            flushIfNotAvailable(10);
            m13777w(value);
        }

        @Override // p000.j72
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // p000.j72, p000.mj1
        public void write(byte[] value, int offset, int length) throws IOException {
            flush();
            this.f49675k.write(value, offset, length);
            this.f49670j += length;
        }

        @Override // p000.j72, p000.mj1
        public void writeLazy(ByteBuffer value) throws IOException {
            flush();
            int iRemaining = value.remaining();
            this.f49675k.writeLazy(value);
            this.f49670j += iRemaining;
        }

        @Override // p000.j72, p000.mj1
        public void write(ByteBuffer value) throws IOException {
            flush();
            int iRemaining = value.remaining();
            this.f49675k.write(value);
            this.f49670j += iRemaining;
        }
    }

    /* JADX INFO: renamed from: j72$e */
    public static final class C7766e extends C7764c {

        /* JADX INFO: renamed from: k */
        public final ByteBuffer f49676k;

        /* JADX INFO: renamed from: l */
        public int f49677l;

        public C7766e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f49676k = byteBuffer;
            this.f49677l = byteBuffer.position();
        }

        @Override // p000.j72.C7764c, p000.j72
        public void flush() {
            li8.m16163e(this.f49676k, this.f49677l + getTotalBytesWritten());
        }
    }

    /* JADX INFO: renamed from: j72$f */
    public static class C7767f extends IOException {

        /* JADX INFO: renamed from: a */
        public static final String f49678a = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public C7767f() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public C7767f(String explanationMessage) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + explanationMessage);
        }

        public C7767f(Throwable cause) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", cause);
        }

        public C7767f(String explanationMessage, Throwable cause) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + explanationMessage, cause);
        }
    }

    /* JADX INFO: renamed from: j72$g */
    public static final class C7768g extends AbstractC7763b {

        /* JADX INFO: renamed from: k */
        public final OutputStream f49679k;

        public C7768g(OutputStream out, int bufferSize) {
            super(bufferSize);
            if (out == null) {
                throw new NullPointerException("out");
            }
            this.f49679k = out;
        }

        private void doFlush() throws IOException {
            this.f49679k.write(this.f49667g, 0, this.f49669i);
            this.f49669i = 0;
        }

        private void flushIfNotAvailable(int requiredSize) throws IOException {
            if (this.f49668h - this.f49669i < requiredSize) {
                doFlush();
            }
        }

        @Override // p000.j72
        public void flush() throws IOException {
            if (this.f49669i > 0) {
                doFlush();
            }
        }

        @Override // p000.j72
        /* JADX INFO: renamed from: o */
        public void mo13769o(final int fieldNumber, final qsa value, tpe schema) throws IOException {
            writeTag(fieldNumber, 2);
            mo13770p(value, schema);
        }

        @Override // p000.j72
        /* JADX INFO: renamed from: p */
        public void mo13770p(final qsa value, tpe schema) throws IOException {
            writeUInt32NoTag(((AbstractC1714b3) value).mo2859e(schema));
            schema.writeTo(value, this.f49665a);
        }

        @Override // p000.j72, p000.mj1
        public void write(byte value) throws IOException {
            if (this.f49669i == this.f49668h) {
                doFlush();
            }
            m13771q(value);
        }

        @Override // p000.j72
        public void writeBool(int i, boolean z) throws IOException {
            flushIfNotAvailable(11);
            m13775u(i, 0);
            m13771q(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.j72
        public void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // p000.j72
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // p000.j72
        public void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // p000.j72
        public void writeBytes(final int fieldNumber, final vj1 value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // p000.j72
        public void writeBytesNoTag(final vj1 value) throws IOException {
            writeUInt32NoTag(value.size());
            value.mo9056o(this);
        }

        @Override // p000.j72
        public void writeFixed32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(14);
            m13775u(fieldNumber, 5);
            m13772r(value);
        }

        @Override // p000.j72
        public void writeFixed32NoTag(final int value) throws IOException {
            flushIfNotAvailable(4);
            m13772r(value);
        }

        @Override // p000.j72
        public void writeFixed64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(18);
            m13775u(fieldNumber, 1);
            m13773s(value);
        }

        @Override // p000.j72
        public void writeFixed64NoTag(final long value) throws IOException {
            flushIfNotAvailable(8);
            m13773s(value);
        }

        @Override // p000.j72
        public void writeInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            m13775u(fieldNumber, 0);
            m13774t(value);
        }

        @Override // p000.j72
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // p000.j72, p000.mj1
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // p000.j72
        public void writeMessage(final int fieldNumber, final qsa value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // p000.j72
        public void writeMessageNoTag(final qsa value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // p000.j72
        public void writeMessageSetExtension(final int fieldNumber, final qsa value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // p000.j72
        public void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            li8.m16159a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // p000.j72
        public void writeRawMessageSetExtension(final int fieldNumber, final vj1 value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // p000.j72
        public void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // p000.j72
        public void writeStringNoTag(String value) throws IOException {
            int iM19871k;
            try {
                int length = value.length() * 3;
                int iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(length);
                int i = iComputeUInt32SizeNoTag + length;
                int i2 = this.f49668h;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iM19869i = pzh.m19869i(value, bArr, 0, length);
                    writeUInt32NoTag(iM19869i);
                    writeLazy(bArr, 0, iM19869i);
                    return;
                }
                if (i > i2 - this.f49669i) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = j72.computeUInt32SizeNoTag(value.length());
                int i3 = this.f49669i;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i4 = i3 + iComputeUInt32SizeNoTag2;
                        this.f49669i = i4;
                        int iM19869i2 = pzh.m19869i(value, this.f49667g, i4, this.f49668h - i4);
                        this.f49669i = i3;
                        iM19871k = (iM19869i2 - i3) - iComputeUInt32SizeNoTag2;
                        m13776v(iM19871k);
                        this.f49669i = iM19869i2;
                    } else {
                        iM19871k = pzh.m19871k(value);
                        m13776v(iM19871k);
                        this.f49669i = pzh.m19869i(value, this.f49667g, this.f49669i, iM19871k);
                    }
                    this.f49670j += iM19871k;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new C7767f(e);
                } catch (pzh.C11196d e2) {
                    this.f49670j -= this.f49669i - i3;
                    this.f49669i = i3;
                    throw e2;
                }
            } catch (pzh.C11196d e3) {
                m13765h(value, e3);
            }
        }

        @Override // p000.j72
        public void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(hpi.m12536a(fieldNumber, wireType));
        }

        @Override // p000.j72
        public void writeUInt32(final int fieldNumber, final int value) throws IOException {
            flushIfNotAvailable(20);
            m13775u(fieldNumber, 0);
            m13776v(value);
        }

        @Override // p000.j72
        public void writeUInt32NoTag(int value) throws IOException {
            flushIfNotAvailable(5);
            m13776v(value);
        }

        @Override // p000.j72
        public void writeUInt64(final int fieldNumber, final long value) throws IOException {
            flushIfNotAvailable(20);
            m13775u(fieldNumber, 0);
            m13777w(value);
        }

        @Override // p000.j72
        public void writeUInt64NoTag(long value) throws IOException {
            flushIfNotAvailable(10);
            m13777w(value);
        }

        @Override // p000.j72
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // p000.j72, p000.mj1
        public void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // p000.j72, p000.mj1
        public void write(byte[] value, int offset, int length) throws IOException {
            int i = this.f49668h;
            int i2 = this.f49669i;
            if (i - i2 >= length) {
                System.arraycopy(value, offset, this.f49667g, i2, length);
                this.f49669i += length;
                this.f49670j += length;
                return;
            }
            int i3 = i - i2;
            System.arraycopy(value, offset, this.f49667g, i2, i3);
            int i4 = offset + i3;
            int i5 = length - i3;
            this.f49669i = this.f49668h;
            this.f49670j += i3;
            doFlush();
            if (i5 <= this.f49668h) {
                System.arraycopy(value, i4, this.f49667g, 0, i5);
                this.f49669i = i5;
            } else {
                this.f49679k.write(value, i4, i5);
            }
            this.f49670j += i5;
        }

        @Override // p000.j72, p000.mj1
        public void write(ByteBuffer value) throws IOException {
            int iRemaining = value.remaining();
            int i = this.f49668h;
            int i2 = this.f49669i;
            if (i - i2 >= iRemaining) {
                value.get(this.f49667g, i2, iRemaining);
                this.f49669i += iRemaining;
                this.f49670j += iRemaining;
                return;
            }
            int i3 = i - i2;
            value.get(this.f49667g, i2, i3);
            int i4 = iRemaining - i3;
            this.f49669i = this.f49668h;
            this.f49670j += i3;
            doFlush();
            while (true) {
                int i5 = this.f49668h;
                if (i4 > i5) {
                    value.get(this.f49667g, 0, i5);
                    this.f49679k.write(this.f49667g, 0, this.f49668h);
                    int i6 = this.f49668h;
                    i4 -= i6;
                    this.f49670j += i6;
                } else {
                    value.get(this.f49667g, 0, i4);
                    this.f49669i = i4;
                    this.f49670j += i4;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j72$h */
    public static final class C7769h extends j72 {

        /* JADX INFO: renamed from: g */
        public final ByteBuffer f49680g;

        /* JADX INFO: renamed from: h */
        public final ByteBuffer f49681h;

        /* JADX INFO: renamed from: i */
        public final int f49682i;

        public C7769h(ByteBuffer buffer) {
            super();
            this.f49680g = buffer;
            this.f49681h = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f49682i = buffer.position();
        }

        private void encode(String value) throws IOException {
            try {
                pzh.m19870j(value, this.f49681h);
            } catch (IndexOutOfBoundsException e) {
                throw new C7767f(e);
            }
        }

        @Override // p000.j72
        public void flush() {
            li8.m16163e(this.f49680g, this.f49681h.position());
        }

        @Override // p000.j72
        public int getTotalBytesWritten() {
            return this.f49681h.position() - this.f49682i;
        }

        @Override // p000.j72
        /* JADX INFO: renamed from: o */
        public void mo13769o(final int fieldNumber, final qsa value, tpe schema) throws IOException {
            writeTag(fieldNumber, 2);
            mo13770p(value, schema);
        }

        @Override // p000.j72
        /* JADX INFO: renamed from: p */
        public void mo13770p(final qsa value, tpe schema) throws IOException {
            writeUInt32NoTag(((AbstractC1714b3) value).mo2859e(schema));
            schema.writeTo(value, this.f49665a);
        }

        @Override // p000.j72
        public int spaceLeft() {
            return this.f49681h.remaining();
        }

        @Override // p000.j72, p000.mj1
        public void write(byte value) throws IOException {
            try {
                this.f49681h.put(value);
            } catch (BufferOverflowException e) {
                throw new C7767f(e);
            }
        }

        @Override // p000.j72
        public void writeBool(int i, boolean z) throws IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.j72
        public void writeByteArray(final int fieldNumber, final byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // p000.j72
        public void writeByteArrayNoTag(final byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // p000.j72
        public void writeByteBuffer(final int fieldNumber, final ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // p000.j72
        public void writeBytes(final int fieldNumber, final vj1 value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // p000.j72
        public void writeBytesNoTag(final vj1 value) throws IOException {
            writeUInt32NoTag(value.size());
            value.mo9056o(this);
        }

        @Override // p000.j72
        public void writeFixed32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // p000.j72
        public void writeFixed32NoTag(int value) throws IOException {
            try {
                this.f49681h.putInt(value);
            } catch (BufferOverflowException e) {
                throw new C7767f(e);
            }
        }

        @Override // p000.j72
        public void writeFixed64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // p000.j72
        public void writeFixed64NoTag(long value) throws IOException {
            try {
                this.f49681h.putLong(value);
            } catch (BufferOverflowException e) {
                throw new C7767f(e);
            }
        }

        @Override // p000.j72
        public void writeInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // p000.j72
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // p000.j72, p000.mj1
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // p000.j72
        public void writeMessage(final int fieldNumber, final qsa value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // p000.j72
        public void writeMessageNoTag(final qsa value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // p000.j72
        public void writeMessageSetExtension(final int fieldNumber, final qsa value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // p000.j72
        public void writeRawBytes(final ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            li8.m16159a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // p000.j72
        public void writeRawMessageSetExtension(final int fieldNumber, final vj1 value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // p000.j72
        public void writeString(final int fieldNumber, final String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // p000.j72
        public void writeStringNoTag(String value) throws IOException {
            int iPosition = this.f49681h.position();
            try {
                int iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(value.length() * 3);
                int iComputeUInt32SizeNoTag2 = j72.computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iPosition2 = this.f49681h.position() + iComputeUInt32SizeNoTag2;
                    li8.m16163e(this.f49681h, iPosition2);
                    encode(value);
                    int iPosition3 = this.f49681h.position();
                    li8.m16163e(this.f49681h, iPosition);
                    writeUInt32NoTag(iPosition3 - iPosition2);
                    li8.m16163e(this.f49681h, iPosition3);
                } else {
                    writeUInt32NoTag(pzh.m19871k(value));
                    encode(value);
                }
            } catch (pzh.C11196d e) {
                li8.m16163e(this.f49681h, iPosition);
                m13765h(value, e);
            } catch (IllegalArgumentException e2) {
                throw new C7767f(e2);
            }
        }

        @Override // p000.j72
        public void writeTag(final int fieldNumber, final int wireType) throws IOException {
            writeUInt32NoTag(hpi.m12536a(fieldNumber, wireType));
        }

        @Override // p000.j72
        public void writeUInt32(final int fieldNumber, final int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // p000.j72
        public void writeUInt32NoTag(int value) throws IOException {
            while ((value & (-128)) != 0) {
                try {
                    this.f49681h.put((byte) ((value & 127) | 128));
                    value >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new C7767f(e);
                }
            }
            this.f49681h.put((byte) value);
        }

        @Override // p000.j72
        public void writeUInt64(final int fieldNumber, final long value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // p000.j72
        public void writeUInt64NoTag(long value) throws IOException {
            while (((-128) & value) != 0) {
                try {
                    this.f49681h.put((byte) ((((int) value) & 127) | 128));
                    value >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new C7767f(e);
                }
            }
            this.f49681h.put((byte) value);
        }

        @Override // p000.j72
        public void writeByteArray(final int fieldNumber, final byte[] value, final int offset, final int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // p000.j72, p000.mj1
        public void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // p000.j72, p000.mj1
        public void write(byte[] value, int offset, int length) throws IOException {
            try {
                this.f49681h.put(value, offset, length);
            } catch (IndexOutOfBoundsException e) {
                throw new C7767f(e);
            } catch (BufferOverflowException e2) {
                throw new C7767f(e2);
            }
        }

        @Override // p000.j72, p000.mj1
        public void write(ByteBuffer value) throws IOException {
            try {
                this.f49681h.put(value);
            } catch (BufferOverflowException e) {
                throw new C7767f(e);
            }
        }
    }

    /* JADX INFO: renamed from: j72$i */
    public static final class C7770i extends j72 {

        /* JADX INFO: renamed from: g */
        public final ByteBuffer f49683g;

        /* JADX INFO: renamed from: h */
        public final ByteBuffer f49684h;

        /* JADX INFO: renamed from: i */
        public final long f49685i;

        /* JADX INFO: renamed from: j */
        public final long f49686j;

        /* JADX INFO: renamed from: k */
        public final long f49687k;

        /* JADX INFO: renamed from: l */
        public final long f49688l;

        /* JADX INFO: renamed from: m */
        public long f49689m;

        public C7770i(ByteBuffer buffer) {
            super();
            this.f49683g = buffer;
            this.f49684h = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jM9479k = dvh.m9479k(buffer);
            this.f49685i = jM9479k;
            long jPosition = ((long) buffer.position()) + jM9479k;
            this.f49686j = jPosition;
            long jLimit = jM9479k + ((long) buffer.limit());
            this.f49687k = jLimit;
            this.f49688l = jLimit - 10;
            this.f49689m = jPosition;
        }

        private int bufferPos(long pos) {
            return (int) (pos - this.f49685i);
        }

        public static boolean isSupported() {
            return dvh.m9448K();
        }

        private void repositionBuffer(long pos) {
            li8.m16163e(this.f49684h, bufferPos(pos));
        }

        @Override // p000.j72
        public void flush() {
            li8.m16163e(this.f49683g, bufferPos(this.f49689m));
        }

        @Override // p000.j72
        public int getTotalBytesWritten() {
            return (int) (this.f49689m - this.f49686j);
        }

        @Override // p000.j72
        /* JADX INFO: renamed from: o */
        public void mo13769o(int fieldNumber, qsa value, tpe schema) throws IOException {
            writeTag(fieldNumber, 2);
            mo13770p(value, schema);
        }

        @Override // p000.j72
        /* JADX INFO: renamed from: p */
        public void mo13770p(qsa value, tpe schema) throws IOException {
            writeUInt32NoTag(((AbstractC1714b3) value).mo2859e(schema));
            schema.writeTo(value, this.f49665a);
        }

        @Override // p000.j72
        public int spaceLeft() {
            return (int) (this.f49687k - this.f49689m);
        }

        @Override // p000.j72, p000.mj1
        public void write(byte value) throws IOException {
            long j = this.f49689m;
            if (j >= this.f49687k) {
                throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f49689m), Long.valueOf(this.f49687k), 1));
            }
            this.f49689m = 1 + j;
            dvh.m9454Q(j, value);
        }

        @Override // p000.j72
        public void writeBool(int i, boolean z) throws IOException {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.j72
        public void writeByteArray(int fieldNumber, byte[] value) throws IOException {
            writeByteArray(fieldNumber, value, 0, value.length);
        }

        @Override // p000.j72
        public void writeByteArrayNoTag(byte[] value, int offset, int length) throws IOException {
            writeUInt32NoTag(length);
            write(value, offset, length);
        }

        @Override // p000.j72
        public void writeByteBuffer(int fieldNumber, ByteBuffer value) throws IOException {
            writeTag(fieldNumber, 2);
            writeUInt32NoTag(value.capacity());
            writeRawBytes(value);
        }

        @Override // p000.j72
        public void writeBytes(int fieldNumber, vj1 value) throws IOException {
            writeTag(fieldNumber, 2);
            writeBytesNoTag(value);
        }

        @Override // p000.j72
        public void writeBytesNoTag(vj1 value) throws IOException {
            writeUInt32NoTag(value.size());
            value.mo9056o(this);
        }

        @Override // p000.j72
        public void writeFixed32(int fieldNumber, int value) throws IOException {
            writeTag(fieldNumber, 5);
            writeFixed32NoTag(value);
        }

        @Override // p000.j72
        public void writeFixed32NoTag(int value) throws IOException {
            this.f49684h.putInt(bufferPos(this.f49689m), value);
            this.f49689m += 4;
        }

        @Override // p000.j72
        public void writeFixed64(int fieldNumber, long value) throws IOException {
            writeTag(fieldNumber, 1);
            writeFixed64NoTag(value);
        }

        @Override // p000.j72
        public void writeFixed64NoTag(long value) throws IOException {
            this.f49684h.putLong(bufferPos(this.f49689m), value);
            this.f49689m += 8;
        }

        @Override // p000.j72
        public void writeInt32(int fieldNumber, int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeInt32NoTag(value);
        }

        @Override // p000.j72
        public void writeInt32NoTag(int value) throws IOException {
            if (value >= 0) {
                writeUInt32NoTag(value);
            } else {
                writeUInt64NoTag(value);
            }
        }

        @Override // p000.j72, p000.mj1
        public void writeLazy(byte[] value, int offset, int length) throws IOException {
            write(value, offset, length);
        }

        @Override // p000.j72
        public void writeMessage(int fieldNumber, qsa value) throws IOException {
            writeTag(fieldNumber, 2);
            writeMessageNoTag(value);
        }

        @Override // p000.j72
        public void writeMessageNoTag(qsa value) throws IOException {
            writeUInt32NoTag(value.getSerializedSize());
            value.writeTo(this);
        }

        @Override // p000.j72
        public void writeMessageSetExtension(int fieldNumber, qsa value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeMessage(3, value);
            writeTag(1, 4);
        }

        @Override // p000.j72
        public void writeRawBytes(ByteBuffer value) throws IOException {
            if (value.hasArray()) {
                write(value.array(), value.arrayOffset(), value.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = value.duplicate();
            li8.m16159a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // p000.j72
        public void writeRawMessageSetExtension(int fieldNumber, vj1 value) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, fieldNumber);
            writeBytes(3, value);
            writeTag(1, 4);
        }

        @Override // p000.j72
        public void writeString(int fieldNumber, String value) throws IOException {
            writeTag(fieldNumber, 2);
            writeStringNoTag(value);
        }

        @Override // p000.j72
        public void writeStringNoTag(String value) throws IOException {
            long j = this.f49689m;
            try {
                int iComputeUInt32SizeNoTag = j72.computeUInt32SizeNoTag(value.length() * 3);
                int iComputeUInt32SizeNoTag2 = j72.computeUInt32SizeNoTag(value.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iBufferPos = bufferPos(this.f49689m) + iComputeUInt32SizeNoTag2;
                    li8.m16163e(this.f49684h, iBufferPos);
                    pzh.m19870j(value, this.f49684h);
                    int iPosition = this.f49684h.position() - iBufferPos;
                    writeUInt32NoTag(iPosition);
                    this.f49689m += (long) iPosition;
                } else {
                    int iM19871k = pzh.m19871k(value);
                    writeUInt32NoTag(iM19871k);
                    repositionBuffer(this.f49689m);
                    pzh.m19870j(value, this.f49684h);
                    this.f49689m += (long) iM19871k;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new C7767f(e);
            } catch (pzh.C11196d e2) {
                this.f49689m = j;
                repositionBuffer(j);
                m13765h(value, e2);
            } catch (IllegalArgumentException e3) {
                throw new C7767f(e3);
            }
        }

        @Override // p000.j72
        public void writeTag(int fieldNumber, int wireType) throws IOException {
            writeUInt32NoTag(hpi.m12536a(fieldNumber, wireType));
        }

        @Override // p000.j72
        public void writeUInt32(int fieldNumber, int value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt32NoTag(value);
        }

        @Override // p000.j72
        public void writeUInt32NoTag(int value) throws IOException {
            if (this.f49689m <= this.f49688l) {
                while ((value & (-128)) != 0) {
                    long j = this.f49689m;
                    this.f49689m = j + 1;
                    dvh.m9454Q(j, (byte) ((value & 127) | 128));
                    value >>>= 7;
                }
                long j2 = this.f49689m;
                this.f49689m = 1 + j2;
                dvh.m9454Q(j2, (byte) value);
                return;
            }
            while (true) {
                long j3 = this.f49689m;
                if (j3 >= this.f49687k) {
                    throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f49689m), Long.valueOf(this.f49687k), 1));
                }
                if ((value & (-128)) == 0) {
                    this.f49689m = 1 + j3;
                    dvh.m9454Q(j3, (byte) value);
                    return;
                } else {
                    this.f49689m = j3 + 1;
                    dvh.m9454Q(j3, (byte) ((value & 127) | 128));
                    value >>>= 7;
                }
            }
        }

        @Override // p000.j72
        public void writeUInt64(int fieldNumber, long value) throws IOException {
            writeTag(fieldNumber, 0);
            writeUInt64NoTag(value);
        }

        @Override // p000.j72
        public void writeUInt64NoTag(long value) throws IOException {
            if (this.f49689m <= this.f49688l) {
                while ((value & (-128)) != 0) {
                    long j = this.f49689m;
                    this.f49689m = j + 1;
                    dvh.m9454Q(j, (byte) ((((int) value) & 127) | 128));
                    value >>>= 7;
                }
                long j2 = this.f49689m;
                this.f49689m = 1 + j2;
                dvh.m9454Q(j2, (byte) value);
                return;
            }
            while (true) {
                long j3 = this.f49689m;
                if (j3 >= this.f49687k) {
                    throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f49689m), Long.valueOf(this.f49687k), 1));
                }
                if ((value & (-128)) == 0) {
                    this.f49689m = 1 + j3;
                    dvh.m9454Q(j3, (byte) value);
                    return;
                } else {
                    this.f49689m = j3 + 1;
                    dvh.m9454Q(j3, (byte) ((((int) value) & 127) | 128));
                    value >>>= 7;
                }
            }
        }

        @Override // p000.j72
        public void writeByteArray(int fieldNumber, byte[] value, int offset, int length) throws IOException {
            writeTag(fieldNumber, 2);
            writeByteArrayNoTag(value, offset, length);
        }

        @Override // p000.j72, p000.mj1
        public void writeLazy(ByteBuffer value) throws IOException {
            write(value);
        }

        @Override // p000.j72, p000.mj1
        public void write(byte[] value, int offset, int length) throws IOException {
            if (value != null && offset >= 0 && length >= 0 && value.length - length >= offset) {
                long j = length;
                long j2 = this.f49687k - j;
                long j3 = this.f49689m;
                if (j2 >= j3) {
                    dvh.m9482n(value, offset, j3, j);
                    this.f49689m += j;
                    return;
                }
            }
            if (value == null) {
                throw new NullPointerException("value");
            }
            throw new C7767f(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f49689m), Long.valueOf(this.f49687k), Integer.valueOf(length)));
        }

        @Override // p000.j72, p000.mj1
        public void write(ByteBuffer value) throws IOException {
            try {
                int iRemaining = value.remaining();
                repositionBuffer(this.f49689m);
                this.f49684h.put(value);
                this.f49689m += (long) iRemaining;
            } catch (BufferOverflowException e) {
                throw new C7767f(e);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static int m13756b(final int fieldNumber, final qsa value, tpe schema) {
        return (computeTagSize(fieldNumber) * 2) + m13757c(value, schema);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static int m13757c(final qsa value, tpe schema) {
        return ((AbstractC1714b3) value).mo2859e(schema);
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
        return m13758d(value.length);
    }

    public static int computeByteBufferSize(final int fieldNumber, final ByteBuffer value) {
        return computeTagSize(fieldNumber) + computeByteBufferSizeNoTag(value);
    }

    public static int computeByteBufferSizeNoTag(final ByteBuffer value) {
        return m13758d(value.capacity());
    }

    public static int computeBytesSize(final int fieldNumber, final vj1 value) {
        return computeTagSize(fieldNumber) + computeBytesSizeNoTag(value);
    }

    public static int computeBytesSizeNoTag(final vj1 value) {
        return m13758d(value.size());
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
    public static int computeGroupSize(final int fieldNumber, final qsa value) {
        return (computeTagSize(fieldNumber) * 2) + value.getSerializedSize();
    }

    @Deprecated
    @q28(replacement = "value.getSerializedSize()")
    public static int computeGroupSizeNoTag(final qsa value) {
        return value.getSerializedSize();
    }

    public static int computeInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeInt32SizeNoTag(value);
    }

    public static int computeInt32SizeNoTag(final int value) {
        if (value >= 0) {
            return computeUInt32SizeNoTag(value);
        }
        return 10;
    }

    public static int computeInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeInt64SizeNoTag(value);
    }

    public static int computeInt64SizeNoTag(final long value) {
        return computeUInt64SizeNoTag(value);
    }

    public static int computeLazyFieldMessageSetExtensionSize(final int fieldNumber, final px8 value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeLazyFieldSize(3, value);
    }

    public static int computeLazyFieldSize(final int fieldNumber, final px8 value) {
        return computeTagSize(fieldNumber) + computeLazyFieldSizeNoTag(value);
    }

    public static int computeLazyFieldSizeNoTag(final px8 value) {
        return m13758d(value.getSerializedSize());
    }

    public static int computeMessageSetExtensionSize(final int fieldNumber, final qsa value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeMessageSize(3, value);
    }

    public static int computeMessageSize(final int fieldNumber, final qsa value) {
        return computeTagSize(fieldNumber) + computeMessageSizeNoTag(value);
    }

    public static int computeMessageSizeNoTag(final qsa value) {
        return m13758d(value.getSerializedSize());
    }

    public static int computeRawMessageSetExtensionSize(final int fieldNumber, final vj1 value) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, fieldNumber) + computeBytesSize(3, value);
    }

    @Deprecated
    @q28(imports = {"com.google.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt32SizeNoTag(value)")
    public static int computeRawVarint32Size(final int value) {
        return computeUInt32SizeNoTag(value);
    }

    @Deprecated
    @q28(imports = {"com.google.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt64SizeNoTag(value)")
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
            length = pzh.m19871k(value);
        } catch (pzh.C11196d unused) {
            length = value.getBytes(w98.f93674b).length;
        }
        return m13758d(length);
    }

    public static int computeTagSize(final int fieldNumber) {
        return computeUInt32SizeNoTag(hpi.m12536a(fieldNumber, 0));
    }

    public static int computeUInt32Size(final int fieldNumber, final int value) {
        return computeTagSize(fieldNumber) + computeUInt32SizeNoTag(value);
    }

    public static int computeUInt32SizeNoTag(final int value) {
        if ((value & (-128)) == 0) {
            return 1;
        }
        if ((value & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & value) == 0) {
            return 3;
        }
        return (value & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(final int fieldNumber, final long value) {
        return computeTagSize(fieldNumber) + computeUInt64SizeNoTag(value);
    }

    public static int computeUInt64SizeNoTag(long value) {
        int i;
        if (((-128) & value) == 0) {
            return 1;
        }
        if (value < 0) {
            return 10;
        }
        if (((-34359738368L) & value) != 0) {
            value >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((v13.f89665d2 & value) != 0) {
            i += 2;
            value >>>= 14;
        }
        return (value & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: d */
    public static int m13758d(int fieldLength) {
        return computeUInt32SizeNoTag(fieldLength) + fieldLength;
    }

    /* JADX INFO: renamed from: e */
    public static int m13759e(final int fieldNumber, final qsa value, final tpe schema) {
        return computeTagSize(fieldNumber) + m13760f(value, schema);
    }

    public static int encodeZigZag32(final int n) {
        return (n >> 31) ^ (n << 1);
    }

    public static long encodeZigZag64(final long n) {
        return (n >> 63) ^ (n << 1);
    }

    /* JADX INFO: renamed from: f */
    public static int m13760f(final qsa value, final tpe schema) {
        return m13758d(((AbstractC1714b3) value).mo2859e(schema));
    }

    /* JADX INFO: renamed from: g */
    public static int m13761g(int dataLength) {
        if (dataLength > 4096) {
            return 4096;
        }
        return dataLength;
    }

    /* JADX INFO: renamed from: j */
    public static j72 m13762j(mj1 byteOutput, int bufferSize) {
        if (bufferSize >= 0) {
            return new C7765d(byteOutput, bufferSize);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    /* JADX INFO: renamed from: k */
    public static j72 m13763k(ByteBuffer buffer) {
        return new C7769h(buffer);
    }

    /* JADX INFO: renamed from: l */
    public static j72 m13764l(ByteBuffer buffer) {
        return new C7770i(buffer);
    }

    public static j72 newInstance(final OutputStream output) {
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
    public final void m13765h(String value, pzh.C11196d cause) throws IOException {
        f49661c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cause);
        byte[] bytes = value.getBytes(w98.f93674b);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C7767f(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m13766i() {
        return this.f49666b;
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public final void m13767m(final int fieldNumber, final qsa value, tpe schema) throws IOException {
        writeTag(fieldNumber, 3);
        m13768n(value, schema);
        writeTag(fieldNumber, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public final void m13768n(final qsa value, tpe schema) throws IOException {
        schema.writeTo(value, this.f49665a);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo13769o(final int fieldNumber, final qsa value, tpe schema) throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract void mo13770p(final qsa value, tpe schema) throws IOException;

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.f49666b = true;
    }

    @Override // p000.mj1
    public abstract void write(byte value) throws IOException;

    @Override // p000.mj1
    public abstract void write(ByteBuffer value) throws IOException;

    @Override // p000.mj1
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

    public abstract void writeBytes(int fieldNumber, vj1 value) throws IOException;

    public abstract void writeBytesNoTag(final vj1 value) throws IOException;

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
    public final void writeGroup(final int fieldNumber, final qsa value) throws IOException {
        writeTag(fieldNumber, 3);
        writeGroupNoTag(value);
        writeTag(fieldNumber, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(final qsa value) throws IOException {
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

    @Override // p000.mj1
    public abstract void writeLazy(ByteBuffer value) throws IOException;

    @Override // p000.mj1
    public abstract void writeLazy(byte[] value, int offset, int length) throws IOException;

    public abstract void writeMessage(final int fieldNumber, final qsa value) throws IOException;

    public abstract void writeMessageNoTag(final qsa value) throws IOException;

    public abstract void writeMessageSetExtension(final int fieldNumber, final qsa value) throws IOException;

    public final void writeRawByte(final byte value) throws IOException {
        write(value);
    }

    public abstract void writeRawBytes(final ByteBuffer value) throws IOException;

    public final void writeRawBytes(final byte[] value) throws IOException {
        write(value, 0, value.length);
    }

    @Deprecated
    @q28(replacement = "this.writeFixed32NoTag(value)")
    public final void writeRawLittleEndian32(final int value) throws IOException {
        writeFixed32NoTag(value);
    }

    @Deprecated
    @q28(replacement = "this.writeFixed64NoTag(value)")
    public final void writeRawLittleEndian64(final long value) throws IOException {
        writeFixed64NoTag(value);
    }

    public abstract void writeRawMessageSetExtension(final int fieldNumber, final vj1 value) throws IOException;

    @Deprecated
    @q28(replacement = "this.writeUInt32NoTag(value)")
    public final void writeRawVarint32(int value) throws IOException {
        writeUInt32NoTag(value);
    }

    @Deprecated
    @q28(replacement = "this.writeUInt64NoTag(value)")
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

    private j72() {
    }

    public static j72 newInstance(final OutputStream output, final int bufferSize) {
        return new C7768g(output, bufferSize);
    }

    public final void writeRawByte(final int value) throws IOException {
        write((byte) value);
    }

    public final void writeRawBytes(final byte[] value, int offset, int length) throws IOException {
        write(value, offset, length);
    }

    public static j72 newInstance(final byte[] flatArray) {
        return newInstance(flatArray, 0, flatArray.length);
    }

    public final void writeRawBytes(final vj1 value) throws IOException {
        value.mo9056o(this);
    }

    public static j72 newInstance(final byte[] flatArray, final int offset, final int length) {
        return new C7764c(flatArray, offset, length);
    }

    public static j72 newInstance(ByteBuffer buffer) {
        if (buffer.hasArray()) {
            return new C7766e(buffer);
        }
        if (buffer.isDirect() && !buffer.isReadOnly()) {
            if (C7770i.isSupported()) {
                return m13764l(buffer);
            }
            return m13763k(buffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static j72 newInstance(ByteBuffer byteBuffer, int unused) {
        return newInstance(byteBuffer);
    }
}
