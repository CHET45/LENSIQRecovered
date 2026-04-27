package p000;

/* JADX INFO: loaded from: classes.dex */
@s29
public interface r29 {

    /* JADX INFO: renamed from: r29$a */
    public static final class C11852a extends tt8 implements qy6 {

        /* JADX INFO: renamed from: a */
        public static final C11852a f76844a = new C11852a();

        public C11852a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        @gib
        public final Void invoke(int i) {
            return null;
        }
    }

    static /* synthetic */ void item$default(r29 r29Var, Object obj, Object obj2, q0g q0gVar, kz6 kz6Var, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        if ((i & 4) != 0) {
            q0gVar = null;
        }
        r29Var.item(obj, obj2, q0gVar, kz6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(r29 r29Var, int i, qy6 qy6Var, qy6 qy6Var2, qy6 qy6Var3, oz6 oz6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        qy6 qy6Var4 = (i2 & 2) != 0 ? null : qy6Var;
        if ((i2 & 4) != 0) {
            qy6Var2 = C11852a.f76844a;
        }
        r29Var.items(i, qy6Var4, qy6Var2, (i2 & 8) != 0 ? null : qy6Var3, oz6Var);
    }

    void item(@gib Object obj, @gib Object obj2, @gib q0g q0gVar, @yfb kz6<? super f29, ? super zl2, ? super Integer, bth> kz6Var);

    void items(int i, @gib qy6<? super Integer, ? extends Object> qy6Var, @yfb qy6<? super Integer, ? extends Object> qy6Var2, @gib qy6<? super Integer, q0g> qy6Var3, @yfb oz6<? super f29, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var);
}
