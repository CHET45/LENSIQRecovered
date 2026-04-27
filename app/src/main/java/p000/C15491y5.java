package p000;

import androidx.media3.common.C1213a;
import p000.C16006z5;
import p000.ckh;

/* JADX INFO: renamed from: y5 */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C15491y5 implements dy4 {

    /* JADX INFO: renamed from: p */
    public static final int f100368p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f100369q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f100370r = 2;

    /* JADX INFO: renamed from: a */
    public final hhc f100371a;

    /* JADX INFO: renamed from: b */
    public final jhc f100372b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f100373c;

    /* JADX INFO: renamed from: d */
    public final int f100374d;

    /* JADX INFO: renamed from: e */
    public final String f100375e;

    /* JADX INFO: renamed from: f */
    public String f100376f;

    /* JADX INFO: renamed from: g */
    public q6h f100377g;

    /* JADX INFO: renamed from: h */
    public int f100378h;

    /* JADX INFO: renamed from: i */
    public int f100379i;

    /* JADX INFO: renamed from: j */
    public boolean f100380j;

    /* JADX INFO: renamed from: k */
    public boolean f100381k;

    /* JADX INFO: renamed from: l */
    public long f100382l;

    /* JADX INFO: renamed from: m */
    public C1213a f100383m;

    /* JADX INFO: renamed from: n */
    public int f100384n;

    /* JADX INFO: renamed from: o */
    public long f100385o;

    public C15491y5(String str) {
        this(null, 0, str);
    }

    private boolean continueRead(jhc jhcVar, byte[] bArr, int i) {
        int iMin = Math.min(jhcVar.bytesLeft(), i - this.f100379i);
        jhcVar.readBytes(bArr, this.f100379i, iMin);
        int i2 = this.f100379i + iMin;
        this.f100379i = i2;
        return i2 == i;
    }

    @g5e({"output"})
    private void parseHeader() {
        this.f100371a.setPosition(0);
        C16006z5.c ac4SyncframeInfo = C16006z5.parseAc4SyncframeInfo(this.f100371a);
        C1213a c1213a = this.f100383m;
        if (c1213a == null || ac4SyncframeInfo.f104214c != c1213a.f8266G || ac4SyncframeInfo.f104213b != c1213a.f8267H || !"audio/ac4".equals(c1213a.f8291o)) {
            C1213a c1213aBuild = new C1213a.b().setId(this.f100376f).setContainerMimeType(this.f100375e).setSampleMimeType("audio/ac4").setChannelCount(ac4SyncframeInfo.f104214c).setSampleRate(ac4SyncframeInfo.f104213b).setLanguage(this.f100373c).setRoleFlags(this.f100374d).build();
            this.f100383m = c1213aBuild;
            this.f100377g.format(c1213aBuild);
        }
        this.f100384n = ac4SyncframeInfo.f104215d;
        this.f100382l = (((long) ac4SyncframeInfo.f104216e) * 1000000) / ((long) this.f100383m.f8267H);
    }

    private boolean skipToNextSync(jhc jhcVar) {
        int unsignedByte;
        while (true) {
            if (jhcVar.bytesLeft() <= 0) {
                return false;
            }
            if (this.f100380j) {
                unsignedByte = jhcVar.readUnsignedByte();
                this.f100380j = unsignedByte == 172;
                if (unsignedByte == 64 || unsignedByte == 65) {
                    break;
                }
            } else {
                this.f100380j = jhcVar.readUnsignedByte() == 172;
            }
        }
        this.f100381k = unsignedByte == 65;
        return true;
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) {
        v80.checkStateNotNull(this.f100377g);
        while (jhcVar.bytesLeft() > 0) {
            int i = this.f100378h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(jhcVar.bytesLeft(), this.f100384n - this.f100379i);
                        this.f100377g.sampleData(jhcVar, iMin);
                        int i2 = this.f100379i + iMin;
                        this.f100379i = i2;
                        if (i2 == this.f100384n) {
                            v80.checkState(this.f100385o != -9223372036854775807L);
                            this.f100377g.sampleMetadata(this.f100385o, 1, this.f100384n, 0, null);
                            this.f100385o += this.f100382l;
                            this.f100378h = 0;
                        }
                    }
                } else if (continueRead(jhcVar, this.f100372b.getData(), 16)) {
                    parseHeader();
                    this.f100372b.setPosition(0);
                    this.f100377g.sampleData(this.f100372b, 16);
                    this.f100378h = 2;
                }
            } else if (skipToNextSync(jhcVar)) {
                this.f100378h = 1;
                this.f100372b.getData()[0] = -84;
                this.f100372b.getData()[1] = (byte) (this.f100381k ? 65 : 64);
                this.f100379i = 2;
            }
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f100376f = c2372e.getFormatId();
        this.f100377g = bk5Var.track(c2372e.getTrackId(), 1);
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f100385o = j;
    }

    @Override // p000.dy4
    public void seek() {
        this.f100378h = 0;
        this.f100379i = 0;
        this.f100380j = false;
        this.f100381k = false;
        this.f100385o = -9223372036854775807L;
    }

    public C15491y5(@hib String str, int i, String str2) {
        hhc hhcVar = new hhc(new byte[16]);
        this.f100371a = hhcVar;
        this.f100372b = new jhc(hhcVar.f43646a);
        this.f100378h = 0;
        this.f100379i = 0;
        this.f100380j = false;
        this.f100381k = false;
        this.f100385o = -9223372036854775807L;
        this.f100373c = str;
        this.f100374d = i;
        this.f100375e = str2;
    }
}
