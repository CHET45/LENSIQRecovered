package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class c9g extends b9g {
    @t28
    private static final owd toRegex(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return new owd(str);
    }

    @t28
    private static final owd toRegex(String str, uwd uwdVar) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uwdVar, "option");
        return new owd(str, uwdVar);
    }

    @t28
    private static final owd toRegex(String str, Set<? extends uwd> set) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(set, "options");
        return new owd(str, set);
    }
}
