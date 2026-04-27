package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kc6 extends m86<Object> implements ime<Object> {

    /* JADX INFO: renamed from: b */
    public static final m86<Object> f53580b = new kc6();

    private kc6() {
    }

    @Override // p000.ime, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super Object> ycgVar) {
        x05.complete(ycgVar);
    }
}
