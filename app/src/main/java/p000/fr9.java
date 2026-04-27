package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1971#2,14:131\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n34#1:131,14\n*E\n"})
public final class fr9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final fr9 f37564a;

    /* JADX INFO: renamed from: b */
    public static final boolean f37565b = false;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public static final dr9 f37566c;

    static {
        fr9 fr9Var = new fr9();
        f37564a = fr9Var;
        zjg.systemProp(gr9.f40827a, true);
        f37566c = fr9Var.loadMainDispatcher();
    }

    private fr9() {
    }

    private final dr9 loadMainDispatcher() {
        Object next;
        dr9 dr9VarTryCreateDispatcher;
        try {
            List list = vze.toList(ize.asSequence(ServiceLoader.load(er9.class, er9.class.getClassLoader()).iterator()));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((er9) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((er9) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            er9 er9Var = (er9) next;
            if (er9Var != null && (dr9VarTryCreateDispatcher = gr9.tryCreateDispatcher(er9Var, list)) != null) {
                return dr9VarTryCreateDispatcher;
            }
            return gr9.m11824a(null, null, 3, null);
        } catch (Throwable th) {
            return gr9.m11824a(th, null, 2, null);
        }
    }
}
