package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class r82 extends q82 {
    @yfb
    public static final <T> List<T> asReversed(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "<this>");
        return new p9e(list);
    }

    @yfb
    @xn8(name = "asReversedMutable")
    public static final <T> List<T> asReversedMutable(@yfb List<T> list) {
        md8.checkNotNullParameter(list, "<this>");
        return new o9e(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i) {
        if (i >= 0 && i <= l82.getLastIndex(list)) {
            return l82.getLastIndex(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new f78(0, l82.getLastIndex(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseIteratorIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i) {
        return l82.getLastIndex(list) - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new f78(0, list.size()) + "].");
    }
}
