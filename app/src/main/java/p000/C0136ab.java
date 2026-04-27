package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ab */
/* JADX INFO: loaded from: classes3.dex */
public class C0136ab implements u49 {

    /* JADX INFO: renamed from: a */
    public final Set<e59> f878a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public boolean f879b;

    /* JADX INFO: renamed from: c */
    public boolean f880c;

    /* JADX INFO: renamed from: a */
    public void m275a() {
        this.f880c = true;
        Iterator it = v0i.getSnapshot(this.f878a).iterator();
        while (it.hasNext()) {
            ((e59) it.next()).onDestroy();
        }
    }

    @Override // p000.u49
    public void addListener(@efb e59 e59Var) {
        this.f878a.add(e59Var);
        if (this.f880c) {
            e59Var.onDestroy();
        } else if (this.f879b) {
            e59Var.onStart();
        } else {
            e59Var.onStop();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m276b() {
        this.f879b = true;
        Iterator it = v0i.getSnapshot(this.f878a).iterator();
        while (it.hasNext()) {
            ((e59) it.next()).onStart();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m277c() {
        this.f879b = false;
        Iterator it = v0i.getSnapshot(this.f878a).iterator();
        while (it.hasNext()) {
            ((e59) it.next()).onStop();
        }
    }

    @Override // p000.u49
    public void removeListener(@efb e59 e59Var) {
        this.f878a.remove(e59Var);
    }
}
