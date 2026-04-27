package p000;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i36 {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f45575a;

    public boolean contains(int i) {
        return this.f45575a.get(i);
    }

    public boolean containsAny(int... iArr) {
        for (int i : iArr) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i36)) {
            return false;
        }
        i36 i36Var = (i36) obj;
        if (x0i.f95978a >= 24) {
            return this.f45575a.equals(i36Var.f45575a);
        }
        if (size() != i36Var.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (get(i) != i36Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i) {
        u80.checkIndex(i, 0, size());
        return this.f45575a.keyAt(i);
    }

    public int hashCode() {
        if (x0i.f95978a >= 24) {
            return this.f45575a.hashCode();
        }
        int size = size();
        for (int i = 0; i < size(); i++) {
            size = (size * 31) + get(i);
        }
        return size;
    }

    public int size() {
        return this.f45575a.size();
    }

    /* JADX INFO: renamed from: i36$b */
    public static final class C7126b {

        /* JADX INFO: renamed from: a */
        public final SparseBooleanArray f45576a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b */
        public boolean f45577b;

        @op1
        public C7126b add(int i) {
            u80.checkState(!this.f45577b);
            this.f45576a.append(i, true);
            return this;
        }

        @op1
        public C7126b addAll(int... iArr) {
            for (int i : iArr) {
                add(i);
            }
            return this;
        }

        @op1
        public C7126b addIf(int i, boolean z) {
            return z ? add(i) : this;
        }

        public i36 build() {
            u80.checkState(!this.f45577b);
            this.f45577b = true;
            return new i36(this.f45576a);
        }

        @op1
        public C7126b remove(int i) {
            u80.checkState(!this.f45577b);
            this.f45576a.delete(i);
            return this;
        }

        @op1
        public C7126b removeAll(int... iArr) {
            for (int i : iArr) {
                remove(i);
            }
            return this;
        }

        @op1
        public C7126b removeIf(int i, boolean z) {
            return z ? remove(i) : this;
        }

        @op1
        public C7126b addAll(i36 i36Var) {
            for (int i = 0; i < i36Var.size(); i++) {
                add(i36Var.get(i));
            }
            return this;
        }
    }

    private i36(SparseBooleanArray sparseBooleanArray) {
        this.f45575a = sparseBooleanArray;
    }
}
