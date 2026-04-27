package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p4d {

    /* JADX INFO: renamed from: p4d$a */
    public interface InterfaceC10791a<T> {
        @gib
        T acquire();

        boolean release(@yfb T t);
    }

    /* JADX INFO: renamed from: p4d$b */
    @dwf({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class C10792b<T> implements InterfaceC10791a<T> {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Object[] f69639a;

        /* JADX INFO: renamed from: b */
        public int f69640b;

        public C10792b(@h78(from = 1) int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f69639a = new Object[i];
        }

        private final boolean isInPool(T t) {
            int i = this.f69640b;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f69639a[i2] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000.p4d.InterfaceC10791a
        @gib
        public T acquire() {
            int i = this.f69640b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T t = (T) this.f69639a[i2];
            md8.checkNotNull(t, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.f69639a[i2] = null;
            this.f69640b--;
            return t;
        }

        @Override // p000.p4d.InterfaceC10791a
        public boolean release(@yfb T t) {
            md8.checkNotNullParameter(t, "instance");
            if (isInPool(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i = this.f69640b;
            Object[] objArr = this.f69639a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f69640b = i + 1;
            return true;
        }
    }

    /* JADX INFO: renamed from: p4d$c */
    @dwf({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SynchronizedPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class C10793c<T> extends C10792b<T> {

        /* JADX INFO: renamed from: c */
        @yfb
        public final Object f69641c;

        public C10793c(int i) {
            super(i);
            this.f69641c = new Object();
        }

        @Override // p000.p4d.C10792b, p000.p4d.InterfaceC10791a
        @gib
        public T acquire() {
            T t;
            synchronized (this.f69641c) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // p000.p4d.C10792b, p000.p4d.InterfaceC10791a
        public boolean release(@yfb T t) {
            boolean zRelease;
            md8.checkNotNullParameter(t, "instance");
            synchronized (this.f69641c) {
                zRelease = super.release(t);
            }
            return zRelease;
        }
    }

    private p4d() {
    }
}
