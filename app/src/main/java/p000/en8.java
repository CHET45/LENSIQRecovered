package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class en8 {
    public static /* synthetic */ void AtomicInt$annotations() {
    }

    @yfb
    public static final Object nativeClass(@yfb Object obj) {
        return obj.getClass();
    }

    @yfb
    public static final String simpleIdentityToString(@yfb Object obj, @gib String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        l7g l7gVar = l7g.f56714a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        md8.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb.append(str2);
        return sb.toString();
    }

    @yjd
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m28827synchronized(@yfb Object obj, @yfb ny6<? extends R> ny6Var) {
        R rInvoke;
        synchronized (obj) {
            try {
                rInvoke = ny6Var.invoke();
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        return rInvoke;
    }
}
