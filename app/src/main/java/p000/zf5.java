package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zf5 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: zf5$a */
    public static final class C16112a<T> extends tt8 implements ny6<T> {

        /* JADX INFO: renamed from: a */
        public static final C16112a f104996a = new C16112a();

        public C16112a() {
            super(0);
        }

        @Override // p000.ny6
        @gib
        public final T invoke() {
            return null;
        }
    }

    @yfb
    public static final <T> uxg<T> ThreadLocal() {
        return new uxg<>(C16112a.f104996a);
    }

    public static final int postIncrement(@yfb xb0 xb0Var) {
        return xb0Var.add(1) - 1;
    }
}
