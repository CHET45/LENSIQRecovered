package p000;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.C1213a;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.efd;
import p000.gh3;
import p000.hfd;
import p000.joa;
import p000.nfa;
import p000.nr4;
import p000.q1h;
import p000.ued;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class hfd extends fs0 implements efd.InterfaceC5290c {

    /* JADX INFO: renamed from: c2 */
    public static final int f43370c2 = 1048576;

    /* JADX INFO: renamed from: C */
    public final gh3.InterfaceC6313a f43371C;

    /* JADX INFO: renamed from: F */
    public final ued.InterfaceC13516a f43372F;

    /* JADX INFO: renamed from: H */
    public final or4 f43373H;

    /* JADX INFO: renamed from: L */
    public final hc9 f43374L;

    /* JADX INFO: renamed from: M */
    public final int f43375M;

    /* JADX INFO: renamed from: M1 */
    public boolean f43376M1;

    /* JADX INFO: renamed from: N */
    public final int f43377N;

    /* JADX INFO: renamed from: Q */
    @hib
    public final C1213a f43378Q;

    /* JADX INFO: renamed from: V1 */
    public boolean f43379V1;

    /* JADX INFO: renamed from: X */
    @hib
    public final lfg<yxd> f43380X;

    /* JADX INFO: renamed from: Y */
    public boolean f43381Y;

    /* JADX INFO: renamed from: Z */
    public long f43382Z;

    /* JADX INFO: renamed from: Z1 */
    @hib
    public qdh f43383Z1;

    /* JADX INFO: renamed from: a2 */
    @xc7("this")
    public nfa f43384a2;

    /* JADX INFO: renamed from: b2 */
    @hib
    public InterfaceC6837c f43385b2;

    /* JADX INFO: renamed from: hfd$a */
    public class C6835a extends yt6 {
        public C6835a(q1h q1hVar) {
            super(q1hVar);
        }

        @Override // p000.yt6, p000.q1h
        public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
            super.getPeriod(i, c11270b, z);
            c11270b.f72949f = true;
            return c11270b;
        }

        @Override // p000.yt6, p000.q1h
        public q1h.C11272d getWindow(int i, q1h.C11272d c11272d, long j) {
            super.getWindow(i, c11272d, j);
            c11272d.f72981k = true;
            return c11272d;
        }
    }

    /* JADX INFO: renamed from: hfd$b */
    public static final class C6836b implements loa {

        /* JADX INFO: renamed from: c */
        public final gh3.InterfaceC6313a f43387c;

        /* JADX INFO: renamed from: d */
        public ued.InterfaceC13516a f43388d;

        /* JADX INFO: renamed from: e */
        public sr4 f43389e;

        /* JADX INFO: renamed from: f */
        public hc9 f43390f;

        /* JADX INFO: renamed from: g */
        public int f43391g;

        /* JADX INFO: renamed from: h */
        @hib
        public lfg<yxd> f43392h;

        /* JADX INFO: renamed from: i */
        public int f43393i;

        /* JADX INFO: renamed from: j */
        @hib
        public C1213a f43394j;

        public C6836b(gh3.InterfaceC6313a interfaceC6313a) {
            this(interfaceC6313a, new cv3());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ued lambda$new$0(ik5 ik5Var, j0d j0dVar) {
            return new rh1(ik5Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ yxd lambda$setDownloadExecutor$1(lfg lfgVar, qu2 qu2Var) {
            return yxd.from((Executor) lfgVar.get(), qu2Var);
        }

        @op1
        /* JADX INFO: renamed from: c */
        public C6836b m12352c(int i, C1213a c1213a) {
            this.f43393i = i;
            this.f43394j = (C1213a) v80.checkNotNull(c1213a);
            return this;
        }

        @Override // p000.una.InterfaceC13611a
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        @op1
        public C6836b setContinueLoadingCheckIntervalBytes(int i) {
            this.f43391g = i;
            return this;
        }

        @op1
        public <T extends Executor> C6836b setDownloadExecutor(final lfg<T> lfgVar, final qu2<T> qu2Var) {
            setDownloadExecutor(new lfg() { // from class: kfd
                @Override // p000.lfg
                public final Object get() {
                    return hfd.C6836b.lambda$setDownloadExecutor$1(lfgVar, qu2Var);
                }
            });
            return this;
        }

        public C6836b(gh3.InterfaceC6313a interfaceC6313a, final ik5 ik5Var) {
            this(interfaceC6313a, new ued.InterfaceC13516a() { // from class: jfd
                @Override // p000.ued.InterfaceC13516a
                public final ued createProgressiveMediaExtractor(j0d j0dVar) {
                    return hfd.C6836b.lambda$new$0(ik5Var, j0dVar);
                }
            });
        }

        @Override // p000.una.InterfaceC13611a
        public hfd createMediaSource(nfa nfaVar) {
            v80.checkNotNull(nfaVar.f64305b);
            return new hfd(nfaVar, this.f43387c, this.f43388d, this.f43389e.get(nfaVar), this.f43390f, this.f43391g, this.f43393i, this.f43394j, this.f43392h, null);
        }

        @op1
        public una.InterfaceC13611a setDownloadExecutor(lfg<yxd> lfgVar) {
            this.f43392h = lfgVar;
            return this;
        }

        @Override // p000.una.InterfaceC13611a
        @op1
        public C6836b setDrmSessionManagerProvider(sr4 sr4Var) {
            this.f43389e = (sr4) v80.checkNotNull(sr4Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p000.una.InterfaceC13611a
        @op1
        public C6836b setLoadErrorHandlingPolicy(hc9 hc9Var) {
            this.f43390f = (hc9) v80.checkNotNull(hc9Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public C6836b(gh3.InterfaceC6313a interfaceC6313a, ued.InterfaceC13516a interfaceC13516a) {
            this(interfaceC6313a, interfaceC13516a, new qu3(), new ow3(), 1048576);
        }

        public C6836b(gh3.InterfaceC6313a interfaceC6313a, ued.InterfaceC13516a interfaceC13516a, sr4 sr4Var, hc9 hc9Var, int i) {
            this.f43387c = interfaceC6313a;
            this.f43388d = interfaceC13516a;
            this.f43389e = sr4Var;
            this.f43390f = hc9Var;
            this.f43391g = i;
        }
    }

    /* JADX INFO: renamed from: hfd$c */
    public interface InterfaceC6837c {
        void onSeekMap(una unaVar, gue gueVar);
    }

    public /* synthetic */ hfd(nfa nfaVar, gh3.InterfaceC6313a interfaceC6313a, ued.InterfaceC13516a interfaceC13516a, or4 or4Var, hc9 hc9Var, int i, int i2, C1213a c1213a, lfg lfgVar, C6835a c6835a) {
        this(nfaVar, interfaceC6313a, interfaceC13516a, or4Var, hc9Var, i, i2, c1213a, lfgVar);
    }

    private nfa.C9856h getLocalConfiguration() {
        return (nfa.C9856h) v80.checkNotNull(getMediaItem().f64305b);
    }

    private void notifySourceInfoRefreshed() {
        q1h tnfVar = new tnf(this.f43382Z, this.f43376M1, false, this.f43379V1, (Object) null, getMediaItem());
        if (this.f43381Y) {
            tnfVar = new C6835a(tnfVar);
        }
        m11123m(tnfVar);
    }

    @Override // p000.una
    public boolean canUpdateMediaItem(nfa nfaVar) {
        nfa.C9856h localConfiguration = getLocalConfiguration();
        nfa.C9856h c9856h = nfaVar.f64305b;
        return c9856h != null && c9856h.f64406a.equals(localConfiguration.f64406a) && c9856h.f64415j == localConfiguration.f64415j && Objects.equals(c9856h.f64411f, localConfiguration.f64411f);
    }

    public void clearListener() {
        this.f43385b2 = null;
    }

    @Override // p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        gh3 gh3VarCreateDataSource = this.f43371C.createDataSource();
        qdh qdhVar = this.f43383Z1;
        if (qdhVar != null) {
            gh3VarCreateDataSource.addTransferListener(qdhVar);
        }
        nfa.C9856h localConfiguration = getLocalConfiguration();
        Uri uri = localConfiguration.f64406a;
        ued uedVarCreateProgressiveMediaExtractor = this.f43372F.createProgressiveMediaExtractor(m11120i());
        or4 or4Var = this.f43373H;
        nr4.C10020a c10020aM11115b = m11115b(c13612b);
        hc9 hc9Var = this.f43374L;
        joa.C7994a c7994aM11118e = m11118e(c13612b);
        String str = localConfiguration.f64411f;
        int i = this.f43375M;
        int i2 = this.f43377N;
        C1213a c1213a = this.f43378Q;
        long jMsToUs = t0i.msToUs(localConfiguration.f64415j);
        lfg<yxd> lfgVar = this.f43380X;
        return new efd(uri, gh3VarCreateDataSource, uedVarCreateProgressiveMediaExtractor, or4Var, c10020aM11115b, hc9Var, c7994aM11118e, this, interfaceC5892fn, str, i, i2, c1213a, jMsToUs, lfgVar != null ? lfgVar.get() : null);
    }

    @Override // p000.una
    public synchronized nfa getMediaItem() {
        return this.f43384a2;
    }

    @Override // p000.fs0
    /* JADX INFO: renamed from: l */
    public void mo2508l(@hib qdh qdhVar) {
        this.f43383Z1 = qdhVar;
        this.f43373H.setPlayer((Looper) v80.checkNotNull(Looper.myLooper()), m11120i());
        this.f43373H.prepare();
        notifySourceInfoRefreshed();
    }

    @Override // p000.una
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // p000.efd.InterfaceC5290c
    public void onSourceInfoRefreshed(long j, gue gueVar, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f43382Z;
        }
        boolean zIsSeekable = gueVar.isSeekable();
        if (!this.f43381Y && this.f43382Z == j && this.f43376M1 == zIsSeekable && this.f43379V1 == z) {
            return;
        }
        this.f43382Z = j;
        this.f43376M1 = zIsSeekable;
        this.f43379V1 = z;
        this.f43381Y = false;
        notifySourceInfoRefreshed();
        InterfaceC6837c interfaceC6837c = this.f43385b2;
        if (interfaceC6837c != null) {
            interfaceC6837c.onSeekMap(this, gueVar);
        }
    }

    @Override // p000.una
    public void releasePeriod(mja mjaVar) {
        ((efd) mjaVar).release();
    }

    @Override // p000.fs0
    public void releaseSourceInternal() {
        this.f43373H.release();
    }

    public void setListener(InterfaceC6837c interfaceC6837c) {
        this.f43385b2 = interfaceC6837c;
    }

    @Override // p000.una
    public synchronized void updateMediaItem(nfa nfaVar) {
        this.f43384a2 = nfaVar;
    }

    private hfd(nfa nfaVar, gh3.InterfaceC6313a interfaceC6313a, ued.InterfaceC13516a interfaceC13516a, or4 or4Var, hc9 hc9Var, int i, int i2, @hib C1213a c1213a, @hib lfg<yxd> lfgVar) {
        this.f43384a2 = nfaVar;
        this.f43371C = interfaceC6313a;
        this.f43372F = interfaceC13516a;
        this.f43373H = or4Var;
        this.f43374L = hc9Var;
        this.f43375M = i;
        this.f43378Q = c1213a;
        this.f43377N = i2;
        this.f43381Y = true;
        this.f43382Z = -9223372036854775807L;
        this.f43380X = lfgVar;
    }
}
