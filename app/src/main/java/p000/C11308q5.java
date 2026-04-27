package p000;

import androidx.media3.common.C1213a;
import java.util.Objects;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.C11891r5;
import p000.ckh;

/* JADX INFO: renamed from: q5 */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C11308q5 implements dy4 {

    /* JADX INFO: renamed from: o */
    public static final int f73209o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f73210p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f73211q = 2;

    /* JADX INFO: renamed from: r */
    public static final int f73212r = 128;

    /* JADX INFO: renamed from: a */
    public final hhc f73213a;

    /* JADX INFO: renamed from: b */
    public final jhc f73214b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f73215c;

    /* JADX INFO: renamed from: d */
    public final int f73216d;

    /* JADX INFO: renamed from: e */
    public final String f73217e;

    /* JADX INFO: renamed from: f */
    public String f73218f;

    /* JADX INFO: renamed from: g */
    public q6h f73219g;

    /* JADX INFO: renamed from: h */
    public int f73220h;

    /* JADX INFO: renamed from: i */
    public int f73221i;

    /* JADX INFO: renamed from: j */
    public boolean f73222j;

    /* JADX INFO: renamed from: k */
    public long f73223k;

    /* JADX INFO: renamed from: l */
    public C1213a f73224l;

    /* JADX INFO: renamed from: m */
    public int f73225m;

    /* JADX INFO: renamed from: n */
    public long f73226n;

    public C11308q5(String str) {
        this(null, 0, str);
    }

    private boolean continueRead(jhc jhcVar, byte[] bArr, int i) {
        int iMin = Math.min(jhcVar.bytesLeft(), i - this.f73221i);
        jhcVar.readBytes(bArr, this.f73221i, iMin);
        int i2 = this.f73221i + iMin;
        this.f73221i = i2;
        return i2 == i;
    }

    @g5e({"output"})
    private void parseHeader() {
        this.f73213a.setPosition(0);
        C11891r5.b ac3SyncframeInfo = C11891r5.parseAc3SyncframeInfo(this.f73213a);
        C1213a c1213a = this.f73224l;
        if (c1213a == null || ac3SyncframeInfo.f77059d != c1213a.f8266G || ac3SyncframeInfo.f77058c != c1213a.f8267H || !Objects.equals(ac3SyncframeInfo.f77056a, c1213a.f8291o)) {
            C1213a.b peakBitrate = new C1213a.b().setId(this.f73218f).setContainerMimeType(this.f73217e).setSampleMimeType(ac3SyncframeInfo.f77056a).setChannelCount(ac3SyncframeInfo.f77059d).setSampleRate(ac3SyncframeInfo.f77058c).setLanguage(this.f73215c).setRoleFlags(this.f73216d).setPeakBitrate(ac3SyncframeInfo.f77062g);
            if ("audio/ac3".equals(ac3SyncframeInfo.f77056a)) {
                peakBitrate.setAverageBitrate(ac3SyncframeInfo.f77062g);
            }
            C1213a c1213aBuild = peakBitrate.build();
            this.f73224l = c1213aBuild;
            this.f73219g.format(c1213aBuild);
        }
        this.f73225m = ac3SyncframeInfo.f77060e;
        this.f73223k = (((long) ac3SyncframeInfo.f77061f) * 1000000) / ((long) this.f73224l.f8267H);
    }

    private boolean skipToNextSync(jhc jhcVar) {
        while (true) {
            if (jhcVar.bytesLeft() <= 0) {
                return false;
            }
            if (this.f73222j) {
                int unsignedByte = jhcVar.readUnsignedByte();
                if (unsignedByte == 119) {
                    this.f73222j = false;
                    return true;
                }
                this.f73222j = unsignedByte == 11;
            } else {
                this.f73222j = jhcVar.readUnsignedByte() == 11;
            }
        }
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) {
        v80.checkStateNotNull(this.f73219g);
        while (jhcVar.bytesLeft() > 0) {
            int i = this.f73220h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(jhcVar.bytesLeft(), this.f73225m - this.f73221i);
                        this.f73219g.sampleData(jhcVar, iMin);
                        int i2 = this.f73221i + iMin;
                        this.f73221i = i2;
                        if (i2 == this.f73225m) {
                            v80.checkState(this.f73226n != -9223372036854775807L);
                            this.f73219g.sampleMetadata(this.f73226n, 1, this.f73225m, 0, null);
                            this.f73226n += this.f73223k;
                            this.f73220h = 0;
                        }
                    }
                } else if (continueRead(jhcVar, this.f73214b.getData(), 128)) {
                    parseHeader();
                    this.f73214b.setPosition(0);
                    this.f73219g.sampleData(this.f73214b, 128);
                    this.f73220h = 2;
                }
            } else if (skipToNextSync(jhcVar)) {
                this.f73220h = 1;
                this.f73214b.getData()[0] = 11;
                this.f73214b.getData()[1] = BuiltinOptions.UnsortedSegmentMaxOptions;
                this.f73221i = 2;
            }
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f73218f = c2372e.getFormatId();
        this.f73219g = bk5Var.track(c2372e.getTrackId(), 1);
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f73226n = j;
    }

    @Override // p000.dy4
    public void seek() {
        this.f73220h = 0;
        this.f73221i = 0;
        this.f73222j = false;
        this.f73226n = -9223372036854775807L;
    }

    public C11308q5(@hib String str, int i, String str2) {
        hhc hhcVar = new hhc(new byte[128]);
        this.f73213a = hhcVar;
        this.f73214b = new jhc(hhcVar.f43646a);
        this.f73220h = 0;
        this.f73226n = -9223372036854775807L;
        this.f73215c = str;
        this.f73216d = i;
        this.f73217e = str2;
    }
}
