package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface tp1 extends ufb {

    /* JADX INFO: renamed from: tp1$a */
    public static final class C13158a implements tp1 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final qy6<Throwable, bth> f85530a;

        /* JADX WARN: Multi-variable type inference failed */
        public C13158a(@yfb qy6<? super Throwable, bth> qy6Var) {
            this.f85530a = qy6Var;
        }

        @Override // p000.tp1
        public void invoke(@gib Throwable th) {
            this.f85530a.invoke(th);
        }

        @yfb
        public String toString() {
            return "CancelHandler.UserSupplied[" + kk3.getClassSimpleName(this.f85530a) + '@' + kk3.getHexAddress(this) + C4584d2.f28243l;
        }
    }

    void invoke(@gib Throwable th);
}
