package p000;

import p000.e13;
import p000.fza;

/* JADX INFO: loaded from: classes.dex */
public final class b26 implements fza {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final b26 f12450a = new b26();

    private b26() {
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) fza.C6039a.fold(this, r, gz6Var);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) fza.C6039a.get(this, interfaceC5041c);
    }

    @Override // p000.fza
    public float getScaleFactor() {
        return 1.0f;
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return fza.C6039a.minusKey(this, interfaceC5041c);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return fza.C6039a.plus(this, e13Var);
    }
}
