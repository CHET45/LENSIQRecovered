package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public abstract class vqc<K, V, T> implements Iterator<T>, uo8 {

    /* JADX INFO: renamed from: d */
    public static final int f91997d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final pih<K, V, T>[] f91998a;

    /* JADX INFO: renamed from: b */
    public int f91999b;

    /* JADX INFO: renamed from: c */
    public boolean f92000c = true;

    public vqc(@yfb nih<K, V> nihVar, @yfb pih<K, V, T>[] pihVarArr) {
        this.f91998a = pihVarArr;
        pihVarArr[0].reset(nihVar.getBuffer$runtime_release(), nihVar.entryCount$runtime_release() * 2);
        this.f91999b = 0;
        ensureNextEntryIsReady();
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void ensureNextEntryIsReady() {
        if (this.f91998a[this.f91999b].hasNextKey()) {
            return;
        }
        for (int i = this.f91999b; -1 < i; i--) {
            int iMoveToNextNodeWithData = moveToNextNodeWithData(i);
            if (iMoveToNextNodeWithData == -1 && this.f91998a[i].hasNextNode()) {
                this.f91998a[i].moveToNextNode();
                iMoveToNextNodeWithData = moveToNextNodeWithData(i);
            }
            if (iMoveToNextNodeWithData != -1) {
                this.f91999b = iMoveToNextNodeWithData;
                return;
            }
            if (i > 0) {
                this.f91998a[i - 1].moveToNextNode();
            }
            this.f91998a[i].reset(nih.f64689e.getEMPTY$runtime_release().getBuffer$runtime_release(), 0);
        }
        this.f92000c = false;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }

    private final int moveToNextNodeWithData(int i) {
        if (this.f91998a[i].hasNextKey()) {
            return i;
        }
        if (!this.f91998a[i].hasNextNode()) {
            return -1;
        }
        nih<? extends K, ? extends V> nihVarCurrentNode = this.f91998a[i].currentNode();
        if (i == 6) {
            this.f91998a[i + 1].reset(nihVarCurrentNode.getBuffer$runtime_release(), nihVarCurrentNode.getBuffer$runtime_release().length);
        } else {
            this.f91998a[i + 1].reset(nihVarCurrentNode.getBuffer$runtime_release(), nihVarCurrentNode.entryCount$runtime_release() * 2);
        }
        return moveToNextNodeWithData(i + 1);
    }

    /* JADX INFO: renamed from: a */
    public final K m24123a() {
        checkHasNext();
        return this.f91998a[this.f91999b].currentKey();
    }

    @yfb
    /* JADX INFO: renamed from: b */
    public final pih<K, V, T>[] m24124b() {
        return this.f91998a;
    }

    /* JADX INFO: renamed from: c */
    public final int m24125c() {
        return this.f91999b;
    }

    /* JADX INFO: renamed from: d */
    public final void m24126d(int i) {
        this.f91999b = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f92000c;
    }

    @Override // java.util.Iterator
    public T next() {
        checkHasNext();
        T next = this.f91998a[this.f91999b].next();
        ensureNextEntryIsReady();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
