package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public class xrc<K, V> implements Iterator<x79<V>>, xo8 {

    /* JADX INFO: renamed from: m */
    public static final int f99059m = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public Object f99060a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final src<K, V> f99061b;

    /* JADX INFO: renamed from: c */
    @gib
    public Object f99062c = b25.f12448a;

    /* JADX INFO: renamed from: d */
    public boolean f99063d;

    /* JADX INFO: renamed from: e */
    public int f99064e;

    /* JADX INFO: renamed from: f */
    public int f99065f;

    public xrc(@gib Object obj, @yfb src<K, V> srcVar) {
        this.f99060a = obj;
        this.f99061b = srcVar;
        this.f99064e = srcVar.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.f99061b.getHashMapBuilder$runtime_release().getModCount$runtime_release() != this.f99064e) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.f99063d) {
            throw new IllegalStateException();
        }
    }

    @yfb
    public final src<K, V> getBuilder$runtime_release() {
        return this.f99061b;
    }

    public final int getIndex$runtime_release() {
        return this.f99065f;
    }

    @gib
    public final Object getLastIteratedKey$runtime_release() {
        return this.f99062c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99065f < this.f99061b.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        qlh.asMutableMap(this.f99061b).remove(this.f99062c);
        this.f99062c = null;
        this.f99063d = false;
        this.f99064e = this.f99061b.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        this.f99065f--;
    }

    public final void setIndex$runtime_release(int i) {
        this.f99065f = i;
    }

    public final void setLastIteratedKey$runtime_release(@gib Object obj) {
        this.f99062c = obj;
    }

    @Override // java.util.Iterator
    @yfb
    public x79<V> next() {
        checkForComodification();
        checkHasNext();
        this.f99062c = this.f99060a;
        this.f99063d = true;
        this.f99065f++;
        x79<V> x79Var = this.f99061b.getHashMapBuilder$runtime_release().get(this.f99060a);
        if (x79Var != null) {
            x79<V> x79Var2 = x79Var;
            this.f99060a = x79Var2.getNext();
            return x79Var2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f99060a + ") has changed after it was added to the persistent map.");
    }
}
