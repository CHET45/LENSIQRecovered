package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class d6h {

    /* JADX INFO: renamed from: a */
    public dz3 f28576a;

    /* JADX INFO: renamed from: b */
    public long f28577b;

    /* JADX INFO: renamed from: c */
    public long f28578c;

    /* JADX INFO: renamed from: d */
    public long f28579d;

    /* JADX INFO: renamed from: e */
    public int f28580e;

    /* JADX INFO: renamed from: f */
    public int f28581f;

    /* JADX INFO: renamed from: l */
    public boolean f28587l;

    /* JADX INFO: renamed from: n */
    @hib
    public b6h f28589n;

    /* JADX INFO: renamed from: p */
    public boolean f28591p;

    /* JADX INFO: renamed from: q */
    public long f28592q;

    /* JADX INFO: renamed from: r */
    public boolean f28593r;

    /* JADX INFO: renamed from: g */
    public long[] f28582g = new long[0];

    /* JADX INFO: renamed from: h */
    public int[] f28583h = new int[0];

    /* JADX INFO: renamed from: i */
    public int[] f28584i = new int[0];

    /* JADX INFO: renamed from: j */
    public long[] f28585j = new long[0];

    /* JADX INFO: renamed from: k */
    public boolean[] f28586k = new boolean[0];

    /* JADX INFO: renamed from: m */
    public boolean[] f28588m = new boolean[0];

    /* JADX INFO: renamed from: o */
    public final jhc f28590o = new jhc();

    public void fillEncryptionData(ak5 ak5Var) throws IOException {
        ak5Var.readFully(this.f28590o.getData(), 0, this.f28590o.limit());
        this.f28590o.setPosition(0);
        this.f28591p = false;
    }

    public long getSamplePresentationTimeUs(int i) {
        return this.f28585j[i];
    }

    public void initEncryptionData(int i) {
        this.f28590o.reset(i);
        this.f28587l = true;
        this.f28591p = true;
    }

    public void initTables(int i, int i2) {
        this.f28580e = i;
        this.f28581f = i2;
        if (this.f28583h.length < i) {
            this.f28582g = new long[i];
            this.f28583h = new int[i];
        }
        if (this.f28584i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f28584i = new int[i3];
            this.f28585j = new long[i3];
            this.f28586k = new boolean[i3];
            this.f28588m = new boolean[i3];
        }
    }

    public void reset() {
        this.f28580e = 0;
        this.f28592q = 0L;
        this.f28593r = false;
        this.f28587l = false;
        this.f28591p = false;
        this.f28589n = null;
    }

    public boolean sampleHasSubsampleEncryptionTable(int i) {
        return this.f28587l && this.f28588m[i];
    }

    public void fillEncryptionData(jhc jhcVar) {
        jhcVar.readBytes(this.f28590o.getData(), 0, this.f28590o.limit());
        this.f28590o.setPosition(0);
        this.f28591p = false;
    }
}
