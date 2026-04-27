package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ksc<E> extends jsc<E> implements Iterator<E>, xo8 {

    /* JADX INFO: renamed from: F */
    public static final int f55234F = 8;

    /* JADX INFO: renamed from: C */
    public int f55235C;

    /* JADX INFO: renamed from: e */
    @yfb
    public final isc<E> f55236e;

    /* JADX INFO: renamed from: f */
    @gib
    public E f55237f;

    /* JADX INFO: renamed from: m */
    public boolean f55238m;

    public ksc(@yfb isc<E> iscVar) {
        super(iscVar.getFirstElement$runtime_release(), iscVar.getHashMapBuilder$runtime_release());
        this.f55236e = iscVar;
        this.f55235C = iscVar.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.f55236e.getHashMapBuilder$runtime_release().getModCount$runtime_release() != this.f55235C) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.f55238m) {
            throw new IllegalStateException();
        }
    }

    @Override // p000.jsc, java.util.Iterator
    public E next() {
        checkForComodification();
        E e = (E) super.next();
        this.f55237f = e;
        this.f55238m = true;
        return e;
    }

    @Override // p000.jsc, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        qlh.asMutableCollection(this.f55236e).remove(this.f55237f);
        this.f55237f = null;
        this.f55238m = false;
        this.f55235C = this.f55236e.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        setIndex$runtime_release(getIndex$runtime_release() - 1);
    }
}
