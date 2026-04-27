package p000;

import androidx.media3.common.C1213a;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import p000.gue;

/* JADX INFO: renamed from: pn */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C11029pn implements xj5 {

    /* JADX INFO: renamed from: D */
    public static final int f71432D = 20;

    /* JADX INFO: renamed from: E */
    public static final int f71433E = 16000;

    /* JADX INFO: renamed from: F */
    public static final int f71434F = 8000;

    /* JADX INFO: renamed from: G */
    public static final int f71435G = 20000;

    /* JADX INFO: renamed from: w */
    public static final int f71437w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f71438x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f71439y = 4;

    /* JADX INFO: renamed from: d */
    public final byte[] f71441d;

    /* JADX INFO: renamed from: e */
    public final int f71442e;

    /* JADX INFO: renamed from: f */
    public final q6h f71443f;

    /* JADX INFO: renamed from: g */
    public boolean f71444g;

    /* JADX INFO: renamed from: h */
    public long f71445h;

    /* JADX INFO: renamed from: i */
    public int f71446i;

    /* JADX INFO: renamed from: j */
    public int f71447j;

    /* JADX INFO: renamed from: k */
    public long f71448k;

    /* JADX INFO: renamed from: l */
    public int f71449l;

    /* JADX INFO: renamed from: m */
    public int f71450m;

    /* JADX INFO: renamed from: n */
    public long f71451n;

    /* JADX INFO: renamed from: o */
    public bk5 f71452o;

    /* JADX INFO: renamed from: p */
    public q6h f71453p;

    /* JADX INFO: renamed from: q */
    public q6h f71454q;

    /* JADX INFO: renamed from: r */
    public gue f71455r;

    /* JADX INFO: renamed from: s */
    public boolean f71456s;

    /* JADX INFO: renamed from: t */
    public long f71457t;

    /* JADX INFO: renamed from: u */
    public boolean f71458u;

    /* JADX INFO: renamed from: v */
    public static final ik5 f71436v = new ik5() { // from class: on
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return C11029pn.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: z */
    public static final int[] f71440z = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: A */
    public static final int[] f71429A = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: B */
    public static final byte[] f71430B = t0i.getUtf8Bytes("#!AMR\n");

    /* JADX INFO: renamed from: C */
    public static final byte[] f71431C = t0i.getUtf8Bytes("#!AMR-WB\n");

    /* JADX INFO: renamed from: pn$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C11029pn() {
        this(0);
    }

    @z25({"extractorOutput", "realTrackOutput"})
    private void assertInitialized() {
        v80.checkStateNotNull(this.f71453p);
        t0i.castNonNull(this.f71452o);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m19623b() {
        byte[] bArr = f71430B;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m19624c() {
        byte[] bArr = f71431C;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: d */
    public static int m19625d(int i) {
        return f71440z[i];
    }

    /* JADX INFO: renamed from: e */
    public static int m19626e(int i) {
        return f71429A[i];
    }

    private static int getBitrateFromFrameSize(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    private gue getConstantBitrateSeekMap(long j, boolean z) {
        return new st2(j, this.f71448k, getBitrateFromFrameSize(this.f71449l, 20000L), this.f71449l, z);
    }

    private int getFrameSizeInBytes(int i) throws yhc {
        if (isValidFrameType(i)) {
            return this.f71444g ? f71429A[i] : f71440z[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f71444g ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw yhc.createForMalformedContainer(sb.toString(), null);
    }

    private boolean isNarrowBandValidFrameType(int i) {
        return !this.f71444g && (i < 12 || i > 14);
    }

    private boolean isSeekTimeUsWithinRange(long j, long j2) {
        return Math.abs(j2 - j) < 20000;
    }

    private boolean isValidFrameType(int i) {
        return i >= 0 && i <= 15 && (isWideBandValidFrameType(i) || isNarrowBandValidFrameType(i));
    }

    private boolean isWideBandValidFrameType(int i) {
        return this.f71444g && (i < 10 || i > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$0() {
        return new xj5[]{new C11029pn()};
    }

    @g5e({"realTrackOutput"})
    private void maybeOutputFormat() {
        if (this.f71458u) {
            return;
        }
        this.f71458u = true;
        boolean z = this.f71444g;
        String str = z ? "audio/amr-wb" : "audio/amr";
        this.f71453p.format(new C1213a.b().setContainerMimeType(str).setSampleMimeType(z ? "audio/amr-wb" : "audio/3gpp").setMaxInputSize(z ? f71429A[8] : f71440z[7]).setChannelCount(1).setSampleRate(z ? 16000 : 8000).build());
    }

    @g5e({"extractorOutput", "realTrackOutput"})
    private void maybeOutputSeekMap(long j, int i) {
        int i2;
        if (this.f71455r != null) {
            return;
        }
        int i3 = this.f71442e;
        if ((i3 & 4) != 0) {
            this.f71455r = new l08(new long[]{this.f71448k}, new long[]{0}, -9223372036854775807L);
        } else if ((i3 & 1) == 0 || !((i2 = this.f71449l) == -1 || i2 == this.f71446i)) {
            this.f71455r = new gue.C6549b(-9223372036854775807L);
        } else if (this.f71450m >= 20 || i == -1) {
            gue constantBitrateSeekMap = getConstantBitrateSeekMap(j, (i3 & 2) != 0);
            this.f71455r = constantBitrateSeekMap;
            this.f71453p.durationUs(constantBitrateSeekMap.getDurationUs());
        }
        gue gueVar = this.f71455r;
        if (gueVar != null) {
            this.f71452o.seekMap(gueVar);
        }
    }

    private static boolean peekAmrSignature(ak5 ak5Var, byte[] bArr) throws IOException {
        ak5Var.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        ak5Var.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int peekNextSampleSize(ak5 ak5Var) throws IOException {
        ak5Var.resetPeekPosition();
        ak5Var.peekFully(this.f71441d, 0, 1);
        byte b = this.f71441d[0];
        if ((b & 131) <= 0) {
            return getFrameSizeInBytes((b >> 3) & 15);
        }
        throw yhc.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b), null);
    }

    private boolean readAmrHeader(ak5 ak5Var) throws IOException {
        byte[] bArr = f71430B;
        if (peekAmrSignature(ak5Var, bArr)) {
            this.f71444g = false;
            ak5Var.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = f71431C;
        if (!peekAmrSignature(ak5Var, bArr2)) {
            return false;
        }
        this.f71444g = true;
        ak5Var.skipFully(bArr2.length);
        return true;
    }

    @g5e({"realTrackOutput"})
    private int readSample(ak5 ak5Var) throws IOException {
        if (this.f71447j == 0) {
            try {
                int iPeekNextSampleSize = peekNextSampleSize(ak5Var);
                this.f71446i = iPeekNextSampleSize;
                this.f71447j = iPeekNextSampleSize;
                if (this.f71449l == -1) {
                    this.f71448k = ak5Var.getPosition();
                    this.f71449l = this.f71446i;
                }
                if (this.f71449l == this.f71446i) {
                    this.f71450m++;
                }
                gue gueVar = this.f71455r;
                if (gueVar instanceof l08) {
                    l08 l08Var = (l08) gueVar;
                    long j = this.f71451n + this.f71445h + 20000;
                    long position = ak5Var.getPosition() + ((long) this.f71446i);
                    if (!l08Var.isTimeUsInIndex(j, 100000L)) {
                        l08Var.addSeekPoint(j, position);
                    }
                    if (this.f71456s && isSeekTimeUsWithinRange(j, this.f71457t)) {
                        this.f71456s = false;
                        this.f71454q = this.f71453p;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iSampleData = this.f71454q.sampleData((bh3) ak5Var, this.f71447j, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i = this.f71447j - iSampleData;
        this.f71447j = i;
        if (i > 0) {
            return 0;
        }
        this.f71454q.sampleMetadata(this.f71451n + this.f71445h, 1, this.f71446i, 0, null);
        this.f71445h += 20000;
        return 0;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f71452o = bk5Var;
        q6h q6hVarTrack = bk5Var.track(0, 1);
        this.f71453p = q6hVarTrack;
        this.f71454q = q6hVarTrack;
        bk5Var.endTracks();
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        assertInitialized();
        if (ak5Var.getPosition() == 0 && !readAmrHeader(ak5Var)) {
            throw yhc.createForMalformedContainer("Could not find AMR header.", null);
        }
        maybeOutputFormat();
        int sample = readSample(ak5Var);
        maybeOutputSeekMap(ak5Var.getLength(), sample);
        if (sample == -1) {
            gue gueVar = this.f71455r;
            if (gueVar instanceof l08) {
                long j = this.f71451n + this.f71445h;
                ((l08) gueVar).setDurationUs(j);
                this.f71452o.seekMap(this.f71455r);
                this.f71453p.durationUs(j);
            }
        }
        return sample;
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        this.f71445h = 0L;
        this.f71446i = 0;
        this.f71447j = 0;
        this.f71457t = j2;
        gue gueVar = this.f71455r;
        if (!(gueVar instanceof l08)) {
            if (j == 0 || !(gueVar instanceof st2)) {
                this.f71451n = 0L;
                return;
            } else {
                this.f71451n = ((st2) gueVar).getTimeUsAtPosition(j);
                return;
            }
        }
        long timeUs = ((l08) gueVar).getTimeUs(j);
        this.f71451n = timeUs;
        if (isSeekTimeUsWithinRange(timeUs, this.f71457t)) {
            return;
        }
        this.f71456s = true;
        this.f71454q = this.f71443f;
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        return readAmrHeader(ak5Var);
    }

    public C11029pn(int i) {
        this.f71442e = (i & 2) != 0 ? i | 1 : i;
        this.f71441d = new byte[1];
        this.f71449l = -1;
        yd4 yd4Var = new yd4();
        this.f71443f = yd4Var;
        this.f71454q = yd4Var;
    }
}
