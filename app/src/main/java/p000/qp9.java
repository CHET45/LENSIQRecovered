package p000;

import android.util.LruCache;

/* JADX INFO: loaded from: classes.dex */
public final class qp9 {

    /* JADX INFO: renamed from: qp9$a */
    @dwf({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$1\n*L\n1#1,54:1\n*E\n"})
    public static final class C11575a extends tt8 implements gz6<Object, Object, Integer> {

        /* JADX INFO: renamed from: a */
        public static final C11575a f75070a = new C11575a();

        public C11575a() {
            super(2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.gz6
        @yfb
        public final Integer invoke(@yfb Object obj, @yfb Object obj2) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: qp9$b */
    @dwf({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$2\n*L\n1#1,54:1\n*E\n"})
    public static final class C11576b extends tt8 implements qy6<Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C11576b f75071a = new C11576b();

        public C11576b() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@yfb Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: qp9$c */
    @dwf({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$3\n*L\n1#1,54:1\n*E\n"})
    public static final class C11577c extends tt8 implements oz6<Boolean, Object, Object, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C11577c f75072a = new C11577c();

        public C11577c() {
            super(4);
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(Boolean bool, Object obj, Object obj2, Object obj3) {
            invoke(bool.booleanValue(), obj, obj2, obj3);
            return bth.f14751a;
        }

        public final void invoke(boolean z, @yfb Object obj, @yfb Object obj2, @gib Object obj3) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: qp9$d */
    @dwf({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$4\n*L\n1#1,54:1\n*E\n"})
    public static final class C11578d<K, V> extends LruCache<K, V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<K, V, Integer> f75073a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<K, V> f75074b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ oz6<Boolean, K, V, V, bth> f75075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11578d(int i, gz6<? super K, ? super V, Integer> gz6Var, qy6<? super K, ? extends V> qy6Var, oz6<? super Boolean, ? super K, ? super V, ? super V, bth> oz6Var) {
            super(i);
            this.f75073a = gz6Var;
            this.f75074b = qy6Var;
            this.f75075c = oz6Var;
        }

        @Override // android.util.LruCache
        @gib
        public V create(@yfb K k) {
            return this.f75074b.invoke(k);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, @yfb K k, @yfb V v, @gib V v2) {
            this.f75075c.invoke(Boolean.valueOf(z), k, v, v2);
        }

        @Override // android.util.LruCache
        public int sizeOf(@yfb K k, @yfb V v) {
            return this.f75073a.invoke(k, v).intValue();
        }
    }

    @yfb
    public static final <K, V> LruCache<K, V> lruCache(int i, @yfb gz6<? super K, ? super V, Integer> gz6Var, @yfb qy6<? super K, ? extends V> qy6Var, @yfb oz6<? super Boolean, ? super K, ? super V, ? super V, bth> oz6Var) {
        return new C11578d(i, gz6Var, qy6Var, oz6Var);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, gz6 gz6Var, qy6 qy6Var, oz6 oz6Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            gz6Var = C11575a.f75070a;
        }
        if ((i2 & 4) != 0) {
            qy6Var = C11576b.f75071a;
        }
        if ((i2 & 8) != 0) {
            oz6Var = C11577c.f75072a;
        }
        return new C11578d(i, gz6Var, qy6Var, oz6Var);
    }
}
