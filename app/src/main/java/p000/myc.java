package p000;

import android.os.SystemClock;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class myc {

    /* JADX INFO: renamed from: t */
    public static final vna.C14175b f62797t = new vna.C14175b(new Object());

    /* JADX INFO: renamed from: a */
    public final t1h f62798a;

    /* JADX INFO: renamed from: b */
    public final vna.C14175b f62799b;

    /* JADX INFO: renamed from: c */
    public final long f62800c;

    /* JADX INFO: renamed from: d */
    public final long f62801d;

    /* JADX INFO: renamed from: e */
    public final int f62802e;

    /* JADX INFO: renamed from: f */
    @hib
    public final ba5 f62803f;

    /* JADX INFO: renamed from: g */
    public final boolean f62804g;

    /* JADX INFO: renamed from: h */
    public final m6h f62805h;

    /* JADX INFO: renamed from: i */
    public final q7h f62806i;

    /* JADX INFO: renamed from: j */
    public final List<Metadata> f62807j;

    /* JADX INFO: renamed from: k */
    public final vna.C14175b f62808k;

    /* JADX INFO: renamed from: l */
    public final boolean f62809l;

    /* JADX INFO: renamed from: m */
    public final int f62810m;

    /* JADX INFO: renamed from: n */
    public final qyc f62811n;

    /* JADX INFO: renamed from: o */
    public final boolean f62812o;

    /* JADX INFO: renamed from: p */
    public volatile long f62813p;

    /* JADX INFO: renamed from: q */
    public volatile long f62814q;

    /* JADX INFO: renamed from: r */
    public volatile long f62815r;

    /* JADX INFO: renamed from: s */
    public volatile long f62816s;

    public myc(t1h t1hVar, vna.C14175b c14175b, long j, long j2, int i, @hib ba5 ba5Var, boolean z, m6h m6hVar, q7h q7hVar, List<Metadata> list, vna.C14175b c14175b2, boolean z2, int i2, qyc qycVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.f62798a = t1hVar;
        this.f62799b = c14175b;
        this.f62800c = j;
        this.f62801d = j2;
        this.f62802e = i;
        this.f62803f = ba5Var;
        this.f62804g = z;
        this.f62805h = m6hVar;
        this.f62806i = q7hVar;
        this.f62807j = list;
        this.f62808k = c14175b2;
        this.f62809l = z2;
        this.f62810m = i2;
        this.f62811n = qycVar;
        this.f62813p = j3;
        this.f62814q = j4;
        this.f62815r = j5;
        this.f62816s = j6;
        this.f62812o = z3;
    }

    public static myc createDummy(q7h q7hVar) {
        t1h t1hVar = t1h.f83385a;
        vna.C14175b c14175b = f62797t;
        return new myc(t1hVar, c14175b, -9223372036854775807L, 0L, 1, null, false, m6h.f60031e, q7hVar, kx7.m15110of(), c14175b, false, 0, qyc.f76311d, 0L, 0L, 0L, 0L, false);
    }

    public static vna.C14175b getDummyPeriodForEmptyTimeline() {
        return f62797t;
    }

    @yx1
    public myc copyWithEstimatedPosition() {
        return new myc(this.f62798a, this.f62799b, this.f62800c, this.f62801d, this.f62802e, this.f62803f, this.f62804g, this.f62805h, this.f62806i, this.f62807j, this.f62808k, this.f62809l, this.f62810m, this.f62811n, this.f62813p, this.f62814q, getEstimatedPositionUs(), SystemClock.elapsedRealtime(), this.f62812o);
    }

    @yx1
    public myc copyWithIsLoading(boolean z) {
        return new myc(this.f62798a, this.f62799b, this.f62800c, this.f62801d, this.f62802e, this.f62803f, z, this.f62805h, this.f62806i, this.f62807j, this.f62808k, this.f62809l, this.f62810m, this.f62811n, this.f62813p, this.f62814q, this.f62815r, this.f62816s, this.f62812o);
    }

    @yx1
    public myc copyWithLoadingMediaPeriodId(vna.C14175b c14175b) {
        return new myc(this.f62798a, this.f62799b, this.f62800c, this.f62801d, this.f62802e, this.f62803f, this.f62804g, this.f62805h, this.f62806i, this.f62807j, c14175b, this.f62809l, this.f62810m, this.f62811n, this.f62813p, this.f62814q, this.f62815r, this.f62816s, this.f62812o);
    }

    @yx1
    public myc copyWithNewPosition(vna.C14175b c14175b, long j, long j2, long j3, long j4, m6h m6hVar, q7h q7hVar, List<Metadata> list) {
        return new myc(this.f62798a, c14175b, j2, j3, this.f62802e, this.f62803f, this.f62804g, m6hVar, q7hVar, list, this.f62808k, this.f62809l, this.f62810m, this.f62811n, this.f62813p, j4, j, SystemClock.elapsedRealtime(), this.f62812o);
    }

    @yx1
    public myc copyWithPlayWhenReady(boolean z, int i) {
        return new myc(this.f62798a, this.f62799b, this.f62800c, this.f62801d, this.f62802e, this.f62803f, this.f62804g, this.f62805h, this.f62806i, this.f62807j, this.f62808k, z, i, this.f62811n, this.f62813p, this.f62814q, this.f62815r, this.f62816s, this.f62812o);
    }

    @yx1
    public myc copyWithPlaybackError(@hib ba5 ba5Var) {
        return new myc(this.f62798a, this.f62799b, this.f62800c, this.f62801d, this.f62802e, ba5Var, this.f62804g, this.f62805h, this.f62806i, this.f62807j, this.f62808k, this.f62809l, this.f62810m, this.f62811n, this.f62813p, this.f62814q, this.f62815r, this.f62816s, this.f62812o);
    }

    @yx1
    public myc copyWithPlaybackParameters(qyc qycVar) {
        return new myc(this.f62798a, this.f62799b, this.f62800c, this.f62801d, this.f62802e, this.f62803f, this.f62804g, this.f62805h, this.f62806i, this.f62807j, this.f62808k, this.f62809l, this.f62810m, qycVar, this.f62813p, this.f62814q, this.f62815r, this.f62816s, this.f62812o);
    }

    @yx1
    public myc copyWithPlaybackState(int i) {
        return new myc(this.f62798a, this.f62799b, this.f62800c, this.f62801d, i, this.f62803f, this.f62804g, this.f62805h, this.f62806i, this.f62807j, this.f62808k, this.f62809l, this.f62810m, this.f62811n, this.f62813p, this.f62814q, this.f62815r, this.f62816s, this.f62812o);
    }

    @yx1
    public myc copyWithSleepingForOffload(boolean z) {
        return new myc(this.f62798a, this.f62799b, this.f62800c, this.f62801d, this.f62802e, this.f62803f, this.f62804g, this.f62805h, this.f62806i, this.f62807j, this.f62808k, this.f62809l, this.f62810m, this.f62811n, this.f62813p, this.f62814q, this.f62815r, this.f62816s, z);
    }

    @yx1
    public myc copyWithTimeline(t1h t1hVar) {
        return new myc(t1hVar, this.f62799b, this.f62800c, this.f62801d, this.f62802e, this.f62803f, this.f62804g, this.f62805h, this.f62806i, this.f62807j, this.f62808k, this.f62809l, this.f62810m, this.f62811n, this.f62813p, this.f62814q, this.f62815r, this.f62816s, this.f62812o);
    }

    public long getEstimatedPositionUs() {
        long j;
        long j2;
        if (!isPlaying()) {
            return this.f62815r;
        }
        do {
            j = this.f62816s;
            j2 = this.f62815r;
        } while (j != this.f62816s);
        return x0i.msToUs(x0i.usToMs(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.f62811n.f76315a)));
    }

    public boolean isPlaying() {
        return this.f62802e == 3 && this.f62809l && this.f62810m == 0;
    }

    public void updatePositionUs(long j) {
        this.f62815r = j;
        this.f62816s = SystemClock.elapsedRealtime();
    }
}
