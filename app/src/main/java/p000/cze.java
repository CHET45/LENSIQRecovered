package p000;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes7.dex */
public class cze extends bze {
    @t28
    private static final <T> vye<T> asSequence(Enumeration<T> enumeration) {
        md8.checkNotNullParameter(enumeration, "<this>");
        return ize.asSequence(n82.iterator(enumeration));
    }
}
