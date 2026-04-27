package p000;

/* JADX INFO: loaded from: classes7.dex */
public class o6b extends n6b {
    public o6b(so8 so8Var, String str, String str2) {
        super(((u02) so8Var).getJClass(), str, str2, !(so8Var instanceof oo8) ? 1 : 0);
    }

    @Override // p000.kp8
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @Override // p000.ep8
    public void set(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }

    @jjf(version = "1.4")
    public o6b(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }
}
