package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zaf<T> extends wr0<T> {

    /* JADX INFO: renamed from: a */
    public final Iterable<yv9<? super T>> f104642a;

    public zaf(Iterable<yv9<? super T>> iterable) {
        this.f104642a = iterable;
    }

    /* JADX INFO: renamed from: a */
    public boolean m26633a(Object obj, boolean z) {
        Iterator<yv9<? super T>> it = this.f104642a.iterator();
        while (it.hasNext()) {
            if (it.next().matches(obj) == z) {
                return z;
            }
        }
        return !z;
    }

    @Override // p000.ixe
    public abstract void describeTo(i74 i74Var);

    public void describeTo(i74 i74Var, String str) {
        i74Var.appendList(c0b.f15433c, C2473f.f17566z + str + C2473f.f17566z, c0b.f15434d, this.f104642a);
    }

    @Override // p000.yv9
    public abstract boolean matches(Object obj);
}
