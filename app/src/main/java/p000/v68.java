package p000;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class v68<E> {

    /* JADX INFO: renamed from: b */
    public static final int f90069b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final SparseArray<E> f90070a;

    private v68(SparseArray<E> sparseArray) {
        this.f90070a = sparseArray;
    }

    public final void clear() {
        this.f90070a.clear();
    }

    public final boolean contains(int i) {
        return this.f90070a.indexOfKey(i) >= 0;
    }

    @gib
    public final E get(int i) {
        return this.f90070a.get(i);
    }

    public final int getSize() {
        return this.f90070a.size();
    }

    public final void remove(int i) {
        this.f90070a.remove(i);
    }

    public final void set(int i, E e) {
        this.f90070a.put(i, e);
    }

    public final E get(int i, E e) {
        return this.f90070a.get(i, e);
    }

    public v68(int i) {
        this(new SparseArray(i));
    }

    public /* synthetic */ v68(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
