package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
public class mh9<E> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61013a = AtomicReferenceFieldUpdater.newUpdater(mh9.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public mh9(boolean z) {
        this._cur$volatile = new nh9(8, z);
    }

    private final /* synthetic */ Object get_cur$volatile() {
        return this._cur$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_cur$volatile(Object obj) {
        this._cur$volatile = obj;
    }

    public final boolean addLast(@yfb E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61013a;
        while (true) {
            nh9 nh9Var = (nh9) atomicReferenceFieldUpdater.get(this);
            int iAddLast = nh9Var.addLast(e);
            if (iAddLast == 0) {
                return true;
            }
            if (iAddLast == 1) {
                C0051a4.m134a(f61013a, this, nh9Var, nh9Var.next());
            } else if (iAddLast == 2) {
                return false;
            }
        }
    }

    public final void close() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61013a;
        while (true) {
            nh9 nh9Var = (nh9) atomicReferenceFieldUpdater.get(this);
            if (nh9Var.close()) {
                return;
            } else {
                C0051a4.m134a(f61013a, this, nh9Var, nh9Var.next());
            }
        }
    }

    public final int getSize() {
        return ((nh9) f61013a.get(this)).getSize();
    }

    public final boolean isClosed() {
        return ((nh9) f61013a.get(this)).isClosed();
    }

    public final boolean isEmpty() {
        return ((nh9) f61013a.get(this)).isEmpty();
    }

    @yfb
    public final <R> List<R> map(@yfb qy6<? super E, ? extends R> qy6Var) {
        return ((nh9) f61013a.get(this)).map(qy6Var);
    }

    @gib
    public final E removeFirstOrNull() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f61013a;
        while (true) {
            nh9 nh9Var = (nh9) atomicReferenceFieldUpdater.get(this);
            E e = (E) nh9Var.removeFirstOrNull();
            if (e != nh9.f64537t) {
                return e;
            }
            C0051a4.m134a(f61013a, this, nh9Var, nh9Var.next());
        }
    }
}
