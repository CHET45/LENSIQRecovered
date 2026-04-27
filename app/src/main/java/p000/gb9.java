package p000;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import p000.gb9;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
@xx4
public final class gb9 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6197c f39253a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f39254b = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gb9$b */
    public static abstract class EnumC6196b implements InterfaceC6197c {

        /* JADX INFO: renamed from: a */
        public static final EnumC6196b f39255a = new a("INSTANCE", 0);

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumC6196b[] f39256b = $values();

        /* JADX INFO: renamed from: gb9$b$a */
        public enum a extends EnumC6196b {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.gb9.InterfaceC6197c
            public long getLongLittleEndian(byte[] source, int offset) {
                return im9.fromBytes(source[offset + 7], source[offset + 6], source[offset + 5], source[offset + 4], source[offset + 3], source[offset + 2], source[offset + 1], source[offset]);
            }

            @Override // p000.gb9.InterfaceC6197c
            public void putLongLittleEndian(byte[] sink, int offset, long value) {
                long j = 255;
                for (int i = 0; i < 8; i++) {
                    sink[offset + i] = (byte) ((value & j) >> (i * 8));
                    j <<= 8;
                }
            }
        }

        private static /* synthetic */ EnumC6196b[] $values() {
            return new EnumC6196b[]{f39255a};
        }

        private EnumC6196b(String $enum$name, int $enum$ordinal) {
        }

        public static EnumC6196b valueOf(String name) {
            return (EnumC6196b) Enum.valueOf(EnumC6196b.class, name);
        }

        public static EnumC6196b[] values() {
            return (EnumC6196b[]) f39256b.clone();
        }
    }

    /* JADX INFO: renamed from: gb9$c */
    public interface InterfaceC6197c {
        long getLongLittleEndian(byte[] array, int offset);

        void putLongLittleEndian(byte[] array, int offset, long value);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gb9$d */
    public static abstract class EnumC6198d implements InterfaceC6197c {

        /* JADX INFO: renamed from: c */
        public static final Unsafe f39259c;

        /* JADX INFO: renamed from: d */
        public static final int f39260d;

        /* JADX INFO: renamed from: a */
        public static final EnumC6198d f39257a = new a("UNSAFE_LITTLE_ENDIAN", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC6198d f39258b = new b("UNSAFE_BIG_ENDIAN", 1);

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ EnumC6198d[] f39261e = $values();

        /* JADX INFO: renamed from: gb9$d$a */
        public enum a extends EnumC6198d {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.gb9.InterfaceC6197c
            public long getLongLittleEndian(byte[] array, int offset) {
                return EnumC6198d.f39259c.getLong(array, ((long) offset) + ((long) EnumC6198d.f39260d));
            }

            @Override // p000.gb9.InterfaceC6197c
            public void putLongLittleEndian(byte[] array, int offset, long value) {
                EnumC6198d.f39259c.putLong(array, ((long) offset) + ((long) EnumC6198d.f39260d), value);
            }
        }

        /* JADX INFO: renamed from: gb9$d$b */
        public enum b extends EnumC6198d {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // p000.gb9.InterfaceC6197c
            public long getLongLittleEndian(byte[] array, int offset) {
                return Long.reverseBytes(EnumC6198d.f39259c.getLong(array, ((long) offset) + ((long) EnumC6198d.f39260d)));
            }

            @Override // p000.gb9.InterfaceC6197c
            public void putLongLittleEndian(byte[] array, int offset, long value) {
                EnumC6198d.f39259c.putLong(array, ((long) offset) + ((long) EnumC6198d.f39260d), Long.reverseBytes(value));
            }
        }

        private static /* synthetic */ EnumC6198d[] $values() {
            return new EnumC6198d[]{f39257a, f39258b};
        }

        static {
            Unsafe unsafe = getUnsafe();
            f39259c = unsafe;
            f39260d = unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        private EnumC6198d(String $enum$name, int $enum$ordinal) {
        }

        private static Unsafe getUnsafe() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: hb9
                        @Override // java.security.PrivilegedExceptionAction
                        public final Object run() {
                            return gb9.EnumC6198d.lambda$getUnsafe$0();
                        }
                    });
                }
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unsafe lambda$getUnsafe$0() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public static EnumC6198d valueOf(String name) {
            return (EnumC6198d) Enum.valueOf(EnumC6198d.class, name);
        }

        public static EnumC6198d[] values() {
            return (EnumC6198d[]) f39261e.clone();
        }
    }

    static {
        InterfaceC6197c interfaceC6197c = EnumC6196b.f39255a;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                interfaceC6197c = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? EnumC6198d.f39257a : EnumC6198d.f39258b;
            }
        } catch (Throwable unused) {
        }
        f39253a = interfaceC6197c;
    }

    private gb9() {
    }

    /* JADX INFO: renamed from: a */
    public static int m11486a(byte[] source, int offset) {
        return ((source[offset + 3] & 255) << 24) | (source[offset] & 255) | ((source[offset + 1] & 255) << 8) | ((source[offset + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: b */
    public static long m11487b(byte[] input, int offset) {
        return f39253a.getLongLittleEndian(input, offset);
    }

    /* JADX INFO: renamed from: c */
    public static long m11488c(byte[] input, int offset, int length) {
        int iMin = Math.min(length, 8);
        long j = 0;
        for (int i = 0; i < iMin; i++) {
            j |= (((long) input[offset + i]) & 255) << (i * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    public static void m11489d(byte[] sink, int offset, long value) {
        f39253a.putLongLittleEndian(sink, offset, value);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11490e() {
        return f39253a instanceof EnumC6198d;
    }
}
