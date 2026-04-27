package p000;

/* JADX INFO: loaded from: classes.dex */
@ry8
public interface qy8 {

    /* JADX INFO: renamed from: qy8$a */
    public static final class C11764a extends tt8 implements qy6 {

        /* JADX INFO: renamed from: a */
        public static final C11764a f76302a = new C11764a();

        public C11764a() {
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

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void item$default(qy8 qy8Var, Object obj, qy6 qy6Var, Object obj2, kz6 kz6Var, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            qy6Var = null;
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        qy8Var.item(obj, qy6Var, obj2, kz6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(qy8 qy8Var, int i, qy6 qy6Var, gz6 gz6Var, qy6 qy6Var2, oz6 oz6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        qy6 qy6Var3 = (i2 & 2) != 0 ? null : qy6Var;
        gz6 gz6Var2 = (i2 & 4) != 0 ? null : gz6Var;
        if ((i2 & 8) != 0) {
            qy6Var2 = C11764a.f76302a;
        }
        qy8Var.items(i, qy6Var3, gz6Var2, qy6Var2, oz6Var);
    }

    void item(@gib Object obj, @gib qy6<? super dy8, ib7> qy6Var, @gib Object obj2, @yfb kz6<? super by8, ? super zl2, ? super Integer, bth> kz6Var);

    void items(int i, @gib qy6<? super Integer, ? extends Object> qy6Var, @gib gz6<? super dy8, ? super Integer, ib7> gz6Var, @yfb qy6<? super Integer, ? extends Object> qy6Var2, @yfb oz6<? super by8, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var);
}
