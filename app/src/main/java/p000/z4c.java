package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public final class z4c {
    public static final <E> void callUndeliveredElement(@yfb qy6<? super E, bth> qy6Var, E e, @yfb e13 e13Var) throws IllegalAccessException, InvocationTargetException {
        vrh vrhVarCallUndeliveredElementCatchingException = callUndeliveredElementCatchingException(qy6Var, e, null);
        if (vrhVarCallUndeliveredElementCatchingException != null) {
            q13.handleCoroutineException(e13Var, vrhVarCallUndeliveredElementCatchingException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    public static final <E> vrh callUndeliveredElementCatchingException(@yfb qy6<? super E, bth> qy6Var, E e, @gib vrh vrhVar) throws IllegalAccessException, InvocationTargetException {
        try {
            qy6Var.invoke(e);
        } catch (Throwable th) {
            if (vrhVar == null || vrhVar.getCause() == th) {
                return new vrh("Exception in undelivered element handler for " + e, th);
            }
            a85.addSuppressed(vrhVar, th);
        }
        return vrhVar;
    }

    public static /* synthetic */ vrh callUndeliveredElementCatchingException$default(qy6 qy6Var, Object obj, vrh vrhVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            vrhVar = null;
        }
        return callUndeliveredElementCatchingException(qy6Var, obj, vrhVar);
    }
}
