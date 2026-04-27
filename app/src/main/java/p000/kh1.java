package p000;

import android.util.SparseArray;
import androidx.media3.common.C1213a;
import com.blankj.utilcode.util.C2473f;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p000.hz1;
import p000.peg;
import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class kh1 implements bk5, hz1 {

    /* JADX INFO: renamed from: H */
    @Deprecated
    public static final C8365b f54106H = new C8365b();

    /* JADX INFO: renamed from: L */
    public static final d5d f54107L = new d5d();

    /* JADX INFO: renamed from: C */
    public gue f54108C;

    /* JADX INFO: renamed from: F */
    public C1213a[] f54109F;

    /* JADX INFO: renamed from: a */
    public final xj5 f54110a;

    /* JADX INFO: renamed from: b */
    public final int f54111b;

    /* JADX INFO: renamed from: c */
    public final C1213a f54112c;

    /* JADX INFO: renamed from: d */
    public final SparseArray<C8364a> f54113d = new SparseArray<>();

    /* JADX INFO: renamed from: e */
    public boolean f54114e;

    /* JADX INFO: renamed from: f */
    @hib
    public hz1.InterfaceC7086b f54115f;

    /* JADX INFO: renamed from: m */
    public long f54116m;

    /* JADX INFO: renamed from: kh1$a */
    public static final class C8364a implements q6h {

        /* JADX INFO: renamed from: d */
        public final int f54117d;

        /* JADX INFO: renamed from: e */
        public final int f54118e;

        /* JADX INFO: renamed from: f */
        @hib
        public final C1213a f54119f;

        /* JADX INFO: renamed from: g */
        public final yd4 f54120g = new yd4();

        /* JADX INFO: renamed from: h */
        public C1213a f54121h;

        /* JADX INFO: renamed from: i */
        public q6h f54122i;

        /* JADX INFO: renamed from: j */
        public long f54123j;

        public C8364a(int i, int i2, @hib C1213a c1213a) {
            this.f54117d = i;
            this.f54118e = i2;
            this.f54119f = c1213a;
        }

        public void bind(@hib hz1.InterfaceC7086b interfaceC7086b, long j) {
            if (interfaceC7086b == null) {
                this.f54122i = this.f54120g;
                return;
            }
            this.f54123j = j;
            q6h q6hVarTrack = interfaceC7086b.track(this.f54117d, this.f54118e);
            this.f54122i = q6hVarTrack;
            C1213a c1213a = this.f54121h;
            if (c1213a != null) {
                q6hVarTrack.format(c1213a);
            }
        }

        @Override // p000.q6h
        public void format(C1213a c1213a) {
            C1213a c1213a2 = this.f54119f;
            if (c1213a2 != null) {
                c1213a = c1213a.withManifestFormatInfo(c1213a2);
            }
            this.f54121h = c1213a;
            ((q6h) t0i.castNonNull(this.f54122i)).format(this.f54121h);
        }

        @Override // p000.q6h
        public int sampleData(bh3 bh3Var, int i, boolean z, int i2) throws IOException {
            return ((q6h) t0i.castNonNull(this.f54122i)).sampleData(bh3Var, i, z);
        }

        @Override // p000.q6h
        public void sampleMetadata(long j, int i, int i2, int i3, @hib q6h.C11325a c11325a) {
            long j2 = this.f54123j;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f54122i = this.f54120g;
            }
            ((q6h) t0i.castNonNull(this.f54122i)).sampleMetadata(j, i, i2, i3, c11325a);
        }

        @Override // p000.q6h
        public void sampleData(jhc jhcVar, int i, int i2) {
            ((q6h) t0i.castNonNull(this.f54122i)).sampleData(jhcVar, i);
        }
    }

    /* JADX INFO: renamed from: kh1$b */
    public static final class C8365b implements hz1.InterfaceC7085a {

        /* JADX INFO: renamed from: a */
        public peg.InterfaceC10936a f54124a = new oz3();

        /* JADX INFO: renamed from: b */
        public boolean f54125b;

        /* JADX INFO: renamed from: c */
        public int f54126c;

        @Override // p000.hz1.InterfaceC7085a
        @hib
        public hz1 createProgressiveMediaExtractor(int i, C1213a c1213a, boolean z, List<C1213a> list, @hib q6h q6hVar, j0d j0dVar) {
            xj5 bv6Var;
            String str = c1213a.f8290n;
            if (!rva.isText(str)) {
                if (rva.isMatroska(str)) {
                    bv6Var = new f4a(this.f54124a, this.f54125b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    bv6Var = new yj8(1);
                } else if (Objects.equals(str, "image/png")) {
                    bv6Var = new l1d();
                } else {
                    int i2 = z ? 4 : 0;
                    if (!this.f54125b) {
                        i2 |= 32;
                    }
                    bv6Var = new bv6(this.f54124a, i2 | bv6.codecsToParseWithinGopSampleDependenciesAsFlags(this.f54126c), null, null, list, q6hVar);
                }
            } else {
                if (!this.f54125b) {
                    return null;
                }
                bv6Var = new geg(this.f54124a.create(c1213a), c1213a);
            }
            return new kh1(bv6Var, i, c1213a);
        }

        @Override // p000.hz1.InterfaceC7085a
        public C1213a getOutputTextFormat(C1213a c1213a) {
            String str;
            if (!this.f54125b || !this.f54124a.supportsFormat(c1213a)) {
                return c1213a;
            }
            C1213a.b cueReplacementBehavior = c1213a.buildUpon().setSampleMimeType(rva.f79794T0).setCueReplacementBehavior(this.f54124a.getCueReplacementBehavior(c1213a));
            StringBuilder sb = new StringBuilder();
            sb.append(c1213a.f8291o);
            if (c1213a.f8287k != null) {
                str = C2473f.f17566z + c1213a.f8287k;
            } else {
                str = "";
            }
            sb.append(str);
            return cueReplacementBehavior.setCodecs(sb.toString()).setSubsampleOffsetUs(Long.MAX_VALUE).build();
        }

        @Override // p000.hz1.InterfaceC7085a
        @op1
        public C8365b experimentalParseSubtitlesDuringExtraction(boolean z) {
            this.f54125b = z;
            return this;
        }

        @Override // p000.hz1.InterfaceC7085a
        @op1
        public C8365b experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
            this.f54126c = i;
            return this;
        }

        @Override // p000.hz1.InterfaceC7085a
        @op1
        public C8365b setSubtitleParserFactory(peg.InterfaceC10936a interfaceC10936a) {
            this.f54124a = (peg.InterfaceC10936a) v80.checkNotNull(interfaceC10936a);
            return this;
        }
    }

    public kh1(xj5 xj5Var, int i, C1213a c1213a) {
        this.f54110a = xj5Var;
        this.f54111b = i;
        this.f54112c = c1213a;
    }

    @Override // p000.bk5
    public void endTracks() {
        C1213a[] c1213aArr = new C1213a[this.f54113d.size()];
        for (int i = 0; i < this.f54113d.size(); i++) {
            c1213aArr[i] = (C1213a) v80.checkStateNotNull(this.f54113d.valueAt(i).f54121h);
        }
        this.f54109F = c1213aArr;
    }

    @Override // p000.hz1
    @hib
    public mz1 getChunkIndex() {
        gue gueVar = this.f54108C;
        if (gueVar instanceof mz1) {
            return (mz1) gueVar;
        }
        return null;
    }

    @Override // p000.hz1
    @hib
    public C1213a[] getSampleFormats() {
        return this.f54109F;
    }

    @Override // p000.hz1
    public void init(@hib hz1.InterfaceC7086b interfaceC7086b, long j, long j2) {
        this.f54115f = interfaceC7086b;
        this.f54116m = j2;
        if (!this.f54114e) {
            this.f54110a.init(this);
            if (j != -9223372036854775807L) {
                this.f54110a.seek(0L, j);
            }
            this.f54114e = true;
            return;
        }
        xj5 xj5Var = this.f54110a;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        xj5Var.seek(0L, j);
        for (int i = 0; i < this.f54113d.size(); i++) {
            this.f54113d.valueAt(i).bind(interfaceC7086b, j2);
        }
    }

    @Override // p000.hz1
    public boolean read(ak5 ak5Var) throws IOException {
        int i = this.f54110a.read(ak5Var, f54107L);
        v80.checkState(i != 1);
        return i == 0;
    }

    @Override // p000.hz1
    public void release() {
        this.f54110a.release();
    }

    @Override // p000.bk5
    public void seekMap(gue gueVar) {
        this.f54108C = gueVar;
    }

    @Override // p000.bk5
    public q6h track(int i, int i2) {
        C8364a c8364a = this.f54113d.get(i);
        if (c8364a == null) {
            v80.checkState(this.f54109F == null);
            c8364a = new C8364a(i, i2, i2 == this.f54111b ? this.f54112c : null);
            c8364a.bind(this.f54115f, this.f54116m);
            this.f54113d.put(i, c8364a);
        }
        return c8364a;
    }
}
