package p000;

import p000.d9d;

/* JADX INFO: loaded from: classes5.dex */
public final class ui8 {
    public static final <T> T getOrDefault(@yfb d9d d9dVar, @yfb d9d.C4675a<T> c4675a, T t) {
        md8.checkNotNullParameter(d9dVar, "<this>");
        md8.checkNotNullParameter(c4675a, "key");
        T t2 = (T) d9dVar.get(c4675a);
        return t2 == null ? t : t2;
    }
}
