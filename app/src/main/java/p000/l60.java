package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class l60 {
    @yfb
    public static final <T> Iterator<T> iterator(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        return new k60(tArr);
    }
}
