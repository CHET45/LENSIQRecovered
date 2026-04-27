package p000;

/* JADX INFO: loaded from: classes6.dex */
public class kbb {

    /* JADX INFO: renamed from: a */
    public static dq7 f53550a;

    public static dq7 get() {
        dq7 dq7Var = f53550a;
        if (dq7Var != null) {
            return dq7Var;
        }
        throw new IllegalStateException("INetworkKit not initialized");
    }

    public static void init(dq7 dq7Var) {
        f53550a = dq7Var;
    }
}
