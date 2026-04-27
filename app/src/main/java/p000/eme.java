package p000;

/* JADX INFO: loaded from: classes.dex */
public final class eme {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final dme<Object, Object> f33554a = Saver(C5396a.f33555a, C5397b.f33556a);

    /* JADX INFO: renamed from: eme$a */
    public static final class C5396a extends tt8 implements gz6<fme, Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C5396a f33555a = new C5396a();

        public C5396a() {
            super(2);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb fme fmeVar, @gib Object obj) {
            return obj;
        }
    }

    /* JADX INFO: renamed from: eme$b */
    public static final class C5397b extends tt8 implements qy6<Object, Object> {

        /* JADX INFO: renamed from: a */
        public static final C5397b f33556a = new C5397b();

        public C5397b() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final Object invoke(@yfb Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* JADX INFO: renamed from: eme$c */
    public static final class C5398c<Original, Saveable> implements dme<Original, Saveable> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<fme, Original, Saveable> f33557a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qy6<Saveable, Original> f33558b;

        /* JADX WARN: Multi-variable type inference failed */
        public C5398c(gz6<? super fme, ? super Original, ? extends Saveable> gz6Var, qy6<? super Saveable, ? extends Original> qy6Var) {
            this.f33557a = gz6Var;
            this.f33558b = qy6Var;
        }

        @Override // p000.dme
        @gib
        public Original restore(@yfb Saveable saveable) {
            return this.f33558b.invoke(saveable);
        }

        @Override // p000.dme
        @gib
        public Saveable save(@yfb fme fmeVar, Original original) {
            return this.f33557a.invoke(fmeVar, original);
        }
    }

    @yfb
    public static final <Original, Saveable> dme<Original, Saveable> Saver(@yfb gz6<? super fme, ? super Original, ? extends Saveable> gz6Var, @yfb qy6<? super Saveable, ? extends Original> qy6Var) {
        return new C5398c(gz6Var, qy6Var);
    }

    @yfb
    public static final <T> dme<T, Object> autoSaver() {
        dme<T, Object> dmeVar = (dme<T, Object>) f33554a;
        md8.checkNotNull(dmeVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return dmeVar;
    }
}
