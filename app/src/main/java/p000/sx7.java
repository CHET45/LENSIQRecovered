package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class sx7<K, V> extends p08<K> {

    /* JADX INFO: renamed from: f */
    public final ox7<K, V> f83198f;

    /* JADX INFO: renamed from: sx7$a */
    @jd7
    @yg8
    public static class C12821a<K> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final ox7<K, ?> f83199a;

        public C12821a(ox7<K, ?> map) {
            this.f83199a = map;
        }

        public Object readResolve() {
            return this.f83199a.keySet();
        }
    }

    public sx7(ox7<K, V> map) {
        this.f83198f = map;
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object object) {
        return this.f83198f.containsKey(object);
    }

    @Override // p000.p08
    public K get(int index) {
        return this.f83198f.entrySet().asList().get(index).getKey();
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f83198f.size();
    }

    @Override // p000.dy7, p000.ax7
    @jd7
    public Object writeReplace() {
        return new C12821a(this.f83198f);
    }

    @Override // p000.p08, p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<K> iterator() {
        return this.f83198f.mo11218i();
    }
}
