package p000;

import java.util.logging.Level;
import java.util.logging.Logger;
import p000.fx2;

/* JADX INFO: loaded from: classes7.dex */
public final class vxg extends fx2.AbstractC6024m {

    /* JADX INFO: renamed from: a */
    public static final Logger f92645a = Logger.getLogger(vxg.class.getName());

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<fx2> f92646b = new ThreadLocal<>();

    @Override // p000.fx2.AbstractC6024m
    public fx2 current() {
        fx2 fx2Var = f92646b.get();
        return fx2Var == null ? fx2.f37909f : fx2Var;
    }

    @Override // p000.fx2.AbstractC6024m
    public void detach(fx2 fx2Var, fx2 fx2Var2) {
        if (current() != fx2Var) {
            f92645a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (fx2Var2 != fx2.f37909f) {
            f92646b.set(fx2Var2);
        } else {
            f92646b.set(null);
        }
    }

    @Override // p000.fx2.AbstractC6024m
    public fx2 doAttach(fx2 fx2Var) {
        fx2 fx2VarCurrent = current();
        f92646b.set(fx2Var);
        return fx2VarCurrent;
    }
}
