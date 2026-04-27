package p000;

import java.io.File;
import java.util.List;
import p000.bg3;
import p000.cg3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class lf3 implements cg3, bg3.InterfaceC1883a<Object> {

    /* JADX INFO: renamed from: C */
    public volatile vwa.C14279a<?> f57458C;

    /* JADX INFO: renamed from: F */
    public File f57459F;

    /* JADX INFO: renamed from: a */
    public final List<eq8> f57460a;

    /* JADX INFO: renamed from: b */
    public final cl3<?> f57461b;

    /* JADX INFO: renamed from: c */
    public final cg3.InterfaceC2302a f57462c;

    /* JADX INFO: renamed from: d */
    public int f57463d;

    /* JADX INFO: renamed from: e */
    public eq8 f57464e;

    /* JADX INFO: renamed from: f */
    public List<vwa<File, ?>> f57465f;

    /* JADX INFO: renamed from: m */
    public int f57466m;

    public lf3(cl3<?> cl3Var, cg3.InterfaceC2302a interfaceC2302a) {
        this(cl3Var.m4021c(), cl3Var, interfaceC2302a);
    }

    private boolean hasNextModelLoader() {
        return this.f57466m < this.f57465f.size();
    }

    @Override // p000.cg3
    public void cancel() {
        vwa.C14279a<?> c14279a = this.f57458C;
        if (c14279a != null) {
            c14279a.f92422c.cancel();
        }
    }

    @Override // p000.bg3.InterfaceC1883a
    public void onDataReady(Object obj) {
        this.f57462c.onDataFetcherReady(this.f57464e, obj, this.f57458C.f92422c, hh3.DATA_DISK_CACHE, this.f57464e);
    }

    @Override // p000.bg3.InterfaceC1883a
    public void onLoadFailed(@efb Exception exc) {
        this.f57462c.onDataFetcherFailed(this.f57464e, exc, this.f57458C.f92422c, hh3.DATA_DISK_CACHE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (hasNextModelLoader() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f57465f;
        r3 = r7.f57466m;
        r7.f57466m = r3 + 1;
        r7.f57458C = r0.get(r3).buildLoadData(r7.f57459F, r7.f57461b.m4038t(), r7.f57461b.m4024f(), r7.f57461b.m4029k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f57458C == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f57461b.m4039u(r7.f57458C.f92422c.getDataClass()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f57458C.f92422c.loadData(r7.f57461b.m4030l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f57458C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // p000.cg3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean startNext() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            p000.i77.beginSection(r0)
        L5:
            java.util.List<vwa<java.io.File, ?>> r0 = r7.f57465f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.hasNextModelLoader()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f57458C = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.hasNextModelLoader()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List<vwa<java.io.File, ?>> r0 = r7.f57465f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f57466m     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f57466m = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            vwa r0 = (p000.vwa) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f57459F     // Catch: java.lang.Throwable -> L68
            cl3<?> r4 = r7.f57461b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.m4038t()     // Catch: java.lang.Throwable -> L68
            cl3<?> r5 = r7.f57461b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.m4024f()     // Catch: java.lang.Throwable -> L68
            cl3<?> r6 = r7.f57461b     // Catch: java.lang.Throwable -> L68
            i7c r6 = r6.m4029k()     // Catch: java.lang.Throwable -> L68
            vwa$a r0 = r0.buildLoadData(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f57458C = r0     // Catch: java.lang.Throwable -> L68
            vwa$a<?> r0 = r7.f57458C     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            cl3<?> r0 = r7.f57461b     // Catch: java.lang.Throwable -> L68
            vwa$a<?> r3 = r7.f57458C     // Catch: java.lang.Throwable -> L68
            bg3<Data> r3 = r3.f92422c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.getDataClass()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.m4039u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            vwa$a<?> r0 = r7.f57458C     // Catch: java.lang.Throwable -> L68
            bg3<Data> r0 = r0.f92422c     // Catch: java.lang.Throwable -> L68
            cl3<?> r2 = r7.f57461b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.Priority r2 = r2.m4030l()     // Catch: java.lang.Throwable -> L68
            r0.loadData(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            p000.i77.endSection()
            return r2
        L6e:
            int r0 = r7.f57463d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f57463d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List<eq8> r1 = r7.f57460a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            p000.i77.endSection()
            return r2
        L7f:
            java.util.List<eq8> r0 = r7.f57460a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f57463d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            eq8 r0 = (p000.eq8) r0     // Catch: java.lang.Throwable -> L68
            mf3 r1 = new mf3     // Catch: java.lang.Throwable -> L68
            cl3<?> r3 = r7.f57461b     // Catch: java.lang.Throwable -> L68
            eq8 r3 = r3.m4034p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            cl3<?> r3 = r7.f57461b     // Catch: java.lang.Throwable -> L68
            le4 r3 = r3.m4022d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L68
            r7.f57459F = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f57464e = r0     // Catch: java.lang.Throwable -> L68
            cl3<?> r0 = r7.f57461b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.m4028j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f57465f = r0     // Catch: java.lang.Throwable -> L68
            r7.f57466m = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            p000.i77.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lf3.startNext():boolean");
    }

    public lf3(List<eq8> list, cl3<?> cl3Var, cg3.InterfaceC2302a interfaceC2302a) {
        this.f57463d = -1;
        this.f57460a = list;
        this.f57461b = cl3Var;
        this.f57462c = interfaceC2302a;
    }
}
