package p000;

/* JADX INFO: loaded from: classes7.dex */
@yr7
public final class s12 extends j93 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final s12 f80361a = new s12();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C12393a f80362b = new C12393a();

    /* JADX INFO: renamed from: s12$a */
    public static final class C12393a extends ClassValue<qy6<? super Throwable, ? extends Throwable>> {
        @Override // java.lang.ClassValue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qy6<Throwable, Throwable> computeValue(Class<?> cls) {
            md8.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return w75.createConstructor(cls);
        }
    }

    private s12() {
    }

    @Override // p000.j93
    @yfb
    public qy6<Throwable, Throwable> get(@yfb Class<? extends Throwable> cls) {
        return (qy6) f80362b.get(cls);
    }
}
