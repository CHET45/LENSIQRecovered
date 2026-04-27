package p000;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class exf<V> {

    /* JADX INFO: renamed from: a */
    public int f34419a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<V> f34420b;

    /* JADX INFO: renamed from: c */
    public final ru2<V> f34421c;

    public exf() {
        this(new ru2() { // from class: cxf
            @Override // p000.ru2
            public final void accept(Object obj) {
                exf.lambda$new$0(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Object obj) {
    }

    public void appendSpan(int i, V v) {
        if (this.f34419a == -1) {
            u80.checkState(this.f34420b.size() == 0);
            this.f34419a = 0;
        }
        if (this.f34420b.size() > 0) {
            SparseArray<V> sparseArray = this.f34420b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            u80.checkArgument(i >= iKeyAt);
            if (iKeyAt == i) {
                ru2<V> ru2Var = this.f34421c;
                SparseArray<V> sparseArray2 = this.f34420b;
                ru2Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f34420b.append(i, v);
    }

    public void clear() {
        for (int i = 0; i < this.f34420b.size(); i++) {
            this.f34421c.accept(this.f34420b.valueAt(i));
        }
        this.f34419a = -1;
        this.f34420b.clear();
    }

    public void discardFrom(int i) {
        for (int size = this.f34420b.size() - 1; size >= 0 && i < this.f34420b.keyAt(size); size--) {
            this.f34421c.accept(this.f34420b.valueAt(size));
            this.f34420b.removeAt(size);
        }
        this.f34419a = this.f34420b.size() > 0 ? Math.min(this.f34419a, this.f34420b.size() - 1) : -1;
    }

    public void discardTo(int i) {
        int i2 = 0;
        while (i2 < this.f34420b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f34420b.keyAt(i3)) {
                return;
            }
            this.f34421c.accept(this.f34420b.valueAt(i2));
            this.f34420b.removeAt(i2);
            int i4 = this.f34419a;
            if (i4 > 0) {
                this.f34419a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public V get(int i) {
        if (this.f34419a == -1) {
            this.f34419a = 0;
        }
        while (true) {
            int i2 = this.f34419a;
            if (i2 <= 0 || i >= this.f34420b.keyAt(i2)) {
                break;
            }
            this.f34419a--;
        }
        while (this.f34419a < this.f34420b.size() - 1 && i >= this.f34420b.keyAt(this.f34419a + 1)) {
            this.f34419a++;
        }
        return this.f34420b.valueAt(this.f34419a);
    }

    public V getEndValue() {
        return this.f34420b.valueAt(r0.size() - 1);
    }

    public boolean isEmpty() {
        return this.f34420b.size() == 0;
    }

    public exf(ru2<V> ru2Var) {
        this.f34420b = new SparseArray<>();
        this.f34421c = ru2Var;
        this.f34419a = -1;
    }
}
