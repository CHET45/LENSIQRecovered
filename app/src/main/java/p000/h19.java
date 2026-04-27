package p000;

/* JADX INFO: loaded from: classes.dex */
@r19
public interface h19 {

    /* JADX INFO: renamed from: h19$a */
    public static final class C6675a {
        @Deprecated
        public static void item(@yfb h19 h19Var, @gib Object obj, @gib Object obj2, @yfb kz6<? super fz8, ? super zl2, ? super Integer, bth> kz6Var) {
            h19.super.item(obj, obj2, kz6Var);
        }

        @Deprecated
        public static void items(@yfb h19 h19Var, int i, @gib qy6<? super Integer, ? extends Object> qy6Var, @yfb qy6<? super Integer, ? extends Object> qy6Var2, @yfb oz6<? super fz8, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var) {
            h19.super.items(i, qy6Var, qy6Var2, oz6Var);
        }
    }

    /* JADX INFO: renamed from: h19$b */
    public static final class C6676b extends tt8 implements qy6 {

        /* JADX INFO: renamed from: a */
        public static final C6676b f41995a = new C6676b();

        public C6676b() {
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

    /* JADX INFO: renamed from: h19$c */
    public static final class C6677c extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public static final C6677c f41996a = new C6677c();

        public C6677c() {
            super(1);
        }

        @gib
        public final Object invoke(int i) {
            return null;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    static /* synthetic */ void item$default(h19 h19Var, Object obj, Object obj2, kz6 kz6Var, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        h19Var.item(obj, obj2, kz6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(h19 h19Var, int i, qy6 qy6Var, qy6 qy6Var2, oz6 oz6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            qy6Var = null;
        }
        if ((i2 & 4) != 0) {
            qy6Var2 = C6676b.f41995a;
        }
        h19Var.items(i, qy6Var, qy6Var2, oz6Var);
    }

    static /* synthetic */ void stickyHeader$default(h19 h19Var, Object obj, Object obj2, kz6 kz6Var, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        h19Var.stickyHeader(obj, obj2, kz6Var);
    }

    default void item(@gib Object obj, @gib Object obj2, @yfb kz6<? super fz8, ? super zl2, ? super Integer, bth> kz6Var) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void items(int i, @gib qy6<? super Integer, ? extends Object> qy6Var, @yfb qy6<? super Integer, ? extends Object> qy6Var2, @yfb oz6<? super fz8, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var) {
        throw new IllegalStateException("The method is not implemented");
    }

    @ah5
    void stickyHeader(@gib Object obj, @gib Object obj2, @yfb kz6<? super fz8, ? super zl2, ? super Integer, bth> kz6Var);

    static /* synthetic */ void item$default(h19 h19Var, Object obj, kz6 kz6Var, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        h19Var.item(obj, kz6Var);
    }

    @q64(level = u64.f86867c, message = "Use the non deprecated overload")
    /* synthetic */ default void item(Object obj, kz6 kz6Var) {
        item(obj, null, kz6Var);
    }

    @q64(level = u64.f86867c, message = "Use the non deprecated overload")
    /* synthetic */ default void items(int i, qy6 qy6Var, oz6 oz6Var) {
        items(i, qy6Var, C6677c.f41996a, oz6Var);
    }

    static /* synthetic */ void items$default(h19 h19Var, int i, qy6 qy6Var, oz6 oz6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            qy6Var = null;
        }
        h19Var.items(i, qy6Var, oz6Var);
    }
}
