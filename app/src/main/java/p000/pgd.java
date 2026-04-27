package p000;

import p000.kp8;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pgd extends rgd implements kp8 {
    public pgd() {
    }

    @Override // p000.xn1
    public no8 computeReflected() {
        return vvd.property2(this);
    }

    @Override // p000.kp8
    @jjf(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((kp8) getReflected()).getDelegate(obj, obj2);
    }

    @Override // p000.gz6
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @jjf(version = "1.4")
    public pgd(Class cls, String str, String str2, int i) {
        super(xn1.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // p000.hp8
    public kp8.InterfaceC8481b getGetter() {
        return ((kp8) getReflected()).getGetter();
    }
}
