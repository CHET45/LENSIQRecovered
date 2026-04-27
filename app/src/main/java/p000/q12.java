package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n52#1:220,3\n52#1:224\n52#1:223\n*E\n"})
public final class q12<T> implements y1f<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<oo8<?>, lp8<T>> f72740a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final u12<vl1<T>> f72741b;

    /* JADX INFO: renamed from: q12$a */
    @dwf({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n1#1,89:1\n52#2:90\n*E\n"})
    public static final class C11249a implements ny6<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ oo8 f72743b;

        public C11249a(oo8 oo8Var) {
            this.f72743b = oo8Var;
        }

        @Override // p000.ny6
        public final T invoke() {
            return (T) new vl1(q12.this.getCompute().invoke(this.f72743b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q12(@yfb qy6<? super oo8<?>, ? extends lp8<T>> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "compute");
        this.f72740a = qy6Var;
        this.f72741b = new u12<>();
    }

    @Override // p000.y1f
    @gib
    public lp8<T> get(@yfb oo8<Object> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "key");
        Object obj = this.f72741b.get(hn8.getJavaClass((oo8) oo8Var));
        md8.checkNotNullExpressionValue(obj, "get(...)");
        x6b x6bVar = (x6b) obj;
        T t = x6bVar.f96896a.get();
        if (t == null) {
            t = (T) x6bVar.getOrSetWithLock(new C11249a(oo8Var));
        }
        return t.f91555a;
    }

    @yfb
    public final qy6<oo8<?>, lp8<T>> getCompute() {
        return this.f72740a;
    }

    @Override // p000.y1f
    public boolean isStored(@yfb oo8<?> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "key");
        return this.f72741b.isStored(hn8.getJavaClass((oo8) oo8Var));
    }
}
