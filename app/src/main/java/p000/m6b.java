package p000;

/* JADX INFO: loaded from: classes7.dex */
public class m6b extends l6b {
    public m6b(so8 so8Var, String str, String str2) {
        super(xn1.NO_RECEIVER, ((u02) so8Var).getJClass(), str, str2, !(so8Var instanceof oo8) ? 1 : 0);
    }

    @Override // p000.jp8
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // p000.dp8
    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    @jjf(version = "1.4")
    public m6b(Class cls, String str, String str2, int i) {
        super(xn1.NO_RECEIVER, cls, str, str2, i);
    }

    @jjf(version = "1.4")
    public m6b(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
