package p000;

import p000.jp8;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ngd extends rgd implements jp8 {
    public ngd() {
    }

    @Override // p000.xn1
    public no8 computeReflected() {
        return vvd.property1(this);
    }

    @Override // p000.jp8
    @jjf(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((jp8) getReflected()).getDelegate(obj);
    }

    @Override // p000.qy6
    public Object invoke(Object obj) {
        return get(obj);
    }

    @jjf(version = "1.1")
    public ngd(Object obj) {
        super(obj);
    }

    @Override // p000.hp8
    public jp8.InterfaceC8005b getGetter() {
        return ((jp8) getReflected()).getGetter();
    }

    @jjf(version = "1.4")
    public ngd(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
