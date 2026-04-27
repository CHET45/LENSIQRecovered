package p000;

import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC2493a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p000.bg3;
import p000.cg3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class ewf implements cg3, cg3.InterfaceC2302a {

    /* JADX INFO: renamed from: C */
    public static final String f34327C = "SourceGenerator";

    /* JADX INFO: renamed from: a */
    public final cl3<?> f34328a;

    /* JADX INFO: renamed from: b */
    public final cg3.InterfaceC2302a f34329b;

    /* JADX INFO: renamed from: c */
    public volatile int f34330c;

    /* JADX INFO: renamed from: d */
    public volatile lf3 f34331d;

    /* JADX INFO: renamed from: e */
    public volatile Object f34332e;

    /* JADX INFO: renamed from: f */
    public volatile vwa.C14279a<?> f34333f;

    /* JADX INFO: renamed from: m */
    public volatile mf3 f34334m;

    /* JADX INFO: renamed from: ewf$a */
    public class C5503a implements bg3.InterfaceC1883a<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vwa.C14279a f34335a;

        public C5503a(vwa.C14279a c14279a) {
            this.f34335a = c14279a;
        }

        @Override // p000.bg3.InterfaceC1883a
        public void onDataReady(@hib Object obj) {
            if (ewf.this.m10326a(this.f34335a)) {
                ewf.this.m10327b(this.f34335a, obj);
            }
        }

        @Override // p000.bg3.InterfaceC1883a
        public void onLoadFailed(@efb Exception exc) {
            if (ewf.this.m10326a(this.f34335a)) {
                ewf.this.m10328c(this.f34335a, exc);
            }
        }
    }

    public ewf(cl3<?> cl3Var, cg3.InterfaceC2302a interfaceC2302a) {
        this.f34328a = cl3Var;
        this.f34329b = interfaceC2302a;
    }

    private boolean cacheData(Object obj) throws Throwable {
        long logTime = si9.getLogTime();
        boolean z = false;
        try {
            InterfaceC2493a<T> interfaceC2493aM4033o = this.f34328a.m4033o(obj);
            Object objRewindAndGet = interfaceC2493aM4033o.rewindAndGet();
            n15<X> n15VarM4035q = this.f34328a.m4035q(objRewindAndGet);
            nf3 nf3Var = new nf3(n15VarM4035q, objRewindAndGet, this.f34328a.m4029k());
            mf3 mf3Var = new mf3(this.f34333f.f92420a, this.f34328a.m4034p());
            le4 le4VarM4022d = this.f34328a.m4022d();
            le4VarM4022d.put(mf3Var, nf3Var);
            if (Log.isLoggable(f34327C, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(mf3Var);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(n15VarM4035q);
                sb.append(", duration: ");
                sb.append(si9.getElapsedMillis(logTime));
            }
            if (le4VarM4022d.get(mf3Var) != null) {
                this.f34334m = mf3Var;
                this.f34331d = new lf3(Collections.singletonList(this.f34333f.f92420a), this.f34328a, this);
                this.f34333f.f92422c.cleanup();
                return true;
            }
            if (Log.isLoggable(f34327C, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Attempt to write: ");
                sb2.append(this.f34334m);
                sb2.append(", data: ");
                sb2.append(obj);
                sb2.append(" to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f34329b.onDataFetcherReady(this.f34333f.f92420a, interfaceC2493aM4033o.rewindAndGet(), this.f34333f.f92422c, this.f34333f.f92422c.getDataSource(), this.f34333f.f92420a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f34333f.f92422c.cleanup();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean hasNextModelLoader() {
        return this.f34330c < this.f34328a.m4025g().size();
    }

    private void startNextLoad(vwa.C14279a<?> c14279a) {
        this.f34333f.f92422c.loadData(this.f34328a.m4030l(), new C5503a(c14279a));
    }

    /* JADX INFO: renamed from: a */
    public boolean m10326a(vwa.C14279a<?> c14279a) {
        vwa.C14279a<?> c14279a2 = this.f34333f;
        return c14279a2 != null && c14279a2 == c14279a;
    }

    /* JADX INFO: renamed from: b */
    public void m10327b(vwa.C14279a<?> c14279a, Object obj) {
        ne4 ne4VarM4023e = this.f34328a.m4023e();
        if (obj != null && ne4VarM4023e.isDataCacheable(c14279a.f92422c.getDataSource())) {
            this.f34332e = obj;
            this.f34329b.reschedule();
        } else {
            cg3.InterfaceC2302a interfaceC2302a = this.f34329b;
            eq8 eq8Var = c14279a.f92420a;
            bg3<?> bg3Var = c14279a.f92422c;
            interfaceC2302a.onDataFetcherReady(eq8Var, obj, bg3Var, bg3Var.getDataSource(), this.f34334m);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10328c(vwa.C14279a<?> c14279a, @efb Exception exc) {
        cg3.InterfaceC2302a interfaceC2302a = this.f34329b;
        mf3 mf3Var = this.f34334m;
        bg3<?> bg3Var = c14279a.f92422c;
        interfaceC2302a.onDataFetcherFailed(mf3Var, exc, bg3Var, bg3Var.getDataSource());
    }

    @Override // p000.cg3
    public void cancel() {
        vwa.C14279a<?> c14279a = this.f34333f;
        if (c14279a != null) {
            c14279a.f92422c.cancel();
        }
    }

    @Override // p000.cg3.InterfaceC2302a
    public void onDataFetcherFailed(eq8 eq8Var, Exception exc, bg3<?> bg3Var, hh3 hh3Var) {
        this.f34329b.onDataFetcherFailed(eq8Var, exc, bg3Var, this.f34333f.f92422c.getDataSource());
    }

    @Override // p000.cg3.InterfaceC2302a
    public void onDataFetcherReady(eq8 eq8Var, Object obj, bg3<?> bg3Var, hh3 hh3Var, eq8 eq8Var2) {
        this.f34329b.onDataFetcherReady(eq8Var, obj, bg3Var, this.f34333f.f92422c.getDataSource(), eq8Var);
    }

    @Override // p000.cg3.InterfaceC2302a
    public void reschedule() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.cg3
    public boolean startNext() {
        if (this.f34332e != null) {
            Object obj = this.f34332e;
            this.f34332e = null;
            try {
                if (!cacheData(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable(f34327C, 3);
            }
        }
        if (this.f34331d != null && this.f34331d.startNext()) {
            return true;
        }
        this.f34331d = null;
        this.f34333f = null;
        boolean z = false;
        while (!z && hasNextModelLoader()) {
            List<vwa.C14279a<?>> listM4025g = this.f34328a.m4025g();
            int i = this.f34330c;
            this.f34330c = i + 1;
            this.f34333f = listM4025g.get(i);
            if (this.f34333f != null && (this.f34328a.m4023e().isDataCacheable(this.f34333f.f92422c.getDataSource()) || this.f34328a.m4039u(this.f34333f.f92422c.getDataClass()))) {
                startNextLoad(this.f34333f);
                z = true;
            }
        }
        return z;
    }
}
