package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public interface ef9 {
    Locale get(int i);

    @hib
    Locale getFirstMatch(@efb String[] strArr);

    Object getLocaleList();

    @h78(from = -1)
    int indexOf(Locale locale);

    boolean isEmpty();

    @h78(from = 0)
    int size();

    String toLanguageTags();
}
