package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public class xqc<K, V, T> extends vqc<K, V, T> implements Iterator<T>, xo8 {

    /* JADX INFO: renamed from: F */
    public static final int f99001F = 8;

    /* JADX INFO: renamed from: C */
    public int f99002C;

    /* JADX INFO: renamed from: e */
    @yfb
    public final wqc<K, V> f99003e;

    /* JADX INFO: renamed from: f */
    @gib
    public K f99004f;

    /* JADX INFO: renamed from: m */
    public boolean f99005m;

    public xqc(@yfb wqc<K, V> wqcVar, @yfb pih<K, V, T>[] pihVarArr) {
        super(wqcVar.getNode$runtime_release(), pihVarArr);
        this.f99003e = wqcVar;
        this.f99002C = wqcVar.getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.f99003e.getModCount$runtime_release() != this.f99002C) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.f99005m) {
            throw new IllegalStateException();
        }
    }

    private final void resetPath(int i, nih<?, ?> nihVar, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            m24124b()[i2].reset(nihVar.getBuffer$runtime_release(), nihVar.getBuffer$runtime_release().length, 0);
            while (!md8.areEqual(m24124b()[i2].currentKey(), k)) {
                m24124b()[i2].moveToNextKey();
            }
            m24126d(i2);
            return;
        }
        int iIndexSegment = 1 << uih.indexSegment(i, i3);
        if (nihVar.hasEntryAt$runtime_release(iIndexSegment)) {
            m24124b()[i2].reset(nihVar.getBuffer$runtime_release(), nihVar.entryCount$runtime_release() * 2, nihVar.entryKeyIndex$runtime_release(iIndexSegment));
            m24126d(i2);
        } else {
            int iNodeIndex$runtime_release = nihVar.nodeIndex$runtime_release(iIndexSegment);
            nih<?, ?> nihVarNodeAtIndex$runtime_release = nihVar.nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            m24124b()[i2].reset(nihVar.getBuffer$runtime_release(), nihVar.entryCount$runtime_release() * 2, iNodeIndex$runtime_release);
            resetPath(i, nihVarNodeAtIndex$runtime_release, k, i2 + 1);
        }
    }

    @Override // p000.vqc, java.util.Iterator
    public T next() {
        checkForComodification();
        this.f99004f = m24123a();
        this.f99005m = true;
        return (T) super.next();
    }

    @Override // p000.vqc, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            K kM24123a = m24123a();
            qlh.asMutableMap(this.f99003e).remove(this.f99004f);
            resetPath(kM24123a != null ? kM24123a.hashCode() : 0, this.f99003e.getNode$runtime_release(), kM24123a, 0);
        } else {
            qlh.asMutableMap(this.f99003e).remove(this.f99004f);
        }
        this.f99004f = null;
        this.f99005m = false;
        this.f99002C = this.f99003e.getModCount$runtime_release();
    }

    public final void setValue(K k, V v) {
        if (this.f99003e.containsKey(k)) {
            if (hasNext()) {
                K kM24123a = m24123a();
                this.f99003e.put(k, v);
                resetPath(kM24123a != null ? kM24123a.hashCode() : 0, this.f99003e.getNode$runtime_release(), kM24123a, 0);
            } else {
                this.f99003e.put(k, v);
            }
            this.f99002C = this.f99003e.getModCount$runtime_release();
        }
    }
}
