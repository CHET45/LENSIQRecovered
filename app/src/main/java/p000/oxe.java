package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oxe {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: oxe$a */
    public static final class C10711a<T> extends tt8 implements ny6<T> {

        /* JADX INFO: renamed from: a */
        public static final C10711a f69169a = new C10711a();

        public C10711a() {
            super(0);
        }

        @Override // p000.ny6
        @gib
        public final T invoke() {
            return null;
        }
    }

    @gib
    public static final <T> T getOrNull(@yfb nxe nxeVar, @yfb dye<T> dyeVar) {
        return (T) nxeVar.getOrElseNullable(dyeVar, C10711a.f69169a);
    }
}
