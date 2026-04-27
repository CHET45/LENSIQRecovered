package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class kxe<T> implements Iterator<ixe> {

    /* JADX INFO: renamed from: a */
    public Iterator<T> f55597a;

    public kxe(Iterator<T> it) {
        this.f55597a = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f55597a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f55597a.remove();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public ixe next() {
        return new jxe(this.f55597a.next());
    }
}
