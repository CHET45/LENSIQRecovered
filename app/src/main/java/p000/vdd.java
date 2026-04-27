package p000;

import p000.nye;

/* JADX INFO: loaded from: classes7.dex */
public interface vdd<E> extends x13, nye<E> {

    /* JADX INFO: renamed from: vdd$a */
    public static final class C14010a {
        @q64(level = u64.f86866b, message = "Deprecated in the favour of 'trySend' method", replaceWith = @i2e(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean offer(@yfb vdd<? super E> vddVar, E e) {
            return nye.C10119a.offer(vddVar, e);
        }
    }

    @yfb
    nye<E> getChannel();
}
