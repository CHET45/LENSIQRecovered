package p000;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@fgb
public abstract class cz7<T> {

    /* JADX INFO: renamed from: a */
    public final Set<T> f28075a = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: a */
    public abstract void mo8796a();

    public final boolean anyObjectInUse(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f28075a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo8797b();

    public final boolean isInUse() {
        return !this.f28075a.isEmpty();
    }

    public final void updateObjectInUse(T t, boolean z) {
        int size = this.f28075a.size();
        if (z) {
            this.f28075a.add(t);
            if (size == 0) {
                mo8796a();
                return;
            }
            return;
        }
        if (this.f28075a.remove(t) && size == 1) {
            mo8797b();
        }
    }
}
