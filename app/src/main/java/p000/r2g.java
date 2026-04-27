package p000;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,496:1\n1#2:497\n*E\n"})
public final class r2g<T> implements ListIterator<T>, zo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ytf<T> f76906a;

    /* JADX INFO: renamed from: b */
    public int f76907b;

    /* JADX INFO: renamed from: c */
    public int f76908c = -1;

    /* JADX INFO: renamed from: d */
    public int f76909d;

    public r2g(@yfb ytf<T> ytfVar, int i) {
        this.f76906a = ytfVar;
        this.f76907b = i - 1;
        this.f76909d = ytfVar.getStructure$runtime_release();
    }

    private final void validateModification() {
        if (this.f76906a.getStructure$runtime_release() != this.f76909d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        validateModification();
        this.f76906a.add(this.f76907b + 1, t);
        this.f76908c = -1;
        this.f76907b++;
        this.f76909d = this.f76906a.getStructure$runtime_release();
    }

    @yfb
    public final ytf<T> getList() {
        return this.f76906a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f76907b < this.f76906a.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f76907b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        validateModification();
        int i = this.f76907b + 1;
        this.f76908c = i;
        ztf.validateRange(i, this.f76906a.size());
        T t = this.f76906a.get(i);
        this.f76907b = i;
        return t;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f76907b + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        validateModification();
        ztf.validateRange(this.f76907b, this.f76906a.size());
        int i = this.f76907b;
        this.f76908c = i;
        this.f76907b--;
        return this.f76906a.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f76907b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        validateModification();
        this.f76906a.remove(this.f76907b);
        this.f76907b--;
        this.f76908c = -1;
        this.f76909d = this.f76906a.getStructure$runtime_release();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        validateModification();
        int i = this.f76908c;
        if (i < 0) {
            ztf.invalidIteratorSet();
            throw new us8();
        }
        this.f76906a.set(i, t);
        this.f76909d = this.f76906a.getStructure$runtime_release();
    }
}
