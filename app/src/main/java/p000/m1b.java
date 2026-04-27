package p000;

import p000.dkh;
import p000.kq6;
import p000.p1b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m1b implements cy4 {

    /* JADX INFO: renamed from: m */
    public static final int f59626m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f59627n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f59628o = 2;

    /* JADX INFO: renamed from: p */
    public static final int f59629p = 4;

    /* JADX INFO: renamed from: a */
    public final ihc f59630a;

    /* JADX INFO: renamed from: b */
    public final p1b.C10751a f59631b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f59632c;

    /* JADX INFO: renamed from: d */
    public r6h f59633d;

    /* JADX INFO: renamed from: e */
    public String f59634e;

    /* JADX INFO: renamed from: f */
    public int f59635f;

    /* JADX INFO: renamed from: g */
    public int f59636g;

    /* JADX INFO: renamed from: h */
    public boolean f59637h;

    /* JADX INFO: renamed from: i */
    public boolean f59638i;

    /* JADX INFO: renamed from: j */
    public long f59639j;

    /* JADX INFO: renamed from: k */
    public int f59640k;

    /* JADX INFO: renamed from: l */
    public long f59641l;

    public m1b() {
        this(null);
    }

    private void findHeader(ihc ihcVar) {
        byte[] data = ihcVar.getData();
        int iLimit = ihcVar.limit();
        for (int position = ihcVar.getPosition(); position < iLimit; position++) {
            byte b = data[position];
            boolean z = (b & 255) == 255;
            boolean z2 = this.f59638i && (b & 224) == 224;
            this.f59638i = z;
            if (z2) {
                ihcVar.setPosition(position + 1);
                this.f59638i = false;
                this.f59630a.getData()[1] = data[position];
                this.f59636g = 2;
                this.f59635f = 1;
                return;
            }
        }
        ihcVar.setPosition(iLimit);
    }

    @g5e({"output"})
    private void readFrameRemainder(ihc ihcVar) {
        int iMin = Math.min(ihcVar.bytesLeft(), this.f59640k - this.f59636g);
        this.f59633d.sampleData(ihcVar, iMin);
        int i = this.f59636g + iMin;
        this.f59636g = i;
        int i2 = this.f59640k;
        if (i < i2) {
            return;
        }
        long j = this.f59641l;
        if (j != -9223372036854775807L) {
            this.f59633d.sampleMetadata(j, 1, i2, 0, null);
            this.f59641l += this.f59639j;
        }
        this.f59636g = 0;
        this.f59635f = 0;
    }

    @g5e({"output"})
    private void readHeaderRemainder(ihc ihcVar) {
        int iMin = Math.min(ihcVar.bytesLeft(), 4 - this.f59636g);
        ihcVar.readBytes(this.f59630a.getData(), this.f59636g, iMin);
        int i = this.f59636g + iMin;
        this.f59636g = i;
        if (i < 4) {
            return;
        }
        this.f59630a.setPosition(0);
        if (!this.f59631b.setForHeaderData(this.f59630a.readInt())) {
            this.f59636g = 0;
            this.f59635f = 1;
            return;
        }
        p1b.C10751a c10751a = this.f59631b;
        this.f59640k = c10751a.f69422c;
        if (!this.f59637h) {
            this.f59639j = (((long) c10751a.f69426g) * 1000000) / ((long) c10751a.f69423d);
            this.f59633d.format(new kq6.C8497b().setId(this.f59634e).setSampleMimeType(this.f59631b.f69421b).setMaxInputSize(4096).setChannelCount(this.f59631b.f69424e).setSampleRate(this.f59631b.f69423d).setLanguage(this.f59632c).build());
            this.f59637h = true;
        }
        this.f59630a.setPosition(0);
        this.f59633d.sampleData(this.f59630a, 4);
        this.f59635f = 2;
    }

    @Override // p000.cy4
    public void consume(ihc ihcVar) {
        u80.checkStateNotNull(this.f59633d);
        while (ihcVar.bytesLeft() > 0) {
            int i = this.f59635f;
            if (i == 0) {
                findHeader(ihcVar);
            } else if (i == 1) {
                readHeaderRemainder(ihcVar);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                readFrameRemainder(ihcVar);
            }
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        this.f59634e = c4838e.getFormatId();
        this.f59633d = ck5Var.track(c4838e.getTrackId(), 1);
    }

    @Override // p000.cy4
    public void packetFinished() {
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f59641l = j;
        }
    }

    @Override // p000.cy4
    public void seek() {
        this.f59635f = 0;
        this.f59636g = 0;
        this.f59638i = false;
        this.f59641l = -9223372036854775807L;
    }

    public m1b(@hib String str) {
        this.f59635f = 0;
        ihc ihcVar = new ihc(4);
        this.f59630a = ihcVar;
        ihcVar.getData()[0] = -1;
        this.f59631b = new p1b.C10751a();
        this.f59641l = -9223372036854775807L;
        this.f59632c = str;
    }
}
