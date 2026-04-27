package p000;

import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p000.gh3;
import p000.hc9;
import p000.joa;
import p000.mja;
import p000.uc9;

/* JADX INFO: loaded from: classes3.dex */
public final class eof implements mja, uc9.InterfaceC13490b<C5419c> {

    /* JADX INFO: renamed from: X */
    public static final String f33731X = "SingleSampleMediaPeriod";

    /* JADX INFO: renamed from: Y */
    public static final int f33732Y = 1024;

    /* JADX INFO: renamed from: C */
    public final long f33733C;

    /* JADX INFO: renamed from: F */
    public final uc9 f33734F;

    /* JADX INFO: renamed from: H */
    public final C1213a f33735H;

    /* JADX INFO: renamed from: L */
    public final boolean f33736L;

    /* JADX INFO: renamed from: M */
    public boolean f33737M;

    /* JADX INFO: renamed from: N */
    public byte[] f33738N;

    /* JADX INFO: renamed from: Q */
    public int f33739Q;

    /* JADX INFO: renamed from: a */
    public final xh3 f33740a;

    /* JADX INFO: renamed from: b */
    public final gh3.InterfaceC6313a f33741b;

    /* JADX INFO: renamed from: c */
    @hib
    public final qdh f33742c;

    /* JADX INFO: renamed from: d */
    public final hc9 f33743d;

    /* JADX INFO: renamed from: e */
    public final joa.C7994a f33744e;

    /* JADX INFO: renamed from: f */
    public final n6h f33745f;

    /* JADX INFO: renamed from: m */
    public final ArrayList<C5418b> f33746m = new ArrayList<>();

    /* JADX INFO: renamed from: eof$b */
    public final class C5418b implements mle {

        /* JADX INFO: renamed from: d */
        public static final int f33747d = 0;

        /* JADX INFO: renamed from: e */
        public static final int f33748e = 1;

        /* JADX INFO: renamed from: f */
        public static final int f33749f = 2;

        /* JADX INFO: renamed from: a */
        public int f33750a;

        /* JADX INFO: renamed from: b */
        public boolean f33751b;

        private C5418b() {
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.f33751b) {
                return;
            }
            eof.this.f33744e.downstreamFormatChanged(rva.getTrackType(eof.this.f33735H.f8291o), eof.this.f33735H, 0, null, 0L);
            this.f33751b = true;
        }

        @Override // p000.mle
        public boolean isReady() {
            return eof.this.f33737M;
        }

        @Override // p000.mle
        public void maybeThrowError() throws IOException {
            eof eofVar = eof.this;
            if (eofVar.f33736L) {
                return;
            }
            eofVar.f33734F.maybeThrowError();
        }

        @Override // p000.mle
        public int readData(oq6 oq6Var, rl3 rl3Var, int i) {
            maybeNotifyDownstreamFormat();
            eof eofVar = eof.this;
            boolean z = eofVar.f33737M;
            if (z && eofVar.f33738N == null) {
                this.f33750a = 2;
            }
            int i2 = this.f33750a;
            if (i2 == 2) {
                rl3Var.addFlag(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                oq6Var.f68294b = eofVar.f33735H;
                this.f33750a = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            v80.checkNotNull(eofVar.f33738N);
            rl3Var.addFlag(1);
            rl3Var.f78610f = 0L;
            if ((i & 4) == 0) {
                rl3Var.ensureSpaceForWrite(eof.this.f33739Q);
                ByteBuffer byteBuffer = rl3Var.f78608d;
                eof eofVar2 = eof.this;
                byteBuffer.put(eofVar2.f33738N, 0, eofVar2.f33739Q);
            }
            if ((i & 1) == 0) {
                this.f33750a = 2;
            }
            return -4;
        }

        public void reset() {
            if (this.f33750a == 2) {
                this.f33750a = 1;
            }
        }

        @Override // p000.mle
        public int skipData(long j) {
            maybeNotifyDownstreamFormat();
            if (j <= 0 || this.f33750a == 2) {
                return 0;
            }
            this.f33750a = 2;
            return 1;
        }
    }

    /* JADX INFO: renamed from: eof$c */
    public static final class C5419c implements uc9.InterfaceC13493e {

        /* JADX INFO: renamed from: a */
        public final long f33753a = kc9.getNewId();

        /* JADX INFO: renamed from: b */
        public final xh3 f33754b;

        /* JADX INFO: renamed from: c */
        public final j4g f33755c;

        /* JADX INFO: renamed from: d */
        @hib
        public byte[] f33756d;

        public C5419c(xh3 xh3Var, gh3 gh3Var) {
            this.f33754b = xh3Var;
            this.f33755c = new j4g(gh3Var);
        }

        @Override // p000.uc9.InterfaceC13493e
        public void cancelLoad() {
        }

        @Override // p000.uc9.InterfaceC13493e
        public void load() throws IOException {
            this.f33755c.resetBytesRead();
            try {
                this.f33755c.open(this.f33754b);
                int i = 0;
                while (i != -1) {
                    int bytesRead = (int) this.f33755c.getBytesRead();
                    byte[] bArr = this.f33756d;
                    if (bArr == null) {
                        this.f33756d = new byte[1024];
                    } else if (bytesRead == bArr.length) {
                        this.f33756d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    j4g j4gVar = this.f33755c;
                    byte[] bArr2 = this.f33756d;
                    i = j4gVar.read(bArr2, bytesRead, bArr2.length - bytesRead);
                }
                wh3.closeQuietly(this.f33755c);
            } catch (Throwable th) {
                wh3.closeQuietly(this.f33755c);
                throw th;
            }
        }
    }

    public eof(xh3 xh3Var, gh3.InterfaceC6313a interfaceC6313a, @hib qdh qdhVar, C1213a c1213a, long j, hc9 hc9Var, joa.C7994a c7994a, boolean z, @hib yxd yxdVar) {
        this.f33740a = xh3Var;
        this.f33741b = interfaceC6313a;
        this.f33742c = qdhVar;
        this.f33735H = c1213a;
        this.f33733C = j;
        this.f33743d = hc9Var;
        this.f33744e = c7994a;
        this.f33736L = z;
        this.f33745f = new n6h(new h6h(c1213a));
        this.f33734F = yxdVar != null ? new uc9(yxdVar) : new uc9("SingleSampleMediaPeriod");
    }

    @Override // p000.mja, p000.yye
    public boolean continueLoading(C1233k c1233k) {
        if (this.f33737M || this.f33734F.isLoading() || this.f33734F.hasFatalError()) {
            return false;
        }
        gh3 gh3VarCreateDataSource = this.f33741b.createDataSource();
        qdh qdhVar = this.f33742c;
        if (qdhVar != null) {
            gh3VarCreateDataSource.addTransferListener(qdhVar);
        }
        this.f33734F.startLoading(new C5419c(this.f33740a, gh3VarCreateDataSource), this, this.f33743d.getMinimumLoadableRetryCount(1));
        return true;
    }

    @Override // p000.mja
    public void discardBuffer(long j, boolean z) {
    }

    @Override // p000.mja
    public long getAdjustedSeekPositionUs(long j, jue jueVar) {
        return j;
    }

    @Override // p000.mja, p000.yye
    public long getBufferedPositionUs() {
        return this.f33737M ? Long.MIN_VALUE : 0L;
    }

    @Override // p000.mja, p000.yye
    public long getNextLoadPositionUs() {
        return (this.f33737M || this.f33734F.isLoading()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p000.mja
    public n6h getTrackGroups() {
        return this.f33745f;
    }

    @Override // p000.mja, p000.yye
    public boolean isLoading() {
        return this.f33734F.isLoading();
    }

    @Override // p000.mja
    public void maybeThrowPrepareError() {
    }

    @Override // p000.mja
    public void prepare(mja.InterfaceC9368a interfaceC9368a, long j) {
        interfaceC9368a.onPrepared(this);
    }

    @Override // p000.mja
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // p000.mja, p000.yye
    public void reevaluateBuffer(long j) {
    }

    public void release() {
        this.f33734F.release();
    }

    @Override // p000.mja
    public long seekToUs(long j) {
        for (int i = 0; i < this.f33746m.size(); i++) {
            this.f33746m.get(i).reset();
        }
        return j;
    }

    @Override // p000.mja
    public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < of5VarArr.length; i++) {
            mle mleVar = mleVarArr[i];
            if (mleVar != null && (of5VarArr[i] == null || !zArr[i])) {
                this.f33746m.remove(mleVar);
                mleVarArr[i] = null;
            }
            if (mleVarArr[i] == null && of5VarArr[i] != null) {
                C5418b c5418b = new C5418b();
                this.f33746m.add(c5418b);
                mleVarArr[i] = c5418b;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // p000.uc9.InterfaceC13490b
    public void onLoadCanceled(C5419c c5419c, long j, long j2, boolean z) {
        j4g j4gVar = c5419c.f33755c;
        kc9 kc9Var = new kc9(c5419c.f33753a, c5419c.f33754b, j4gVar.getLastOpenedUri(), j4gVar.getLastResponseHeaders(), j, j2, j4gVar.getBytesRead());
        this.f33743d.onLoadTaskConcluded(c5419c.f33753a);
        this.f33744e.loadCanceled(kc9Var, 1, -1, null, 0, null, 0L, this.f33733C);
    }

    @Override // p000.uc9.InterfaceC13490b
    public void onLoadCompleted(C5419c c5419c, long j, long j2) {
        this.f33739Q = (int) c5419c.f33755c.getBytesRead();
        this.f33738N = (byte[]) v80.checkNotNull(c5419c.f33756d);
        this.f33737M = true;
        j4g j4gVar = c5419c.f33755c;
        kc9 kc9Var = new kc9(c5419c.f33753a, c5419c.f33754b, j4gVar.getLastOpenedUri(), j4gVar.getLastResponseHeaders(), j, j2, this.f33739Q);
        this.f33743d.onLoadTaskConcluded(c5419c.f33753a);
        this.f33744e.loadCompleted(kc9Var, 1, -1, this.f33735H, 0, null, 0L, this.f33733C);
    }

    @Override // p000.uc9.InterfaceC13490b
    public uc9.C13491c onLoadError(C5419c c5419c, long j, long j2, IOException iOException, int i) {
        uc9.C13491c c13491cCreateRetryAction;
        j4g j4gVar = c5419c.f33755c;
        kc9 kc9Var = new kc9(c5419c.f33753a, c5419c.f33754b, j4gVar.getLastOpenedUri(), j4gVar.getLastResponseHeaders(), j, j2, j4gVar.getBytesRead());
        long retryDelayMsFor = this.f33743d.getRetryDelayMsFor(new hc9.C6795d(kc9Var, new fga(1, -1, this.f33735H, 0, null, 0L, t0i.usToMs(this.f33733C)), iOException, i));
        boolean z = retryDelayMsFor == -9223372036854775807L || i >= this.f33743d.getMinimumLoadableRetryCount(1);
        if (this.f33736L && z) {
            xh9.m25149w("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f33737M = true;
            c13491cCreateRetryAction = uc9.f87553k;
        } else {
            c13491cCreateRetryAction = retryDelayMsFor != -9223372036854775807L ? uc9.createRetryAction(false, retryDelayMsFor) : uc9.f87554l;
        }
        uc9.C13491c c13491c = c13491cCreateRetryAction;
        boolean zIsRetry = c13491c.isRetry();
        this.f33744e.loadError(kc9Var, 1, -1, this.f33735H, 0, null, 0L, this.f33733C, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.f33743d.onLoadTaskConcluded(c5419c.f33753a);
        }
        return c13491c;
    }

    @Override // p000.uc9.InterfaceC13490b
    public void onLoadStarted(C5419c c5419c, long j, long j2, int i) {
        j4g j4gVar = c5419c.f33755c;
        this.f33744e.loadStarted(i == 0 ? new kc9(c5419c.f33753a, c5419c.f33754b, j) : new kc9(c5419c.f33753a, c5419c.f33754b, j4gVar.getLastOpenedUri(), j4gVar.getLastResponseHeaders(), j, j2, j4gVar.getBytesRead()), 1, -1, this.f33735H, 0, null, 0L, this.f33733C, i);
    }
}
