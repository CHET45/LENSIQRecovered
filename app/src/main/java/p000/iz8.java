package p000;

/* JADX INFO: loaded from: classes7.dex */
public class iz8 extends hz8 {
    @t28
    private static final <T> T getValue(fx8<? extends T> fx8Var, Object obj, hp8<?> hp8Var) {
        md8.checkNotNullParameter(fx8Var, "<this>");
        md8.checkNotNullParameter(hp8Var, "property");
        return fx8Var.getValue();
    }

    @yfb
    public static final <T> fx8<T> lazyOf(T t) {
        return new u18(t);
    }
}
