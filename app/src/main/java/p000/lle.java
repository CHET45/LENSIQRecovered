package p000;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC3004d;
import com.google.android.exoplayer2.drm.InterfaceC3005e;
import com.google.android.exoplayer2.drm.InterfaceC3006f;
import java.io.IOException;
import p000.lle;
import p000.r6h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class lle implements r6h {

    /* JADX INFO: renamed from: K */
    @fdi
    public static final int f58147K = 1000;

    /* JADX INFO: renamed from: L */
    public static final String f58148L = "SampleQueue";

    /* JADX INFO: renamed from: C */
    public boolean f58151C;

    /* JADX INFO: renamed from: D */
    @hib
    public kq6 f58152D;

    /* JADX INFO: renamed from: E */
    @hib
    public kq6 f58153E;

    /* JADX INFO: renamed from: F */
    public long f58154F;

    /* JADX INFO: renamed from: G */
    public boolean f58155G;

    /* JADX INFO: renamed from: H */
    public boolean f58156H;

    /* JADX INFO: renamed from: I */
    public long f58157I;

    /* JADX INFO: renamed from: J */
    public boolean f58158J;

    /* JADX INFO: renamed from: d */
    public final hle f58159d;

    /* JADX INFO: renamed from: g */
    @hib
    public final InterfaceC3006f f58162g;

    /* JADX INFO: renamed from: h */
    @hib
    public final InterfaceC3005e.a f58163h;

    /* JADX INFO: renamed from: i */
    @hib
    public InterfaceC8890d f58164i;

    /* JADX INFO: renamed from: j */
    @hib
    public kq6 f58165j;

    /* JADX INFO: renamed from: k */
    @hib
    public InterfaceC3004d f58166k;

    /* JADX INFO: renamed from: s */
    public int f58174s;

    /* JADX INFO: renamed from: t */
    public int f58175t;

    /* JADX INFO: renamed from: u */
    public int f58176u;

    /* JADX INFO: renamed from: v */
    public int f58177v;

    /* JADX INFO: renamed from: z */
    public boolean f58181z;

    /* JADX INFO: renamed from: e */
    public final C8888b f58160e = new C8888b();

    /* JADX INFO: renamed from: l */
    public int f58167l = 1000;

    /* JADX INFO: renamed from: m */
    public long[] f58168m = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f58169n = new long[1000];

    /* JADX INFO: renamed from: q */
    public long[] f58172q = new long[1000];

    /* JADX INFO: renamed from: p */
    public int[] f58171p = new int[1000];

    /* JADX INFO: renamed from: o */
    public int[] f58170o = new int[1000];

    /* JADX INFO: renamed from: r */
    public r6h.C11906a[] f58173r = new r6h.C11906a[1000];

    /* JADX INFO: renamed from: f */
    public final exf<C8889c> f58161f = new exf<>(new ru2() { // from class: ile
        @Override // p000.ru2
        public final void accept(Object obj) {
            lle.lambda$new$0((lle.C8889c) obj);
        }
    });

    /* JADX INFO: renamed from: w */
    public long f58178w = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x */
    public long f58179x = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public long f58180y = Long.MIN_VALUE;

    /* JADX INFO: renamed from: B */
    public boolean f58150B = true;

    /* JADX INFO: renamed from: A */
    public boolean f58149A = true;

    /* JADX INFO: renamed from: lle$b */
    public static final class C8888b {

        /* JADX INFO: renamed from: a */
        public int f58182a;

        /* JADX INFO: renamed from: b */
        public long f58183b;

        /* JADX INFO: renamed from: c */
        @hib
        public r6h.C11906a f58184c;
    }

    /* JADX INFO: renamed from: lle$c */
    public static final class C8889c {

        /* JADX INFO: renamed from: a */
        public final kq6 f58185a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC3006f.b f58186b;

        private C8889c(kq6 kq6Var, InterfaceC3006f.b bVar) {
            this.f58185a = kq6Var;
            this.f58186b = bVar;
        }
    }

    /* JADX INFO: renamed from: lle$d */
    public interface InterfaceC8890d {
        void onUpstreamFormatChanged(kq6 kq6Var);
    }

    public lle(InterfaceC6430gn interfaceC6430gn, @hib InterfaceC3006f interfaceC3006f, @hib InterfaceC3005e.a aVar) {
        this.f58162g = interfaceC3006f;
        this.f58163h = aVar;
        this.f58159d = new hle(interfaceC6430gn);
    }

    private synchronized boolean attemptSplice(long j) {
        if (this.f58174s == 0) {
            return j > this.f58179x;
        }
        if (getLargestReadTimestampUs() >= j) {
            return false;
        }
        discardUpstreamSampleMetadata(this.f58175t + countUnreadSamplesBefore(j));
        return true;
    }

    private synchronized void commitSample(long j, int i, long j2, int i2, @hib r6h.C11906a c11906a) {
        try {
            int i3 = this.f58174s;
            if (i3 > 0) {
                int relativeIndex = getRelativeIndex(i3 - 1);
                u80.checkArgument(this.f58169n[relativeIndex] + ((long) this.f58170o[relativeIndex]) <= j2);
            }
            this.f58181z = (536870912 & i) != 0;
            this.f58180y = Math.max(this.f58180y, j);
            int relativeIndex2 = getRelativeIndex(this.f58174s);
            this.f58172q[relativeIndex2] = j;
            this.f58169n[relativeIndex2] = j2;
            this.f58170o[relativeIndex2] = i2;
            this.f58171p[relativeIndex2] = i;
            this.f58173r[relativeIndex2] = c11906a;
            this.f58168m[relativeIndex2] = this.f58154F;
            if (this.f58161f.isEmpty() || !this.f58161f.getEndValue().f58185a.equals(this.f58153E)) {
                InterfaceC3006f interfaceC3006f = this.f58162g;
                this.f58161f.appendSpan(getWriteIndex(), new C8889c((kq6) u80.checkNotNull(this.f58153E), interfaceC3006f != null ? interfaceC3006f.preacquireSession(this.f58163h, this.f58153E) : InterfaceC3006f.b.f19507a));
            }
            int i4 = this.f58174s + 1;
            this.f58174s = i4;
            int i5 = this.f58167l;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                r6h.C11906a[] c11906aArr = new r6h.C11906a[i6];
                int i7 = this.f58176u;
                int i8 = i5 - i7;
                System.arraycopy(this.f58169n, i7, jArr2, 0, i8);
                System.arraycopy(this.f58172q, this.f58176u, jArr3, 0, i8);
                System.arraycopy(this.f58171p, this.f58176u, iArr, 0, i8);
                System.arraycopy(this.f58170o, this.f58176u, iArr2, 0, i8);
                System.arraycopy(this.f58173r, this.f58176u, c11906aArr, 0, i8);
                System.arraycopy(this.f58168m, this.f58176u, jArr, 0, i8);
                int i9 = this.f58176u;
                System.arraycopy(this.f58169n, 0, jArr2, i8, i9);
                System.arraycopy(this.f58172q, 0, jArr3, i8, i9);
                System.arraycopy(this.f58171p, 0, iArr, i8, i9);
                System.arraycopy(this.f58170o, 0, iArr2, i8, i9);
                System.arraycopy(this.f58173r, 0, c11906aArr, i8, i9);
                System.arraycopy(this.f58168m, 0, jArr, i8, i9);
                this.f58169n = jArr2;
                this.f58172q = jArr3;
                this.f58171p = iArr;
                this.f58170o = iArr2;
                this.f58173r = c11906aArr;
                this.f58168m = jArr;
                this.f58176u = 0;
                this.f58167l = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int countUnreadSamplesBefore(long j) {
        int i = this.f58174s;
        int relativeIndex = getRelativeIndex(i - 1);
        while (i > this.f58177v && this.f58172q[relativeIndex] >= j) {
            i--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.f58167l - 1;
            }
        }
        return i;
    }

    public static lle createWithDrm(InterfaceC6430gn interfaceC6430gn, InterfaceC3006f interfaceC3006f, InterfaceC3005e.a aVar) {
        return new lle(interfaceC6430gn, (InterfaceC3006f) u80.checkNotNull(interfaceC3006f), (InterfaceC3005e.a) u80.checkNotNull(aVar));
    }

    public static lle createWithoutDrm(InterfaceC6430gn interfaceC6430gn) {
        return new lle(interfaceC6430gn, null, null);
    }

    private synchronized long discardSampleMetadataTo(long j, boolean z, boolean z2) {
        int i;
        try {
            int i2 = this.f58174s;
            if (i2 != 0) {
                long[] jArr = this.f58172q;
                int i3 = this.f58176u;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.f58177v) != i2) {
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
        int i = this.f58174s;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    @xc7("this")
    private long discardSamples(int i) {
        this.f58179x = Math.max(this.f58179x, getLargestTimestamp(i));
        this.f58174s -= i;
        int i2 = this.f58175t + i;
        this.f58175t = i2;
        int i3 = this.f58176u + i;
        this.f58176u = i3;
        int i4 = this.f58167l;
        if (i3 >= i4) {
            this.f58176u = i3 - i4;
        }
        int i5 = this.f58177v - i;
        this.f58177v = i5;
        if (i5 < 0) {
            this.f58177v = 0;
        }
        this.f58161f.discardTo(i2);
        if (this.f58174s != 0) {
            return this.f58169n[this.f58176u];
        }
        int i6 = this.f58176u;
        if (i6 == 0) {
            i6 = this.f58167l;
        }
        int i7 = i6 - 1;
        return this.f58169n[i7] + ((long) this.f58170o[i7]);
    }

    private long discardUpstreamSampleMetadata(int i) {
        int writeIndex = getWriteIndex() - i;
        boolean z = false;
        u80.checkArgument(writeIndex >= 0 && writeIndex <= this.f58174s - this.f58177v);
        int i2 = this.f58174s - writeIndex;
        this.f58174s = i2;
        this.f58180y = Math.max(this.f58179x, getLargestTimestamp(i2));
        if (writeIndex == 0 && this.f58181z) {
            z = true;
        }
        this.f58181z = z;
        this.f58161f.discardFrom(i);
        int i3 = this.f58174s;
        if (i3 == 0) {
            return 0L;
        }
        int relativeIndex = getRelativeIndex(i3 - 1);
        return this.f58169n[relativeIndex] + ((long) this.f58170o[relativeIndex]);
    }

    private int findSampleBefore(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f58172q[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f58171p[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f58167l) {
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
            jMax = Math.max(jMax, this.f58172q[relativeIndex]);
            if ((this.f58171p[relativeIndex] & 1) != 0) {
                break;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.f58167l - 1;
            }
        }
        return jMax;
    }

    private int getRelativeIndex(int i) {
        int i2 = this.f58176u + i;
        int i3 = this.f58167l;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private boolean hasNextSample() {
        return this.f58177v != this.f58174s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(C8889c c8889c) {
        c8889c.f58186b.release();
    }

    private boolean mayReadSample(int i) {
        InterfaceC3004d interfaceC3004d = this.f58166k;
        return interfaceC3004d == null || interfaceC3004d.getState() == 4 || ((this.f58171p[i] & 1073741824) == 0 && this.f58166k.playClearSamplesWithoutKeys());
    }

    private void onFormatResult(kq6 kq6Var, nq6 nq6Var) {
        kq6 kq6Var2 = this.f58165j;
        boolean z = kq6Var2 == null;
        DrmInitData drmInitData = z ? null : kq6Var2.f54994X;
        this.f58165j = kq6Var;
        DrmInitData drmInitData2 = kq6Var.f54994X;
        InterfaceC3006f interfaceC3006f = this.f58162g;
        nq6Var.f65258b = interfaceC3006f != null ? kq6Var.copyWithCryptoType(interfaceC3006f.getCryptoType(kq6Var)) : kq6Var;
        nq6Var.f65257a = this.f58166k;
        if (this.f58162g == null) {
            return;
        }
        if (z || !x0i.areEqual(drmInitData, drmInitData2)) {
            InterfaceC3004d interfaceC3004d = this.f58166k;
            InterfaceC3004d interfaceC3004dAcquireSession = this.f58162g.acquireSession(this.f58163h, kq6Var);
            this.f58166k = interfaceC3004dAcquireSession;
            nq6Var.f65257a = interfaceC3004dAcquireSession;
            if (interfaceC3004d != null) {
                interfaceC3004d.release(this.f58163h);
            }
        }
    }

    private synchronized int peekSampleMetadata(nq6 nq6Var, sl3 sl3Var, boolean z, boolean z2, C8888b c8888b) {
        try {
            sl3Var.f82163e = false;
            if (!hasNextSample()) {
                if (!z2 && !this.f58181z) {
                    kq6 kq6Var = this.f58153E;
                    if (kq6Var == null || (!z && kq6Var == this.f58165j)) {
                        return -3;
                    }
                    onFormatResult((kq6) u80.checkNotNull(kq6Var), nq6Var);
                    return -5;
                }
                sl3Var.setFlags(4);
                return -4;
            }
            kq6 kq6Var2 = this.f58161f.get(getReadIndex()).f58185a;
            if (!z && kq6Var2 == this.f58165j) {
                int relativeIndex = getRelativeIndex(this.f58177v);
                if (!mayReadSample(relativeIndex)) {
                    sl3Var.f82163e = true;
                    return -3;
                }
                sl3Var.setFlags(this.f58171p[relativeIndex]);
                if (this.f58177v == this.f58174s - 1 && (z2 || this.f58181z)) {
                    sl3Var.addFlag(536870912);
                }
                long j = this.f58172q[relativeIndex];
                sl3Var.f82164f = j;
                if (j < this.f58178w) {
                    sl3Var.addFlag(Integer.MIN_VALUE);
                }
                c8888b.f58182a = this.f58170o[relativeIndex];
                c8888b.f58183b = this.f58169n[relativeIndex];
                c8888b.f58184c = this.f58173r[relativeIndex];
                return -4;
            }
            onFormatResult(kq6Var2, nq6Var);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void releaseDrmSessionReferences() {
        InterfaceC3004d interfaceC3004d = this.f58166k;
        if (interfaceC3004d != null) {
            interfaceC3004d.release(this.f58163h);
            this.f58166k = null;
            this.f58165j = null;
        }
    }

    private synchronized void rewind() {
        this.f58177v = 0;
        this.f58159d.rewind();
    }

    private synchronized boolean setUpstreamFormat(kq6 kq6Var) {
        try {
            this.f58150B = false;
            if (x0i.areEqual(kq6Var, this.f58153E)) {
                return false;
            }
            if (this.f58161f.isEmpty() || !this.f58161f.getEndValue().f58185a.equals(kq6Var)) {
                this.f58153E = kq6Var;
            } else {
                this.f58153E = this.f58161f.getEndValue().f58185a;
            }
            kq6 kq6Var2 = this.f58153E;
            this.f58155G = sva.allSamplesAreSyncSamples(kq6Var2.f54989M, kq6Var2.f54986F);
            this.f58156H = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @un1
    /* JADX INFO: renamed from: b */
    public kq6 m16225b(kq6 kq6Var) {
        return (this.f58157I == 0 || kq6Var.f54995Y == Long.MAX_VALUE) ? kq6Var : kq6Var.buildUpon().setSubsampleOffsetUs(kq6Var.f54995Y + this.f58157I).build();
    }

    /* JADX INFO: renamed from: c */
    public final void m16226c() {
        this.f58151C = true;
    }

    public synchronized long discardSampleMetadataToRead() {
        int i = this.f58177v;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    public final void discardTo(long j, boolean z, boolean z2) {
        this.f58159d.discardDownstreamTo(discardSampleMetadataTo(j, z, z2));
    }

    public final void discardToEnd() {
        this.f58159d.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.f58159d.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j) {
        if (this.f58174s == 0) {
            return;
        }
        u80.checkArgument(j > getLargestReadTimestampUs());
        discardUpstreamSamples(this.f58175t + countUnreadSamplesBefore(j));
    }

    public final void discardUpstreamSamples(int i) {
        this.f58159d.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i));
    }

    @Override // p000.r6h
    public final void format(kq6 kq6Var) {
        kq6 kq6VarM16225b = m16225b(kq6Var);
        this.f58151C = false;
        this.f58152D = kq6Var;
        boolean upstreamFormat = setUpstreamFormat(kq6VarM16225b);
        InterfaceC8890d interfaceC8890d = this.f58164i;
        if (interfaceC8890d == null || !upstreamFormat) {
            return;
        }
        interfaceC8890d.onUpstreamFormatChanged(kq6VarM16225b);
    }

    public final int getFirstIndex() {
        return this.f58175t;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.f58174s == 0 ? Long.MIN_VALUE : this.f58172q[this.f58176u];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.f58180y;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.f58179x, getLargestTimestamp(this.f58177v));
    }

    public final int getReadIndex() {
        return this.f58175t + this.f58177v;
    }

    public final synchronized int getSkipCount(long j, boolean z) {
        int relativeIndex = getRelativeIndex(this.f58177v);
        if (hasNextSample() && j >= this.f58172q[relativeIndex]) {
            if (j > this.f58180y && z) {
                return this.f58174s - this.f58177v;
            }
            int iFindSampleBefore = findSampleBefore(relativeIndex, this.f58174s - this.f58177v, j, true);
            if (iFindSampleBefore == -1) {
                return 0;
            }
            return iFindSampleBefore;
        }
        return 0;
    }

    @hib
    public final synchronized kq6 getUpstreamFormat() {
        return this.f58150B ? null : this.f58153E;
    }

    public final int getWriteIndex() {
        return this.f58175t + this.f58174s;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.f58181z;
    }

    @un1
    public synchronized boolean isReady(boolean z) {
        kq6 kq6Var;
        boolean z2 = true;
        if (hasNextSample()) {
            if (this.f58161f.get(getReadIndex()).f58185a != this.f58165j) {
                return true;
            }
            return mayReadSample(getRelativeIndex(this.f58177v));
        }
        if (!z && !this.f58181z && ((kq6Var = this.f58153E) == null || kq6Var == this.f58165j)) {
            z2 = false;
        }
        return z2;
    }

    @un1
    public void maybeThrowError() throws IOException {
        InterfaceC3004d interfaceC3004d = this.f58166k;
        if (interfaceC3004d != null && interfaceC3004d.getState() == 1) {
            throw ((InterfaceC3004d.a) u80.checkNotNull(this.f58166k.getError()));
        }
    }

    public final synchronized long peekSourceId() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return hasNextSample() ? this.f58168m[getRelativeIndex(this.f58177v)] : this.f58154F;
    }

    @un1
    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    @un1
    public int read(nq6 nq6Var, sl3 sl3Var, int i, boolean z) {
        int iPeekSampleMetadata = peekSampleMetadata(nq6Var, sl3Var, (i & 2) != 0, z, this.f58160e);
        if (iPeekSampleMetadata == -4 && !sl3Var.isEndOfStream()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z2) {
                    this.f58159d.peekToBuffer(sl3Var, this.f58160e);
                } else {
                    this.f58159d.readToBuffer(sl3Var, this.f58160e);
                }
            }
            if (!z2) {
                this.f58177v++;
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

    @Override // p000.r6h
    public final int sampleData(ah3 ah3Var, int i, boolean z, int i2) throws IOException {
        return this.f58159d.sampleData(ah3Var, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // p000.r6h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sampleMetadata(long r12, int r14, int r15, int r16, @p000.hib p000.r6h.C11906a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f58151C
            if (r0 == 0) goto L10
            kq6 r0 = r8.f58152D
            java.lang.Object r0 = p000.u80.checkStateNotNull(r0)
            kq6 r0 = (p000.kq6) r0
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
            boolean r4 = r8.f58149A
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f58149A = r1
        L22:
            long r4 = r8.f58157I
            long r4 = r4 + r12
            boolean r6 = r8.f58155G
            if (r6 == 0) goto L54
            long r6 = r8.f58178w
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.f58156H
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            kq6 r6 = r8.f58153E
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            p000.yh9.m25919w(r6, r0)
            r8.f58156H = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.f58158J
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.attemptSplice(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.f58158J = r1
            goto L66
        L65:
            return
        L66:
            hle r0 = r8.f58159d
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
        throw new UnsupportedOperationException("Method not decompiled: p000.lle.sampleMetadata(long, int, int, int, r6h$a):void");
    }

    public final synchronized boolean seekTo(int i) {
        rewind();
        int i2 = this.f58175t;
        if (i >= i2 && i <= this.f58174s + i2) {
            this.f58178w = Long.MIN_VALUE;
            this.f58177v = i - i2;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long j) {
        if (this.f58157I != j) {
            this.f58157I = j;
            m16226c();
        }
    }

    public final void setStartTimeUs(long j) {
        this.f58178w = j;
    }

    public final void setUpstreamFormatChangeListener(@hib InterfaceC8890d interfaceC8890d) {
        this.f58164i = interfaceC8890d;
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
            int r0 = r2.f58177v     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f58174s     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            p000.u80.checkArgument(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f58177v     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f58177v = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lle.skip(int):void");
    }

    public final void sourceId(long j) {
        this.f58154F = j;
    }

    public final void splice() {
        this.f58158J = true;
    }

    @un1
    public void reset(boolean z) {
        this.f58159d.reset();
        this.f58174s = 0;
        this.f58175t = 0;
        this.f58176u = 0;
        this.f58177v = 0;
        this.f58149A = true;
        this.f58178w = Long.MIN_VALUE;
        this.f58179x = Long.MIN_VALUE;
        this.f58180y = Long.MIN_VALUE;
        this.f58181z = false;
        this.f58161f.clear();
        if (z) {
            this.f58152D = null;
            this.f58153E = null;
            this.f58150B = true;
        }
    }

    @Override // p000.r6h
    public final void sampleData(ihc ihcVar, int i, int i2) {
        this.f58159d.sampleData(ihcVar, i);
    }

    @Deprecated
    public static lle createWithDrm(InterfaceC6430gn interfaceC6430gn, Looper looper, InterfaceC3006f interfaceC3006f, InterfaceC3005e.a aVar) {
        interfaceC3006f.setPlayer(looper, k0d.f52345b);
        return new lle(interfaceC6430gn, (InterfaceC3006f) u80.checkNotNull(interfaceC3006f), (InterfaceC3005e.a) u80.checkNotNull(aVar));
    }

    public final synchronized boolean seekTo(long j, boolean z) {
        rewind();
        int relativeIndex = getRelativeIndex(this.f58177v);
        if (hasNextSample() && j >= this.f58172q[relativeIndex] && (j <= this.f58180y || z)) {
            int iFindSampleBefore = findSampleBefore(relativeIndex, this.f58174s - this.f58177v, j, true);
            if (iFindSampleBefore == -1) {
                return false;
            }
            this.f58178w = j;
            this.f58177v += iFindSampleBefore;
            return true;
        }
        return false;
    }
}
