package p000;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class fxf<V> {

    /* JADX INFO: renamed from: a */
    public int f38006a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<V> f38007b;

    /* JADX INFO: renamed from: c */
    public final qu2<V> f38008c;

    public fxf() {
        this(new qu2() { // from class: dxf
            @Override // p000.qu2
            public final void accept(Object obj) {
                fxf.lambda$new$0(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Object obj) {
    }

    public void appendSpan(int i, V v) {
        if (this.f38006a == -1) {
            v80.checkState(this.f38007b.size() == 0);
            this.f38006a = 0;
        }
        if (this.f38007b.size() > 0) {
            SparseArray<V> sparseArray = this.f38007b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            v80.checkArgument(i >= iKeyAt);
            if (iKeyAt == i) {
                qu2<V> qu2Var = this.f38008c;
                SparseArray<V> sparseArray2 = this.f38007b;
                qu2Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f38007b.append(i, v);
    }

    public void clear() {
        for (int i = 0; i < this.f38007b.size(); i++) {
            this.f38008c.accept(this.f38007b.valueAt(i));
        }
        this.f38006a = -1;
        this.f38007b.clear();
    }

    public void discardFrom(int i) {
        for (int size = this.f38007b.size() - 1; size >= 0 && i < this.f38007b.keyAt(size); size--) {
            this.f38008c.accept(this.f38007b.valueAt(size));
            this.f38007b.removeAt(size);
        }
        this.f38006a = this.f38007b.size() > 0 ? Math.min(this.f38006a, this.f38007b.size() - 1) : -1;
    }

    public void discardTo(int i) {
        int i2 = 0;
        while (i2 < this.f38007b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f38007b.keyAt(i3)) {
                return;
            }
            this.f38008c.accept(this.f38007b.valueAt(i2));
            this.f38007b.removeAt(i2);
            int i4 = this.f38006a;
            if (i4 > 0) {
                this.f38006a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public V get(int i) {
        if (this.f38006a == -1) {
            this.f38006a = 0;
        }
        while (true) {
            int i2 = this.f38006a;
            if (i2 <= 0 || i >= this.f38007b.keyAt(i2)) {
                break;
            }
            this.f38006a--;
        }
        while (this.f38006a < this.f38007b.size() - 1 && i >= this.f38007b.keyAt(this.f38006a + 1)) {
            this.f38006a++;
        }
        return this.f38007b.valueAt(this.f38006a);
    }

    public V getEndValue() {
        return this.f38007b.valueAt(r0.size() - 1);
    }

    public boolean isEmpty() {
        return this.f38007b.size() == 0;
    }

    public fxf(qu2<V> qu2Var) {
        this.f38007b = new SparseArray<>();
        this.f38008c = qu2Var;
        this.f38006a = -1;
    }
}
