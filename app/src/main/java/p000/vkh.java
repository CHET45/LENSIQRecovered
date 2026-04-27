package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "TuplesKt")
public final class vkh {
    @yfb
    /* JADX INFO: renamed from: to */
    public static final <A, B> scc<A, B> m24050to(A a, B b) {
        return new scc<>(a, b);
    }

    @yfb
    public static final <T> List<T> toList(@yfb scc<? extends T, ? extends T> sccVar) {
        md8.checkNotNullParameter(sccVar, "<this>");
        return l82.listOf(sccVar.getFirst(), sccVar.getSecond());
    }

    @yfb
    public static final <T> List<T> toList(@yfb djh<? extends T, ? extends T, ? extends T> djhVar) {
        md8.checkNotNullParameter(djhVar, "<this>");
        return l82.listOf(djhVar.getFirst(), djhVar.getSecond(), djhVar.getThird());
    }
}
