package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class l36 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ boolean f56069o = false;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f56070a;

    /* JADX INFO: renamed from: b */
    public int f56071b;

    /* JADX INFO: renamed from: c */
    public int f56072c;

    /* JADX INFO: renamed from: d */
    public int[] f56073d;

    /* JADX INFO: renamed from: e */
    public int f56074e;

    /* JADX INFO: renamed from: f */
    public boolean f56075f;

    /* JADX INFO: renamed from: g */
    public boolean f56076g;

    /* JADX INFO: renamed from: h */
    public int f56077h;

    /* JADX INFO: renamed from: i */
    public int[] f56078i;

    /* JADX INFO: renamed from: j */
    public int f56079j;

    /* JADX INFO: renamed from: k */
    public int f56080k;

    /* JADX INFO: renamed from: l */
    public boolean f56081l;

    /* JADX INFO: renamed from: m */
    public AbstractC8597b f56082m;

    /* JADX INFO: renamed from: n */
    public final ozh f56083n;

    /* JADX INFO: renamed from: l36$a */
    public static class C8596a extends InputStream {

        /* JADX INFO: renamed from: a */
        public ByteBuffer f56084a;

        public C8596a(ByteBuffer byteBuffer) {
            this.f56084a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f56084a.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: l36$b */
    public static abstract class AbstractC8597b {
        public abstract ByteBuffer newByteBuffer(int i);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    /* JADX INFO: renamed from: l36$c */
    public static final class C8598c extends AbstractC8597b {

        /* JADX INFO: renamed from: a */
        public static final C8598c f56085a = new C8598c();

        @Override // p000.l36.AbstractC8597b
        public ByteBuffer newByteBuffer(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public l36(int i, AbstractC8597b abstractC8597b) {
        this(i, abstractC8597b, null, ozh.getDefault());
    }

    /* JADX INFO: renamed from: c */
    public static ByteBuffer m15293c(ByteBuffer byteBuffer, AbstractC8597b abstractC8597b) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferNewByteBuffer = abstractC8597b.newByteBuffer(i);
        byteBufferNewByteBuffer.position(byteBufferNewByteBuffer.clear().capacity() - iCapacity);
        byteBufferNewByteBuffer.put(byteBuffer);
        return byteBufferNewByteBuffer;
    }

    @Deprecated
    private int dataStart() {
        finished();
        return this.f56071b;
    }

    public static boolean isFieldPresent(ikg ikgVar, int i) {
        return ikgVar.__offset(i) != 0;
    }

    public void Nested(int i) {
        if (i != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15294a(int i, String str, boolean z) {
        prep(this.f56072c, (z ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i2 = 3; i2 >= 0; i2--) {
            addByte((byte) str.charAt(i2));
        }
        m15295b(i, z);
    }

    public void addBoolean(boolean z) {
        prep(1, 0);
        putBoolean(z);
    }

    public void addByte(byte b) {
        prep(1, 0);
        putByte(b);
    }

    public void addDouble(double d) {
        prep(8, 0);
        putDouble(d);
    }

    public void addFloat(float f) {
        prep(4, 0);
        putFloat(f);
    }

    public void addInt(int i) {
        prep(4, 0);
        putInt(i);
    }

    public void addLong(long j) {
        prep(8, 0);
        putLong(j);
    }

    public void addOffset(int i) {
        prep(4, 0);
        putInt((offset() - i) + 4);
    }

    public void addShort(short s) {
        prep(2, 0);
        putShort(s);
    }

    public void addStruct(int i, int i2, int i3) {
        if (i2 != i3) {
            Nested(i2);
            slot(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15295b(int i, boolean z) {
        prep(this.f56072c, (z ? 4 : 0) + 4);
        addOffset(i);
        if (z) {
            addInt(this.f56070a.capacity() - this.f56071b);
        }
        this.f56070a.position(this.f56071b);
        this.f56076g = true;
    }

    public void clear() {
        this.f56071b = this.f56070a.capacity();
        this.f56070a.clear();
        this.f56072c = 1;
        while (true) {
            int i = this.f56074e;
            if (i <= 0) {
                this.f56074e = 0;
                this.f56075f = false;
                this.f56076g = false;
                this.f56077h = 0;
                this.f56079j = 0;
                this.f56080k = 0;
                return;
            }
            int[] iArr = this.f56073d;
            int i2 = i - 1;
            this.f56074e = i2;
            iArr[i2] = 0;
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.f56070a;
        int i = this.f56071b - length;
        this.f56071b = i;
        byteBuffer.position(i);
        this.f56070a.put(bArr);
        return endVector();
    }

    public <T extends ikg> int createSortedVectorOfTables(T t, int[] iArr) {
        t.sortTables(iArr, this.f56070a);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int iEncodedLength = this.f56083n.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, iEncodedLength, 1);
        ByteBuffer byteBuffer = this.f56070a;
        int i = this.f56071b - iEncodedLength;
        this.f56071b = i;
        byteBuffer.position(i);
        this.f56083n.encodeUtf8(charSequence, this.f56070a);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i, int i2, int i3) {
        int i4 = i * i2;
        startVector(i, i2, i3);
        ByteBuffer byteBuffer = this.f56070a;
        int i5 = this.f56071b - i4;
        this.f56071b = i5;
        byteBuffer.position(i5);
        ByteBuffer byteBufferOrder = this.f56070a.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i4);
        return byteBufferOrder;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.f56070a;
    }

    public int endTable() {
        int i;
        if (this.f56073d == null || !this.f56075f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int iOffset = offset();
        int i2 = this.f56074e - 1;
        while (i2 >= 0 && this.f56073d[i2] == 0) {
            i2--;
        }
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.f56073d[i3];
            addShort((short) (i4 != 0 ? iOffset - i4 : 0));
        }
        addShort((short) (iOffset - this.f56077h));
        addShort((short) ((i2 + 3) * 2));
        int i5 = 0;
        loop2: while (true) {
            if (i5 >= this.f56079j) {
                i = 0;
                break;
            }
            int iCapacity = this.f56070a.capacity() - this.f56078i[i5];
            int i6 = this.f56071b;
            short s = this.f56070a.getShort(iCapacity);
            if (s == this.f56070a.getShort(i6)) {
                for (int i7 = 2; i7 < s; i7 += 2) {
                    if (this.f56070a.getShort(iCapacity + i7) != this.f56070a.getShort(i6 + i7)) {
                        break;
                    }
                }
                i = this.f56078i[i5];
                break loop2;
            }
            i5++;
        }
        if (i != 0) {
            int iCapacity2 = this.f56070a.capacity() - iOffset;
            this.f56071b = iCapacity2;
            this.f56070a.putInt(iCapacity2, i - iOffset);
        } else {
            int i8 = this.f56079j;
            int[] iArr = this.f56078i;
            if (i8 == iArr.length) {
                this.f56078i = Arrays.copyOf(iArr, i8 * 2);
            }
            int[] iArr2 = this.f56078i;
            int i9 = this.f56079j;
            this.f56079j = i9 + 1;
            iArr2[i9] = offset();
            ByteBuffer byteBuffer = this.f56070a;
            byteBuffer.putInt(byteBuffer.capacity() - iOffset, offset() - iOffset);
        }
        this.f56075f = false;
        return iOffset;
    }

    public int endVector() {
        if (!this.f56075f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f56075f = false;
        putInt(this.f56080k);
        return offset();
    }

    public void finish(int i) {
        m15295b(i, false);
    }

    public void finishSizePrefixed(int i) {
        m15295b(i, true);
    }

    public void finished() {
        if (!this.f56076g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public l36 forceDefaults(boolean z) {
        this.f56081l = z;
        return this;
    }

    public l36 init(ByteBuffer byteBuffer, AbstractC8597b abstractC8597b) {
        this.f56082m = abstractC8597b;
        this.f56070a = byteBuffer;
        byteBuffer.clear();
        this.f56070a.order(ByteOrder.LITTLE_ENDIAN);
        this.f56072c = 1;
        this.f56071b = this.f56070a.capacity();
        this.f56074e = 0;
        this.f56075f = false;
        this.f56076g = false;
        this.f56077h = 0;
        this.f56079j = 0;
        this.f56080k = 0;
        return this;
    }

    public void notNested() {
        if (this.f56075f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.f56070a.capacity() - this.f56071b;
    }

    public void pad(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f56070a;
            int i3 = this.f56071b - 1;
            this.f56071b = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public void prep(int i, int i2) {
        if (i > this.f56072c) {
            this.f56072c = i;
        }
        int i3 = ((~((this.f56070a.capacity() - this.f56071b) + i2)) + 1) & (i - 1);
        while (this.f56071b < i3 + i + i2) {
            int iCapacity = this.f56070a.capacity();
            ByteBuffer byteBuffer = this.f56070a;
            ByteBuffer byteBufferM15293c = m15293c(byteBuffer, this.f56082m);
            this.f56070a = byteBufferM15293c;
            if (byteBuffer != byteBufferM15293c) {
                this.f56082m.releaseByteBuffer(byteBuffer);
            }
            this.f56071b += this.f56070a.capacity() - iCapacity;
        }
        pad(i3);
    }

    public void putBoolean(boolean z) {
        ByteBuffer byteBuffer = this.f56070a;
        int i = this.f56071b - 1;
        this.f56071b = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b) {
        ByteBuffer byteBuffer = this.f56070a;
        int i = this.f56071b - 1;
        this.f56071b = i;
        byteBuffer.put(i, b);
    }

    public void putDouble(double d) {
        ByteBuffer byteBuffer = this.f56070a;
        int i = this.f56071b - 8;
        this.f56071b = i;
        byteBuffer.putDouble(i, d);
    }

    public void putFloat(float f) {
        ByteBuffer byteBuffer = this.f56070a;
        int i = this.f56071b - 4;
        this.f56071b = i;
        byteBuffer.putFloat(i, f);
    }

    public void putInt(int i) {
        ByteBuffer byteBuffer = this.f56070a;
        int i2 = this.f56071b - 4;
        this.f56071b = i2;
        byteBuffer.putInt(i2, i);
    }

    public void putLong(long j) {
        ByteBuffer byteBuffer = this.f56070a;
        int i = this.f56071b - 8;
        this.f56071b = i;
        byteBuffer.putLong(i, j);
    }

    public void putShort(short s) {
        ByteBuffer byteBuffer = this.f56070a;
        int i = this.f56071b - 2;
        this.f56071b = i;
        byteBuffer.putShort(i, s);
    }

    public void required(int i, int i2) {
        int iCapacity = this.f56070a.capacity() - i;
        if (this.f56070a.getShort((iCapacity - this.f56070a.getInt(iCapacity)) + i2) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i2 + " must be set");
    }

    public byte[] sizedByteArray(int i, int i2) {
        finished();
        byte[] bArr = new byte[i2];
        this.f56070a.position(i);
        this.f56070a.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer byteBufferDuplicate = this.f56070a.duplicate();
        byteBufferDuplicate.position(this.f56071b);
        byteBufferDuplicate.limit(this.f56070a.capacity());
        return new C8596a(byteBufferDuplicate);
    }

    public void slot(int i) {
        this.f56073d[i] = offset();
    }

    public void startTable(int i) {
        notNested();
        int[] iArr = this.f56073d;
        if (iArr == null || iArr.length < i) {
            this.f56073d = new int[i];
        }
        this.f56074e = i;
        Arrays.fill(this.f56073d, 0, i, 0);
        this.f56075f = true;
        this.f56077h = offset();
    }

    public void startVector(int i, int i2, int i3) {
        notNested();
        this.f56080k = i2;
        int i4 = i * i2;
        prep(4, i4);
        prep(i3, i4);
        this.f56075f = true;
    }

    public l36(int i, AbstractC8597b abstractC8597b, ByteBuffer byteBuffer, ozh ozhVar) {
        this.f56072c = 1;
        this.f56073d = null;
        this.f56074e = 0;
        this.f56075f = false;
        this.f56076g = false;
        this.f56078i = new int[16];
        this.f56079j = 0;
        this.f56080k = 0;
        this.f56081l = false;
        i = i <= 0 ? 1 : i;
        this.f56082m = abstractC8597b;
        if (byteBuffer != null) {
            this.f56070a = byteBuffer;
            byteBuffer.clear();
            this.f56070a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f56070a = abstractC8597b.newByteBuffer(i);
        }
        this.f56083n = ozhVar;
        this.f56071b = this.f56070a.capacity();
    }

    public void addBoolean(int i, boolean z, boolean z2) {
        if (this.f56081l || z != z2) {
            addBoolean(z);
            slot(i);
        }
    }

    public void addByte(int i, byte b, int i2) {
        if (this.f56081l || b != i2) {
            addByte(b);
            slot(i);
        }
    }

    public void addDouble(int i, double d, double d2) {
        if (this.f56081l || d != d2) {
            addDouble(d);
            slot(i);
        }
    }

    public void addFloat(int i, float f, double d) {
        if (this.f56081l || f != d) {
            addFloat(f);
            slot(i);
        }
    }

    public void addInt(int i, int i2, int i3) {
        if (this.f56081l || i2 != i3) {
            addInt(i2);
            slot(i);
        }
    }

    public void addLong(int i, long j, long j2) {
        if (this.f56081l || j != j2) {
            addLong(j);
            slot(i);
        }
    }

    public void addShort(int i, short s, int i2) {
        if (this.f56081l || s != i2) {
            addShort(s);
            slot(i);
        }
    }

    public void finish(int i, String str) {
        m15294a(i, str, false);
    }

    public void finishSizePrefixed(int i, String str) {
        m15294a(i, str, true);
    }

    public void addOffset(int i, int i2, int i3) {
        if (this.f56081l || i2 != i3) {
            addOffset(i2);
            slot(i);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.f56071b, this.f56070a.capacity() - this.f56071b);
    }

    public int createByteVector(byte[] bArr, int i, int i2) {
        startVector(1, i2, 1);
        ByteBuffer byteBuffer = this.f56070a;
        int i3 = this.f56071b - i2;
        this.f56071b = i3;
        byteBuffer.position(i3);
        this.f56070a.put(bArr, i, i2);
        return endVector();
    }

    public int createString(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f56070a;
        int i = this.f56071b - iRemaining;
        this.f56071b = i;
        byteBuffer2.position(i);
        this.f56070a.put(byteBuffer);
        return endVector();
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f56070a;
        int i = this.f56071b - iRemaining;
        this.f56071b = i;
        byteBuffer2.position(i);
        this.f56070a.put(byteBuffer);
        return endVector();
    }

    public l36(int i) {
        this(i, C8598c.f56085a, null, ozh.getDefault());
    }

    public l36() {
        this(1024);
    }

    public l36(ByteBuffer byteBuffer, AbstractC8597b abstractC8597b) {
        this(byteBuffer.capacity(), abstractC8597b, byteBuffer, ozh.getDefault());
    }

    public l36(ByteBuffer byteBuffer) {
        this(byteBuffer, new C8598c());
    }
}
