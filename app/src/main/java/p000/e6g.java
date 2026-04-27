package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;
import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e6g {

    /* JADX INFO: renamed from: n */
    public static final int f31950n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f31951o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f31952p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f31953q = 3;

    /* JADX INFO: renamed from: b */
    public q6h f31955b;

    /* JADX INFO: renamed from: c */
    public bk5 f31956c;

    /* JADX INFO: renamed from: d */
    public d0c f31957d;

    /* JADX INFO: renamed from: e */
    public long f31958e;

    /* JADX INFO: renamed from: f */
    public long f31959f;

    /* JADX INFO: renamed from: g */
    public long f31960g;

    /* JADX INFO: renamed from: h */
    public int f31961h;

    /* JADX INFO: renamed from: i */
    public int f31962i;

    /* JADX INFO: renamed from: k */
    public long f31964k;

    /* JADX INFO: renamed from: l */
    public boolean f31965l;

    /* JADX INFO: renamed from: m */
    public boolean f31966m;

    /* JADX INFO: renamed from: a */
    public final zzb f31954a = new zzb();

    /* JADX INFO: renamed from: j */
    public C5148b f31963j = new C5148b();

    /* JADX INFO: renamed from: e6g$b */
    public static class C5148b {

        /* JADX INFO: renamed from: a */
        public C1213a f31967a;

        /* JADX INFO: renamed from: b */
        public d0c f31968b;
    }

    /* JADX INFO: renamed from: e6g$c */
    public static final class C5149c implements d0c {
        private C5149c() {
        }

        @Override // p000.d0c
        public gue createSeekMap() {
            return new gue.C6549b(-9223372036854775807L);
        }

        @Override // p000.d0c
        public long read(ak5 ak5Var) {
            return -1L;
        }

        @Override // p000.d0c
        public void startSeek(long j) {
        }
    }

    @z25({"trackOutput", "extractorOutput"})
    private void assertInitialized() {
        v80.checkStateNotNull(this.f31955b);
        t0i.castNonNull(this.f31956c);
    }

    @a35(expression = {"setupData.format"}, result = true)
    private boolean readHeaders(ak5 ak5Var) throws IOException {
        while (this.f31954a.populate(ak5Var)) {
            this.f31964k = ak5Var.getPosition() - this.f31959f;
            if (!mo122g(this.f31954a.getPayload(), this.f31959f, this.f31963j)) {
                return true;
            }
            this.f31959f = ak5Var.getPosition();
        }
        this.f31961h = 3;
        return false;
    }

    @g5e({"trackOutput"})
    private int readHeadersAndUpdateState(ak5 ak5Var) throws IOException {
        if (!readHeaders(ak5Var)) {
            return -1;
        }
        C1213a c1213a = this.f31963j.f31967a;
        this.f31962i = c1213a.f8267H;
        if (!this.f31966m) {
            this.f31955b.format(c1213a);
            this.f31966m = true;
        }
        d0c d0cVar = this.f31963j.f31968b;
        if (d0cVar != null) {
            this.f31957d = d0cVar;
        } else if (ak5Var.getLength() == -1) {
            this.f31957d = new C5149c();
        } else {
            b0c pageHeader = this.f31954a.getPageHeader();
            this.f31957d = new lx3(this, this.f31959f, ak5Var.getLength(), pageHeader.f12344h + pageHeader.f12345i, pageHeader.f12339c, (pageHeader.f12338b & 4) != 0);
        }
        this.f31961h = 2;
        this.f31954a.trimPayload();
        return 0;
    }

    @g5e({"trackOutput", "oggSeeker", "extractorOutput"})
    private int readPayload(ak5 ak5Var, d5d d5dVar) throws IOException {
        long j = this.f31957d.read(ak5Var);
        if (j >= 0) {
            d5dVar.f28476a = j;
            return 1;
        }
        if (j < -1) {
            mo9756d(-(j + 2));
        }
        if (!this.f31965l) {
            gue gueVar = (gue) v80.checkStateNotNull(this.f31957d.createSeekMap());
            this.f31956c.seekMap(gueVar);
            this.f31955b.durationUs(gueVar.getDurationUs());
            this.f31965l = true;
        }
        if (this.f31964k <= 0 && !this.f31954a.populate(ak5Var)) {
            this.f31961h = 3;
            return -1;
        }
        this.f31964k = 0L;
        jhc payload = this.f31954a.getPayload();
        long jMo121e = mo121e(payload);
        if (jMo121e >= 0) {
            long j2 = this.f31960g;
            if (j2 + jMo121e >= this.f31958e) {
                long jM9753a = m9753a(j2);
                this.f31955b.sampleData(payload, payload.limit());
                this.f31955b.sampleMetadata(jM9753a, 1, payload.limit(), 0, null);
                this.f31958e = -1L;
            }
        }
        this.f31960g += jMo121e;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public long m9753a(long j) {
        return (j * 1000000) / ((long) this.f31962i);
    }

    /* JADX INFO: renamed from: b */
    public long m9754b(long j) {
        return (((long) this.f31962i) * j) / 1000000;
    }

    /* JADX INFO: renamed from: c */
    public void m9755c(bk5 bk5Var, q6h q6hVar) {
        this.f31956c = bk5Var;
        this.f31955b = q6hVar;
        mo123h(true);
    }

    /* JADX INFO: renamed from: d */
    public void mo9756d(long j) {
        this.f31960g = j;
    }

    /* JADX INFO: renamed from: e */
    public abstract long mo121e(jhc jhcVar);

    /* JADX INFO: renamed from: f */
    public final int m9757f(ak5 ak5Var, d5d d5dVar) throws IOException {
        assertInitialized();
        int i = this.f31961h;
        if (i == 0) {
            return readHeadersAndUpdateState(ak5Var);
        }
        if (i == 1) {
            ak5Var.skipFully((int) this.f31959f);
            this.f31961h = 2;
            return 0;
        }
        if (i == 2) {
            t0i.castNonNull(this.f31957d);
            return readPayload(ak5Var, d5dVar);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @a35(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: g */
    public abstract boolean mo122g(jhc jhcVar, long j, C5148b c5148b) throws IOException;

    /* JADX INFO: renamed from: h */
    public void mo123h(boolean z) {
        if (z) {
            this.f31963j = new C5148b();
            this.f31959f = 0L;
            this.f31961h = 0;
        } else {
            this.f31961h = 1;
        }
        this.f31958e = -1L;
        this.f31960g = 0L;
    }

    /* JADX INFO: renamed from: i */
    public final void m9758i(long j, long j2) {
        this.f31954a.reset();
        if (j == 0) {
            mo123h(!this.f31965l);
        } else if (this.f31961h != 0) {
            this.f31958e = m9754b(j2);
            ((d0c) t0i.castNonNull(this.f31957d)).startSeek(this.f31958e);
            this.f31961h = 2;
        }
    }
}
