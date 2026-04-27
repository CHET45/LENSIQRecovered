package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o4d {

    /* JADX INFO: renamed from: a */
    public static final boolean f66446a = false;

    /* JADX INFO: renamed from: o4d$a */
    public interface InterfaceC10191a<T> {
        T acquire();

        boolean release(T t);

        void releaseAll(T[] tArr, int i);
    }

    /* JADX INFO: renamed from: o4d$b */
    public static class C10192b<T> implements InterfaceC10191a<T> {

        /* JADX INFO: renamed from: a */
        public final Object[] f66447a;

        /* JADX INFO: renamed from: b */
        public int f66448b;

        public C10192b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f66447a = new Object[i];
        }

        private boolean isInPool(T t) {
            for (int i = 0; i < this.f66448b; i++) {
                if (this.f66447a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.o4d.InterfaceC10191a
        public T acquire() {
            int i = this.f66448b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.f66447a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f66448b = i - 1;
            return t;
        }

        @Override // p000.o4d.InterfaceC10191a
        public boolean release(T t) {
            int i = this.f66448b;
            Object[] objArr = this.f66447a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f66448b = i + 1;
            return true;
        }

        @Override // p000.o4d.InterfaceC10191a
        public void releaseAll(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.f66448b;
                Object[] objArr = this.f66447a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.f66448b = i3 + 1;
                }
            }
        }
    }

    private o4d() {
    }
}
