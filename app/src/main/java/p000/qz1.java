package p000;

import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.C1233k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.hc9;
import p000.joa;
import p000.nr4;
import p000.tz1;
import p000.uc9;
import p000.yye;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class qz1<T extends tz1> implements mle, yye, uc9.InterfaceC13490b<gz1>, uc9.InterfaceC13494f {

    /* JADX INFO: renamed from: f2 */
    public static final String f76327f2 = "ChunkSampleStream";

    /* JADX INFO: renamed from: C */
    public final hc9 f76328C;

    /* JADX INFO: renamed from: F */
    public final uc9 f76329F;

    /* JADX INFO: renamed from: H */
    public final kz1 f76330H;

    /* JADX INFO: renamed from: L */
    public final ArrayList<yr0> f76331L;

    /* JADX INFO: renamed from: M */
    public final List<yr0> f76332M;

    /* JADX INFO: renamed from: M1 */
    @hib
    public InterfaceC11767b<T> f76333M1;

    /* JADX INFO: renamed from: N */
    public final kle f76334N;

    /* JADX INFO: renamed from: Q */
    public final kle[] f76335Q;

    /* JADX INFO: renamed from: V1 */
    public long f76336V1;

    /* JADX INFO: renamed from: X */
    public final cs0 f76337X;

    /* JADX INFO: renamed from: Y */
    @hib
    public gz1 f76338Y;

    /* JADX INFO: renamed from: Z */
    public C1213a f76339Z;

    /* JADX INFO: renamed from: Z1 */
    public long f76340Z1;

    /* JADX INFO: renamed from: a */
    public final int f76341a;

    /* JADX INFO: renamed from: a2 */
    public int f76342a2;

    /* JADX INFO: renamed from: b */
    public final int[] f76343b;

    /* JADX INFO: renamed from: b2 */
    @hib
    public yr0 f76344b2;

    /* JADX INFO: renamed from: c */
    public final C1213a[] f76345c;

    /* JADX INFO: renamed from: c2 */
    public boolean f76346c2;

    /* JADX INFO: renamed from: d */
    public final boolean[] f76347d;

    /* JADX INFO: renamed from: d2 */
    public boolean f76348d2;

    /* JADX INFO: renamed from: e */
    public final T f76349e;

    /* JADX INFO: renamed from: e2 */
    public boolean f76350e2;

    /* JADX INFO: renamed from: f */
    public final yye.InterfaceC15893a<qz1<T>> f76351f;

    /* JADX INFO: renamed from: m */
    public final joa.C7994a f76352m;

    /* JADX INFO: renamed from: qz1$a */
    public final class C11766a implements mle {

        /* JADX INFO: renamed from: a */
        public final qz1<T> f76353a;

        /* JADX INFO: renamed from: b */
        public final kle f76354b;

        /* JADX INFO: renamed from: c */
        public final int f76355c;

        /* JADX INFO: renamed from: d */
        public boolean f76356d;

        public C11766a(qz1<T> qz1Var, kle kleVar, int i) {
            this.f76353a = qz1Var;
            this.f76354b = kleVar;
            this.f76355c = i;
        }

        private void maybeNotifyDownstreamFormat() {
            if (this.f76356d) {
                return;
            }
            qz1.this.f76352m.downstreamFormatChanged(qz1.this.f76343b[this.f76355c], qz1.this.f76345c[this.f76355c], 0, null, qz1.this.f76340Z1);
            this.f76356d = true;
        }

        @Override // p000.mle
        public boolean isReady() {
            return !qz1.this.m20718g() && this.f76354b.isReady(qz1.this.f76350e2);
        }

        @Override // p000.mle
        public void maybeThrowError() {
        }

        @Override // p000.mle
        public int readData(oq6 oq6Var, rl3 rl3Var, int i) {
            if (qz1.this.m20718g()) {
                return -3;
            }
            if (qz1.this.f76344b2 != null && qz1.this.f76344b2.getFirstSampleIndex(this.f76355c + 1) <= this.f76354b.getReadIndex()) {
                return -3;
            }
            maybeNotifyDownstreamFormat();
            return this.f76354b.read(oq6Var, rl3Var, i, qz1.this.f76350e2);
        }

        public void release() {
            v80.checkState(qz1.this.f76347d[this.f76355c]);
            qz1.this.f76347d[this.f76355c] = false;
        }

        @Override // p000.mle
        public int skipData(long j) {
            if (qz1.this.m20718g()) {
                return 0;
            }
            int skipCount = this.f76354b.getSkipCount(j, qz1.this.f76350e2);
            if (qz1.this.f76344b2 != null) {
                skipCount = Math.min(skipCount, qz1.this.f76344b2.getFirstSampleIndex(this.f76355c + 1) - this.f76354b.getReadIndex());
            }
            this.f76354b.skip(skipCount);
            if (skipCount > 0) {
                maybeNotifyDownstreamFormat();
            }
            return skipCount;
        }
    }

    /* JADX INFO: renamed from: qz1$b */
    public interface InterfaceC11767b<T extends tz1> {
        void onSampleStreamReleased(qz1<T> qz1Var);
    }

    public qz1(int i, @hib int[] iArr, @hib C1213a[] c1213aArr, T t, yye.InterfaceC15893a<qz1<T>> interfaceC15893a, InterfaceC5892fn interfaceC5892fn, long j, or4 or4Var, nr4.C10020a c10020a, hc9 hc9Var, joa.C7994a c7994a, boolean z, @hib yxd yxdVar) {
        this.f76341a = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f76343b = iArr;
        this.f76345c = c1213aArr == null ? new C1213a[0] : c1213aArr;
        this.f76349e = t;
        this.f76351f = interfaceC15893a;
        this.f76352m = c7994a;
        this.f76328C = hc9Var;
        this.f76346c2 = z;
        this.f76329F = yxdVar != null ? new uc9(yxdVar) : new uc9("ChunkSampleStream");
        this.f76330H = new kz1();
        ArrayList<yr0> arrayList = new ArrayList<>();
        this.f76331L = arrayList;
        this.f76332M = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f76335Q = new kle[length];
        this.f76347d = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        kle[] kleVarArr = new kle[i3];
        kle kleVarCreateWithDrm = kle.createWithDrm(interfaceC5892fn, or4Var, c10020a);
        this.f76334N = kleVarCreateWithDrm;
        iArr2[0] = i;
        kleVarArr[0] = kleVarCreateWithDrm;
        while (i2 < length) {
            kle kleVarCreateWithoutDrm = kle.createWithoutDrm(interfaceC5892fn);
            this.f76335Q[i2] = kleVarCreateWithoutDrm;
            int i4 = i2 + 1;
            kleVarArr[i4] = kleVarCreateWithoutDrm;
            iArr2[i4] = this.f76343b[i2];
            i2 = i4;
        }
        this.f76337X = new cs0(iArr2, kleVarArr);
        this.f76336V1 = j;
        this.f76340Z1 = j;
    }

    private void discardDownstreamMediaChunks(int i) {
        int iMin = Math.min(primarySampleIndexToMediaChunkIndex(i, 0), this.f76342a2);
        if (iMin > 0) {
            t0i.removeRange(this.f76331L, 0, iMin);
            this.f76342a2 -= iMin;
        }
    }

    private void discardUpstream(int i) {
        v80.checkState(!this.f76329F.isLoading());
        int size = this.f76331L.size();
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
        long j = getLastMediaChunk().f41849h;
        yr0 yr0VarDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i);
        if (this.f76331L.isEmpty()) {
            this.f76336V1 = this.f76340Z1;
        }
        this.f76350e2 = false;
        this.f76352m.upstreamDiscarded(this.f76341a, yr0VarDiscardUpstreamMediaChunksFromIndex.f41848g, j);
    }

    private yr0 discardUpstreamMediaChunksFromIndex(int i) {
        yr0 yr0Var = this.f76331L.get(i);
        ArrayList<yr0> arrayList = this.f76331L;
        t0i.removeRange(arrayList, i, arrayList.size());
        this.f76342a2 = Math.max(this.f76342a2, this.f76331L.size());
        int i2 = 0;
        this.f76334N.discardUpstreamSamples(yr0Var.getFirstSampleIndex(0));
        while (true) {
            kle[] kleVarArr = this.f76335Q;
            if (i2 >= kleVarArr.length) {
                return yr0Var;
            }
            kle kleVar = kleVarArr[i2];
            i2++;
            kleVar.discardUpstreamSamples(yr0Var.getFirstSampleIndex(i2));
        }
    }

    private yr0 getLastMediaChunk() {
        return this.f76331L.get(r0.size() - 1);
    }

    private boolean haveReadFromMediaChunk(int i) {
        int readIndex;
        yr0 yr0Var = this.f76331L.get(i);
        if (this.f76334N.getReadIndex() > yr0Var.getFirstSampleIndex(0)) {
            return true;
        }
        int i2 = 0;
        do {
            kle[] kleVarArr = this.f76335Q;
            if (i2 >= kleVarArr.length) {
                return false;
            }
            readIndex = kleVarArr[i2].getReadIndex();
            i2++;
        } while (readIndex <= yr0Var.getFirstSampleIndex(i2));
        return true;
    }

    private boolean isMediaChunk(gz1 gz1Var) {
        return gz1Var instanceof yr0;
    }

    private void maybeNotifyPrimaryTrackFormatChanged() {
        int iPrimarySampleIndexToMediaChunkIndex = primarySampleIndexToMediaChunkIndex(this.f76334N.getReadIndex(), this.f76342a2 - 1);
        while (true) {
            int i = this.f76342a2;
            if (i > iPrimarySampleIndexToMediaChunkIndex) {
                return;
            }
            this.f76342a2 = i + 1;
            maybeNotifyPrimaryTrackFormatChanged(i);
        }
    }

    private int primarySampleIndexToMediaChunkIndex(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f76331L.size()) {
                return this.f76331L.size() - 1;
            }
        } while (this.f76331L.get(i2).getFirstSampleIndex(0) <= i);
        return i2 - 1;
    }

    private void resetSampleQueues() {
        this.f76334N.reset();
        for (kle kleVar : this.f76335Q) {
            kleVar.reset();
        }
    }

    public boolean consumeInitialDiscontinuity() {
        try {
            return this.f76348d2;
        } finally {
            this.f76348d2 = false;
        }
    }

    @Override // p000.yye
    public boolean continueLoading(C1233k c1233k) {
        List<yr0> listEmptyList;
        long j;
        if (this.f76350e2 || this.f76329F.isLoading() || this.f76329F.hasFatalError()) {
            return false;
        }
        boolean zM20718g = m20718g();
        if (zM20718g) {
            listEmptyList = Collections.emptyList();
            j = this.f76336V1;
        } else {
            listEmptyList = this.f76332M;
            j = getLastMediaChunk().f41849h;
        }
        this.f76349e.getNextChunk(c1233k, j, listEmptyList, this.f76330H);
        kz1 kz1Var = this.f76330H;
        boolean z = kz1Var.f55713b;
        gz1 gz1Var = kz1Var.f55712a;
        kz1Var.clear();
        if (z) {
            this.f76336V1 = -9223372036854775807L;
            this.f76350e2 = true;
            return true;
        }
        if (gz1Var == null) {
            return false;
        }
        this.f76338Y = gz1Var;
        if (isMediaChunk(gz1Var)) {
            yr0 yr0Var = (yr0) gz1Var;
            if (zM20718g) {
                long j2 = yr0Var.f41848g;
                long j3 = this.f76336V1;
                if (j2 < j3) {
                    this.f76334N.setStartTimeUs(j3);
                    for (kle kleVar : this.f76335Q) {
                        kleVar.setStartTimeUs(this.f76336V1);
                    }
                    if (this.f76346c2) {
                        C1213a c1213a = yr0Var.f41845d;
                        this.f76348d2 = !rva.allSamplesAreSyncSamples(c1213a.f8291o, c1213a.f8287k);
                    }
                }
                this.f76346c2 = false;
                this.f76336V1 = -9223372036854775807L;
            }
            yr0Var.init(this.f76337X);
            this.f76331L.add(yr0Var);
        } else if (gz1Var instanceof n18) {
            ((n18) gz1Var).init(this.f76337X);
        }
        this.f76329F.startLoading(gz1Var, this, this.f76328C.getMinimumLoadableRetryCount(gz1Var.f41844c));
        return true;
    }

    public void discardBuffer(long j, boolean z) {
        if (m20718g()) {
            return;
        }
        int firstIndex = this.f76334N.getFirstIndex();
        this.f76334N.discardTo(j, z, true);
        int firstIndex2 = this.f76334N.getFirstIndex();
        if (firstIndex2 > firstIndex) {
            long firstTimestampUs = this.f76334N.getFirstTimestampUs();
            int i = 0;
            while (true) {
                kle[] kleVarArr = this.f76335Q;
                if (i >= kleVarArr.length) {
                    break;
                }
                kleVarArr[i].discardTo(firstTimestampUs, z, this.f76347d[i]);
                i++;
            }
        }
        discardDownstreamMediaChunks(firstIndex2);
    }

    public void discardUpstreamSamplesForClippedDuration(long j) {
        v80.checkState(!this.f76329F.isLoading());
        if (m20718g() || j == -9223372036854775807L || this.f76331L.isEmpty()) {
            return;
        }
        yr0 lastMediaChunk = getLastMediaChunk();
        long j2 = lastMediaChunk.f102720l;
        if (j2 == -9223372036854775807L) {
            j2 = lastMediaChunk.f41849h;
        }
        if (j2 <= j) {
            return;
        }
        long largestQueuedTimestampUs = this.f76334N.getLargestQueuedTimestampUs();
        if (largestQueuedTimestampUs <= j) {
            return;
        }
        this.f76334N.discardUpstreamFrom(Math.max(j, this.f76334N.getLargestReadTimestampUs() + 1));
        for (kle kleVar : this.f76335Q) {
            kleVar.discardUpstreamFrom(Math.max(j, kleVar.getLargestReadTimestampUs() + 1));
        }
        this.f76352m.upstreamDiscarded(this.f76341a, j, largestQueuedTimestampUs);
    }

    /* JADX INFO: renamed from: g */
    public boolean m20718g() {
        return this.f76336V1 != -9223372036854775807L;
    }

    public long getAdjustedSeekPositionUs(long j, jue jueVar) {
        return this.f76349e.getAdjustedSeekPositionUs(j, jueVar);
    }

    @Override // p000.yye
    public long getBufferedPositionUs() {
        if (this.f76350e2) {
            return Long.MIN_VALUE;
        }
        if (m20718g()) {
            return this.f76336V1;
        }
        long jMax = this.f76340Z1;
        yr0 lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            if (this.f76331L.size() > 1) {
                lastMediaChunk = this.f76331L.get(r2.size() - 2);
            } else {
                lastMediaChunk = null;
            }
        }
        if (lastMediaChunk != null) {
            jMax = Math.max(jMax, lastMediaChunk.f41849h);
        }
        return Math.max(jMax, this.f76334N.getLargestQueuedTimestampUs());
    }

    public T getChunkSource() {
        return this.f76349e;
    }

    @Override // p000.yye
    public long getNextLoadPositionUs() {
        if (m20718g()) {
            return this.f76336V1;
        }
        if (this.f76350e2) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().f41849h;
    }

    @Override // p000.yye
    public boolean isLoading() {
        return this.f76329F.isLoading();
    }

    @Override // p000.mle
    public boolean isReady() {
        return !m20718g() && this.f76334N.isReady(this.f76350e2);
    }

    @Override // p000.mle
    public void maybeThrowError() throws IOException {
        this.f76329F.maybeThrowError();
        this.f76334N.maybeThrowError();
        if (this.f76329F.isLoading()) {
            return;
        }
        this.f76349e.maybeThrowError();
    }

    @Override // p000.uc9.InterfaceC13494f
    public void onLoaderReleased() {
        this.f76334N.release();
        for (kle kleVar : this.f76335Q) {
            kleVar.release();
        }
        this.f76349e.release();
        InterfaceC11767b<T> interfaceC11767b = this.f76333M1;
        if (interfaceC11767b != null) {
            interfaceC11767b.onSampleStreamReleased(this);
        }
    }

    @Override // p000.mle
    public int readData(oq6 oq6Var, rl3 rl3Var, int i) {
        if (m20718g()) {
            return -3;
        }
        yr0 yr0Var = this.f76344b2;
        if (yr0Var != null && yr0Var.getFirstSampleIndex(0) <= this.f76334N.getReadIndex()) {
            return -3;
        }
        maybeNotifyPrimaryTrackFormatChanged();
        return this.f76334N.read(oq6Var, rl3Var, i, this.f76350e2);
    }

    @Override // p000.yye
    public void reevaluateBuffer(long j) {
        if (this.f76329F.hasFatalError() || m20718g()) {
            return;
        }
        if (!this.f76329F.isLoading()) {
            int preferredQueueSize = this.f76349e.getPreferredQueueSize(j, this.f76332M);
            if (preferredQueueSize < this.f76331L.size()) {
                discardUpstream(preferredQueueSize);
                return;
            }
            return;
        }
        gz1 gz1Var = (gz1) v80.checkNotNull(this.f76338Y);
        if (!(isMediaChunk(gz1Var) && haveReadFromMediaChunk(this.f76331L.size() - 1)) && this.f76349e.shouldCancelLoad(j, gz1Var, this.f76332M)) {
            this.f76329F.cancelLoading();
            if (isMediaChunk(gz1Var)) {
                this.f76344b2 = (yr0) gz1Var;
            }
        }
    }

    public void release() {
        release(null);
    }

    public void seekToUs(long j) {
        yr0 yr0Var;
        boolean zSeekTo;
        this.f76340Z1 = j;
        int i = 0;
        this.f76346c2 = false;
        if (m20718g()) {
            this.f76336V1 = j;
            return;
        }
        for (int i2 = 0; i2 < this.f76331L.size(); i2++) {
            yr0Var = this.f76331L.get(i2);
            long j2 = yr0Var.f41848g;
            if (j2 == j && yr0Var.f102719k == -9223372036854775807L) {
                break;
            } else {
                if (j2 > j) {
                    break;
                }
            }
        }
        yr0Var = null;
        if (yr0Var != null) {
            zSeekTo = this.f76334N.seekTo(yr0Var.getFirstSampleIndex(0));
        } else {
            long nextLoadPositionUs = getNextLoadPositionUs();
            zSeekTo = this.f76334N.seekTo(j, nextLoadPositionUs == Long.MIN_VALUE || j < nextLoadPositionUs);
        }
        if (zSeekTo) {
            this.f76342a2 = primarySampleIndexToMediaChunkIndex(this.f76334N.getReadIndex(), 0);
            kle[] kleVarArr = this.f76335Q;
            int length = kleVarArr.length;
            while (i < length) {
                kleVarArr[i].seekTo(j, true);
                i++;
            }
            return;
        }
        this.f76336V1 = j;
        this.f76350e2 = false;
        this.f76331L.clear();
        this.f76342a2 = 0;
        if (!this.f76329F.isLoading()) {
            this.f76329F.clearFatalError();
            resetSampleQueues();
            return;
        }
        this.f76334N.discardToEnd();
        kle[] kleVarArr2 = this.f76335Q;
        int length2 = kleVarArr2.length;
        while (i < length2) {
            kleVarArr2[i].discardToEnd();
            i++;
        }
        this.f76329F.cancelLoading();
    }

    public qz1<T>.C11766a selectEmbeddedTrack(long j, int i) {
        for (int i2 = 0; i2 < this.f76335Q.length; i2++) {
            if (this.f76343b[i2] == i) {
                v80.checkState(!this.f76347d[i2]);
                this.f76347d[i2] = true;
                this.f76335Q[i2].seekTo(j, true);
                return new C11766a(this, this.f76335Q[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // p000.mle
    public int skipData(long j) {
        if (m20718g()) {
            return 0;
        }
        int skipCount = this.f76334N.getSkipCount(j, this.f76350e2);
        yr0 yr0Var = this.f76344b2;
        if (yr0Var != null) {
            skipCount = Math.min(skipCount, yr0Var.getFirstSampleIndex(0) - this.f76334N.getReadIndex());
        }
        this.f76334N.skip(skipCount);
        maybeNotifyPrimaryTrackFormatChanged();
        return skipCount;
    }

    @Override // p000.uc9.InterfaceC13490b
    public void onLoadCanceled(gz1 gz1Var, long j, long j2, boolean z) {
        this.f76338Y = null;
        this.f76344b2 = null;
        kc9 kc9Var = new kc9(gz1Var.f41842a, gz1Var.f41843b, gz1Var.getUri(), gz1Var.getResponseHeaders(), j, j2, gz1Var.bytesLoaded());
        this.f76328C.onLoadTaskConcluded(gz1Var.f41842a);
        this.f76352m.loadCanceled(kc9Var, gz1Var.f41844c, this.f76341a, gz1Var.f41845d, gz1Var.f41846e, gz1Var.f41847f, gz1Var.f41848g, gz1Var.f41849h);
        if (z) {
            return;
        }
        if (m20718g()) {
            resetSampleQueues();
        } else if (isMediaChunk(gz1Var)) {
            discardUpstreamMediaChunksFromIndex(this.f76331L.size() - 1);
            if (this.f76331L.isEmpty()) {
                this.f76336V1 = this.f76340Z1;
            }
        }
        this.f76351f.onContinueLoadingRequested(this);
    }

    @Override // p000.uc9.InterfaceC13490b
    public void onLoadCompleted(gz1 gz1Var, long j, long j2) {
        this.f76338Y = null;
        this.f76349e.onChunkLoadCompleted(gz1Var);
        kc9 kc9Var = new kc9(gz1Var.f41842a, gz1Var.f41843b, gz1Var.getUri(), gz1Var.getResponseHeaders(), j, j2, gz1Var.bytesLoaded());
        this.f76328C.onLoadTaskConcluded(gz1Var.f41842a);
        this.f76352m.loadCompleted(kc9Var, gz1Var.f41844c, this.f76341a, gz1Var.f41845d, gz1Var.f41846e, gz1Var.f41847f, gz1Var.f41848g, gz1Var.f41849h);
        this.f76351f.onContinueLoadingRequested(this);
    }

    @Override // p000.uc9.InterfaceC13490b
    public uc9.C13491c onLoadError(gz1 gz1Var, long j, long j2, IOException iOException, int i) {
        uc9.C13491c c13491cCreateRetryAction;
        long jBytesLoaded = gz1Var.bytesLoaded();
        boolean zIsMediaChunk = isMediaChunk(gz1Var);
        int size = this.f76331L.size() - 1;
        boolean z = (jBytesLoaded != 0 && zIsMediaChunk && haveReadFromMediaChunk(size)) ? false : true;
        kc9 kc9Var = new kc9(gz1Var.f41842a, gz1Var.f41843b, gz1Var.getUri(), gz1Var.getResponseHeaders(), j, j2, jBytesLoaded);
        hc9.C6795d c6795d = new hc9.C6795d(kc9Var, new fga(gz1Var.f41844c, this.f76341a, gz1Var.f41845d, gz1Var.f41846e, gz1Var.f41847f, t0i.usToMs(gz1Var.f41848g), t0i.usToMs(gz1Var.f41849h)), iOException, i);
        if (!this.f76349e.onChunkLoadError(gz1Var, z, c6795d, this.f76328C)) {
            c13491cCreateRetryAction = null;
        } else if (z) {
            c13491cCreateRetryAction = uc9.f87553k;
            if (zIsMediaChunk) {
                v80.checkState(discardUpstreamMediaChunksFromIndex(size) == gz1Var);
                if (this.f76331L.isEmpty()) {
                    this.f76336V1 = this.f76340Z1;
                }
            }
        } else {
            xh9.m25148w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            c13491cCreateRetryAction = null;
        }
        if (c13491cCreateRetryAction == null) {
            long retryDelayMsFor = this.f76328C.getRetryDelayMsFor(c6795d);
            c13491cCreateRetryAction = retryDelayMsFor != -9223372036854775807L ? uc9.createRetryAction(false, retryDelayMsFor) : uc9.f87554l;
        }
        boolean zIsRetry = c13491cCreateRetryAction.isRetry();
        this.f76352m.loadError(kc9Var, gz1Var.f41844c, this.f76341a, gz1Var.f41845d, gz1Var.f41846e, gz1Var.f41847f, gz1Var.f41848g, gz1Var.f41849h, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.f76338Y = null;
            this.f76328C.onLoadTaskConcluded(gz1Var.f41842a);
            this.f76351f.onContinueLoadingRequested(this);
        }
        return c13491cCreateRetryAction;
    }

    @Override // p000.uc9.InterfaceC13490b
    public void onLoadStarted(gz1 gz1Var, long j, long j2, int i) {
        this.f76352m.loadStarted(i == 0 ? new kc9(gz1Var.f41842a, gz1Var.f41843b, j) : new kc9(gz1Var.f41842a, gz1Var.f41843b, gz1Var.getUri(), gz1Var.getResponseHeaders(), j, j2, gz1Var.bytesLoaded()), gz1Var.f41844c, this.f76341a, gz1Var.f41845d, gz1Var.f41846e, gz1Var.f41847f, gz1Var.f41848g, gz1Var.f41849h, i);
    }

    public void release(@hib InterfaceC11767b<T> interfaceC11767b) {
        this.f76333M1 = interfaceC11767b;
        this.f76334N.preRelease();
        for (kle kleVar : this.f76335Q) {
            kleVar.preRelease();
        }
        this.f76329F.release(this);
    }

    private void maybeNotifyPrimaryTrackFormatChanged(int i) {
        yr0 yr0Var = this.f76331L.get(i);
        C1213a c1213a = yr0Var.f41845d;
        if (!c1213a.equals(this.f76339Z)) {
            this.f76352m.downstreamFormatChanged(this.f76341a, c1213a, yr0Var.f41846e, yr0Var.f41847f, yr0Var.f41848g);
        }
        this.f76339Z = c1213a;
    }
}
