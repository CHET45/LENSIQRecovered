package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
@fgg
public final class u12<T> extends ClassValue<x6b<T>> {

    /* JADX INFO: renamed from: u12$a */
    public static final class C13317a implements ny6<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<T> f86541a;

        /* JADX WARN: Multi-variable type inference failed */
        public C13317a(ny6<? extends T> ny6Var) {
            this.f86541a = ny6Var;
        }

        @Override // p000.ny6
        public final T invoke() {
            return this.f86541a.invoke();
        }
    }

    @Override // java.lang.ClassValue
    @yfb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public x6b<T> computeValue(@yfb Class<?> cls) {
        md8.checkNotNullParameter(cls, "type");
        return new x6b<>();
    }

    public final T getOrSet(@yfb Class<?> cls, @yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(cls, "key");
        md8.checkNotNullParameter(ny6Var, "factory");
        Object obj = get(cls);
        md8.checkNotNullExpressionValue(obj, "get(...)");
        x6b x6bVar = (x6b) obj;
        T t = x6bVar.f96896a.get();
        return t != null ? t : (T) x6bVar.getOrSetWithLock(new C13317a(ny6Var));
    }

    public final boolean isStored(@yfb Class<?> cls) {
        md8.checkNotNullParameter(cls, "key");
        return ((x6b) get(cls)).f96896a.get() != null;
    }
}
