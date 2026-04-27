package p000;

import androidx.lifecycle.C1137f0;

/* JADX INFO: loaded from: classes3.dex */
public final class jai {
    @yfb
    public static final <VM extends cai> VM createViewModel(@yfb C1137f0.c cVar, @yfb oo8<VM> oo8Var, @yfb k63 k63Var) {
        md8.checkNotNullParameter(cVar, "factory");
        md8.checkNotNullParameter(oo8Var, "modelClass");
        md8.checkNotNullParameter(k63Var, "extras");
        try {
            try {
                return (VM) cVar.create(oo8Var, k63Var);
            } catch (AbstractMethodError unused) {
                return (VM) cVar.create(hn8.getJavaClass((oo8) oo8Var), k63Var);
            }
        } catch (AbstractMethodError unused2) {
            return (VM) cVar.create(hn8.getJavaClass((oo8) oo8Var));
        }
    }
}
