package p000;

import com.bumptech.glide.C2487c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.InterfaceC2493a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.exd;
import p000.fl3;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public final class cl3<Transcode> {

    /* JADX INFO: renamed from: a */
    public final List<vwa.C14279a<?>> f16865a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<eq8> f16866b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C2487c f16867c;

    /* JADX INFO: renamed from: d */
    public Object f16868d;

    /* JADX INFO: renamed from: e */
    public int f16869e;

    /* JADX INFO: renamed from: f */
    public int f16870f;

    /* JADX INFO: renamed from: g */
    public Class<?> f16871g;

    /* JADX INFO: renamed from: h */
    public fl3.InterfaceC5874e f16872h;

    /* JADX INFO: renamed from: i */
    public i7c f16873i;

    /* JADX INFO: renamed from: j */
    public Map<Class<?>, ceh<?>> f16874j;

    /* JADX INFO: renamed from: k */
    public Class<Transcode> f16875k;

    /* JADX INFO: renamed from: l */
    public boolean f16876l;

    /* JADX INFO: renamed from: m */
    public boolean f16877m;

    /* JADX INFO: renamed from: n */
    public eq8 f16878n;

    /* JADX INFO: renamed from: o */
    public Priority f16879o;

    /* JADX INFO: renamed from: p */
    public ne4 f16880p;

    /* JADX INFO: renamed from: q */
    public boolean f16881q;

    /* JADX INFO: renamed from: r */
    public boolean f16882r;

    /* JADX INFO: renamed from: a */
    public void m4019a() {
        this.f16867c = null;
        this.f16868d = null;
        this.f16878n = null;
        this.f16871g = null;
        this.f16875k = null;
        this.f16873i = null;
        this.f16879o = null;
        this.f16874j = null;
        this.f16880p = null;
        this.f16865a.clear();
        this.f16876l = false;
        this.f16866b.clear();
        this.f16877m = false;
    }

    /* JADX INFO: renamed from: b */
    public z60 m4020b() {
        return this.f16867c.getArrayPool();
    }

    /* JADX INFO: renamed from: c */
    public List<eq8> m4021c() {
        if (!this.f16877m) {
            this.f16877m = true;
            this.f16866b.clear();
            List<vwa.C14279a<?>> listM4025g = m4025g();
            int size = listM4025g.size();
            for (int i = 0; i < size; i++) {
                vwa.C14279a<?> c14279a = listM4025g.get(i);
                if (!this.f16866b.contains(c14279a.f92420a)) {
                    this.f16866b.add(c14279a.f92420a);
                }
                for (int i2 = 0; i2 < c14279a.f92421b.size(); i2++) {
                    if (!this.f16866b.contains(c14279a.f92421b.get(i2))) {
                        this.f16866b.add(c14279a.f92421b.get(i2));
                    }
                }
            }
        }
        return this.f16866b;
    }

    /* JADX INFO: renamed from: d */
    public le4 m4022d() {
        return this.f16872h.getDiskCache();
    }

    /* JADX INFO: renamed from: e */
    public ne4 m4023e() {
        return this.f16880p;
    }

    /* JADX INFO: renamed from: f */
    public int m4024f() {
        return this.f16870f;
    }

    /* JADX INFO: renamed from: g */
    public List<vwa.C14279a<?>> m4025g() {
        if (!this.f16876l) {
            this.f16876l = true;
            this.f16865a.clear();
            List modelLoaders = this.f16867c.getRegistry().getModelLoaders(this.f16868d);
            int size = modelLoaders.size();
            for (int i = 0; i < size; i++) {
                vwa.C14279a<?> c14279aBuildLoadData = ((vwa) modelLoaders.get(i)).buildLoadData(this.f16868d, this.f16869e, this.f16870f, this.f16873i);
                if (c14279aBuildLoadData != null) {
                    this.f16865a.add(c14279aBuildLoadData);
                }
            }
        }
        return this.f16865a;
    }

    /* JADX INFO: renamed from: h */
    public <Data> pc9<Data, ?, Transcode> m4026h(Class<Data> cls) {
        return this.f16867c.getRegistry().getLoadPath(cls, this.f16871g, this.f16875k);
    }

    /* JADX INFO: renamed from: i */
    public Class<?> m4027i() {
        return this.f16868d.getClass();
    }

    /* JADX INFO: renamed from: j */
    public List<vwa<File, ?>> m4028j(File file) throws exd.C5511c {
        return this.f16867c.getRegistry().getModelLoaders(file);
    }

    /* JADX INFO: renamed from: k */
    public i7c m4029k() {
        return this.f16873i;
    }

    /* JADX INFO: renamed from: l */
    public Priority m4030l() {
        return this.f16879o;
    }

    /* JADX INFO: renamed from: m */
    public List<Class<?>> m4031m() {
        return this.f16867c.getRegistry().getRegisteredResourceClasses(this.f16868d.getClass(), this.f16871g, this.f16875k);
    }

    /* JADX INFO: renamed from: n */
    public <Z> g6e<Z> m4032n(t5e<Z> t5eVar) {
        return this.f16867c.getRegistry().getResultEncoder(t5eVar);
    }

    /* JADX INFO: renamed from: o */
    public <T> InterfaceC2493a<T> m4033o(T t) {
        return this.f16867c.getRegistry().getRewinder(t);
    }

    /* JADX INFO: renamed from: p */
    public eq8 m4034p() {
        return this.f16878n;
    }

    /* JADX INFO: renamed from: q */
    public <X> n15<X> m4035q(X x) throws exd.C5513e {
        return this.f16867c.getRegistry().getSourceEncoder(x);
    }

    /* JADX INFO: renamed from: r */
    public Class<?> m4036r() {
        return this.f16875k;
    }

    /* JADX INFO: renamed from: s */
    public <Z> ceh<Z> m4037s(Class<Z> cls) {
        ceh<Z> cehVar = (ceh) this.f16874j.get(cls);
        if (cehVar == null) {
            Iterator<Map.Entry<Class<?>, ceh<?>>> it = this.f16874j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, ceh<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    cehVar = (ceh) next.getValue();
                    break;
                }
            }
        }
        if (cehVar != null) {
            return cehVar;
        }
        if (!this.f16874j.isEmpty() || !this.f16881q) {
            return hth.get();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX INFO: renamed from: t */
    public int m4038t() {
        return this.f16869e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public boolean m4039u(Class<?> cls) {
        return m4026h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public <R> void m4040v(C2487c c2487c, Object obj, eq8 eq8Var, int i, int i2, ne4 ne4Var, Class<?> cls, Class<R> cls2, Priority priority, i7c i7cVar, Map<Class<?>, ceh<?>> map, boolean z, boolean z2, fl3.InterfaceC5874e interfaceC5874e) {
        this.f16867c = c2487c;
        this.f16868d = obj;
        this.f16878n = eq8Var;
        this.f16869e = i;
        this.f16870f = i2;
        this.f16880p = ne4Var;
        this.f16871g = cls;
        this.f16872h = interfaceC5874e;
        this.f16875k = cls2;
        this.f16879o = priority;
        this.f16873i = i7cVar;
        this.f16874j = map;
        this.f16881q = z;
        this.f16882r = z2;
    }

    /* JADX INFO: renamed from: w */
    public boolean m4041w(t5e<?> t5eVar) {
        return this.f16867c.getRegistry().isResourceEncoderAvailable(t5eVar);
    }

    /* JADX INFO: renamed from: x */
    public boolean m4042x() {
        return this.f16882r;
    }

    /* JADX INFO: renamed from: y */
    public boolean m4043y(eq8 eq8Var) {
        List<vwa.C14279a<?>> listM4025g = m4025g();
        int size = listM4025g.size();
        for (int i = 0; i < size; i++) {
            if (listM4025g.get(i).f92420a.equals(eq8Var)) {
                return true;
            }
        }
        return false;
    }
}
