package p000;

import com.google.android.exoplayer2.drm.InterfaceC3005e;
import com.google.android.exoplayer2.drm.InterfaceC3006f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.ic9;
import p000.koa;
import p000.sz1;
import p000.vc9;
import p000.zye;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class rz1<T extends sz1> implements nle, zye, vc9.InterfaceC13994b<fz1>, vc9.InterfaceC13998f {

    /* JADX INFO: renamed from: d2 */
    public static final String f80146d2 = "ChunkSampleStream";

    /* JADX INFO: renamed from: C */
    public final ic9 f80147C;

    /* JADX INFO: renamed from: F */
    public final vc9 f80148F;

    /* JADX INFO: renamed from: H */
    public final jz1 f80149H;

    /* JADX INFO: renamed from: L */
    public final ArrayList<xr0> f80150L;

    /* JADX INFO: renamed from: M */
    public final List<xr0> f80151M;

    /* JADX INFO: renamed from: M1 */
    @hib
    public InterfaceC12375b<T> f80152M1;

    /* JADX INFO: renamed from: N */
    public final lle f80153N;

    /* JADX INFO: renamed from: Q */
    public final lle[] f80154Q;

    /* JADX INFO: renamed from: V1 */
    public long f80155V1;

    /* JADX INFO: renamed from: X */
    public final bs0 f80156X;

    /* JADX INFO: renamed from: Y */
    @hib
    public fz1 f80157Y;

    /* JADX INFO: renamed from: Z */
    public kq6 f80158Z;

    /* JADX INFO: renamed from: Z1 */
    public long f80159Z1;

    /* JADX INFO: renamed from: a */
    public final int f80160a;

    /* JADX INFO: renamed from: a2 */
    public int f80161a2;

    /* JADX INFO: renamed from: b */
    public final int[] f80162b;

    /* JADX INFO: renamed from: b2 */
    @hib
    public xr0 f80163b2;

    /* JADX INFO: renamed from: c */
    public final kq6[] f80164c;

    /* JADX INFO: renamed from: c2 */
    public boolean f80165c2;

    /* JADX INFO: renamed from: d */
    public final boolean[] f80166d;

    /* JADX INFO: renamed from: e */
    public final T f80167e;

    /* JADX INFO: renamed from: f */
    public final zye.InterfaceC16321a<rz1<T>> f80168f;

    /* JADX INFO: renamed from: m */
    public final koa.C8476a f80169m;

    /* JADX INFO: renamed from: rz1$a */
    public final class C12374a implements nle {

        /* JADX INFO: renamed from: a */
        public final rz1<T> f80170a;

        /* JADX INFO: renamed from: b */
        public final lle f80171b;

        /* JADX INFO: renamed from: c */
        public final int f80172c;

        /* JADX INFO: renamed from: d */
        public boolean f80173d;

        public C12374a(rz1<T> rz1Var, lle lleVar, int i) {
            this.f80170a = rz1Var;
            this.f80171b = lleVar;
            this.f80172c = i;
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.f80173d) {
                return;
            }
            rz1.this.f80169m.downstreamFormatChanged(rz1.this.f80162b[this.f80172c], rz1.this.f80164c[this.f80172c], 0, null, rz1.this.f80159Z1);
            this.f80173d = true;
        }

        @Override // p000.nle
        public boolean isReady() {
            return !rz1.this.m21613g() && this.f80171b.isReady(rz1.this.f80165c2);
        }

        @Override // p000.nle
        public void maybeThrowError() {
        }

        @Override // p000.nle
        public int readData(nq6 nq6Var, sl3 sl3Var, int i) {
            if (rz1.this.m21613g()) {
                return -3;
            }
            if (rz1.this.f80163b2 != null && rz1.this.f80163b2.getFirstSampleIndex(this.f80172c + 1) <= this.f80171b.getReadIndex()) {
                return -3;
            }
            maybeNotifyDownstreamFormat();
            return this.f80171b.read(nq6Var, sl3Var, i, rz1.this.f80165c2);
        }

        public void release() {
            u80.checkState(rz1.this.f80166d[this.f80172c]);
            rz1.this.f80166d[this.f80172c] = false;
        }

        @Override // p000.nle
        public int skipData(long j) {
            if (rz1.this.m21613g()) {
                return 0;
            }
            int skipCount = this.f80171b.getSkipCount(j, rz1.this.f80165c2);
            if (rz1.this.f80163b2 != null) {
                skipCount = Math.min(skipCount, rz1.this.f80163b2.getFirstSampleIndex(this.f80172c + 1) - this.f80171b.getReadIndex());
            }
            this.f80171b.skip(skipCount);
            if (skipCount > 0) {
                maybeNotifyDownstreamFormat();
            }
            return skipCount;
        }
    }

    /* JADX INFO: renamed from: rz1$b */
    public interface InterfaceC12375b<T extends sz1> {
        void onSampleStreamReleased(rz1<T> rz1Var);
    }

    public rz1(int i, @hib int[] iArr, @hib kq6[] kq6VarArr, T t, zye.InterfaceC16321a<rz1<T>> interfaceC16321a, InterfaceC6430gn interfaceC6430gn, long j, InterfaceC3006f interfaceC3006f, InterfaceC3005e.a aVar, ic9 ic9Var, koa.C8476a c8476a) {
        this.f80160a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f80162b = iArr;
        this.f80164c = kq6VarArr == null ? new kq6[0] : kq6VarArr;
        this.f80167e = t;
        this.f80168f = interfaceC16321a;
        this.f80169m = c8476a;
        this.f80147C = ic9Var;
        this.f80148F = new vc9("ChunkSampleStream");
        this.f80149H = new jz1();
        ArrayList<xr0> arrayList = new ArrayList<>();
        this.f80150L = arrayList;
        this.f80151M = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f80154Q = new lle[length];
        this.f80166d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        lle[] lleVarArr = new lle[i3];
        lle lleVarCreateWithDrm = lle.createWithDrm(interfaceC6430gn, interfaceC3006f, aVar);
        this.f80153N = lleVarCreateWithDrm;
        iArr2[0] = i;
        lleVarArr[0] = lleVarCreateWithDrm;
        while (i2 < length) {
            lle lleVarCreateWithoutDrm = lle.createWithoutDrm(interfaceC6430gn);
            this.f80154Q[i2] = lleVarCreateWithoutDrm;
            int i4 = i2 + 1;
            lleVarArr[i4] = lleVarCreateWithoutDrm;
            iArr2[i4] = this.f80162b[i2];
            i2 = i4;
        }
        this.f80156X = new bs0(iArr2, lleVarArr);
        this.f80155V1 = j;
        this.f80159Z1 = j;
    }

    private void discardDownstreamMediaChunks(int i) {
        int iMin = Math.min(primarySampleIndexToMediaChunkIndex(i, 0), this.f80161a2);
        if (iMin > 0) {
            x0i.removeRange(this.f80150L, 0, iMin);
            this.f80161a2 -= iMin;
        }
    }

    private void discardUpstream(int i) {
        u80.checkState(!this.f80148F.isLoading());
        int size = this.f80150L.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!haveReadFromMediaChunk(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = getLastMediaChunk().f38050h;
        xr0 xr0VarDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i);
        if (this.f80150L.isEmpty()) {
            this.f80155V1 = this.f80159Z1;
        }
        this.f80165c2 = false;
        this.f80169m.upstreamDiscarded(this.f80160a, xr0VarDiscardUpstreamMediaChunksFromIndex.f38049g, j);
    }

    private xr0 discardUpstreamMediaChunksFromIndex(int i) {
        xr0 xr0Var = this.f80150L.get(i);
        ArrayList<xr0> arrayList = this.f80150L;
        x0i.removeRange(arrayList, i, arrayList.size());
        this.f80161a2 = Math.max(this.f80161a2, this.f80150L.size());
        int i2 = 0;
        this.f80153N.discardUpstreamSamples(xr0Var.getFirstSampleIndex(0));
        while (true) {
            lle[] lleVarArr = this.f80154Q;
            if (i2 >= lleVarArr.length) {
                return xr0Var;
            }
            lle lleVar = lleVarArr[i2];
            i2++;
            lleVar.discardUpstreamSamples(xr0Var.getFirstSampleIndex(i2));
        }
    }

    private xr0 getLastMediaChunk() {
        return this.f80150L.get(r0.size() - 1);
    }

    private boolean haveReadFromMediaChunk(int i) {
        int readIndex;
        xr0 xr0Var = this.f80150L.get(i);
        if (this.f80153N.getReadIndex() > xr0Var.getFirstSampleIndex(0)) {
            return true;
        }
        int i2 = 0;
        do {
            lle[] lleVarArr = this.f80154Q;
            if (i2 >= lleVarArr.length) {
                return false;
            }
            readIndex = lleVarArr[i2].getReadIndex();
            i2++;
        } while (readIndex <= xr0Var.getFirstSampleIndex(i2));
        return true;
    }

    private boolean isMediaChunk(fz1 fz1Var) {
        return fz1Var instanceof xr0;
    }

    private void maybeNotifyPrimaryTrackFormatChanged() {
        int iPrimarySampleIndexToMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.f80153N.getReadIndex(), this.f80161a2 - 1);
        while (true) {
            int i = this.f80161a2;
            if (i > iPrimarySampleIndexToMediaChunkIndex) {
                return;
            }
            this.f80161a2 = i + 1;
            maybeNotifyPrimaryTrackFormatChanged(i);
        }
    }

    private int primarySampleIndexToMediaChunkIndex(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f80150L.size()) {
                return this.f80150L.size() - 1;
            }
        } while (this.f80150L.get(i2).getFirstSampleIndex(0) <= i);
        return i2 - 1;
    }

    private void resetSampleQueues() {
        this.f80153N.reset();
        for (lle lleVar : this.f80154Q) {
            lleVar.reset();
        }
    }

    @Override // p000.zye
    public boolean continueLoading(long j) {
        List<xr0> listEmptyList;
        long j2;
        if (this.f80165c2 || this.f80148F.isLoading() || this.f80148F.hasFatalError()) {
            return false;
        }
        boolean zM21613g = m21613g();
        if (zM21613g) {
            listEmptyList = Collections.emptyList();
            j2 = this.f80155V1;
        } else {
            listEmptyList = this.f80151M;
            j2 = getLastMediaChunk().f38050h;
        }
        this.f80167e.getNextChunk(j, j2, listEmptyList, this.f80149H);
        jz1 jz1Var = this.f80149H;
        boolean z = jz1Var.f52261b;
        fz1 fz1Var = jz1Var.f52260a;
        jz1Var.clear();
        if (z) {
            this.f80155V1 = -9223372036854775807L;
            this.f80165c2 = true;
            return true;
        }
        if (fz1Var == null) {
            return false;
        }
        this.f80157Y = fz1Var;
        if (isMediaChunk(fz1Var)) {
            xr0 xr0Var = (xr0) fz1Var;
            if (zM21613g) {
                long j3 = xr0Var.f38049g;
                long j4 = this.f80155V1;
                if (j3 != j4) {
                    this.f80153N.setStartTimeUs(j4);
                    for (lle lleVar : this.f80154Q) {
                        lleVar.setStartTimeUs(this.f80155V1);
                    }
                }
                this.f80155V1 = -9223372036854775807L;
            }
            xr0Var.init(this.f80156X);
            this.f80150L.add(xr0Var);
        } else if (fz1Var instanceof m18) {
            ((m18) fz1Var).init(this.f80156X);
        }
        this.f80169m.loadStarted(new jc9(fz1Var.f38043a, fz1Var.f38044b, this.f80148F.startLoading(fz1Var, this, this.f80147C.getMinimumLoadableRetryCount(fz1Var.f38045c))), fz1Var.f38045c, this.f80160a, fz1Var.f38046d, fz1Var.f38047e, fz1Var.f38048f, fz1Var.f38049g, fz1Var.f38050h);
        return true;
    }

    public void discardBuffer(long j, boolean z) {
        if (m21613g()) {
            return;
        }
        int firstIndex = this.f80153N.getFirstIndex();
        this.f80153N.discardTo(j, z, true);
        int firstIndex2 = this.f80153N.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = this.f80153N.getFirstTimestampUs();
            int i = 0;
            while (true) {
                lle[] lleVarArr = this.f80154Q;
                if (i >= lleVarArr.length) {
                    break;
                }
                lleVarArr[i].discardTo(firstTimestampUs, z, this.f80166d[i]);
                i++;
            }
        }
        discardDownstreamMediaChunks(firstIndex2);
    }

    /* JADX INFO: renamed from: g */
    public boolean m21613g() {
        return this.f80155V1 != -9223372036854775807L;
    }

    public long getAdjustedSeekPositionUs(long j, iue iueVar) {
        return this.f80167e.getAdjustedSeekPositionUs(j, iueVar);
    }

    @Override // p000.zye
    public long getBufferedPositionUs() {
        if (this.f80165c2) {
            return Long.MIN_VALUE;
        }
        if (m21613g()) {
            return this.f80155V1;
        }
        long jMax = this.f80159Z1;
        xr0 lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.f80150L.size() > 1) {
                lastMediaChunk = this.f80150L.get(r2.size() - 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            jMax = Math.max(jMax, lastMediaChunk.f38050h);
        }
        return Math.max(jMax, this.f80153N.getLargestQueuedTimestampUs());
    }

    public T getChunkSource() {
        return this.f80167e;
    }

    @Override // p000.zye
    public long getNextLoadPositionUs() {
        if (m21613g()) {
            return this.f80155V1;
        }
        if (this.f80165c2) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().f38050h;
    }

    @Override // p000.zye
    public boolean isLoading() {
        return this.f80148F.isLoading();
    }

    @Override // p000.nle
    public boolean isReady() {
        return !m21613g() && this.f80153N.isReady(this.f80165c2);
    }

    @Override // p000.nle
    public void maybeThrowError() throws IOException {
        this.f80148F.maybeThrowError();
        this.f80153N.maybeThrowError();
        if (this.f80148F.isLoading()) {
            return;
        }
        this.f80167e.maybeThrowError();
    }

    @Override // p000.vc9.InterfaceC13998f
    public void onLoaderReleased() {
        this.f80153N.release();
        for (lle lleVar : this.f80154Q) {
            lleVar.release();
        }
        this.f80167e.release();
        InterfaceC12375b<T> interfaceC12375b = this.f80152M1;
        if (interfaceC12375b != null) {
            interfaceC12375b.onSampleStreamReleased(this);
        }
    }

    @Override // p000.nle
    public int readData(nq6 nq6Var, sl3 sl3Var, int i) {
        if (m21613g()) {
            return -3;
        }
        xr0 xr0Var = this.f80163b2;
        if (xr0Var != null && xr0Var.getFirstSampleIndex(0) <= this.f80153N.getReadIndex()) {
            return -3;
        }
        maybeNotifyPrimaryTrackFormatChanged();
        return this.f80153N.read(nq6Var, sl3Var, i, this.f80165c2);
    }

    @Override // p000.zye
    public void reevaluateBuffer(long j) {
        if (this.f80148F.hasFatalError() || m21613g()) {
            return;
        }
        if (!this.f80148F.isLoading()) {
            int preferredQueueSize = this.f80167e.getPreferredQueueSize(j, this.f80151M);
            if (preferredQueueSize < this.f80150L.size()) {
                discardUpstream(preferredQueueSize);
                return;
            }
            return;
        }
        fz1 fz1Var = (fz1) u80.checkNotNull(this.f80157Y);
        if (!(isMediaChunk(fz1Var) && haveReadFromMediaChunk(this.f80150L.size() - 1)) && this.f80167e.shouldCancelLoad(j, fz1Var, this.f80151M)) {
            this.f80148F.cancelLoading();
            if (isMediaChunk(fz1Var)) {
                this.f80163b2 = (xr0) fz1Var;
            }
        }
    }

    public void release() {
        release(null);
    }

    public void seekToUs(long j) {
        xr0 xr0Var;
        this.f80159Z1 = j;
        if (m21613g()) {
            this.f80155V1 = j;
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f80150L.size(); i2++) {
            xr0Var = this.f80150L.get(i2);
            long j2 = xr0Var.f38049g;
            if (j2 == j && xr0Var.f99009k == -9223372036854775807L) {
                break;
            } else {
                if (j2 > j) {
                    break;
                }
            }
        }
        xr0Var = null;
        if (xr0Var != null ? this.f80153N.seekTo(xr0Var.getFirstSampleIndex(0)) : this.f80153N.seekTo(j, j < getNextLoadPositionUs())) {
            this.f80161a2 = primarySampleIndexToMediaChunkIndex(this.f80153N.getReadIndex(), 0);
            lle[] lleVarArr = this.f80154Q;
            int length = lleVarArr.length;
            while (i < length) {
                lleVarArr[i].seekTo(j, true);
                i++;
            }
            return;
        }
        this.f80155V1 = j;
        this.f80165c2 = false;
        this.f80150L.clear();
        this.f80161a2 = 0;
        if (!this.f80148F.isLoading()) {
            this.f80148F.clearFatalError();
            resetSampleQueues();
            return;
        }
        this.f80153N.discardToEnd();
        lle[] lleVarArr2 = this.f80154Q;
        int length2 = lleVarArr2.length;
        while (i < length2) {
            lleVarArr2[i].discardToEnd();
            i++;
        }
        this.f80148F.cancelLoading();
    }

    public rz1<T>.C12374a selectEmbeddedTrack(long j, int i) {
        for (int i2 = 0; i2 < this.f80154Q.length; i2++) {
            if (this.f80162b[i2] == i) {
                u80.checkState(!this.f80166d[i2]);
                this.f80166d[i2] = true;
                this.f80154Q[i2].seekTo(j, true);
                return new C12374a(this, this.f80154Q[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // p000.nle
    public int skipData(long j) {
        if (m21613g()) {
            return 0;
        }
        int skipCount = this.f80153N.getSkipCount(j, this.f80165c2);
        xr0 xr0Var = this.f80163b2;
        if (xr0Var != null) {
            skipCount = Math.min(skipCount, xr0Var.getFirstSampleIndex(0) - this.f80153N.getReadIndex());
        }
        this.f80153N.skip(skipCount);
        maybeNotifyPrimaryTrackFormatChanged();
        return skipCount;
    }

    @Override // p000.vc9.InterfaceC13994b
    public void onLoadCanceled(fz1 fz1Var, long j, long j2, boolean z) {
        this.f80157Y = null;
        this.f80163b2 = null;
        jc9 jc9Var = new jc9(fz1Var.f38043a, fz1Var.f38044b, fz1Var.getUri(), fz1Var.getResponseHeaders(), j, j2, fz1Var.bytesLoaded());
        this.f80147C.onLoadTaskConcluded(fz1Var.f38043a);
        this.f80169m.loadCanceled(jc9Var, fz1Var.f38045c, this.f80160a, fz1Var.f38046d, fz1Var.f38047e, fz1Var.f38048f, fz1Var.f38049g, fz1Var.f38050h);
        if (z) {
            return;
        }
        if (m21613g()) {
            resetSampleQueues();
        } else if (isMediaChunk(fz1Var)) {
            discardUpstreamMediaChunksFromIndex(this.f80150L.size() - 1);
            if (this.f80150L.isEmpty()) {
                this.f80155V1 = this.f80159Z1;
            }
        }
        this.f80168f.onContinueLoadingRequested(this);
    }

    @Override // p000.vc9.InterfaceC13994b
    public void onLoadCompleted(fz1 fz1Var, long j, long j2) {
        this.f80157Y = null;
        this.f80167e.onChunkLoadCompleted(fz1Var);
        jc9 jc9Var = new jc9(fz1Var.f38043a, fz1Var.f38044b, fz1Var.getUri(), fz1Var.getResponseHeaders(), j, j2, fz1Var.bytesLoaded());
        this.f80147C.onLoadTaskConcluded(fz1Var.f38043a);
        this.f80169m.loadCompleted(jc9Var, fz1Var.f38045c, this.f80160a, fz1Var.f38046d, fz1Var.f38047e, fz1Var.f38048f, fz1Var.f38049g, fz1Var.f38050h);
        this.f80168f.onContinueLoadingRequested(this);
    }

    @Override // p000.vc9.InterfaceC13994b
    public vc9.C13995c onLoadError(fz1 fz1Var, long j, long j2, IOException iOException, int i) {
        vc9.C13995c c13995cCreateRetryAction;
        long jBytesLoaded = fz1Var.bytesLoaded();
        boolean zIsMediaChunk = isMediaChunk(fz1Var);
        int size = this.f80150L.size() - 1;
        boolean z = (jBytesLoaded != 0 && zIsMediaChunk && haveReadFromMediaChunk(size)) ? false : true;
        jc9 jc9Var = new jc9(fz1Var.f38043a, fz1Var.f38044b, fz1Var.getUri(), fz1Var.getResponseHeaders(), j, j2, jBytesLoaded);
        ic9.C7232d c7232d = new ic9.C7232d(jc9Var, new ega(fz1Var.f38045c, this.f80160a, fz1Var.f38046d, fz1Var.f38047e, fz1Var.f38048f, x0i.usToMs(fz1Var.f38049g), x0i.usToMs(fz1Var.f38050h)), iOException, i);
        if (!this.f80167e.onChunkLoadError(fz1Var, z, c7232d, this.f80147C)) {
            c13995cCreateRetryAction = null;
        } else if (z) {
            c13995cCreateRetryAction = vc9.f90624k;
            if (zIsMediaChunk) {
                u80.checkState(discardUpstreamMediaChunksFromIndex(size) == fz1Var);
                if (this.f80150L.isEmpty()) {
                    this.f80155V1 = this.f80159Z1;
                }
            }
        } else {
            yh9.m25919w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            c13995cCreateRetryAction = null;
        }
        if (c13995cCreateRetryAction == null) {
            long retryDelayMsFor = this.f80147C.getRetryDelayMsFor(c7232d);
            c13995cCreateRetryAction = retryDelayMsFor != -9223372036854775807L ? vc9.createRetryAction(false, retryDelayMsFor) : vc9.f90625l;
        }
        boolean zIsRetry = c13995cCreateRetryAction.isRetry();
        this.f80169m.loadError(jc9Var, fz1Var.f38045c, this.f80160a, fz1Var.f38046d, fz1Var.f38047e, fz1Var.f38048f, fz1Var.f38049g, fz1Var.f38050h, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.f80157Y = null;
            this.f80147C.onLoadTaskConcluded(fz1Var.f38043a);
            this.f80168f.onContinueLoadingRequested(this);
        }
        return c13995cCreateRetryAction;
    }

    public void release(@hib InterfaceC12375b<T> interfaceC12375b) {
        this.f80152M1 = interfaceC12375b;
        this.f80153N.preRelease();
        for (lle lleVar : this.f80154Q) {
            lleVar.preRelease();
        }
        this.f80148F.release(this);
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i) {
        xr0 xr0Var = this.f80150L.get(i);
        kq6 kq6Var = xr0Var.f38046d;
        if (!kq6Var.equals(this.f80158Z)) {
            this.f80169m.downstreamFormatChanged(this.f80160a, kq6Var, xr0Var.f38047e, xr0Var.f38048f, xr0Var.f38049g);
        }
        this.f80158Z = kq6Var;
    }
}
