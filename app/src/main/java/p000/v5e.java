package p000;

import java.io.File;
import java.util.List;
import p000.bg3;
import p000.cg3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class v5e implements cg3, bg3.InterfaceC1883a<Object> {

    /* JADX INFO: renamed from: C */
    public volatile vwa.C14279a<?> f90029C;

    /* JADX INFO: renamed from: F */
    public File f90030F;

    /* JADX INFO: renamed from: H */
    public w5e f90031H;

    /* JADX INFO: renamed from: a */
    public final cg3.InterfaceC2302a f90032a;

    /* JADX INFO: renamed from: b */
    public final cl3<?> f90033b;

    /* JADX INFO: renamed from: c */
    public int f90034c;

    /* JADX INFO: renamed from: d */
    public int f90035d = -1;

    /* JADX INFO: renamed from: e */
    public eq8 f90036e;

    /* JADX INFO: renamed from: f */
    public List<vwa<File, ?>> f90037f;

    /* JADX INFO: renamed from: m */
    public int f90038m;

    public v5e(cl3<?> cl3Var, cg3.InterfaceC2302a interfaceC2302a) {
        this.f90033b = cl3Var;
        this.f90032a = interfaceC2302a;
    }

    private boolean hasNextModelLoader() {
        return this.f90038m < this.f90037f.size();
    }

    @Override // p000.cg3
    public void cancel() {
        vwa.C14279a<?> c14279a = this.f90029C;
        if (c14279a != null) {
            c14279a.f92422c.cancel();
        }
    }

    @Override // p000.bg3.InterfaceC1883a
    public void onDataReady(Object obj) {
        this.f90032a.onDataFetcherReady(this.f90036e, obj, this.f90029C.f92422c, hh3.RESOURCE_DISK_CACHE, this.f90031H);
    }

    @Override // p000.bg3.InterfaceC1883a
    public void onLoadFailed(@efb Exception exc) {
        this.f90032a.onDataFetcherFailed(this.f90031H, exc, this.f90029C.f92422c, hh3.RESOURCE_DISK_CACHE);
    }

    @Override // p000.cg3
    public boolean startNext() {
        i77.beginSection("ResourceCacheGenerator.startNext");
        try {
            List<eq8> listM4021c = this.f90033b.m4021c();
            boolean z = false;
            if (listM4021c.isEmpty()) {
                i77.endSection();
                return false;
            }
            List<Class<?>> listM4031m = this.f90033b.m4031m();
            if (listM4031m.isEmpty()) {
                if (File.class.equals(this.f90033b.m4036r())) {
                    i77.endSection();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f90033b.m4027i() + " to " + this.f90033b.m4036r());
            }
            while (true) {
                if (this.f90037f != null && hasNextModelLoader()) {
                    this.f90029C = null;
                    while (!z && hasNextModelLoader()) {
                        List<vwa<File, ?>> list = this.f90037f;
                        int i = this.f90038m;
                        this.f90038m = i + 1;
                        this.f90029C = list.get(i).buildLoadData(this.f90030F, this.f90033b.m4038t(), this.f90033b.m4024f(), this.f90033b.m4029k());
                        if (this.f90029C != null && this.f90033b.m4039u(this.f90029C.f92422c.getDataClass())) {
                            this.f90029C.f92422c.loadData(this.f90033b.m4030l(), this);
                            z = true;
                        }
                    }
                    i77.endSection();
                    return z;
                }
                int i2 = this.f90035d + 1;
                this.f90035d = i2;
                if (i2 >= listM4031m.size()) {
                    int i3 = this.f90034c + 1;
                    this.f90034c = i3;
                    if (i3 >= listM4021c.size()) {
                        i77.endSection();
                        return false;
                    }
                    this.f90035d = 0;
                }
                eq8 eq8Var = listM4021c.get(this.f90034c);
                Class<?> cls = listM4031m.get(this.f90035d);
                this.f90031H = new w5e(this.f90033b.m4020b(), eq8Var, this.f90033b.m4034p(), this.f90033b.m4038t(), this.f90033b.m4024f(), this.f90033b.m4037s(cls), cls, this.f90033b.m4029k());
                File file = this.f90033b.m4022d().get(this.f90031H);
                this.f90030F = file;
                if (file != null) {
                    this.f90036e = eq8Var;
                    this.f90037f = this.f90033b.m4028j(file);
                    this.f90038m = 0;
                }
            }
        } catch (Throwable th) {
            i77.endSection();
            throw th;
        }
    }
}
