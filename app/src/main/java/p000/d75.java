package p000;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class d75<E> extends ct6<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final Queue<E> f28620a;

    /* JADX INFO: renamed from: b */
    @gdi
    public final int f28621b;

    private d75(int maxSize) {
        v7d.checkArgument(maxSize >= 0, "maxSize (%s) must >= 0", maxSize);
        this.f28620a = new ArrayDeque(maxSize);
        this.f28621b = maxSize;
    }

    public static <E> d75<E> create(int maxSize) {
        return new d75<>(maxSize);
    }

    @Override // p000.lr6, java.util.Collection, java.util.Queue
    @op1
    public boolean add(E e) {
        v7d.checkNotNull(e);
        if (this.f28621b == 0) {
            return true;
        }
        if (size() == this.f28621b) {
            this.f28620a.remove();
        }
        this.f28620a.add(e);
        return true;
    }

    @Override // p000.lr6, java.util.Collection
    @op1
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.f28621b) {
            return mo16320b(collection);
        }
        clear();
        return vg8.addAll(this, vg8.skip(collection, size - this.f28621b));
    }

    @Override // p000.ct6, p000.lr6, p000.zs6
    /* JADX INFO: renamed from: m */
    public Queue<E> mo8967m() {
        return this.f28620a;
    }

    @Override // p000.ct6, java.util.Queue
    @op1
    public boolean offer(E e) {
        return add(e);
    }

    public int remainingCapacity() {
        return this.f28621b - size();
    }

    @Override // p000.lr6, java.util.Collection
    @yg8
    public Object[] toArray() {
        return super.toArray();
    }
}
