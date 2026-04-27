package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public abstract class p08<E> extends dy7<E> {

    /* JADX INFO: renamed from: p08$a */
    public class C10739a extends kx7<E> {
        public C10739a() {
        }

        @Override // java.util.List
        public E get(int i) {
            return (E) p08.this.get(i);
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return p08.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return p08.this.size();
        }
    }

    @Override // p000.ax7
    @jd7
    /* JADX INFO: renamed from: a */
    public int mo2718a(Object[] dst, int offset) {
        return asList().mo2718a(dst, offset);
    }

    public abstract E get(int index);

    @Override // p000.dy7
    /* JADX INFO: renamed from: h */
    public kx7<E> mo9582h() {
        return new C10739a();
    }

    @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<E> iterator() {
        return asList().iterator();
    }
}
