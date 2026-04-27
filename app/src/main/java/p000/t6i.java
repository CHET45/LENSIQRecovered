package p000;

import android.content.Context;
import android.view.Surface;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class t6i {

    /* JADX INFO: renamed from: p */
    public static final int f83881p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f83882q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f83883r = 2;

    /* JADX INFO: renamed from: s */
    public static final int f83884s = 3;

    /* JADX INFO: renamed from: t */
    public static final int f83885t = 4;

    /* JADX INFO: renamed from: u */
    public static final int f83886u = 5;

    /* JADX INFO: renamed from: v */
    public static final long f83887v = 50000;

    /* JADX INFO: renamed from: a */
    public final InterfaceC12941c f83888a;

    /* JADX INFO: renamed from: b */
    public final x6i f83889b;

    /* JADX INFO: renamed from: c */
    public final long f83890c;

    /* JADX INFO: renamed from: d */
    public boolean f83891d;

    /* JADX INFO: renamed from: g */
    public long f83894g;

    /* JADX INFO: renamed from: j */
    public boolean f83897j;

    /* JADX INFO: renamed from: m */
    public boolean f83900m;

    /* JADX INFO: renamed from: n */
    public boolean f83901n;

    /* JADX INFO: renamed from: o */
    public boolean f83902o;

    /* JADX INFO: renamed from: e */
    public int f83892e = 0;

    /* JADX INFO: renamed from: f */
    public long f83893f = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f83895h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f83896i = -9223372036854775807L;

    /* JADX INFO: renamed from: k */
    public float f83898k = 1.0f;

    /* JADX INFO: renamed from: l */
    public j52 f83899l = j52.f49539a;

    /* JADX INFO: renamed from: t6i$a */
    @Target({ElementType.TYPE_USE})
    @ovh
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12939a {
    }

    /* JADX INFO: renamed from: t6i$b */
    public static class C12940b {

        /* JADX INFO: renamed from: a */
        public long f83903a = -9223372036854775807L;

        /* JADX INFO: renamed from: b */
        public long f83904b = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.f83903a = -9223372036854775807L;
            this.f83904b = -9223372036854775807L;
        }

        public long getEarlyUs() {
            return this.f83903a;
        }

        public long getReleaseTimeNs() {
            return this.f83904b;
        }
    }

    /* JADX INFO: renamed from: t6i$c */
    public interface InterfaceC12941c {
        boolean shouldDropFrame(long j, long j2, boolean z);

        boolean shouldForceReleaseFrame(long j, long j2);

        boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2) throws aa5;
    }

    public t6i(Context context, InterfaceC12941c interfaceC12941c, long j) {
        this.f83888a = interfaceC12941c;
        this.f83890c = j;
        this.f83889b = new x6i(context);
    }

    private long calculateEarlyTimeUs(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / ((double) this.f83898k));
        return this.f83891d ? j4 - (t0i.msToUs(this.f83899l.elapsedRealtime()) - j2) : j4;
    }

    private void lowerFirstFrameState(int i) {
        this.f83892e = Math.min(this.f83892e, i);
    }

    private boolean shouldForceRelease(long j, long j2, long j3) {
        if (this.f83896i != -9223372036854775807L && !this.f83897j) {
            return false;
        }
        int i = this.f83892e;
        if (i == 0) {
            return this.f83891d;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j >= j3;
        }
        if (i != 3) {
            throw new IllegalStateException();
        }
        long jMsToUs = t0i.msToUs(this.f83899l.elapsedRealtime()) - this.f83894g;
        if (!this.f83891d) {
            return false;
        }
        if (!this.f83902o) {
            long j4 = this.f83893f;
            if (j4 == -9223372036854775807L || j4 == j) {
                return false;
            }
        }
        return this.f83888a.shouldForceReleaseFrame(j2, jMsToUs);
    }

    /* JADX INFO: renamed from: a */
    public void m22408a() {
        this.f83902o = true;
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.f83892e == 0) {
            this.f83892e = 1;
        }
    }

    public int getFrameReleaseAction(long j, long j2, long j3, long j4, boolean z, boolean z2, C12940b c12940b) throws aa5 {
        c12940b.reset();
        if (this.f83891d && this.f83893f == -9223372036854775807L) {
            this.f83893f = j2;
        }
        if (this.f83895h != j) {
            this.f83889b.onNextFrame(j);
            this.f83895h = j;
        }
        c12940b.f83903a = calculateEarlyTimeUs(j2, j3, j);
        if (z && !z2) {
            return 3;
        }
        if (!this.f83900m) {
            this.f83901n = true;
            if (this.f83888a.shouldIgnoreFrame(c12940b.f83903a, j2, j3, z2, true)) {
                return 4;
            }
            return (!this.f83891d || c12940b.f83903a >= 30000) ? 5 : 3;
        }
        if (shouldForceRelease(j2, c12940b.f83903a, j4)) {
            return 0;
        }
        if (!this.f83891d || j2 == this.f83893f) {
            return 5;
        }
        long jNanoTime = this.f83899l.nanoTime();
        c12940b.f83904b = this.f83889b.adjustReleaseTime((c12940b.f83903a * 1000) + jNanoTime);
        c12940b.f83903a = (c12940b.f83904b - jNanoTime) / 1000;
        boolean z3 = (this.f83896i == -9223372036854775807L || this.f83897j) ? false : true;
        if (this.f83888a.shouldIgnoreFrame(c12940b.f83903a, j2, j3, z2, z3)) {
            return 4;
        }
        return this.f83888a.shouldDropFrame(c12940b.f83903a, j3, z2) ? z3 ? 3 : 2 : c12940b.f83903a > 50000 ? 5 : 1;
    }

    public boolean isReady(boolean z) {
        if (z && (this.f83892e == 3 || (!this.f83900m && this.f83901n))) {
            this.f83896i = -9223372036854775807L;
            return true;
        }
        if (this.f83896i == -9223372036854775807L) {
            return false;
        }
        if (this.f83899l.elapsedRealtime() < this.f83896i) {
            return true;
        }
        this.f83896i = -9223372036854775807L;
        return false;
    }

    public void join(boolean z) {
        this.f83897j = z;
        this.f83896i = this.f83890c > 0 ? this.f83899l.elapsedRealtime() + this.f83890c : -9223372036854775807L;
    }

    public boolean onFrameReleasedIsFirstFrame() {
        boolean z = this.f83892e != 3;
        this.f83892e = 3;
        this.f83894g = t0i.msToUs(this.f83899l.elapsedRealtime());
        return z;
    }

    public void onStarted() {
        this.f83891d = true;
        this.f83894g = t0i.msToUs(this.f83899l.elapsedRealtime());
        this.f83889b.onStarted();
    }

    public void onStopped() {
        this.f83891d = false;
        this.f83896i = -9223372036854775807L;
        this.f83889b.onStopped();
    }

    public void onStreamChanged(int i) {
        if (i == 0) {
            this.f83892e = 1;
        } else if (i == 1) {
            this.f83892e = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            lowerFirstFrameState(2);
        }
    }

    public void reset() {
        this.f83889b.onPositionReset();
        this.f83895h = -9223372036854775807L;
        this.f83893f = -9223372036854775807L;
        lowerFirstFrameState(1);
        this.f83896i = -9223372036854775807L;
    }

    public void setChangeFrameRateStrategy(int i) {
        this.f83889b.setChangeFrameRateStrategy(i);
    }

    public void setClock(j52 j52Var) {
        this.f83899l = j52Var;
    }

    public void setFrameRate(float f) {
        this.f83889b.onFormatChanged(f);
    }

    public void setOutputSurface(@hib Surface surface) {
        this.f83900m = surface != null;
        this.f83901n = false;
        this.f83889b.onSurfaceChanged(surface);
        lowerFirstFrameState(1);
    }

    public void setPlaybackSpeed(@y46(from = 0.0d, fromInclusive = false) float f) {
        v80.checkArgument(f > 0.0f);
        if (f == this.f83898k) {
            return;
        }
        this.f83898k = f;
        this.f83889b.onPlaybackSpeed(f);
    }
}
