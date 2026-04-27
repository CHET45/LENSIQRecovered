package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class ywa {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<e2b> f103188a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final x60<e2b, List<Class<?>>> f103189b = new x60<>();

    public void clear() {
        synchronized (this.f103189b) {
            this.f103189b.clear();
        }
    }

    @hib
    public List<Class<?>> get(@efb Class<?> cls, @efb Class<?> cls2, @efb Class<?> cls3) {
        List<Class<?>> list;
        e2b andSet = this.f103188a.getAndSet(null);
        if (andSet == null) {
            andSet = new e2b(cls, cls2, cls3);
        } else {
            andSet.set(cls, cls2, cls3);
        }
        synchronized (this.f103189b) {
            list = this.f103189b.get(andSet);
        }
        this.f103188a.set(andSet);
        return list;
    }

    public void put(@efb Class<?> cls, @efb Class<?> cls2, @efb Class<?> cls3, @efb List<Class<?>> list) {
        synchronized (this.f103189b) {
            this.f103189b.put(new e2b(cls, cls2, cls3), list);
        }
    }
}
