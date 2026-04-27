package p000;

import p000.C0070a6;
import p000.dkh;
import p000.kq6;

/* JADX INFO: renamed from: x5 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C14918x5 implements cy4 {

    /* JADX INFO: renamed from: n */
    public static final int f96714n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f96715o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f96716p = 2;

    /* JADX INFO: renamed from: a */
    public final ghc f96717a;

    /* JADX INFO: renamed from: b */
    public final ihc f96718b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f96719c;

    /* JADX INFO: renamed from: d */
    public String f96720d;

    /* JADX INFO: renamed from: e */
    public r6h f96721e;

    /* JADX INFO: renamed from: f */
    public int f96722f;

    /* JADX INFO: renamed from: g */
    public int f96723g;

    /* JADX INFO: renamed from: h */
    public boolean f96724h;

    /* JADX INFO: renamed from: i */
    public boolean f96725i;

    /* JADX INFO: renamed from: j */
    public long f96726j;

    /* JADX INFO: renamed from: k */
    public kq6 f96727k;

    /* JADX INFO: renamed from: l */
    public int f96728l;

    /* JADX INFO: renamed from: m */
    public long f96729m;

    public C14918x5() {
        this(null);
    }

    private boolean continueRead(ihc ihcVar, byte[] bArr, int i) {
        int iMin = Math.min(ihcVar.bytesLeft(), i - this.f96723g);
        ihcVar.readBytes(bArr, this.f96723g, iMin);
        int i2 = this.f96723g + iMin;
        this.f96723g = i2;
        return i2 == i;
    }

    @g5e({"output"})
    private void parseHeader() {
        this.f96717a.setPosition(0);
        C0070a6.b ac4SyncframeInfo = C0070a6.parseAc4SyncframeInfo(this.f96717a);
        kq6 kq6Var = this.f96727k;
        if (kq6Var == null || ac4SyncframeInfo.f490c != kq6Var.f55007e2 || ac4SyncframeInfo.f489b != kq6Var.f55009f2 || !"audio/ac4".equals(kq6Var.f54989M)) {
            kq6 kq6VarBuild = new kq6.C8497b().setId(this.f96720d).setSampleMimeType("audio/ac4").setChannelCount(ac4SyncframeInfo.f490c).setSampleRate(ac4SyncframeInfo.f489b).setLanguage(this.f96719c).build();
            this.f96727k = kq6VarBuild;
            this.f96721e.format(kq6VarBuild);
        }
        this.f96728l = ac4SyncframeInfo.f491d;
        this.f96726j = (((long) ac4SyncframeInfo.f492e) * 1000000) / ((long) this.f96727k.f55009f2);
    }

    private boolean skipToNextSync(ihc ihcVar) {
        int unsignedByte;
        while (true) {
            if (ihcVar.bytesLeft() <= 0) {
                return false;
            }
            if (this.f96724h) {
                unsignedByte = ihcVar.readUnsignedByte();
                this.f96724h = unsignedByte == 172;
                if (unsignedByte == 64 || unsignedByte == 65) {
                    break;
                }
            } else {
                this.f96724h = ihcVar.readUnsignedByte() == 172;
            }
        }
        this.f96725i = unsignedByte == 65;
        return true;
    }

    @Override // p000.cy4
    public void consume(ihc ihcVar) {
        u80.checkStateNotNull(this.f96721e);
        while (ihcVar.bytesLeft() > 0) {
            int i = this.f96722f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(ihcVar.bytesLeft(), this.f96728l - this.f96723g);
                        this.f96721e.sampleData(ihcVar, iMin);
                        int i2 = this.f96723g + iMin;
                        this.f96723g = i2;
                        int i3 = this.f96728l;
                        if (i2 == i3) {
                            long j = this.f96729m;
                            if (j != -9223372036854775807L) {
                                this.f96721e.sampleMetadata(j, 1, i3, 0, null);
                                this.f96729m += this.f96726j;
                            }
                            this.f96722f = 0;
                        }
                    }
                } else if (continueRead(ihcVar, this.f96718b.getData(), 16)) {
                    parseHeader();
                    this.f96718b.setPosition(0);
                    this.f96721e.sampleData(this.f96718b, 16);
                    this.f96722f = 2;
                }
            } else if (skipToNextSync(ihcVar)) {
                this.f96722f = 1;
                this.f96718b.getData()[0] = -84;
                this.f96718b.getData()[1] = (byte) (this.f96725i ? 65 : 64);
                this.f96723g = 2;
            }
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        this.f96720d = c4838e.getFormatId();
        this.f96721e = ck5Var.track(c4838e.getTrackId(), 1);
    }

    @Override // p000.cy4
    public void packetFinished() {
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f96729m = j;
        }
    }

    @Override // p000.cy4
    public void seek() {
        this.f96722f = 0;
        this.f96723g = 0;
        this.f96724h = false;
        this.f96725i = false;
        this.f96729m = -9223372036854775807L;
    }

    public C14918x5(@hib String str) {
        ghc ghcVar = new ghc(new byte[16]);
        this.f96717a = ghcVar;
        this.f96718b = new ihc(ghcVar.f39834a);
        this.f96722f = 0;
        this.f96723g = 0;
        this.f96724h = false;
        this.f96725i = false;
        this.f96729m = -9223372036854775807L;
        this.f96719c = str;
    }
}
