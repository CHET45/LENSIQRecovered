package p000;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class h36 {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f42163a;

    public boolean contains(int i) {
        return this.f42163a.get(i);
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
        if (obj instanceof h36) {
            return this.f42163a.equals(((h36) obj).f42163a);
        }
        return false;
    }

    public int get(int i) {
        v80.checkIndex(i, 0, size());
        return this.f42163a.keyAt(i);
    }

    public int hashCode() {
        return this.f42163a.hashCode();
    }

    public int size() {
        return this.f42163a.size();
    }

    /* JADX INFO: renamed from: h36$b */
    public static final class C6691b {

        /* JADX INFO: renamed from: a */
        public final SparseBooleanArray f42164a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b */
        public boolean f42165b;

        @op1
        public C6691b add(int i) {
            v80.checkState(!this.f42165b);
            this.f42164a.append(i, true);
            return this;
        }

        @op1
        public C6691b addAll(int... iArr) {
            for (int i : iArr) {
                add(i);
            }
            return this;
        }

        @op1
        public C6691b addIf(int i, boolean z) {
            return z ? add(i) : this;
        }

        public h36 build() {
            v80.checkState(!this.f42165b);
            this.f42165b = true;
            return new h36(this.f42164a);
        }

        @op1
        public C6691b remove(int i) {
            v80.checkState(!this.f42165b);
            this.f42164a.delete(i);
            return this;
        }

        @op1
        public C6691b removeAll(int... iArr) {
            for (int i : iArr) {
                remove(i);
            }
            return this;
        }

        @op1
        public C6691b removeIf(int i, boolean z) {
            return z ? remove(i) : this;
        }

        @op1
        public C6691b addAll(h36 h36Var) {
            for (int i = 0; i < h36Var.size(); i++) {
                add(h36Var.get(i));
            }
            return this;
        }
    }

    private h36(SparseBooleanArray sparseBooleanArray) {
        this.f42163a = sparseBooleanArray;
    }
}
