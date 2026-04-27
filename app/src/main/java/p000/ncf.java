package p000;

import android.net.Uri;
import java.util.ArrayList;
import p000.aga;
import p000.kq6;
import p000.nja;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ncf extends es0 {

    /* JADX INFO: renamed from: H */
    public static final String f63956H = "SilenceMediaSource";

    /* JADX INFO: renamed from: L */
    public static final int f63957L = 44100;

    /* JADX INFO: renamed from: M */
    public static final int f63958M = 2;

    /* JADX INFO: renamed from: N */
    public static final int f63959N = 2;

    /* JADX INFO: renamed from: Q */
    public static final kq6 f63960Q;

    /* JADX INFO: renamed from: X */
    public static final aga f63961X;

    /* JADX INFO: renamed from: Y */
    public static final byte[] f63962Y;

    /* JADX INFO: renamed from: C */
    public final long f63963C;

    /* JADX INFO: renamed from: F */
    public final aga f63964F;

    /* JADX INFO: renamed from: ncf$b */
    public static final class C9780b {

        /* JADX INFO: renamed from: a */
        public long f63965a;

        /* JADX INFO: renamed from: b */
        @hib
        public Object f63966b;

        public ncf createMediaSource() {
            u80.checkState(this.f63965a > 0);
            return new ncf(this.f63965a, ncf.f63961X.buildUpon().setTag(this.f63966b).build());
        }

        @op1
        public C9780b setDurationUs(@h78(from = 1) long j) {
            this.f63965a = j;
            return this;
        }

        @op1
        public C9780b setTag(@hib Object obj) {
            this.f63966b = obj;
            return this;
        }
    }

    /* JADX INFO: renamed from: ncf$c */
    public static final class C9781c implements nja {

        /* JADX INFO: renamed from: c */
        public static final m6h f63967c = new m6h(new g6h(ncf.f63960Q));

        /* JADX INFO: renamed from: a */
        public final long f63968a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<nle> f63969b = new ArrayList<>();

        public C9781c(long j) {
            this.f63968a = j;
        }

        private long constrainSeekPosition(long j) {
            return x0i.constrainValue(j, 0L, this.f63968a);
        }

        @Override // p000.nja, p000.zye
        public boolean continueLoading(long j) {
            return false;
        }

        @Override // p000.nja
        public void discardBuffer(long j, boolean z) {
        }

        @Override // p000.nja
        public long getAdjustedSeekPositionUs(long j, iue iueVar) {
            return constrainSeekPosition(j);
        }

        @Override // p000.nja, p000.zye
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // p000.nja, p000.zye
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // p000.nja
        public m6h getTrackGroups() {
            return f63967c;
        }

        @Override // p000.nja, p000.zye
        public boolean isLoading() {
            return false;
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

        @Override // p000.nja
        public long seekToUs(long j) {
            long jConstrainSeekPosition = constrainSeekPosition(j);
            for (int i = 0; i < this.f63969b.size(); i++) {
                ((C9782d) this.f63969b.get(i)).seekTo(jConstrainSeekPosition);
            }
            return jConstrainSeekPosition;
        }

        @Override // p000.nja
        public long selectTracks(pf5[] pf5VarArr, boolean[] zArr, nle[] nleVarArr, boolean[] zArr2, long j) {
            long jConstrainSeekPosition = constrainSeekPosition(j);
            for (int i = 0; i < pf5VarArr.length; i++) {
                nle nleVar = nleVarArr[i];
                if (nleVar != null && (pf5VarArr[i] == null || !zArr[i])) {
                    this.f63969b.remove(nleVar);
                    nleVarArr[i] = null;
                }
                if (nleVarArr[i] == null && pf5VarArr[i] != null) {
                    C9782d c9782d = new C9782d(this.f63968a);
                    c9782d.seekTo(jConstrainSeekPosition);
                    this.f63969b.add(c9782d);
                    nleVarArr[i] = c9782d;
                    zArr2[i] = true;
                }
            }
            return jConstrainSeekPosition;
        }
    }

    /* JADX INFO: renamed from: ncf$d */
    public static final class C9782d implements nle {

        /* JADX INFO: renamed from: a */
        public final long f63970a;

        /* JADX INFO: renamed from: b */
        public boolean f63971b;

        /* JADX INFO: renamed from: c */
        public long f63972c;

        public C9782d(long j) {
            this.f63970a = ncf.getAudioByteCount(j);
            seekTo(0L);
        }

        @Override // p000.nle
        public boolean isReady() {
            return true;
        }

        @Override // p000.nle
        public void maybeThrowError() {
        }

        @Override // p000.nle
        public int readData(nq6 nq6Var, sl3 sl3Var, int i) {
            if (!this.f63971b || (i & 2) != 0) {
                nq6Var.f65258b = ncf.f63960Q;
                this.f63971b = true;
                return -5;
            }
            long j = this.f63970a;
            long j2 = this.f63972c;
            long j3 = j - j2;
            if (j3 == 0) {
                sl3Var.addFlag(4);
                return -4;
            }
            sl3Var.f82164f = ncf.getAudioPositionUs(j2);
            sl3Var.addFlag(1);
            int iMin = (int) Math.min(ncf.f63962Y.length, j3);
            if ((i & 4) == 0) {
                sl3Var.ensureSpaceForWrite(iMin);
                sl3Var.f82162d.put(ncf.f63962Y, 0, iMin);
            }
            if ((i & 1) == 0) {
                this.f63972c += (long) iMin;
            }
            return -4;
        }

        public void seekTo(long j) {
            this.f63972c = x0i.constrainValue(ncf.getAudioByteCount(j), 0L, this.f63970a);
        }

        @Override // p000.nle
        public int skipData(long j) {
            long j2 = this.f63972c;
            seekTo(j);
            return (int) ((this.f63972c - j2) / ((long) ncf.f63962Y.length));
        }
    }

    static {
        kq6 kq6VarBuild = new kq6.C8497b().setSampleMimeType("audio/raw").setChannelCount(2).setSampleRate(44100).setPcmEncoding(2).build();
        f63960Q = kq6VarBuild;
        f63961X = new aga.C0235c().setMediaId("SilenceMediaSource").setUri(Uri.EMPTY).setMimeType(kq6VarBuild.f54989M).build();
        f63962Y = new byte[x0i.getPcmFrameSize(2, 2) * 1024];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioByteCount(long j) {
        return ((long) x0i.getPcmFrameSize(2, 2)) * ((j * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioPositionUs(long j) {
        return ((j / ((long) x0i.getPcmFrameSize(2, 2))) * 1000000) / 44100;
    }

    @Override // p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        return new C9781c(this.f63963C);
    }

    @Override // p000.vna
    public aga getMediaItem() {
        return this.f63964F;
    }

    @Override // p000.es0
    /* JADX INFO: renamed from: k */
    public void mo2648k(@hib pdh pdhVar) {
        m10220l(new snf(this.f63963C, true, false, false, (Object) null, this.f63964F));
    }

    @Override // p000.vna
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // p000.vna
    public void releasePeriod(nja njaVar) {
    }

    @Override // p000.es0
    public void releaseSourceInternal() {
    }

    public ncf(long j) {
        this(j, f63961X);
    }

    private ncf(long j, aga agaVar) {
        u80.checkArgument(j >= 0);
        this.f63963C = j;
        this.f63964F = agaVar;
    }
}
