package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public abstract class b08<T> implements Iterator<T>, xo8 {

    /* JADX INFO: renamed from: a */
    public int f12323a;

    /* JADX INFO: renamed from: b */
    public int f12324b;

    /* JADX INFO: renamed from: c */
    public boolean f12325c;

    public b08(int i) {
        this.f12323a = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo2782a(int i);

    /* JADX INFO: renamed from: b */
    public abstract void mo2783b(int i);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f12324b < this.f12323a;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tMo2782a = mo2782a(this.f12324b);
        this.f12324b++;
        this.f12325c = true;
        return tMo2782a;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f12325c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f12324b - 1;
        this.f12324b = i;
        mo2783b(i);
        this.f12323a--;
        this.f12325c = false;
    }
}
