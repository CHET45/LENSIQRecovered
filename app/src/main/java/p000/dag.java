package p000;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@jd7
public abstract class dag extends Number {

    /* JADX INFO: renamed from: C */
    public static final long f29113C;

    /* JADX INFO: renamed from: F */
    public static final long f29114F;

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<int[]> f29115d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e */
    public static final Random f29116e = new Random();

    /* JADX INFO: renamed from: f */
    public static final int f29117f = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: m */
    public static final Unsafe f29118m;

    /* JADX INFO: renamed from: a */
    @wx1
    public volatile transient C4712b[] f29119a;

    /* JADX INFO: renamed from: b */
    public volatile transient long f29120b;

    /* JADX INFO: renamed from: c */
    public volatile transient int f29121c;

    /* JADX INFO: renamed from: dag$a */
    public class C4711a implements PrivilegedExceptionAction<Unsafe> {
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

    /* JADX INFO: renamed from: dag$b */
    public static final class C4712b {

        /* JADX INFO: renamed from: p */
        public static final Unsafe f29122p;

        /* JADX INFO: renamed from: q */
        public static final long f29123q;

        /* JADX INFO: renamed from: a */
        public volatile long f29124a;

        /* JADX INFO: renamed from: b */
        public volatile long f29125b;

        /* JADX INFO: renamed from: c */
        public volatile long f29126c;

        /* JADX INFO: renamed from: d */
        public volatile long f29127d;

        /* JADX INFO: renamed from: e */
        public volatile long f29128e;

        /* JADX INFO: renamed from: f */
        public volatile long f29129f;

        /* JADX INFO: renamed from: g */
        public volatile long f29130g;

        /* JADX INFO: renamed from: h */
        public volatile long f29131h;

        /* JADX INFO: renamed from: i */
        public volatile long f29132i;

        /* JADX INFO: renamed from: j */
        public volatile long f29133j;

        /* JADX INFO: renamed from: k */
        public volatile long f29134k;

        /* JADX INFO: renamed from: l */
        public volatile long f29135l;

        /* JADX INFO: renamed from: m */
        public volatile long f29136m;

        /* JADX INFO: renamed from: n */
        public volatile long f29137n;

        /* JADX INFO: renamed from: o */
        public volatile long f29138o;

        static {
            try {
                Unsafe unsafe = dag.getUnsafe();
                f29122p = unsafe;
                f29123q = unsafe.objectFieldOffset(C4712b.class.getDeclaredField("h"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public C4712b(long x) {
            this.f29131h = x;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m9040a(long cmp, long val) {
            return f29122p.compareAndSwapLong(this, f29123q, cmp, val);
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            f29118m = unsafe;
            f29113C = unsafe.objectFieldOffset(dag.class.getDeclaredField("b"));
            f29114F = unsafe.objectFieldOffset(dag.class.getDeclaredField("c"));
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
                return (Unsafe) AccessController.doPrivileged(new C4711a());
            }
        } catch (PrivilegedActionException e) {
            throw new RuntimeException("Could not initialize intrinsics", e.getCause());
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9035b(long cmp, long val) {
        return f29118m.compareAndSwapLong(this, f29113C, cmp, val);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9036c() {
        return f29118m.compareAndSwapInt(this, f29114F, 0, 1);
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo9037d(long currentValue, long newValue);

    /* JADX INFO: renamed from: e */
    public final void m9038e(long initialValue) {
        C4712b[] c4712bArr = this.f29119a;
        this.f29120b = initialValue;
        if (c4712bArr != null) {
            for (C4712b c4712b : c4712bArr) {
                if (c4712b != null) {
                    c4712b.f29131h = initialValue;
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
    public final void m9039f(long r17, @p000.wx1 int[] r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dag.m9039f(long, int[], boolean):void");
    }
}
