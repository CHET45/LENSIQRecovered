package p000;

/* JADX INFO: loaded from: classes7.dex */
public class qgd extends pgd {
    public qgd(so8 so8Var, String str, String str2) {
        super(((u02) so8Var).getJClass(), str, str2, !(so8Var instanceof oo8) ? 1 : 0);
    }

    @Override // p000.kp8
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @jjf(version = "1.4")
    public qgd(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }
}
