package p000;

/* JADX INFO: loaded from: classes7.dex */
public class ogd extends ngd {
    public ogd(so8 so8Var, String str, String str2) {
        super(xn1.NO_RECEIVER, ((u02) so8Var).getJClass(), str, str2, !(so8Var instanceof oo8) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @jjf(version = "1.4")
    public ogd(Class cls, String str, String str2, int i) {
        super(xn1.NO_RECEIVER, cls, str, str2, i);
    }

    @jjf(version = "1.4")
    public ogd(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
