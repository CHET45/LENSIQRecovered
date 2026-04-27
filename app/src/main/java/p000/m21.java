package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.opencv.videoio.Videoio;
import p000.hpi;
import p000.os9;
import p000.pzh;
import p000.rsi;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public abstract class m21 extends mj1 implements rsi {

    /* JADX INFO: renamed from: e */
    public static final int f59682e = 4096;

    /* JADX INFO: renamed from: f */
    public static final int f59683f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f59684g = 2;

    /* JADX INFO: renamed from: a */
    public final ef1 f59685a;

    /* JADX INFO: renamed from: b */
    public final int f59686b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<AbstractC1952bn> f59687c;

    /* JADX INFO: renamed from: d */
    public int f59688d;

    /* JADX INFO: renamed from: m21$a */
    public static /* synthetic */ class C9098a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59689a;

        static {
            int[] iArr = new int[hpi.EnumC6968b.values().length];
            f59689a = iArr;
            try {
                iArr[hpi.EnumC6968b.f44484H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44483F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44482C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44500m.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44498e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44493Z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44487M1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44490V1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44494Z1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44485L.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44491X.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44499f.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44497d.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44496c.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44488N.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44489Q.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f59689a[hpi.EnumC6968b.f44492Y.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: renamed from: m21$b */
    public static final class C9099b extends m21 {

        /* JADX INFO: renamed from: h */
        public ByteBuffer f59690h;

        /* JADX INFO: renamed from: i */
        public int f59691i;

        /* JADX INFO: renamed from: j */
        public int f59692j;

        public C9099b(ef1 alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.f59691i - this.f59692j;
        }

        private void nextBuffer() {
            nextBuffer(m16565e());
        }

        private int spaceLeft() {
            return this.f59692j + 1;
        }

        private void writeVarint32FiveBytes(int value) {
            ByteBuffer byteBuffer = this.f59690h;
            int i = this.f59692j;
            this.f59692j = i - 1;
            byteBuffer.put(i, (byte) (value >>> 28));
            int i2 = this.f59692j;
            this.f59692j = i2 - 4;
            this.f59690h.putInt(i2 - 3, (value & 127) | 128 | ((((value >>> 21) & 127) | 128) << 24) | ((((value >>> 14) & 127) | 128) << 16) | ((((value >>> 7) & 127) | 128) << 8));
        }

        private void writeVarint32FourBytes(int value) {
            int i = this.f59692j;
            this.f59692j = i - 4;
            this.f59690h.putInt(i - 3, (value & 127) | 128 | ((266338304 & value) << 3) | (((2080768 & value) | 2097152) << 2) | (((value & 16256) | 16384) << 1));
        }

        private void writeVarint32OneByte(int value) {
            ByteBuffer byteBuffer = this.f59690h;
            int i = this.f59692j;
            this.f59692j = i - 1;
            byteBuffer.put(i, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            int i = this.f59692j - 3;
            this.f59692j = i;
            this.f59690h.putInt(i, (((value & 127) | 128) << 8) | ((2080768 & value) << 10) | (((value & 16256) | 16384) << 9));
        }

        private void writeVarint32TwoBytes(int value) {
            int i = this.f59692j;
            this.f59692j = i - 2;
            this.f59690h.putShort(i - 1, (short) ((value & 127) | 128 | ((value & 16256) << 1)));
        }

        private void writeVarint64EightBytes(long value) {
            int i = this.f59692j;
            this.f59692j = i - 8;
            this.f59690h.putLong(i - 7, (value & 127) | 128 | ((71494644084506624L & value) << 7) | (((558551906910208L & value) | 562949953421312L) << 6) | (((4363686772736L & value) | 4398046511104L) << 5) | (((34091302912L & value) | 34359738368L) << 4) | (((266338304 & value) | 268435456) << 3) | (((2080768 & value) | 2097152) << 2) | (((16256 & value) | 16384) << 1));
        }

        private void writeVarint64EightBytesWithSign(long value) {
            int i = this.f59692j;
            this.f59692j = i - 8;
            this.f59690h.putLong(i - 7, (value & 127) | 128 | (((71494644084506624L & value) | 72057594037927936L) << 7) | (((558551906910208L & value) | 562949953421312L) << 6) | (((4363686772736L & value) | 4398046511104L) << 5) | (((34091302912L & value) | 34359738368L) << 4) | (((266338304 & value) | 268435456) << 3) | (((2080768 & value) | 2097152) << 2) | (((16256 & value) | 16384) << 1));
        }

        private void writeVarint64FiveBytes(long value) {
            int i = this.f59692j;
            this.f59692j = i - 5;
            this.f59690h.putLong(i - 7, (((value & 127) | 128) << 24) | ((34091302912L & value) << 28) | (((266338304 & value) | 268435456) << 27) | (((2080768 & value) | 2097152) << 26) | (((16256 & value) | 16384) << 25));
        }

        private void writeVarint64FourBytes(long value) {
            writeVarint32FourBytes((int) value);
        }

        private void writeVarint64NineBytes(long value) {
            ByteBuffer byteBuffer = this.f59690h;
            int i = this.f59692j;
            this.f59692j = i - 1;
            byteBuffer.put(i, (byte) (value >>> 56));
            writeVarint64EightBytesWithSign(value & 72057594037927935L);
        }

        private void writeVarint64OneByte(long value) {
            writeVarint32OneByte((int) value);
        }

        private void writeVarint64SevenBytes(long value) {
            int i = this.f59692j - 7;
            this.f59692j = i;
            this.f59690h.putLong(i, (((value & 127) | 128) << 8) | ((558551906910208L & value) << 14) | (((4363686772736L & value) | 4398046511104L) << 13) | (((34091302912L & value) | 34359738368L) << 12) | (((266338304 & value) | 268435456) << 11) | (((2080768 & value) | 2097152) << 10) | (((16256 & value) | 16384) << 9));
        }

        private void writeVarint64SixBytes(long value) {
            int i = this.f59692j;
            this.f59692j = i - 6;
            this.f59690h.putLong(i - 7, (((value & 127) | 128) << 16) | ((4363686772736L & value) << 21) | (((34091302912L & value) | 34359738368L) << 20) | (((266338304 & value) | 268435456) << 19) | (((2080768 & value) | 2097152) << 18) | (((16256 & value) | 16384) << 17));
        }

        private void writeVarint64TenBytes(long value) {
            ByteBuffer byteBuffer = this.f59690h;
            int i = this.f59692j;
            this.f59692j = i - 1;
            byteBuffer.put(i, (byte) (value >>> 63));
            ByteBuffer byteBuffer2 = this.f59690h;
            int i2 = this.f59692j;
            this.f59692j = i2 - 1;
            byteBuffer2.put(i2, (byte) (((value >>> 56) & 127) | 128));
            writeVarint64EightBytesWithSign(value & 72057594037927935L);
        }

        private void writeVarint64ThreeBytes(long value) {
            writeVarint32ThreeBytes((int) value);
        }

        private void writeVarint64TwoBytes(long value) {
            writeVarint32TwoBytes((int) value);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: b */
        public void mo16564b() {
            if (this.f59690h != null) {
                this.f59688d += bytesWrittenToCurrentBuffer();
                li8.m16163e(this.f59690h, this.f59692j + 1);
                this.f59690h = null;
                this.f59692j = 0;
                this.f59691i = 0;
            }
        }

        @Override // p000.m21
        public int getTotalBytesWritten() {
            return this.f59688d + bytesWrittenToCurrentBuffer();
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: m */
        public void mo16569m(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: n */
        public void mo16570n(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: o */
        public void mo16571o(int value) {
            int i = this.f59692j;
            this.f59692j = i - 4;
            this.f59690h.putInt(i - 3, value);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: p */
        public void mo16572p(long value) {
            int i = this.f59692j;
            this.f59692j = i - 8;
            this.f59690h.putLong(i - 7, value);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: q */
        public void mo16573q(int value) {
            if (value >= 0) {
                mo16577v(value);
            } else {
                mo16578w(value);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: s */
        public void mo16574s(int value) {
            mo16577v(j72.encodeZigZag32(value));
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: t */
        public void mo16575t(long value) {
            mo16578w(j72.encodeZigZag64(value));
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: u */
        public void mo16576u(String in) {
            int i;
            int i2;
            int i3;
            char cCharAt;
            mo16569m(in.length());
            int length = in.length() - 1;
            this.f59692j -= length;
            while (length >= 0 && (cCharAt = in.charAt(length)) < 128) {
                this.f59690h.put(this.f59692j + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.f59692j--;
                return;
            }
            this.f59692j += length;
            while (length >= 0) {
                char cCharAt2 = in.charAt(length);
                if (cCharAt2 < 128 && (i3 = this.f59692j) >= 0) {
                    ByteBuffer byteBuffer = this.f59690h;
                    this.f59692j = i3 - 1;
                    byteBuffer.put(i3, (byte) cCharAt2);
                } else if (cCharAt2 < 2048 && (i2 = this.f59692j) > 0) {
                    ByteBuffer byteBuffer2 = this.f59690h;
                    this.f59692j = i2 - 1;
                    byteBuffer2.put(i2, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f59690h;
                    int i4 = this.f59692j;
                    this.f59692j = i4 - 1;
                    byteBuffer3.put(i4, (byte) ((cCharAt2 >>> 6) | 960));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i = this.f59692j) > 1) {
                    ByteBuffer byteBuffer4 = this.f59690h;
                    this.f59692j = i - 1;
                    byteBuffer4.put(i, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f59690h;
                    int i5 = this.f59692j;
                    this.f59692j = i5 - 1;
                    byteBuffer5.put(i5, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f59690h;
                    int i6 = this.f59692j;
                    this.f59692j = i6 - 1;
                    byteBuffer6.put(i6, (byte) ((cCharAt2 >>> '\f') | Videoio.CAP_PROP_XI_CC_MATRIX_01));
                } else {
                    if (this.f59692j > 2) {
                        if (length != 0) {
                            char cCharAt3 = in.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                ByteBuffer byteBuffer7 = this.f59690h;
                                int i7 = this.f59692j;
                                this.f59692j = i7 - 1;
                                byteBuffer7.put(i7, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.f59690h;
                                int i8 = this.f59692j;
                                this.f59692j = i8 - 1;
                                byteBuffer8.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.f59690h;
                                int i9 = this.f59692j;
                                this.f59692j = i9 - 1;
                                byteBuffer9.put(i9, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.f59690h;
                                int i10 = this.f59692j;
                                this.f59692j = i10 - 1;
                                byteBuffer10.put(i10, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new pzh.C11196d(length - 1, length);
                    }
                    mo16569m(length);
                    length++;
                }
                length--;
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: v */
        public void mo16577v(int value) {
            if ((value & (-128)) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: w */
        public void mo16578w(long value) {
            switch (m21.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        @Override // p000.mj1
        public void write(byte value) {
            ByteBuffer byteBuffer = this.f59690h;
            int i = this.f59692j;
            this.f59692j = i - 1;
            byteBuffer.put(i, value);
        }

        @Override // p000.rsi
        public void writeBool(int i, boolean z) {
            mo16569m(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // p000.rsi
        public void writeBytes(int fieldNumber, vj1 value) {
            try {
                value.mo9058r(this);
                mo16569m(10);
                mo16577v(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p000.rsi
        @Deprecated
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // p000.rsi
        public void writeFixed32(int fieldNumber, int value) {
            mo16569m(9);
            mo16571o(value);
            writeTag(fieldNumber, 5);
        }

        @Override // p000.rsi
        public void writeFixed64(int fieldNumber, long value) {
            mo16569m(13);
            mo16572p(value);
            writeTag(fieldNumber, 1);
        }

        @Override // p000.rsi
        @Deprecated
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            khd.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.rsi
        public void writeInt32(int fieldNumber, int value) {
            mo16569m(15);
            mo16573q(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.mj1
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.f59688d += length;
                this.f59687c.addFirst(AbstractC1952bn.wrap(value, offset, length));
                nextBuffer();
            } else {
                int i = this.f59692j - length;
                this.f59692j = i;
                li8.m16163e(this.f59690h, i + 1);
                this.f59690h.put(value, offset, length);
            }
        }

        @Override // p000.rsi
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            khd.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.rsi
        public void writeSInt32(int fieldNumber, int value) {
            mo16569m(10);
            mo16574s(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        public void writeSInt64(int fieldNumber, long value) {
            mo16569m(15);
            mo16575t(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        @Deprecated
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // p000.rsi
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            mo16576u(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.m21
        public void writeTag(int fieldNumber, int wireType) {
            mo16577v(hpi.m12536a(fieldNumber, wireType));
        }

        @Override // p000.rsi
        public void writeUInt32(int fieldNumber, int value) {
            mo16569m(10);
            mo16577v(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        public void writeUInt64(int fieldNumber, long value) {
            mo16569m(15);
            mo16578w(value);
            writeTag(fieldNumber, 0);
        }

        private void nextBuffer(int capacity) {
            nextBuffer(m16566f(capacity));
        }

        @Override // p000.mj1
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            int i = this.f59692j - length;
            this.f59692j = i;
            li8.m16163e(this.f59690h, i + 1);
            this.f59690h.put(value, offset, length);
        }

        private void nextBuffer(AbstractC1952bn allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
                if (byteBufferNioBuffer.isDirect()) {
                    mo16564b();
                    this.f59687c.addFirst(allocatedBuffer);
                    this.f59690h = byteBufferNioBuffer;
                    li8.m16161c(byteBufferNioBuffer, byteBufferNioBuffer.capacity());
                    li8.m16163e(this.f59690h, 0);
                    this.f59690h.order(ByteOrder.LITTLE_ENDIAN);
                    int iLimit = this.f59690h.limit() - 1;
                    this.f59691i = iLimit;
                    this.f59692j = iLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // p000.rsi
        public void writeGroup(int fieldNumber, Object value, tpe schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.mj1
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i = this.f59692j - iRemaining;
            this.f59692j = i;
            li8.m16163e(this.f59690h, i + 1);
            this.f59690h.put(value);
        }

        @Override // p000.rsi
        public void writeMessage(int fieldNumber, Object value, tpe schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.mj1
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.f59688d += iRemaining;
                this.f59687c.addFirst(AbstractC1952bn.wrap(value));
                nextBuffer();
            } else {
                int i = this.f59692j - iRemaining;
                this.f59692j = i;
                li8.m16163e(this.f59690h, i + 1);
                this.f59690h.put(value);
            }
        }
    }

    /* JADX INFO: renamed from: m21$c */
    public static final class C9100c extends m21 {

        /* JADX INFO: renamed from: h */
        public AbstractC1952bn f59693h;

        /* JADX INFO: renamed from: i */
        public byte[] f59694i;

        /* JADX INFO: renamed from: j */
        public int f59695j;

        /* JADX INFO: renamed from: k */
        public int f59696k;

        /* JADX INFO: renamed from: l */
        public int f59697l;

        /* JADX INFO: renamed from: m */
        public int f59698m;

        /* JADX INFO: renamed from: n */
        public int f59699n;

        public C9100c(ef1 alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(m16567g());
        }

        private void writeVarint32FiveBytes(int value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 28);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 21) & 127) | 128);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) (((value >>> 14) & 127) | 128);
            int i5 = i - 4;
            this.f59699n = i5;
            bArr[i4] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 5;
            bArr[i5] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32FourBytes(int value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 21);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 14) & 127) | 128);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 4;
            bArr[i4] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32OneByte(int value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            this.f59699n = i - 1;
            bArr[i] = (byte) value;
        }

        private void writeVarint32ThreeBytes(int value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 14);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 3;
            bArr[i3] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32TwoBytes(int value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 7);
            this.f59699n = i - 2;
            bArr[i2] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64EightBytes(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 49);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 42) & 127) | 128);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) (((value >>> 35) & 127) | 128);
            int i5 = i - 4;
            this.f59699n = i5;
            bArr[i4] = (byte) (((value >>> 28) & 127) | 128);
            int i6 = i - 5;
            this.f59699n = i6;
            bArr[i5] = (byte) (((value >>> 21) & 127) | 128);
            int i7 = i - 6;
            this.f59699n = i7;
            bArr[i6] = (byte) (((value >>> 14) & 127) | 128);
            int i8 = i - 7;
            this.f59699n = i8;
            bArr[i7] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 8;
            bArr[i8] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64FiveBytes(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 28);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 21) & 127) | 128);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) (((value >>> 14) & 127) | 128);
            int i5 = i - 4;
            this.f59699n = i5;
            bArr[i4] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 5;
            bArr[i5] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64FourBytes(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 21);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 14) & 127) | 128);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 4;
            bArr[i4] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64NineBytes(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 56);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 49) & 127) | 128);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) (((value >>> 42) & 127) | 128);
            int i5 = i - 4;
            this.f59699n = i5;
            bArr[i4] = (byte) (((value >>> 35) & 127) | 128);
            int i6 = i - 5;
            this.f59699n = i6;
            bArr[i5] = (byte) (((value >>> 28) & 127) | 128);
            int i7 = i - 6;
            this.f59699n = i7;
            bArr[i6] = (byte) (((value >>> 21) & 127) | 128);
            int i8 = i - 7;
            this.f59699n = i8;
            bArr[i7] = (byte) (((value >>> 14) & 127) | 128);
            int i9 = i - 8;
            this.f59699n = i9;
            bArr[i8] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 9;
            bArr[i9] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64OneByte(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            this.f59699n = i - 1;
            bArr[i] = (byte) value;
        }

        private void writeVarint64SevenBytes(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 42);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 35) & 127) | 128);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) (((value >>> 28) & 127) | 128);
            int i5 = i - 4;
            this.f59699n = i5;
            bArr[i4] = (byte) (((value >>> 21) & 127) | 128);
            int i6 = i - 5;
            this.f59699n = i6;
            bArr[i5] = (byte) (((value >>> 14) & 127) | 128);
            int i7 = i - 6;
            this.f59699n = i7;
            bArr[i6] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 7;
            bArr[i7] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64SixBytes(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 35);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 28) & 127) | 128);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) (((value >>> 21) & 127) | 128);
            int i5 = i - 4;
            this.f59699n = i5;
            bArr[i4] = (byte) (((value >>> 14) & 127) | 128);
            int i6 = i - 5;
            this.f59699n = i6;
            bArr[i5] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 6;
            bArr[i6] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64TenBytes(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 63);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 56) & 127) | 128);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) (((value >>> 49) & 127) | 128);
            int i5 = i - 4;
            this.f59699n = i5;
            bArr[i4] = (byte) (((value >>> 42) & 127) | 128);
            int i6 = i - 5;
            this.f59699n = i6;
            bArr[i5] = (byte) (((value >>> 35) & 127) | 128);
            int i7 = i - 6;
            this.f59699n = i7;
            bArr[i6] = (byte) (((value >>> 28) & 127) | 128);
            int i8 = i - 7;
            this.f59699n = i8;
            bArr[i7] = (byte) (((value >>> 21) & 127) | 128);
            int i9 = i - 8;
            this.f59699n = i9;
            bArr[i8] = (byte) (((value >>> 14) & 127) | 128);
            int i10 = i - 9;
            this.f59699n = i10;
            bArr[i9] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 10;
            bArr[i10] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64ThreeBytes(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (((int) value) >>> 14);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((value >>> 7) & 127) | 128);
            this.f59699n = i - 3;
            bArr[i3] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64TwoBytes(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (value >>> 7);
            this.f59699n = i - 2;
            bArr[i2] = (byte) ((((int) value) & 127) | 128);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: b */
        public void mo16564b() {
            if (this.f59693h != null) {
                this.f59688d += bytesWrittenToCurrentBuffer();
                AbstractC1952bn abstractC1952bn = this.f59693h;
                abstractC1952bn.position((this.f59699n - abstractC1952bn.arrayOffset()) + 1);
                this.f59693h = null;
                this.f59699n = 0;
                this.f59698m = 0;
            }
        }

        public int bytesWrittenToCurrentBuffer() {
            return this.f59698m - this.f59699n;
        }

        @Override // p000.m21
        public int getTotalBytesWritten() {
            return this.f59688d + bytesWrittenToCurrentBuffer();
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: m */
        public void mo16569m(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: n */
        public void mo16570n(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: o */
        public void mo16571o(int value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) ((value >> 24) & 255);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) ((value >> 16) & 255);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) ((value >> 8) & 255);
            this.f59699n = i - 4;
            bArr[i4] = (byte) (value & 255);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: p */
        public void mo16572p(long value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            int i2 = i - 1;
            this.f59699n = i2;
            bArr[i] = (byte) (((int) (value >> 56)) & 255);
            int i3 = i - 2;
            this.f59699n = i3;
            bArr[i2] = (byte) (((int) (value >> 48)) & 255);
            int i4 = i - 3;
            this.f59699n = i4;
            bArr[i3] = (byte) (((int) (value >> 40)) & 255);
            int i5 = i - 4;
            this.f59699n = i5;
            bArr[i4] = (byte) (((int) (value >> 32)) & 255);
            int i6 = i - 5;
            this.f59699n = i6;
            bArr[i5] = (byte) (((int) (value >> 24)) & 255);
            int i7 = i - 6;
            this.f59699n = i7;
            bArr[i6] = (byte) (((int) (value >> 16)) & 255);
            int i8 = i - 7;
            this.f59699n = i8;
            bArr[i7] = (byte) (((int) (value >> 8)) & 255);
            this.f59699n = i - 8;
            bArr[i8] = (byte) (((int) value) & 255);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: q */
        public void mo16573q(int value) {
            if (value >= 0) {
                mo16577v(value);
            } else {
                mo16578w(value);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: s */
        public void mo16574s(int value) {
            mo16577v(j72.encodeZigZag32(value));
        }

        public int spaceLeft() {
            return this.f59699n - this.f59697l;
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: t */
        public void mo16575t(long value) {
            mo16578w(j72.encodeZigZag64(value));
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: u */
        public void mo16576u(String in) {
            int i;
            int i2;
            int i3;
            char cCharAt;
            mo16569m(in.length());
            int length = in.length() - 1;
            this.f59699n -= length;
            while (length >= 0 && (cCharAt = in.charAt(length)) < 128) {
                this.f59694i[this.f59699n + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.f59699n--;
                return;
            }
            this.f59699n += length;
            while (length >= 0) {
                char cCharAt2 = in.charAt(length);
                if (cCharAt2 < 128 && (i3 = this.f59699n) > this.f59697l) {
                    byte[] bArr = this.f59694i;
                    this.f59699n = i3 - 1;
                    bArr[i3] = (byte) cCharAt2;
                } else if (cCharAt2 < 2048 && (i2 = this.f59699n) > this.f59695j) {
                    byte[] bArr2 = this.f59694i;
                    int i4 = i2 - 1;
                    this.f59699n = i4;
                    bArr2[i2] = (byte) ((cCharAt2 & '?') | 128);
                    this.f59699n = i2 - 2;
                    bArr2[i4] = (byte) ((cCharAt2 >>> 6) | 960);
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i = this.f59699n) > this.f59695j + 1) {
                    byte[] bArr3 = this.f59694i;
                    int i5 = i - 1;
                    this.f59699n = i5;
                    bArr3[i] = (byte) ((cCharAt2 & '?') | 128);
                    int i6 = i - 2;
                    this.f59699n = i6;
                    bArr3[i5] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    this.f59699n = i - 3;
                    bArr3[i6] = (byte) ((cCharAt2 >>> '\f') | Videoio.CAP_PROP_XI_CC_MATRIX_01);
                } else {
                    if (this.f59699n > this.f59695j + 2) {
                        if (length != 0) {
                            char cCharAt3 = in.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                byte[] bArr4 = this.f59694i;
                                int i7 = this.f59699n;
                                int i8 = i7 - 1;
                                this.f59699n = i8;
                                bArr4[i7] = (byte) ((codePoint & 63) | 128);
                                int i9 = i7 - 2;
                                this.f59699n = i9;
                                bArr4[i8] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i10 = i7 - 3;
                                this.f59699n = i10;
                                bArr4[i9] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.f59699n = i7 - 4;
                                bArr4[i10] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new pzh.C11196d(length - 1, length);
                    }
                    mo16569m(length);
                    length++;
                }
                length--;
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: v */
        public void mo16577v(int value) {
            if ((value & (-128)) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: w */
        public void mo16578w(long value) {
            switch (m21.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        @Override // p000.mj1
        public void write(byte value) {
            byte[] bArr = this.f59694i;
            int i = this.f59699n;
            this.f59699n = i - 1;
            bArr[i] = value;
        }

        @Override // p000.rsi
        public void writeBool(int i, boolean z) throws IOException {
            mo16569m(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // p000.rsi
        public void writeBytes(int fieldNumber, vj1 value) throws IOException {
            try {
                value.mo9058r(this);
                mo16569m(10);
                mo16577v(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p000.rsi
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // p000.rsi
        public void writeFixed32(int fieldNumber, int value) throws IOException {
            mo16569m(9);
            mo16571o(value);
            writeTag(fieldNumber, 5);
        }

        @Override // p000.rsi
        public void writeFixed64(int fieldNumber, long value) throws IOException {
            mo16569m(13);
            mo16572p(value);
            writeTag(fieldNumber, 1);
        }

        @Override // p000.rsi
        @Deprecated
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            khd.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.rsi
        public void writeInt32(int fieldNumber, int value) throws IOException {
            mo16569m(15);
            mo16573q(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.mj1
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.f59688d += length;
                this.f59687c.addFirst(AbstractC1952bn.wrap(value, offset, length));
                nextBuffer();
            } else {
                int i = this.f59699n - length;
                this.f59699n = i;
                System.arraycopy(value, offset, this.f59694i, i + 1, length);
            }
        }

        @Override // p000.rsi
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            khd.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.rsi
        public void writeSInt32(int fieldNumber, int value) throws IOException {
            mo16569m(10);
            mo16574s(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        public void writeSInt64(int fieldNumber, long value) throws IOException {
            mo16569m(15);
            mo16575t(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // p000.rsi
        public void writeString(int fieldNumber, String value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            mo16576u(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.m21
        public void writeTag(int fieldNumber, int wireType) {
            mo16577v(hpi.m12536a(fieldNumber, wireType));
        }

        @Override // p000.rsi
        public void writeUInt32(int fieldNumber, int value) throws IOException {
            mo16569m(10);
            mo16577v(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        public void writeUInt64(int fieldNumber, long value) throws IOException {
            mo16569m(15);
            mo16578w(value);
            writeTag(fieldNumber, 0);
        }

        private void nextBuffer(int capacity) {
            nextBuffer(m16568h(capacity));
        }

        @Override // p000.mj1
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            int i = this.f59699n - length;
            this.f59699n = i;
            System.arraycopy(value, offset, this.f59694i, i + 1, length);
        }

        private void nextBuffer(AbstractC1952bn allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                mo16564b();
                this.f59687c.addFirst(allocatedBuffer);
                this.f59693h = allocatedBuffer;
                this.f59694i = allocatedBuffer.array();
                int iArrayOffset = allocatedBuffer.arrayOffset();
                this.f59696k = allocatedBuffer.limit() + iArrayOffset;
                int iPosition = iArrayOffset + allocatedBuffer.position();
                this.f59695j = iPosition;
                this.f59697l = iPosition - 1;
                int i = this.f59696k - 1;
                this.f59698m = i;
                this.f59699n = i;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // p000.rsi
        public void writeGroup(int fieldNumber, Object value, tpe schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.mj1
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i = this.f59699n - iRemaining;
            this.f59699n = i;
            value.get(this.f59694i, i + 1, iRemaining);
        }

        @Override // p000.mj1
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.f59688d += iRemaining;
                this.f59687c.addFirst(AbstractC1952bn.wrap(value));
                nextBuffer();
            }
            int i = this.f59699n - iRemaining;
            this.f59699n = i;
            value.get(this.f59694i, i + 1, iRemaining);
        }

        @Override // p000.rsi
        public void writeMessage(int fieldNumber, Object value, tpe schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }
    }

    /* JADX INFO: renamed from: m21$d */
    public static final class C9101d extends m21 {

        /* JADX INFO: renamed from: h */
        public ByteBuffer f59700h;

        /* JADX INFO: renamed from: i */
        public long f59701i;

        /* JADX INFO: renamed from: j */
        public long f59702j;

        /* JADX INFO: renamed from: k */
        public long f59703k;

        public C9101d(ef1 alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int bufferPos() {
            return (int) (this.f59703k - this.f59701i);
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.f59702j - this.f59703k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return dvh.m9448K();
        }

        private void nextBuffer() {
            nextBuffer(m16565e());
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        private void writeVarint32FiveBytes(int value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 28));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 21) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) (((value >>> 14) & 127) | 128));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) (((value >>> 7) & 127) | 128));
            long j5 = this.f59703k;
            this.f59703k = j5 - 1;
            dvh.m9454Q(j5, (byte) ((value & 127) | 128));
        }

        private void writeVarint32FourBytes(int value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 21));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 14) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) (((value >>> 7) & 127) | 128));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint32OneByte(int value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 14));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 7) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint32TwoBytes(int value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 7));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) ((value & 127) | 128));
        }

        private void writeVarint64EightBytes(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 49));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 42) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) (((value >>> 35) & 127) | 128));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) (((value >>> 28) & 127) | 128));
            long j5 = this.f59703k;
            this.f59703k = j5 - 1;
            dvh.m9454Q(j5, (byte) (((value >>> 21) & 127) | 128));
            long j6 = this.f59703k;
            this.f59703k = j6 - 1;
            dvh.m9454Q(j6, (byte) (((value >>> 14) & 127) | 128));
            long j7 = this.f59703k;
            this.f59703k = j7 - 1;
            dvh.m9454Q(j7, (byte) (((value >>> 7) & 127) | 128));
            long j8 = this.f59703k;
            this.f59703k = j8 - 1;
            dvh.m9454Q(j8, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FiveBytes(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 28));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 21) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) (((value >>> 14) & 127) | 128));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) (((value >>> 7) & 127) | 128));
            long j5 = this.f59703k;
            this.f59703k = j5 - 1;
            dvh.m9454Q(j5, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FourBytes(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 21));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 14) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) (((value >>> 7) & 127) | 128));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint64NineBytes(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 56));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 49) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) (((value >>> 42) & 127) | 128));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) (((value >>> 35) & 127) | 128));
            long j5 = this.f59703k;
            this.f59703k = j5 - 1;
            dvh.m9454Q(j5, (byte) (((value >>> 28) & 127) | 128));
            long j6 = this.f59703k;
            this.f59703k = j6 - 1;
            dvh.m9454Q(j6, (byte) (((value >>> 21) & 127) | 128));
            long j7 = this.f59703k;
            this.f59703k = j7 - 1;
            dvh.m9454Q(j7, (byte) (((value >>> 14) & 127) | 128));
            long j8 = this.f59703k;
            this.f59703k = j8 - 1;
            dvh.m9454Q(j8, (byte) (((value >>> 7) & 127) | 128));
            long j9 = this.f59703k;
            this.f59703k = j9 - 1;
            dvh.m9454Q(j9, (byte) ((value & 127) | 128));
        }

        private void writeVarint64OneByte(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) value);
        }

        private void writeVarint64SevenBytes(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 42));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 35) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) (((value >>> 28) & 127) | 128));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) (((value >>> 21) & 127) | 128));
            long j5 = this.f59703k;
            this.f59703k = j5 - 1;
            dvh.m9454Q(j5, (byte) (((value >>> 14) & 127) | 128));
            long j6 = this.f59703k;
            this.f59703k = j6 - 1;
            dvh.m9454Q(j6, (byte) (((value >>> 7) & 127) | 128));
            long j7 = this.f59703k;
            this.f59703k = j7 - 1;
            dvh.m9454Q(j7, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SixBytes(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 35));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 28) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) (((value >>> 21) & 127) | 128));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) (((value >>> 14) & 127) | 128));
            long j5 = this.f59703k;
            this.f59703k = j5 - 1;
            dvh.m9454Q(j5, (byte) (((value >>> 7) & 127) | 128));
            long j6 = this.f59703k;
            this.f59703k = j6 - 1;
            dvh.m9454Q(j6, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TenBytes(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 63));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 56) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) (((value >>> 49) & 127) | 128));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) (((value >>> 42) & 127) | 128));
            long j5 = this.f59703k;
            this.f59703k = j5 - 1;
            dvh.m9454Q(j5, (byte) (((value >>> 35) & 127) | 128));
            long j6 = this.f59703k;
            this.f59703k = j6 - 1;
            dvh.m9454Q(j6, (byte) (((value >>> 28) & 127) | 128));
            long j7 = this.f59703k;
            this.f59703k = j7 - 1;
            dvh.m9454Q(j7, (byte) (((value >>> 21) & 127) | 128));
            long j8 = this.f59703k;
            this.f59703k = j8 - 1;
            dvh.m9454Q(j8, (byte) (((value >>> 14) & 127) | 128));
            long j9 = this.f59703k;
            this.f59703k = j9 - 1;
            dvh.m9454Q(j9, (byte) (((value >>> 7) & 127) | 128));
            long j10 = this.f59703k;
            this.f59703k = j10 - 1;
            dvh.m9454Q(j10, (byte) ((value & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (((int) value) >>> 14));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((value >>> 7) & 127) | 128));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TwoBytes(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (value >>> 7));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) ((((int) value) & 127) | 128));
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: b */
        public void mo16564b() {
            if (this.f59700h != null) {
                this.f59688d += bytesWrittenToCurrentBuffer();
                li8.m16163e(this.f59700h, bufferPos() + 1);
                this.f59700h = null;
                this.f59703k = 0L;
                this.f59702j = 0L;
            }
        }

        @Override // p000.m21
        public int getTotalBytesWritten() {
            return this.f59688d + bytesWrittenToCurrentBuffer();
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: m */
        public void mo16569m(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: n */
        public void mo16570n(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: o */
        public void mo16571o(int value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) ((value >> 24) & 255));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) ((value >> 16) & 255));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) ((value >> 8) & 255));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) (value & 255));
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: p */
        public void mo16572p(long value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, (byte) (((int) (value >> 56)) & 255));
            long j2 = this.f59703k;
            this.f59703k = j2 - 1;
            dvh.m9454Q(j2, (byte) (((int) (value >> 48)) & 255));
            long j3 = this.f59703k;
            this.f59703k = j3 - 1;
            dvh.m9454Q(j3, (byte) (((int) (value >> 40)) & 255));
            long j4 = this.f59703k;
            this.f59703k = j4 - 1;
            dvh.m9454Q(j4, (byte) (((int) (value >> 32)) & 255));
            long j5 = this.f59703k;
            this.f59703k = j5 - 1;
            dvh.m9454Q(j5, (byte) (((int) (value >> 24)) & 255));
            long j6 = this.f59703k;
            this.f59703k = j6 - 1;
            dvh.m9454Q(j6, (byte) (((int) (value >> 16)) & 255));
            long j7 = this.f59703k;
            this.f59703k = j7 - 1;
            dvh.m9454Q(j7, (byte) (((int) (value >> 8)) & 255));
            long j8 = this.f59703k;
            this.f59703k = j8 - 1;
            dvh.m9454Q(j8, (byte) (((int) value) & 255));
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: q */
        public void mo16573q(int value) {
            if (value >= 0) {
                mo16577v(value);
            } else {
                mo16578w(value);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: s */
        public void mo16574s(int value) {
            mo16577v(j72.encodeZigZag32(value));
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: t */
        public void mo16575t(long value) {
            mo16578w(j72.encodeZigZag64(value));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
        @Override // p000.m21
        /* JADX INFO: renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo16576u(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.m21.C9101d.mo16576u(java.lang.String):void");
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: v */
        public void mo16577v(int value) {
            if ((value & (-128)) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: w */
        public void mo16578w(long value) {
            switch (m21.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        @Override // p000.mj1
        public void write(byte value) {
            long j = this.f59703k;
            this.f59703k = j - 1;
            dvh.m9454Q(j, value);
        }

        @Override // p000.rsi
        public void writeBool(int i, boolean z) {
            mo16569m(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // p000.rsi
        public void writeBytes(int fieldNumber, vj1 value) {
            try {
                value.mo9058r(this);
                mo16569m(10);
                mo16577v(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p000.rsi
        @Deprecated
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // p000.rsi
        public void writeFixed32(int fieldNumber, int value) {
            mo16569m(9);
            mo16571o(value);
            writeTag(fieldNumber, 5);
        }

        @Override // p000.rsi
        public void writeFixed64(int fieldNumber, long value) {
            mo16569m(13);
            mo16572p(value);
            writeTag(fieldNumber, 1);
        }

        @Override // p000.rsi
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            khd.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.rsi
        public void writeInt32(int fieldNumber, int value) {
            mo16569m(15);
            mo16573q(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.mj1
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.f59688d += length;
                this.f59687c.addFirst(AbstractC1952bn.wrap(value, offset, length));
                nextBuffer();
            } else {
                this.f59703k -= (long) length;
                li8.m16163e(this.f59700h, bufferPos() + 1);
                this.f59700h.put(value, offset, length);
            }
        }

        @Override // p000.rsi
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            khd.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.rsi
        public void writeSInt32(int fieldNumber, int value) {
            mo16569m(10);
            mo16574s(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        public void writeSInt64(int fieldNumber, long value) {
            mo16569m(15);
            mo16575t(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        @Deprecated
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // p000.rsi
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            mo16576u(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.m21
        public void writeTag(int fieldNumber, int wireType) {
            mo16577v(hpi.m12536a(fieldNumber, wireType));
        }

        @Override // p000.rsi
        public void writeUInt32(int fieldNumber, int value) {
            mo16569m(10);
            mo16577v(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        public void writeUInt64(int fieldNumber, long value) {
            mo16569m(15);
            mo16578w(value);
            writeTag(fieldNumber, 0);
        }

        private void nextBuffer(int capacity) {
            nextBuffer(m16566f(capacity));
        }

        @Override // p000.mj1
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            this.f59703k -= (long) length;
            li8.m16163e(this.f59700h, bufferPos() + 1);
            this.f59700h.put(value, offset, length);
        }

        private void nextBuffer(AbstractC1952bn allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
                if (byteBufferNioBuffer.isDirect()) {
                    mo16564b();
                    this.f59687c.addFirst(allocatedBuffer);
                    this.f59700h = byteBufferNioBuffer;
                    li8.m16161c(byteBufferNioBuffer, byteBufferNioBuffer.capacity());
                    li8.m16163e(this.f59700h, 0);
                    long jM9479k = dvh.m9479k(this.f59700h);
                    this.f59701i = jM9479k;
                    long jLimit = jM9479k + ((long) (this.f59700h.limit() - 1));
                    this.f59702j = jLimit;
                    this.f59703k = jLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // p000.rsi
        public void writeGroup(int fieldNumber, Object value, tpe schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.mj1
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            this.f59703k -= (long) iRemaining;
            li8.m16163e(this.f59700h, bufferPos() + 1);
            this.f59700h.put(value);
        }

        @Override // p000.rsi
        public void writeMessage(int fieldNumber, Object value, tpe schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.mj1
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.f59688d += iRemaining;
                this.f59687c.addFirst(AbstractC1952bn.wrap(value));
                nextBuffer();
            } else {
                this.f59703k -= (long) iRemaining;
                li8.m16163e(this.f59700h, bufferPos() + 1);
                this.f59700h.put(value);
            }
        }
    }

    /* JADX INFO: renamed from: m21$e */
    public static final class C9102e extends m21 {

        /* JADX INFO: renamed from: h */
        public AbstractC1952bn f59704h;

        /* JADX INFO: renamed from: i */
        public byte[] f59705i;

        /* JADX INFO: renamed from: j */
        public long f59706j;

        /* JADX INFO: renamed from: k */
        public long f59707k;

        /* JADX INFO: renamed from: l */
        public long f59708l;

        /* JADX INFO: renamed from: m */
        public long f59709m;

        /* JADX INFO: renamed from: n */
        public long f59710n;

        public C9102e(ef1 alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int arrayPos() {
            return (int) this.f59710n;
        }

        public static boolean isSupported() {
            return dvh.m9447J();
        }

        private void nextBuffer() {
            nextBuffer(m16567g());
        }

        private void writeVarint32FiveBytes(int value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 28));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr5 = this.f59705i;
            long j5 = this.f59710n;
            this.f59710n = j5 - 1;
            dvh.m9456S(bArr5, j5, (byte) ((value & 127) | 128));
        }

        private void writeVarint32FourBytes(int value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 21));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint32OneByte(int value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 14));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint32TwoBytes(int value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 7));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) ((value & 127) | 128));
        }

        private void writeVarint64EightBytes(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 49));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr5 = this.f59705i;
            long j5 = this.f59710n;
            this.f59710n = j5 - 1;
            dvh.m9456S(bArr5, j5, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr6 = this.f59705i;
            long j6 = this.f59710n;
            this.f59710n = j6 - 1;
            dvh.m9456S(bArr6, j6, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr7 = this.f59705i;
            long j7 = this.f59710n;
            this.f59710n = j7 - 1;
            dvh.m9456S(bArr7, j7, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr8 = this.f59705i;
            long j8 = this.f59710n;
            this.f59710n = j8 - 1;
            dvh.m9456S(bArr8, j8, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FiveBytes(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 28));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr5 = this.f59705i;
            long j5 = this.f59710n;
            this.f59710n = j5 - 1;
            dvh.m9456S(bArr5, j5, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FourBytes(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 21));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint64NineBytes(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 56));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr5 = this.f59705i;
            long j5 = this.f59710n;
            this.f59710n = j5 - 1;
            dvh.m9456S(bArr5, j5, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr6 = this.f59705i;
            long j6 = this.f59710n;
            this.f59710n = j6 - 1;
            dvh.m9456S(bArr6, j6, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr7 = this.f59705i;
            long j7 = this.f59710n;
            this.f59710n = j7 - 1;
            dvh.m9456S(bArr7, j7, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr8 = this.f59705i;
            long j8 = this.f59710n;
            this.f59710n = j8 - 1;
            dvh.m9456S(bArr8, j8, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr9 = this.f59705i;
            long j9 = this.f59710n;
            this.f59710n = j9 - 1;
            dvh.m9456S(bArr9, j9, (byte) ((value & 127) | 128));
        }

        private void writeVarint64OneByte(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) value);
        }

        private void writeVarint64SevenBytes(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 42));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr5 = this.f59705i;
            long j5 = this.f59710n;
            this.f59710n = j5 - 1;
            dvh.m9456S(bArr5, j5, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr6 = this.f59705i;
            long j6 = this.f59710n;
            this.f59710n = j6 - 1;
            dvh.m9456S(bArr6, j6, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr7 = this.f59705i;
            long j7 = this.f59710n;
            this.f59710n = j7 - 1;
            dvh.m9456S(bArr7, j7, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SixBytes(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 35));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr5 = this.f59705i;
            long j5 = this.f59710n;
            this.f59710n = j5 - 1;
            dvh.m9456S(bArr5, j5, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr6 = this.f59705i;
            long j6 = this.f59710n;
            this.f59710n = j6 - 1;
            dvh.m9456S(bArr6, j6, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TenBytes(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 63));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 56) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr5 = this.f59705i;
            long j5 = this.f59710n;
            this.f59710n = j5 - 1;
            dvh.m9456S(bArr5, j5, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr6 = this.f59705i;
            long j6 = this.f59710n;
            this.f59710n = j6 - 1;
            dvh.m9456S(bArr6, j6, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr7 = this.f59705i;
            long j7 = this.f59710n;
            this.f59710n = j7 - 1;
            dvh.m9456S(bArr7, j7, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr8 = this.f59705i;
            long j8 = this.f59710n;
            this.f59710n = j8 - 1;
            dvh.m9456S(bArr8, j8, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr9 = this.f59705i;
            long j9 = this.f59710n;
            this.f59710n = j9 - 1;
            dvh.m9456S(bArr9, j9, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr10 = this.f59705i;
            long j10 = this.f59710n;
            this.f59710n = j10 - 1;
            dvh.m9456S(bArr10, j10, (byte) ((value & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (((int) value) >>> 14));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TwoBytes(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (value >>> 7));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) ((((int) value) & 127) | 128));
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: b */
        public void mo16564b() {
            if (this.f59704h != null) {
                this.f59688d += bytesWrittenToCurrentBuffer();
                this.f59704h.position((arrayPos() - this.f59704h.arrayOffset()) + 1);
                this.f59704h = null;
                this.f59710n = 0L;
                this.f59709m = 0L;
            }
        }

        public int bytesWrittenToCurrentBuffer() {
            return (int) (this.f59709m - this.f59710n);
        }

        @Override // p000.m21
        public int getTotalBytesWritten() {
            return this.f59688d + bytesWrittenToCurrentBuffer();
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: m */
        public void mo16569m(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: n */
        public void mo16570n(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: o */
        public void mo16571o(int value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) ((value >> 24) & 255));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) ((value >> 16) & 255));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) ((value >> 8) & 255));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) (value & 255));
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: p */
        public void mo16572p(long value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, (byte) (((int) (value >> 56)) & 255));
            byte[] bArr2 = this.f59705i;
            long j2 = this.f59710n;
            this.f59710n = j2 - 1;
            dvh.m9456S(bArr2, j2, (byte) (((int) (value >> 48)) & 255));
            byte[] bArr3 = this.f59705i;
            long j3 = this.f59710n;
            this.f59710n = j3 - 1;
            dvh.m9456S(bArr3, j3, (byte) (((int) (value >> 40)) & 255));
            byte[] bArr4 = this.f59705i;
            long j4 = this.f59710n;
            this.f59710n = j4 - 1;
            dvh.m9456S(bArr4, j4, (byte) (((int) (value >> 32)) & 255));
            byte[] bArr5 = this.f59705i;
            long j5 = this.f59710n;
            this.f59710n = j5 - 1;
            dvh.m9456S(bArr5, j5, (byte) (((int) (value >> 24)) & 255));
            byte[] bArr6 = this.f59705i;
            long j6 = this.f59710n;
            this.f59710n = j6 - 1;
            dvh.m9456S(bArr6, j6, (byte) (((int) (value >> 16)) & 255));
            byte[] bArr7 = this.f59705i;
            long j7 = this.f59710n;
            this.f59710n = j7 - 1;
            dvh.m9456S(bArr7, j7, (byte) (((int) (value >> 8)) & 255));
            byte[] bArr8 = this.f59705i;
            long j8 = this.f59710n;
            this.f59710n = j8 - 1;
            dvh.m9456S(bArr8, j8, (byte) (((int) value) & 255));
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: q */
        public void mo16573q(int value) {
            if (value >= 0) {
                mo16577v(value);
            } else {
                mo16578w(value);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: s */
        public void mo16574s(int value) {
            mo16577v(j72.encodeZigZag32(value));
        }

        public int spaceLeft() {
            return (int) (this.f59710n - this.f59708l);
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: t */
        public void mo16575t(long value) {
            mo16578w(j72.encodeZigZag64(value));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
        @Override // p000.m21
        /* JADX INFO: renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo16576u(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.m21.C9102e.mo16576u(java.lang.String):void");
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: v */
        public void mo16577v(int value) {
            if ((value & (-128)) == 0) {
                writeVarint32OneByte(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                writeVarint32TwoBytes(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                writeVarint32ThreeBytes(value);
            } else if (((-268435456) & value) == 0) {
                writeVarint32FourBytes(value);
            } else {
                writeVarint32FiveBytes(value);
            }
        }

        @Override // p000.m21
        /* JADX INFO: renamed from: w */
        public void mo16578w(long value) {
            switch (m21.computeUInt64SizeNoTag(value)) {
                case 1:
                    writeVarint64OneByte(value);
                    break;
                case 2:
                    writeVarint64TwoBytes(value);
                    break;
                case 3:
                    writeVarint64ThreeBytes(value);
                    break;
                case 4:
                    writeVarint64FourBytes(value);
                    break;
                case 5:
                    writeVarint64FiveBytes(value);
                    break;
                case 6:
                    writeVarint64SixBytes(value);
                    break;
                case 7:
                    writeVarint64SevenBytes(value);
                    break;
                case 8:
                    writeVarint64EightBytes(value);
                    break;
                case 9:
                    writeVarint64NineBytes(value);
                    break;
                case 10:
                    writeVarint64TenBytes(value);
                    break;
            }
        }

        @Override // p000.mj1
        public void write(byte value) {
            byte[] bArr = this.f59705i;
            long j = this.f59710n;
            this.f59710n = j - 1;
            dvh.m9456S(bArr, j, value);
        }

        @Override // p000.rsi
        public void writeBool(int i, boolean z) {
            mo16569m(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // p000.rsi
        public void writeBytes(int fieldNumber, vj1 value) {
            try {
                value.mo9058r(this);
                mo16569m(10);
                mo16577v(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p000.rsi
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // p000.rsi
        public void writeFixed32(int fieldNumber, int value) {
            mo16569m(9);
            mo16571o(value);
            writeTag(fieldNumber, 5);
        }

        @Override // p000.rsi
        public void writeFixed64(int fieldNumber, long value) {
            mo16569m(13);
            mo16572p(value);
            writeTag(fieldNumber, 1);
        }

        @Override // p000.rsi
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            khd.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.rsi
        public void writeInt32(int fieldNumber, int value) {
            mo16569m(15);
            mo16573q(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.mj1
        public void writeLazy(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(value.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            if (spaceLeft() >= length) {
                this.f59710n -= (long) length;
                System.arraycopy(value, offset, this.f59705i, arrayPos() + 1, length);
            } else {
                this.f59688d += length;
                this.f59687c.addFirst(AbstractC1952bn.wrap(value, offset, length));
                nextBuffer();
            }
        }

        @Override // p000.rsi
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            khd.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.rsi
        public void writeSInt32(int fieldNumber, int value) {
            mo16569m(10);
            mo16574s(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        public void writeSInt64(int fieldNumber, long value) {
            mo16569m(15);
            mo16575t(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // p000.rsi
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            mo16576u(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.m21
        public void writeTag(int fieldNumber, int wireType) {
            mo16577v(hpi.m12536a(fieldNumber, wireType));
        }

        @Override // p000.rsi
        public void writeUInt32(int fieldNumber, int value) {
            mo16569m(10);
            mo16577v(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.rsi
        public void writeUInt64(int fieldNumber, long value) {
            mo16569m(15);
            mo16578w(value);
            writeTag(fieldNumber, 0);
        }

        private void nextBuffer(int capacity) {
            nextBuffer(m16568h(capacity));
        }

        @Override // p000.mj1
        public void write(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(value.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            mo16569m(length);
            this.f59710n -= (long) length;
            System.arraycopy(value, offset, this.f59705i, arrayPos() + 1, length);
        }

        private void nextBuffer(AbstractC1952bn allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                mo16564b();
                this.f59687c.addFirst(allocatedBuffer);
                this.f59704h = allocatedBuffer;
                this.f59705i = allocatedBuffer.array();
                long jArrayOffset = allocatedBuffer.arrayOffset();
                this.f59707k = ((long) allocatedBuffer.limit()) + jArrayOffset;
                long jPosition = jArrayOffset + ((long) allocatedBuffer.position());
                this.f59706j = jPosition;
                this.f59708l = jPosition - 1;
                long j = this.f59707k - 1;
                this.f59709m = j;
                this.f59710n = j;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // p000.rsi
        public void writeGroup(int fieldNumber, Object value, tpe schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.rsi
        public void writeMessage(int fieldNumber, Object value, tpe schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo16569m(10);
            mo16577v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.mj1
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            mo16569m(iRemaining);
            this.f59710n -= (long) iRemaining;
            value.get(this.f59705i, arrayPos() + 1, iRemaining);
        }

        @Override // p000.mj1
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.f59688d += iRemaining;
                this.f59687c.addFirst(AbstractC1952bn.wrap(value));
                nextBuffer();
            }
            this.f59710n -= (long) iRemaining;
            value.get(this.f59705i, arrayPos() + 1, iRemaining);
        }
    }

    public /* synthetic */ m21(ef1 ef1Var, int i, C9098a c9098a) {
        this(ef1Var, i);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16557c() {
        return C9101d.isSupported();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long value) {
        byte b;
        if (((-128) & value) == 0) {
            return (byte) 1;
        }
        if (value < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & value) != 0) {
            b = (byte) 6;
            value >>>= 28;
        } else {
            b = 2;
        }
        if ((v13.f89665d2 & value) != 0) {
            b = (byte) (b + 2);
            value >>>= 14;
        }
        return (value & (-16384)) != 0 ? (byte) (b + 1) : b;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16558d() {
        return C9102e.isSupported();
    }

    /* JADX INFO: renamed from: i */
    public static m21 m16559i(ef1 alloc, int chunkSize) {
        return new C9099b(alloc, chunkSize);
    }

    /* JADX INFO: renamed from: j */
    public static m21 m16560j(ef1 alloc, int chunkSize) {
        return new C9100c(alloc, chunkSize);
    }

    /* JADX INFO: renamed from: k */
    public static m21 m16561k(ef1 alloc, int chunkSize) {
        if (m16557c()) {
            return new C9101d(alloc, chunkSize);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    /* JADX INFO: renamed from: l */
    public static m21 m16562l(ef1 alloc, int chunkSize) {
        if (m16558d()) {
            return new C9102e(alloc, chunkSize);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    public static m21 newDirectInstance(ef1 alloc) {
        return newDirectInstance(alloc, 4096);
    }

    public static m21 newHeapInstance(ef1 alloc) {
        return newHeapInstance(alloc, 4096);
    }

    /* JADX INFO: renamed from: r */
    public static final void m16563r(rsi writer, int fieldNumber, hpi.EnumC6968b fieldType, Object object) throws IOException {
        switch (C9098a.f59689a[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(fieldNumber, ((Boolean) object).booleanValue());
                return;
            case 2:
                writer.writeFixed32(fieldNumber, ((Integer) object).intValue());
                return;
            case 3:
                writer.writeFixed64(fieldNumber, ((Long) object).longValue());
                return;
            case 4:
                writer.writeInt32(fieldNumber, ((Integer) object).intValue());
                return;
            case 5:
                writer.writeInt64(fieldNumber, ((Long) object).longValue());
                return;
            case 6:
                writer.writeSFixed32(fieldNumber, ((Integer) object).intValue());
                return;
            case 7:
                writer.writeSFixed64(fieldNumber, ((Long) object).longValue());
                return;
            case 8:
                writer.writeSInt32(fieldNumber, ((Integer) object).intValue());
                return;
            case 9:
                writer.writeSInt64(fieldNumber, ((Long) object).longValue());
                return;
            case 10:
                writer.writeString(fieldNumber, (String) object);
                return;
            case 11:
                writer.writeUInt32(fieldNumber, ((Integer) object).intValue());
                return;
            case 12:
                writer.writeUInt64(fieldNumber, ((Long) object).longValue());
                return;
            case 13:
                writer.writeFloat(fieldNumber, ((Float) object).floatValue());
                return;
            case 14:
                writer.writeDouble(fieldNumber, ((Double) object).doubleValue());
                return;
            case 15:
                writer.writeMessage(fieldNumber, object);
                return;
            case 16:
                writer.writeBytes(fieldNumber, (vj1) object);
                return;
            case 17:
                if (object instanceof w98.InterfaceC14497d) {
                    writer.writeEnum(fieldNumber, ((w98.InterfaceC14497d) object).getNumber());
                    return;
                } else {
                    if (!(object instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.writeEnum(fieldNumber, ((Integer) object).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private void writeBoolList_Internal(int fieldNumber, List<Boolean> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(fieldNumber, list.get(size).booleanValue());
            }
            return;
        }
        mo16569m(list.size() + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo16570n(list.get(size2).booleanValue());
        }
        mo16577v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeDoubleList_Internal(int fieldNumber, List<Double> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeDouble(fieldNumber, list.get(size).doubleValue());
            }
            return;
        }
        mo16569m((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo16572p(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        mo16577v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeFixed32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        mo16569m((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo16571o(list.get(size2).intValue());
        }
        mo16577v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeFixed64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        mo16569m((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo16572p(list.get(size2).longValue());
        }
        mo16577v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeFloatList_Internal(int fieldNumber, List<Float> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFloat(fieldNumber, list.get(size).floatValue());
            }
            return;
        }
        mo16569m((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo16571o(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        mo16577v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        mo16569m((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo16573q(list.get(size2).intValue());
        }
        mo16577v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeLazyString(int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            writeString(fieldNumber, (String) value);
        } else {
            writeBytes(fieldNumber, (vj1) value);
        }
    }

    private void writeSInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        mo16569m((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo16574s(list.get(size2).intValue());
        }
        mo16577v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeSInt64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        mo16569m((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo16575t(list.get(size2).longValue());
        }
        mo16577v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeUInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        mo16569m((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo16577v(list.get(size2).intValue());
        }
        mo16577v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeUInt64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        mo16569m((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo16578w(list.get(size2).longValue());
        }
        mo16577v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo16564b();

    @pp1
    public final Queue<AbstractC1952bn> complete() {
        mo16564b();
        return this.f59687c;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC1952bn m16565e() {
        return this.f59685a.allocateDirectBuffer(this.f59686b);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1952bn m16566f(int capacity) {
        return this.f59685a.allocateDirectBuffer(Math.max(capacity, this.f59686b));
    }

    @Override // p000.rsi
    public final rsi.EnumC12268a fieldOrder() {
        return rsi.EnumC12268a.DESCENDING;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC1952bn m16567g() {
        return this.f59685a.allocateHeapBuffer(this.f59686b);
    }

    public abstract int getTotalBytesWritten();

    /* JADX INFO: renamed from: h */
    public final AbstractC1952bn m16568h(int capacity) {
        return this.f59685a.allocateHeapBuffer(Math.max(capacity, this.f59686b));
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo16569m(int size);

    /* JADX INFO: renamed from: n */
    public abstract void mo16570n(boolean value);

    /* JADX INFO: renamed from: o */
    public abstract void mo16571o(int value);

    /* JADX INFO: renamed from: p */
    public abstract void mo16572p(long value);

    /* JADX INFO: renamed from: q */
    public abstract void mo16573q(int value);

    /* JADX INFO: renamed from: s */
    public abstract void mo16574s(int value);

    /* JADX INFO: renamed from: t */
    public abstract void mo16575t(long value);

    /* JADX INFO: renamed from: u */
    public abstract void mo16576u(String in);

    /* JADX INFO: renamed from: v */
    public abstract void mo16577v(int value);

    /* JADX INFO: renamed from: w */
    public abstract void mo16578w(long value);

    @Override // p000.rsi
    public final void writeBoolList(int fieldNumber, List<Boolean> list, boolean packed) throws IOException {
        if (list instanceof ra1) {
            writeBoolList_Internal(fieldNumber, (ra1) list, packed);
        } else {
            writeBoolList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.rsi
    public final void writeBytesList(int fieldNumber, List<vj1> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(fieldNumber, list.get(size));
        }
    }

    @Override // p000.rsi
    public final void writeDouble(int fieldNumber, double value) throws IOException {
        writeFixed64(fieldNumber, Double.doubleToRawLongBits(value));
    }

    @Override // p000.rsi
    public final void writeDoubleList(int fieldNumber, List<Double> list, boolean packed) throws IOException {
        if (list instanceof uj4) {
            writeDoubleList_Internal(fieldNumber, (uj4) list, packed);
        } else {
            writeDoubleList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.rsi
    public final void writeEnum(int fieldNumber, int value) throws IOException {
        writeInt32(fieldNumber, value);
    }

    @Override // p000.rsi
    public final void writeEnumList(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        writeInt32List(fieldNumber, list, packed);
    }

    @Override // p000.rsi
    public final void writeFixed32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof b68) {
            writeFixed32List_Internal(fieldNumber, (b68) list, packed);
        } else {
            writeFixed32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.rsi
    public final void writeFixed64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof rk9) {
            writeFixed64List_Internal(fieldNumber, (rk9) list, packed);
        } else {
            writeFixed64List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.rsi
    public final void writeFloat(int fieldNumber, float value) throws IOException {
        writeFixed32(fieldNumber, Float.floatToRawIntBits(value));
    }

    @Override // p000.rsi
    public final void writeFloatList(int fieldNumber, List<Float> list, boolean packed) throws IOException {
        if (list instanceof a46) {
            writeFloatList_Internal(fieldNumber, (a46) list, packed);
        } else {
            writeFloatList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.rsi
    @Deprecated
    public final void writeGroupList(int fieldNumber, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(fieldNumber, list.get(size));
        }
    }

    @Override // p000.rsi
    public final void writeInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof b68) {
            writeInt32List_Internal(fieldNumber, (b68) list, packed);
        } else {
            writeInt32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.rsi
    public final void writeInt64(int fieldNumber, long value) throws IOException {
        writeUInt64(fieldNumber, value);
    }

    @Override // p000.rsi
    public final void writeInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        writeUInt64List(fieldNumber, list, packed);
    }

    @Override // p000.rsi
    public <K, V> void writeMap(int fieldNumber, os9.C10633b<K, V> metadata, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            m16563r(this, 2, metadata.f68569c, entry.getValue());
            m16563r(this, 1, metadata.f68567a, entry.getKey());
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
        }
    }

    @Override // p000.rsi
    public final void writeMessageList(int fieldNumber, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(fieldNumber, list.get(size));
        }
    }

    @Override // p000.rsi
    public final void writeMessageSetItem(int fieldNumber, Object value) throws IOException {
        writeTag(1, 4);
        if (value instanceof vj1) {
            writeBytes(3, (vj1) value);
        } else {
            writeMessage(3, value);
        }
        writeUInt32(2, fieldNumber);
        writeTag(1, 3);
    }

    @Override // p000.rsi
    public final void writeSFixed32(int fieldNumber, int value) throws IOException {
        writeFixed32(fieldNumber, value);
    }

    @Override // p000.rsi
    public final void writeSFixed32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        writeFixed32List(fieldNumber, list, packed);
    }

    @Override // p000.rsi
    public final void writeSFixed64(int fieldNumber, long value) throws IOException {
        writeFixed64(fieldNumber, value);
    }

    @Override // p000.rsi
    public final void writeSFixed64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        writeFixed64List(fieldNumber, list, packed);
    }

    @Override // p000.rsi
    public final void writeSInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof b68) {
            writeSInt32List_Internal(fieldNumber, (b68) list, packed);
        } else {
            writeSInt32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.rsi
    public final void writeSInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof rk9) {
            writeSInt64List_Internal(fieldNumber, (rk9) list, packed);
        } else {
            writeSInt64List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.rsi
    public final void writeStringList(int fieldNumber, List<String> list) throws IOException {
        if (!(list instanceof e39)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(fieldNumber, list.get(size));
            }
            return;
        }
        e39 e39Var = (e39) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeLazyString(fieldNumber, e39Var.getRaw(size2));
        }
    }

    public abstract void writeTag(int fieldNumber, int wireType);

    @Override // p000.rsi
    public final void writeUInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof b68) {
            writeUInt32List_Internal(fieldNumber, (b68) list, packed);
        } else {
            writeUInt32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.rsi
    public final void writeUInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof rk9) {
            writeUInt64List_Internal(fieldNumber, (rk9) list, packed);
        } else {
            writeUInt64List_Internal(fieldNumber, list, packed);
        }
    }

    private m21(ef1 alloc, int chunkSize) {
        this.f59687c = new ArrayDeque<>(4);
        if (chunkSize <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.f59685a = (ef1) w98.m24433b(alloc, "alloc");
        this.f59686b = chunkSize;
    }

    public static m21 newDirectInstance(ef1 alloc, int chunkSize) {
        return m16557c() ? m16561k(alloc, chunkSize) : m16559i(alloc, chunkSize);
    }

    public static m21 newHeapInstance(ef1 alloc, int chunkSize) {
        return m16558d() ? m16562l(alloc, chunkSize) : m16560j(alloc, chunkSize);
    }

    @Override // p000.rsi
    @Deprecated
    public final void writeGroupList(int fieldNumber, List<?> list, tpe schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(fieldNumber, list.get(size), schema);
        }
    }

    @Override // p000.rsi
    public final void writeMessageList(int fieldNumber, List<?> list, tpe schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(fieldNumber, list.get(size), schema);
        }
    }

    private void writeBoolList_Internal(int fieldNumber, ra1 list, boolean packed) throws IOException {
        if (packed) {
            mo16569m(list.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo16570n(list.getBoolean(size));
            }
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(fieldNumber, list.getBoolean(size2));
        }
    }

    private void writeDoubleList_Internal(int fieldNumber, uj4 list, boolean packed) throws IOException {
        if (packed) {
            mo16569m((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo16572p(Double.doubleToRawLongBits(list.getDouble(size)));
            }
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeDouble(fieldNumber, list.getDouble(size2));
        }
    }

    private void writeFixed32List_Internal(int fieldNumber, b68 list, boolean packed) throws IOException {
        if (packed) {
            mo16569m((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo16571o(list.getInt(size));
            }
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeFixed64List_Internal(int fieldNumber, rk9 list, boolean packed) throws IOException {
        if (packed) {
            mo16569m((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo16572p(list.getLong(size));
            }
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(fieldNumber, list.getLong(size2));
        }
    }

    private void writeFloatList_Internal(int fieldNumber, a46 list, boolean packed) throws IOException {
        if (packed) {
            mo16569m((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo16571o(Float.floatToRawIntBits(list.getFloat(size)));
            }
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFloat(fieldNumber, list.getFloat(size2));
        }
    }

    private void writeInt32List_Internal(int fieldNumber, b68 list, boolean packed) throws IOException {
        if (packed) {
            mo16569m((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo16573q(list.getInt(size));
            }
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeSInt32List_Internal(int fieldNumber, b68 list, boolean packed) throws IOException {
        if (packed) {
            mo16569m((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo16574s(list.getInt(size));
            }
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeSInt64List_Internal(int fieldNumber, rk9 list, boolean packed) throws IOException {
        if (packed) {
            mo16569m((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo16575t(list.getLong(size));
            }
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(fieldNumber, list.getLong(size2));
        }
    }

    private void writeUInt32List_Internal(int fieldNumber, b68 list, boolean packed) throws IOException {
        if (packed) {
            mo16569m((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo16577v(list.getInt(size));
            }
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeUInt64List_Internal(int fieldNumber, rk9 list, boolean packed) throws IOException {
        if (packed) {
            mo16569m((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo16578w(list.getLong(size));
            }
            mo16577v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt64(fieldNumber, list.getLong(size2));
        }
    }
}
