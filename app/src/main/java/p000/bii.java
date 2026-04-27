package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class bii<T> extends WeakReference<y8i> {

    /* JADX INFO: renamed from: a */
    public final btb<T> f13837a;

    /* JADX INFO: renamed from: b */
    public final int f13838b;

    /* JADX INFO: renamed from: c */
    public T f13839c;

    public bii(y8i y8iVar, int i, btb<T> btbVar, ReferenceQueue<y8i> referenceQueue) {
        super(y8iVar, referenceQueue);
        this.f13838b = i;
        this.f13837a = btbVar;
    }

    @hib
    /* JADX INFO: renamed from: a */
    public y8i m3191a() {
        y8i y8iVar = (y8i) get();
        if (y8iVar == null) {
            unregister();
        }
        return y8iVar;
    }

    public T getTarget() {
        return this.f13839c;
    }

    public void setLifecycleOwner(g59 g59Var) {
        this.f13837a.setLifecycleOwner(g59Var);
    }

    public void setTarget(T t) {
        unregister();
        this.f13839c = t;
        if (t != null) {
            this.f13837a.addListener(t);
        }
    }

    public boolean unregister() {
        boolean z;
        T t = this.f13839c;
        if (t != null) {
            this.f13837a.removeListener(t);
            z = true;
        } else {
            z = false;
        }
        this.f13839c = null;
        return z;
    }
}
