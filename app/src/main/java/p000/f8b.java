package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class f8b {
    @vg5
    public static final <R> R withTryLock(@yfb y7b y7bVar, @gib Object obj, @yfb qy6<? super Boolean, ? extends R> qy6Var) {
        md8.checkNotNullParameter(y7bVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "block");
        boolean zTryLock = y7bVar.tryLock(obj);
        try {
            return qy6Var.invoke(Boolean.valueOf(zTryLock));
        } finally {
            o28.finallyStart(1);
            if (zTryLock) {
                y7bVar.unlock(obj);
            }
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object withTryLock$default(y7b y7bVar, Object obj, qy6 qy6Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        md8.checkNotNullParameter(y7bVar, "<this>");
        md8.checkNotNullParameter(qy6Var, "block");
        boolean zTryLock = y7bVar.tryLock(obj);
        try {
            return qy6Var.invoke(Boolean.valueOf(zTryLock));
        } finally {
            o28.finallyStart(1);
            if (zTryLock) {
                y7bVar.unlock(obj);
            }
            o28.finallyEnd(1);
        }
    }
}
