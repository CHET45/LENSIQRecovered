package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class k36 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ boolean f52504o = false;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f52505a;

    /* JADX INFO: renamed from: b */
    public int f52506b;

    /* JADX INFO: renamed from: c */
    public int f52507c;

    /* JADX INFO: renamed from: d */
    public int[] f52508d;

    /* JADX INFO: renamed from: e */
    public int f52509e;

    /* JADX INFO: renamed from: f */
    public boolean f52510f;

    /* JADX INFO: renamed from: g */
    public boolean f52511g;

    /* JADX INFO: renamed from: h */
    public int f52512h;

    /* JADX INFO: renamed from: i */
    public int[] f52513i;

    /* JADX INFO: renamed from: j */
    public int f52514j;

    /* JADX INFO: renamed from: k */
    public int f52515k;

    /* JADX INFO: renamed from: l */
    public boolean f52516l;

    /* JADX INFO: renamed from: m */
    public AbstractC8183b f52517m;

    /* JADX INFO: renamed from: n */
    public final mzh f52518n;

    /* JADX INFO: renamed from: k36$a */
    public static class C8182a extends InputStream {

        /* JADX INFO: renamed from: a */
        public ByteBuffer f52519a;

        public C8182a(ByteBuffer byteBuffer) {
            this.f52519a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f52519a.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: k36$b */
    public static abstract class AbstractC8183b {
        public abstract ByteBuffer newByteBuffer(int i);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    /* JADX INFO: renamed from: k36$c */
    public static final class C8184c extends AbstractC8183b {

        /* JADX INFO: renamed from: a */
        public static final C8184c f52520a = new C8184c();

        @Override // p000.k36.AbstractC8183b
        public ByteBuffer newByteBuffer(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public k36(int i, AbstractC8183b abstractC8183b) {
        this(i, abstractC8183b, null, mzh.getDefault());
    }

    /* JADX INFO: renamed from: c */
    public static ByteBuffer m14481c(ByteBuffer byteBuffer, AbstractC8183b abstractC8183b) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferNewByteBuffer = abstractC8183b.newByteBuffer(i);
        byteBufferNewByteBuffer.position(byteBufferNewByteBuffer.clear().capacity() - iCapacity);
        byteBufferNewByteBuffer.put(byteBuffer);
        return byteBufferNewByteBuffer;
    }

    @Deprecated
    private int dataStart() {
        finished();
        return this.f52506b;
    }

    public static boolean isFieldPresent(jkg jkgVar, int i) {
        return jkgVar.m14158d(i) != 0;
    }

    public void Nested(int i) {
        if (i != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14482a(int i, String str, boolean z) {
        prep(this.f52507c, (z ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i2 = 3; i2 >= 0; i2--) {
            addByte((byte) str.charAt(i2));
        }
        m14483b(i, z);
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
    public void m14483b(int i, boolean z) {
        prep(this.f52507c, (z ? 4 : 0) + 4);
        addOffset(i);
        if (z) {
            addInt(this.f52505a.capacity() - this.f52506b);
        }
        this.f52505a.position(this.f52506b);
        this.f52511g = true;
    }

    public void clear() {
        this.f52506b = this.f52505a.capacity();
        this.f52505a.clear();
        this.f52507c = 1;
        while (true) {
            int i = this.f52509e;
            if (i <= 0) {
                this.f52509e = 0;
                this.f52510f = false;
                this.f52511g = false;
                this.f52512h = 0;
                this.f52514j = 0;
                this.f52515k = 0;
                return;
            }
            int[] iArr = this.f52508d;
            int i2 = i - 1;
            this.f52509e = i2;
            iArr[i2] = 0;
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.f52505a;
        int i = this.f52506b - length;
        this.f52506b = i;
        byteBuffer.position(i);
        this.f52505a.put(bArr);
        return endVector();
    }

    public <T extends jkg> int createSortedVectorOfTables(T t, int[] iArr) {
        t.m14167r(iArr, this.f52505a);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int iEncodedLength = this.f52518n.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, iEncodedLength, 1);
        ByteBuffer byteBuffer = this.f52505a;
        int i = this.f52506b - iEncodedLength;
        this.f52506b = i;
        byteBuffer.position(i);
        this.f52518n.encodeUtf8(charSequence, this.f52505a);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i, int i2, int i3) {
        int i4 = i * i2;
        startVector(i, i2, i3);
        ByteBuffer byteBuffer = this.f52505a;
        int i5 = this.f52506b - i4;
        this.f52506b = i5;
        byteBuffer.position(i5);
        ByteBuffer byteBufferOrder = this.f52505a.slice().order(ByteOrder.LITTLE_ENDIAN);
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
        return this.f52505a;
    }

    public int endTable() {
        int i;
        if (this.f52508d == null || !this.f52510f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int iOffset = offset();
        int i2 = this.f52509e - 1;
        while (i2 >= 0 && this.f52508d[i2] == 0) {
            i2--;
        }
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.f52508d[i3];
            addShort((short) (i4 != 0 ? iOffset - i4 : 0));
        }
        addShort((short) (iOffset - this.f52512h));
        addShort((short) ((i2 + 3) * 2));
        int i5 = 0;
        loop2: while (true) {
            if (i5 >= this.f52514j) {
                i = 0;
                break;
            }
            int iCapacity = this.f52505a.capacity() - this.f52513i[i5];
            int i6 = this.f52506b;
            short s = this.f52505a.getShort(iCapacity);
            if (s == this.f52505a.getShort(i6)) {
                for (int i7 = 2; i7 < s; i7 += 2) {
                    if (this.f52505a.getShort(iCapacity + i7) != this.f52505a.getShort(i6 + i7)) {
                        break;
                    }
                }
                i = this.f52513i[i5];
                break loop2;
            }
            i5++;
        }
        if (i != 0) {
            int iCapacity2 = this.f52505a.capacity() - iOffset;
            this.f52506b = iCapacity2;
            this.f52505a.putInt(iCapacity2, i - iOffset);
        } else {
            int i8 = this.f52514j;
            int[] iArr = this.f52513i;
            if (i8 == iArr.length) {
                this.f52513i = Arrays.copyOf(iArr, i8 * 2);
            }
            int[] iArr2 = this.f52513i;
            int i9 = this.f52514j;
            this.f52514j = i9 + 1;
            iArr2[i9] = offset();
            ByteBuffer byteBuffer = this.f52505a;
            byteBuffer.putInt(byteBuffer.capacity() - iOffset, offset() - iOffset);
        }
        this.f52510f = false;
        return iOffset;
    }

    public int endVector() {
        if (!this.f52510f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f52510f = false;
        putInt(this.f52515k);
        return offset();
    }

    public void finish(int i) {
        m14483b(i, false);
    }

    public void finishSizePrefixed(int i) {
        m14483b(i, true);
    }

    public void finished() {
        if (!this.f52511g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public k36 forceDefaults(boolean z) {
        this.f52516l = z;
        return this;
    }

    public k36 init(ByteBuffer byteBuffer, AbstractC8183b abstractC8183b) {
        this.f52517m = abstractC8183b;
        this.f52505a = byteBuffer;
        byteBuffer.clear();
        this.f52505a.order(ByteOrder.LITTLE_ENDIAN);
        this.f52507c = 1;
        this.f52506b = this.f52505a.capacity();
        this.f52509e = 0;
        this.f52510f = false;
        this.f52511g = false;
        this.f52512h = 0;
        this.f52514j = 0;
        this.f52515k = 0;
        return this;
    }

    public void notNested() {
        if (this.f52510f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.f52505a.capacity() - this.f52506b;
    }

    public void pad(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f52505a;
            int i3 = this.f52506b - 1;
            this.f52506b = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public void prep(int i, int i2) {
        if (i > this.f52507c) {
            this.f52507c = i;
        }
        int i3 = ((~((this.f52505a.capacity() - this.f52506b) + i2)) + 1) & (i - 1);
        while (this.f52506b < i3 + i + i2) {
            int iCapacity = this.f52505a.capacity();
            ByteBuffer byteBuffer = this.f52505a;
            ByteBuffer byteBufferM14481c = m14481c(byteBuffer, this.f52517m);
            this.f52505a = byteBufferM14481c;
            if (byteBuffer != byteBufferM14481c) {
                this.f52517m.releaseByteBuffer(byteBuffer);
            }
            this.f52506b += this.f52505a.capacity() - iCapacity;
        }
        pad(i3);
    }

    public void putBoolean(boolean z) {
        ByteBuffer byteBuffer = this.f52505a;
        int i = this.f52506b - 1;
        this.f52506b = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b) {
        ByteBuffer byteBuffer = this.f52505a;
        int i = this.f52506b - 1;
        this.f52506b = i;
        byteBuffer.put(i, b);
    }

    public void putDouble(double d) {
        ByteBuffer byteBuffer = this.f52505a;
        int i = this.f52506b - 8;
        this.f52506b = i;
        byteBuffer.putDouble(i, d);
    }

    public void putFloat(float f) {
        ByteBuffer byteBuffer = this.f52505a;
        int i = this.f52506b - 4;
        this.f52506b = i;
        byteBuffer.putFloat(i, f);
    }

    public void putInt(int i) {
        ByteBuffer byteBuffer = this.f52505a;
        int i2 = this.f52506b - 4;
        this.f52506b = i2;
        byteBuffer.putInt(i2, i);
    }

    public void putLong(long j) {
        ByteBuffer byteBuffer = this.f52505a;
        int i = this.f52506b - 8;
        this.f52506b = i;
        byteBuffer.putLong(i, j);
    }

    public void putShort(short s) {
        ByteBuffer byteBuffer = this.f52505a;
        int i = this.f52506b - 2;
        this.f52506b = i;
        byteBuffer.putShort(i, s);
    }

    public void required(int i, int i2) {
        int iCapacity = this.f52505a.capacity() - i;
        if (this.f52505a.getShort((iCapacity - this.f52505a.getInt(iCapacity)) + i2) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i2 + " must be set");
    }

    public byte[] sizedByteArray(int i, int i2) {
        finished();
        byte[] bArr = new byte[i2];
        this.f52505a.position(i);
        this.f52505a.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer byteBufferDuplicate = this.f52505a.duplicate();
        byteBufferDuplicate.position(this.f52506b);
        byteBufferDuplicate.limit(this.f52505a.capacity());
        return new C8182a(byteBufferDuplicate);
    }

    public void slot(int i) {
        this.f52508d[i] = offset();
    }

    public void startTable(int i) {
        notNested();
        int[] iArr = this.f52508d;
        if (iArr == null || iArr.length < i) {
            this.f52508d = new int[i];
        }
        this.f52509e = i;
        Arrays.fill(this.f52508d, 0, i, 0);
        this.f52510f = true;
        this.f52512h = offset();
    }

    public void startVector(int i, int i2, int i3) {
        notNested();
        this.f52515k = i2;
        int i4 = i * i2;
        prep(4, i4);
        prep(i3, i4);
        this.f52510f = true;
    }

    public k36(int i, AbstractC8183b abstractC8183b, ByteBuffer byteBuffer, mzh mzhVar) {
        this.f52507c = 1;
        this.f52508d = null;
        this.f52509e = 0;
        this.f52510f = false;
        this.f52511g = false;
        this.f52513i = new int[16];
        this.f52514j = 0;
        this.f52515k = 0;
        this.f52516l = false;
        i = i <= 0 ? 1 : i;
        this.f52517m = abstractC8183b;
        if (byteBuffer != null) {
            this.f52505a = byteBuffer;
            byteBuffer.clear();
            this.f52505a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f52505a = abstractC8183b.newByteBuffer(i);
        }
        this.f52518n = mzhVar;
        this.f52506b = this.f52505a.capacity();
    }

    public void addBoolean(int i, boolean z, boolean z2) {
        if (this.f52516l || z != z2) {
            addBoolean(z);
            slot(i);
        }
    }

    public void addByte(int i, byte b, int i2) {
        if (this.f52516l || b != i2) {
            addByte(b);
            slot(i);
        }
    }

    public void addDouble(int i, double d, double d2) {
        if (this.f52516l || d != d2) {
            addDouble(d);
            slot(i);
        }
    }

    public void addFloat(int i, float f, double d) {
        if (this.f52516l || f != d) {
            addFloat(f);
            slot(i);
        }
    }

    public void addInt(int i, int i2, int i3) {
        if (this.f52516l || i2 != i3) {
            addInt(i2);
            slot(i);
        }
    }

    public void addLong(int i, long j, long j2) {
        if (this.f52516l || j != j2) {
            addLong(j);
            slot(i);
        }
    }

    public void addShort(int i, short s, int i2) {
        if (this.f52516l || s != i2) {
            addShort(s);
            slot(i);
        }
    }

    public void finish(int i, String str) {
        m14482a(i, str, false);
    }

    public void finishSizePrefixed(int i, String str) {
        m14482a(i, str, true);
    }

    public void addOffset(int i, int i2, int i3) {
        if (this.f52516l || i2 != i3) {
            addOffset(i2);
            slot(i);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.f52506b, this.f52505a.capacity() - this.f52506b);
    }

    public int createByteVector(byte[] bArr, int i, int i2) {
        startVector(1, i2, 1);
        ByteBuffer byteBuffer = this.f52505a;
        int i3 = this.f52506b - i2;
        this.f52506b = i3;
        byteBuffer.position(i3);
        this.f52505a.put(bArr, i, i2);
        return endVector();
    }

    public int createString(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f52505a;
        int i = this.f52506b - iRemaining;
        this.f52506b = i;
        byteBuffer2.position(i);
        this.f52505a.put(byteBuffer);
        return endVector();
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f52505a;
        int i = this.f52506b - iRemaining;
        this.f52506b = i;
        byteBuffer2.position(i);
        this.f52505a.put(byteBuffer);
        return endVector();
    }

    public k36(int i) {
        this(i, C8184c.f52520a, null, mzh.getDefault());
    }

    public k36() {
        this(1024);
    }

    public k36(ByteBuffer byteBuffer, AbstractC8183b abstractC8183b) {
        this(byteBuffer.capacity(), abstractC8183b, byteBuffer, mzh.getDefault());
    }

    public k36(ByteBuffer byteBuffer) {
        this(byteBuffer, new C8184c());
    }
}
