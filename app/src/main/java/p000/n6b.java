package p000;

import p000.ep8;
import p000.kp8;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n6b extends p6b implements ep8 {
    public n6b() {
    }

    @Override // p000.xn1
    public no8 computeReflected() {
        return vvd.mutableProperty2(this);
    }

    @Override // p000.kp8
    @jjf(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((ep8) getReflected()).getDelegate(obj, obj2);
    }

    @Override // p000.gz6
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @jjf(version = "1.4")
    public n6b(Class cls, String str, String str2, int i) {
        super(xn1.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // p000.hp8
    public kp8.InterfaceC8481b getGetter() {
        return ((ep8) getReflected()).getGetter();
    }

    @Override // p000.bp8
    public ep8.InterfaceC5432b getSetter() {
        return ((ep8) getReflected()).getSetter();
    }
}
