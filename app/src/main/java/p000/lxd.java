package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public class lxd<E> extends kx7<E> {

    /* JADX INFO: renamed from: e */
    public static final kx7<Object> f59164e = new lxd(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    @gdi
    public final transient Object[] f59165c;

    /* JADX INFO: renamed from: d */
    public final transient int f59166d;

    public lxd(Object[] array, int size) {
        this.f59165c = array;
        this.f59166d = size;
    }

    @Override // p000.kx7, p000.ax7
    /* JADX INFO: renamed from: a */
    public int mo2718a(Object[] dst, int dstOff) {
        System.arraycopy(this.f59165c, 0, dst, dstOff, this.f59166d);
        return dstOff + this.f59166d;
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: b */
    public Object[] mo2719b() {
        return this.f59165c;
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: c */
    public int mo2720c() {
        return this.f59166d;
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: d */
    public int mo2721d() {
        return 0;
    }

    @Override // java.util.List
    public E get(int i) {
        v7d.checkElementIndex(i, this.f59166d);
        E e = (E) this.f59165c[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f59166d;
    }
}
