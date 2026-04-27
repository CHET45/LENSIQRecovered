package p000;

import com.blankj.utilcode.util.C2473f;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class h6b<T> {

    /* JADX INFO: renamed from: a */
    @hib
    public T f42504a;

    /* JADX INFO: renamed from: b */
    @hib
    public T f42505b;

    private static boolean objectsEqual(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof tcc)) {
            return false;
        }
        tcc tccVar = (tcc) obj;
        return objectsEqual(tccVar.f84271a, this.f42504a) && objectsEqual(tccVar.f84272b, this.f42505b);
    }

    public int hashCode() {
        T t = this.f42504a;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f42505b;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public void set(T t, T t2) {
        this.f42504a = t;
        this.f42505b = t2;
    }

    public String toString() {
        return "Pair{" + this.f42504a + C2473f.f17566z + this.f42505b + "}";
    }
}
