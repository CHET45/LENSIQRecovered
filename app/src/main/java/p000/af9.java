package p000;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class af9 {

    /* JADX INFO: renamed from: b */
    public static final af9 f1329b = create(new Locale[0]);

    /* JADX INFO: renamed from: a */
    public final ef9 f1330a;

    /* JADX INFO: renamed from: af9$a */
    @c5e(21)
    public static class C0207a {

        /* JADX INFO: renamed from: a */
        public static final Locale[] f1331a = {new Locale(ufh.f87916c, "XA"), new Locale("ar", "XB")};

        private C0207a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Locale m487a(String str) {
            return Locale.forLanguageTag(str);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m488b(@efb Locale locale, @efb Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
                return false;
            }
            String strMaximizeAndGetScript = pp7.maximizeAndGetScript(locale);
            if (!strMaximizeAndGetScript.isEmpty()) {
                return strMaximizeAndGetScript.equals(pp7.maximizeAndGetScript(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }

        private static boolean isPseudoLocale(Locale locale) {
            for (Locale locale2 : f1331a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: af9$b */
    @c5e(24)
    public static class C0208b {
        private C0208b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static LocaleList m489a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static LocaleList m490b() {
            return LocaleList.getAdjustedDefault();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static LocaleList m491c() {
            return LocaleList.getDefault();
        }
    }

    private af9(ef9 ef9Var) {
        this.f1330a = ef9Var;
    }

    /* JADX INFO: renamed from: a */
    public static Locale m486a(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains(p43.f69617m)) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split(p43.f69617m, -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @efb
    public static af9 create(@efb Locale... localeArr) {
        return wrap(C0208b.m489a(localeArr));
    }

    @efb
    public static af9 forLanguageTags(@hib String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C0207a.m487a(strArrSplit[i]);
        }
        return create(localeArr);
    }

    @efb
    @zpf(min = 1)
    public static af9 getAdjustedDefault() {
        return wrap(C0208b.m490b());
    }

    @efb
    @zpf(min = 1)
    public static af9 getDefault() {
        return wrap(C0208b.m491c());
    }

    @efb
    public static af9 getEmptyLocaleList() {
        return f1329b;
    }

    @c5e(21)
    public static boolean matchesLanguageAndScript(@efb Locale locale, @efb Locale locale2) {
        return Build.VERSION.SDK_INT >= 33 ? LocaleList.matchesLanguageAndScript(locale, locale2) : C0207a.m488b(locale, locale2);
    }

    @c5e(24)
    @Deprecated
    public static af9 wrap(Object obj) {
        return wrap((LocaleList) obj);
    }

    public boolean equals(Object obj) {
        return (obj instanceof af9) && this.f1330a.equals(((af9) obj).f1330a);
    }

    @hib
    public Locale get(int i) {
        return this.f1330a.get(i);
    }

    @hib
    public Locale getFirstMatch(@efb String[] strArr) {
        return this.f1330a.getFirstMatch(strArr);
    }

    public int hashCode() {
        return this.f1330a.hashCode();
    }

    @h78(from = -1)
    public int indexOf(@hib Locale locale) {
        return this.f1330a.indexOf(locale);
    }

    public boolean isEmpty() {
        return this.f1330a.isEmpty();
    }

    @h78(from = 0)
    public int size() {
        return this.f1330a.size();
    }

    @efb
    public String toLanguageTags() {
        return this.f1330a.toLanguageTags();
    }

    @efb
    public String toString() {
        return this.f1330a.toString();
    }

    @hib
    public Object unwrap() {
        return this.f1330a.getLocaleList();
    }

    @c5e(24)
    @efb
    public static af9 wrap(@efb LocaleList localeList) {
        return new af9(new ff9(localeList));
    }
}
