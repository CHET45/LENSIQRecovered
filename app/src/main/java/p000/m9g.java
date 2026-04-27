package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1560:1\n80#1,22:1561\n114#1,5:1583\n131#1,5:1588\n80#1,22:1593\n108#1:1615\n80#1,22:1616\n114#1,5:1638\n125#1:1643\n114#1,5:1644\n131#1,5:1649\n142#1:1654\n131#1,5:1655\n80#1,22:1660\n114#1,5:1682\n131#1,5:1687\n1069#2,2:1692\n12647#3,2:1694\n12647#3,2:1696\n295#4,2:1698\n295#4,2:1700\n1557#4:1703\n1628#4,3:1704\n1557#4:1707\n1628#4,3:1708\n1#5:1702\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n108#1:1561,22\n125#1:1583,5\n142#1:1588,5\n147#1:1593,22\n152#1:1615\n152#1:1616,22\n157#1:1638,5\n162#1:1643\n162#1:1644,5\n167#1:1649,5\n172#1:1654\n172#1:1655,5\n177#1:1660,22\n188#1:1682,5\n199#1:1687,5\n312#1:1692,2\n952#1:1694,2\n976#1:1696,2\n1015#1:1698,2\n1021#1:1700,2\n1382#1:1703\n1382#1:1704,3\n1407#1:1707\n1407#1:1708,3\n*E\n"})
public class m9g extends h9g {

    /* JADX INFO: renamed from: m9g$a */
    public static final class C9229a extends wv1 {

        /* JADX INFO: renamed from: a */
        public int f60297a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CharSequence f60298b;

        public C9229a(CharSequence charSequence) {
            this.f60298b = charSequence;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60297a < this.f60298b.length();
        }

        @Override // p000.wv1
        public char nextChar() {
            CharSequence charSequence = this.f60298b;
            int i = this.f60297a;
            this.f60297a = i + 1;
            return charSequence.charAt(i);
        }
    }

    /* JADX INFO: renamed from: m9g$b */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,22:1\n1467#2:23\n*E\n"})
    public static final class C9230b implements vye<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f60299a;

        public C9230b(CharSequence charSequence) {
            this.f60299a = charSequence;
        }

        @Override // p000.vye
        public Iterator<String> iterator() {
            return new x69(this.f60299a);
        }
    }

    @yfb
    public static final String commonPrefixWith(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "other");
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < iMin && uw1.equals(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (hasSurrogatePairAt(charSequence, i2) || hasSurrogatePairAt(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return commonPrefixWith(charSequence, charSequence2, z);
    }

    @yfb
    public static final String commonSuffixWith(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "other");
        int length = charSequence.length();
        int iMin = Math.min(length, charSequence2.length());
        int i = 0;
        while (i < iMin && uw1.equals(charSequence.charAt((length - i) - 1), charSequence2.charAt((r1 - i) - 1), z)) {
            i++;
        }
        if (hasSurrogatePairAt(charSequence, (length - i) - 1) || hasSurrogatePairAt(charSequence2, (r1 - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length - i, length).toString();
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return commonSuffixWith(charSequence, charSequence2, z);
    }

    public static boolean contains(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (indexOf$default(charSequence, (String) charSequence2, 0, z, 2, (Object) null) < 0) {
                return false;
            }
        } else if (m17171l(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return contains(charSequence, charSequence2, z);
    }

    public static final boolean contentEqualsIgnoreCaseImpl(@gib CharSequence charSequence, @gib CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return h9g.equals((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!uw1.equals(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(@gib CharSequence charSequence, @gib CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return md8.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean endsWith(@yfb CharSequence charSequence, char c, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && uw1.equals(charSequence.charAt(getLastIndex(charSequence)), c, z);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return endsWith(charSequence, c, z);
    }

    @gib
    public static final scc<Integer, String> findAnyOf(@yfb CharSequence charSequence, @yfb Collection<String> collection, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(collection, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, false);
    }

    private static final scc<Integer, String> findAnyOf$StringsKt__StringsKt(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object next;
        Object next2;
        if (!z && collection.size() == 1) {
            String str = (String) v82.single(collection);
            int iIndexOf$default = !z2 ? indexOf$default(charSequence, str, i, false, 4, (Object) null) : lastIndexOf$default(charSequence, str, i, false, 4, (Object) null);
            if (iIndexOf$default < 0) {
                return null;
            }
            return vkh.m24050to(Integer.valueOf(iIndexOf$default), str);
        }
        d78 f78Var = !z2 ? new f78(kpd.coerceAtLeast(i, 0), charSequence.length()) : kpd.downTo(kpd.coerceAtMost(i, getLastIndex(charSequence)), 0);
        if (charSequence instanceof String) {
            int first = f78Var.getFirst();
            int last = f78Var.getLast();
            int step = f78Var.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (h9g.regionMatches(str2, 0, (String) charSequence, first, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (first == last) {
                            break;
                        }
                        first += step;
                    } else {
                        return vkh.m24050to(Integer.valueOf(first), str3);
                    }
                }
            }
        } else {
            int first2 = f78Var.getFirst();
            int last2 = f78Var.getLast();
            int step2 = f78Var.getStep();
            if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (regionMatchesImpl(str4, 0, charSequence, first2, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    } else {
                        return vkh.m24050to(Integer.valueOf(first2), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ scc findAnyOf$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return findAnyOf(charSequence, collection, i, z);
    }

    @gib
    public static final scc<Integer, String> findLastAnyOf(@yfb CharSequence charSequence, @yfb Collection<String> collection, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(collection, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, true);
    }

    public static /* synthetic */ scc findLastAnyOf$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return findLastAnyOf(charSequence, collection, i, z);
    }

    @yfb
    public static final f78 getIndices(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return new f78(0, charSequence.length() - 1);
    }

    public static int getLastIndex(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return i >= 0 && i <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @t28
    private static final <C extends CharSequence & R, R> R ifBlank(C c, ny6<? extends R> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        return isBlank(c) ? ny6Var.invoke() : c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @t28
    private static final <C extends CharSequence & R, R> R ifEmpty(C c, ny6<? extends R> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        return c.length() == 0 ? ny6Var.invoke() : c;
    }

    public static final int indexOf(@yfb CharSequence charSequence, char c, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? indexOfAny(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        d78 f78Var = !z2 ? new f78(kpd.coerceAtLeast(i, 0), kpd.coerceAtMost(i2, charSequence.length())) : kpd.downTo(kpd.coerceAtMost(i, getLastIndex(charSequence)), kpd.coerceAtLeast(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int first = f78Var.getFirst();
            int last = f78Var.getLast();
            int step = f78Var.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return -1;
            }
            while (!regionMatchesImpl(charSequence2, 0, charSequence, first, charSequence2.length(), z)) {
                if (first == last) {
                    return -1;
                }
                first += step;
            }
            return first;
        }
        int first2 = f78Var.getFirst();
        int last2 = f78Var.getLast();
        int step2 = f78Var.getStep();
        if ((step2 <= 0 || first2 > last2) && (step2 >= 0 || last2 > first2)) {
            return -1;
        }
        while (true) {
            String str = (String) charSequence2;
            if (h9g.regionMatches(str, 0, (String) charSequence, first2, str.length(), z)) {
                return first2;
            }
            if (first2 == last2) {
                return -1;
            }
            first2 += step2;
        }
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOf(charSequence, c, i, z);
    }

    public static final int indexOfAny(@yfb CharSequence charSequence, @yfb char[] cArr, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(e80.single(cArr), i);
        }
        int iCoerceAtLeast = kpd.coerceAtLeast(i, 0);
        int lastIndex = getLastIndex(charSequence);
        if (iCoerceAtLeast > lastIndex) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iCoerceAtLeast);
            for (char c : cArr) {
                if (uw1.equals(c, cCharAt, z)) {
                    return iCoerceAtLeast;
                }
            }
            if (iCoerceAtLeast == lastIndex) {
                return -1;
            }
            iCoerceAtLeast++;
        }
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOfAny(charSequence, cArr, i, z);
    }

    public static boolean isBlank(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!tw1.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @t28
    private static final boolean isEmpty(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @t28
    private static final boolean isNotBlank(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return !isBlank(charSequence);
    }

    @t28
    private static final boolean isNotEmpty(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    @t28
    private static final boolean isNullOrBlank(CharSequence charSequence) {
        return charSequence == null || isBlank(charSequence);
    }

    @t28
    private static final boolean isNullOrEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @yfb
    public static final wv1 iterator(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return new C9229a(charSequence);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m17171l(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return indexOf$StringsKt__StringsKt(charSequence, charSequence2, i, i2, z, z2);
    }

    public static final int lastIndexOf(@yfb CharSequence charSequence, char c, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? lastIndexOfAny(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return lastIndexOf(charSequence, c, i, z);
    }

    public static final int lastIndexOfAny(@yfb CharSequence charSequence, @yfb char[] cArr, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(e80.single(cArr), i);
        }
        for (int iCoerceAtMost = kpd.coerceAtMost(i, getLastIndex(charSequence)); -1 < iCoerceAtMost; iCoerceAtMost--) {
            char cCharAt = charSequence.charAt(iCoerceAtMost);
            for (char c : cArr) {
                if (uw1.equals(c, cCharAt, z)) {
                    return iCoerceAtMost;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return lastIndexOfAny(charSequence, cArr, i, z);
    }

    @yfb
    public static final vye<String> lineSequence(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return new C9230b(charSequence);
    }

    @yfb
    public static List<String> lines(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return vze.toList(lineSequence(charSequence));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ vye m17172m(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArr, i, z, i2);
    }

    @t28
    private static final boolean matches(CharSequence charSequence, owd owdVar) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(owdVar, "regex");
        return owdVar.matches(charSequence);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ vye m17173n(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, strArr, i, z, i2);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ List m17174o(CharSequence charSequence, owd owdVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(owdVar, "regex");
        return owdVar.split(charSequence, i);
    }

    @t28
    private static final String orEmpty(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ vye m17175p(CharSequence charSequence, owd owdVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(owdVar, "regex");
        return owdVar.splitToSequence(charSequence, i);
    }

    @yfb
    public static final CharSequence padEnd(@yfb CharSequence charSequence, int i, char c) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(charSequence);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return sb;
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return padEnd(charSequence, i, c);
    }

    @yfb
    public static final CharSequence padStart(@yfb CharSequence charSequence, int i, char c) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return padStart(charSequence, i, c);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m17176q(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        md8.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    private static final vye<f78> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        requireNonNegativeLimit(i2);
        return new v54(charSequence, i, i2, new gz6() { // from class: j9g
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return m9g.rangesDelimitedBy$lambda$14$StringsKt__StringsKt(cArr, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final scc rangesDelimitedBy$lambda$14$StringsKt__StringsKt(char[] cArr, boolean z, CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "$this$DelimitedRangesSequence");
        int iIndexOfAny = indexOfAny(charSequence, cArr, i, z);
        if (iIndexOfAny < 0) {
            return null;
        }
        return vkh.m24050to(Integer.valueOf(iIndexOfAny), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final scc rangesDelimitedBy$lambda$16$StringsKt__StringsKt(List list, boolean z, CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "$this$DelimitedRangesSequence");
        scc<Integer, String> sccVarFindAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, list, i, z, false);
        if (sccVarFindAnyOf$StringsKt__StringsKt != null) {
            return vkh.m24050to(sccVarFindAnyOf$StringsKt__StringsKt.getFirst(), Integer.valueOf(sccVarFindAnyOf$StringsKt__StringsKt.getSecond().length()));
        }
        return null;
    }

    public static final boolean regionMatchesImpl(@yfb CharSequence charSequence, int i, @yfb CharSequence charSequence2, int i2, int i3, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!uw1.equals(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    @yfb
    public static final CharSequence removePrefix(@yfb CharSequence charSequence, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "prefix");
        return startsWith$default(charSequence, charSequence2, false, 2, (Object) null) ? charSequence.subSequence(charSequence2.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @yfb
    public static final CharSequence removeRange(@yfb CharSequence charSequence, int i, int i2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
        sb.append(charSequence, 0, i);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(charSequence, i2, charSequence.length());
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    @yfb
    public static final CharSequence removeSuffix(@yfb CharSequence charSequence, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "suffix");
        return endsWith$default(charSequence, charSequence2, false, 2, (Object) null) ? charSequence.subSequence(0, charSequence.length() - charSequence2.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @yfb
    public static final CharSequence removeSurrounding(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "suffix");
        return (charSequence.length() >= charSequence2.length() + charSequence3.length() && startsWith$default(charSequence, charSequence2, false, 2, (Object) null) && endsWith$default(charSequence, charSequence3, false, 2, (Object) null)) ? charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @t28
    private static final String replace(CharSequence charSequence, owd owdVar, String str) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(owdVar, "regex");
        md8.checkNotNullParameter(str, "replacement");
        return owdVar.replace(charSequence, str);
    }

    @yfb
    public static final String replaceAfter(@yfb String str, char c, @yfb String str2, @yfb String str3) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "replacement");
        md8.checkNotNullParameter(str3, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? str3 : replaceRange((CharSequence) str, iIndexOf$default + 1, str.length(), (CharSequence) str2).toString();
    }

    public static /* synthetic */ String replaceAfter$default(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return replaceAfter(str, c, str2, str3);
    }

    @yfb
    public static final String replaceAfterLast(@yfb String str, @yfb String str2, @yfb String str3, @yfb String str4) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "delimiter");
        md8.checkNotNullParameter(str3, "replacement");
        md8.checkNotNullParameter(str4, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? str4 : replaceRange((CharSequence) str, iLastIndexOf$default + str2.length(), str.length(), (CharSequence) str3).toString();
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return replaceAfterLast(str, str2, str3, str4);
    }

    @yfb
    public static final String replaceBefore(@yfb String str, char c, @yfb String str2, @yfb String str3) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "replacement");
        md8.checkNotNullParameter(str3, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? str3 : replaceRange((CharSequence) str, 0, iIndexOf$default, (CharSequence) str2).toString();
    }

    public static /* synthetic */ String replaceBefore$default(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return replaceBefore(str, c, str2, str3);
    }

    @yfb
    public static final String replaceBeforeLast(@yfb String str, char c, @yfb String str2, @yfb String str3) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "replacement");
        md8.checkNotNullParameter(str3, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? str3 : replaceRange((CharSequence) str, 0, iLastIndexOf$default, (CharSequence) str2).toString();
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return replaceBeforeLast(str, c, str2, str3);
    }

    @t28
    private static final String replaceFirst(CharSequence charSequence, owd owdVar, String str) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(owdVar, "regex");
        md8.checkNotNullParameter(str, "replacement");
        return owdVar.replaceFirst(charSequence, str);
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "replaceFirstCharWithChar")
    @ihi(markerClass = {rh5.class})
    private static final String replaceFirstCharWithChar(String str, qy6<? super Character, Character> qy6Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        if (str.length() <= 0) {
            return str;
        }
        char cCharValue = qy6Var.invoke(Character.valueOf(str.charAt(0))).charValue();
        String strSubstring = str.substring(1);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return cCharValue + strSubstring;
    }

    @r9c
    @jjf(version = "1.5")
    @t28
    @xn8(name = "replaceFirstCharWithCharSequence")
    @ihi(markerClass = {rh5.class})
    private static final String replaceFirstCharWithCharSequence(String str, qy6<? super Character, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "transform");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) qy6Var.invoke(Character.valueOf(str.charAt(0))));
        String strSubstring = str.substring(1);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @yfb
    public static CharSequence replaceRange(@yfb CharSequence charSequence, int i, int i2, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            md8.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            md8.checkNotNullExpressionValue(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    public static final void requireNonNegativeLimit(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    @yfb
    public static final List<String> split(@yfb CharSequence charSequence, @yfb String[] strArr, boolean z, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return split$StringsKt__StringsKt(charSequence, str, z, i);
            }
        }
        Iterable iterableAsIterable = vze.asIterable(m17173n(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(iterableAsIterable, 10));
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (f78) it.next()));
        }
        return arrayList;
    }

    private static final List<String> split$StringsKt__StringsKt(CharSequence charSequence, String str, boolean z, int i) {
        requireNonNegativeLimit(i);
        int length = 0;
        int iIndexOf = indexOf(charSequence, str, 0, z);
        if (iIndexOf == -1 || i == 1) {
            return k82.listOf(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? kpd.coerceAtMost(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iIndexOf).toString());
            length = str.length() + iIndexOf;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iIndexOf = indexOf(charSequence, str, length, z);
        } while (iIndexOf != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return split(charSequence, strArr, z, i);
    }

    @yfb
    public static final vye<String> splitToSequence(@yfb final CharSequence charSequence, @yfb String[] strArr, boolean z, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(strArr, "delimiters");
        return vze.map(m17173n(charSequence, strArr, 0, z, i, 2, null), new qy6() { // from class: l9g
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return m9g.splitToSequence$lambda$18$StringsKt__StringsKt(charSequence, (f78) obj);
            }
        });
    }

    public static /* synthetic */ vye splitToSequence$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return splitToSequence(charSequence, strArr, z, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String splitToSequence$lambda$18$StringsKt__StringsKt(CharSequence charSequence, f78 f78Var) {
        md8.checkNotNullParameter(f78Var, "it");
        return substring(charSequence, f78Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String splitToSequence$lambda$20$StringsKt__StringsKt(CharSequence charSequence, f78 f78Var) {
        md8.checkNotNullParameter(f78Var, "it");
        return substring(charSequence, f78Var);
    }

    public static final boolean startsWith(@yfb CharSequence charSequence, char c, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && uw1.equals(charSequence.charAt(0), c, z);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startsWith(charSequence, c, z);
    }

    @yfb
    public static final CharSequence subSequence(@yfb CharSequence charSequence, @yfb f78 f78Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(f78Var, "range");
        return charSequence.subSequence(f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @yfb
    public static final String substring(@yfb String str, @yfb f78 f78Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(f78Var, "range");
        String strSubstring = str.substring(f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @yfb
    public static String substringAfter(@yfb String str, char c, @yfb String str2) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return str2;
        }
        String strSubstring = str.substring(iIndexOf$default + 1, str.length());
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfter$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringAfter(str, c, str2);
    }

    @yfb
    public static String substringAfterLast(@yfb String str, char c, @yfb String str2) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf$default + 1, str.length());
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringAfterLast(str, c, str2);
    }

    @yfb
    public static final String substringBefore(@yfb String str, char c, @yfb String str2) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBefore$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringBefore(str, c, str2);
    }

    @yfb
    public static final String substringBeforeLast(@yfb String str, char c, @yfb String str2) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringBeforeLast(str, c, str2);
    }

    @jjf(version = "1.5")
    public static final boolean toBooleanStrict(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        if (md8.areEqual(str, "true")) {
            return true;
        }
        if (md8.areEqual(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    @gib
    @jjf(version = "1.5")
    public static Boolean toBooleanStrictOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        if (md8.areEqual(str, "true")) {
            return Boolean.TRUE;
        }
        if (md8.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    @yfb
    public static final CharSequence trim(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zBooleanValue = qy6Var.invoke(Character.valueOf(charSequence.charAt(!z ? i : length))).booleanValue();
            if (z) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @yfb
    public static final CharSequence trimEnd(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!qy6Var.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    @yfb
    public static final CharSequence trimStart(@yfb CharSequence charSequence, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!qy6Var.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return contains(charSequence, c, z);
    }

    public static final boolean endsWith(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "suffix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? h9g.endsWith$default((String) charSequence, (String) charSequence2, false, 2, null) : regionMatchesImpl(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return endsWith(charSequence, charSequence2, z);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOf(charSequence, str, i, z);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOfAny(charSequence, (Collection<String>) collection, i, z);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return lastIndexOf(charSequence, str, i, z);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return lastIndexOfAny(charSequence, (Collection<String>) collection, i, z);
    }

    public static /* synthetic */ String padEnd$default(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return padEnd(str, i, c);
    }

    public static /* synthetic */ String padStart$default(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return padStart(str, i, c);
    }

    @t28
    private static final String replace(CharSequence charSequence, owd owdVar, qy6<? super wv9, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(owdVar, "regex");
        md8.checkNotNullParameter(qy6Var, "transform");
        return owdVar.replace(charSequence, qy6Var);
    }

    public static /* synthetic */ String replaceAfter$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return replaceAfter(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return replaceAfterLast(str, c, str2, str3);
    }

    public static /* synthetic */ String replaceBefore$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return replaceBefore(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return replaceBeforeLast(str, str2, str3, str4);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return split(charSequence, cArr, z, i);
    }

    @yfb
    public static final vye<String> splitToSequence(@yfb final CharSequence charSequence, @yfb char[] cArr, boolean z, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(cArr, "delimiters");
        return vze.map(m17172m(charSequence, cArr, 0, z, i, 2, null), new qy6() { // from class: i9g
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return m9g.splitToSequence$lambda$20$StringsKt__StringsKt(charSequence, (f78) obj);
            }
        });
    }

    public static /* synthetic */ vye splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return splitToSequence(charSequence, cArr, z, i);
    }

    public static final boolean startsWith(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? h9g.startsWith$default((String) charSequence, (String) charSequence2, false, 2, null) : regionMatchesImpl(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startsWith(charSequence, charSequence2, z);
    }

    @t28
    @q64(message = "Use parameters named startIndex and endIndex.", replaceWith = @i2e(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    private static final CharSequence subSequence(String str, int i, int i2) {
        md8.checkNotNullParameter(str, "<this>");
        return str.subSequence(i, i2);
    }

    @t28
    private static final String substring(CharSequence charSequence, int i, int i2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringAfter(str, str2, str3);
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringAfterLast(str, str2, str3);
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringBefore(str, str2, str3);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringBeforeLast(str, str2, str3);
    }

    private static final vye<f78> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        requireNonNegativeLimit(i2);
        final List listAsList = u70.asList(strArr);
        return new v54(charSequence, i, i2, new gz6() { // from class: k9g
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return m9g.rangesDelimitedBy$lambda$16$StringsKt__StringsKt(listAsList, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    @yfb
    public static final String replaceAfter(@yfb String str, @yfb String str2, @yfb String str3, @yfb String str4) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "delimiter");
        md8.checkNotNullParameter(str3, "replacement");
        md8.checkNotNullParameter(str4, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? str4 : replaceRange((CharSequence) str, iIndexOf$default + str2.length(), str.length(), (CharSequence) str3).toString();
    }

    @yfb
    public static final String replaceAfterLast(@yfb String str, char c, @yfb String str2, @yfb String str3) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "replacement");
        md8.checkNotNullParameter(str3, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? str3 : replaceRange((CharSequence) str, iLastIndexOf$default + 1, str.length(), (CharSequence) str2).toString();
    }

    @yfb
    public static final String replaceBefore(@yfb String str, @yfb String str2, @yfb String str3, @yfb String str4) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "delimiter");
        md8.checkNotNullParameter(str3, "replacement");
        md8.checkNotNullParameter(str4, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? str4 : replaceRange((CharSequence) str, 0, iIndexOf$default, (CharSequence) str3).toString();
    }

    @yfb
    public static final String replaceBeforeLast(@yfb String str, @yfb String str2, @yfb String str3, @yfb String str4) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "delimiter");
        md8.checkNotNullParameter(str3, "replacement");
        md8.checkNotNullParameter(str4, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? str4 : replaceRange((CharSequence) str, 0, iLastIndexOf$default, (CharSequence) str3).toString();
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @t28
    private static final vye<String> splitToSequence(CharSequence charSequence, owd owdVar, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(owdVar, "regex");
        return owdVar.splitToSequence(charSequence, i);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return startsWith(charSequence, charSequence2, i, z);
    }

    @yfb
    public static final String substring(@yfb CharSequence charSequence, @yfb f78 f78Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(f78Var, "range");
        return charSequence.subSequence(f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1).toString();
    }

    @yfb
    public static String substringAfter(@yfb String str, @yfb String str2, @yfb String str3) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "delimiter");
        md8.checkNotNullParameter(str3, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return str3;
        }
        String strSubstring = str.substring(iIndexOf$default + str2.length(), str.length());
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @yfb
    public static final String substringAfterLast(@yfb String str, @yfb String str2, @yfb String str3) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "delimiter");
        md8.checkNotNullParameter(str3, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return str3;
        }
        String strSubstring = str.substring(iLastIndexOf$default + str2.length(), str.length());
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @yfb
    public static final String substringBefore(@yfb String str, @yfb String str2, @yfb String str3) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "delimiter");
        md8.checkNotNullParameter(str3, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @yfb
    public static final String substringBeforeLast(@yfb String str, @yfb String str2, @yfb String str3) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "delimiter");
        md8.checkNotNullParameter(str3, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean contains(@yfb CharSequence charSequence, char c, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return indexOf$default(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    public static final int indexOf(@yfb CharSequence charSequence, @yfb String str, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(str, ymh.InterfaceC15723b.f102127e);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m17171l(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    public static final int lastIndexOf(@yfb CharSequence charSequence, @yfb String str, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(str, ymh.InterfaceC15723b.f102127e);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return indexOf$StringsKt__StringsKt(charSequence, str, i, 0, z, true);
    }

    @yfb
    public static String removePrefix(@yfb String str, @yfb CharSequence charSequence) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(charSequence, "prefix");
        if (!startsWith$default((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @yfb
    public static String removeSuffix(@yfb String str, @yfb CharSequence charSequence) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(charSequence, "suffix");
        if (!endsWith$default((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @yfb
    public static final String removeSurrounding(@yfb String str, @yfb CharSequence charSequence, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(charSequence, "prefix");
        md8.checkNotNullParameter(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !startsWith$default((CharSequence) str, charSequence, false, 2, (Object) null) || !endsWith$default((CharSequence) str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @t28
    private static final String trim(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return trim((CharSequence) str).toString();
    }

    @t28
    private static final boolean contains(CharSequence charSequence, owd owdVar) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(owdVar, "regex");
        return owdVar.containsMatchIn(charSequence);
    }

    public static final boolean startsWith(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return h9g.startsWith$default((String) charSequence, (String) charSequence2, i, false, 4, null);
        }
        return regionMatchesImpl(charSequence, i, charSequence2, 0, charSequence2.length(), z);
    }

    @yfb
    public static final String trim(@yfb String str, @yfb qy6<? super Character, Boolean> qy6Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zBooleanValue = qy6Var.invoke(Character.valueOf(str.charAt(!z ? i : length))).booleanValue();
            if (z) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @t28
    private static final String trimEnd(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return trimEnd((CharSequence) str).toString();
    }

    @t28
    private static final String trimStart(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return trimStart((CharSequence) str).toString();
    }

    @t28
    private static final String removeRange(String str, int i, int i2) {
        md8.checkNotNullParameter(str, "<this>");
        return removeRange((CharSequence) str, i, i2).toString();
    }

    @yfb
    public static final CharSequence removeSurrounding(@yfb CharSequence charSequence, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(charSequence2, "delimiter");
        return removeSurrounding(charSequence, charSequence2, charSequence2);
    }

    @t28
    private static final String replaceRange(String str, int i, int i2, CharSequence charSequence) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(charSequence, "replacement");
        return replaceRange((CharSequence) str, i, i2, charSequence).toString();
    }

    @yfb
    public static final String trimEnd(@yfb String str, @yfb qy6<? super Character, Boolean> qy6Var) {
        CharSequence charSequenceSubSequence;
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!qy6Var.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    @yfb
    public static final String trimStart(@yfb String str, @yfb qy6<? super Character, Boolean> qy6Var) {
        CharSequence charSequenceSubSequence;
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(qy6Var, "predicate");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!qy6Var.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                    charSequenceSubSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            } else {
                charSequenceSubSequence = "";
                break;
            }
        }
        return charSequenceSubSequence.toString();
    }

    @yfb
    public static final CharSequence removeRange(@yfb CharSequence charSequence, @yfb f78 f78Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(f78Var, "range");
        return removeRange(charSequence, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1);
    }

    @yfb
    public static String removeSurrounding(@yfb String str, @yfb CharSequence charSequence) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(charSequence, "delimiter");
        return removeSurrounding(str, charSequence, charSequence);
    }

    @yfb
    public static final CharSequence replaceRange(@yfb CharSequence charSequence, @yfb f78 f78Var, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(f78Var, "range");
        md8.checkNotNullParameter(charSequence2, "replacement");
        return replaceRange(charSequence, f78Var.getStart().intValue(), f78Var.getEndInclusive().intValue() + 1, charSequence2);
    }

    public static final int indexOfAny(@yfb CharSequence charSequence, @yfb Collection<String> collection, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(collection, "strings");
        scc<Integer, String> sccVarFindAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, false);
        if (sccVarFindAnyOf$StringsKt__StringsKt != null) {
            return sccVarFindAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    public static final int lastIndexOfAny(@yfb CharSequence charSequence, @yfb Collection<String> collection, int i, boolean z) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(collection, "strings");
        scc<Integer, String> sccVarFindAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, true);
        if (sccVarFindAnyOf$StringsKt__StringsKt != null) {
            return sccVarFindAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    @yfb
    public static final String padEnd(@yfb String str, int i, char c) {
        md8.checkNotNullParameter(str, "<this>");
        return padEnd((CharSequence) str, i, c).toString();
    }

    @yfb
    public static String padStart(@yfb String str, int i, char c) {
        md8.checkNotNullParameter(str, "<this>");
        return padStart((CharSequence) str, i, c).toString();
    }

    @t28
    private static final String removeRange(String str, f78 f78Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(f78Var, "range");
        return removeRange((CharSequence) str, f78Var).toString();
    }

    @t28
    private static final String replaceRange(String str, f78 f78Var, CharSequence charSequence) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(f78Var, "range");
        md8.checkNotNullParameter(charSequence, "replacement");
        return replaceRange((CharSequence) str, f78Var, charSequence).toString();
    }

    @yfb
    public static final CharSequence trim(@yfb CharSequence charSequence, @yfb char... cArr) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(cArr, "chars");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zContains = e80.contains(cArr, charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @yfb
    public static final List<String> split(@yfb CharSequence charSequence, @yfb char[] cArr, boolean z, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(cArr, "delimiters");
        if (cArr.length == 1) {
            return split$StringsKt__StringsKt(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable iterableAsIterable = vze.asIterable(m17172m(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(iterableAsIterable, 10));
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (f78) it.next()));
        }
        return arrayList;
    }

    @yfb
    public static final CharSequence trimEnd(@yfb CharSequence charSequence, @yfb char... cArr) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(cArr, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!e80.contains(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    @yfb
    public static final CharSequence trimStart(@yfb CharSequence charSequence, @yfb char... cArr) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(cArr, "chars");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!e80.contains(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @yfb
    public static final String trim(@yfb String str, @yfb char... cArr) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(cArr, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zContains = e80.contains(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @yfb
    public static final String trimEnd(@yfb String str, @yfb char... cArr) {
        CharSequence charSequenceSubSequence;
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!e80.contains(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    @yfb
    public static String trimStart(@yfb String str, @yfb char... cArr) {
        CharSequence charSequenceSubSequence;
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(cArr, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!e80.contains(cArr, str.charAt(i))) {
                    charSequenceSubSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            } else {
                charSequenceSubSequence = "";
                break;
            }
        }
        return charSequenceSubSequence.toString();
    }

    @yfb
    public static CharSequence trim(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zIsWhitespace = tw1.isWhitespace(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zIsWhitespace) {
                    break;
                }
                length--;
            } else if (zIsWhitespace) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @t28
    private static final List<String> split(CharSequence charSequence, owd owdVar, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(owdVar, "regex");
        return owdVar.split(charSequence, i);
    }

    @yfb
    public static final CharSequence trimEnd(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!tw1.isWhitespace(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    @yfb
    public static final CharSequence trimStart(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!tw1.isWhitespace(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }
}
