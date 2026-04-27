package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class o82 extends n82 {
    public static final <T> void forEach(@yfb Iterator<? extends T> it, @yfb qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(it, "<this>");
        md8.checkNotNullParameter(qy6Var, "operation");
        while (it.hasNext()) {
            qy6Var.invoke(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final <T> Iterator<T> iterator(Iterator<? extends T> it) {
        md8.checkNotNullParameter(it, "<this>");
        return it;
    }

    @yfb
    public static final <T> Iterator<q08<T>> withIndex(@yfb Iterator<? extends T> it) {
        md8.checkNotNullParameter(it, "<this>");
        return new s08(it);
    }
}
