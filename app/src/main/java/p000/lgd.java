package p000;

import p000.ip8;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lgd extends rgd implements ip8 {
    public lgd() {
    }

    @Override // p000.xn1
    public no8 computeReflected() {
        return vvd.property0(this);
    }

    @Override // p000.ip8
    @jjf(version = "1.1")
    public Object getDelegate() {
        return ((ip8) getReflected()).getDelegate();
    }

    @Override // p000.ny6
    public Object invoke() {
        return get();
    }

    @jjf(version = "1.1")
    public lgd(Object obj) {
        super(obj);
    }

    @Override // p000.hp8
    public ip8.InterfaceC7558b getGetter() {
        return ((ip8) getReflected()).getGetter();
    }

    @jjf(version = "1.4")
    public lgd(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
