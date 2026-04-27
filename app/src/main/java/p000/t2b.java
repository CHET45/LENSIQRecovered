package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.exd;
import p000.p4d;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class t2b {

    /* JADX INFO: renamed from: e */
    public static final C12865c f83508e = new C12865c();

    /* JADX INFO: renamed from: f */
    public static final vwa<Object, Object> f83509f = new C12863a();

    /* JADX INFO: renamed from: a */
    public final List<C12864b<?, ?>> f83510a;

    /* JADX INFO: renamed from: b */
    public final C12865c f83511b;

    /* JADX INFO: renamed from: c */
    public final Set<C12864b<?, ?>> f83512c;

    /* JADX INFO: renamed from: d */
    public final p4d.InterfaceC10791a<List<Throwable>> f83513d;

    /* JADX INFO: renamed from: t2b$a */
    public static class C12863a implements vwa<Object, Object> {
        @Override // p000.vwa
        @hib
        public vwa.C14279a<Object> buildLoadData(@efb Object obj, int i, int i2, @efb i7c i7cVar) {
            return null;
        }

        @Override // p000.vwa
        public boolean handles(@efb Object obj) {
            return false;
        }
    }

    /* JADX INFO: renamed from: t2b$b */
    public static class C12864b<Model, Data> {

        /* JADX INFO: renamed from: a */
        public final Class<Model> f83514a;

        /* JADX INFO: renamed from: b */
        public final Class<Data> f83515b;

        /* JADX INFO: renamed from: c */
        public final wwa<? extends Model, ? extends Data> f83516c;

        public C12864b(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<? extends Model, ? extends Data> wwaVar) {
            this.f83514a = cls;
            this.f83515b = cls2;
            this.f83516c = wwaVar;
        }

        public boolean handles(@efb Class<?> cls, @efb Class<?> cls2) {
            return handles(cls) && this.f83515b.isAssignableFrom(cls2);
        }

        public boolean handles(@efb Class<?> cls) {
            return this.f83514a.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: renamed from: t2b$c */
    public static class C12865c {
        @efb
        public <Model, Data> s2b<Model, Data> build(@efb List<vwa<Model, Data>> list, @efb p4d.InterfaceC10791a<List<Throwable>> interfaceC10791a) {
            return new s2b<>(list, interfaceC10791a);
        }
    }

    public t2b(@efb p4d.InterfaceC10791a<List<Throwable>> interfaceC10791a) {
        this(interfaceC10791a, f83508e);
    }

    private <Model, Data> void add(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<? extends Model, ? extends Data> wwaVar, boolean z) {
        C12864b<?, ?> c12864b = new C12864b<>(cls, cls2, wwaVar);
        List<C12864b<?, ?>> list = this.f83510a;
        list.add(z ? list.size() : 0, c12864b);
    }

    @efb
    private static <Model, Data> vwa<Model, Data> emptyModelLoader() {
        return (vwa<Model, Data>) f83509f;
    }

    @efb
    private <Model, Data> wwa<Model, Data> getFactory(@efb C12864b<?, ?> c12864b) {
        return (wwa<Model, Data>) c12864b.f83516c;
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Model, Data> void m22334a(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<? extends Model, ? extends Data> wwaVar) {
        add(cls, cls2, wwaVar, true);
    }

    @efb
    /* JADX INFO: renamed from: b */
    public synchronized <Model> List<vwa<Model, ?>> m22335b(@efb Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C12864b<?, ?> c12864b : this.f83510a) {
                if (!this.f83512c.contains(c12864b) && c12864b.handles(cls)) {
                    this.f83512c.add(c12864b);
                    arrayList.add(build(c12864b));
                    this.f83512c.remove(c12864b);
                }
            }
        } finally {
        }
        return arrayList;
    }

    @efb
    public synchronized <Model, Data> vwa<Model, Data> build(@efb Class<Model> cls, @efb Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C12864b<?, ?> c12864b : this.f83510a) {
                if (this.f83512c.contains(c12864b)) {
                    z = true;
                } else if (c12864b.handles(cls, cls2)) {
                    this.f83512c.add(c12864b);
                    arrayList.add(build(c12864b));
                    this.f83512c.remove(c12864b);
                }
            }
            if (arrayList.size() > 1) {
                return this.f83511b.build(arrayList, this.f83513d);
            }
            if (arrayList.size() == 1) {
                return (vwa) arrayList.get(0);
            }
            if (!z) {
                throw new exd.C5511c((Class<?>) cls, (Class<?>) cls2);
            }
            return emptyModelLoader();
        } catch (Throwable th) {
            this.f83512c.clear();
            throw th;
        }
    }

    @efb
    /* JADX INFO: renamed from: c */
    public synchronized List<Class<?>> m22336c(@efb Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C12864b<?, ?> c12864b : this.f83510a) {
            if (!arrayList.contains(c12864b.f83515b) && c12864b.handles(cls)) {
                arrayList.add(c12864b.f83515b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public synchronized <Model, Data> void m22337d(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<? extends Model, ? extends Data> wwaVar) {
        add(cls, cls2, wwaVar, false);
    }

    @efb
    /* JADX INFO: renamed from: e */
    public synchronized <Model, Data> List<wwa<? extends Model, ? extends Data>> m22338e(@efb Class<Model> cls, @efb Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<C12864b<?, ?>> it = this.f83510a.iterator();
        while (it.hasNext()) {
            C12864b<?, ?> next = it.next();
            if (next.handles(cls, cls2)) {
                it.remove();
                arrayList.add(getFactory(next));
            }
        }
        return arrayList;
    }

    @efb
    /* JADX INFO: renamed from: f */
    public synchronized <Model, Data> List<wwa<? extends Model, ? extends Data>> m22339f(@efb Class<Model> cls, @efb Class<Data> cls2, @efb wwa<? extends Model, ? extends Data> wwaVar) {
        List<wwa<? extends Model, ? extends Data>> listM22338e;
        listM22338e = m22338e(cls, cls2);
        m22334a(cls, cls2, wwaVar);
        return listM22338e;
    }

    @fdi
    public t2b(@efb p4d.InterfaceC10791a<List<Throwable>> interfaceC10791a, @efb C12865c c12865c) {
        this.f83510a = new ArrayList();
        this.f83512c = new HashSet();
        this.f83513d = interfaceC10791a;
        this.f83511b = c12865c;
    }

    @efb
    private <Model, Data> vwa<Model, Data> build(@efb C12864b<?, ?> c12864b) {
        return (vwa) t7d.checkNotNull(c12864b.f83516c.build(this));
    }
}
