package p000;

import java.util.ArrayList;
import java.util.List;
import p000.C9041lz;

/* JADX INFO: renamed from: mz */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1269:1\n33#2,6:1270\n235#2,3:1276\n33#2,4:1279\n238#2,2:1283\n38#2:1285\n240#2:1286\n151#2,3:1287\n33#2,4:1290\n154#2,2:1294\n38#2:1296\n156#2:1297\n235#2,3:1298\n33#2,4:1301\n238#2,2:1305\n38#2:1307\n240#2:1308\n151#2,3:1309\n33#2,4:1312\n154#2,2:1316\n38#2:1318\n156#2:1319\n235#2,3:1320\n33#2,4:1323\n238#2,2:1327\n38#2:1329\n240#2:1330\n151#2,3:1331\n33#2,4:1334\n154#2,2:1338\n38#2:1340\n156#2:1341\n151#2,3:1342\n33#2,4:1345\n154#2,2:1349\n38#2:1351\n156#2:1352\n235#2,3:1354\n33#2,4:1357\n238#2,2:1361\n38#2:1363\n240#2:1364\n151#2,3:1365\n33#2,4:1368\n154#2,2:1372\n38#2:1374\n156#2:1375\n1#3:1353\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n788#1:1270,6\n824#1:1276,3\n824#1:1279,4\n824#1:1283,2\n824#1:1285\n824#1:1286\n825#1:1287,3\n825#1:1290,4\n825#1:1294,2\n825#1:1296\n825#1:1297\n851#1:1298,3\n851#1:1301,4\n851#1:1305,2\n851#1:1307\n851#1:1308\n852#1:1309,3\n852#1:1312,4\n852#1:1316,2\n852#1:1318\n852#1:1319\n878#1:1320,3\n878#1:1323,4\n878#1:1327,2\n878#1:1329\n878#1:1330\n879#1:1331,3\n879#1:1334,4\n879#1:1338,2\n879#1:1340\n879#1:1341\n915#1:1342,3\n915#1:1345,4\n915#1:1349,2\n915#1:1351\n915#1:1352\n1191#1:1354,3\n1191#1:1357,4\n1191#1:1361,2\n1191#1:1363\n1191#1:1364\n1191#1:1365,3\n1191#1:1368,4\n1191#1:1372,2\n1191#1:1374\n1191#1:1375\n*E\n"})
public final class C9611mz {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C9041lz f62825a = new C9041lz("", null, null, 6, null);

    /* JADX INFO: renamed from: mz$a */
    public static final class a extends tt8 implements kz6<String, Integer, Integer, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ye9 f62826a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ye9 ye9Var) {
            super(3);
            this.f62826a = ye9Var;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
            return invoke(str, num.intValue(), num2.intValue());
        }

        @yfb
        public final String invoke(@yfb String str, int i, int i2) {
            if (i == 0) {
                String strSubstring = str.substring(i, i2);
                md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return b8g.capitalize(strSubstring, this.f62826a);
            }
            String strSubstring2 = str.substring(i, i2);
            md8.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
    }

    /* JADX INFO: renamed from: mz$b */
    public static final class b extends tt8 implements kz6<String, Integer, Integer, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ye9 f62827a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ye9 ye9Var) {
            super(3);
            this.f62827a = ye9Var;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
            return invoke(str, num.intValue(), num2.intValue());
        }

        @yfb
        public final String invoke(@yfb String str, int i, int i2) {
            if (i == 0) {
                String strSubstring = str.substring(i, i2);
                md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return b8g.decapitalize(strSubstring, this.f62827a);
            }
            String strSubstring2 = str.substring(i, i2);
            md8.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
    }

    /* JADX INFO: renamed from: mz$c */
    public static final class c extends tt8 implements kz6<String, Integer, Integer, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ye9 f62828a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ye9 ye9Var) {
            super(3);
            this.f62828a = ye9Var;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
            return invoke(str, num.intValue(), num2.intValue());
        }

        @yfb
        public final String invoke(@yfb String str, int i, int i2) {
            String strSubstring = str.substring(i, i2);
            md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return b8g.toLowerCase(strSubstring, this.f62828a);
        }
    }

    /* JADX INFO: renamed from: mz$d */
    public static final class d extends tt8 implements kz6<String, Integer, Integer, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ye9 f62829a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ye9 ye9Var) {
            super(3);
            this.f62829a = ye9Var;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
            return invoke(str, num.intValue(), num2.intValue());
        }

        @yfb
        public final String invoke(@yfb String str, int i, int i2) {
            String strSubstring = str.substring(i, i2);
            md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return b8g.toUpperCase(strSubstring, this.f62829a);
        }
    }

    @yfb
    public static final C9041lz AnnotatedString(@yfb String str, @yfb swf swfVar, @gib kdc kdcVar) {
        return new C9041lz(str, k82.listOf(new C9041lz.c(swfVar, 0, str.length())), kdcVar == null ? l82.emptyList() : k82.listOf(new C9041lz.c(kdcVar, 0, str.length())));
    }

    public static /* synthetic */ C9041lz AnnotatedString$default(String str, swf swfVar, kdc kdcVar, int i, Object obj) {
        if ((i & 4) != 0) {
            kdcVar = null;
        }
        return AnnotatedString(str, swfVar, kdcVar);
    }

    @yfb
    public static final C9041lz buildAnnotatedString(@yfb qy6<? super C9041lz.a, bth> qy6Var) {
        C9041lz.a aVar = new C9041lz.a(0, 1, null);
        qy6Var.invoke(aVar);
        return aVar.toAnnotatedString();
    }

    @yfb
    public static final C9041lz capitalize(@yfb C9041lz c9041lz, @yfb ye9 ye9Var) {
        return fn8.transform(c9041lz, new a(ye9Var));
    }

    public static /* synthetic */ C9041lz capitalize$default(C9041lz c9041lz, ye9 ye9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ye9Var = ye9.f101294c.getCurrent();
        }
        return capitalize(c9041lz, ye9Var);
    }

    public static final boolean contains(int i, int i2, int i3, int i4) {
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if ((i3 == i4) != (i == i2)) {
                return false;
            }
        }
        return true;
    }

    @yfb
    public static final C9041lz decapitalize(@yfb C9041lz c9041lz, @yfb ye9 ye9Var) {
        return fn8.transform(c9041lz, new b(ye9Var));
    }

    public static /* synthetic */ C9041lz decapitalize$default(C9041lz c9041lz, ye9 ye9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ye9Var = ye9.f101294c.getCurrent();
        }
        return decapitalize(c9041lz, ye9Var);
    }

    @yfb
    public static final C9041lz emptyAnnotatedString() {
        return f62825a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<C9041lz.c<T>> filterRanges(List<? extends C9041lz.c<? extends T>> list, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C9041lz.c<? extends T> cVar = list.get(i3);
            C9041lz.c<? extends T> cVar2 = cVar;
            if (intersect(i, i2, cVar2.getStart(), cVar2.getEnd())) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C9041lz.c cVar3 = (C9041lz.c) arrayList.get(i4);
            arrayList2.add(new C9041lz.c(cVar3.getItem(), Math.max(i, cVar3.getStart()) - i, Math.min(i2, cVar3.getEnd()) - i, cVar3.getTag()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C9041lz.c<? extends Object>> getLocalAnnotations(C9041lz c9041lz, int i, int i2) {
        List<C9041lz.c<? extends Object>> annotations$ui_text_release;
        if (i == i2 || (annotations$ui_text_release = c9041lz.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i == 0 && i2 >= c9041lz.getText().length()) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
        int size = annotations$ui_text_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            C9041lz.c<? extends Object> cVar = annotations$ui_text_release.get(i3);
            C9041lz.c<? extends Object> cVar2 = cVar;
            if (intersect(i, i2, cVar2.getStart(), cVar2.getEnd())) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C9041lz.c cVar3 = (C9041lz.c) arrayList.get(i4);
            arrayList2.add(new C9041lz.c(cVar3.getItem(), kpd.coerceIn(cVar3.getStart(), i, i2) - i, kpd.coerceIn(cVar3.getEnd(), i, i2) - i, cVar3.getTag()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C9041lz.c<kdc>> getLocalParagraphStyles(C9041lz c9041lz, int i, int i2) {
        List<C9041lz.c<kdc>> paragraphStylesOrNull$ui_text_release;
        if (i == i2 || (paragraphStylesOrNull$ui_text_release = c9041lz.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i == 0 && i2 >= c9041lz.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            C9041lz.c<kdc> cVar = paragraphStylesOrNull$ui_text_release.get(i3);
            C9041lz.c<kdc> cVar2 = cVar;
            if (intersect(i, i2, cVar2.getStart(), cVar2.getEnd())) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C9041lz.c cVar3 = (C9041lz.c) arrayList.get(i4);
            arrayList2.add(new C9041lz.c(cVar3.getItem(), kpd.coerceIn(cVar3.getStart(), i, i2) - i, kpd.coerceIn(cVar3.getEnd(), i, i2) - i));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C9041lz.c<swf>> getLocalSpanStyles(C9041lz c9041lz, int i, int i2) {
        List<C9041lz.c<swf>> spanStylesOrNull$ui_text_release;
        if (i == i2 || (spanStylesOrNull$ui_text_release = c9041lz.getSpanStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i == 0 && i2 >= c9041lz.getText().length()) {
            return spanStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
        int size = spanStylesOrNull$ui_text_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            C9041lz.c<swf> cVar = spanStylesOrNull$ui_text_release.get(i3);
            C9041lz.c<swf> cVar2 = cVar;
            if (intersect(i, i2, cVar2.getStart(), cVar2.getEnd())) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C9041lz.c cVar3 = (C9041lz.c) arrayList.get(i4);
            arrayList2.add(new C9041lz.c(cVar3.getItem(), kpd.coerceIn(cVar3.getStart(), i, i2) - i, kpd.coerceIn(cVar3.getEnd(), i, i2) - i));
        }
        return arrayList2;
    }

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        return Math.max(i, i3) < Math.min(i2, i4) || contains(i, i2, i3, i4) || contains(i3, i4, i, i2);
    }

    @yfb
    public static final <T> List<T> mapEachParagraphStyle(@yfb C9041lz c9041lz, @yfb kdc kdcVar, @yfb gz6<? super C9041lz, ? super C9041lz.c<kdc>, ? extends T> gz6Var) {
        List<C9041lz.c<kdc>> listNormalizedParagraphStyles = normalizedParagraphStyles(c9041lz, kdcVar);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            C9041lz.c<kdc> cVar = listNormalizedParagraphStyles.get(i);
            arrayList.add(gz6Var.invoke(substringWithoutParagraphStyles(c9041lz, cVar.getStart(), cVar.getEnd()), cVar));
        }
        return arrayList;
    }

    @yfb
    public static final List<C9041lz.c<kdc>> normalizedParagraphStyles(@yfb C9041lz c9041lz, @yfb kdc kdcVar) {
        int length = c9041lz.getText().length();
        List<C9041lz.c<kdc>> paragraphStylesOrNull$ui_text_release = c9041lz.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null) {
            paragraphStylesOrNull$ui_text_release = l82.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = paragraphStylesOrNull$ui_text_release.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C9041lz.c<kdc> cVar = paragraphStylesOrNull$ui_text_release.get(i);
            kdc kdcVarComponent1 = cVar.component1();
            int iComponent2 = cVar.component2();
            int iComponent3 = cVar.component3();
            if (iComponent2 != i2) {
                arrayList.add(new C9041lz.c(kdcVar, i2, iComponent2));
            }
            arrayList.add(new C9041lz.c(kdcVar.merge(kdcVarComponent1), iComponent2, iComponent3));
            i++;
            i2 = iComponent3;
        }
        if (i2 != length) {
            arrayList.add(new C9041lz.c(kdcVar, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C9041lz.c(kdcVar, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C9041lz substringWithoutParagraphStyles(C9041lz c9041lz, int i, int i2) {
        String strSubstring;
        if (i != i2) {
            strSubstring = c9041lz.getText().substring(i, i2);
            md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new C9041lz(strSubstring, getLocalSpanStyles(c9041lz, i, i2), null, null, 12, null);
    }

    @yfb
    public static final C9041lz toLowerCase(@yfb C9041lz c9041lz, @yfb ye9 ye9Var) {
        return fn8.transform(c9041lz, new c(ye9Var));
    }

    public static /* synthetic */ C9041lz toLowerCase$default(C9041lz c9041lz, ye9 ye9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ye9Var = ye9.f101294c.getCurrent();
        }
        return toLowerCase(c9041lz, ye9Var);
    }

    @yfb
    public static final C9041lz toUpperCase(@yfb C9041lz c9041lz, @yfb ye9 ye9Var) {
        return fn8.transform(c9041lz, new d(ye9Var));
    }

    public static /* synthetic */ C9041lz toUpperCase$default(C9041lz c9041lz, ye9 ye9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ye9Var = ye9.f101294c.getCurrent();
        }
        return toUpperCase(c9041lz, ye9Var);
    }

    @yfb
    @th5
    public static final <R> R withAnnotation(@yfb C9041lz.a aVar, @yfb String str, @yfb String str2, @yfb qy6<? super C9041lz.a, ? extends R> qy6Var) {
        int iPushStringAnnotation = aVar.pushStringAnnotation(str, str2);
        try {
            return qy6Var.invoke(aVar);
        } finally {
            o28.finallyStart(1);
            aVar.pop(iPushStringAnnotation);
            o28.finallyEnd(1);
        }
    }

    @yfb
    public static final <R> R withLink(@yfb C9041lz.a aVar, @yfb b79 b79Var, @yfb qy6<? super C9041lz.a, ? extends R> qy6Var) {
        int iPushLink = aVar.pushLink(b79Var);
        try {
            return qy6Var.invoke(aVar);
        } finally {
            o28.finallyStart(1);
            aVar.pop(iPushLink);
            o28.finallyEnd(1);
        }
    }

    @yfb
    public static final <R> R withStyle(@yfb C9041lz.a aVar, @yfb swf swfVar, @yfb qy6<? super C9041lz.a, ? extends R> qy6Var) {
        int iPushStyle = aVar.pushStyle(swfVar);
        try {
            return qy6Var.invoke(aVar);
        } finally {
            o28.finallyStart(1);
            aVar.pop(iPushStyle);
            o28.finallyEnd(1);
        }
    }

    @yfb
    @th5
    public static final <R> R withAnnotation(@yfb C9041lz.a aVar, @yfb skh skhVar, @yfb qy6<? super C9041lz.a, ? extends R> qy6Var) {
        int iPushTtsAnnotation = aVar.pushTtsAnnotation(skhVar);
        try {
            return qy6Var.invoke(aVar);
        } finally {
            o28.finallyStart(1);
            aVar.pop(iPushTtsAnnotation);
            o28.finallyEnd(1);
        }
    }

    @yfb
    public static final <R> R withStyle(@yfb C9041lz.a aVar, @yfb kdc kdcVar, @yfb qy6<? super C9041lz.a, ? extends R> qy6Var) {
        int iPushStyle = aVar.pushStyle(kdcVar);
        try {
            return qy6Var.invoke(aVar);
        } finally {
            o28.finallyStart(1);
            aVar.pop(iPushStyle);
            o28.finallyEnd(1);
        }
    }

    @yfb
    public static final C9041lz AnnotatedString(@yfb String str, @yfb kdc kdcVar) {
        return new C9041lz(str, l82.emptyList(), k82.listOf(new C9041lz.c(kdcVar, 0, str.length())));
    }

    @yfb
    @q64(message = "Use LinkAnnotation API for links instead", replaceWith = @i2e(expression = "withLink(, block)", imports = {}))
    @th5
    public static final <R> R withAnnotation(@yfb C9041lz.a aVar, @yfb eyh eyhVar, @yfb qy6<? super C9041lz.a, ? extends R> qy6Var) {
        int iPushUrlAnnotation = aVar.pushUrlAnnotation(eyhVar);
        try {
            return qy6Var.invoke(aVar);
        } finally {
            o28.finallyStart(1);
            aVar.pop(iPushUrlAnnotation);
            o28.finallyEnd(1);
        }
    }
}
