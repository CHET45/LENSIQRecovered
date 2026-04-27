package p000;

import android.net.Uri;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.C1233k;
import java.util.ArrayList;
import p000.mja;
import p000.nfa;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class mcf extends fs0 {

    /* JADX INFO: renamed from: H */
    public static final String f60565H = "SilenceMediaSource";

    /* JADX INFO: renamed from: L */
    public static final int f60566L = 44100;

    /* JADX INFO: renamed from: M */
    public static final int f60567M = 2;

    /* JADX INFO: renamed from: N */
    public static final int f60568N = 2;

    /* JADX INFO: renamed from: Q */
    public static final C1213a f60569Q;

    /* JADX INFO: renamed from: X */
    public static final nfa f60570X;

    /* JADX INFO: renamed from: Y */
    public static final byte[] f60571Y;

    /* JADX INFO: renamed from: C */
    public final long f60572C;

    /* JADX INFO: renamed from: F */
    @xc7("this")
    public nfa f60573F;

    /* JADX INFO: renamed from: mcf$b */
    public static final class C9286b {

        /* JADX INFO: renamed from: a */
        public long f60574a;

        /* JADX INFO: renamed from: b */
        @hib
        public Object f60575b;

        public mcf createMediaSource() {
            v80.checkState(this.f60574a > 0);
            return new mcf(this.f60574a, mcf.f60570X.buildUpon().setTag(this.f60575b).build());
        }

        @op1
        public C9286b setDurationUs(@h78(from = 1) long j) {
            this.f60574a = j;
            return this;
        }

        @op1
        public C9286b setTag(@hib Object obj) {
            this.f60575b = obj;
            return this;
        }
    }

    /* JADX INFO: renamed from: mcf$c */
    public static final class C9287c implements mja {

        /* JADX INFO: renamed from: c */
        public static final n6h f60576c = new n6h(new h6h(mcf.f60569Q));

        /* JADX INFO: renamed from: a */
        public final long f60577a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<mle> f60578b = new ArrayList<>();

        public C9287c(long j) {
            this.f60577a = j;
        }

        private long constrainSeekPosition(long j) {
            return t0i.constrainValue(j, 0L, this.f60577a);
        }

        @Override // p000.mja, p000.yye
        public boolean continueLoading(C1233k c1233k) {
            return false;
        }

        @Override // p000.mja
        public void discardBuffer(long j, boolean z) {
        }

        @Override // p000.mja
        public long getAdjustedSeekPositionUs(long j, jue jueVar) {
            return constrainSeekPosition(j);
        }

        @Override // p000.mja, p000.yye
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // p000.mja, p000.yye
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // p000.mja
        public n6h getTrackGroups() {
            return f60576c;
        }

        @Override // p000.mja, p000.yye
        public boolean isLoading() {
            return false;
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

        @Override // p000.mja
        public long seekToUs(long j) {
            long jConstrainSeekPosition = constrainSeekPosition(j);
            for (int i = 0; i < this.f60578b.size(); i++) {
                ((C9288d) this.f60578b.get(i)).seekTo(jConstrainSeekPosition);
            }
            return jConstrainSeekPosition;
        }

        @Override // p000.mja
        public long selectTracks(of5[] of5VarArr, boolean[] zArr, mle[] mleVarArr, boolean[] zArr2, long j) {
            long jConstrainSeekPosition = constrainSeekPosition(j);
            for (int i = 0; i < of5VarArr.length; i++) {
                mle mleVar = mleVarArr[i];
                if (mleVar != null && (of5VarArr[i] == null || !zArr[i])) {
                    this.f60578b.remove(mleVar);
                    mleVarArr[i] = null;
                }
                if (mleVarArr[i] == null && of5VarArr[i] != null) {
                    C9288d c9288d = new C9288d(this.f60577a);
                    c9288d.seekTo(jConstrainSeekPosition);
                    this.f60578b.add(c9288d);
                    mleVarArr[i] = c9288d;
                    zArr2[i] = true;
                }
            }
            return jConstrainSeekPosition;
        }
    }

    /* JADX INFO: renamed from: mcf$d */
    public static final class C9288d implements mle {

        /* JADX INFO: renamed from: a */
        public final long f60579a;

        /* JADX INFO: renamed from: b */
        public boolean f60580b;

        /* JADX INFO: renamed from: c */
        public long f60581c;

        public C9288d(long j) {
            this.f60579a = mcf.getAudioByteCount(j);
            seekTo(0L);
        }

        @Override // p000.mle
        public boolean isReady() {
            return true;
        }

        @Override // p000.mle
        public void maybeThrowError() {
        }

        @Override // p000.mle
        public int readData(oq6 oq6Var, rl3 rl3Var, int i) {
            if (!this.f60580b || (i & 2) != 0) {
                oq6Var.f68294b = mcf.f60569Q;
                this.f60580b = true;
                return -5;
            }
            long j = this.f60579a;
            long j2 = this.f60581c;
            long j3 = j - j2;
            if (j3 == 0) {
                rl3Var.addFlag(4);
                return -4;
            }
            rl3Var.f78610f = mcf.getAudioPositionUs(j2);
            rl3Var.addFlag(1);
            int iMin = (int) Math.min(mcf.f60571Y.length, j3);
            if ((i & 4) == 0) {
                rl3Var.ensureSpaceForWrite(iMin);
                rl3Var.f78608d.put(mcf.f60571Y, 0, iMin);
            }
            if ((i & 1) == 0) {
                this.f60581c += (long) iMin;
            }
            return -4;
        }

        public void seekTo(long j) {
            this.f60581c = t0i.constrainValue(mcf.getAudioByteCount(j), 0L, this.f60579a);
        }

        @Override // p000.mle
        public int skipData(long j) {
            long j2 = this.f60581c;
            seekTo(j);
            return (int) ((this.f60581c - j2) / ((long) mcf.f60571Y.length));
        }
    }

    static {
        C1213a c1213aBuild = new C1213a.b().setSampleMimeType("audio/raw").setChannelCount(2).setSampleRate(44100).setPcmEncoding(2).build();
        f60569Q = c1213aBuild;
        f60570X = new nfa.C9851c().setMediaId("SilenceMediaSource").setUri(Uri.EMPTY).setMimeType(c1213aBuild.f8291o).build();
        f60571Y = new byte[t0i.getPcmFrameSize(2, 2) * 1024];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioByteCount(long j) {
        return ((long) t0i.getPcmFrameSize(2, 2)) * ((j * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioPositionUs(long j) {
        return ((j / ((long) t0i.getPcmFrameSize(2, 2))) * 1000000) / 44100;
    }

    @Override // p000.una
    public boolean canUpdateMediaItem(nfa nfaVar) {
        return true;
    }

    @Override // p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        return new C9287c(this.f60572C);
    }

    @Override // p000.una
    public synchronized nfa getMediaItem() {
        return this.f60573F;
    }

    @Override // p000.fs0
    /* JADX INFO: renamed from: l */
    public void mo2508l(@hib qdh qdhVar) {
        m11123m(new tnf(this.f60572C, true, false, false, (Object) null, getMediaItem()));
    }

    @Override // p000.una
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // p000.una
    public void releasePeriod(mja mjaVar) {
    }

    @Override // p000.fs0
    public void releaseSourceInternal() {
    }

    @Override // p000.una
    public synchronized void updateMediaItem(nfa nfaVar) {
        this.f60573F = nfaVar;
    }

    public mcf(long j) {
        this(j, f60570X);
    }

    private mcf(long j, nfa nfaVar) {
        v80.checkArgument(j >= 0);
        this.f60572C = j;
        this.f60573F = nfaVar;
    }
}
