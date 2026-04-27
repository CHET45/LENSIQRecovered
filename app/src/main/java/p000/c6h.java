package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c6h {

    /* JADX INFO: renamed from: a */
    public cz3 f15866a;

    /* JADX INFO: renamed from: b */
    public long f15867b;

    /* JADX INFO: renamed from: c */
    public long f15868c;

    /* JADX INFO: renamed from: d */
    public long f15869d;

    /* JADX INFO: renamed from: e */
    public int f15870e;

    /* JADX INFO: renamed from: f */
    public int f15871f;

    /* JADX INFO: renamed from: l */
    public boolean f15877l;

    /* JADX INFO: renamed from: n */
    @hib
    public a6h f15879n;

    /* JADX INFO: renamed from: p */
    public boolean f15881p;

    /* JADX INFO: renamed from: q */
    public long f15882q;

    /* JADX INFO: renamed from: r */
    public boolean f15883r;

    /* JADX INFO: renamed from: g */
    public long[] f15872g = new long[0];

    /* JADX INFO: renamed from: h */
    public int[] f15873h = new int[0];

    /* JADX INFO: renamed from: i */
    public int[] f15874i = new int[0];

    /* JADX INFO: renamed from: j */
    public long[] f15875j = new long[0];

    /* JADX INFO: renamed from: k */
    public boolean[] f15876k = new boolean[0];

    /* JADX INFO: renamed from: m */
    public boolean[] f15878m = new boolean[0];

    /* JADX INFO: renamed from: o */
    public final ihc f15880o = new ihc();

    public void fillEncryptionData(zj5 zj5Var) throws IOException {
        zj5Var.readFully(this.f15880o.getData(), 0, this.f15880o.limit());
        this.f15880o.setPosition(0);
        this.f15881p = false;
    }

    public long getSamplePresentationTimeUs(int i) {
        return this.f15875j[i];
    }

    public void initEncryptionData(int i) {
        this.f15880o.reset(i);
        this.f15877l = true;
        this.f15881p = true;
    }

    public void initTables(int i, int i2) {
        this.f15870e = i;
        this.f15871f = i2;
        if (this.f15873h.length < i) {
            this.f15872g = new long[i];
            this.f15873h = new int[i];
        }
        if (this.f15874i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f15874i = new int[i3];
            this.f15875j = new long[i3];
            this.f15876k = new boolean[i3];
            this.f15878m = new boolean[i3];
        }
    }

    public void reset() {
        this.f15870e = 0;
        this.f15882q = 0L;
        this.f15883r = false;
        this.f15877l = false;
        this.f15881p = false;
        this.f15879n = null;
    }

    public boolean sampleHasSubsampleEncryptionTable(int i) {
        return this.f15877l && this.f15878m[i];
    }

    public void fillEncryptionData(ihc ihcVar) {
        ihcVar.readBytes(this.f15880o.getData(), 0, this.f15880o.limit());
        this.f15880o.setPosition(0);
        this.f15881p = false;
    }
}
