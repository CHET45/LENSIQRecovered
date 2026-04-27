package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class jng implements e59 {

    /* JADX INFO: renamed from: a */
    public final Set<jmg<?>> f51314a = Collections.newSetFromMap(new WeakHashMap());

    public void clear() {
        this.f51314a.clear();
    }

    @efb
    public List<jmg<?>> getAll() {
        return v0i.getSnapshot(this.f51314a);
    }

    @Override // p000.e59
    public void onDestroy() {
        Iterator it = v0i.getSnapshot(this.f51314a).iterator();
        while (it.hasNext()) {
            ((jmg) it.next()).onDestroy();
        }
    }

    @Override // p000.e59
    public void onStart() {
        Iterator it = v0i.getSnapshot(this.f51314a).iterator();
        while (it.hasNext()) {
            ((jmg) it.next()).onStart();
        }
    }

    @Override // p000.e59
    public void onStop() {
        Iterator it = v0i.getSnapshot(this.f51314a).iterator();
        while (it.hasNext()) {
            ((jmg) it.next()).onStop();
        }
    }

    public void track(@efb jmg<?> jmgVar) {
        this.f51314a.add(jmgVar);
    }

    public void untrack(@efb jmg<?> jmgVar) {
        this.f51314a.remove(jmgVar);
    }
}
