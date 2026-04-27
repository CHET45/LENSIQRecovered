package p000;

import org.tensorflow.lite.schema.BuiltinOptions;
import p000.C12443s5;
import p000.dkh;
import p000.kq6;

/* JADX INFO: renamed from: p5 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C10796p5 implements cy4 {

    /* JADX INFO: renamed from: m */
    public static final int f69681m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f69682n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f69683o = 2;

    /* JADX INFO: renamed from: p */
    public static final int f69684p = 128;

    /* JADX INFO: renamed from: a */
    public final ghc f69685a;

    /* JADX INFO: renamed from: b */
    public final ihc f69686b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f69687c;

    /* JADX INFO: renamed from: d */
    public String f69688d;

    /* JADX INFO: renamed from: e */
    public r6h f69689e;

    /* JADX INFO: renamed from: f */
    public int f69690f;

    /* JADX INFO: renamed from: g */
    public int f69691g;

    /* JADX INFO: renamed from: h */
    public boolean f69692h;

    /* JADX INFO: renamed from: i */
    public long f69693i;

    /* JADX INFO: renamed from: j */
    public kq6 f69694j;

    /* JADX INFO: renamed from: k */
    public int f69695k;

    /* JADX INFO: renamed from: l */
    public long f69696l;

    public C10796p5() {
        this(null);
    }

    private boolean continueRead(ihc ihcVar, byte[] bArr, int i) {
        int iMin = Math.min(ihcVar.bytesLeft(), i - this.f69691g);
        ihcVar.readBytes(bArr, this.f69691g, iMin);
        int i2 = this.f69691g + iMin;
        this.f69691g = i2;
        return i2 == i;
    }

    @g5e({"output"})
    private void parseHeader() {
        this.f69685a.setPosition(0);
        C12443s5.b ac3SyncframeInfo = C12443s5.parseAc3SyncframeInfo(this.f69685a);
        kq6 kq6Var = this.f69694j;
        if (kq6Var == null || ac3SyncframeInfo.f80680d != kq6Var.f55007e2 || ac3SyncframeInfo.f80679c != kq6Var.f55009f2 || !x0i.areEqual(ac3SyncframeInfo.f80677a, kq6Var.f54989M)) {
            kq6.C8497b peakBitrate = new kq6.C8497b().setId(this.f69688d).setSampleMimeType(ac3SyncframeInfo.f80677a).setChannelCount(ac3SyncframeInfo.f80680d).setSampleRate(ac3SyncframeInfo.f80679c).setLanguage(this.f69687c).setPeakBitrate(ac3SyncframeInfo.f80683g);
            if ("audio/ac3".equals(ac3SyncframeInfo.f80677a)) {
                peakBitrate.setAverageBitrate(ac3SyncframeInfo.f80683g);
            }
            kq6 kq6VarBuild = peakBitrate.build();
            this.f69694j = kq6VarBuild;
            this.f69689e.format(kq6VarBuild);
        }
        this.f69695k = ac3SyncframeInfo.f80681e;
        this.f69693i = (((long) ac3SyncframeInfo.f80682f) * 1000000) / ((long) this.f69694j.f55009f2);
    }

    private boolean skipToNextSync(ihc ihcVar) {
        while (true) {
            if (ihcVar.bytesLeft() <= 0) {
                return false;
            }
            if (this.f69692h) {
                int unsignedByte = ihcVar.readUnsignedByte();
                if (unsignedByte == 119) {
                    this.f69692h = false;
                    return true;
                }
                this.f69692h = unsignedByte == 11;
            } else {
                this.f69692h = ihcVar.readUnsignedByte() == 11;
            }
        }
    }

    @Override // p000.cy4
    public void consume(ihc ihcVar) {
        u80.checkStateNotNull(this.f69689e);
        while (ihcVar.bytesLeft() > 0) {
            int i = this.f69690f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(ihcVar.bytesLeft(), this.f69695k - this.f69691g);
                        this.f69689e.sampleData(ihcVar, iMin);
                        int i2 = this.f69691g + iMin;
                        this.f69691g = i2;
                        int i3 = this.f69695k;
                        if (i2 == i3) {
                            long j = this.f69696l;
                            if (j != -9223372036854775807L) {
                                this.f69689e.sampleMetadata(j, 1, i3, 0, null);
                                this.f69696l += this.f69693i;
                            }
                            this.f69690f = 0;
                        }
                    }
                } else if (continueRead(ihcVar, this.f69686b.getData(), 128)) {
                    parseHeader();
                    this.f69686b.setPosition(0);
                    this.f69689e.sampleData(this.f69686b, 128);
                    this.f69690f = 2;
                }
            } else if (skipToNextSync(ihcVar)) {
                this.f69690f = 1;
                this.f69686b.getData()[0] = 11;
                this.f69686b.getData()[1] = BuiltinOptions.UnsortedSegmentMaxOptions;
                this.f69691g = 2;
            }
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        this.f69688d = c4838e.getFormatId();
        this.f69689e = ck5Var.track(c4838e.getTrackId(), 1);
    }

    @Override // p000.cy4
    public void packetFinished() {
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f69696l = j;
        }
    }

    @Override // p000.cy4
    public void seek() {
        this.f69690f = 0;
        this.f69691g = 0;
        this.f69692h = false;
        this.f69696l = -9223372036854775807L;
    }

    public C10796p5(@hib String str) {
        ghc ghcVar = new ghc(new byte[128]);
        this.f69685a = ghcVar;
        this.f69686b = new ihc(ghcVar.f39834a);
        this.f69690f = 0;
        this.f69696l = -9223372036854775807L;
        this.f69687c = str;
    }
}
