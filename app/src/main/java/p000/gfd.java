package p000;

import android.os.Looper;
import com.google.android.exoplayer2.drm.C3003c;
import com.google.android.exoplayer2.drm.InterfaceC3006f;
import p000.aga;
import p000.ffd;
import p000.gfd;
import p000.ih3;
import p000.t1h;
import p000.ved;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class gfd extends es0 implements ffd.InterfaceC5769b {

    /* JADX INFO: renamed from: Z1 */
    public static final int f39691Z1 = 1048576;

    /* JADX INFO: renamed from: C */
    public final aga f39692C;

    /* JADX INFO: renamed from: F */
    public final aga.C0240h f39693F;

    /* JADX INFO: renamed from: H */
    public final ih3.InterfaceC7283a f39694H;

    /* JADX INFO: renamed from: L */
    public final ved.InterfaceC14020a f39695L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC3006f f39696M;

    /* JADX INFO: renamed from: M1 */
    public boolean f39697M1;

    /* JADX INFO: renamed from: N */
    public final ic9 f39698N;

    /* JADX INFO: renamed from: Q */
    public final int f39699Q;

    /* JADX INFO: renamed from: V1 */
    @hib
    public pdh f39700V1;

    /* JADX INFO: renamed from: X */
    public boolean f39701X;

    /* JADX INFO: renamed from: Y */
    public long f39702Y;

    /* JADX INFO: renamed from: Z */
    public boolean f39703Z;

    /* JADX INFO: renamed from: gfd$a */
    public class C6284a extends xt6 {
        public C6284a(t1h t1hVar) {
            super(t1hVar);
        }

        @Override // p000.xt6, p000.t1h
        public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
            super.getPeriod(i, c12849b, z);
            c12849b.f83401f = true;
            return c12849b;
        }

        @Override // p000.xt6, p000.t1h
        public t1h.C12851d getWindow(int i, t1h.C12851d c12851d, long j) {
            super.getWindow(i, c12851d, j);
            c12851d.f83428M = true;
            return c12851d;
        }
    }

    /* JADX INFO: renamed from: gfd$b */
    public static final class C6285b implements moa {

        /* JADX INFO: renamed from: c */
        public final ih3.InterfaceC7283a f39705c;

        /* JADX INFO: renamed from: d */
        public ved.InterfaceC14020a f39706d;

        /* JADX INFO: renamed from: e */
        public rr4 f39707e;

        /* JADX INFO: renamed from: f */
        public ic9 f39708f;

        /* JADX INFO: renamed from: g */
        public int f39709g;

        public C6285b(ih3.InterfaceC7283a interfaceC7283a) {
            this(interfaceC7283a, new dv3());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ved lambda$new$0(hk5 hk5Var, k0d k0dVar) {
            return new qh1(hk5Var);
        }

        @Override // p000.vna.InterfaceC14174a
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        @op1
        public C6285b setContinueLoadingCheckIntervalBytes(int i) {
            this.f39709g = i;
            return this;
        }

        public C6285b(ih3.InterfaceC7283a interfaceC7283a, final hk5 hk5Var) {
            this(interfaceC7283a, new ved.InterfaceC14020a() { // from class: ifd
                @Override // p000.ved.InterfaceC14020a
                public final ved createProgressiveMediaExtractor(k0d k0dVar) {
                    return gfd.C6285b.lambda$new$0(hk5Var, k0dVar);
                }
            });
        }

        @Override // p000.vna.InterfaceC14174a
        public gfd createMediaSource(aga agaVar) {
            u80.checkNotNull(agaVar.f1446b);
            return new gfd(agaVar, this.f39705c, this.f39706d, this.f39707e.get(agaVar), this.f39708f, this.f39709g, null);
        }

        @Override // p000.vna.InterfaceC14174a
        @op1
        public C6285b setDrmSessionManagerProvider(rr4 rr4Var) {
            this.f39707e = (rr4) u80.checkNotNull(rr4Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p000.vna.InterfaceC14174a
        @op1
        public C6285b setLoadErrorHandlingPolicy(ic9 ic9Var) {
            this.f39708f = (ic9) u80.checkNotNull(ic9Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public C6285b(ih3.InterfaceC7283a interfaceC7283a, ved.InterfaceC14020a interfaceC14020a) {
            this(interfaceC7283a, interfaceC14020a, new C3003c(), new nw3(), 1048576);
        }

        public C6285b(ih3.InterfaceC7283a interfaceC7283a, ved.InterfaceC14020a interfaceC14020a, rr4 rr4Var, ic9 ic9Var, int i) {
            this.f39705c = interfaceC7283a;
            this.f39706d = interfaceC14020a;
            this.f39707e = rr4Var;
            this.f39708f = ic9Var;
            this.f39709g = i;
        }
    }

    public /* synthetic */ gfd(aga agaVar, ih3.InterfaceC7283a interfaceC7283a, ved.InterfaceC14020a interfaceC14020a, InterfaceC3006f interfaceC3006f, ic9 ic9Var, int i, C6284a c6284a) {
        this(agaVar, interfaceC7283a, interfaceC14020a, interfaceC3006f, ic9Var, i);
    }

    private void notifySourceInfoRefreshed() {
        t1h snfVar = new snf(this.f39702Y, this.f39703Z, false, this.f39697M1, (Object) null, this.f39692C);
        if (this.f39701X) {
            snfVar = new C6284a(snfVar);
        }
        m10220l(snfVar);
    }

    @Override // p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        ih3 ih3VarCreateDataSource = this.f39694H.createDataSource();
        pdh pdhVar = this.f39700V1;
        if (pdhVar != null) {
            ih3VarCreateDataSource.addTransferListener(pdhVar);
        }
        return new ffd(this.f39693F.f1544a, ih3VarCreateDataSource, this.f39695L.createProgressiveMediaExtractor(m10218i()), this.f39696M, m10213b(c14175b), this.f39698N, m10216e(c14175b), this, interfaceC6430gn, this.f39693F.f1549f, this.f39699Q);
    }

    @Override // p000.vna
    public aga getMediaItem() {
        return this.f39692C;
    }

    @Override // p000.es0
    /* JADX INFO: renamed from: k */
    public void mo2648k(@hib pdh pdhVar) {
        this.f39700V1 = pdhVar;
        this.f39696M.setPlayer((Looper) u80.checkNotNull(Looper.myLooper()), m10218i());
        this.f39696M.prepare();
        notifySourceInfoRefreshed();
    }

    @Override // p000.vna
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // p000.ffd.InterfaceC5769b
    public void onSourceInfoRefreshed(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f39702Y;
        }
        if (!this.f39701X && this.f39702Y == j && this.f39703Z == z && this.f39697M1 == z2) {
            return;
        }
        this.f39702Y = j;
        this.f39703Z = z;
        this.f39697M1 = z2;
        this.f39701X = false;
        notifySourceInfoRefreshed();
    }

    @Override // p000.vna
    public void releasePeriod(nja njaVar) {
        ((ffd) njaVar).release();
    }

    @Override // p000.es0
    public void releaseSourceInternal() {
        this.f39696M.release();
    }

    private gfd(aga agaVar, ih3.InterfaceC7283a interfaceC7283a, ved.InterfaceC14020a interfaceC14020a, InterfaceC3006f interfaceC3006f, ic9 ic9Var, int i) {
        this.f39693F = (aga.C0240h) u80.checkNotNull(agaVar.f1446b);
        this.f39692C = agaVar;
        this.f39694H = interfaceC7283a;
        this.f39695L = interfaceC14020a;
        this.f39696M = interfaceC3006f;
        this.f39698N = ic9Var;
        this.f39699Q = i;
        this.f39701X = true;
        this.f39702Y = -9223372036854775807L;
    }
}
