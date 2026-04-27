package p000;

import p000.cp8;
import p000.ip8;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j6b extends p6b implements cp8 {
    public j6b() {
    }

    @Override // p000.xn1
    public no8 computeReflected() {
        return vvd.mutableProperty0(this);
    }

    @Override // p000.ip8
    @jjf(version = "1.1")
    public Object getDelegate() {
        return ((cp8) getReflected()).getDelegate();
    }

    @Override // p000.ny6
    public Object invoke() {
        return get();
    }

    @jjf(version = "1.1")
    public j6b(Object obj) {
        super(obj);
    }

    @Override // p000.hp8
    public ip8.InterfaceC7558b getGetter() {
        return ((cp8) getReflected()).getGetter();
    }

    @Override // p000.bp8
    public cp8.InterfaceC4447b getSetter() {
        return ((cp8) getReflected()).getSetter();
    }

    @jjf(version = "1.4")
    public j6b(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
