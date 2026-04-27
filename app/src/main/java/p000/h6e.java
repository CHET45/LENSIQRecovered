package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h6e {

    /* JADX INFO: renamed from: a */
    public final List<C6728a<?>> f42508a = new ArrayList();

    /* JADX INFO: renamed from: h6e$a */
    public static final class C6728a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f42509a;

        /* JADX INFO: renamed from: b */
        public final g6e<T> f42510b;

        public C6728a(@efb Class<T> cls, @efb g6e<T> g6eVar) {
            this.f42509a = cls;
            this.f42510b = g6eVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m12169a(@efb Class<?> cls) {
            return this.f42509a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void append(@efb Class<Z> cls, @efb g6e<Z> g6eVar) {
        this.f42508a.add(new C6728a<>(cls, g6eVar));
    }

    @hib
    public synchronized <Z> g6e<Z> get(@efb Class<Z> cls) {
        int size = this.f42508a.size();
        for (int i = 0; i < size; i++) {
            C6728a<?> c6728a = this.f42508a.get(i);
            if (c6728a.m12169a(cls)) {
                return (g6e<Z>) c6728a.f42510b;
            }
        }
        return null;
    }

    public synchronized <Z> void prepend(@efb Class<Z> cls, @efb g6e<Z> g6eVar) {
        this.f42508a.add(0, new C6728a<>(cls, g6eVar));
    }
}
