package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rp9 {

    /* JADX INFO: renamed from: rp9$a */
    @dwf({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$1\n*L\n1#1,355:1\n*E\n"})
    public static final class C12192a extends tt8 implements gz6<Object, Object, Integer> {

        /* JADX INFO: renamed from: a */
        public static final C12192a f78983a = new C12192a();

        public C12192a() {
            super(2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.gz6
        @yfb
        public final Integer invoke(@yfb Object obj, @yfb Object obj2) {
            md8.checkNotNullParameter(obj, "<anonymous parameter 0>");
            md8.checkNotNullParameter(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    /* JADX INFO: renamed from: rp9$b */
    @dwf({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$2\n*L\n1#1,355:1\n*E\n"})
    public static final class C12193b extends tt8 implements qy6<Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C12193b f78984a = new C12193b();

        public C12193b() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@yfb Object obj) {
            md8.checkNotNullParameter(obj, "it");
            return null;
        }
    }

    /* JADX INFO: renamed from: rp9$c */
    @dwf({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$3\n*L\n1#1,355:1\n*E\n"})
    public static final class C12194c extends tt8 implements oz6<Boolean, Object, Object, Object, bth> {

        /* JADX INFO: renamed from: a */
        public static final C12194c f78985a = new C12194c();

        public C12194c() {
            super(4);
        }

        public final void invoke(boolean z, @yfb Object obj, @yfb Object obj2, @gib Object obj3) {
            md8.checkNotNullParameter(obj, "<anonymous parameter 1>");
            md8.checkNotNullParameter(obj2, "<anonymous parameter 2>");
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(Boolean bool, Object obj, Object obj2, Object obj3) {
            invoke(bool.booleanValue(), obj, obj2, obj3);
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: rp9$d */
    @dwf({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$4\n*L\n1#1,355:1\n*E\n"})
    public static final class C12195d<K, V> extends pp9<K, V> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<K, V, Integer> f78986a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<K, V> f78987b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ oz6<Boolean, K, V, V, bth> f78988c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12195d(int i, gz6<? super K, ? super V, Integer> gz6Var, qy6<? super K, ? extends V> qy6Var, oz6<? super Boolean, ? super K, ? super V, ? super V, bth> oz6Var) {
            super(i);
            this.f78986a = gz6Var;
            this.f78987b = qy6Var;
            this.f78988c = oz6Var;
        }

        @Override // p000.pp9
        @gib
        public V create(@yfb K k) {
            md8.checkNotNullParameter(k, "key");
            return this.f78987b.invoke(k);
        }

        @Override // p000.pp9
        public void entryRemoved(boolean z, @yfb K k, @yfb V v, @gib V v2) {
            md8.checkNotNullParameter(k, "key");
            md8.checkNotNullParameter(v, "oldValue");
            this.f78988c.invoke(Boolean.valueOf(z), k, v, v2);
        }

        @Override // p000.pp9
        public int sizeOf(@yfb K k, @yfb V v) {
            md8.checkNotNullParameter(k, "key");
            md8.checkNotNullParameter(v, "value");
            return this.f78986a.invoke(k, v).intValue();
        }
    }

    @yfb
    public static final <K, V> pp9<K, V> lruCache(int i, @yfb gz6<? super K, ? super V, Integer> gz6Var, @yfb qy6<? super K, ? extends V> qy6Var, @yfb oz6<? super Boolean, ? super K, ? super V, ? super V, bth> oz6Var) {
        md8.checkNotNullParameter(gz6Var, "sizeOf");
        md8.checkNotNullParameter(qy6Var, "create");
        md8.checkNotNullParameter(oz6Var, "onEntryRemoved");
        return new C12195d(i, gz6Var, qy6Var, oz6Var);
    }

    public static /* synthetic */ pp9 lruCache$default(int i, gz6 gz6Var, qy6 qy6Var, oz6 oz6Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            gz6Var = C12192a.f78983a;
        }
        if ((i2 & 4) != 0) {
            qy6Var = C12193b.f78984a;
        }
        if ((i2 & 8) != 0) {
            oz6Var = C12194c.f78985a;
        }
        md8.checkNotNullParameter(gz6Var, "sizeOf");
        md8.checkNotNullParameter(qy6Var, "create");
        md8.checkNotNullParameter(oz6Var, "onEntryRemoved");
        return new C12195d(i, gz6Var, qy6Var, oz6Var);
    }
}
