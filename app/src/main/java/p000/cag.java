package p000;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@jd7
public abstract class cag extends Number {

    /* JADX INFO: renamed from: C */
    public static final long f16118C;

    /* JADX INFO: renamed from: F */
    public static final long f16119F;

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<int[]> f16120d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e */
    public static final Random f16121e = new Random();

    /* JADX INFO: renamed from: f */
    public static final int f16122f = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: m */
    public static final Unsafe f16123m;

    /* JADX INFO: renamed from: a */
    @wx1
    public volatile transient C2256b[] f16124a;

    /* JADX INFO: renamed from: b */
    public volatile transient long f16125b;

    /* JADX INFO: renamed from: c */
    public volatile transient int f16126c;

    /* JADX INFO: renamed from: cag$a */
    public class C2255a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* JADX INFO: renamed from: cag$b */
    public static final class C2256b {

        /* JADX INFO: renamed from: p */
        public static final Unsafe f16127p;

        /* JADX INFO: renamed from: q */
        public static final long f16128q;

        /* JADX INFO: renamed from: a */
        public volatile long f16129a;

        /* JADX INFO: renamed from: b */
        public volatile long f16130b;

        /* JADX INFO: renamed from: c */
        public volatile long f16131c;

        /* JADX INFO: renamed from: d */
        public volatile long f16132d;

        /* JADX INFO: renamed from: e */
        public volatile long f16133e;

        /* JADX INFO: renamed from: f */
        public volatile long f16134f;

        /* JADX INFO: renamed from: g */
        public volatile long f16135g;

        /* JADX INFO: renamed from: h */
        public volatile long f16136h;

        /* JADX INFO: renamed from: i */
        public volatile long f16137i;

        /* JADX INFO: renamed from: j */
        public volatile long f16138j;

        /* JADX INFO: renamed from: k */
        public volatile long f16139k;

        /* JADX INFO: renamed from: l */
        public volatile long f16140l;

        /* JADX INFO: renamed from: m */
        public volatile long f16141m;

        /* JADX INFO: renamed from: n */
        public volatile long f16142n;

        /* JADX INFO: renamed from: o */
        public volatile long f16143o;

        static {
            try {
                Unsafe unsafe = cag.getUnsafe();
                f16127p = unsafe;
                f16128q = unsafe.objectFieldOffset(C2256b.class.getDeclaredField("h"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public C2256b(long x) {
            this.f16136h = x;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m3882a(long cmp, long val) {
            return f16127p.compareAndSwapLong(this, f16128q, cmp, val);
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            f16123m = unsafe;
            f16118C = unsafe.objectFieldOffset(cag.class.getDeclaredField("b"));
            f16119F = unsafe.objectFieldOffset(cag.class.getDeclaredField("c"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new C2255a());
            }
        } catch (PrivilegedActionException e) {
            throw new RuntimeException("Could not initialize intrinsics", e.getCause());
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3877b(long cmp, long val) {
        return f16123m.compareAndSwapLong(this, f16118C, cmp, val);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3878c() {
        return f16123m.compareAndSwapInt(this, f16119F, 0, 1);
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo3879d(long currentValue, long newValue);

    /* JADX INFO: renamed from: e */
    public final void m3880e(long initialValue) {
        C2256b[] c2256bArr = this.f16124a;
        this.f16125b = initialValue;
        if (c2256bArr != null) {
            for (C2256b c2256b : c2256bArr) {
                if (c2256b != null) {
                    c2256b.f16136h = initialValue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3881f(long r17, @p000.wx1 int[] r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cag.m3881f(long, int[], boolean):void");
    }
}
