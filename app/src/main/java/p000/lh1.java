package p000;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import p000.iz1;
import p000.r6h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class lh1 implements ck5, iz1 {

    /* JADX INFO: renamed from: H */
    public static final iz1.InterfaceC7668a f57542H = new iz1.InterfaceC7668a() { // from class: jh1
        @Override // p000.iz1.InterfaceC7668a
        public final iz1 createProgressiveMediaExtractor(int i, kq6 kq6Var, boolean z, List list, r6h r6hVar, k0d k0dVar) {
            return lh1.lambda$static$0(i, kq6Var, z, list, r6hVar, k0dVar);
        }
    };

    /* JADX INFO: renamed from: L */
    public static final c5d f57543L = new c5d();

    /* JADX INFO: renamed from: C */
    public hue f57544C;

    /* JADX INFO: renamed from: F */
    public kq6[] f57545F;

    /* JADX INFO: renamed from: a */
    public final yj5 f57546a;

    /* JADX INFO: renamed from: b */
    public final int f57547b;

    /* JADX INFO: renamed from: c */
    public final kq6 f57548c;

    /* JADX INFO: renamed from: d */
    public final SparseArray<C8814a> f57549d = new SparseArray<>();

    /* JADX INFO: renamed from: e */
    public boolean f57550e;

    /* JADX INFO: renamed from: f */
    @hib
    public iz1.InterfaceC7669b f57551f;

    /* JADX INFO: renamed from: m */
    public long f57552m;

    /* JADX INFO: renamed from: lh1$a */
    public static final class C8814a implements r6h {

        /* JADX INFO: renamed from: d */
        public final int f57553d;

        /* JADX INFO: renamed from: e */
        public final int f57554e;

        /* JADX INFO: renamed from: f */
        @hib
        public final kq6 f57555f;

        /* JADX INFO: renamed from: g */
        public final ts4 f57556g = new ts4();

        /* JADX INFO: renamed from: h */
        public kq6 f57557h;

        /* JADX INFO: renamed from: i */
        public r6h f57558i;

        /* JADX INFO: renamed from: j */
        public long f57559j;

        public C8814a(int i, int i2, @hib kq6 kq6Var) {
            this.f57553d = i;
            this.f57554e = i2;
            this.f57555f = kq6Var;
        }

        public void bind(@hib iz1.InterfaceC7669b interfaceC7669b, long j) {
            if (interfaceC7669b == null) {
                this.f57558i = this.f57556g;
                return;
            }
            this.f57559j = j;
            r6h r6hVarTrack = interfaceC7669b.track(this.f57553d, this.f57554e);
            this.f57558i = r6hVarTrack;
            kq6 kq6Var = this.f57557h;
            if (kq6Var != null) {
                r6hVarTrack.format(kq6Var);
            }
        }

        @Override // p000.r6h
        public void format(kq6 kq6Var) {
            kq6 kq6Var2 = this.f57555f;
            if (kq6Var2 != null) {
                kq6Var = kq6Var.withManifestFormatInfo(kq6Var2);
            }
            this.f57557h = kq6Var;
            ((r6h) x0i.castNonNull(this.f57558i)).format(this.f57557h);
        }

        @Override // p000.r6h
        public int sampleData(ah3 ah3Var, int i, boolean z, int i2) throws IOException {
            return ((r6h) x0i.castNonNull(this.f57558i)).sampleData(ah3Var, i, z);
        }

        @Override // p000.r6h
        public void sampleMetadata(long j, int i, int i2, int i3, @hib r6h.C11906a c11906a) {
            long j2 = this.f57559j;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f57558i = this.f57556g;
            }
            ((r6h) x0i.castNonNull(this.f57558i)).sampleMetadata(j, i, i2, i3, c11906a);
        }

        @Override // p000.r6h
        public void sampleData(ihc ihcVar, int i, int i2) {
            ((r6h) x0i.castNonNull(this.f57558i)).sampleData(ihcVar, i);
        }
    }

    public lh1(yj5 yj5Var, int i, kq6 kq6Var) {
        this.f57546a = yj5Var;
        this.f57547b = i;
        this.f57548c = kq6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iz1 lambda$static$0(int i, kq6 kq6Var, boolean z, List list, r6h r6hVar, k0d k0dVar) {
        yj5 cv6Var;
        String str = kq6Var.f54988L;
        if (sva.isText(str)) {
            return null;
        }
        if (sva.isMatroska(str)) {
            cv6Var = new g4a(1);
        } else {
            cv6Var = new cv6(z ? 4 : 0, null, null, list, r6hVar);
        }
        return new lh1(cv6Var, i, kq6Var);
    }

    @Override // p000.ck5
    public void endTracks() {
        kq6[] kq6VarArr = new kq6[this.f57549d.size()];
        for (int i = 0; i < this.f57549d.size(); i++) {
            kq6VarArr[i] = (kq6) u80.checkStateNotNull(this.f57549d.valueAt(i).f57557h);
        }
        this.f57545F = kq6VarArr;
    }

    @Override // p000.iz1
    @hib
    public lz1 getChunkIndex() {
        hue hueVar = this.f57544C;
        if (hueVar instanceof lz1) {
            return (lz1) hueVar;
        }
        return null;
    }

    @Override // p000.iz1
    @hib
    public kq6[] getSampleFormats() {
        return this.f57545F;
    }

    @Override // p000.iz1
    public void init(@hib iz1.InterfaceC7669b interfaceC7669b, long j, long j2) {
        this.f57551f = interfaceC7669b;
        this.f57552m = j2;
        if (!this.f57550e) {
            this.f57546a.init(this);
            if (j != -9223372036854775807L) {
                this.f57546a.seek(0L, j);
            }
            this.f57550e = true;
            return;
        }
        yj5 yj5Var = this.f57546a;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        yj5Var.seek(0L, j);
        for (int i = 0; i < this.f57549d.size(); i++) {
            this.f57549d.valueAt(i).bind(interfaceC7669b, j2);
        }
    }

    @Override // p000.iz1
    public boolean read(zj5 zj5Var) throws IOException {
        int i = this.f57546a.read(zj5Var, f57543L);
        u80.checkState(i != 1);
        return i == 0;
    }

    @Override // p000.iz1
    public void release() {
        this.f57546a.release();
    }

    @Override // p000.ck5
    public void seekMap(hue hueVar) {
        this.f57544C = hueVar;
    }

    @Override // p000.ck5
    public r6h track(int i, int i2) {
        C8814a c8814a = this.f57549d.get(i);
        if (c8814a == null) {
            u80.checkState(this.f57545F == null);
            c8814a = new C8814a(i, i2, i2 == this.f57547b ? this.f57548c : null);
            c8814a.bind(this.f57551f, this.f57552m);
            this.f57549d.put(i, c8814a);
        }
        return c8814a;
    }
}
