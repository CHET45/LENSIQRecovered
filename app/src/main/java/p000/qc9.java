package p000;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class qc9 {

    /* JADX INFO: renamed from: c */
    public static final pc9<?, ?, ?> f73955c = new pc9<>(Object.class, Object.class, Object.class, Collections.singletonList(new gl3(Object.class, Object.class, Object.class, Collections.emptyList(), new gth(), null)), null);

    /* JADX INFO: renamed from: a */
    public final x60<e2b, pc9<?, ?, ?>> f73956a = new x60<>();

    /* JADX INFO: renamed from: b */
    public final AtomicReference<e2b> f73957b = new AtomicReference<>();

    private e2b getKey(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        e2b andSet = this.f73957b.getAndSet(null);
        if (andSet == null) {
            andSet = new e2b();
        }
        andSet.set(cls, cls2, cls3);
        return andSet;
    }

    @hib
    public <Data, TResource, Transcode> pc9<Data, TResource, Transcode> get(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        pc9<Data, TResource, Transcode> pc9Var;
        e2b key = getKey(cls, cls2, cls3);
        synchronized (this.f73956a) {
            pc9Var = (pc9) this.f73956a.get(key);
        }
        this.f73957b.set(key);
        return pc9Var;
    }

    public boolean isEmptyLoadPath(@hib pc9<?, ?, ?> pc9Var) {
        return f73955c.equals(pc9Var);
    }

    public void put(Class<?> cls, Class<?> cls2, Class<?> cls3, @hib pc9<?, ?, ?> pc9Var) {
        synchronized (this.f73956a) {
            x60<e2b, pc9<?, ?, ?>> x60Var = this.f73956a;
            e2b e2bVar = new e2b(cls, cls2, cls3);
            if (pc9Var == null) {
                pc9Var = f73955c;
            }
            x60Var.put(e2bVar, pc9Var);
        }
    }
}
