package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class bf9 implements ef9 {

    /* JADX INFO: renamed from: c */
    public static final Locale[] f13623c = new Locale[0];

    /* JADX INFO: renamed from: d */
    public static final Locale f13624d = new Locale(ufh.f87916c, "XA");

    /* JADX INFO: renamed from: e */
    public static final Locale f13625e = new Locale("ar", "XB");

    /* JADX INFO: renamed from: f */
    public static final Locale f13626f = af9.m486a("en-Latn");

    /* JADX INFO: renamed from: a */
    public final Locale[] f13627a;

    /* JADX INFO: renamed from: b */
    @efb
    public final String f13628b;

    /* JADX INFO: renamed from: bf9$a */
    @c5e(21)
    public static class C1876a {
        private C1876a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static String m3156a(Locale locale) {
            return locale.getScript();
        }
    }

    public bf9(@efb Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f13627a = f13623c;
            this.f13628b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException("list[" + i + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                m3155a(sb, locale2);
                if (i < localeArr.length - 1) {
                    sb.append(C4584d2.f28238g);
                }
                hashSet.add(locale2);
            }
        }
        this.f13627a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f13628b = sb.toString();
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public static void m3155a(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    private Locale computeFirstMatch(Collection<String> collection, boolean z) {
        int iComputeFirstMatchIndex = computeFirstMatchIndex(collection, z);
        if (iComputeFirstMatchIndex == -1) {
            return null;
        }
        return this.f13627a[iComputeFirstMatchIndex];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int computeFirstMatchIndex(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f13627a
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L8
            return r3
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = p000.bf9.f13626f
            int r6 = r4.findFirstMatchIndex(r6)
            if (r6 != 0) goto L1b
            return r3
        L1b:
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r6 = r0
        L1f:
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = p000.af9.m486a(r1)
            int r1 = r4.findFirstMatchIndex(r1)
            if (r1 != 0) goto L3a
            return r3
        L3a:
            if (r1 >= r6) goto L23
            r6 = r1
            goto L23
        L3e:
            if (r6 != r0) goto L41
            return r3
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bf9.computeFirstMatchIndex(java.util.Collection, boolean):int");
    }

    private int findFirstMatchIndex(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f13627a;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (matchScore(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }

    private static String getLikelyScript(Locale locale) {
        String strM3156a = C1876a.m3156a(locale);
        return !strM3156a.isEmpty() ? strM3156a : "";
    }

    private static boolean isPseudoLocale(Locale locale) {
        return f13624d.equals(locale) || f13625e.equals(locale);
    }

    @h78(from = 0, m12174to = 1)
    private static int matchScore(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
            return 0;
        }
        String likelyScript = getLikelyScript(locale);
        if (!likelyScript.isEmpty()) {
            return likelyScript.equals(getLikelyScript(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bf9)) {
            return false;
        }
        Locale[] localeArr = ((bf9) obj).f13627a;
        if (this.f13627a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f13627a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // p000.ef9
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f13627a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    @Override // p000.ef9
    public Locale getFirstMatch(@efb String[] strArr) {
        return computeFirstMatch(Arrays.asList(strArr), false);
    }

    @Override // p000.ef9
    @hib
    public Object getLocaleList() {
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f13627a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p000.ef9
    public int indexOf(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f13627a;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    @Override // p000.ef9
    public boolean isEmpty() {
        return this.f13627a.length == 0;
    }

    @Override // p000.ef9
    public int size() {
        return this.f13627a.length;
    }

    @Override // p000.ef9
    public String toLanguageTags() {
        return this.f13628b;
    }

    @efb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f13627a;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < this.f13627a.length - 1) {
                sb.append(C4584d2.f28238g);
            }
            i++;
        }
    }
}
