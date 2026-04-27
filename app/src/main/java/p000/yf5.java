package p000;

/* JADX INFO: loaded from: classes8.dex */
public class yf5 extends f3g {

    /* JADX INFO: renamed from: a */
    public final f3g f101385a;

    /* JADX INFO: renamed from: b */
    public final Class<? extends Throwable> f101386b;

    public yf5(f3g f3gVar, Class<? extends Throwable> cls) {
        this.f101385a = f3gVar;
        this.f101386b = cls;
    }

    @Override // p000.f3g
    public void evaluate() throws Exception {
        try {
            this.f101385a.evaluate();
            throw new AssertionError("Expected exception: " + this.f101386b.getName());
        } catch (g90 e) {
            throw e;
        } catch (Throwable th) {
            if (this.f101386b.isAssignableFrom(th.getClass())) {
                return;
            }
            throw new Exception("Unexpected exception, expected<" + this.f101386b.getName() + "> but was<" + th.getClass().getName() + ">", th);
        }
    }
}
