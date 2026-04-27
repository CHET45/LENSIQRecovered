package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p000.ic9;
import p000.ih3;
import p000.koa;
import p000.nja;
import p000.vc9;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class fof implements nja, vc9.InterfaceC13994b<C5909c> {

    /* JADX INFO: renamed from: X */
    public static final String f37268X = "SingleSampleMediaPeriod";

    /* JADX INFO: renamed from: Y */
    public static final int f37269Y = 1024;

    /* JADX INFO: renamed from: C */
    public final long f37270C;

    /* JADX INFO: renamed from: H */
    public final kq6 f37272H;

    /* JADX INFO: renamed from: L */
    public final boolean f37273L;

    /* JADX INFO: renamed from: M */
    public boolean f37274M;

    /* JADX INFO: renamed from: N */
    public byte[] f37275N;

    /* JADX INFO: renamed from: Q */
    public int f37276Q;

    /* JADX INFO: renamed from: a */
    public final yh3 f37277a;

    /* JADX INFO: renamed from: b */
    public final ih3.InterfaceC7283a f37278b;

    /* JADX INFO: renamed from: c */
    @hib
    public final pdh f37279c;

    /* JADX INFO: renamed from: d */
    public final ic9 f37280d;

    /* JADX INFO: renamed from: e */
    public final koa.C8476a f37281e;

    /* JADX INFO: renamed from: f */
    public final m6h f37282f;

    /* JADX INFO: renamed from: m */
    public final ArrayList<C5908b> f37283m = new ArrayList<>();

    /* JADX INFO: renamed from: F */
    public final vc9 f37271F = new vc9("SingleSampleMediaPeriod");

    /* JADX INFO: renamed from: fof$b */
    public final class C5908b implements nle {

        /* JADX INFO: renamed from: d */
        public static final int f37284d = 0;

        /* JADX INFO: renamed from: e */
        public static final int f37285e = 1;

        /* JADX INFO: renamed from: f */
        public static final int f37286f = 2;

        /* JADX INFO: renamed from: a */
        public int f37287a;

        /* JADX INFO: renamed from: b */
        public boolean f37288b;

        private C5908b() {
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.f37288b) {
                return;
            }
            fof.this.f37281e.downstreamFormatChanged(sva.getTrackType(fof.this.f37272H.f54989M), fof.this.f37272H, 0, null, 0L);
            this.f37288b = true;
        }

        @Override // p000.nle
        public boolean isReady() {
            return fof.this.f37274M;
        }

        @Override // p000.nle
        public void maybeThrowError() throws IOException {
            fof fofVar = fof.this;
            if (fofVar.f37273L) {
                return;
            }
            fofVar.f37271F.maybeThrowError();
        }

        @Override // p000.nle
        public int readData(nq6 nq6Var, sl3 sl3Var, int i) {
            maybeNotifyDownstreamFormat();
            fof fofVar = fof.this;
            boolean z = fofVar.f37274M;
            if (z && fofVar.f37275N == null) {
                this.f37287a = 2;
            }
            int i2 = this.f37287a;
            if (i2 == 2) {
                sl3Var.addFlag(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                nq6Var.f65258b = fofVar.f37272H;
                this.f37287a = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            u80.checkNotNull(fofVar.f37275N);
            sl3Var.addFlag(1);
            sl3Var.f82164f = 0L;
            if ((i & 4) == 0) {
                sl3Var.ensureSpaceForWrite(fof.this.f37276Q);
                ByteBuffer byteBuffer = sl3Var.f82162d;
                fof fofVar2 = fof.this;
                byteBuffer.put(fofVar2.f37275N, 0, fofVar2.f37276Q);
            }
            if ((i & 1) == 0) {
                this.f37287a = 2;
            }
            return -4;
        }

        public void reset() {
            if (this.f37287a == 2) {
                this.f37287a = 1;
            }
        }

        @Override // p000.nle
        public int skipData(long j) {
            maybeNotifyDownstreamFormat();
            if (j <= 0 || this.f37287a == 2) {
                return 0;
            }
            this.f37287a = 2;
            return 1;
        }
    }

    /* JADX INFO: renamed from: fof$c */
    public static final class C5909c implements vc9.InterfaceC13997e {

        /* JADX INFO: renamed from: a */
        public final long f37290a = jc9.getNewId();

        /* JADX INFO: renamed from: b */
        public final yh3 f37291b;

        /* JADX INFO: renamed from: c */
        public final i4g f37292c;

        /* JADX INFO: renamed from: d */
        @hib
        public byte[] f37293d;

        public C5909c(yh3 yh3Var, ih3 ih3Var) {
            this.f37291b = yh3Var;
            this.f37292c = new i4g(ih3Var);
        }

        @Override // p000.vc9.InterfaceC13997e
        public void cancelLoad() {
        }

        @Override // p000.vc9.InterfaceC13997e
        public void load() throws IOException {
            this.f37292c.resetBytesRead();
            try {
                this.f37292c.open(this.f37291b);
                int i = 0;
                while (i != -1) {
                    int bytesRead = (int) this.f37292c.getBytesRead();
                    byte[] bArr = this.f37293d;
                    if (bArr == null) {
                        this.f37293d = new byte[1024];
                    } else if (bytesRead == bArr.length) {
                        this.f37293d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    i4g i4gVar = this.f37292c;
                    byte[] bArr2 = this.f37293d;
                    i = i4gVar.read(bArr2, bytesRead, bArr2.length - bytesRead);
                }
                vh3.closeQuietly(this.f37292c);
            } catch (Throwable th) {
                vh3.closeQuietly(this.f37292c);
                throw th;
            }
        }
    }

    public fof(yh3 yh3Var, ih3.InterfaceC7283a interfaceC7283a, @hib pdh pdhVar, kq6 kq6Var, long j, ic9 ic9Var, koa.C8476a c8476a, boolean z) {
        this.f37277a = yh3Var;
        this.f37278b = interfaceC7283a;
        this.f37279c = pdhVar;
        this.f37272H = kq6Var;
        this.f37270C = j;
        this.f37280d = ic9Var;
        this.f37281e = c8476a;
        this.f37273L = z;
        this.f37282f = new m6h(new g6h(kq6Var));
    }

    @Override // p000.nja, p000.zye
    public boolean continueLoading(long j) {
        if (this.f37274M || this.f37271F.isLoading() || this.f37271F.hasFatalError()) {
            return false;
        }
        ih3 ih3VarCreateDataSource = this.f37278b.createDataSource();
        pdh pdhVar = this.f37279c;
        if (pdhVar != null) {
            ih3VarCreateDataSource.addTransferListener(pdhVar);
        }
        C5909c c5909c = new C5909c(this.f37277a, ih3VarCreateDataSource);
        this.f37281e.loadStarted(new jc9(c5909c.f37290a, this.f37277a, this.f37271F.startLoading(c5909c, this, this.f37280d.getMinimumLoadableRetryCount(1))), 1, -1, this.f37272H, 0, null, 0L, this.f37270C);
        return true;
    }

    @Override // p000.nja
    public void discardBuffer(long j, boolean z) {
    }

    @Override // p000.nja
    public long getAdjustedSeekPositionUs(long j, iue iueVar) {
        return j;
    }

    @Override // p000.nja, p000.zye
    public long getBufferedPositionUs() {
        return this.f37274M ? Long.MIN_VALUE : 0L;
    }

    @Override // p000.nja, p000.zye
    public long getNextLoadPositionUs() {
        return (this.f37274M || this.f37271F.isLoading()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p000.nja
    public m6h getTrackGroups() {
        return this.f37282f;
    }

    @Override // p000.nja, p000.zye
    public boolean isLoading() {
        return this.f37271F.isLoading();
    }

    @Override // p000.nja
    public void maybeThrowPrepareError() {
    }

    @Override // p000.nja
    public void prepare(nja.InterfaceC9906a interfaceC9906a, long j) {
        interfaceC9906a.onPrepared(this);
    }

    @Override // p000.nja
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // p000.nja, p000.zye
    public void reevaluateBuffer(long j) {
    }

    public void release() {
        this.f37271F.release();
    }

    @Override // p000.nja
    public long seekToUs(long j) {
        for (int i = 0; i < this.f37283m.size(); i++) {
            this.f37283m.get(i).reset();
        }
        return j;
    }

    @Override // p000.nja
    public long selectTracks(pf5[] pf5VarArr, boolean[] zArr, nle[] nleVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < pf5VarArr.length; i++) {
            nle nleVar = nleVarArr[i];
            if (nleVar != null && (pf5VarArr[i] == null || !zArr[i])) {
                this.f37283m.remove(nleVar);
                nleVarArr[i] = null;
            }
            if (nleVarArr[i] == null && pf5VarArr[i] != null) {
                C5908b c5908b = new C5908b();
                this.f37283m.add(c5908b);
                nleVarArr[i] = c5908b;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // p000.vc9.InterfaceC13994b
    public void onLoadCanceled(C5909c c5909c, long j, long j2, boolean z) {
        i4g i4gVar = c5909c.f37292c;
        jc9 jc9Var = new jc9(c5909c.f37290a, c5909c.f37291b, i4gVar.getLastOpenedUri(), i4gVar.getLastResponseHeaders(), j, j2, i4gVar.getBytesRead());
        this.f37280d.onLoadTaskConcluded(c5909c.f37290a);
        this.f37281e.loadCanceled(jc9Var, 1, -1, null, 0, null, 0L, this.f37270C);
    }

    @Override // p000.vc9.InterfaceC13994b
    public void onLoadCompleted(C5909c c5909c, long j, long j2) {
        this.f37276Q = (int) c5909c.f37292c.getBytesRead();
        this.f37275N = (byte[]) u80.checkNotNull(c5909c.f37293d);
        this.f37274M = true;
        i4g i4gVar = c5909c.f37292c;
        jc9 jc9Var = new jc9(c5909c.f37290a, c5909c.f37291b, i4gVar.getLastOpenedUri(), i4gVar.getLastResponseHeaders(), j, j2, this.f37276Q);
        this.f37280d.onLoadTaskConcluded(c5909c.f37290a);
        this.f37281e.loadCompleted(jc9Var, 1, -1, this.f37272H, 0, null, 0L, this.f37270C);
    }

    @Override // p000.vc9.InterfaceC13994b
    public vc9.C13995c onLoadError(C5909c c5909c, long j, long j2, IOException iOException, int i) {
        vc9.C13995c c13995cCreateRetryAction;
        i4g i4gVar = c5909c.f37292c;
        jc9 jc9Var = new jc9(c5909c.f37290a, c5909c.f37291b, i4gVar.getLastOpenedUri(), i4gVar.getLastResponseHeaders(), j, j2, i4gVar.getBytesRead());
        long retryDelayMsFor = this.f37280d.getRetryDelayMsFor(new ic9.C7232d(jc9Var, new ega(1, -1, this.f37272H, 0, null, 0L, x0i.usToMs(this.f37270C)), iOException, i));
        boolean z = retryDelayMsFor == -9223372036854775807L || i >= this.f37280d.getMinimumLoadableRetryCount(1);
        if (this.f37273L && z) {
            yh9.m25920w("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f37274M = true;
            c13995cCreateRetryAction = vc9.f90624k;
        } else {
            c13995cCreateRetryAction = retryDelayMsFor != -9223372036854775807L ? vc9.createRetryAction(false, retryDelayMsFor) : vc9.f90625l;
        }
        vc9.C13995c c13995c = c13995cCreateRetryAction;
        boolean zIsRetry = c13995c.isRetry();
        this.f37281e.loadError(jc9Var, 1, -1, this.f37272H, 0, null, 0L, this.f37270C, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.f37280d.onLoadTaskConcluded(c5909c.f37290a);
        }
        return c13995c;
    }
}
