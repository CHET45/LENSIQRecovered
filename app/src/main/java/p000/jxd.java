package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public class jxd<E> extends ww7<E> {

    /* JADX INFO: renamed from: c */
    public final ax7<E> f52197c;

    /* JADX INFO: renamed from: d */
    public final kx7<? extends E> f52198d;

    public jxd(ax7<E> delegate, kx7<? extends E> delegateList) {
        this.f52197c = delegate;
        this.f52198d = delegateList;
    }

    @Override // p000.kx7, p000.ax7
    @jd7
    /* JADX INFO: renamed from: a */
    public int mo2718a(Object[] dst, int offset) {
        return this.f52198d.mo2718a(dst, offset);
    }

    @Override // p000.ax7
    @wx1
    /* JADX INFO: renamed from: b */
    public Object[] mo2719b() {
        return this.f52198d.mo2719b();
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: c */
    public int mo2720c() {
        return this.f52198d.mo2720c();
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: d */
    public int mo2721d() {
        return this.f52198d.mo2721d();
    }

    @Override // java.util.List
    public E get(int index) {
        return this.f52198d.get(index);
    }

    @Override // p000.ww7
    /* JADX INFO: renamed from: h */
    public ax7<E> mo13535h() {
        return this.f52197c;
    }

    /* JADX INFO: renamed from: i */
    public kx7<? extends E> m14371i() {
        return this.f52198d;
    }

    @Override // p000.kx7, java.util.List
    public tuh<E> listIterator(int i) {
        return this.f52198d.listIterator(i);
    }

    public jxd(ax7<E> delegate, Object[] array) {
        this(delegate, kx7.m15108e(array));
    }

    public jxd(ax7<E> delegate, Object[] array, int size) {
        this(delegate, kx7.m15109f(array, size));
    }
}
