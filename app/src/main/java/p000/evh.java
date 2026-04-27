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

/* JADX INFO: loaded from: classes3.dex */
public final class evh {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f34191a = m10255I();

    /* JADX INFO: renamed from: b */
    public static final Class<?> f34192b = C9958no.m18045a();

    /* JADX INFO: renamed from: c */
    public static final boolean f34193c = m10293p(Long.TYPE);

    /* JADX INFO: renamed from: d */
    public static final boolean f34194d = m10293p(Integer.TYPE);

    /* JADX INFO: renamed from: e */
    public static final AbstractC5486e f34195e = getMemoryAccessor();

    /* JADX INFO: renamed from: f */
    public static final boolean f34196f = supportsUnsafeByteBufferOperations();

    /* JADX INFO: renamed from: g */
    public static final boolean f34197g = supportsUnsafeArrayOperations();

    /* JADX INFO: renamed from: h */
    public static final long f34198h;

    /* JADX INFO: renamed from: i */
    public static final long f34199i;

    /* JADX INFO: renamed from: j */
    public static final long f34200j;

    /* JADX INFO: renamed from: k */
    public static final long f34201k;

    /* JADX INFO: renamed from: l */
    public static final long f34202l;

    /* JADX INFO: renamed from: m */
    public static final long f34203m;

    /* JADX INFO: renamed from: n */
    public static final long f34204n;

    /* JADX INFO: renamed from: o */
    public static final long f34205o;

    /* JADX INFO: renamed from: p */
    public static final long f34206p;

    /* JADX INFO: renamed from: q */
    public static final long f34207q;

    /* JADX INFO: renamed from: r */
    public static final long f34208r;

    /* JADX INFO: renamed from: s */
    public static final long f34209s;

    /* JADX INFO: renamed from: t */
    public static final long f34210t;

    /* JADX INFO: renamed from: u */
    public static final long f34211u;

    /* JADX INFO: renamed from: v */
    public static final int f34212v = 8;

    /* JADX INFO: renamed from: w */
    public static final int f34213w = 7;

    /* JADX INFO: renamed from: x */
    public static final int f34214x;

    /* JADX INFO: renamed from: y */
    public static final boolean f34215y;

    /* JADX INFO: renamed from: evh$a */
    public class C5482a implements PrivilegedExceptionAction<Unsafe> {
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

    /* JADX INFO: renamed from: evh$b */
    public static final class C5483b extends AbstractC5486e {

        /* JADX INFO: renamed from: b */
        public static final long f34216b = -1;

        public C5483b(Unsafe unsafe) {
            super(unsafe);
        }

        private static int smallAddress(long address) {
            return (int) address;
        }

        @Override // p000.evh.AbstractC5486e
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public boolean getBoolean(Object target, long offset) {
            return evh.f34215y ? evh.getBooleanBigEndian(target, offset) : evh.getBooleanLittleEndian(target, offset);
        }

        @Override // p000.evh.AbstractC5486e
        public byte getByte(Object target, long offset) {
            return evh.f34215y ? evh.getByteBigEndian(target, offset) : evh.getByteLittleEndian(target, offset);
        }

        @Override // p000.evh.AbstractC5486e
        public double getDouble(Object target, long offset) {
            return Double.longBitsToDouble(getLong(target, offset));
        }

        @Override // p000.evh.AbstractC5486e
        public float getFloat(Object target, long offset) {
            return Float.intBitsToFloat(getInt(target, offset));
        }

        @Override // p000.evh.AbstractC5486e
        public int getInt(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public long getLong(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // p000.evh.AbstractC5486e
        public void putBoolean(Object target, long offset, boolean value) {
            if (evh.f34215y) {
                evh.putBooleanBigEndian(target, offset, value);
            } else {
                evh.putBooleanLittleEndian(target, offset, value);
            }
        }

        @Override // p000.evh.AbstractC5486e
        public void putByte(Object target, long offset, byte value) {
            if (evh.f34215y) {
                evh.putByteBigEndian(target, offset, value);
            } else {
                evh.putByteLittleEndian(target, offset, value);
            }
        }

        @Override // p000.evh.AbstractC5486e
        public void putDouble(Object target, long offset, double value) {
            putLong(target, offset, Double.doubleToLongBits(value));
        }

        @Override // p000.evh.AbstractC5486e
        public void putFloat(Object target, long offset, float value) {
            putInt(target, offset, Float.floatToIntBits(value));
        }

        @Override // p000.evh.AbstractC5486e
        public void putInt(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public void putLong(long address, long value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // p000.evh.AbstractC5486e
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public byte getByte(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public void putByte(long address, byte value) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: evh$c */
    public static final class C5484c extends AbstractC5486e {
        public C5484c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.evh.AbstractC5486e
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public boolean getBoolean(Object target, long offset) {
            return evh.f34215y ? evh.getBooleanBigEndian(target, offset) : evh.getBooleanLittleEndian(target, offset);
        }

        @Override // p000.evh.AbstractC5486e
        public byte getByte(Object target, long offset) {
            return evh.f34215y ? evh.getByteBigEndian(target, offset) : evh.getByteLittleEndian(target, offset);
        }

        @Override // p000.evh.AbstractC5486e
        public double getDouble(Object target, long offset) {
            return Double.longBitsToDouble(getLong(target, offset));
        }

        @Override // p000.evh.AbstractC5486e
        public float getFloat(Object target, long offset) {
            return Float.intBitsToFloat(getInt(target, offset));
        }

        @Override // p000.evh.AbstractC5486e
        public int getInt(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public long getLong(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public Object getStaticObject(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // p000.evh.AbstractC5486e
        public void putBoolean(Object target, long offset, boolean value) {
            if (evh.f34215y) {
                evh.putBooleanBigEndian(target, offset, value);
            } else {
                evh.putBooleanLittleEndian(target, offset, value);
            }
        }

        @Override // p000.evh.AbstractC5486e
        public void putByte(Object target, long offset, byte value) {
            if (evh.f34215y) {
                evh.putByteBigEndian(target, offset, value);
            } else {
                evh.putByteLittleEndian(target, offset, value);
            }
        }

        @Override // p000.evh.AbstractC5486e
        public void putDouble(Object target, long offset, double value) {
            putLong(target, offset, Double.doubleToLongBits(value));
        }

        @Override // p000.evh.AbstractC5486e
        public void putFloat(Object target, long offset, float value) {
            putInt(target, offset, Float.floatToIntBits(value));
        }

        @Override // p000.evh.AbstractC5486e
        public void putInt(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public void putLong(long address, long value) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // p000.evh.AbstractC5486e
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public byte getByte(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.evh.AbstractC5486e
        public void putByte(long address, byte value) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: evh$d */
    public static final class C5485d extends AbstractC5486e {
        public C5485d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p000.evh.AbstractC5486e
        public void copyMemory(long srcOffset, byte[] target, long targetIndex, long length) {
            this.f34217a.copyMemory((Object) null, srcOffset, target, evh.f34198h + targetIndex, length);
        }

        @Override // p000.evh.AbstractC5486e
        public boolean getBoolean(Object target, long offset) {
            return this.f34217a.getBoolean(target, offset);
        }

        @Override // p000.evh.AbstractC5486e
        public byte getByte(Object target, long offset) {
            return this.f34217a.getByte(target, offset);
        }

        @Override // p000.evh.AbstractC5486e
        public double getDouble(Object target, long offset) {
            return this.f34217a.getDouble(target, offset);
        }

        @Override // p000.evh.AbstractC5486e
        public float getFloat(Object target, long offset) {
            return this.f34217a.getFloat(target, offset);
        }

        @Override // p000.evh.AbstractC5486e
        public int getInt(long address) {
            return this.f34217a.getInt(address);
        }

        @Override // p000.evh.AbstractC5486e
        public long getLong(long address) {
            return this.f34217a.getLong(address);
        }

        @Override // p000.evh.AbstractC5486e
        public Object getStaticObject(Field field) {
            return getObject(this.f34217a.staticFieldBase(field), this.f34217a.staticFieldOffset(field));
        }

        @Override // p000.evh.AbstractC5486e
        public void putBoolean(Object target, long offset, boolean value) {
            this.f34217a.putBoolean(target, offset, value);
        }

        @Override // p000.evh.AbstractC5486e
        public void putByte(Object target, long offset, byte value) {
            this.f34217a.putByte(target, offset, value);
        }

        @Override // p000.evh.AbstractC5486e
        public void putDouble(Object target, long offset, double value) {
            this.f34217a.putDouble(target, offset, value);
        }

        @Override // p000.evh.AbstractC5486e
        public void putFloat(Object target, long offset, float value) {
            this.f34217a.putFloat(target, offset, value);
        }

        @Override // p000.evh.AbstractC5486e
        public void putInt(long address, int value) {
            this.f34217a.putInt(address, value);
        }

        @Override // p000.evh.AbstractC5486e
        public void putLong(long address, long value) {
            this.f34217a.putLong(address, value);
        }

        @Override // p000.evh.AbstractC5486e
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.f34217a.getClass();
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
                evh.logMissingMethod(th);
                return false;
            }
        }

        @Override // p000.evh.AbstractC5486e
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.f34217a.getClass();
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
                evh.logMissingMethod(th);
                return false;
            }
        }

        @Override // p000.evh.AbstractC5486e
        public void copyMemory(byte[] src, long srcIndex, long targetOffset, long length) {
            this.f34217a.copyMemory(src, evh.f34198h + srcIndex, (Object) null, targetOffset, length);
        }

        @Override // p000.evh.AbstractC5486e
        public byte getByte(long address) {
            return this.f34217a.getByte(address);
        }

        @Override // p000.evh.AbstractC5486e
        public void putByte(long address, byte value) {
            this.f34217a.putByte(address, value);
        }
    }

    /* JADX INFO: renamed from: evh$e */
    public static abstract class AbstractC5486e {

        /* JADX INFO: renamed from: a */
        public Unsafe f34217a;

        public AbstractC5486e(Unsafe unsafe) {
            this.f34217a = unsafe;
        }

        public final int arrayBaseOffset(Class<?> clazz) {
            return this.f34217a.arrayBaseOffset(clazz);
        }

        public final int arrayIndexScale(Class<?> clazz) {
            return this.f34217a.arrayIndexScale(clazz);
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
            return this.f34217a.getInt(target, offset);
        }

        public abstract long getLong(long address);

        public final long getLong(Object target, long offset) {
            return this.f34217a.getLong(target, offset);
        }

        public final Object getObject(Object target, long offset) {
            return this.f34217a.getObject(target, offset);
        }

        public abstract Object getStaticObject(Field field);

        public final long objectFieldOffset(Field field) {
            return this.f34217a.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object target, long offset, boolean value);

        public abstract void putByte(long address, byte value);

        public abstract void putByte(Object target, long offset, byte value);

        public abstract void putDouble(Object target, long offset, double value);

        public abstract void putFloat(Object target, long offset, float value);

        public abstract void putInt(long address, int value);

        public final void putInt(Object target, long offset, int value) {
            this.f34217a.putInt(target, offset, value);
        }

        public abstract void putLong(long address, long value);

        public final void putLong(Object target, long offset, long value) {
            this.f34217a.putLong(target, offset, value);
        }

        public final void putObject(Object target, long offset, Object value) {
            this.f34217a.putObject(target, offset, value);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.f34217a;
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
                evh.logMissingMethod(th);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.f34217a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return evh.bufferAddressField() != null;
            } catch (Throwable th) {
                evh.logMissingMethod(th);
                return false;
            }
        }
    }

    static {
        long jArrayBaseOffset = arrayBaseOffset(byte[].class);
        f34198h = jArrayBaseOffset;
        f34199i = arrayBaseOffset(boolean[].class);
        f34200j = arrayIndexScale(boolean[].class);
        f34201k = arrayBaseOffset(int[].class);
        f34202l = arrayIndexScale(int[].class);
        f34203m = arrayBaseOffset(long[].class);
        f34204n = arrayIndexScale(long[].class);
        f34205o = arrayBaseOffset(float[].class);
        f34206p = arrayIndexScale(float[].class);
        f34207q = arrayBaseOffset(double[].class);
        f34208r = arrayIndexScale(double[].class);
        f34209s = arrayBaseOffset(Object[].class);
        f34210t = arrayIndexScale(Object[].class);
        f34211u = fieldOffset(bufferAddressField());
        f34214x = (int) (jArrayBaseOffset & 7);
        f34215y = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private evh() {
    }

    /* JADX INFO: renamed from: A */
    public static int m10247A(Object target, long offset) {
        return f34195e.getInt(target, offset);
    }

    /* JADX INFO: renamed from: B */
    public static int m10248B(int[] target, long index) {
        return f34195e.getInt(target, f34201k + (index * f34202l));
    }

    /* JADX INFO: renamed from: C */
    public static long m10249C(long address) {
        return f34195e.getLong(address);
    }

    /* JADX INFO: renamed from: D */
    public static long m10250D(Object target, long offset) {
        return f34195e.getLong(target, offset);
    }

    /* JADX INFO: renamed from: E */
    public static long m10251E(long[] target, long index) {
        return f34195e.getLong(target, f34203m + (index * f34204n));
    }

    /* JADX INFO: renamed from: F */
    public static Object m10252F(Object target, long offset) {
        return f34195e.getObject(target, offset);
    }

    /* JADX INFO: renamed from: G */
    public static Object m10253G(Object[] target, long index) {
        return f34195e.getObject(target, f34209s + (index * f34210t));
    }

    /* JADX INFO: renamed from: H */
    public static Object m10254H(Field field) {
        return f34195e.getStaticObject(field);
    }

    /* JADX INFO: renamed from: I */
    public static Unsafe m10255I() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5482a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m10256J() {
        return f34197g;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m10257K() {
        return f34196f;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m10258L() {
        return f34193c;
    }

    /* JADX INFO: renamed from: M */
    public static int m10259M(byte[] left, int leftOff, byte[] right, int rightOff, int length) {
        if (leftOff < 0 || rightOff < 0 || length < 0 || leftOff + length > left.length || rightOff + length > right.length) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        if (f34197g) {
            for (int i2 = (f34214x + leftOff) & 7; i < length && (i2 & 7) != 0; i2++) {
                if (left[leftOff + i] != right[rightOff + i]) {
                    return i;
                }
                i++;
            }
            int i3 = ((length - i) & (-8)) + i;
            while (i < i3) {
                long j = f34198h;
                long j2 = i;
                long jM10250D = m10250D(left, ((long) leftOff) + j + j2);
                long jM10250D2 = m10250D(right, j + ((long) rightOff) + j2);
                if (jM10250D != jM10250D2) {
                    return i + firstDifferingByteIndexNativeEndian(jM10250D, jM10250D2);
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
    public static long m10260N(Field field) {
        return f34195e.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: O */
    public static void m10261O(Object target, long offset, boolean value) {
        f34195e.putBoolean(target, offset, value);
    }

    /* JADX INFO: renamed from: P */
    public static void m10262P(boolean[] target, long index, boolean value) {
        f34195e.putBoolean(target, f34199i + (index * f34200j), value);
    }

    /* JADX INFO: renamed from: Q */
    public static void m10263Q(long address, byte value) {
        f34195e.putByte(address, value);
    }

    /* JADX INFO: renamed from: R */
    public static void m10264R(Object target, long offset, byte value) {
        f34195e.putByte(target, offset, value);
    }

    /* JADX INFO: renamed from: S */
    public static void m10265S(byte[] target, long index, byte value) {
        f34195e.putByte(target, f34198h + index, value);
    }

    /* JADX INFO: renamed from: T */
    public static void m10266T(Object target, long offset, double value) {
        f34195e.putDouble(target, offset, value);
    }

    /* JADX INFO: renamed from: U */
    public static void m10267U(double[] target, long index, double value) {
        f34195e.putDouble(target, f34207q + (index * f34208r), value);
    }

    /* JADX INFO: renamed from: V */
    public static void m10268V(Object target, long offset, float value) {
        f34195e.putFloat(target, offset, value);
    }

    /* JADX INFO: renamed from: W */
    public static void m10269W(float[] target, long index, float value) {
        f34195e.putFloat(target, f34205o + (index * f34206p), value);
    }

    /* JADX INFO: renamed from: X */
    public static void m10270X(long address, int value) {
        f34195e.putInt(address, value);
    }

    /* JADX INFO: renamed from: Y */
    public static void m10271Y(Object target, long offset, int value) {
        f34195e.putInt(target, offset, value);
    }

    /* JADX INFO: renamed from: Z */
    public static void m10272Z(int[] target, long index, int value) {
        f34195e.putInt(target, f34201k + (index * f34202l), value);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m10274a0(long address, long value) {
        f34195e.putLong(address, value);
    }

    private static int arrayBaseOffset(Class<?> clazz) {
        if (f34197g) {
            return f34195e.arrayBaseOffset(clazz);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> clazz) {
        if (f34197g) {
            return f34195e.arrayIndexScale(clazz);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m10276b0(Object target, long offset, long value) {
        f34195e.putLong(target, offset, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field bufferAddressField() {
        Field field;
        if (C9958no.m18046b() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        Field field2 = field(Buffer.class, "address");
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m10278c0(long[] target, long index, long value) {
        f34195e.putLong(target, f34203m + (index * f34204n), value);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m10280d0(Object target, long offset, Object value) {
        f34195e.putObject(target, offset, value);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m10282e0(Object[] target, long index, Object value) {
        f34195e.putObject(target, f34209s + (index * f34210t), value);
    }

    private static Field field(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(Field field) {
        AbstractC5486e abstractC5486e;
        if (field == null || (abstractC5486e = f34195e) == null) {
            return -1L;
        }
        return abstractC5486e.objectFieldOffset(field);
    }

    private static int firstDifferingByteIndexNativeEndian(long left, long right) {
        return (f34215y ? Long.numberOfLeadingZeros(left ^ right) : Long.numberOfTrailingZeros(left ^ right)) >> 3;
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
        return (byte) ((m10247A(target, (-4) & offset) >>> ((int) (((~offset) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object target, long offset) {
        return (byte) ((m10247A(target, (-4) & offset) >>> ((int) ((offset & 3) << 3))) & 255);
    }

    private static AbstractC5486e getMemoryAccessor() {
        Unsafe unsafe = f34191a;
        if (unsafe == null) {
            return null;
        }
        if (!C9958no.m18046b()) {
            return new C5485d(unsafe);
        }
        if (f34193c) {
            return new C5484c(unsafe);
        }
        if (f34194d) {
            return new C5483b(unsafe);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static long m10288k(ByteBuffer buffer) {
        return f34195e.getLong(buffer, f34211u);
    }

    /* JADX INFO: renamed from: l */
    public static <T> T m10289l(Class<T> cls) {
        try {
            return (T) f34191a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable e) {
        Logger.getLogger(evh.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + e);
    }

    /* JADX INFO: renamed from: m */
    public static void m10290m(long srcOffset, byte[] target, long targetIndex, long length) {
        f34195e.copyMemory(srcOffset, target, targetIndex, length);
    }

    /* JADX INFO: renamed from: n */
    public static void m10291n(byte[] src, long srcIndex, long targetOffset, long length) {
        f34195e.copyMemory(src, srcIndex, targetOffset, length);
    }

    /* JADX INFO: renamed from: o */
    public static void m10292o(byte[] src, long srcIndex, byte[] target, long targetIndex, long length) {
        System.arraycopy(src, (int) srcIndex, target, (int) targetIndex, (int) length);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m10293p(Class<?> addressClass) {
        if (!C9958no.m18046b()) {
            return false;
        }
        try {
            Class<?> cls = f34192b;
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
        int iM10247A = m10247A(target, j);
        int i = ((~((int) offset)) & 3) << 3;
        m10271Y(target, j, ((255 & value) << i) | (iM10247A & (~(255 << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object target, long offset, byte value) {
        long j = (-4) & offset;
        int i = (((int) offset) & 3) << 3;
        m10271Y(target, j, ((255 & value) << i) | (m10247A(target, j) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m10294q(Object target, long offset) {
        return f34195e.getBoolean(target, offset);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m10295r(boolean[] target, long index) {
        return f34195e.getBoolean(target, f34199i + (index * f34200j));
    }

    /* JADX INFO: renamed from: s */
    public static byte m10296s(long address) {
        return f34195e.getByte(address);
    }

    private static boolean supportsUnsafeArrayOperations() {
        AbstractC5486e abstractC5486e = f34195e;
        if (abstractC5486e == null) {
            return false;
        }
        return abstractC5486e.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        AbstractC5486e abstractC5486e = f34195e;
        if (abstractC5486e == null) {
            return false;
        }
        return abstractC5486e.supportsUnsafeByteBufferOperations();
    }

    /* JADX INFO: renamed from: t */
    public static byte m10297t(Object target, long offset) {
        return f34195e.getByte(target, offset);
    }

    /* JADX INFO: renamed from: u */
    public static byte m10298u(byte[] target, long index) {
        return f34195e.getByte(target, f34198h + index);
    }

    /* JADX INFO: renamed from: v */
    public static double m10299v(Object target, long offset) {
        return f34195e.getDouble(target, offset);
    }

    /* JADX INFO: renamed from: w */
    public static double m10300w(double[] target, long index) {
        return f34195e.getDouble(target, f34207q + (index * f34208r));
    }

    /* JADX INFO: renamed from: x */
    public static float m10301x(Object target, long offset) {
        return f34195e.getFloat(target, offset);
    }

    /* JADX INFO: renamed from: y */
    public static float m10302y(float[] target, long index) {
        return f34195e.getFloat(target, f34205o + (index * f34206p));
    }

    /* JADX INFO: renamed from: z */
    public static int m10303z(long address) {
        return f34195e.getInt(address);
    }
}
