package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class dvh {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f31088a = m9446I();

    /* JADX INFO: renamed from: b */
    public static final Class<?> f31089b = C9427mo.m17476a();

    /* JADX INFO: renamed from: c */
    public static final boolean f31090c = m9484p(Long.TYPE);

    /* JADX INFO: renamed from: d */
    public static final boolean f31091d = m9484p(Integer.TYPE);

    /* JADX INFO: renamed from: e */
    public static final AbstractC4981e f31092e = getMemoryAccessor();

    /* JADX INFO: renamed from: f */
    public static final boolean f31093f = supportsUnsafeByteBufferOperations();

    /* JADX INFO: renamed from: g */
    public static final boolean f31094g = supportsUnsafeArrayOperations();

    /* JADX INFO: renamed from: h */
    public static final long f31095h;

    /* JADX INFO: renamed from: i */
    public static final long f31096i;

    /* JADX INFO: renamed from: j */
    public static final long f31097j;

    /* JADX INFO: renamed from: k */
    public static final long f31098k;

    /* JADX INFO: renamed from: l */
    public static final long f31099l;

    /* JADX INFO: renamed from: m */
    public static final long f31100m;

    /* JADX INFO: renamed from: n */
    public static final long f31101n;

    /* JADX INFO: renamed from: o */
    public static final long f31102o;

    /* JADX INFO: renamed from: p */
    public static final long f31103p;

    /* JADX INFO: renamed from: q */
    public static final long f31104q;

    /* JADX INFO: renamed from: r */
    public static final long f31105r;

    /* JADX INFO: renamed from: s */
    public static final long f31106s;

    /* JADX INFO: renamed from: t */
    public static final long f31107t;

    /* JADX INFO: renamed from: u */
    public static final long f31108u;

    /* JADX INFO: renamed from: v */
    public static final int f31109v = 8;

    /* JADX INFO: renamed from: w */
    public static final int f31110w = 7;

    /* JADX INFO: renamed from: x */
    public static final int f31111x;

    /* JADX INFO: renamed from: y */
    public static final boolean f31112y;

    /* JADX INFO: renamed from: dvh$a */
    public class C4977a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: dvh$b */
    public static final class C4978b extends AbstractC4981e {

        /* JADX INFO: renamed from: b */
        public static final long f31113b = -1;

        public C4978b(Unsafe unsafe) {
            super(unsafe);
        }

        private static int smallAddress(long address) {
            return (int) address;
        }

        @Override // p000.dvh.AbstractC4981e
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public boolean getBoolean(Object target, long offset) {
            return dvh.f31112y ? dvh.getBooleanBigEndian(target, offset) : dvh.getBooleanLittleEndian(target, offset);
        }

        @Override // p000.dvh.AbstractC4981e
        public byte getByte(Object target, long offset) {
            return dvh.f31112y ? dvh.getByteBigEndian(target, offset) : dvh.getByteLittleEndian(target, offset);
        }

        @Override // p000.dvh.AbstractC4981e
        public double getDouble(Object target, long offset) {
            return Double.longBitsToDouble(getLong(target, offset));
        }

        @Override // p000.dvh.AbstractC4981e
        public float getFloat(Object target, long offset) {
            return Float.intBitsToFloat(getInt(target, offset));
        }

        @Override // p000.dvh.AbstractC4981e
        public int getInt(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public long getLong(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // p000.dvh.AbstractC4981e
        public void putBoolean(Object target, long offset, boolean value) {
            if (dvh.f31112y) {
                dvh.putBooleanBigEndian(target, offset, value);
            } else {
                dvh.putBooleanLittleEndian(target, offset, value);
            }
        }

        @Override // p000.dvh.AbstractC4981e
        public void putByte(Object target, long offset, byte value) {
            if (dvh.f31112y) {
                dvh.putByteBigEndian(target, offset, value);
            } else {
                dvh.putByteLittleEndian(target, offset, value);
            }
        }

        @Override // p000.dvh.AbstractC4981e
        public void putDouble(Object target, long offset, double value) {
            putLong(target, offset, Double.doubleToLongBits(value));
        }

        @Override // p000.dvh.AbstractC4981e
        public void putFloat(Object target, long offset, float value) {
            putInt(target, offset, Float.floatToIntBits(value));
        }

        @Override // p000.dvh.AbstractC4981e
        public void putInt(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public void putLong(long address, long value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // p000.dvh.AbstractC4981e
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public byte getByte(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public void putByte(long address, byte value) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: dvh$c */
    public static final class C4979c extends AbstractC4981e {
        public C4979c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.dvh.AbstractC4981e
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public boolean getBoolean(Object target, long offset) {
            return dvh.f31112y ? dvh.getBooleanBigEndian(target, offset) : dvh.getBooleanLittleEndian(target, offset);
        }

        @Override // p000.dvh.AbstractC4981e
        public byte getByte(Object target, long offset) {
            return dvh.f31112y ? dvh.getByteBigEndian(target, offset) : dvh.getByteLittleEndian(target, offset);
        }

        @Override // p000.dvh.AbstractC4981e
        public double getDouble(Object target, long offset) {
            return Double.longBitsToDouble(getLong(target, offset));
        }

        @Override // p000.dvh.AbstractC4981e
        public float getFloat(Object target, long offset) {
            return Float.intBitsToFloat(getInt(target, offset));
        }

        @Override // p000.dvh.AbstractC4981e
        public int getInt(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public long getLong(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // p000.dvh.AbstractC4981e
        public void putBoolean(Object target, long offset, boolean value) {
            if (dvh.f31112y) {
                dvh.putBooleanBigEndian(target, offset, value);
            } else {
                dvh.putBooleanLittleEndian(target, offset, value);
            }
        }

        @Override // p000.dvh.AbstractC4981e
        public void putByte(Object target, long offset, byte value) {
            if (dvh.f31112y) {
                dvh.putByteBigEndian(target, offset, value);
            } else {
                dvh.putByteLittleEndian(target, offset, value);
            }
        }

        @Override // p000.dvh.AbstractC4981e
        public void putDouble(Object target, long offset, double value) {
            putLong(target, offset, Double.doubleToLongBits(value));
        }

        @Override // p000.dvh.AbstractC4981e
        public void putFloat(Object target, long offset, float value) {
            putInt(target, offset, Float.floatToIntBits(value));
        }

        @Override // p000.dvh.AbstractC4981e
        public void putInt(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public void putLong(long address, long value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // p000.dvh.AbstractC4981e
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public byte getByte(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.dvh.AbstractC4981e
        public void putByte(long address, byte value) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: dvh$d */
    public static final class C4980d extends AbstractC4981e {
        public C4980d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.dvh.AbstractC4981e
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            this.f31114a.copyMemory((Object) null, srcOffset, target, dvh.f31095h + targetIndex, length);
        }

        @Override // p000.dvh.AbstractC4981e
        public boolean getBoolean(Object target, long offset) {
            return this.f31114a.getBoolean(target, offset);
        }

        @Override // p000.dvh.AbstractC4981e
        public byte getByte(Object target, long offset) {
            return this.f31114a.getByte(target, offset);
        }

        @Override // p000.dvh.AbstractC4981e
        public double getDouble(Object target, long offset) {
            return this.f31114a.getDouble(target, offset);
        }

        @Override // p000.dvh.AbstractC4981e
        public float getFloat(Object target, long offset) {
            return this.f31114a.getFloat(target, offset);
        }

        @Override // p000.dvh.AbstractC4981e
        public int getInt(long address) {
            return this.f31114a.getInt(address);
        }

        @Override // p000.dvh.AbstractC4981e
        public long getLong(long address) {
            return this.f31114a.getLong(address);
        }

        @Override // p000.dvh.AbstractC4981e
        public Object getStaticObject(Field field) {
            return getObject(this.f31114a.staticFieldBase(field), this.f31114a.staticFieldOffset(field));
        }

        @Override // p000.dvh.AbstractC4981e
        public void putBoolean(Object target, long offset, boolean value) {
            this.f31114a.putBoolean(target, offset, value);
        }

        @Override // p000.dvh.AbstractC4981e
        public void putByte(Object target, long offset, byte value) {
            this.f31114a.putByte(target, offset, value);
        }

        @Override // p000.dvh.AbstractC4981e
        public void putDouble(Object target, long offset, double value) {
            this.f31114a.putDouble(target, offset, value);
        }

        @Override // p000.dvh.AbstractC4981e
        public void putFloat(Object target, long offset, float value) {
            this.f31114a.putFloat(target, offset, value);
        }

        @Override // p000.dvh.AbstractC4981e
        public void putInt(long address, int value) {
            this.f31114a.putInt(address, value);
        }

        @Override // p000.dvh.AbstractC4981e
        public void putLong(long address, long value) {
            this.f31114a.putLong(address, value);
        }

        @Override // p000.dvh.AbstractC4981e
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.f31114a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                dvh.logMissingMethod(th);
                return false;
            }
        }

        @Override // p000.dvh.AbstractC4981e
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.f31114a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                dvh.logMissingMethod(th);
                return false;
            }
        }

        @Override // p000.dvh.AbstractC4981e
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            this.f31114a.copyMemory(src, dvh.f31095h + srcIndex, (Object) null, targetOffset, length);
        }

        @Override // p000.dvh.AbstractC4981e
        public byte getByte(long address) {
            return this.f31114a.getByte(address);
        }

        @Override // p000.dvh.AbstractC4981e
        public void putByte(long address, byte value) {
            this.f31114a.putByte(address, value);
        }
    }

    /* JADX INFO: renamed from: dvh$e */
    public static abstract class AbstractC4981e {

        /* JADX INFO: renamed from: a */
        public Unsafe f31114a;

        public AbstractC4981e(Unsafe unsafe) {
            this.f31114a = unsafe;
        }

        public final int arrayBaseOffset(Class<?> clazz) {
            return this.f31114a.arrayBaseOffset(clazz);
        }

        public final int arrayIndexScale(Class<?> clazz) {
            return this.f31114a.arrayIndexScale(clazz);
        }

        public abstract void copyMemory(long srcOffset, byte[] target, long targetIndex, long length);

        public abstract void copyMemory(byte[] src, long srcIndex, long targetOffset, long length);

        public abstract boolean getBoolean(Object target, long offset);

        public abstract byte getByte(long address);

        public abstract byte getByte(Object target, long offset);

        public abstract double getDouble(Object target, long offset);

        public abstract float getFloat(Object target, long offset);

        public abstract int getInt(long address);

        public final int getInt(Object target, long offset) {
            return this.f31114a.getInt(target, offset);
        }

        public abstract long getLong(long address);

        public final long getLong(Object target, long offset) {
            return this.f31114a.getLong(target, offset);
        }

        public final Object getObject(Object target, long offset) {
            return this.f31114a.getObject(target, offset);
        }

        public abstract Object getStaticObject(Field field);

        public final long objectFieldOffset(Field field) {
            return this.f31114a.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object target, long offset, boolean value);

        public abstract void putByte(long address, byte value);

        public abstract void putByte(Object target, long offset, byte value);

        public abstract void putDouble(Object target, long offset, double value);

        public abstract void putFloat(Object target, long offset, float value);

        public abstract void putInt(long address, int value);

        public final void putInt(Object target, long offset, int value) {
            this.f31114a.putInt(target, offset, value);
        }

        public abstract void putLong(long address, long value);

        public final void putLong(Object target, long offset, long value) {
            this.f31114a.putLong(target, offset, value);
        }

        public final void putObject(Object target, long offset, Object value) {
            this.f31114a.putObject(target, offset, value);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.f31114a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                dvh.logMissingMethod(th);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.f31114a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return dvh.bufferAddressField() != null;
            } catch (Throwable th) {
                dvh.logMissingMethod(th);
                return false;
            }
        }
    }

    static {
        long jArrayBaseOffset = arrayBaseOffset(byte[].class);
        f31095h = jArrayBaseOffset;
        f31096i = arrayBaseOffset(boolean[].class);
        f31097j = arrayIndexScale(boolean[].class);
        f31098k = arrayBaseOffset(int[].class);
        f31099l = arrayIndexScale(int[].class);
        f31100m = arrayBaseOffset(long[].class);
        f31101n = arrayIndexScale(long[].class);
        f31102o = arrayBaseOffset(float[].class);
        f31103p = arrayIndexScale(float[].class);
        f31104q = arrayBaseOffset(double[].class);
        f31105r = arrayIndexScale(double[].class);
        f31106s = arrayBaseOffset(Object[].class);
        f31107t = arrayIndexScale(Object[].class);
        f31108u = fieldOffset(bufferAddressField());
        f31111x = (int) (jArrayBaseOffset & 7);
        f31112y = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private dvh() {
    }

    /* JADX INFO: renamed from: A */
    public static int m9438A(Object target, long offset) {
        return f31092e.getInt(target, offset);
    }

    /* JADX INFO: renamed from: B */
    public static int m9439B(int[] target, long index) {
        return f31092e.getInt(target, f31098k + (index * f31099l));
    }

    /* JADX INFO: renamed from: C */
    public static long m9440C(long address) {
        return f31092e.getLong(address);
    }

    /* JADX INFO: renamed from: D */
    public static long m9441D(Object target, long offset) {
        return f31092e.getLong(target, offset);
    }

    /* JADX INFO: renamed from: E */
    public static long m9442E(long[] target, long index) {
        return f31092e.getLong(target, f31100m + (index * f31101n));
    }

    /* JADX INFO: renamed from: F */
    public static Object m9443F(Object target, long offset) {
        return f31092e.getObject(target, offset);
    }

    /* JADX INFO: renamed from: G */
    public static Object m9444G(Object[] target, long index) {
        return f31092e.getObject(target, f31106s + (index * f31107t));
    }

    /* JADX INFO: renamed from: H */
    public static Object m9445H(Field field) {
        return f31092e.getStaticObject(field);
    }

    /* JADX INFO: renamed from: I */
    public static Unsafe m9446I() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4977a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m9447J() {
        return f31094g;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m9448K() {
        return f31093f;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m9449L() {
        return f31090c;
    }

    /* JADX INFO: renamed from: M */
    public static int m9450M(byte[] left, int leftOff, byte[] right, int rightOff, int length) {
        if (leftOff < 0 || rightOff < 0 || length < 0 || leftOff + length > left.length || rightOff + length > right.length) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        if (f31094g) {
            for (int i2 = (f31111x + leftOff) & 7; i < length && (i2 & 7) != 0; i2++) {
                if (left[leftOff + i] != right[rightOff + i]) {
                    return i;
                }
                i++;
            }
            int i3 = ((length - i) & (-8)) + i;
            while (i < i3) {
                long j = f31095h;
                long j2 = i;
                long jM9441D = m9441D(left, ((long) leftOff) + j + j2);
                long jM9441D2 = m9441D(right, j + ((long) rightOff) + j2);
                if (jM9441D != jM9441D2) {
                    return i + firstDifferingByteIndexNativeEndian(jM9441D, jM9441D2);
                }
                i += 8;
            }
        }
        while (i < length) {
            if (left[leftOff + i] != right[rightOff + i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: N */
    public static long m9451N(Field field) {
        return f31092e.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: O */
    public static void m9452O(Object target, long offset, boolean value) {
        f31092e.putBoolean(target, offset, value);
    }

    /* JADX INFO: renamed from: P */
    public static void m9453P(boolean[] target, long index, boolean value) {
        f31092e.putBoolean(target, f31096i + (index * f31097j), value);
    }

    /* JADX INFO: renamed from: Q */
    public static void m9454Q(long address, byte value) {
        f31092e.putByte(address, value);
    }

    /* JADX INFO: renamed from: R */
    public static void m9455R(Object target, long offset, byte value) {
        f31092e.putByte(target, offset, value);
    }

    /* JADX INFO: renamed from: S */
    public static void m9456S(byte[] target, long index, byte value) {
        f31092e.putByte(target, f31095h + index, value);
    }

    /* JADX INFO: renamed from: T */
    public static void m9457T(Object target, long offset, double value) {
        f31092e.putDouble(target, offset, value);
    }

    /* JADX INFO: renamed from: U */
    public static void m9458U(double[] target, long index, double value) {
        f31092e.putDouble(target, f31104q + (index * f31105r), value);
    }

    /* JADX INFO: renamed from: V */
    public static void m9459V(Object target, long offset, float value) {
        f31092e.putFloat(target, offset, value);
    }

    /* JADX INFO: renamed from: W */
    public static void m9460W(float[] target, long index, float value) {
        f31092e.putFloat(target, f31102o + (index * f31103p), value);
    }

    /* JADX INFO: renamed from: X */
    public static void m9461X(long address, int value) {
        f31092e.putInt(address, value);
    }

    /* JADX INFO: renamed from: Y */
    public static void m9462Y(Object target, long offset, int value) {
        f31092e.putInt(target, offset, value);
    }

    /* JADX INFO: renamed from: Z */
    public static void m9463Z(int[] target, long index, int value) {
        f31092e.putInt(target, f31098k + (index * f31099l), value);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m9465a0(long address, long value) {
        f31092e.putLong(address, value);
    }

    private static int arrayBaseOffset(Class<?> clazz) {
        if (f31094g) {
            return f31092e.arrayBaseOffset(clazz);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> clazz) {
        if (f31094g) {
            return f31092e.arrayIndexScale(clazz);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m9467b0(Object target, long offset, long value) {
        f31092e.putLong(target, offset, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field bufferAddressField() {
        Field field;
        if (C9427mo.m17477b() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        Field field2 = field(Buffer.class, "address");
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m9469c0(long[] target, long index, long value) {
        f31092e.putLong(target, f31100m + (index * f31101n), value);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m9471d0(Object target, long offset, Object value) {
        f31092e.putObject(target, offset, value);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m9473e0(Object[] target, long index, Object value) {
        f31092e.putObject(target, f31106s + (index * f31107t), value);
    }

    private static Field field(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(Field field) {
        AbstractC4981e abstractC4981e;
        if (field == null || (abstractC4981e = f31092e) == null) {
            return -1L;
        }
        return abstractC4981e.objectFieldOffset(field);
    }

    private static int firstDifferingByteIndexNativeEndian(long left, long right) {
        return (f31112y ? Long.numberOfLeadingZeros(left ^ right) : Long.numberOfTrailingZeros(left ^ right)) >> 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object target, long offset) {
        return getByteBigEndian(target, offset) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object target, long offset) {
        return getByteLittleEndian(target, offset) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object target, long offset) {
        return (byte) ((m9438A(target, (-4) & offset) >>> ((int) (((~offset) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object target, long offset) {
        return (byte) ((m9438A(target, (-4) & offset) >>> ((int) ((offset & 3) << 3))) & 255);
    }

    private static AbstractC4981e getMemoryAccessor() {
        Unsafe unsafe = f31088a;
        if (unsafe == null) {
            return null;
        }
        if (!C9427mo.m17477b()) {
            return new C4980d(unsafe);
        }
        if (f31090c) {
            return new C4979c(unsafe);
        }
        if (f31091d) {
            return new C4978b(unsafe);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static long m9479k(ByteBuffer buffer) {
        return f31092e.getLong(buffer, f31108u);
    }

    /* JADX INFO: renamed from: l */
    public static <T> T m9480l(Class<T> cls) {
        try {
            return (T) f31088a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable e) {
        Logger.getLogger(dvh.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + e);
    }

    /* JADX INFO: renamed from: m */
    public static void m9481m(long srcOffset, byte[] target, long targetIndex, long length) {
        f31092e.copyMemory(srcOffset, target, targetIndex, length);
    }

    /* JADX INFO: renamed from: n */
    public static void m9482n(byte[] src, long srcIndex, long targetOffset, long length) {
        f31092e.copyMemory(src, srcIndex, targetOffset, length);
    }

    /* JADX INFO: renamed from: o */
    public static void m9483o(byte[] src, long srcIndex, byte[] target, long targetIndex, long length) {
        System.arraycopy(src, (int) srcIndex, target, (int) targetIndex, (int) length);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m9484p(Class<?> addressClass) {
        if (!C9427mo.m17477b()) {
            return false;
        }
        try {
            Class<?> cls = f31089b;
            Class cls2 = Boolean.TYPE;
            cls.getMethod("peekLong", addressClass, cls2);
            cls.getMethod("pokeLong", addressClass, Long.TYPE, cls2);
            Class cls3 = Integer.TYPE;
            cls.getMethod("pokeInt", addressClass, cls3, cls2);
            cls.getMethod("peekInt", addressClass, cls2);
            cls.getMethod("pokeByte", addressClass, Byte.TYPE);
            cls.getMethod("peekByte", addressClass);
            cls.getMethod("pokeByteArray", addressClass, byte[].class, cls3, cls3);
            cls.getMethod("peekByteArray", addressClass, byte[].class, cls3, cls3);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j, boolean z) {
        putByteBigEndian(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j, boolean z) {
        putByteLittleEndian(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object target, long offset, byte value) {
        long j = (-4) & offset;
        int iM9438A = m9438A(target, j);
        int i = ((~((int) offset)) & 3) << 3;
        m9462Y(target, j, ((255 & value) << i) | (iM9438A & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object target, long offset, byte value) {
        long j = (-4) & offset;
        int i = (((int) offset) & 3) << 3;
        m9462Y(target, j, ((255 & value) << i) | (m9438A(target, j) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m9485q(Object target, long offset) {
        return f31092e.getBoolean(target, offset);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m9486r(boolean[] target, long index) {
        return f31092e.getBoolean(target, f31096i + (index * f31097j));
    }

    /* JADX INFO: renamed from: s */
    public static byte m9487s(long address) {
        return f31092e.getByte(address);
    }

    private static boolean supportsUnsafeArrayOperations() {
        AbstractC4981e abstractC4981e = f31092e;
        if (abstractC4981e == null) {
            return false;
        }
        return abstractC4981e.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        AbstractC4981e abstractC4981e = f31092e;
        if (abstractC4981e == null) {
            return false;
        }
        return abstractC4981e.supportsUnsafeByteBufferOperations();
    }

    /* JADX INFO: renamed from: t */
    public static byte m9488t(Object target, long offset) {
        return f31092e.getByte(target, offset);
    }

    /* JADX INFO: renamed from: u */
    public static byte m9489u(byte[] target, long index) {
        return f31092e.getByte(target, f31095h + index);
    }

    /* JADX INFO: renamed from: v */
    public static double m9490v(Object target, long offset) {
        return f31092e.getDouble(target, offset);
    }

    /* JADX INFO: renamed from: w */
    public static double m9491w(double[] target, long index) {
        return f31092e.getDouble(target, f31104q + (index * f31105r));
    }

    /* JADX INFO: renamed from: x */
    public static float m9492x(Object target, long offset) {
        return f31092e.getFloat(target, offset);
    }

    /* JADX INFO: renamed from: y */
    public static float m9493y(float[] target, long index) {
        return f31092e.getFloat(target, f31102o + (index * f31103p));
    }

    /* JADX INFO: renamed from: z */
    public static int m9494z(long address) {
        return f31092e.getInt(address);
    }
}
