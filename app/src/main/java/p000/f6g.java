package p000;

import java.io.IOException;
import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class f6g {

    /* JADX INFO: renamed from: n */
    public static final int f35515n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f35516o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f35517p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f35518q = 3;

    /* JADX INFO: renamed from: b */
    public r6h f35520b;

    /* JADX INFO: renamed from: c */
    public ck5 f35521c;

    /* JADX INFO: renamed from: d */
    public c0c f35522d;

    /* JADX INFO: renamed from: e */
    public long f35523e;

    /* JADX INFO: renamed from: f */
    public long f35524f;

    /* JADX INFO: renamed from: g */
    public long f35525g;

    /* JADX INFO: renamed from: h */
    public int f35526h;

    /* JADX INFO: renamed from: i */
    public int f35527i;

    /* JADX INFO: renamed from: k */
    public long f35529k;

    /* JADX INFO: renamed from: l */
    public boolean f35530l;

    /* JADX INFO: renamed from: m */
    public boolean f35531m;

    /* JADX INFO: renamed from: a */
    public final yzb f35519a = new yzb();

    /* JADX INFO: renamed from: j */
    public C5642b f35528j = new C5642b();

    /* JADX INFO: renamed from: f6g$b */
    public static class C5642b {

        /* JADX INFO: renamed from: a */
        public kq6 f35532a;

        /* JADX INFO: renamed from: b */
        public c0c f35533b;
    }

    /* JADX INFO: renamed from: f6g$c */
    public static final class C5643c implements c0c {
        private C5643c() {
        }

        @Override // p000.c0c
        public hue createSeekMap() {
            return new hue.C7024b(-9223372036854775807L);
        }

        @Override // p000.c0c
        public long read(zj5 zj5Var) {
            return -1L;
        }

        @Override // p000.c0c
        public void startSeek(long j) {
        }
    }

    @z25({"trackOutput", "extractorOutput"})
    private void assertInitialized() {
        u80.checkStateNotNull(this.f35520b);
        x0i.castNonNull(this.f35521c);
    }

    @a35(expression = {"setupData.format"}, result = true)
    private boolean readHeaders(zj5 zj5Var) throws IOException {
        while (this.f35519a.populate(zj5Var)) {
            this.f35529k = zj5Var.getPosition() - this.f35524f;
            if (!mo2869g(this.f35519a.getPayload(), this.f35524f, this.f35528j)) {
                return true;
            }
            this.f35524f = zj5Var.getPosition();
        }
        this.f35526h = 3;
        return false;
    }

    @g5e({"trackOutput"})
    private int readHeadersAndUpdateState(zj5 zj5Var) throws IOException {
        if (!readHeaders(zj5Var)) {
            return -1;
        }
        kq6 kq6Var = this.f35528j.f35532a;
        this.f35527i = kq6Var.f55009f2;
        if (!this.f35531m) {
            this.f35520b.format(kq6Var);
            this.f35531m = true;
        }
        c0c c0cVar = this.f35528j.f35533b;
        if (c0cVar != null) {
            this.f35522d = c0cVar;
        } else if (zj5Var.getLength() == -1) {
            this.f35522d = new C5643c();
        } else {
            a0c pageHeader = this.f35519a.getPageHeader();
            this.f35522d = new mx3(this, this.f35524f, zj5Var.getLength(), pageHeader.f38h + pageHeader.f39i, pageHeader.f33c, (pageHeader.f32b & 4) != 0);
        }
        this.f35526h = 2;
        this.f35519a.trimPayload();
        return 0;
    }

    @g5e({"trackOutput", "oggSeeker", "extractorOutput"})
    private int readPayload(zj5 zj5Var, c5d c5dVar) throws IOException {
        long j = this.f35522d.read(zj5Var);
        if (j >= 0) {
            c5dVar.f15813a = j;
            return 1;
        }
        if (j < -1) {
            mo10678d(-(j + 2));
        }
        if (!this.f35530l) {
            this.f35521c.seekMap((hue) u80.checkStateNotNull(this.f35522d.createSeekMap()));
            this.f35530l = true;
        }
        if (this.f35529k <= 0 && !this.f35519a.populate(zj5Var)) {
            this.f35526h = 3;
            return -1;
        }
        this.f35529k = 0L;
        ihc payload = this.f35519a.getPayload();
        long jMo2868e = mo2868e(payload);
        if (jMo2868e >= 0) {
            long j2 = this.f35525g;
            if (j2 + jMo2868e >= this.f35523e) {
                long jM10675a = m10675a(j2);
                this.f35520b.sampleData(payload, payload.limit());
                this.f35520b.sampleMetadata(jM10675a, 1, payload.limit(), 0, null);
                this.f35523e = -1L;
            }
        }
        this.f35525g += jMo2868e;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public long m10675a(long j) {
        return (j * 1000000) / ((long) this.f35527i);
    }

    /* JADX INFO: renamed from: b */
    public long m10676b(long j) {
        return (((long) this.f35527i) * j) / 1000000;
    }

    /* JADX INFO: renamed from: c */
    public void m10677c(ck5 ck5Var, r6h r6hVar) {
        this.f35521c = ck5Var;
        this.f35520b = r6hVar;
        mo2870h(true);
    }

    /* JADX INFO: renamed from: d */
    public void mo10678d(long j) {
        this.f35525g = j;
    }

    /* JADX INFO: renamed from: e */
    public abstract long mo2868e(ihc ihcVar);

    /* JADX INFO: renamed from: f */
    public final int m10679f(zj5 zj5Var, c5d c5dVar) throws IOException {
        assertInitialized();
        int i = this.f35526h;
        if (i == 0) {
            return readHeadersAndUpdateState(zj5Var);
        }
        if (i == 1) {
            zj5Var.skipFully((int) this.f35524f);
            this.f35526h = 2;
            return 0;
        }
        if (i == 2) {
            x0i.castNonNull(this.f35522d);
            return readPayload(zj5Var, c5dVar);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @a35(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: g */
    public abstract boolean mo2869g(ihc ihcVar, long j, C5642b c5642b) throws IOException;

    /* JADX INFO: renamed from: h */
    public void mo2870h(boolean z) {
        if (z) {
            this.f35528j = new C5642b();
            this.f35524f = 0L;
            this.f35526h = 0;
        } else {
            this.f35526h = 1;
        }
        this.f35523e = -1L;
        this.f35525g = 0L;
    }

    /* JADX INFO: renamed from: i */
    public final void m10680i(long j, long j2) {
        this.f35519a.reset();
        if (j == 0) {
            mo2870h(!this.f35530l);
        } else if (this.f35526h != 0) {
            this.f35523e = m10676b(j2);
            ((c0c) x0i.castNonNull(this.f35522d)).startSeek(this.f35523e);
            this.f35526h = 2;
        }
    }
}
