package p000;

import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import p000.hue;
import p000.kq6;

/* JADX INFO: renamed from: qn */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C11562qn implements yj5 {

    /* JADX INFO: renamed from: A */
    public static final int f74949A = 20;

    /* JADX INFO: renamed from: B */
    public static final int f74950B = 16000;

    /* JADX INFO: renamed from: C */
    public static final int f74951C = 8000;

    /* JADX INFO: renamed from: D */
    public static final int f74952D = 20000;

    /* JADX INFO: renamed from: t */
    public static final int f74954t = 1;

    /* JADX INFO: renamed from: u */
    public static final int f74955u = 2;

    /* JADX INFO: renamed from: w */
    public static final int[] f74957w;

    /* JADX INFO: renamed from: z */
    public static final int f74960z;

    /* JADX INFO: renamed from: d */
    public final byte[] f74961d;

    /* JADX INFO: renamed from: e */
    public final int f74962e;

    /* JADX INFO: renamed from: f */
    public boolean f74963f;

    /* JADX INFO: renamed from: g */
    public long f74964g;

    /* JADX INFO: renamed from: h */
    public int f74965h;

    /* JADX INFO: renamed from: i */
    public int f74966i;

    /* JADX INFO: renamed from: j */
    public boolean f74967j;

    /* JADX INFO: renamed from: k */
    public long f74968k;

    /* JADX INFO: renamed from: l */
    public int f74969l;

    /* JADX INFO: renamed from: m */
    public int f74970m;

    /* JADX INFO: renamed from: n */
    public long f74971n;

    /* JADX INFO: renamed from: o */
    public ck5 f74972o;

    /* JADX INFO: renamed from: p */
    public r6h f74973p;

    /* JADX INFO: renamed from: q */
    public hue f74974q;

    /* JADX INFO: renamed from: r */
    public boolean f74975r;

    /* JADX INFO: renamed from: s */
    public static final hk5 f74953s = new hk5() { // from class: nn
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return C11562qn.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: v */
    public static final int[] f74956v = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: x */
    public static final byte[] f74958x = x0i.getUtf8Bytes("#!AMR\n");

    /* JADX INFO: renamed from: y */
    public static final byte[] f74959y = x0i.getUtf8Bytes("#!AMR-WB\n");

    /* JADX INFO: renamed from: qn$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f74957w = iArr;
        f74960z = iArr[8];
    }

    public C11562qn() {
        this(0);
    }

    @z25({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
        u80.checkStateNotNull(this.f74973p);
        x0i.castNonNull(this.f74972o);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m20443b() {
        byte[] bArr = f74958x;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m20444c() {
        byte[] bArr = f74959y;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: d */
    public static int m20445d(int i) {
        return f74956v[i];
    }

    /* JADX INFO: renamed from: e */
    public static int m20446e(int i) {
        return f74957w[i];
    }

    private static int getBitrateFromFrameSize(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }

    private hue getConstantBitrateSeekMap(long j, boolean z) {
        return new rt2(j, this.f74968k, getBitrateFromFrameSize(this.f74969l, 20000L), this.f74969l, z);
    }

    private int getFrameSizeInBytes(int i) throws xhc {
        if (isValidFrameType(i)) {
            return this.f74963f ? f74957w[i] : f74956v[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f74963f ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw xhc.createForMalformedContainer(sb.toString(), null);
    }

    private boolean isNarrowBandValidFrameType(int i) {
        return !this.f74963f && (i < 12 || i > 14);
    }

    private boolean isValidFrameType(int i) {
        return i >= 0 && i <= 15 && (isWideBandValidFrameType(i) || isNarrowBandValidFrameType(i));
    }

    private boolean isWideBandValidFrameType(int i) {
        return this.f74963f && (i < 10 || i > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new C11562qn()};
    }

    @g5e({"trackOutput"})
    private void maybeOutputFormat() {
        if (this.f74975r) {
            return;
        }
        this.f74975r = true;
        boolean z = this.f74963f;
        this.f74973p.format(new kq6.C8497b().setSampleMimeType(z ? "audio/amr-wb" : "audio/3gpp").setMaxInputSize(f74960z).setChannelCount(1).setSampleRate(z ? 16000 : 8000).build());
    }

    @g5e({"extractorOutput"})
    private void maybeOutputSeekMap(long j, int i) {
        int i2;
        if (this.f74967j) {
            return;
        }
        int i3 = this.f74962e;
        if ((i3 & 1) == 0 || j == -1 || !((i2 = this.f74969l) == -1 || i2 == this.f74965h)) {
            hue.C7024b c7024b = new hue.C7024b(-9223372036854775807L);
            this.f74974q = c7024b;
            this.f74972o.seekMap(c7024b);
            this.f74967j = true;
            return;
        }
        if (this.f74970m >= 20 || i == -1) {
            hue constantBitrateSeekMap = getConstantBitrateSeekMap(j, (i3 & 2) != 0);
            this.f74974q = constantBitrateSeekMap;
            this.f74972o.seekMap(constantBitrateSeekMap);
            this.f74967j = true;
        }
    }

    private static boolean peekAmrSignature(zj5 zj5Var, byte[] bArr) throws IOException {
        zj5Var.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        zj5Var.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int peekNextSampleSize(zj5 zj5Var) throws IOException {
        zj5Var.resetPeekPosition();
        zj5Var.peekFully(this.f74961d, 0, 1);
        byte b = this.f74961d[0];
        if ((b & 131) <= 0) {
            return getFrameSizeInBytes((b >> 3) & 15);
        }
        throw xhc.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b), null);
    }

    private boolean readAmrHeader(zj5 zj5Var) throws IOException {
        byte[] bArr = f74958x;
        if (peekAmrSignature(zj5Var, bArr)) {
            this.f74963f = false;
            zj5Var.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = f74959y;
        if (!peekAmrSignature(zj5Var, bArr2)) {
            return false;
        }
        this.f74963f = true;
        zj5Var.skipFully(bArr2.length);
        return true;
    }

    @g5e({"trackOutput"})
    private int readSample(zj5 zj5Var) throws IOException {
        if (this.f74966i == 0) {
            try {
                int iPeekNextSampleSize = peekNextSampleSize(zj5Var);
                this.f74965h = iPeekNextSampleSize;
                this.f74966i = iPeekNextSampleSize;
                if (this.f74969l == -1) {
                    this.f74968k = zj5Var.getPosition();
                    this.f74969l = this.f74965h;
                }
                if (this.f74969l == this.f74965h) {
                    this.f74970m++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iSampleData = this.f74973p.sampleData((ah3) zj5Var, this.f74966i, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i = this.f74966i - iSampleData;
        this.f74966i = i;
        if (i > 0) {
            return 0;
        }
        this.f74973p.sampleMetadata(this.f74971n + this.f74964g, 1, this.f74965h, 0, null);
        this.f74964g += 20000;
        return 0;
    }

    @Override // p000.yj5
    public void init(ck5 ck5Var) {
        this.f74972o = ck5Var;
        this.f74973p = ck5Var.track(0, 1);
        ck5Var.endTracks();
    }

    @Override // p000.yj5
    public int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        assertInitialized();
        if (zj5Var.getPosition() == 0 && !readAmrHeader(zj5Var)) {
            throw xhc.createForMalformedContainer("Could not find AMR header.", null);
        }
        maybeOutputFormat();
        int sample = readSample(zj5Var);
        maybeOutputSeekMap(zj5Var.getLength(), sample);
        return sample;
    }

    @Override // p000.yj5
    public void release() {
    }

    @Override // p000.yj5
    public void seek(long j, long j2) {
        this.f74964g = 0L;
        this.f74965h = 0;
        this.f74966i = 0;
        if (j != 0) {
            hue hueVar = this.f74974q;
            if (hueVar instanceof rt2) {
                this.f74971n = ((rt2) hueVar).getTimeUsAtPosition(j);
                return;
            }
        }
        this.f74971n = 0L;
    }

    @Override // p000.yj5
    public boolean sniff(zj5 zj5Var) throws IOException {
        return readAmrHeader(zj5Var);
    }

    public C11562qn(int i) {
        this.f74962e = (i & 2) != 0 ? i | 1 : i;
        this.f74961d = new byte[1];
        this.f74969l = -1;
    }
}
