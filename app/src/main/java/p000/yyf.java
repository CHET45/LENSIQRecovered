package p000;

import android.os.Handler;
import p000.up0;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class yyf implements rp0 {

    /* JADX INFO: renamed from: b */
    public final xp0 f103473b;

    /* JADX INFO: renamed from: c */
    public final int f103474c;

    /* JADX INFO: renamed from: d */
    public final long f103475d;

    /* JADX INFO: renamed from: e */
    public final j52 f103476e;

    /* JADX INFO: renamed from: f */
    public final up0.InterfaceC13636a.a f103477f;

    /* JADX INFO: renamed from: g */
    public int f103478g;

    /* JADX INFO: renamed from: h */
    public long f103479h;

    /* JADX INFO: renamed from: i */
    public long f103480i;

    /* JADX INFO: renamed from: j */
    public long f103481j;

    /* JADX INFO: renamed from: k */
    public long f103482k;

    /* JADX INFO: renamed from: l */
    public int f103483l;

    /* JADX INFO: renamed from: m */
    public long f103484m;

    /* JADX INFO: renamed from: yyf$b */
    public static class C15895b {

        /* JADX INFO: renamed from: b */
        public int f103486b;

        /* JADX INFO: renamed from: c */
        public long f103487c;

        /* JADX INFO: renamed from: a */
        public xp0 f103485a = new irf();

        /* JADX INFO: renamed from: d */
        public j52 f103488d = j52.f49539a;

        public yyf build() {
            return new yyf(this);
        }

        @op1
        @fdi
        /* JADX INFO: renamed from: e */
        public C15895b m26420e(j52 j52Var) {
            this.f103488d = j52Var;
            return this;
        }

        @op1
        public C15895b setBandwidthStatistic(xp0 xp0Var) {
            v80.checkNotNull(xp0Var);
            this.f103485a = xp0Var;
            return this;
        }

        @op1
        public C15895b setMinBytesTransferred(long j) {
            v80.checkArgument(j >= 0);
            this.f103487c = j;
            return this;
        }

        @op1
        public C15895b setMinSamples(int i) {
            v80.checkArgument(i >= 0);
            this.f103486b = i;
            return this;
        }
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            if (i == 0 && j == 0 && j2 == this.f103482k) {
                return;
            }
            this.f103482k = j2;
            this.f103477f.bandwidthSample(i, j, j2);
        }
    }

    @Override // p000.rp0
    public void addEventListener(Handler handler, up0.InterfaceC13636a interfaceC13636a) {
        this.f103477f.addListener(handler, interfaceC13636a);
    }

    @Override // p000.rp0
    public long getBandwidthEstimate() {
        return this.f103481j;
    }

    @Override // p000.rp0
    public void onBytesTransferred(gh3 gh3Var, int i) {
        long j = i;
        this.f103480i += j;
        this.f103484m += j;
    }

    @Override // p000.rp0
    public void onNetworkTypeChange(long j) {
        long jElapsedRealtime = this.f103476e.elapsedRealtime();
        maybeNotifyBandwidthSample(this.f103478g > 0 ? (int) (jElapsedRealtime - this.f103479h) : 0, this.f103480i, j);
        this.f103473b.reset();
        this.f103481j = Long.MIN_VALUE;
        this.f103479h = jElapsedRealtime;
        this.f103480i = 0L;
        this.f103483l = 0;
        this.f103484m = 0L;
    }

    @Override // p000.rp0
    public void onTransferEnd(gh3 gh3Var) {
        v80.checkState(this.f103478g > 0);
        long jElapsedRealtime = this.f103476e.elapsedRealtime();
        long j = (int) (jElapsedRealtime - this.f103479h);
        if (j > 0) {
            this.f103473b.addSample(this.f103480i, 1000 * j);
            int i = this.f103483l + 1;
            this.f103483l = i;
            if (i > this.f103474c && this.f103484m > this.f103475d) {
                this.f103481j = this.f103473b.getBandwidthEstimate();
            }
            maybeNotifyBandwidthSample((int) j, this.f103480i, this.f103481j);
            this.f103479h = jElapsedRealtime;
            this.f103480i = 0L;
        }
        this.f103478g--;
    }

    @Override // p000.rp0
    public void onTransferInitializing(gh3 gh3Var) {
    }

    @Override // p000.rp0
    public void onTransferStart(gh3 gh3Var) {
        if (this.f103478g == 0) {
            this.f103479h = this.f103476e.elapsedRealtime();
        }
        this.f103478g++;
    }

    @Override // p000.rp0
    public void removeEventListener(up0.InterfaceC13636a interfaceC13636a) {
        this.f103477f.removeListener(interfaceC13636a);
    }

    private yyf(C15895b c15895b) {
        this.f103473b = c15895b.f103485a;
        this.f103474c = c15895b.f103486b;
        this.f103475d = c15895b.f103487c;
        this.f103476e = c15895b.f103488d;
        this.f103477f = new up0.InterfaceC13636a.a();
        this.f103481j = Long.MIN_VALUE;
        this.f103482k = Long.MIN_VALUE;
    }
}
