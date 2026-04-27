package p000;

import android.os.Handler;
import p000.up0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class lb2 implements rp0 {

    /* JADX INFO: renamed from: b */
    public final xp0 f57034b;

    /* JADX INFO: renamed from: c */
    public final int f57035c;

    /* JADX INFO: renamed from: d */
    public final long f57036d;

    /* JADX INFO: renamed from: e */
    public final up0.InterfaceC13636a.a f57037e;

    /* JADX INFO: renamed from: f */
    public final j52 f57038f;

    /* JADX INFO: renamed from: g */
    public int f57039g;

    /* JADX INFO: renamed from: h */
    public long f57040h;

    /* JADX INFO: renamed from: i */
    public long f57041i;

    /* JADX INFO: renamed from: j */
    public long f57042j;

    /* JADX INFO: renamed from: k */
    public long f57043k;

    /* JADX INFO: renamed from: l */
    public int f57044l;

    /* JADX INFO: renamed from: m */
    public long f57045m;

    /* JADX INFO: renamed from: lb2$b */
    public static class C8756b {

        /* JADX INFO: renamed from: b */
        public int f57047b;

        /* JADX INFO: renamed from: c */
        public long f57048c;

        /* JADX INFO: renamed from: a */
        public xp0 f57046a = new irf();

        /* JADX INFO: renamed from: d */
        public j52 f57049d = j52.f49539a;

        public lb2 build() {
            return new lb2(this);
        }

        @op1
        @fdi
        /* JADX INFO: renamed from: e */
        public C8756b m16074e(j52 j52Var) {
            this.f57049d = j52Var;
            return this;
        }

        @op1
        public C8756b setBandwidthStatistic(xp0 xp0Var) {
            v80.checkNotNull(xp0Var);
            this.f57046a = xp0Var;
            return this;
        }

        @op1
        public C8756b setMinBytesTransferred(long j) {
            v80.checkArgument(j >= 0);
            this.f57048c = j;
            return this;
        }

        @op1
        public C8756b setMinSamples(int i) {
            v80.checkArgument(i >= 0);
            this.f57047b = i;
            return this;
        }
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            if (i == 0 && j == 0 && j2 == this.f57043k) {
                return;
            }
            this.f57043k = j2;
            this.f57037e.bandwidthSample(i, j, j2);
        }
    }

    @Override // p000.rp0
    public void addEventListener(Handler handler, up0.InterfaceC13636a interfaceC13636a) {
        this.f57037e.addListener(handler, interfaceC13636a);
    }

    @Override // p000.rp0
    public long getBandwidthEstimate() {
        return this.f57042j;
    }

    @Override // p000.rp0
    public void onBytesTransferred(gh3 gh3Var, int i) {
        long j = i;
        this.f57041i += j;
        this.f57045m += j;
    }

    @Override // p000.rp0
    public void onNetworkTypeChange(long j) {
        long jElapsedRealtime = this.f57038f.elapsedRealtime();
        maybeNotifyBandwidthSample(this.f57039g > 0 ? (int) (jElapsedRealtime - this.f57040h) : 0, this.f57041i, j);
        this.f57034b.reset();
        this.f57042j = Long.MIN_VALUE;
        this.f57040h = jElapsedRealtime;
        this.f57041i = 0L;
        this.f57044l = 0;
        this.f57045m = 0L;
    }

    @Override // p000.rp0
    public void onTransferEnd(gh3 gh3Var) {
        v80.checkState(this.f57039g > 0);
        int i = this.f57039g - 1;
        this.f57039g = i;
        if (i > 0) {
            return;
        }
        long jElapsedRealtime = (int) (this.f57038f.elapsedRealtime() - this.f57040h);
        if (jElapsedRealtime > 0) {
            this.f57034b.addSample(this.f57041i, 1000 * jElapsedRealtime);
            int i2 = this.f57044l + 1;
            this.f57044l = i2;
            if (i2 > this.f57035c && this.f57045m > this.f57036d) {
                this.f57042j = this.f57034b.getBandwidthEstimate();
            }
            maybeNotifyBandwidthSample((int) jElapsedRealtime, this.f57041i, this.f57042j);
            this.f57041i = 0L;
        }
    }

    @Override // p000.rp0
    public void onTransferInitializing(gh3 gh3Var) {
    }

    @Override // p000.rp0
    public void onTransferStart(gh3 gh3Var) {
        if (this.f57039g == 0) {
            this.f57040h = this.f57038f.elapsedRealtime();
        }
        this.f57039g++;
    }

    @Override // p000.rp0
    public void removeEventListener(up0.InterfaceC13636a interfaceC13636a) {
        this.f57037e.removeListener(interfaceC13636a);
    }

    private lb2(C8756b c8756b) {
        this.f57034b = c8756b.f57046a;
        this.f57035c = c8756b.f57047b;
        this.f57036d = c8756b.f57048c;
        this.f57038f = c8756b.f57049d;
        this.f57037e = new up0.InterfaceC13636a.a();
        this.f57042j = Long.MIN_VALUE;
        this.f57043k = Long.MIN_VALUE;
    }
}
