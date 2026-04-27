package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class g41 implements Runnable {

    /* JADX INFO: renamed from: F */
    @fdi
    public static final String f38408F = "PreFillRunner";

    /* JADX INFO: renamed from: L */
    public static final long f38410L = 32;

    /* JADX INFO: renamed from: M */
    public static final long f38411M = 40;

    /* JADX INFO: renamed from: N */
    public static final int f38412N = 4;

    /* JADX INFO: renamed from: C */
    public boolean f38414C;

    /* JADX INFO: renamed from: a */
    public final e41 f38415a;

    /* JADX INFO: renamed from: b */
    public final gqa f38416b;

    /* JADX INFO: renamed from: c */
    public final o6d f38417c;

    /* JADX INFO: renamed from: d */
    public final C6116a f38418d;

    /* JADX INFO: renamed from: e */
    public final Set<p6d> f38419e;

    /* JADX INFO: renamed from: f */
    public final Handler f38420f;

    /* JADX INFO: renamed from: m */
    public long f38421m;

    /* JADX INFO: renamed from: H */
    public static final C6116a f38409H = new C6116a();

    /* JADX INFO: renamed from: Q */
    public static final long f38413Q = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: g41$a */
    @fdi
    public static class C6116a {
        /* JADX INFO: renamed from: a */
        public long m11349a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* JADX INFO: renamed from: g41$b */
    public static final class C6117b implements eq8 {
        @Override // p000.eq8
        public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public g41(e41 e41Var, gqa gqaVar, o6d o6dVar) {
        this(e41Var, gqaVar, o6dVar, f38409H, new Handler(Looper.getMainLooper()));
    }

    private long getFreeMemoryCacheBytes() {
        return this.f38416b.getMaxSize() - this.f38416b.getCurrentSize();
    }

    private long getNextDelay() {
        long j = this.f38421m;
        this.f38421m = Math.min(4 * j, f38413Q);
        return j;
    }

    private boolean isGcDetected(long j) {
        return this.f38418d.m11349a() - j >= 32;
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public boolean m11348a() {
        Bitmap bitmapCreateBitmap;
        long jM11349a = this.f38418d.m11349a();
        while (!this.f38417c.isEmpty() && !isGcDetected(jM11349a)) {
            p6d p6dVarRemove = this.f38417c.remove();
            if (this.f38419e.contains(p6dVarRemove)) {
                bitmapCreateBitmap = Bitmap.createBitmap(p6dVarRemove.m19283d(), p6dVarRemove.m19281b(), p6dVarRemove.m19280a());
            } else {
                this.f38419e.add(p6dVarRemove);
                bitmapCreateBitmap = this.f38415a.getDirty(p6dVarRemove.m19283d(), p6dVarRemove.m19281b(), p6dVarRemove.m19280a());
            }
            int bitmapByteSize = v0i.getBitmapByteSize(bitmapCreateBitmap);
            if (getFreeMemoryCacheBytes() >= bitmapByteSize) {
                this.f38416b.put(new C6117b(), i41.obtain(bitmapCreateBitmap, this.f38415a));
            } else {
                this.f38415a.put(bitmapCreateBitmap);
            }
            if (Log.isLoggable(f38408F, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("allocated [");
                sb.append(p6dVarRemove.m19283d());
                sb.append("x");
                sb.append(p6dVarRemove.m19281b());
                sb.append("] ");
                sb.append(p6dVarRemove.m19280a());
                sb.append(" size: ");
                sb.append(bitmapByteSize);
            }
        }
        return (this.f38414C || this.f38417c.isEmpty()) ? false : true;
    }

    public void cancel() {
        this.f38414C = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (m11348a()) {
            this.f38420f.postDelayed(this, getNextDelay());
        }
    }

    @fdi
    public g41(e41 e41Var, gqa gqaVar, o6d o6dVar, C6116a c6116a, Handler handler) {
        this.f38419e = new HashSet();
        this.f38421m = 40L;
        this.f38415a = e41Var;
        this.f38416b = gqaVar;
        this.f38417c = o6dVar;
        this.f38418d = c6116a;
        this.f38420f = handler;
    }
}
