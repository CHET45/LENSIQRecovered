package p000;

import android.os.Handler;
import p000.vp0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class zyf implements qp0 {

    /* JADX INFO: renamed from: b */
    public final wp0 f106521b;

    /* JADX INFO: renamed from: c */
    public final int f106522c;

    /* JADX INFO: renamed from: d */
    public final long f106523d;

    /* JADX INFO: renamed from: e */
    public final h52 f106524e;

    /* JADX INFO: renamed from: f */
    public final vp0.InterfaceC14197a.a f106525f;

    /* JADX INFO: renamed from: g */
    public int f106526g;

    /* JADX INFO: renamed from: h */
    public long f106527h;

    /* JADX INFO: renamed from: i */
    public long f106528i;

    /* JADX INFO: renamed from: j */
    public long f106529j;

    /* JADX INFO: renamed from: k */
    public long f106530k;

    /* JADX INFO: renamed from: l */
    public int f106531l;

    /* JADX INFO: renamed from: m */
    public long f106532m;

    /* JADX INFO: renamed from: zyf$b */
    public static class C16323b {

        /* JADX INFO: renamed from: b */
        public int f106534b;

        /* JADX INFO: renamed from: c */
        public long f106535c;

        /* JADX INFO: renamed from: a */
        public wp0 f106533a = new jrf();

        /* JADX INFO: renamed from: d */
        public h52 f106536d = h52.f42390a;

        public zyf build() {
            return new zyf(this);
        }

        @op1
        @fdi
        /* JADX INFO: renamed from: e */
        public C16323b m27155e(h52 h52Var) {
            this.f106536d = h52Var;
            return this;
        }

        @op1
        public C16323b setBandwidthStatistic(wp0 wp0Var) {
            u80.checkNotNull(wp0Var);
            this.f106533a = wp0Var;
            return this;
        }

        @op1
        public C16323b setMinBytesTransferred(long j) {
            u80.checkArgument(j >= 0);
            this.f106535c = j;
            return this;
        }

        @op1
        public C16323b setMinSamples(int i) {
            u80.checkArgument(i >= 0);
            this.f106534b = i;
            return this;
        }
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            if (i == 0 && j == 0 && j2 == this.f106530k) {
                return;
            }
            this.f106530k = j2;
            this.f106525f.bandwidthSample(i, j, j2);
        }
    }

    @Override // p000.qp0
    public void addEventListener(Handler handler, vp0.InterfaceC14197a interfaceC14197a) {
        this.f106525f.addListener(handler, interfaceC14197a);
    }

    @Override // p000.qp0
    public long getBandwidthEstimate() {
        return this.f106529j;
    }

    @Override // p000.qp0
    public void onBytesTransferred(ih3 ih3Var, int i) {
        long j = i;
        this.f106528i += j;
        this.f106532m += j;
    }

    @Override // p000.qp0
    public void onNetworkTypeChange(long j) {
        long jElapsedRealtime = this.f106524e.elapsedRealtime();
        maybeNotifyBandwidthSample(this.f106526g > 0 ? (int) (jElapsedRealtime - this.f106527h) : 0, this.f106528i, j);
        this.f106521b.reset();
        this.f106529j = Long.MIN_VALUE;
        this.f106527h = jElapsedRealtime;
        this.f106528i = 0L;
        this.f106531l = 0;
        this.f106532m = 0L;
    }

    @Override // p000.qp0
    public void onTransferEnd(ih3 ih3Var) {
        u80.checkState(this.f106526g > 0);
        long jElapsedRealtime = this.f106524e.elapsedRealtime();
        long j = (int) (jElapsedRealtime - this.f106527h);
        if (j > 0) {
            this.f106521b.addSample(this.f106528i, 1000 * j);
            int i = this.f106531l + 1;
            this.f106531l = i;
            if (i > this.f106522c && this.f106532m > this.f106523d) {
                this.f106529j = this.f106521b.getBandwidthEstimate();
            }
            maybeNotifyBandwidthSample((int) j, this.f106528i, this.f106529j);
            this.f106527h = jElapsedRealtime;
            this.f106528i = 0L;
        }
        this.f106526g--;
    }

    @Override // p000.qp0
    public void onTransferInitializing(ih3 ih3Var) {
    }

    @Override // p000.qp0
    public void onTransferStart(ih3 ih3Var) {
        if (this.f106526g == 0) {
            this.f106527h = this.f106524e.elapsedRealtime();
        }
        this.f106526g++;
    }

    @Override // p000.qp0
    public void removeEventListener(vp0.InterfaceC14197a interfaceC14197a) {
        this.f106525f.removeListener(interfaceC14197a);
    }

    private zyf(C16323b c16323b) {
        this.f106521b = c16323b.f106533a;
        this.f106522c = c16323b.f106534b;
        this.f106523d = c16323b.f106535c;
        this.f106524e = c16323b.f106536d;
        this.f106525f = new vp0.InterfaceC14197a.a();
        this.f106529j = Long.MIN_VALUE;
        this.f106530k = Long.MIN_VALUE;
    }
}
