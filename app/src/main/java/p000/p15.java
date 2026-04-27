package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class p15 {

    /* JADX INFO: renamed from: a */
    public final List<C10746a<?>> f69385a = new ArrayList();

    /* JADX INFO: renamed from: p15$a */
    public static final class C10746a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f69386a;

        /* JADX INFO: renamed from: b */
        public final n15<T> f69387b;

        public C10746a(@efb Class<T> cls, @efb n15<T> n15Var) {
            this.f69386a = cls;
            this.f69387b = n15Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m19143a(@efb Class<?> cls) {
            return this.f69386a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void append(@efb Class<T> cls, @efb n15<T> n15Var) {
        this.f69385a.add(new C10746a<>(cls, n15Var));
    }

    @hib
    public synchronized <T> n15<T> getEncoder(@efb Class<T> cls) {
        for (C10746a<?> c10746a : this.f69385a) {
            if (c10746a.m19143a(cls)) {
                return (n15<T>) c10746a.f69387b;
            }
        }
        return null;
    }

    public synchronized <T> void prepend(@efb Class<T> cls, @efb n15<T> n15Var) {
        this.f69385a.add(0, new C10746a<>(cls, n15Var));
    }
}
