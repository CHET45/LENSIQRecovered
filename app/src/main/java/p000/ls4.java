package p000;

import p000.dkh;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ls4 implements cy4 {

    /* JADX INFO: renamed from: l */
    public static final int f58591l = 0;

    /* JADX INFO: renamed from: m */
    public static final int f58592m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f58593n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f58594o = 18;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f58596b;

    /* JADX INFO: renamed from: c */
    public String f58597c;

    /* JADX INFO: renamed from: d */
    public r6h f58598d;

    /* JADX INFO: renamed from: f */
    public int f58600f;

    /* JADX INFO: renamed from: g */
    public int f58601g;

    /* JADX INFO: renamed from: h */
    public long f58602h;

    /* JADX INFO: renamed from: i */
    public kq6 f58603i;

    /* JADX INFO: renamed from: j */
    public int f58604j;

    /* JADX INFO: renamed from: a */
    public final ihc f58595a = new ihc(new byte[18]);

    /* JADX INFO: renamed from: e */
    public int f58599e = 0;

    /* JADX INFO: renamed from: k */
    public long f58605k = -9223372036854775807L;

    public ls4(@hib String str) {
        this.f58596b = str;
    }

    private boolean continueRead(ihc ihcVar, byte[] bArr, int i) {
        int iMin = Math.min(ihcVar.bytesLeft(), i - this.f58600f);
        ihcVar.readBytes(bArr, this.f58600f, iMin);
        int i2 = this.f58600f + iMin;
        this.f58600f = i2;
        return i2 == i;
    }

    @g5e({"output"})
    private void parseHeader() {
        byte[] data = this.f58595a.getData();
        if (this.f58603i == null) {
            kq6 dtsFormat = os4.parseDtsFormat(data, this.f58597c, this.f58596b, null);
            this.f58603i = dtsFormat;
            this.f58598d.format(dtsFormat);
        }
        this.f58604j = os4.getDtsFrameSize(data);
        this.f58602h = (int) ((((long) os4.parseDtsAudioSampleCount(data)) * 1000000) / ((long) this.f58603i.f55009f2));
    }

    private boolean skipToNextSync(ihc ihcVar) {
        while (ihcVar.bytesLeft() > 0) {
            int i = this.f58601g << 8;
            this.f58601g = i;
            int unsignedByte = i | ihcVar.readUnsignedByte();
            this.f58601g = unsignedByte;
            if (os4.isSyncWord(unsignedByte)) {
                byte[] data = this.f58595a.getData();
                int i2 = this.f58601g;
                data[0] = (byte) ((i2 >> 24) & 255);
                data[1] = (byte) ((i2 >> 16) & 255);
                data[2] = (byte) ((i2 >> 8) & 255);
                data[3] = (byte) (i2 & 255);
                this.f58600f = 4;
                this.f58601g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // p000.cy4
    public void consume(ihc ihcVar) {
        u80.checkStateNotNull(this.f58598d);
        while (ihcVar.bytesLeft() > 0) {
            int i = this.f58599e;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(ihcVar.bytesLeft(), this.f58604j - this.f58600f);
                    this.f58598d.sampleData(ihcVar, iMin);
                    int i2 = this.f58600f + iMin;
                    this.f58600f = i2;
                    int i3 = this.f58604j;
                    if (i2 == i3) {
                        long j = this.f58605k;
                        if (j != -9223372036854775807L) {
                            this.f58598d.sampleMetadata(j, 1, i3, 0, null);
                            this.f58605k += this.f58602h;
                        }
                        this.f58599e = 0;
                    }
                } else if (continueRead(ihcVar, this.f58595a.getData(), 18)) {
                    parseHeader();
                    this.f58595a.setPosition(0);
                    this.f58598d.sampleData(this.f58595a, 18);
                    this.f58599e = 2;
                }
            } else if (skipToNextSync(ihcVar)) {
                this.f58599e = 1;
            }
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        this.f58597c = c4838e.getFormatId();
        this.f58598d = ck5Var.track(c4838e.getTrackId(), 1);
    }

    @Override // p000.cy4
    public void packetFinished() {
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f58605k = j;
        }
    }

    @Override // p000.cy4
    public void seek() {
        this.f58599e = 0;
        this.f58600f = 0;
        this.f58601g = 0;
        this.f58605k = -9223372036854775807L;
    }
}
