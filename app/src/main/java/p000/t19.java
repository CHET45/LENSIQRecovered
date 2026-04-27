package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class t19<T> implements eid<Set<T>> {

    /* JADX INFO: renamed from: b */
    public volatile Set<T> f83354b = null;

    /* JADX INFO: renamed from: a */
    public volatile Set<eid<T>> f83353a = Collections.newSetFromMap(new ConcurrentHashMap());

    public t19(Collection<eid<T>> collection) {
        this.f83353a.addAll(collection);
    }

    /* JADX INFO: renamed from: b */
    public static t19<?> m22317b(Collection<eid<?>> collection) {
        return new t19<>((Set) collection);
    }

    private synchronized void updateSet() {
        try {
            Iterator<eid<T>> it = this.f83353a.iterator();
            while (it.hasNext()) {
                this.f83354b.add(it.next().get());
            }
            this.f83353a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m22318a(eid<T> eidVar) {
        try {
            if (this.f83354b == null) {
                this.f83353a.add(eidVar);
            } else {
                this.f83354b.add(eidVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.eid
    public Set<T> get() {
        if (this.f83354b == null) {
            synchronized (this) {
                try {
                    if (this.f83354b == null) {
                        this.f83354b = Collections.newSetFromMap(new ConcurrentHashMap());
                        updateSet();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f83354b);
    }
}
