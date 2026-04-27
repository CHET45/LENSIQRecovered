package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public abstract class g58 implements b58 {

    /* JADX INFO: renamed from: c */
    public static final int f38812c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<f58, bth> f38813a;

    /* JADX INFO: renamed from: b */
    @gib
    public f58 f38814b;

    /* JADX WARN: Multi-variable type inference failed */
    public g58(@yfb qy6<? super f58, bth> qy6Var) {
        this.f38813a = qy6Var;
    }

    private final f58 getValues() {
        f58 f58Var = this.f38814b;
        if (f58Var == null) {
            f58Var = new f58();
            this.f38813a.invoke(f58Var);
        }
        this.f38814b = f58Var;
        return f58Var;
    }

    @Override // p000.b58
    @yfb
    public vye<e2i> getInspectableElements() {
        return getValues().getProperties();
    }

    @Override // p000.b58
    @gib
    public String getNameFallback() {
        return getValues().getName();
    }

    @Override // p000.b58
    @gib
    public Object getValueOverride() {
        return getValues().getValue();
    }
}
