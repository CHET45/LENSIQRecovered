package p000;

import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@c5e(24)
public final class gf9 {
    private gf9() {
    }

    /* JADX INFO: renamed from: a */
    public static af9 m11668a(af9 af9Var, af9 af9Var2) {
        return (af9Var == null || af9Var.isEmpty()) ? af9.getEmptyLocaleList() : combineLocales(af9Var, af9Var2);
    }

    /* JADX INFO: renamed from: b */
    public static af9 m11669b(LocaleList localeList, LocaleList localeList2) {
        return (localeList == null || localeList.isEmpty()) ? af9.getEmptyLocaleList() : combineLocales(af9.wrap(localeList), af9.wrap(localeList2));
    }

    private static af9 combineLocales(af9 af9Var, af9 af9Var2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < af9Var.size() + af9Var2.size()) {
            Locale locale = i < af9Var.size() ? af9Var.get(i) : af9Var2.get(i - af9Var.size());
            if (locale != null) {
                linkedHashSet.add(locale);
            }
            i++;
        }
        return af9.create((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }
}
