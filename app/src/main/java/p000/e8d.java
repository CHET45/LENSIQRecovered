package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
public class e8d extends d8d {
    @t28
    private static final void check(boolean z) {
        if (!z) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @t28
    private static final <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @t28
    private static final Void error(Object obj) {
        md8.checkNotNullParameter(obj, g55.f38799h);
        throw new IllegalStateException(obj.toString());
    }

    @t28
    private static final void require(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @t28
    private static final <T> T requireNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @t28
    private static final void check(boolean z, ny6<? extends Object> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "lazyMessage");
        if (!z) {
            throw new IllegalStateException(ny6Var.invoke().toString());
        }
    }

    @t28
    private static final <T> T checkNotNull(T t, ny6<? extends Object> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(ny6Var.invoke().toString());
    }

    @t28
    private static final void require(boolean z, ny6<? extends Object> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "lazyMessage");
        if (!z) {
            throw new IllegalArgumentException(ny6Var.invoke().toString());
        }
    }

    @t28
    private static final <T> T requireNotNull(T t, ny6<? extends Object> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "lazyMessage");
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(ny6Var.invoke().toString());
    }
}
