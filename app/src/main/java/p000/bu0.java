package p000;

import java.io.IOException;
import p000.p1e;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class bu0 implements n1e, p1e {

    /* JADX INFO: renamed from: C */
    @hib
    public nle f14752C;

    /* JADX INFO: renamed from: F */
    @hib
    public kq6[] f14753F;

    /* JADX INFO: renamed from: H */
    public long f14754H;

    /* JADX INFO: renamed from: L */
    public long f14755L;

    /* JADX INFO: renamed from: N */
    public boolean f14757N;

    /* JADX INFO: renamed from: Q */
    public boolean f14758Q;

    /* JADX INFO: renamed from: X */
    @xc7("lock")
    @hib
    public p1e.InterfaceC10758f f14759X;

    /* JADX INFO: renamed from: b */
    public final int f14761b;

    /* JADX INFO: renamed from: d */
    @hib
    public r1e f14763d;

    /* JADX INFO: renamed from: e */
    public int f14764e;

    /* JADX INFO: renamed from: f */
    public k0d f14765f;

    /* JADX INFO: renamed from: m */
    public int f14766m;

    /* JADX INFO: renamed from: a */
    public final Object f14760a = new Object();

    /* JADX INFO: renamed from: c */
    public final nq6 f14762c = new nq6();

    /* JADX INFO: renamed from: M */
    public long f14756M = Long.MIN_VALUE;

    public bu0(int i) {
        this.f14761b = i;
    }

    /* JADX INFO: renamed from: a */
    public final ba5 m3403a(Throwable th, @hib kq6 kq6Var, int i) {
        return m3404b(th, kq6Var, false, i);
    }

    /* JADX INFO: renamed from: b */
    public final ba5 m3404b(Throwable th, @hib kq6 kq6Var, boolean z, int i) {
        int formatSupport;
        if (kq6Var == null || this.f14758Q) {
            formatSupport = 4;
        } else {
            this.f14758Q = true;
            try {
                formatSupport = p1e.getFormatSupport(supportsFormat(kq6Var));
            } catch (ba5 unused) {
                formatSupport = 4;
            } finally {
                this.f14758Q = false;
            }
        }
        return ba5.createForRenderer(th, getName(), m3407e(), kq6Var, formatSupport, z, i);
    }

    /* JADX INFO: renamed from: c */
    public final r1e m3405c() {
        return (r1e) u80.checkNotNull(this.f14763d);
    }

    @Override // p000.p1e
    public final void clearListener() {
        synchronized (this.f14760a) {
            this.f14759X = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final nq6 m3406d() {
        this.f14762c.clear();
        return this.f14762c;
    }

    @Override // p000.n1e
    public final void disable() {
        u80.checkState(this.f14766m == 1);
        this.f14762c.clear();
        this.f14766m = 0;
        this.f14752C = null;
        this.f14753F = null;
        this.f14757N = false;
        mo3412j();
    }

    /* JADX INFO: renamed from: e */
    public final int m3407e() {
        return this.f14764e;
    }

    @Override // p000.n1e
    public final void enable(r1e r1eVar, kq6[] kq6VarArr, nle nleVar, long j, boolean z, boolean z2, long j2, long j3) throws ba5 {
        u80.checkState(this.f14766m == 0);
        this.f14763d = r1eVar;
        this.f14766m = 1;
        mo3413k(z, z2);
        replaceStream(kq6VarArr, nleVar, j2, j3);
        resetPosition(j, z);
    }

    /* JADX INFO: renamed from: f */
    public final long m3408f() {
        return this.f14755L;
    }

    /* JADX INFO: renamed from: g */
    public final k0d m3409g() {
        return (k0d) u80.checkNotNull(this.f14765f);
    }

    @Override // p000.n1e
    public final p1e getCapabilities() {
        return this;
    }

    @Override // p000.n1e
    @hib
    public bda getMediaClock() {
        return null;
    }

    @Override // p000.n1e
    public final long getReadingPositionUs() {
        return this.f14756M;
    }

    @Override // p000.n1e
    public final int getState() {
        return this.f14766m;
    }

    @Override // p000.n1e
    @hib
    public final nle getStream() {
        return this.f14752C;
    }

    @Override // p000.n1e, p000.p1e
    public final int getTrackType() {
        return this.f14761b;
    }

    /* JADX INFO: renamed from: h */
    public final kq6[] m3410h() {
        return (kq6[]) u80.checkNotNull(this.f14753F);
    }

    @Override // p000.l0d.InterfaceC8571b
    public void handleMessage(int i, @hib Object obj) throws ba5 {
    }

    @Override // p000.n1e
    public final boolean hasReadStreamToEnd() {
        return this.f14756M == Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3411i() {
        return hasReadStreamToEnd() ? this.f14757N : ((nle) u80.checkNotNull(this.f14752C)).isReady();
    }

    @Override // p000.n1e
    public final void init(int i, k0d k0dVar) {
        this.f14764e = i;
        this.f14765f = k0dVar;
    }

    @Override // p000.n1e
    public final boolean isCurrentStreamFinal() {
        return this.f14757N;
    }

    /* JADX INFO: renamed from: j */
    public void mo3412j() {
    }

    /* JADX INFO: renamed from: k */
    public void mo3413k(boolean z, boolean z2) throws ba5 {
    }

    /* JADX INFO: renamed from: l */
    public void mo3414l(long j, boolean z) throws ba5 {
    }

    /* JADX INFO: renamed from: m */
    public void mo3415m() {
    }

    @Override // p000.n1e
    public final void maybeThrowStreamError() throws IOException {
        ((nle) u80.checkNotNull(this.f14752C)).maybeThrowError();
    }

    /* JADX INFO: renamed from: n */
    public final void m3416n() {
        p1e.InterfaceC10758f interfaceC10758f;
        synchronized (this.f14760a) {
            interfaceC10758f = this.f14759X;
        }
        if (interfaceC10758f != null) {
            interfaceC10758f.onRendererCapabilitiesChanged(this);
        }
    }

    /* JADX INFO: renamed from: o */
    public void mo3417o() {
    }

    /* JADX INFO: renamed from: p */
    public void mo3418p() throws ba5 {
    }

    /* JADX INFO: renamed from: q */
    public void mo3419q() {
    }

    /* JADX INFO: renamed from: r */
    public void mo3420r(kq6[] kq6VarArr, long j, long j2) throws ba5 {
    }

    @Override // p000.n1e
    public final void release() {
        u80.checkState(this.f14766m == 0);
        mo3415m();
    }

    @Override // p000.n1e
    public final void replaceStream(kq6[] kq6VarArr, nle nleVar, long j, long j2) throws ba5 {
        u80.checkState(!this.f14757N);
        this.f14752C = nleVar;
        if (this.f14756M == Long.MIN_VALUE) {
            this.f14756M = j;
        }
        this.f14753F = kq6VarArr;
        this.f14754H = j2;
        mo3420r(kq6VarArr, j, j2);
    }

    @Override // p000.n1e
    public final void reset() {
        u80.checkState(this.f14766m == 0);
        this.f14762c.clear();
        mo3417o();
    }

    @Override // p000.n1e
    public final void resetPosition(long j) throws ba5 {
        resetPosition(j, false);
    }

    /* JADX INFO: renamed from: s */
    public final int m3421s(nq6 nq6Var, sl3 sl3Var, int i) {
        int data = ((nle) u80.checkNotNull(this.f14752C)).readData(nq6Var, sl3Var, i);
        if (data == -4) {
            if (sl3Var.isEndOfStream()) {
                this.f14756M = Long.MIN_VALUE;
                return this.f14757N ? -4 : -3;
            }
            long j = sl3Var.f82164f + this.f14754H;
            sl3Var.f82164f = j;
            this.f14756M = Math.max(this.f14756M, j);
        } else if (data == -5) {
            kq6 kq6Var = (kq6) u80.checkNotNull(nq6Var.f65258b);
            if (kq6Var.f54995Y != Long.MAX_VALUE) {
                nq6Var.f65258b = kq6Var.buildUpon().setSubsampleOffsetUs(kq6Var.f54995Y + this.f14754H).build();
            }
        }
        return data;
    }

    @Override // p000.n1e
    public final void setCurrentStreamFinal() {
        this.f14757N = true;
    }

    @Override // p000.p1e
    public final void setListener(p1e.InterfaceC10758f interfaceC10758f) {
        synchronized (this.f14760a) {
            this.f14759X = interfaceC10758f;
        }
    }

    @Override // p000.n1e
    public final void start() throws ba5 {
        u80.checkState(this.f14766m == 1);
        this.f14766m = 2;
        mo3418p();
    }

    @Override // p000.n1e
    public final void stop() {
        u80.checkState(this.f14766m == 2);
        this.f14766m = 1;
        mo3419q();
    }

    @Override // p000.p1e
    public int supportsMixedMimeTypeAdaptation() throws ba5 {
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public int m3422t(long j) {
        return ((nle) u80.checkNotNull(this.f14752C)).skipData(j - this.f14754H);
    }

    private void resetPosition(long j, boolean z) throws ba5 {
        this.f14757N = false;
        this.f14755L = j;
        this.f14756M = j;
        mo3414l(j, z);
    }
}
