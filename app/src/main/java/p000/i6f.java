package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i6f<T> {

    /* JADX INFO: renamed from: b */
    public static final String f45863b = "Set contributions cannot be null";

    /* JADX INFO: renamed from: a */
    public final List<T> f45864a;

    private i6f(int i) {
        this.f45864a = new ArrayList(i);
    }

    public static <T> i6f<T> newSetBuilder(int i) {
        return new i6f<>(i);
    }

    public i6f<T> add(T t) {
        this.f45864a.add((T) s7d.checkNotNull(t, f45863b));
        return this;
    }

    public i6f<T> addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            s7d.checkNotNull(it.next(), f45863b);
        }
        this.f45864a.addAll(collection);
        return this;
    }

    public Set<T> build() {
        return this.f45864a.isEmpty() ? Collections.emptySet() : this.f45864a.size() == 1 ? Collections.singleton(this.f45864a.get(0)) : Collections.unmodifiableSet(new HashSet(this.f45864a));
    }
}
