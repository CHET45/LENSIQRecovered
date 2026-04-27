package p000;

import android.os.SystemClock;
import java.util.List;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
public final class nyc {

    /* JADX INFO: renamed from: u */
    public static final una.C13612b f66056u = new una.C13612b(new Object());

    /* JADX INFO: renamed from: a */
    public final q1h f66057a;

    /* JADX INFO: renamed from: b */
    public final una.C13612b f66058b;

    /* JADX INFO: renamed from: c */
    public final long f66059c;

    /* JADX INFO: renamed from: d */
    public final long f66060d;

    /* JADX INFO: renamed from: e */
    public final int f66061e;

    /* JADX INFO: renamed from: f */
    @hib
    public final aa5 f66062f;

    /* JADX INFO: renamed from: g */
    public final boolean f66063g;

    /* JADX INFO: renamed from: h */
    public final n6h f66064h;

    /* JADX INFO: renamed from: i */
    public final r7h f66065i;

    /* JADX INFO: renamed from: j */
    public final List<eta> f66066j;

    /* JADX INFO: renamed from: k */
    public final una.C13612b f66067k;

    /* JADX INFO: renamed from: l */
    public final boolean f66068l;

    /* JADX INFO: renamed from: m */
    public final int f66069m;

    /* JADX INFO: renamed from: n */
    public final int f66070n;

    /* JADX INFO: renamed from: o */
    public final ryc f66071o;

    /* JADX INFO: renamed from: p */
    public final boolean f66072p;

    /* JADX INFO: renamed from: q */
    public volatile long f66073q;

    /* JADX INFO: renamed from: r */
    public volatile long f66074r;

    /* JADX INFO: renamed from: s */
    public volatile long f66075s;

    /* JADX INFO: renamed from: t */
    public volatile long f66076t;

    public nyc(q1h q1hVar, una.C13612b c13612b, long j, long j2, int i, @hib aa5 aa5Var, boolean z, n6h n6hVar, r7h r7hVar, List<eta> list, una.C13612b c13612b2, boolean z2, int i2, int i3, ryc rycVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.f66057a = q1hVar;
        this.f66058b = c13612b;
        this.f66059c = j;
        this.f66060d = j2;
        this.f66061e = i;
        this.f66062f = aa5Var;
        this.f66063g = z;
        this.f66064h = n6hVar;
        this.f66065i = r7hVar;
        this.f66066j = list;
        this.f66067k = c13612b2;
        this.f66068l = z2;
        this.f66069m = i2;
        this.f66070n = i3;
        this.f66071o = rycVar;
        this.f66073q = j3;
        this.f66074r = j4;
        this.f66075s = j5;
        this.f66076t = j6;
        this.f66072p = z3;
    }

    public static nyc createDummy(r7h r7hVar) {
        q1h q1hVar = q1h.f72935a;
        una.C13612b c13612b = f66056u;
        return new nyc(q1hVar, c13612b, -9223372036854775807L, 0L, 1, null, false, n6h.f63416e, r7hVar, kx7.m15110of(), c13612b, false, 1, 0, ryc.f80104d, 0L, 0L, 0L, 0L, false);
    }

    public static una.C13612b getDummyPeriodForEmptyTimeline() {
        return f66056u;
    }

    @yx1
    public nyc copyWithEstimatedPosition() {
        return new nyc(this.f66057a, this.f66058b, this.f66059c, this.f66060d, this.f66061e, this.f66062f, this.f66063g, this.f66064h, this.f66065i, this.f66066j, this.f66067k, this.f66068l, this.f66069m, this.f66070n, this.f66071o, this.f66073q, this.f66074r, getEstimatedPositionUs(), SystemClock.elapsedRealtime(), this.f66072p);
    }

    @yx1
    public nyc copyWithIsLoading(boolean z) {
        return new nyc(this.f66057a, this.f66058b, this.f66059c, this.f66060d, this.f66061e, this.f66062f, z, this.f66064h, this.f66065i, this.f66066j, this.f66067k, this.f66068l, this.f66069m, this.f66070n, this.f66071o, this.f66073q, this.f66074r, this.f66075s, this.f66076t, this.f66072p);
    }

    @yx1
    public nyc copyWithLoadingMediaPeriodId(una.C13612b c13612b) {
        return new nyc(this.f66057a, this.f66058b, this.f66059c, this.f66060d, this.f66061e, this.f66062f, this.f66063g, this.f66064h, this.f66065i, this.f66066j, c13612b, this.f66068l, this.f66069m, this.f66070n, this.f66071o, this.f66073q, this.f66074r, this.f66075s, this.f66076t, this.f66072p);
    }

    @yx1
    public nyc copyWithNewPosition(una.C13612b c13612b, long j, long j2, long j3, long j4, n6h n6hVar, r7h r7hVar, List<eta> list) {
        return new nyc(this.f66057a, c13612b, j2, j3, this.f66061e, this.f66062f, this.f66063g, n6hVar, r7hVar, list, this.f66067k, this.f66068l, this.f66069m, this.f66070n, this.f66071o, this.f66073q, j4, j, SystemClock.elapsedRealtime(), this.f66072p);
    }

    @yx1
    public nyc copyWithPlayWhenReady(boolean z, int i, int i2) {
        return new nyc(this.f66057a, this.f66058b, this.f66059c, this.f66060d, this.f66061e, this.f66062f, this.f66063g, this.f66064h, this.f66065i, this.f66066j, this.f66067k, z, i, i2, this.f66071o, this.f66073q, this.f66074r, this.f66075s, this.f66076t, this.f66072p);
    }

    @yx1
    public nyc copyWithPlaybackError(@hib aa5 aa5Var) {
        return new nyc(this.f66057a, this.f66058b, this.f66059c, this.f66060d, this.f66061e, aa5Var, this.f66063g, this.f66064h, this.f66065i, this.f66066j, this.f66067k, this.f66068l, this.f66069m, this.f66070n, this.f66071o, this.f66073q, this.f66074r, this.f66075s, this.f66076t, this.f66072p);
    }

    @yx1
    public nyc copyWithPlaybackParameters(ryc rycVar) {
        return new nyc(this.f66057a, this.f66058b, this.f66059c, this.f66060d, this.f66061e, this.f66062f, this.f66063g, this.f66064h, this.f66065i, this.f66066j, this.f66067k, this.f66068l, this.f66069m, this.f66070n, rycVar, this.f66073q, this.f66074r, this.f66075s, this.f66076t, this.f66072p);
    }

    @yx1
    public nyc copyWithPlaybackState(int i) {
        return new nyc(this.f66057a, this.f66058b, this.f66059c, this.f66060d, i, this.f66062f, this.f66063g, this.f66064h, this.f66065i, this.f66066j, this.f66067k, this.f66068l, this.f66069m, this.f66070n, this.f66071o, this.f66073q, this.f66074r, this.f66075s, this.f66076t, this.f66072p);
    }

    @yx1
    public nyc copyWithSleepingForOffload(boolean z) {
        return new nyc(this.f66057a, this.f66058b, this.f66059c, this.f66060d, this.f66061e, this.f66062f, this.f66063g, this.f66064h, this.f66065i, this.f66066j, this.f66067k, this.f66068l, this.f66069m, this.f66070n, this.f66071o, this.f66073q, this.f66074r, this.f66075s, this.f66076t, z);
    }

    @yx1
    public nyc copyWithTimeline(q1h q1hVar) {
        return new nyc(q1hVar, this.f66058b, this.f66059c, this.f66060d, this.f66061e, this.f66062f, this.f66063g, this.f66064h, this.f66065i, this.f66066j, this.f66067k, this.f66068l, this.f66069m, this.f66070n, this.f66071o, this.f66073q, this.f66074r, this.f66075s, this.f66076t, this.f66072p);
    }

    public long getEstimatedPositionUs() {
        long j;
        long j2;
        if (!isPlaying()) {
            return this.f66075s;
        }
        do {
            j = this.f66076t;
            j2 = this.f66075s;
        } while (j != this.f66076t);
        return t0i.msToUs(t0i.usToMs(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.f66071o.f80107a)));
    }

    public boolean isPlaying() {
        return this.f66061e == 3 && this.f66068l && this.f66070n == 0;
    }

    public void updatePositionUs(long j) {
        this.f66075s = j;
        this.f66076t = SystemClock.elapsedRealtime();
    }
}
