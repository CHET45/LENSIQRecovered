package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,129:1\n119#1,2:131\n121#1,4:146\n126#1,2:159\n119#1,2:168\n121#1,4:183\n126#1,2:190\n1#2:130\n1#2:156\n1#2:187\n1#2:211\n1577#3,11:133\n1872#3,2:144\n1874#3:157\n1588#3:158\n774#3:161\n865#3,2:162\n1557#3:164\n1628#3,3:165\n1577#3,11:170\n1872#3,2:181\n1874#3:188\n1588#3:189\n1577#3,11:198\n1872#3,2:209\n1874#3:212\n1588#3:213\n158#4,6:150\n158#4,6:192\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n42#1:131,2\n42#1:146,4\n42#1:159,2\n83#1:168,2\n83#1:183,4\n83#1:190,2\n42#1:156\n83#1:187\n120#1:211\n42#1:133,11\n42#1:144,2\n42#1:157\n42#1:158\n79#1:161\n79#1:162,2\n80#1:164\n80#1:165,3\n83#1:170,11\n83#1:181,2\n83#1:188\n83#1:189\n120#1:198,11\n120#1:209,2\n120#1:212\n120#1:213\n43#1:150,6\n107#1:192,6\n*E\n"})
public class a9g extends w8g {
    private static final qy6<String, String> getIndentFunction$StringsKt__IndentKt(final String str) {
        return str.length() == 0 ? new qy6() { // from class: y8g
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return a9g.getIndentFunction$lambda$8$StringsKt__IndentKt((String) obj);
            }
        } : new qy6() { // from class: z8g
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return a9g.getIndentFunction$lambda$9$StringsKt__IndentKt(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIndentFunction$lambda$8$StringsKt__IndentKt(String str) {
        md8.checkNotNullParameter(str, "line");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIndentFunction$lambda$9$StringsKt__IndentKt(String str, String str2) {
        md8.checkNotNullParameter(str2, "line");
        return str + str2;
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!tw1.isWhitespace(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    @yfb
    public static final String prependIndent(@yfb String str, @yfb final String str2) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "indent");
        return vze.joinToString$default(vze.map(m9g.lineSequence(str), new qy6() { // from class: x8g
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return a9g.prependIndent$lambda$5$StringsKt__IndentKt(str2, (String) obj);
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = pl8.f71328a;
        }
        return prependIndent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prependIndent$lambda$5$StringsKt__IndentKt(String str, String str2) {
        md8.checkNotNullParameter(str2, "it");
        if (m9g.isBlank(str2)) {
            return str2.length() < str.length() ? str : str2;
        }
        return str + str2;
    }

    private static final String reindent$StringsKt__IndentKt(List<String> list, int i, qy6<? super String, String> qy6Var, qy6<? super String, String> qy6Var2) {
        String strInvoke;
        int lastIndex = l82.getLastIndex(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (!dxc.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                l82.throwIndexOverflow();
            }
            String str = (String) obj;
            if ((i2 == 0 || i2 == lastIndex) && m9g.isBlank(str)) {
                str = null;
            } else {
                String strInvoke2 = qy6Var2.invoke(str);
                if (strInvoke2 != null && (strInvoke = qy6Var.invoke(strInvoke2)) != null) {
                    str = strInvoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        return ((StringBuilder) v82.joinTo(arrayList, new StringBuilder(i), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    @yfb
    public static final String replaceIndent(@yfb String str, @yfb String str2) {
        String strInvoke;
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "newIndent");
        List<String> listLines = m9g.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLines) {
            if (!m9g.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m82.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt((String) it.next())));
        }
        Integer num = (Integer) v82.minOrNull((Iterable) arrayList2);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listLines.size());
        qy6<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
        int lastIndex = l82.getLastIndex(listLines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLines) {
            int i2 = i + 1;
            if (i < 0) {
                l82.throwIndexOverflow();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == lastIndex) && m9g.isBlank(str3)) {
                str3 = null;
            } else {
                String strDrop = t9g.drop(str3, iIntValue);
                if (strDrop != null && (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strDrop)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        return ((StringBuilder) v82.joinTo(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return replaceIndent(str, str2);
    }

    @yfb
    public static final String replaceIndentByMargin(@yfb String str, @yfb String str2, @yfb String str3) {
        int i;
        String strInvoke;
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "newIndent");
        md8.checkNotNullParameter(str3, "marginPrefix");
        if (m9g.isBlank(str3)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listLines = m9g.lines(str);
        int length = str.length() + (str2.length() * listLines.size());
        qy6<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
        int lastIndex = l82.getLastIndex(listLines);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : listLines) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                l82.throwIndexOverflow();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i2 == 0 || i2 == lastIndex) && m9g.isBlank(str4)) {
                str4 = null;
            } else {
                int length2 = str4.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i = -1;
                        break;
                    }
                    if (!tw1.isWhitespace(str4.charAt(i4))) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
                if (i != -1) {
                    int i5 = i;
                    if (h9g.startsWith$default(str4, str3, i, false, 4, null)) {
                        int length3 = i5 + str3.length();
                        md8.checkNotNull(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strSubstring)) != null) {
                    str4 = strInvoke;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i2 = i3;
        }
        return ((StringBuilder) v82.joinTo(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = es7.f33958g;
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    @cd8
    @yfb
    public static String trimIndent(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        return replaceIndent(str, "");
    }

    @cd8
    @yfb
    public static final String trimMargin(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(str2, "marginPrefix");
        return replaceIndentByMargin(str, "", str2);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = es7.f33958g;
        }
        return trimMargin(str, str2);
    }
}
