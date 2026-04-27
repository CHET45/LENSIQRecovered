package p000;

import androidx.media3.common.C1213a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p000.ckh;
import p000.ns4;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ms4 implements dy4 {

    /* JADX INFO: renamed from: A */
    public static final int f61902A = 5408;

    /* JADX INFO: renamed from: r */
    public static final int f61903r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f61904s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f61905t = 2;

    /* JADX INFO: renamed from: u */
    public static final int f61906u = 3;

    /* JADX INFO: renamed from: v */
    public static final int f61907v = 4;

    /* JADX INFO: renamed from: w */
    public static final int f61908w = 5;

    /* JADX INFO: renamed from: x */
    public static final int f61909x = 6;

    /* JADX INFO: renamed from: y */
    public static final int f61910y = 18;

    /* JADX INFO: renamed from: z */
    public static final int f61911z = 4096;

    /* JADX INFO: renamed from: a */
    public final jhc f61912a;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f61914c;

    /* JADX INFO: renamed from: d */
    public final int f61915d;

    /* JADX INFO: renamed from: e */
    public final String f61916e;

    /* JADX INFO: renamed from: f */
    public String f61917f;

    /* JADX INFO: renamed from: g */
    public q6h f61918g;

    /* JADX INFO: renamed from: i */
    public int f61920i;

    /* JADX INFO: renamed from: j */
    public int f61921j;

    /* JADX INFO: renamed from: k */
    public long f61922k;

    /* JADX INFO: renamed from: l */
    public C1213a f61923l;

    /* JADX INFO: renamed from: m */
    public int f61924m;

    /* JADX INFO: renamed from: n */
    public int f61925n;

    /* JADX INFO: renamed from: h */
    public int f61919h = 0;

    /* JADX INFO: renamed from: q */
    public long f61928q = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f61913b = new AtomicInteger();

    /* JADX INFO: renamed from: o */
    public int f61926o = -1;

    /* JADX INFO: renamed from: p */
    public int f61927p = -1;

    public ms4(@hib String str, int i, int i2, String str2) {
        this.f61912a = new jhc(new byte[i2]);
        this.f61914c = str;
        this.f61915d = i;
        this.f61916e = str2;
    }

    private boolean continueRead(jhc jhcVar, byte[] bArr, int i) {
        int iMin = Math.min(jhcVar.bytesLeft(), i - this.f61920i);
        jhcVar.readBytes(bArr, this.f61920i, iMin);
        int i2 = this.f61920i + iMin;
        this.f61920i = i2;
        return i2 == i;
    }

    @g5e({"output"})
    private void parseCoreHeader() {
        byte[] data = this.f61912a.getData();
        if (this.f61923l == null) {
            C1213a dtsFormat = ns4.parseDtsFormat(data, this.f61917f, this.f61914c, this.f61915d, this.f61916e, null);
            this.f61923l = dtsFormat;
            this.f61918g.format(dtsFormat);
        }
        this.f61924m = ns4.getDtsFrameSize(data);
        this.f61922k = rd8.checkedCast(t0i.sampleCountToDurationUs(ns4.parseDtsAudioSampleCount(data), this.f61923l.f8267H));
    }

    @g5e({"output"})
    private void parseExtensionSubstreamHeader() throws yhc {
        ns4.C10036c dtsHdHeader = ns4.parseDtsHdHeader(this.f61912a.getData());
        updateFormatWithDtsHeaderInfo(dtsHdHeader);
        this.f61924m = dtsHdHeader.f65476d;
        long j = dtsHdHeader.f65477e;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        this.f61922k = j;
    }

    @g5e({"output"})
    private void parseUhdHeader() throws yhc {
        ns4.C10036c dtsUhdHeader = ns4.parseDtsUhdHeader(this.f61912a.getData(), this.f61913b);
        if (this.f61925n == 3) {
            updateFormatWithDtsHeaderInfo(dtsUhdHeader);
        }
        this.f61924m = dtsUhdHeader.f65476d;
        long j = dtsUhdHeader.f65477e;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        this.f61922k = j;
    }

    private boolean skipToNextSyncWord(jhc jhcVar) {
        while (jhcVar.bytesLeft() > 0) {
            int i = this.f61921j << 8;
            this.f61921j = i;
            int unsignedByte = i | jhcVar.readUnsignedByte();
            this.f61921j = unsignedByte;
            int frameType = ns4.getFrameType(unsignedByte);
            this.f61925n = frameType;
            if (frameType != 0) {
                byte[] data = this.f61912a.getData();
                int i2 = this.f61921j;
                data[0] = (byte) ((i2 >> 24) & 255);
                data[1] = (byte) ((i2 >> 16) & 255);
                data[2] = (byte) ((i2 >> 8) & 255);
                data[3] = (byte) (i2 & 255);
                this.f61920i = 4;
                this.f61921j = 0;
                return true;
            }
        }
        return false;
    }

    @g5e({"output"})
    private void updateFormatWithDtsHeaderInfo(ns4.C10036c c10036c) {
        int i;
        int i2 = c10036c.f65474b;
        if (i2 == -2147483647 || (i = c10036c.f65475c) == -1) {
            return;
        }
        C1213a c1213a = this.f61923l;
        if (c1213a != null && i == c1213a.f8266G && i2 == c1213a.f8267H && Objects.equals(c10036c.f65473a, c1213a.f8291o)) {
            return;
        }
        C1213a c1213a2 = this.f61923l;
        C1213a c1213aBuild = (c1213a2 == null ? new C1213a.b() : c1213a2.buildUpon()).setId(this.f61917f).setContainerMimeType(this.f61916e).setSampleMimeType(c10036c.f65473a).setChannelCount(c10036c.f65475c).setSampleRate(c10036c.f65474b).setLanguage(this.f61914c).setRoleFlags(this.f61915d).build();
        this.f61923l = c1213aBuild;
        this.f61918g.format(c1213aBuild);
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) throws yhc {
        v80.checkStateNotNull(this.f61918g);
        while (jhcVar.bytesLeft() > 0) {
            switch (this.f61919h) {
                case 0:
                    if (skipToNextSyncWord(jhcVar)) {
                        int i = this.f61925n;
                        if (i == 3 || i == 4) {
                            this.f61919h = 4;
                        } else if (i != 1) {
                            this.f61919h = 2;
                        } else {
                            this.f61919h = 1;
                        }
                    }
                    break;
                case 1:
                    if (continueRead(jhcVar, this.f61912a.getData(), 18)) {
                        parseCoreHeader();
                        this.f61912a.setPosition(0);
                        this.f61918g.sampleData(this.f61912a, 18);
                        this.f61919h = 6;
                    }
                    break;
                case 2:
                    if (continueRead(jhcVar, this.f61912a.getData(), 7)) {
                        this.f61926o = ns4.parseDtsHdHeaderSize(this.f61912a.getData());
                        this.f61919h = 3;
                    }
                    break;
                case 3:
                    if (continueRead(jhcVar, this.f61912a.getData(), this.f61926o)) {
                        parseExtensionSubstreamHeader();
                        this.f61912a.setPosition(0);
                        this.f61918g.sampleData(this.f61912a, this.f61926o);
                        this.f61919h = 6;
                    }
                    break;
                case 4:
                    if (continueRead(jhcVar, this.f61912a.getData(), 6)) {
                        int dtsUhdHeaderSize = ns4.parseDtsUhdHeaderSize(this.f61912a.getData());
                        this.f61927p = dtsUhdHeaderSize;
                        int i2 = this.f61920i;
                        if (i2 > dtsUhdHeaderSize) {
                            int i3 = i2 - dtsUhdHeaderSize;
                            this.f61920i = i2 - i3;
                            jhcVar.setPosition(jhcVar.getPosition() - i3);
                        }
                        this.f61919h = 5;
                    }
                    break;
                case 5:
                    if (continueRead(jhcVar, this.f61912a.getData(), this.f61927p)) {
                        parseUhdHeader();
                        this.f61912a.setPosition(0);
                        this.f61918g.sampleData(this.f61912a, this.f61927p);
                        this.f61919h = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(jhcVar.bytesLeft(), this.f61924m - this.f61920i);
                    this.f61918g.sampleData(jhcVar, iMin);
                    int i4 = this.f61920i + iMin;
                    this.f61920i = i4;
                    if (i4 == this.f61924m) {
                        v80.checkState(this.f61928q != -9223372036854775807L);
                        this.f61918g.sampleMetadata(this.f61928q, this.f61925n == 4 ? 0 : 1, this.f61924m, 0, null);
                        this.f61928q += this.f61922k;
                        this.f61919h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f61917f = c2372e.getFormatId();
        this.f61918g = bk5Var.track(c2372e.getTrackId(), 1);
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f61928q = j;
    }

    @Override // p000.dy4
    public void seek() {
        this.f61919h = 0;
        this.f61920i = 0;
        this.f61921j = 0;
        this.f61928q = -9223372036854775807L;
        this.f61913b.set(0);
    }
}
