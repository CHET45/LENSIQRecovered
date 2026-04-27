package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.opencv.videoio.Videoio;
import p000.gpi;
import p000.lzh;
import p000.ns9;
import p000.qsi;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public abstract class l21 extends nj1 implements qsi {

    /* JADX INFO: renamed from: e */
    public static final int f55951e = 4096;

    /* JADX INFO: renamed from: f */
    public static final int f55952f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f55953g = 2;

    /* JADX INFO: renamed from: a */
    public final df1 f55954a;

    /* JADX INFO: renamed from: b */
    public final int f55955b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<AbstractC2392cn> f55956c;

    /* JADX INFO: renamed from: d */
    public int f55957d;

    /* JADX INFO: renamed from: l21$a */
    public static /* synthetic */ class C8577a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55958a;

        static {
            int[] iArr = new int[gpi.EnumC6460b.values().length];
            f55958a = iArr;
            try {
                iArr[gpi.EnumC6460b.f40750H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40749F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40748C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40766m.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40764e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40759Z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40753M1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40756V1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40760Z1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40751L.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40757X.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40765f.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40763d.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40762c.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40754N.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40755Q.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f55958a[gpi.EnumC6460b.f40758Y.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: renamed from: l21$b */
    public static final class C8578b extends l21 {

        /* JADX INFO: renamed from: h */
        public ByteBuffer f55959h;

        /* JADX INFO: renamed from: i */
        public int f55960i;

        /* JADX INFO: renamed from: j */
        public int f55961j;

        public C8578b(df1 alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.f55960i - this.f55961j;
        }

        private void nextBuffer() {
            nextBuffer(m15261e());
        }

        private int spaceLeft() {
            return this.f55961j + 1;
        }

        private void writeVarint32FiveBytes(int value) {
            ByteBuffer byteBuffer = this.f55959h;
            int i = this.f55961j;
            this.f55961j = i - 1;
            byteBuffer.put(i, (byte) (value >>> 28));
            int i2 = this.f55961j;
            this.f55961j = i2 - 4;
            this.f55959h.putInt(i2 - 3, (value & 127) | 128 | ((((value >>> 21) & 127) | 128) << 24) | ((((value >>> 14) & 127) | 128) << 16) | ((((value >>> 7) & 127) | 128) << 8));
        }

        private void writeVarint32FourBytes(int value) {
            int i = this.f55961j;
            this.f55961j = i - 4;
            this.f55959h.putInt(i - 3, (value & 127) | 128 | ((266338304 & value) << 3) | (((2080768 & value) | 2097152) << 2) | (((value & 16256) | 16384) << 1));
        }

        private void writeVarint32OneByte(int value) {
            ByteBuffer byteBuffer = this.f55959h;
            int i = this.f55961j;
            this.f55961j = i - 1;
            byteBuffer.put(i, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            int i = this.f55961j - 3;
            this.f55961j = i;
            this.f55959h.putInt(i, (((value & 127) | 128) << 8) | ((2080768 & value) << 10) | (((value & 16256) | 16384) << 9));
        }

        private void writeVarint32TwoBytes(int value) {
            int i = this.f55961j;
            this.f55961j = i - 2;
            this.f55959h.putShort(i - 1, (short) ((value & 127) | 128 | ((value & 16256) << 1)));
        }

        private void writeVarint64EightBytes(long value) {
            int i = this.f55961j;
            this.f55961j = i - 8;
            this.f55959h.putLong(i - 7, (value & 127) | 128 | ((71494644084506624L & value) << 7) | (((558551906910208L & value) | 562949953421312L) << 6) | (((4363686772736L & value) | 4398046511104L) << 5) | (((34091302912L & value) | 34359738368L) << 4) | (((266338304 & value) | 268435456) << 3) | (((2080768 & value) | 2097152) << 2) | (((16256 & value) | 16384) << 1));
        }

        private void writeVarint64EightBytesWithSign(long value) {
            int i = this.f55961j;
            this.f55961j = i - 8;
            this.f55959h.putLong(i - 7, (value & 127) | 128 | (((71494644084506624L & value) | 72057594037927936L) << 7) | (((558551906910208L & value) | 562949953421312L) << 6) | (((4363686772736L & value) | 4398046511104L) << 5) | (((34091302912L & value) | 34359738368L) << 4) | (((266338304 & value) | 268435456) << 3) | (((2080768 & value) | 2097152) << 2) | (((16256 & value) | 16384) << 1));
        }

        private void writeVarint64FiveBytes(long value) {
            int i = this.f55961j;
            this.f55961j = i - 5;
            this.f55959h.putLong(i - 7, (((value & 127) | 128) << 24) | ((34091302912L & value) << 28) | (((266338304 & value) | 268435456) << 27) | (((2080768 & value) | 2097152) << 26) | (((16256 & value) | 16384) << 25));
        }

        private void writeVarint64FourBytes(long value) {
            writeVarint32FourBytes((int) value);
        }

        private void writeVarint64NineBytes(long value) {
            ByteBuffer byteBuffer = this.f55959h;
            int i = this.f55961j;
            this.f55961j = i - 1;
            byteBuffer.put(i, (byte) (value >>> 56));
            writeVarint64EightBytesWithSign(value & 72057594037927935L);
        }

        private void writeVarint64OneByte(long value) {
            writeVarint32OneByte((int) value);
        }

        private void writeVarint64SevenBytes(long value) {
            int i = this.f55961j - 7;
            this.f55961j = i;
            this.f55959h.putLong(i, (((value & 127) | 128) << 8) | ((558551906910208L & value) << 14) | (((4363686772736L & value) | 4398046511104L) << 13) | (((34091302912L & value) | 34359738368L) << 12) | (((266338304 & value) | 268435456) << 11) | (((2080768 & value) | 2097152) << 10) | (((16256 & value) | 16384) << 9));
        }

        private void writeVarint64SixBytes(long value) {
            int i = this.f55961j;
            this.f55961j = i - 6;
            this.f55959h.putLong(i - 7, (((value & 127) | 128) << 16) | ((4363686772736L & value) << 21) | (((34091302912L & value) | 34359738368L) << 20) | (((266338304 & value) | 268435456) << 19) | (((2080768 & value) | 2097152) << 18) | (((16256 & value) | 16384) << 17));
        }

        private void writeVarint64TenBytes(long value) {
            ByteBuffer byteBuffer = this.f55959h;
            int i = this.f55961j;
            this.f55961j = i - 1;
            byteBuffer.put(i, (byte) (value >>> 63));
            ByteBuffer byteBuffer2 = this.f55959h;
            int i2 = this.f55961j;
            this.f55961j = i2 - 1;
            byteBuffer2.put(i2, (byte) (((value >>> 56) & 127) | 128));
            writeVarint64EightBytesWithSign(value & 72057594037927935L);
        }

        private void writeVarint64ThreeBytes(long value) {
            writeVarint32ThreeBytes((int) value);
        }

        private void writeVarint64TwoBytes(long value) {
            writeVarint32TwoBytes((int) value);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: b */
        public void mo15260b() {
            if (this.f55959h != null) {
                this.f55957d += bytesWrittenToCurrentBuffer();
                mi8.m17327e(this.f55959h, this.f55961j + 1);
                this.f55959h = null;
                this.f55961j = 0;
                this.f55960i = 0;
            }
        }

        @Override // p000.l21
        public int getTotalBytesWritten() {
            return this.f55957d + bytesWrittenToCurrentBuffer();
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: m */
        public void mo15265m(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: n */
        public void mo15266n(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: o */
        public void mo15267o(int value) {
            int i = this.f55961j;
            this.f55961j = i - 4;
            this.f55959h.putInt(i - 3, value);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: p */
        public void mo15268p(long value) {
            int i = this.f55961j;
            this.f55961j = i - 8;
            this.f55959h.putLong(i - 7, value);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: q */
        public void mo15269q(int value) {
            if (value >= 0) {
                mo15273v(value);
            } else {
                mo15274w(value);
            }
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: s */
        public void mo15270s(int value) {
            mo15273v(i72.encodeZigZag32(value));
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: t */
        public void mo15271t(long value) {
            mo15274w(i72.encodeZigZag64(value));
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: u */
        public void mo15272u(String in) {
            int i;
            int i2;
            int i3;
            char cCharAt;
            mo15265m(in.length());
            int length = in.length() - 1;
            this.f55961j -= length;
            while (length >= 0 && (cCharAt = in.charAt(length)) < 128) {
                this.f55959h.put(this.f55961j + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.f55961j--;
                return;
            }
            this.f55961j += length;
            while (length >= 0) {
                char cCharAt2 = in.charAt(length);
                if (cCharAt2 < 128 && (i3 = this.f55961j) >= 0) {
                    ByteBuffer byteBuffer = this.f55959h;
                    this.f55961j = i3 - 1;
                    byteBuffer.put(i3, (byte) cCharAt2);
                } else if (cCharAt2 < 2048 && (i2 = this.f55961j) > 0) {
                    ByteBuffer byteBuffer2 = this.f55959h;
                    this.f55961j = i2 - 1;
                    byteBuffer2.put(i2, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f55959h;
                    int i4 = this.f55961j;
                    this.f55961j = i4 - 1;
                    byteBuffer3.put(i4, (byte) ((cCharAt2 >>> 6) | 960));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i = this.f55961j) > 1) {
                    ByteBuffer byteBuffer4 = this.f55959h;
                    this.f55961j = i - 1;
                    byteBuffer4.put(i, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f55959h;
                    int i5 = this.f55961j;
                    this.f55961j = i5 - 1;
                    byteBuffer5.put(i5, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f55959h;
                    int i6 = this.f55961j;
                    this.f55961j = i6 - 1;
                    byteBuffer6.put(i6, (byte) ((cCharAt2 >>> '\f') | Videoio.CAP_PROP_XI_CC_MATRIX_01));
                } else {
                    if (this.f55961j > 2) {
                        if (length != 0) {
                            char cCharAt3 = in.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                ByteBuffer byteBuffer7 = this.f55959h;
                                int i7 = this.f55961j;
                                this.f55961j = i7 - 1;
                                byteBuffer7.put(i7, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.f55959h;
                                int i8 = this.f55961j;
                                this.f55961j = i8 - 1;
                                byteBuffer8.put(i8, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.f55959h;
                                int i9 = this.f55961j;
                                this.f55961j = i9 - 1;
                                byteBuffer9.put(i9, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.f55959h;
                                int i10 = this.f55961j;
                                this.f55961j = i10 - 1;
                                byteBuffer10.put(i10, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new lzh.C9060d(length - 1, length);
                    }
                    mo15265m(length);
                    length++;
                }
                length--;
            }
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: v */
        public void mo15273v(int value) {
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

        @Override // p000.l21
        /* JADX INFO: renamed from: w */
        public void mo15274w(long value) {
            switch (l21.computeUInt64SizeNoTag(value)) {
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

        @Override // p000.nj1
        public void write(byte value) {
            ByteBuffer byteBuffer = this.f55959h;
            int i = this.f55961j;
            this.f55961j = i - 1;
            byteBuffer.put(i, value);
        }

        @Override // p000.qsi
        public void writeBool(int i, boolean z) {
            mo15265m(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // p000.qsi
        public void writeBytes(int fieldNumber, wj1 value) {
            try {
                value.mo9870s(this);
                mo15265m(10);
                mo15273v(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p000.qsi
        @Deprecated
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // p000.qsi
        public void writeFixed32(int fieldNumber, int value) {
            mo15265m(9);
            mo15267o(value);
            writeTag(fieldNumber, 5);
        }

        @Override // p000.qsi
        public void writeFixed64(int fieldNumber, long value) {
            mo15265m(13);
            mo15268p(value);
            writeTag(fieldNumber, 1);
        }

        @Override // p000.qsi
        @Deprecated
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            lhd.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.qsi
        public void writeInt32(int fieldNumber, int value) {
            mo15265m(15);
            mo15269q(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.nj1
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.f55957d += length;
                this.f55956c.addFirst(AbstractC2392cn.wrap(value, offset, length));
                nextBuffer();
            } else {
                int i = this.f55961j - length;
                this.f55961j = i;
                mi8.m17327e(this.f55959h, i + 1);
                this.f55959h.put(value, offset, length);
            }
        }

        @Override // p000.qsi
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            lhd.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.qsi
        public void writeSInt32(int fieldNumber, int value) {
            mo15265m(10);
            mo15270s(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        public void writeSInt64(int fieldNumber, long value) {
            mo15265m(15);
            mo15271t(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        @Deprecated
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // p000.qsi
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            mo15272u(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.l21
        public void writeTag(int fieldNumber, int wireType) {
            mo15273v(gpi.m11819a(fieldNumber, wireType));
        }

        @Override // p000.qsi
        public void writeUInt32(int fieldNumber, int value) {
            mo15265m(10);
            mo15273v(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        public void writeUInt64(int fieldNumber, long value) {
            mo15265m(15);
            mo15274w(value);
            writeTag(fieldNumber, 0);
        }

        private void nextBuffer(int capacity) {
            nextBuffer(m15262f(capacity));
        }

        @Override // p000.nj1
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            int i = this.f55961j - length;
            this.f55961j = i;
            mi8.m17327e(this.f55959h, i + 1);
            this.f55959h.put(value, offset, length);
        }

        private void nextBuffer(AbstractC2392cn allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
                if (byteBufferNioBuffer.isDirect()) {
                    mo15260b();
                    this.f55956c.addFirst(allocatedBuffer);
                    this.f55959h = byteBufferNioBuffer;
                    mi8.m17325c(byteBufferNioBuffer, byteBufferNioBuffer.capacity());
                    mi8.m17327e(this.f55959h, 0);
                    this.f55959h.order(ByteOrder.LITTLE_ENDIAN);
                    int iLimit = this.f55959h.limit() - 1;
                    this.f55960i = iLimit;
                    this.f55961j = iLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // p000.qsi
        public void writeGroup(int fieldNumber, Object value, upe schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.nj1
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i = this.f55961j - iRemaining;
            this.f55961j = i;
            mi8.m17327e(this.f55959h, i + 1);
            this.f55959h.put(value);
        }

        @Override // p000.qsi
        public void writeMessage(int fieldNumber, Object value, upe schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.nj1
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.f55957d += iRemaining;
                this.f55956c.addFirst(AbstractC2392cn.wrap(value));
                nextBuffer();
            } else {
                int i = this.f55961j - iRemaining;
                this.f55961j = i;
                mi8.m17327e(this.f55959h, i + 1);
                this.f55959h.put(value);
            }
        }
    }

    /* JADX INFO: renamed from: l21$c */
    public static final class C8579c extends l21 {

        /* JADX INFO: renamed from: h */
        public AbstractC2392cn f55962h;

        /* JADX INFO: renamed from: i */
        public byte[] f55963i;

        /* JADX INFO: renamed from: j */
        public int f55964j;

        /* JADX INFO: renamed from: k */
        public int f55965k;

        /* JADX INFO: renamed from: l */
        public int f55966l;

        /* JADX INFO: renamed from: m */
        public int f55967m;

        /* JADX INFO: renamed from: n */
        public int f55968n;

        public C8579c(df1 alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(m15263g());
        }

        private void writeVarint32FiveBytes(int value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 28);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 21) & 127) | 128);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) (((value >>> 14) & 127) | 128);
            int i5 = i - 4;
            this.f55968n = i5;
            bArr[i4] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 5;
            bArr[i5] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32FourBytes(int value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 21);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 14) & 127) | 128);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 4;
            bArr[i4] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32OneByte(int value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            this.f55968n = i - 1;
            bArr[i] = (byte) value;
        }

        private void writeVarint32ThreeBytes(int value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 14);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 3;
            bArr[i3] = (byte) ((value & 127) | 128);
        }

        private void writeVarint32TwoBytes(int value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 7);
            this.f55968n = i - 2;
            bArr[i2] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64EightBytes(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 49);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 42) & 127) | 128);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) (((value >>> 35) & 127) | 128);
            int i5 = i - 4;
            this.f55968n = i5;
            bArr[i4] = (byte) (((value >>> 28) & 127) | 128);
            int i6 = i - 5;
            this.f55968n = i6;
            bArr[i5] = (byte) (((value >>> 21) & 127) | 128);
            int i7 = i - 6;
            this.f55968n = i7;
            bArr[i6] = (byte) (((value >>> 14) & 127) | 128);
            int i8 = i - 7;
            this.f55968n = i8;
            bArr[i7] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 8;
            bArr[i8] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64FiveBytes(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 28);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 21) & 127) | 128);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) (((value >>> 14) & 127) | 128);
            int i5 = i - 4;
            this.f55968n = i5;
            bArr[i4] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 5;
            bArr[i5] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64FourBytes(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 21);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 14) & 127) | 128);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 4;
            bArr[i4] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64NineBytes(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 56);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 49) & 127) | 128);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) (((value >>> 42) & 127) | 128);
            int i5 = i - 4;
            this.f55968n = i5;
            bArr[i4] = (byte) (((value >>> 35) & 127) | 128);
            int i6 = i - 5;
            this.f55968n = i6;
            bArr[i5] = (byte) (((value >>> 28) & 127) | 128);
            int i7 = i - 6;
            this.f55968n = i7;
            bArr[i6] = (byte) (((value >>> 21) & 127) | 128);
            int i8 = i - 7;
            this.f55968n = i8;
            bArr[i7] = (byte) (((value >>> 14) & 127) | 128);
            int i9 = i - 8;
            this.f55968n = i9;
            bArr[i8] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 9;
            bArr[i9] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64OneByte(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            this.f55968n = i - 1;
            bArr[i] = (byte) value;
        }

        private void writeVarint64SevenBytes(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 42);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 35) & 127) | 128);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) (((value >>> 28) & 127) | 128);
            int i5 = i - 4;
            this.f55968n = i5;
            bArr[i4] = (byte) (((value >>> 21) & 127) | 128);
            int i6 = i - 5;
            this.f55968n = i6;
            bArr[i5] = (byte) (((value >>> 14) & 127) | 128);
            int i7 = i - 6;
            this.f55968n = i7;
            bArr[i6] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 7;
            bArr[i7] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64SixBytes(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 35);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 28) & 127) | 128);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) (((value >>> 21) & 127) | 128);
            int i5 = i - 4;
            this.f55968n = i5;
            bArr[i4] = (byte) (((value >>> 14) & 127) | 128);
            int i6 = i - 5;
            this.f55968n = i6;
            bArr[i5] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 6;
            bArr[i6] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64TenBytes(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 63);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 56) & 127) | 128);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) (((value >>> 49) & 127) | 128);
            int i5 = i - 4;
            this.f55968n = i5;
            bArr[i4] = (byte) (((value >>> 42) & 127) | 128);
            int i6 = i - 5;
            this.f55968n = i6;
            bArr[i5] = (byte) (((value >>> 35) & 127) | 128);
            int i7 = i - 6;
            this.f55968n = i7;
            bArr[i6] = (byte) (((value >>> 28) & 127) | 128);
            int i8 = i - 7;
            this.f55968n = i8;
            bArr[i7] = (byte) (((value >>> 21) & 127) | 128);
            int i9 = i - 8;
            this.f55968n = i9;
            bArr[i8] = (byte) (((value >>> 14) & 127) | 128);
            int i10 = i - 9;
            this.f55968n = i10;
            bArr[i9] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 10;
            bArr[i10] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64ThreeBytes(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (((int) value) >>> 14);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((value >>> 7) & 127) | 128);
            this.f55968n = i - 3;
            bArr[i3] = (byte) ((value & 127) | 128);
        }

        private void writeVarint64TwoBytes(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (value >>> 7);
            this.f55968n = i - 2;
            bArr[i2] = (byte) ((((int) value) & 127) | 128);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: b */
        public void mo15260b() {
            if (this.f55962h != null) {
                this.f55957d += bytesWrittenToCurrentBuffer();
                AbstractC2392cn abstractC2392cn = this.f55962h;
                abstractC2392cn.position((this.f55968n - abstractC2392cn.arrayOffset()) + 1);
                this.f55962h = null;
                this.f55968n = 0;
                this.f55967m = 0;
            }
        }

        public int bytesWrittenToCurrentBuffer() {
            return this.f55967m - this.f55968n;
        }

        @Override // p000.l21
        public int getTotalBytesWritten() {
            return this.f55957d + bytesWrittenToCurrentBuffer();
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: m */
        public void mo15265m(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: n */
        public void mo15266n(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: o */
        public void mo15267o(int value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) ((value >> 24) & 255);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) ((value >> 16) & 255);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) ((value >> 8) & 255);
            this.f55968n = i - 4;
            bArr[i4] = (byte) (value & 255);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: p */
        public void mo15268p(long value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            int i2 = i - 1;
            this.f55968n = i2;
            bArr[i] = (byte) (((int) (value >> 56)) & 255);
            int i3 = i - 2;
            this.f55968n = i3;
            bArr[i2] = (byte) (((int) (value >> 48)) & 255);
            int i4 = i - 3;
            this.f55968n = i4;
            bArr[i3] = (byte) (((int) (value >> 40)) & 255);
            int i5 = i - 4;
            this.f55968n = i5;
            bArr[i4] = (byte) (((int) (value >> 32)) & 255);
            int i6 = i - 5;
            this.f55968n = i6;
            bArr[i5] = (byte) (((int) (value >> 24)) & 255);
            int i7 = i - 6;
            this.f55968n = i7;
            bArr[i6] = (byte) (((int) (value >> 16)) & 255);
            int i8 = i - 7;
            this.f55968n = i8;
            bArr[i7] = (byte) (((int) (value >> 8)) & 255);
            this.f55968n = i - 8;
            bArr[i8] = (byte) (((int) value) & 255);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: q */
        public void mo15269q(int value) {
            if (value >= 0) {
                mo15273v(value);
            } else {
                mo15274w(value);
            }
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: s */
        public void mo15270s(int value) {
            mo15273v(i72.encodeZigZag32(value));
        }

        public int spaceLeft() {
            return this.f55968n - this.f55966l;
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: t */
        public void mo15271t(long value) {
            mo15274w(i72.encodeZigZag64(value));
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: u */
        public void mo15272u(String in) {
            int i;
            int i2;
            int i3;
            char cCharAt;
            mo15265m(in.length());
            int length = in.length() - 1;
            this.f55968n -= length;
            while (length >= 0 && (cCharAt = in.charAt(length)) < 128) {
                this.f55963i[this.f55968n + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.f55968n--;
                return;
            }
            this.f55968n += length;
            while (length >= 0) {
                char cCharAt2 = in.charAt(length);
                if (cCharAt2 < 128 && (i3 = this.f55968n) > this.f55966l) {
                    byte[] bArr = this.f55963i;
                    this.f55968n = i3 - 1;
                    bArr[i3] = (byte) cCharAt2;
                } else if (cCharAt2 < 2048 && (i2 = this.f55968n) > this.f55964j) {
                    byte[] bArr2 = this.f55963i;
                    int i4 = i2 - 1;
                    this.f55968n = i4;
                    bArr2[i2] = (byte) ((cCharAt2 & '?') | 128);
                    this.f55968n = i2 - 2;
                    bArr2[i4] = (byte) ((cCharAt2 >>> 6) | 960);
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i = this.f55968n) > this.f55964j + 1) {
                    byte[] bArr3 = this.f55963i;
                    int i5 = i - 1;
                    this.f55968n = i5;
                    bArr3[i] = (byte) ((cCharAt2 & '?') | 128);
                    int i6 = i - 2;
                    this.f55968n = i6;
                    bArr3[i5] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    this.f55968n = i - 3;
                    bArr3[i6] = (byte) ((cCharAt2 >>> '\f') | Videoio.CAP_PROP_XI_CC_MATRIX_01);
                } else {
                    if (this.f55968n > this.f55964j + 2) {
                        if (length != 0) {
                            char cCharAt3 = in.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                byte[] bArr4 = this.f55963i;
                                int i7 = this.f55968n;
                                int i8 = i7 - 1;
                                this.f55968n = i8;
                                bArr4[i7] = (byte) ((codePoint & 63) | 128);
                                int i9 = i7 - 2;
                                this.f55968n = i9;
                                bArr4[i8] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i10 = i7 - 3;
                                this.f55968n = i10;
                                bArr4[i9] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.f55968n = i7 - 4;
                                bArr4[i10] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new lzh.C9060d(length - 1, length);
                    }
                    mo15265m(length);
                    length++;
                }
                length--;
            }
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: v */
        public void mo15273v(int value) {
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

        @Override // p000.l21
        /* JADX INFO: renamed from: w */
        public void mo15274w(long value) {
            switch (l21.computeUInt64SizeNoTag(value)) {
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

        @Override // p000.nj1
        public void write(byte value) {
            byte[] bArr = this.f55963i;
            int i = this.f55968n;
            this.f55968n = i - 1;
            bArr[i] = value;
        }

        @Override // p000.qsi
        public void writeBool(int i, boolean z) throws IOException {
            mo15265m(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // p000.qsi
        public void writeBytes(int fieldNumber, wj1 value) throws IOException {
            try {
                value.mo9870s(this);
                mo15265m(10);
                mo15273v(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p000.qsi
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // p000.qsi
        public void writeFixed32(int fieldNumber, int value) throws IOException {
            mo15265m(9);
            mo15267o(value);
            writeTag(fieldNumber, 5);
        }

        @Override // p000.qsi
        public void writeFixed64(int fieldNumber, long value) throws IOException {
            mo15265m(13);
            mo15268p(value);
            writeTag(fieldNumber, 1);
        }

        @Override // p000.qsi
        @Deprecated
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            lhd.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.qsi
        public void writeInt32(int fieldNumber, int value) throws IOException {
            mo15265m(15);
            mo15269q(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.nj1
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.f55957d += length;
                this.f55956c.addFirst(AbstractC2392cn.wrap(value, offset, length));
                nextBuffer();
            } else {
                int i = this.f55968n - length;
                this.f55968n = i;
                System.arraycopy(value, offset, this.f55963i, i + 1, length);
            }
        }

        @Override // p000.qsi
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            lhd.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.qsi
        public void writeSInt32(int fieldNumber, int value) throws IOException {
            mo15265m(10);
            mo15270s(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        public void writeSInt64(int fieldNumber, long value) throws IOException {
            mo15265m(15);
            mo15271t(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // p000.qsi
        public void writeString(int fieldNumber, String value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            mo15272u(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.l21
        public void writeTag(int fieldNumber, int wireType) {
            mo15273v(gpi.m11819a(fieldNumber, wireType));
        }

        @Override // p000.qsi
        public void writeUInt32(int fieldNumber, int value) throws IOException {
            mo15265m(10);
            mo15273v(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        public void writeUInt64(int fieldNumber, long value) throws IOException {
            mo15265m(15);
            mo15274w(value);
            writeTag(fieldNumber, 0);
        }

        private void nextBuffer(int capacity) {
            nextBuffer(m15264h(capacity));
        }

        @Override // p000.nj1
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            int i = this.f55968n - length;
            this.f55968n = i;
            System.arraycopy(value, offset, this.f55963i, i + 1, length);
        }

        private void nextBuffer(AbstractC2392cn allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                mo15260b();
                this.f55956c.addFirst(allocatedBuffer);
                this.f55962h = allocatedBuffer;
                this.f55963i = allocatedBuffer.array();
                int iArrayOffset = allocatedBuffer.arrayOffset();
                this.f55965k = allocatedBuffer.limit() + iArrayOffset;
                int iPosition = iArrayOffset + allocatedBuffer.position();
                this.f55964j = iPosition;
                this.f55966l = iPosition - 1;
                int i = this.f55965k - 1;
                this.f55967m = i;
                this.f55968n = i;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // p000.qsi
        public void writeGroup(int fieldNumber, Object value, upe schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.nj1
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i = this.f55968n - iRemaining;
            this.f55968n = i;
            value.get(this.f55963i, i + 1, iRemaining);
        }

        @Override // p000.nj1
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.f55957d += iRemaining;
                this.f55956c.addFirst(AbstractC2392cn.wrap(value));
                nextBuffer();
            }
            int i = this.f55968n - iRemaining;
            this.f55968n = i;
            value.get(this.f55963i, i + 1, iRemaining);
        }

        @Override // p000.qsi
        public void writeMessage(int fieldNumber, Object value, upe schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }
    }

    /* JADX INFO: renamed from: l21$d */
    public static final class C8580d extends l21 {

        /* JADX INFO: renamed from: h */
        public ByteBuffer f55969h;

        /* JADX INFO: renamed from: i */
        public long f55970i;

        /* JADX INFO: renamed from: j */
        public long f55971j;

        /* JADX INFO: renamed from: k */
        public long f55972k;

        public C8580d(df1 alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int bufferPos() {
            return (int) (this.f55972k - this.f55970i);
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.f55971j - this.f55972k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return evh.m10257K();
        }

        private void nextBuffer() {
            nextBuffer(m15261e());
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        private void writeVarint32FiveBytes(int value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 28));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 21) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) (((value >>> 14) & 127) | 128));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) (((value >>> 7) & 127) | 128));
            long j5 = this.f55972k;
            this.f55972k = j5 - 1;
            evh.m10263Q(j5, (byte) ((value & 127) | 128));
        }

        private void writeVarint32FourBytes(int value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 21));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 14) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) (((value >>> 7) & 127) | 128));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint32OneByte(int value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 14));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 7) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint32TwoBytes(int value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 7));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) ((value & 127) | 128));
        }

        private void writeVarint64EightBytes(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 49));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 42) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) (((value >>> 35) & 127) | 128));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) (((value >>> 28) & 127) | 128));
            long j5 = this.f55972k;
            this.f55972k = j5 - 1;
            evh.m10263Q(j5, (byte) (((value >>> 21) & 127) | 128));
            long j6 = this.f55972k;
            this.f55972k = j6 - 1;
            evh.m10263Q(j6, (byte) (((value >>> 14) & 127) | 128));
            long j7 = this.f55972k;
            this.f55972k = j7 - 1;
            evh.m10263Q(j7, (byte) (((value >>> 7) & 127) | 128));
            long j8 = this.f55972k;
            this.f55972k = j8 - 1;
            evh.m10263Q(j8, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FiveBytes(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 28));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 21) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) (((value >>> 14) & 127) | 128));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) (((value >>> 7) & 127) | 128));
            long j5 = this.f55972k;
            this.f55972k = j5 - 1;
            evh.m10263Q(j5, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FourBytes(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 21));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 14) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) (((value >>> 7) & 127) | 128));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint64NineBytes(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 56));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 49) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) (((value >>> 42) & 127) | 128));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) (((value >>> 35) & 127) | 128));
            long j5 = this.f55972k;
            this.f55972k = j5 - 1;
            evh.m10263Q(j5, (byte) (((value >>> 28) & 127) | 128));
            long j6 = this.f55972k;
            this.f55972k = j6 - 1;
            evh.m10263Q(j6, (byte) (((value >>> 21) & 127) | 128));
            long j7 = this.f55972k;
            this.f55972k = j7 - 1;
            evh.m10263Q(j7, (byte) (((value >>> 14) & 127) | 128));
            long j8 = this.f55972k;
            this.f55972k = j8 - 1;
            evh.m10263Q(j8, (byte) (((value >>> 7) & 127) | 128));
            long j9 = this.f55972k;
            this.f55972k = j9 - 1;
            evh.m10263Q(j9, (byte) ((value & 127) | 128));
        }

        private void writeVarint64OneByte(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) value);
        }

        private void writeVarint64SevenBytes(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 42));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 35) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) (((value >>> 28) & 127) | 128));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) (((value >>> 21) & 127) | 128));
            long j5 = this.f55972k;
            this.f55972k = j5 - 1;
            evh.m10263Q(j5, (byte) (((value >>> 14) & 127) | 128));
            long j6 = this.f55972k;
            this.f55972k = j6 - 1;
            evh.m10263Q(j6, (byte) (((value >>> 7) & 127) | 128));
            long j7 = this.f55972k;
            this.f55972k = j7 - 1;
            evh.m10263Q(j7, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SixBytes(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 35));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 28) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) (((value >>> 21) & 127) | 128));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) (((value >>> 14) & 127) | 128));
            long j5 = this.f55972k;
            this.f55972k = j5 - 1;
            evh.m10263Q(j5, (byte) (((value >>> 7) & 127) | 128));
            long j6 = this.f55972k;
            this.f55972k = j6 - 1;
            evh.m10263Q(j6, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TenBytes(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 63));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 56) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) (((value >>> 49) & 127) | 128));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) (((value >>> 42) & 127) | 128));
            long j5 = this.f55972k;
            this.f55972k = j5 - 1;
            evh.m10263Q(j5, (byte) (((value >>> 35) & 127) | 128));
            long j6 = this.f55972k;
            this.f55972k = j6 - 1;
            evh.m10263Q(j6, (byte) (((value >>> 28) & 127) | 128));
            long j7 = this.f55972k;
            this.f55972k = j7 - 1;
            evh.m10263Q(j7, (byte) (((value >>> 21) & 127) | 128));
            long j8 = this.f55972k;
            this.f55972k = j8 - 1;
            evh.m10263Q(j8, (byte) (((value >>> 14) & 127) | 128));
            long j9 = this.f55972k;
            this.f55972k = j9 - 1;
            evh.m10263Q(j9, (byte) (((value >>> 7) & 127) | 128));
            long j10 = this.f55972k;
            this.f55972k = j10 - 1;
            evh.m10263Q(j10, (byte) ((value & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (((int) value) >>> 14));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((value >>> 7) & 127) | 128));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TwoBytes(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (value >>> 7));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) ((((int) value) & 127) | 128));
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: b */
        public void mo15260b() {
            if (this.f55969h != null) {
                this.f55957d += bytesWrittenToCurrentBuffer();
                mi8.m17327e(this.f55969h, bufferPos() + 1);
                this.f55969h = null;
                this.f55972k = 0L;
                this.f55971j = 0L;
            }
        }

        @Override // p000.l21
        public int getTotalBytesWritten() {
            return this.f55957d + bytesWrittenToCurrentBuffer();
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: m */
        public void mo15265m(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: n */
        public void mo15266n(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: o */
        public void mo15267o(int value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) ((value >> 24) & 255));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) ((value >> 16) & 255));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) ((value >> 8) & 255));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) (value & 255));
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: p */
        public void mo15268p(long value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, (byte) (((int) (value >> 56)) & 255));
            long j2 = this.f55972k;
            this.f55972k = j2 - 1;
            evh.m10263Q(j2, (byte) (((int) (value >> 48)) & 255));
            long j3 = this.f55972k;
            this.f55972k = j3 - 1;
            evh.m10263Q(j3, (byte) (((int) (value >> 40)) & 255));
            long j4 = this.f55972k;
            this.f55972k = j4 - 1;
            evh.m10263Q(j4, (byte) (((int) (value >> 32)) & 255));
            long j5 = this.f55972k;
            this.f55972k = j5 - 1;
            evh.m10263Q(j5, (byte) (((int) (value >> 24)) & 255));
            long j6 = this.f55972k;
            this.f55972k = j6 - 1;
            evh.m10263Q(j6, (byte) (((int) (value >> 16)) & 255));
            long j7 = this.f55972k;
            this.f55972k = j7 - 1;
            evh.m10263Q(j7, (byte) (((int) (value >> 8)) & 255));
            long j8 = this.f55972k;
            this.f55972k = j8 - 1;
            evh.m10263Q(j8, (byte) (((int) value) & 255));
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: q */
        public void mo15269q(int value) {
            if (value >= 0) {
                mo15273v(value);
            } else {
                mo15274w(value);
            }
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: s */
        public void mo15270s(int value) {
            mo15273v(i72.encodeZigZag32(value));
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: t */
        public void mo15271t(long value) {
            mo15274w(i72.encodeZigZag64(value));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
        @Override // p000.l21
        /* JADX INFO: renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo15272u(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.l21.C8580d.mo15272u(java.lang.String):void");
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: v */
        public void mo15273v(int value) {
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

        @Override // p000.l21
        /* JADX INFO: renamed from: w */
        public void mo15274w(long value) {
            switch (l21.computeUInt64SizeNoTag(value)) {
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

        @Override // p000.nj1
        public void write(byte value) {
            long j = this.f55972k;
            this.f55972k = j - 1;
            evh.m10263Q(j, value);
        }

        @Override // p000.qsi
        public void writeBool(int i, boolean z) {
            mo15265m(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // p000.qsi
        public void writeBytes(int fieldNumber, wj1 value) {
            try {
                value.mo9870s(this);
                mo15265m(10);
                mo15273v(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p000.qsi
        @Deprecated
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // p000.qsi
        public void writeFixed32(int fieldNumber, int value) {
            mo15265m(9);
            mo15267o(value);
            writeTag(fieldNumber, 5);
        }

        @Override // p000.qsi
        public void writeFixed64(int fieldNumber, long value) {
            mo15265m(13);
            mo15268p(value);
            writeTag(fieldNumber, 1);
        }

        @Override // p000.qsi
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            lhd.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.qsi
        public void writeInt32(int fieldNumber, int value) {
            mo15265m(15);
            mo15269q(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.nj1
        public void writeLazy(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                this.f55957d += length;
                this.f55956c.addFirst(AbstractC2392cn.wrap(value, offset, length));
                nextBuffer();
            } else {
                this.f55972k -= (long) length;
                mi8.m17327e(this.f55969h, bufferPos() + 1);
                this.f55969h.put(value, offset, length);
            }
        }

        @Override // p000.qsi
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            lhd.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.qsi
        public void writeSInt32(int fieldNumber, int value) {
            mo15265m(10);
            mo15270s(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        public void writeSInt64(int fieldNumber, long value) {
            mo15265m(15);
            mo15271t(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        @Deprecated
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // p000.qsi
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            mo15272u(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.l21
        public void writeTag(int fieldNumber, int wireType) {
            mo15273v(gpi.m11819a(fieldNumber, wireType));
        }

        @Override // p000.qsi
        public void writeUInt32(int fieldNumber, int value) {
            mo15265m(10);
            mo15273v(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        public void writeUInt64(int fieldNumber, long value) {
            mo15265m(15);
            mo15274w(value);
            writeTag(fieldNumber, 0);
        }

        private void nextBuffer(int capacity) {
            nextBuffer(m15262f(capacity));
        }

        @Override // p000.nj1
        public void write(byte[] value, int offset, int length) {
            if (spaceLeft() < length) {
                nextBuffer(length);
            }
            this.f55972k -= (long) length;
            mi8.m17327e(this.f55969h, bufferPos() + 1);
            this.f55969h.put(value, offset, length);
        }

        private void nextBuffer(AbstractC2392cn allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
                if (byteBufferNioBuffer.isDirect()) {
                    mo15260b();
                    this.f55956c.addFirst(allocatedBuffer);
                    this.f55969h = byteBufferNioBuffer;
                    mi8.m17325c(byteBufferNioBuffer, byteBufferNioBuffer.capacity());
                    mi8.m17327e(this.f55969h, 0);
                    long jM10288k = evh.m10288k(this.f55969h);
                    this.f55970i = jM10288k;
                    long jLimit = jM10288k + ((long) (this.f55969h.limit() - 1));
                    this.f55971j = jLimit;
                    this.f55972k = jLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // p000.qsi
        public void writeGroup(int fieldNumber, Object value, upe schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.nj1
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            this.f55972k -= (long) iRemaining;
            mi8.m17327e(this.f55969h, bufferPos() + 1);
            this.f55969h.put(value);
        }

        @Override // p000.qsi
        public void writeMessage(int fieldNumber, Object value, upe schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.nj1
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.f55957d += iRemaining;
                this.f55956c.addFirst(AbstractC2392cn.wrap(value));
                nextBuffer();
            } else {
                this.f55972k -= (long) iRemaining;
                mi8.m17327e(this.f55969h, bufferPos() + 1);
                this.f55969h.put(value);
            }
        }
    }

    /* JADX INFO: renamed from: l21$e */
    public static final class C8581e extends l21 {

        /* JADX INFO: renamed from: h */
        public AbstractC2392cn f55973h;

        /* JADX INFO: renamed from: i */
        public byte[] f55974i;

        /* JADX INFO: renamed from: j */
        public long f55975j;

        /* JADX INFO: renamed from: k */
        public long f55976k;

        /* JADX INFO: renamed from: l */
        public long f55977l;

        /* JADX INFO: renamed from: m */
        public long f55978m;

        /* JADX INFO: renamed from: n */
        public long f55979n;

        public C8581e(df1 alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            nextBuffer();
        }

        private int arrayPos() {
            return (int) this.f55979n;
        }

        public static boolean isSupported() {
            return evh.m10256J();
        }

        private void nextBuffer() {
            nextBuffer(m15263g());
        }

        private void writeVarint32FiveBytes(int value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 28));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr5 = this.f55974i;
            long j5 = this.f55979n;
            this.f55979n = j5 - 1;
            evh.m10265S(bArr5, j5, (byte) ((value & 127) | 128));
        }

        private void writeVarint32FourBytes(int value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 21));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint32OneByte(int value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) value);
        }

        private void writeVarint32ThreeBytes(int value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 14));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint32TwoBytes(int value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 7));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) ((value & 127) | 128));
        }

        private void writeVarint64EightBytes(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 49));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr5 = this.f55974i;
            long j5 = this.f55979n;
            this.f55979n = j5 - 1;
            evh.m10265S(bArr5, j5, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr6 = this.f55974i;
            long j6 = this.f55979n;
            this.f55979n = j6 - 1;
            evh.m10265S(bArr6, j6, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr7 = this.f55974i;
            long j7 = this.f55979n;
            this.f55979n = j7 - 1;
            evh.m10265S(bArr7, j7, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr8 = this.f55974i;
            long j8 = this.f55979n;
            this.f55979n = j8 - 1;
            evh.m10265S(bArr8, j8, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FiveBytes(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 28));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr5 = this.f55974i;
            long j5 = this.f55979n;
            this.f55979n = j5 - 1;
            evh.m10265S(bArr5, j5, (byte) ((value & 127) | 128));
        }

        private void writeVarint64FourBytes(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 21));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) ((value & 127) | 128));
        }

        private void writeVarint64NineBytes(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 56));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr5 = this.f55974i;
            long j5 = this.f55979n;
            this.f55979n = j5 - 1;
            evh.m10265S(bArr5, j5, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr6 = this.f55974i;
            long j6 = this.f55979n;
            this.f55979n = j6 - 1;
            evh.m10265S(bArr6, j6, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr7 = this.f55974i;
            long j7 = this.f55979n;
            this.f55979n = j7 - 1;
            evh.m10265S(bArr7, j7, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr8 = this.f55974i;
            long j8 = this.f55979n;
            this.f55979n = j8 - 1;
            evh.m10265S(bArr8, j8, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr9 = this.f55974i;
            long j9 = this.f55979n;
            this.f55979n = j9 - 1;
            evh.m10265S(bArr9, j9, (byte) ((value & 127) | 128));
        }

        private void writeVarint64OneByte(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) value);
        }

        private void writeVarint64SevenBytes(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 42));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr5 = this.f55974i;
            long j5 = this.f55979n;
            this.f55979n = j5 - 1;
            evh.m10265S(bArr5, j5, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr6 = this.f55974i;
            long j6 = this.f55979n;
            this.f55979n = j6 - 1;
            evh.m10265S(bArr6, j6, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr7 = this.f55974i;
            long j7 = this.f55979n;
            this.f55979n = j7 - 1;
            evh.m10265S(bArr7, j7, (byte) ((value & 127) | 128));
        }

        private void writeVarint64SixBytes(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 35));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr5 = this.f55974i;
            long j5 = this.f55979n;
            this.f55979n = j5 - 1;
            evh.m10265S(bArr5, j5, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr6 = this.f55974i;
            long j6 = this.f55979n;
            this.f55979n = j6 - 1;
            evh.m10265S(bArr6, j6, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TenBytes(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 63));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 56) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr5 = this.f55974i;
            long j5 = this.f55979n;
            this.f55979n = j5 - 1;
            evh.m10265S(bArr5, j5, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr6 = this.f55974i;
            long j6 = this.f55979n;
            this.f55979n = j6 - 1;
            evh.m10265S(bArr6, j6, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr7 = this.f55974i;
            long j7 = this.f55979n;
            this.f55979n = j7 - 1;
            evh.m10265S(bArr7, j7, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr8 = this.f55974i;
            long j8 = this.f55979n;
            this.f55979n = j8 - 1;
            evh.m10265S(bArr8, j8, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr9 = this.f55974i;
            long j9 = this.f55979n;
            this.f55979n = j9 - 1;
            evh.m10265S(bArr9, j9, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr10 = this.f55974i;
            long j10 = this.f55979n;
            this.f55979n = j10 - 1;
            evh.m10265S(bArr10, j10, (byte) ((value & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (((int) value) >>> 14));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) ((value & 127) | 128));
        }

        private void writeVarint64TwoBytes(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (value >>> 7));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) ((((int) value) & 127) | 128));
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: b */
        public void mo15260b() {
            if (this.f55973h != null) {
                this.f55957d += bytesWrittenToCurrentBuffer();
                this.f55973h.position((arrayPos() - this.f55973h.arrayOffset()) + 1);
                this.f55973h = null;
                this.f55979n = 0L;
                this.f55978m = 0L;
            }
        }

        public int bytesWrittenToCurrentBuffer() {
            return (int) (this.f55978m - this.f55979n);
        }

        @Override // p000.l21
        public int getTotalBytesWritten() {
            return this.f55957d + bytesWrittenToCurrentBuffer();
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: m */
        public void mo15265m(int size) {
            if (spaceLeft() < size) {
                nextBuffer(size);
            }
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: n */
        public void mo15266n(boolean z) {
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: o */
        public void mo15267o(int value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) ((value >> 24) & 255));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) ((value >> 16) & 255));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) ((value >> 8) & 255));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) (value & 255));
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: p */
        public void mo15268p(long value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, (byte) (((int) (value >> 56)) & 255));
            byte[] bArr2 = this.f55974i;
            long j2 = this.f55979n;
            this.f55979n = j2 - 1;
            evh.m10265S(bArr2, j2, (byte) (((int) (value >> 48)) & 255));
            byte[] bArr3 = this.f55974i;
            long j3 = this.f55979n;
            this.f55979n = j3 - 1;
            evh.m10265S(bArr3, j3, (byte) (((int) (value >> 40)) & 255));
            byte[] bArr4 = this.f55974i;
            long j4 = this.f55979n;
            this.f55979n = j4 - 1;
            evh.m10265S(bArr4, j4, (byte) (((int) (value >> 32)) & 255));
            byte[] bArr5 = this.f55974i;
            long j5 = this.f55979n;
            this.f55979n = j5 - 1;
            evh.m10265S(bArr5, j5, (byte) (((int) (value >> 24)) & 255));
            byte[] bArr6 = this.f55974i;
            long j6 = this.f55979n;
            this.f55979n = j6 - 1;
            evh.m10265S(bArr6, j6, (byte) (((int) (value >> 16)) & 255));
            byte[] bArr7 = this.f55974i;
            long j7 = this.f55979n;
            this.f55979n = j7 - 1;
            evh.m10265S(bArr7, j7, (byte) (((int) (value >> 8)) & 255));
            byte[] bArr8 = this.f55974i;
            long j8 = this.f55979n;
            this.f55979n = j8 - 1;
            evh.m10265S(bArr8, j8, (byte) (((int) value) & 255));
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: q */
        public void mo15269q(int value) {
            if (value >= 0) {
                mo15273v(value);
            } else {
                mo15274w(value);
            }
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: s */
        public void mo15270s(int value) {
            mo15273v(i72.encodeZigZag32(value));
        }

        public int spaceLeft() {
            return (int) (this.f55979n - this.f55977l);
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: t */
        public void mo15271t(long value) {
            mo15274w(i72.encodeZigZag64(value));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
        @Override // p000.l21
        /* JADX INFO: renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo15272u(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.l21.C8581e.mo15272u(java.lang.String):void");
        }

        @Override // p000.l21
        /* JADX INFO: renamed from: v */
        public void mo15273v(int value) {
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

        @Override // p000.l21
        /* JADX INFO: renamed from: w */
        public void mo15274w(long value) {
            switch (l21.computeUInt64SizeNoTag(value)) {
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

        @Override // p000.nj1
        public void write(byte value) {
            byte[] bArr = this.f55974i;
            long j = this.f55979n;
            this.f55979n = j - 1;
            evh.m10265S(bArr, j, value);
        }

        @Override // p000.qsi
        public void writeBool(int i, boolean z) {
            mo15265m(6);
            write(z ? (byte) 1 : (byte) 0);
            writeTag(i, 0);
        }

        @Override // p000.qsi
        public void writeBytes(int fieldNumber, wj1 value) {
            try {
                value.mo9870s(this);
                mo15265m(10);
                mo15273v(value.size());
                writeTag(fieldNumber, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // p000.qsi
        public void writeEndGroup(int fieldNumber) {
            writeTag(fieldNumber, 4);
        }

        @Override // p000.qsi
        public void writeFixed32(int fieldNumber, int value) {
            mo15265m(9);
            mo15267o(value);
            writeTag(fieldNumber, 5);
        }

        @Override // p000.qsi
        public void writeFixed64(int fieldNumber, long value) {
            mo15265m(13);
            mo15268p(value);
            writeTag(fieldNumber, 1);
        }

        @Override // p000.qsi
        public void writeGroup(int fieldNumber, Object value) throws IOException {
            writeTag(fieldNumber, 4);
            lhd.getInstance().writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.qsi
        public void writeInt32(int fieldNumber, int value) {
            mo15265m(15);
            mo15269q(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.nj1
        public void writeLazy(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(value.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            if (spaceLeft() >= length) {
                this.f55979n -= (long) length;
                System.arraycopy(value, offset, this.f55974i, arrayPos() + 1, length);
            } else {
                this.f55957d += length;
                this.f55956c.addFirst(AbstractC2392cn.wrap(value, offset, length));
                nextBuffer();
            }
        }

        @Override // p000.qsi
        public void writeMessage(int fieldNumber, Object value) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            lhd.getInstance().writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.qsi
        public void writeSInt32(int fieldNumber, int value) {
            mo15265m(10);
            mo15270s(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        public void writeSInt64(int fieldNumber, long value) {
            mo15265m(15);
            mo15271t(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        public void writeStartGroup(int fieldNumber) {
            writeTag(fieldNumber, 3);
        }

        @Override // p000.qsi
        public void writeString(int fieldNumber, String value) {
            int totalBytesWritten = getTotalBytesWritten();
            mo15272u(value);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.l21
        public void writeTag(int fieldNumber, int wireType) {
            mo15273v(gpi.m11819a(fieldNumber, wireType));
        }

        @Override // p000.qsi
        public void writeUInt32(int fieldNumber, int value) {
            mo15265m(10);
            mo15273v(value);
            writeTag(fieldNumber, 0);
        }

        @Override // p000.qsi
        public void writeUInt64(int fieldNumber, long value) {
            mo15265m(15);
            mo15274w(value);
            writeTag(fieldNumber, 0);
        }

        private void nextBuffer(int capacity) {
            nextBuffer(m15264h(capacity));
        }

        @Override // p000.nj1
        public void write(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(value.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            mo15265m(length);
            this.f55979n -= (long) length;
            System.arraycopy(value, offset, this.f55974i, arrayPos() + 1, length);
        }

        private void nextBuffer(AbstractC2392cn allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                mo15260b();
                this.f55956c.addFirst(allocatedBuffer);
                this.f55973h = allocatedBuffer;
                this.f55974i = allocatedBuffer.array();
                long jArrayOffset = allocatedBuffer.arrayOffset();
                this.f55976k = ((long) allocatedBuffer.limit()) + jArrayOffset;
                long jPosition = jArrayOffset + ((long) allocatedBuffer.position());
                this.f55975j = jPosition;
                this.f55977l = jPosition - 1;
                long j = this.f55976k - 1;
                this.f55978m = j;
                this.f55979n = j;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // p000.qsi
        public void writeGroup(int fieldNumber, Object value, upe schema) throws IOException {
            writeTag(fieldNumber, 4);
            schema.writeTo(value, this);
            writeTag(fieldNumber, 3);
        }

        @Override // p000.qsi
        public void writeMessage(int fieldNumber, Object value, upe schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(value, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            mo15265m(10);
            mo15273v(totalBytesWritten2);
            writeTag(fieldNumber, 2);
        }

        @Override // p000.nj1
        public void write(ByteBuffer value) {
            int iRemaining = value.remaining();
            mo15265m(iRemaining);
            this.f55979n -= (long) iRemaining;
            value.get(this.f55974i, arrayPos() + 1, iRemaining);
        }

        @Override // p000.nj1
        public void writeLazy(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (spaceLeft() < iRemaining) {
                this.f55957d += iRemaining;
                this.f55956c.addFirst(AbstractC2392cn.wrap(value));
                nextBuffer();
            }
            this.f55979n -= (long) iRemaining;
            value.get(this.f55974i, arrayPos() + 1, iRemaining);
        }
    }

    public /* synthetic */ l21(df1 df1Var, int i, C8577a c8577a) {
        this(df1Var, i);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15253c() {
        return C8580d.isSupported();
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
    public static boolean m15254d() {
        return C8581e.isSupported();
    }

    /* JADX INFO: renamed from: i */
    public static l21 m15255i(df1 alloc, int chunkSize) {
        return new C8578b(alloc, chunkSize);
    }

    /* JADX INFO: renamed from: j */
    public static l21 m15256j(df1 alloc, int chunkSize) {
        return new C8579c(alloc, chunkSize);
    }

    /* JADX INFO: renamed from: k */
    public static l21 m15257k(df1 alloc, int chunkSize) {
        if (m15253c()) {
            return new C8580d(alloc, chunkSize);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    /* JADX INFO: renamed from: l */
    public static l21 m15258l(df1 alloc, int chunkSize) {
        if (m15254d()) {
            return new C8581e(alloc, chunkSize);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    public static l21 newDirectInstance(df1 alloc) {
        return newDirectInstance(alloc, 4096);
    }

    public static l21 newHeapInstance(df1 alloc) {
        return newHeapInstance(alloc, 4096);
    }

    /* JADX INFO: renamed from: r */
    public static final void m15259r(qsi writer, int fieldNumber, gpi.EnumC6460b fieldType, Object object) throws IOException {
        switch (C8577a.f55958a[fieldType.ordinal()]) {
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
                writer.writeBytes(fieldNumber, (wj1) object);
                return;
            case 17:
                if (object instanceof v98.InterfaceC13947c) {
                    writer.writeEnum(fieldNumber, ((v98.InterfaceC13947c) object).getNumber());
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
        mo15265m(list.size() + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo15266n(list.get(size2).booleanValue());
        }
        mo15273v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeDoubleList_Internal(int fieldNumber, List<Double> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeDouble(fieldNumber, list.get(size).doubleValue());
            }
            return;
        }
        mo15265m((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo15268p(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        mo15273v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeFixed32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        mo15265m((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo15267o(list.get(size2).intValue());
        }
        mo15273v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeFixed64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        mo15265m((list.size() * 8) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo15268p(list.get(size2).longValue());
        }
        mo15273v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeFloatList_Internal(int fieldNumber, List<Float> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFloat(fieldNumber, list.get(size).floatValue());
            }
            return;
        }
        mo15265m((list.size() * 4) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo15267o(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        mo15273v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        mo15265m((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo15269q(list.get(size2).intValue());
        }
        mo15273v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeLazyString(int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            writeString(fieldNumber, (String) value);
        } else {
            writeBytes(fieldNumber, (wj1) value);
        }
    }

    private void writeSInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        mo15265m((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo15270s(list.get(size2).intValue());
        }
        mo15273v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeSInt64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        mo15265m((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo15271t(list.get(size2).longValue());
        }
        mo15273v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeUInt32List_Internal(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt32(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        mo15265m((list.size() * 5) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo15273v(list.get(size2).intValue());
        }
        mo15273v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    private void writeUInt64List_Internal(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt64(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        mo15265m((list.size() * 10) + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            mo15274w(list.get(size2).longValue());
        }
        mo15273v(getTotalBytesWritten() - totalBytesWritten);
        writeTag(fieldNumber, 2);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo15260b();

    @qp1
    public final Queue<AbstractC2392cn> complete() {
        mo15260b();
        return this.f55956c;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2392cn m15261e() {
        return this.f55954a.allocateDirectBuffer(this.f55955b);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC2392cn m15262f(int capacity) {
        return this.f55954a.allocateDirectBuffer(Math.max(capacity, this.f55955b));
    }

    @Override // p000.qsi
    public final qsi.EnumC11672a fieldOrder() {
        return qsi.EnumC11672a.DESCENDING;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC2392cn m15263g() {
        return this.f55954a.allocateHeapBuffer(this.f55955b);
    }

    public abstract int getTotalBytesWritten();

    /* JADX INFO: renamed from: h */
    public final AbstractC2392cn m15264h(int capacity) {
        return this.f55954a.allocateHeapBuffer(Math.max(capacity, this.f55955b));
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo15265m(int size);

    /* JADX INFO: renamed from: n */
    public abstract void mo15266n(boolean value);

    /* JADX INFO: renamed from: o */
    public abstract void mo15267o(int value);

    /* JADX INFO: renamed from: p */
    public abstract void mo15268p(long value);

    /* JADX INFO: renamed from: q */
    public abstract void mo15269q(int value);

    /* JADX INFO: renamed from: s */
    public abstract void mo15270s(int value);

    /* JADX INFO: renamed from: t */
    public abstract void mo15271t(long value);

    /* JADX INFO: renamed from: u */
    public abstract void mo15272u(String in);

    /* JADX INFO: renamed from: v */
    public abstract void mo15273v(int value);

    /* JADX INFO: renamed from: w */
    public abstract void mo15274w(long value);

    @Override // p000.qsi
    public final void writeBoolList(int fieldNumber, List<Boolean> list, boolean packed) throws IOException {
        if (list instanceof sa1) {
            writeBoolList_Internal(fieldNumber, (sa1) list, packed);
        } else {
            writeBoolList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.qsi
    public final void writeBytesList(int fieldNumber, List<wj1> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(fieldNumber, list.get(size));
        }
    }

    @Override // p000.qsi
    public final void writeDouble(int fieldNumber, double value) throws IOException {
        writeFixed64(fieldNumber, Double.doubleToRawLongBits(value));
    }

    @Override // p000.qsi
    public final void writeDoubleList(int fieldNumber, List<Double> list, boolean packed) throws IOException {
        if (list instanceof vj4) {
            writeDoubleList_Internal(fieldNumber, (vj4) list, packed);
        } else {
            writeDoubleList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.qsi
    public final void writeEnum(int fieldNumber, int value) throws IOException {
        writeInt32(fieldNumber, value);
    }

    @Override // p000.qsi
    public final void writeEnumList(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        writeInt32List(fieldNumber, list, packed);
    }

    @Override // p000.qsi
    public final void writeFixed32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof c68) {
            writeFixed32List_Internal(fieldNumber, (c68) list, packed);
        } else {
            writeFixed32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.qsi
    public final void writeFixed64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof sk9) {
            writeFixed64List_Internal(fieldNumber, (sk9) list, packed);
        } else {
            writeFixed64List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.qsi
    public final void writeFloat(int fieldNumber, float value) throws IOException {
        writeFixed32(fieldNumber, Float.floatToRawIntBits(value));
    }

    @Override // p000.qsi
    public final void writeFloatList(int fieldNumber, List<Float> list, boolean packed) throws IOException {
        if (list instanceof b46) {
            writeFloatList_Internal(fieldNumber, (b46) list, packed);
        } else {
            writeFloatList_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.qsi
    @Deprecated
    public final void writeGroupList(int fieldNumber, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(fieldNumber, list.get(size));
        }
    }

    @Override // p000.qsi
    public final void writeInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof c68) {
            writeInt32List_Internal(fieldNumber, (c68) list, packed);
        } else {
            writeInt32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.qsi
    public final void writeInt64(int fieldNumber, long value) throws IOException {
        writeUInt64(fieldNumber, value);
    }

    @Override // p000.qsi
    public final void writeInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        writeUInt64List(fieldNumber, list, packed);
    }

    @Override // p000.qsi
    public <K, V> void writeMap(int fieldNumber, ns9.C10042b<K, V> metadata, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            m15259r(this, 2, metadata.f65508c, entry.getValue());
            m15259r(this, 1, metadata.f65506a, entry.getKey());
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
        }
    }

    @Override // p000.qsi
    public final void writeMessageList(int fieldNumber, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(fieldNumber, list.get(size));
        }
    }

    @Override // p000.qsi
    public final void writeMessageSetItem(int fieldNumber, Object value) throws IOException {
        writeTag(1, 4);
        if (value instanceof wj1) {
            writeBytes(3, (wj1) value);
        } else {
            writeMessage(3, value);
        }
        writeUInt32(2, fieldNumber);
        writeTag(1, 3);
    }

    @Override // p000.qsi
    public final void writeSFixed32(int fieldNumber, int value) throws IOException {
        writeFixed32(fieldNumber, value);
    }

    @Override // p000.qsi
    public final void writeSFixed32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        writeFixed32List(fieldNumber, list, packed);
    }

    @Override // p000.qsi
    public final void writeSFixed64(int fieldNumber, long value) throws IOException {
        writeFixed64(fieldNumber, value);
    }

    @Override // p000.qsi
    public final void writeSFixed64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        writeFixed64List(fieldNumber, list, packed);
    }

    @Override // p000.qsi
    public final void writeSInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof c68) {
            writeSInt32List_Internal(fieldNumber, (c68) list, packed);
        } else {
            writeSInt32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.qsi
    public final void writeSInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof sk9) {
            writeSInt64List_Internal(fieldNumber, (sk9) list, packed);
        } else {
            writeSInt64List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.qsi
    public final void writeStringList(int fieldNumber, List<String> list) throws IOException {
        if (!(list instanceof f39)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(fieldNumber, list.get(size));
            }
            return;
        }
        f39 f39Var = (f39) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeLazyString(fieldNumber, f39Var.getRaw(size2));
        }
    }

    public abstract void writeTag(int fieldNumber, int wireType);

    @Override // p000.qsi
    public final void writeUInt32List(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof c68) {
            writeUInt32List_Internal(fieldNumber, (c68) list, packed);
        } else {
            writeUInt32List_Internal(fieldNumber, list, packed);
        }
    }

    @Override // p000.qsi
    public final void writeUInt64List(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof sk9) {
            writeUInt64List_Internal(fieldNumber, (sk9) list, packed);
        } else {
            writeUInt64List_Internal(fieldNumber, list, packed);
        }
    }

    private l21(df1 alloc, int chunkSize) {
        this.f55956c = new ArrayDeque<>(4);
        if (chunkSize <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.f55954a = (df1) v98.m23882b(alloc, "alloc");
        this.f55955b = chunkSize;
    }

    public static l21 newDirectInstance(df1 alloc, int chunkSize) {
        return m15253c() ? m15257k(alloc, chunkSize) : m15255i(alloc, chunkSize);
    }

    public static l21 newHeapInstance(df1 alloc, int chunkSize) {
        return m15254d() ? m15258l(alloc, chunkSize) : m15256j(alloc, chunkSize);
    }

    @Override // p000.qsi
    @Deprecated
    public final void writeGroupList(int fieldNumber, List<?> list, upe schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(fieldNumber, list.get(size), schema);
        }
    }

    @Override // p000.qsi
    public final void writeMessageList(int fieldNumber, List<?> list, upe schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(fieldNumber, list.get(size), schema);
        }
    }

    private void writeBoolList_Internal(int fieldNumber, sa1 list, boolean packed) throws IOException {
        if (packed) {
            mo15265m(list.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo15266n(list.getBoolean(size));
            }
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(fieldNumber, list.getBoolean(size2));
        }
    }

    private void writeDoubleList_Internal(int fieldNumber, vj4 list, boolean packed) throws IOException {
        if (packed) {
            mo15265m((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo15268p(Double.doubleToRawLongBits(list.getDouble(size)));
            }
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeDouble(fieldNumber, list.getDouble(size2));
        }
    }

    private void writeFixed32List_Internal(int fieldNumber, c68 list, boolean packed) throws IOException {
        if (packed) {
            mo15265m((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo15267o(list.getInt(size));
            }
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeFixed64List_Internal(int fieldNumber, sk9 list, boolean packed) throws IOException {
        if (packed) {
            mo15265m((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo15268p(list.getLong(size));
            }
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(fieldNumber, list.getLong(size2));
        }
    }

    private void writeFloatList_Internal(int fieldNumber, b46 list, boolean packed) throws IOException {
        if (packed) {
            mo15265m((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo15267o(Float.floatToRawIntBits(list.getFloat(size)));
            }
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFloat(fieldNumber, list.getFloat(size2));
        }
    }

    private void writeInt32List_Internal(int fieldNumber, c68 list, boolean packed) throws IOException {
        if (packed) {
            mo15265m((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo15269q(list.getInt(size));
            }
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeSInt32List_Internal(int fieldNumber, c68 list, boolean packed) throws IOException {
        if (packed) {
            mo15265m((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo15270s(list.getInt(size));
            }
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeSInt64List_Internal(int fieldNumber, sk9 list, boolean packed) throws IOException {
        if (packed) {
            mo15265m((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo15271t(list.getLong(size));
            }
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(fieldNumber, list.getLong(size2));
        }
    }

    private void writeUInt32List_Internal(int fieldNumber, c68 list, boolean packed) throws IOException {
        if (packed) {
            mo15265m((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo15273v(list.getInt(size));
            }
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt32(fieldNumber, list.getInt(size2));
        }
    }

    private void writeUInt64List_Internal(int fieldNumber, sk9 list, boolean packed) throws IOException {
        if (packed) {
            mo15265m((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                mo15274w(list.getLong(size));
            }
            mo15273v(getTotalBytesWritten() - totalBytesWritten);
            writeTag(fieldNumber, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt64(fieldNumber, list.getLong(size2));
        }
    }
}
