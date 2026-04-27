package p000;

import p000.dp8;
import p000.jp8;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l6b extends p6b implements dp8 {
    public l6b() {
    }

    @Override // p000.xn1
    public no8 computeReflected() {
        return vvd.mutableProperty1(this);
    }

    @Override // p000.jp8
    @jjf(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((dp8) getReflected()).getDelegate(obj);
    }

    @Override // p000.qy6
    public Object invoke(Object obj) {
        return get(obj);
    }

    @jjf(version = "1.1")
    public l6b(Object obj) {
        super(obj);
    }

    @Override // p000.hp8
    public jp8.InterfaceC8005b getGetter() {
        return ((dp8) getReflected()).getGetter();
    }

    @Override // p000.bp8
    public dp8.InterfaceC4901b getSetter() {
        return ((dp8) getReflected()).getSetter();
    }

    @jjf(version = "1.4")
    public l6b(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
