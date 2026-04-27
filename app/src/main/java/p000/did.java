package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ProvidedValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4582:1\n1#2:4583\n*E\n"})
@e0g(parameters = 0)
public final class did<T> {

    /* JADX INFO: renamed from: i */
    public static final int f29712i = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final kn2<T> f29713a;

    /* JADX INFO: renamed from: b */
    public final boolean f29714b;

    /* JADX INFO: renamed from: c */
    @gib
    public final qtf<T> f29715c;

    /* JADX INFO: renamed from: d */
    @gib
    public final z6b<T> f29716d;

    /* JADX INFO: renamed from: e */
    @gib
    public final qy6<ln2, T> f29717e;

    /* JADX INFO: renamed from: f */
    public final boolean f29718f;

    /* JADX INFO: renamed from: g */
    @gib
    public final T f29719g;

    /* JADX INFO: renamed from: h */
    public boolean f29720h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public did(@yfb kn2<T> kn2Var, @gib T t, boolean z, @gib qtf<T> qtfVar, @gib z6b<T> z6bVar, @gib qy6<? super ln2, ? extends T> qy6Var, boolean z2) {
        this.f29713a = kn2Var;
        this.f29714b = z;
        this.f29715c = qtfVar;
        this.f29716d = z6bVar;
        this.f29717e = qy6Var;
        this.f29718f = z2;
        this.f29719g = t;
    }

    public static /* synthetic */ void getEffectiveValue$runtime_release$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    @xn8(name = "getCanOverride")
    public final boolean getCanOverride() {
        return this.f29720h;
    }

    @yfb
    public final kn2<T> getCompositionLocal() {
        return this.f29713a;
    }

    @gib
    public final qy6<ln2, T> getCompute$runtime_release() {
        return this.f29717e;
    }

    public final T getEffectiveValue$runtime_release() {
        if (this.f29714b) {
            return null;
        }
        z6b<T> z6bVar = this.f29716d;
        if (z6bVar != null) {
            return z6bVar.getValue();
        }
        T t = this.f29719g;
        if (t != null) {
            return t;
        }
        gm2.composeRuntimeError("Unexpected form of a provided value");
        throw new us8();
    }

    @gib
    public final qtf<T> getMutationPolicy$runtime_release() {
        return this.f29715c;
    }

    @gib
    public final z6b<T> getState$runtime_release() {
        return this.f29716d;
    }

    public final T getValue() {
        return this.f29719g;
    }

    @yfb
    public final did<T> ifNotAlreadyProvided$runtime_release() {
        this.f29720h = false;
        return this;
    }

    public final boolean isDynamic$runtime_release() {
        return this.f29718f;
    }

    public final boolean isStatic$runtime_release() {
        return (this.f29714b || getValue() != null) && !this.f29718f;
    }
}
