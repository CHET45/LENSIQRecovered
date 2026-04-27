package p000;

import android.os.Looper;
import androidx.media3.common.C1213a;
import androidx.media3.common.DrmInitData;
import java.io.IOException;
import java.util.Objects;
import p000.ar4;
import p000.kle;
import p000.nr4;
import p000.or4;
import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class kle implements q6h {

    /* JADX INFO: renamed from: K */
    @fdi
    public static final int f54625K = 1000;

    /* JADX INFO: renamed from: L */
    public static final String f54626L = "SampleQueue";

    /* JADX INFO: renamed from: C */
    public boolean f54629C;

    /* JADX INFO: renamed from: D */
    @hib
    public C1213a f54630D;

    /* JADX INFO: renamed from: E */
    @hib
    public C1213a f54631E;

    /* JADX INFO: renamed from: F */
    public long f54632F;

    /* JADX INFO: renamed from: H */
    public boolean f54634H;

    /* JADX INFO: renamed from: I */
    public long f54635I;

    /* JADX INFO: renamed from: J */
    public boolean f54636J;

    /* JADX INFO: renamed from: d */
    public final gle f54637d;

    /* JADX INFO: renamed from: g */
    @hib
    public final or4 f54640g;

    /* JADX INFO: renamed from: h */
    @hib
    public final nr4.C10020a f54641h;

    /* JADX INFO: renamed from: i */
    @hib
    public InterfaceC8447d f54642i;

    /* JADX INFO: renamed from: j */
    @hib
    public C1213a f54643j;

    /* JADX INFO: renamed from: k */
    @hib
    public ar4 f54644k;

    /* JADX INFO: renamed from: s */
    public int f54652s;

    /* JADX INFO: renamed from: t */
    public int f54653t;

    /* JADX INFO: renamed from: u */
    public int f54654u;

    /* JADX INFO: renamed from: v */
    public int f54655v;

    /* JADX INFO: renamed from: z */
    public boolean f54659z;

    /* JADX INFO: renamed from: e */
    public final C8445b f54638e = new C8445b();

    /* JADX INFO: renamed from: l */
    public int f54645l = 1000;

    /* JADX INFO: renamed from: m */
    public long[] f54646m = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f54647n = new long[1000];

    /* JADX INFO: renamed from: q */
    public long[] f54650q = new long[1000];

    /* JADX INFO: renamed from: p */
    public int[] f54649p = new int[1000];

    /* JADX INFO: renamed from: o */
    public int[] f54648o = new int[1000];

    /* JADX INFO: renamed from: r */
    public q6h.C11325a[] f54651r = new q6h.C11325a[1000];

    /* JADX INFO: renamed from: f */
    public final fxf<C8446c> f54639f = new fxf<>(new qu2() { // from class: jle
        @Override // p000.qu2
        public final void accept(Object obj) {
            kle.lambda$new$0((kle.C8446c) obj);
        }
    });

    /* JADX INFO: renamed from: w */
    public long f54656w = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x */
    public long f54657x = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public long f54658y = Long.MIN_VALUE;

    /* JADX INFO: renamed from: B */
    public boolean f54628B = true;

    /* JADX INFO: renamed from: A */
    public boolean f54627A = true;

    /* JADX INFO: renamed from: G */
    public boolean f54633G = true;

    /* JADX INFO: renamed from: kle$b */
    public static final class C8445b {

        /* JADX INFO: renamed from: a */
        public int f54660a;

        /* JADX INFO: renamed from: b */
        public long f54661b;

        /* JADX INFO: renamed from: c */
        @hib
        public q6h.C11325a f54662c;
    }

    /* JADX INFO: renamed from: kle$c */
    public static final class C8446c {

        /* JADX INFO: renamed from: a */
        public final C1213a f54663a;

        /* JADX INFO: renamed from: b */
        public final or4.InterfaceC10511b f54664b;

        private C8446c(C1213a c1213a, or4.InterfaceC10511b interfaceC10511b) {
            this.f54663a = c1213a;
            this.f54664b = interfaceC10511b;
        }
    }

    /* JADX INFO: renamed from: kle$d */
    public interface InterfaceC8447d {
        void onUpstreamFormatChanged(C1213a c1213a);
    }

    public kle(InterfaceC5892fn interfaceC5892fn, @hib or4 or4Var, @hib nr4.C10020a c10020a) {
        this.f54640g = or4Var;
        this.f54641h = c10020a;
        this.f54637d = new gle(interfaceC5892fn);
    }

    private synchronized boolean attemptSplice(long j) {
        if (this.f54652s == 0) {
            return j > this.f54657x;
        }
        if (getLargestReadTimestampUs() >= j) {
            return false;
        }
        discardUpstreamSampleMetadata(this.f54653t + countUnreadSamplesBefore(j));
        return true;
    }

    private synchronized void commitSample(long j, int i, long j2, int i2, @hib q6h.C11325a c11325a) {
        try {
            int i3 = this.f54652s;
            if (i3 > 0) {
                int relativeIndex = getRelativeIndex(i3 - 1);
                v80.checkArgument(this.f54647n[relativeIndex] + ((long) this.f54648o[relativeIndex]) <= j2);
            }
            this.f54659z = (536870912 & i) != 0;
            this.f54658y = Math.max(this.f54658y, j);
            int relativeIndex2 = getRelativeIndex(this.f54652s);
            this.f54650q[relativeIndex2] = j;
            this.f54647n[relativeIndex2] = j2;
            this.f54648o[relativeIndex2] = i2;
            this.f54649p[relativeIndex2] = i;
            this.f54651r[relativeIndex2] = c11325a;
            this.f54646m[relativeIndex2] = this.f54632F;
            if (this.f54639f.isEmpty() || !this.f54639f.getEndValue().f54663a.equals(this.f54631E)) {
                C1213a c1213a = (C1213a) v80.checkNotNull(this.f54631E);
                or4 or4Var = this.f54640g;
                this.f54639f.appendSpan(getWriteIndex(), new C8446c(c1213a, or4Var != null ? or4Var.preacquireSession(this.f54641h, c1213a) : or4.InterfaceC10511b.f68368a));
            }
            int i4 = this.f54652s + 1;
            this.f54652s = i4;
            int i5 = this.f54645l;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                q6h.C11325a[] c11325aArr = new q6h.C11325a[i6];
                int i7 = this.f54654u;
                int i8 = i5 - i7;
                System.arraycopy(this.f54647n, i7, jArr2, 0, i8);
                System.arraycopy(this.f54650q, this.f54654u, jArr3, 0, i8);
                System.arraycopy(this.f54649p, this.f54654u, iArr, 0, i8);
                System.arraycopy(this.f54648o, this.f54654u, iArr2, 0, i8);
                System.arraycopy(this.f54651r, this.f54654u, c11325aArr, 0, i8);
                System.arraycopy(this.f54646m, this.f54654u, jArr, 0, i8);
                int i9 = this.f54654u;
                System.arraycopy(this.f54647n, 0, jArr2, i8, i9);
                System.arraycopy(this.f54650q, 0, jArr3, i8, i9);
                System.arraycopy(this.f54649p, 0, iArr, i8, i9);
                System.arraycopy(this.f54648o, 0, iArr2, i8, i9);
                System.arraycopy(this.f54651r, 0, c11325aArr, i8, i9);
                System.arraycopy(this.f54646m, 0, jArr, i8, i9);
                this.f54647n = jArr2;
                this.f54650q = jArr3;
                this.f54649p = iArr;
                this.f54648o = iArr2;
                this.f54651r = c11325aArr;
                this.f54646m = jArr;
                this.f54654u = 0;
                this.f54645l = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int countUnreadSamplesBefore(long j) {
        int i = this.f54652s;
        int relativeIndex = getRelativeIndex(i - 1);
        while (i > this.f54655v && this.f54650q[relativeIndex] >= j) {
            i--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.f54645l - 1;
            }
        }
        return i;
    }

    public static kle createWithDrm(InterfaceC5892fn interfaceC5892fn, or4 or4Var, nr4.C10020a c10020a) {
        return new kle(interfaceC5892fn, (or4) v80.checkNotNull(or4Var), (nr4.C10020a) v80.checkNotNull(c10020a));
    }

    public static kle createWithoutDrm(InterfaceC5892fn interfaceC5892fn) {
        return new kle(interfaceC5892fn, null, null);
    }

    private synchronized long discardSampleMetadataTo(long j, boolean z, boolean z2) {
        int i;
        try {
            int i2 = this.f54652s;
            if (i2 != 0) {
                long[] jArr = this.f54650q;
                int i3 = this.f54654u;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.f54655v) != i2) {
                        i2 = i + 1;
                    }
                    int iFindSampleBefore = findSampleBefore(i3, i2, j, z);
                    if (iFindSampleBefore == -1) {
                        return -1L;
                    }
                    return discardSamples(iFindSampleBefore);
                }
            }
            return -1L;
        } finally {
        }
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i = this.f54652s;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    @xc7("this")
    private long discardSamples(int i) {
        this.f54657x = Math.max(this.f54657x, getLargestTimestamp(i));
        this.f54652s -= i;
        int i2 = this.f54653t + i;
        this.f54653t = i2;
        int i3 = this.f54654u + i;
        this.f54654u = i3;
        int i4 = this.f54645l;
        if (i3 >= i4) {
            this.f54654u = i3 - i4;
        }
        int i5 = this.f54655v - i;
        this.f54655v = i5;
        if (i5 < 0) {
            this.f54655v = 0;
        }
        this.f54639f.discardTo(i2);
        if (this.f54652s != 0) {
            return this.f54647n[this.f54654u];
        }
        int i6 = this.f54654u;
        if (i6 == 0) {
            i6 = this.f54645l;
        }
        int i7 = i6 - 1;
        return this.f54647n[i7] + ((long) this.f54648o[i7]);
    }

    private long discardUpstreamSampleMetadata(int i) {
        int writeIndex = getWriteIndex() - i;
        boolean z = false;
        v80.checkArgument(writeIndex >= 0 && writeIndex <= this.f54652s - this.f54655v);
        int i2 = this.f54652s - writeIndex;
        this.f54652s = i2;
        this.f54658y = Math.max(this.f54657x, getLargestTimestamp(i2));
        if (writeIndex == 0 && this.f54659z) {
            z = true;
        }
        this.f54659z = z;
        this.f54639f.discardFrom(i);
        int i3 = this.f54652s;
        if (i3 == 0) {
            return 0L;
        }
        int relativeIndex = getRelativeIndex(i3 - 1);
        return this.f54647n[relativeIndex] + ((long) this.f54648o[relativeIndex]);
    }

    private int findSampleAfter(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f54650q[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.f54645l) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    private int findSampleBefore(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f54650q[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f54649p[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f54645l) {
                i = 0;
            }
        }
        return i3;
    }

    private long getLargestTimestamp(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f54650q[relativeIndex]);
            if ((this.f54649p[relativeIndex] & 1) != 0) {
                break;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.f54645l - 1;
            }
        }
        return jMax;
    }

    private int getRelativeIndex(int i) {
        int i2 = this.f54654u + i;
        int i3 = this.f54645l;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private boolean hasNextSample() {
        return this.f54655v != this.f54652s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(C8446c c8446c) {
        c8446c.f54664b.release();
    }

    private boolean mayReadSample(int i) {
        ar4 ar4Var = this.f54644k;
        return ar4Var == null || ar4Var.getState() == 4 || ((this.f54649p[i] & 1073741824) == 0 && this.f54644k.playClearSamplesWithoutKeys());
    }

    private void onFormatResult(C1213a c1213a, oq6 oq6Var) {
        C1213a c1213a2 = this.f54643j;
        boolean z = c1213a2 == null;
        DrmInitData drmInitData = c1213a2 == null ? null : c1213a2.f8295s;
        this.f54643j = c1213a;
        DrmInitData drmInitData2 = c1213a.f8295s;
        or4 or4Var = this.f54640g;
        oq6Var.f68294b = or4Var != null ? c1213a.copyWithCryptoType(or4Var.getCryptoType(c1213a)) : c1213a;
        oq6Var.f68293a = this.f54644k;
        if (this.f54640g == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            ar4 ar4Var = this.f54644k;
            ar4 ar4VarAcquireSession = this.f54640g.acquireSession(this.f54641h, c1213a);
            this.f54644k = ar4VarAcquireSession;
            oq6Var.f68293a = ar4VarAcquireSession;
            if (ar4Var != null) {
                ar4Var.release(this.f54641h);
            }
        }
    }

    private synchronized int peekSampleMetadata(oq6 oq6Var, rl3 rl3Var, boolean z, boolean z2, C8445b c8445b) {
        try {
            rl3Var.f78609e = false;
            if (!hasNextSample()) {
                if (!z2 && !this.f54659z) {
                    C1213a c1213a = this.f54631E;
                    if (c1213a == null || (!z && c1213a == this.f54643j)) {
                        return -3;
                    }
                    onFormatResult((C1213a) v80.checkNotNull(c1213a), oq6Var);
                    return -5;
                }
                rl3Var.setFlags(4);
                rl3Var.f78610f = Long.MIN_VALUE;
                return -4;
            }
            C1213a c1213a2 = this.f54639f.get(getReadIndex()).f54663a;
            if (!z && c1213a2 == this.f54643j) {
                int relativeIndex = getRelativeIndex(this.f54655v);
                if (!mayReadSample(relativeIndex)) {
                    rl3Var.f78609e = true;
                    return -3;
                }
                rl3Var.setFlags(this.f54649p[relativeIndex]);
                if (this.f54655v == this.f54652s - 1 && (z2 || this.f54659z)) {
                    rl3Var.addFlag(536870912);
                }
                rl3Var.f78610f = this.f54650q[relativeIndex];
                c8445b.f54660a = this.f54648o[relativeIndex];
                c8445b.f54661b = this.f54647n[relativeIndex];
                c8445b.f54662c = this.f54651r[relativeIndex];
                return -4;
            }
            onFormatResult(c1213a2, oq6Var);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void releaseDrmSessionReferences() {
        ar4 ar4Var = this.f54644k;
        if (ar4Var != null) {
            ar4Var.release(this.f54641h);
            this.f54644k = null;
            this.f54643j = null;
        }
    }

    private synchronized void rewind() {
        this.f54655v = 0;
        this.f54637d.rewind();
    }

    private synchronized boolean setUpstreamFormat(C1213a c1213a) {
        try {
            this.f54628B = false;
            if (Objects.equals(c1213a, this.f54631E)) {
                return false;
            }
            if (this.f54639f.isEmpty() || !this.f54639f.getEndValue().f54663a.equals(c1213a)) {
                this.f54631E = c1213a;
            } else {
                this.f54631E = this.f54639f.getEndValue().f54663a;
            }
            boolean z = this.f54633G;
            C1213a c1213a2 = this.f54631E;
            this.f54633G = z & rva.allSamplesAreSyncSamples(c1213a2.f8291o, c1213a2.f8287k);
            this.f54634H = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14820b() {
        this.f54629C = true;
    }

    public synchronized long discardSampleMetadataToRead() {
        int i = this.f54655v;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    public final void discardTo(long j, boolean z, boolean z2) {
        this.f54637d.discardDownstreamTo(discardSampleMetadataTo(j, z, z2));
    }

    public final void discardToEnd() {
        this.f54637d.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.f54637d.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j) {
        if (this.f54652s == 0) {
            return;
        }
        v80.checkArgument(j > getLargestReadTimestampUs());
        discardUpstreamSamples(this.f54653t + countUnreadSamplesBefore(j));
    }

    public final void discardUpstreamSamples(int i) {
        this.f54637d.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i));
    }

    @Override // p000.q6h
    public final void format(C1213a c1213a) {
        C1213a adjustedUpstreamFormat = getAdjustedUpstreamFormat(c1213a);
        this.f54629C = false;
        this.f54630D = c1213a;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        InterfaceC8447d interfaceC8447d = this.f54642i;
        if (interfaceC8447d == null || !upstreamFormat) {
            return;
        }
        interfaceC8447d.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    @un1
    public C1213a getAdjustedUpstreamFormat(C1213a c1213a) {
        return (this.f54635I == 0 || c1213a.f8296t == Long.MAX_VALUE) ? c1213a : c1213a.buildUpon().setSubsampleOffsetUs(c1213a.f8296t + this.f54635I).build();
    }

    public final int getFirstIndex() {
        return this.f54653t;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.f54652s == 0 ? Long.MIN_VALUE : this.f54650q[this.f54654u];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.f54658y;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.f54657x, getLargestTimestamp(this.f54655v));
    }

    public final int getReadIndex() {
        return this.f54653t + this.f54655v;
    }

    public final synchronized int getSkipCount(long j, boolean z) {
        int relativeIndex = getRelativeIndex(this.f54655v);
        if (hasNextSample() && j >= this.f54650q[relativeIndex]) {
            if (j > this.f54658y && z) {
                return this.f54652s - this.f54655v;
            }
            int iFindSampleBefore = findSampleBefore(relativeIndex, this.f54652s - this.f54655v, j, true);
            if (iFindSampleBefore == -1) {
                return 0;
            }
            return iFindSampleBefore;
        }
        return 0;
    }

    @hib
    public final synchronized C1213a getUpstreamFormat() {
        return this.f54628B ? null : this.f54631E;
    }

    public final int getWriteIndex() {
        return this.f54653t + this.f54652s;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.f54659z;
    }

    @un1
    public synchronized boolean isReady(boolean z) {
        C1213a c1213a;
        boolean z2 = true;
        if (hasNextSample()) {
            if (this.f54639f.get(getReadIndex()).f54663a != this.f54643j) {
                return true;
            }
            return mayReadSample(getRelativeIndex(this.f54655v));
        }
        if (!z && !this.f54659z && ((c1213a = this.f54631E) == null || c1213a == this.f54643j)) {
            z2 = false;
        }
        return z2;
    }

    @un1
    public void maybeThrowError() throws IOException {
        ar4 ar4Var = this.f54644k;
        if (ar4Var != null && ar4Var.getState() == 1) {
            throw ((ar4.C1571a) v80.checkNotNull(this.f54644k.getError()));
        }
    }

    public final synchronized long peekSourceId() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return hasNextSample() ? this.f54646m[getRelativeIndex(this.f54655v)] : this.f54632F;
    }

    @un1
    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    @un1
    public int read(oq6 oq6Var, rl3 rl3Var, int i, boolean z) {
        int iPeekSampleMetadata = peekSampleMetadata(oq6Var, rl3Var, (i & 2) != 0, z, this.f54638e);
        if (iPeekSampleMetadata == -4 && !rl3Var.isEndOfStream()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.f54637d.peekToBuffer(rl3Var, this.f54638e);
                } else {
                    this.f54637d.readToBuffer(rl3Var, this.f54638e);
                }
            }
            if (!z2) {
                this.f54655v++;
            }
        }
        return iPeekSampleMetadata;
    }

    @un1
    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public final void reset() {
        reset(false);
    }

    @Override // p000.q6h
    public final int sampleData(bh3 bh3Var, int i, boolean z, int i2) throws IOException {
        return this.f54637d.sampleData(bh3Var, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // p000.q6h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sampleMetadata(long r12, int r14, int r15, int r16, @p000.hib p000.q6h.C11325a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f54629C
            if (r0 == 0) goto L10
            androidx.media3.common.a r0 = r8.f54630D
            java.lang.Object r0 = p000.v80.checkStateNotNull(r0)
            androidx.media3.common.a r0 = (androidx.media3.common.C1213a) r0
            r11.format(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f54627A
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f54627A = r1
        L22:
            long r4 = r8.f54635I
            long r4 = r4 + r12
            boolean r6 = r8.f54633G
            if (r6 == 0) goto L54
            long r6 = r8.f54656w
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.f54634H
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            androidx.media3.common.a r6 = r8.f54631E
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            p000.xh9.m25148w(r6, r0)
            r8.f54634H = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.f54636J
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.attemptSplice(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.f54636J = r1
            goto L66
        L65:
            return
        L66:
            gle r0 = r8.f54637d
            long r0 = r0.getTotalBytesWritten()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.commitSample(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kle.sampleMetadata(long, int, int, int, q6h$a):void");
    }

    public final synchronized boolean seekTo(int i) {
        rewind();
        int i2 = this.f54653t;
        if (i >= i2 && i <= this.f54652s + i2) {
            this.f54656w = Long.MIN_VALUE;
            this.f54655v = i - i2;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long j) {
        if (this.f54635I != j) {
            this.f54635I = j;
            m14820b();
        }
    }

    public final void setStartTimeUs(long j) {
        this.f54656w = j;
    }

    public final void setUpstreamFormatChangeListener(@hib InterfaceC8447d interfaceC8447d) {
        this.f54642i = interfaceC8447d;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void skip(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f54655v     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f54652s     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            p000.v80.checkArgument(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f54655v     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f54655v = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kle.skip(int):void");
    }

    public final void sourceId(long j) {
        this.f54632F = j;
    }

    public final void splice() {
        this.f54636J = true;
    }

    @un1
    public void reset(boolean z) {
        this.f54637d.reset();
        this.f54652s = 0;
        this.f54653t = 0;
        this.f54654u = 0;
        this.f54655v = 0;
        this.f54627A = true;
        this.f54656w = Long.MIN_VALUE;
        this.f54657x = Long.MIN_VALUE;
        this.f54658y = Long.MIN_VALUE;
        this.f54659z = false;
        this.f54639f.clear();
        if (z) {
            this.f54630D = null;
            this.f54631E = null;
            this.f54628B = true;
            this.f54633G = true;
        }
    }

    @Override // p000.q6h
    public final void sampleData(jhc jhcVar, int i, int i2) {
        this.f54637d.sampleData(jhcVar, i);
    }

    @Deprecated
    public static kle createWithDrm(InterfaceC5892fn interfaceC5892fn, Looper looper, or4 or4Var, nr4.C10020a c10020a) {
        or4Var.setPlayer(looper, j0d.f49299d);
        return new kle(interfaceC5892fn, (or4) v80.checkNotNull(or4Var), (nr4.C10020a) v80.checkNotNull(c10020a));
    }

    public final synchronized boolean seekTo(long j, boolean z) {
        int iFindSampleBefore;
        try {
            rewind();
            int relativeIndex = getRelativeIndex(this.f54655v);
            if (hasNextSample() && j >= this.f54650q[relativeIndex] && (j <= this.f54658y || z)) {
                if (this.f54633G) {
                    iFindSampleBefore = findSampleAfter(relativeIndex, this.f54652s - this.f54655v, j, z);
                } else {
                    iFindSampleBefore = findSampleBefore(relativeIndex, this.f54652s - this.f54655v, j, true);
                }
                if (iFindSampleBefore == -1) {
                    return false;
                }
                this.f54656w = j;
                this.f54655v += iFindSampleBefore;
                return true;
            }
            return false;
        } finally {
        }
    }
}
