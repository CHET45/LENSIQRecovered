package p000;

import android.os.Handler;
import p000.vp0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class mb2 implements qp0 {

    /* JADX INFO: renamed from: b */
    public final wp0 f60421b;

    /* JADX INFO: renamed from: c */
    public final int f60422c;

    /* JADX INFO: renamed from: d */
    public final long f60423d;

    /* JADX INFO: renamed from: e */
    public final vp0.InterfaceC14197a.a f60424e;

    /* JADX INFO: renamed from: f */
    public final h52 f60425f;

    /* JADX INFO: renamed from: g */
    public int f60426g;

    /* JADX INFO: renamed from: h */
    public long f60427h;

    /* JADX INFO: renamed from: i */
    public long f60428i;

    /* JADX INFO: renamed from: j */
    public long f60429j;

    /* JADX INFO: renamed from: k */
    public long f60430k;

    /* JADX INFO: renamed from: l */
    public int f60431l;

    /* JADX INFO: renamed from: m */
    public long f60432m;

    /* JADX INFO: renamed from: mb2$b */
    public static class C9250b {

        /* JADX INFO: renamed from: b */
        public int f60434b;

        /* JADX INFO: renamed from: c */
        public long f60435c;

        /* JADX INFO: renamed from: a */
        public wp0 f60433a = new jrf();

        /* JADX INFO: renamed from: d */
        public h52 f60436d = h52.f42390a;

        public mb2 build() {
            return new mb2(this);
        }

        @op1
        @fdi
        /* JADX INFO: renamed from: e */
        public C9250b m17202e(h52 h52Var) {
            this.f60436d = h52Var;
            return this;
        }

        @op1
        public C9250b setBandwidthStatistic(wp0 wp0Var) {
            u80.checkNotNull(wp0Var);
            this.f60433a = wp0Var;
            return this;
        }

        @op1
        public C9250b setMinBytesTransferred(long j) {
            u80.checkArgument(j >= 0);
            this.f60435c = j;
            return this;
        }

        @op1
        public C9250b setMinSamples(int i) {
            u80.checkArgument(i >= 0);
            this.f60434b = i;
            return this;
        }
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            if (i == 0 && j == 0 && j2 == this.f60430k) {
                return;
            }
            this.f60430k = j2;
            this.f60424e.bandwidthSample(i, j, j2);
        }
    }

    @Override // p000.qp0
    public void addEventListener(Handler handler, vp0.InterfaceC14197a interfaceC14197a) {
        this.f60424e.addListener(handler, interfaceC14197a);
    }

    @Override // p000.qp0
    public long getBandwidthEstimate() {
        return this.f60429j;
    }

    @Override // p000.qp0
    public void onBytesTransferred(ih3 ih3Var, int i) {
        long j = i;
        this.f60428i += j;
        this.f60432m += j;
    }

    @Override // p000.qp0
    public void onNetworkTypeChange(long j) {
        long jElapsedRealtime = this.f60425f.elapsedRealtime();
        maybeNotifyBandwidthSample(this.f60426g > 0 ? (int) (jElapsedRealtime - this.f60427h) : 0, this.f60428i, j);
        this.f60421b.reset();
        this.f60429j = Long.MIN_VALUE;
        this.f60427h = jElapsedRealtime;
        this.f60428i = 0L;
        this.f60431l = 0;
        this.f60432m = 0L;
    }

    @Override // p000.qp0
    public void onTransferEnd(ih3 ih3Var) {
        u80.checkState(this.f60426g > 0);
        int i = this.f60426g - 1;
        this.f60426g = i;
        if (i > 0) {
            return;
        }
        long jElapsedRealtime = (int) (this.f60425f.elapsedRealtime() - this.f60427h);
        if (jElapsedRealtime > 0) {
            this.f60421b.addSample(this.f60428i, 1000 * jElapsedRealtime);
            int i2 = this.f60431l + 1;
            this.f60431l = i2;
            if (i2 > this.f60422c && this.f60432m > this.f60423d) {
                this.f60429j = this.f60421b.getBandwidthEstimate();
            }
            maybeNotifyBandwidthSample((int) jElapsedRealtime, this.f60428i, this.f60429j);
            this.f60428i = 0L;
        }
    }

    @Override // p000.qp0
    public void onTransferInitializing(ih3 ih3Var) {
    }

    @Override // p000.qp0
    public void onTransferStart(ih3 ih3Var) {
        if (this.f60426g == 0) {
            this.f60427h = this.f60425f.elapsedRealtime();
        }
        this.f60426g++;
    }

    @Override // p000.qp0
    public void removeEventListener(vp0.InterfaceC14197a interfaceC14197a) {
        this.f60424e.removeListener(interfaceC14197a);
    }

    private mb2(C9250b c9250b) {
        this.f60421b = c9250b.f60433a;
        this.f60422c = c9250b.f60434b;
        this.f60423d = c9250b.f60435c;
        this.f60425f = c9250b.f60436d;
        this.f60424e = new vp0.InterfaceC14197a.a();
        this.f60429j = Long.MIN_VALUE;
        this.f60430k = Long.MIN_VALUE;
    }
}
