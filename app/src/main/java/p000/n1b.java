package p000;

import androidx.media3.common.C1213a;
import p000.ckh;
import p000.o1b;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class n1b implements dy4 {

    /* JADX INFO: renamed from: o */
    public static final int f62967o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f62968p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f62969q = 2;

    /* JADX INFO: renamed from: r */
    public static final int f62970r = 4;

    /* JADX INFO: renamed from: a */
    public final jhc f62971a;

    /* JADX INFO: renamed from: b */
    public final o1b.C10138a f62972b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f62973c;

    /* JADX INFO: renamed from: d */
    public final int f62974d;

    /* JADX INFO: renamed from: e */
    public final String f62975e;

    /* JADX INFO: renamed from: f */
    public q6h f62976f;

    /* JADX INFO: renamed from: g */
    public String f62977g;

    /* JADX INFO: renamed from: h */
    public int f62978h;

    /* JADX INFO: renamed from: i */
    public int f62979i;

    /* JADX INFO: renamed from: j */
    public boolean f62980j;

    /* JADX INFO: renamed from: k */
    public boolean f62981k;

    /* JADX INFO: renamed from: l */
    public long f62982l;

    /* JADX INFO: renamed from: m */
    public int f62983m;

    /* JADX INFO: renamed from: n */
    public long f62984n;

    public n1b(String str) {
        this(null, 0, str);
    }

    private void findHeader(jhc jhcVar) {
        byte[] data = jhcVar.getData();
        int iLimit = jhcVar.limit();
        for (int position = jhcVar.getPosition(); position < iLimit; position++) {
            byte b = data[position];
            boolean z = (b & 255) == 255;
            boolean z2 = this.f62981k && (b & 224) == 224;
            this.f62981k = z;
            if (z2) {
                jhcVar.setPosition(position + 1);
                this.f62981k = false;
                this.f62971a.getData()[1] = data[position];
                this.f62979i = 2;
                this.f62978h = 1;
                return;
            }
        }
        jhcVar.setPosition(iLimit);
    }

    @g5e({"output"})
    private void readFrameRemainder(jhc jhcVar) {
        int iMin = Math.min(jhcVar.bytesLeft(), this.f62983m - this.f62979i);
        this.f62976f.sampleData(jhcVar, iMin);
        int i = this.f62979i + iMin;
        this.f62979i = i;
        if (i < this.f62983m) {
            return;
        }
        v80.checkState(this.f62984n != -9223372036854775807L);
        this.f62976f.sampleMetadata(this.f62984n, 1, this.f62983m, 0, null);
        this.f62984n += this.f62982l;
        this.f62979i = 0;
        this.f62978h = 0;
    }

    @g5e({"output"})
    private void readHeaderRemainder(jhc jhcVar) {
        int iMin = Math.min(jhcVar.bytesLeft(), 4 - this.f62979i);
        jhcVar.readBytes(this.f62971a.getData(), this.f62979i, iMin);
        int i = this.f62979i + iMin;
        this.f62979i = i;
        if (i < 4) {
            return;
        }
        this.f62971a.setPosition(0);
        if (!this.f62972b.setForHeaderData(this.f62971a.readInt())) {
            this.f62979i = 0;
            this.f62978h = 1;
            return;
        }
        o1b.C10138a c10138a = this.f62972b;
        this.f62983m = c10138a.f66223c;
        if (!this.f62980j) {
            this.f62982l = (((long) c10138a.f66227g) * 1000000) / ((long) c10138a.f66224d);
            this.f62976f.format(new C1213a.b().setId(this.f62977g).setContainerMimeType(this.f62975e).setSampleMimeType(this.f62972b.f66222b).setMaxInputSize(4096).setChannelCount(this.f62972b.f66225e).setSampleRate(this.f62972b.f66224d).setLanguage(this.f62973c).setRoleFlags(this.f62974d).build());
            this.f62980j = true;
        }
        this.f62971a.setPosition(0);
        this.f62976f.sampleData(this.f62971a, 4);
        this.f62978h = 2;
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) {
        v80.checkStateNotNull(this.f62976f);
        while (jhcVar.bytesLeft() > 0) {
            int i = this.f62978h;
            if (i == 0) {
                findHeader(jhcVar);
            } else if (i == 1) {
                readHeaderRemainder(jhcVar);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                readFrameRemainder(jhcVar);
            }
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        this.f62977g = c2372e.getFormatId();
        this.f62976f = bk5Var.track(c2372e.getTrackId(), 1);
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        this.f62984n = j;
    }

    @Override // p000.dy4
    public void seek() {
        this.f62978h = 0;
        this.f62979i = 0;
        this.f62981k = false;
        this.f62984n = -9223372036854775807L;
    }

    public n1b(@hib String str, int i, String str2) {
        this.f62978h = 0;
        jhc jhcVar = new jhc(4);
        this.f62971a = jhcVar;
        jhcVar.getData()[0] = -1;
        this.f62972b = new o1b.C10138a();
        this.f62984n = -9223372036854775807L;
        this.f62973c = str;
        this.f62974d = i;
        this.f62975e = str2;
    }
}
