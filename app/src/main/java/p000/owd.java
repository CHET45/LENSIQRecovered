package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n22#2,3:398\n1#3:401\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n103#1:398,3\n*E\n"})
public final class owd implements Serializable {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C10681a f69062c = new C10681a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final Pattern f69063a;

    /* JADX INFO: renamed from: b */
    @gib
    public Set<? extends uwd> f69064b;

    /* JADX INFO: renamed from: owd$a */
    public static final class C10681a {
        public /* synthetic */ C10681a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int ensureUnicodeCase(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        @yfb
        public final String escape(@yfb String str) {
            md8.checkNotNullParameter(str, "literal");
            String strQuote = Pattern.quote(str);
            md8.checkNotNullExpressionValue(strQuote, "quote(...)");
            return strQuote;
        }

        @yfb
        public final String escapeReplacement(@yfb String str) {
            md8.checkNotNullParameter(str, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(str);
            md8.checkNotNullExpressionValue(strQuoteReplacement, "quoteReplacement(...)");
            return strQuoteReplacement;
        }

        @yfb
        public final owd fromLiteral(@yfb String str) {
            md8.checkNotNullParameter(str, "literal");
            return new owd(str, uwd.f89288e);
        }

        private C10681a() {
        }
    }

    /* JADX INFO: renamed from: owd$b */
    public static final class C10682b implements Serializable {

        /* JADX INFO: renamed from: c */
        @yfb
        public static final a f69065c = new a(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f69066a;

        /* JADX INFO: renamed from: b */
        public final int f69067b;

        /* JADX INFO: renamed from: owd$b$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            private a() {
            }
        }

        public C10682b(@yfb String str, int i) {
            md8.checkNotNullParameter(str, "pattern");
            this.f69066a = str;
            this.f69067b = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f69066a, this.f69067b);
            md8.checkNotNullExpressionValue(patternCompile, "compile(...)");
            return new owd(patternCompile);
        }

        public final int getFlags() {
            return this.f69067b;
        }

        @yfb
        public final String getPattern() {
            return this.f69066a;
        }
    }

    /* JADX INFO: renamed from: owd$c */
    public /* synthetic */ class C10683c extends n07 implements qy6<wv9, wv9> {

        /* JADX INFO: renamed from: a */
        public static final C10683c f69068a = new C10683c();

        public C10683c() {
            super(1, wv9.class, jk5.f50996b, "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // p000.qy6
        public final wv9 invoke(wv9 wv9Var) {
            md8.checkNotNullParameter(wv9Var, "p0");
            return wv9Var.next();
        }
    }

    /* JADX INFO: renamed from: owd$d */
    public static final class C10684d implements qy6<uwd, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f69069a;

        public C10684d(int i) {
            this.f69069a = i;
        }

        @Override // p000.qy6
        public final Boolean invoke(uwd uwdVar) {
            uwd uwdVar2 = uwdVar;
            return Boolean.valueOf((this.f69069a & uwdVar2.getMask()) == uwdVar2.getValue());
        }
    }

    /* JADX INFO: renamed from: owd$e */
    @ck3(m4009c = "kotlin.text.Regex$splitToSequence$1", m4010f = "Regex.kt", m4011i = {1, 1, 1}, m4012l = {275, 283, 287}, m4013m = "invokeSuspend", m4014n = {"$this$sequence", "matcher", "splitCount"}, m4015s = {"L$0", "L$1", "I$0"})
    public static final class C10685e extends t7e implements gz6<xye<? super String>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f69070a;

        /* JADX INFO: renamed from: b */
        public int f69071b;

        /* JADX INFO: renamed from: c */
        public int f69072c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f69073d;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CharSequence f69075f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f69076m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10685e(CharSequence charSequence, int i, zy2<? super C10685e> zy2Var) {
            super(2, zy2Var);
            this.f69075f = charSequence;
            this.f69076m = i;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C10685e c10685e = owd.this.new C10685e(this.f69075f, this.f69076m, zy2Var);
            c10685e.f69073d = obj;
            return c10685e;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super String> xyeVar, zy2<? super bth> zy2Var) {
            return ((C10685e) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:21:0x0071). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r9.f69072c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2d
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                p000.y7e.throwOnFailure(r10)
                goto L9d
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                int r1 = r9.f69071b
                java.lang.Object r5 = r9.f69070a
                java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
                java.lang.Object r6 = r9.f69073d
                xye r6 = (p000.xye) r6
                p000.y7e.throwOnFailure(r10)
                r10 = r5
                goto L71
            L2d:
                p000.y7e.throwOnFailure(r10)
                goto Laf
            L32:
                p000.y7e.throwOnFailure(r10)
                java.lang.Object r10 = r9.f69073d
                xye r10 = (p000.xye) r10
                owd r1 = p000.owd.this
                java.util.regex.Pattern r1 = p000.owd.access$getNativePattern$p(r1)
                java.lang.CharSequence r5 = r9.f69075f
                java.util.regex.Matcher r1 = r1.matcher(r5)
                int r5 = r9.f69076m
                if (r5 == r4) goto La0
                boolean r5 = r1.find()
                if (r5 != 0) goto L50
                goto La0
            L50:
                r5 = 0
                r6 = r10
                r10 = r1
                r1 = r5
            L54:
                java.lang.CharSequence r7 = r9.f69075f
                int r8 = r10.start()
                java.lang.CharSequence r5 = r7.subSequence(r5, r8)
                java.lang.String r5 = r5.toString()
                r9.f69073d = r6
                r9.f69070a = r10
                r9.f69071b = r1
                r9.f69072c = r3
                java.lang.Object r5 = r6.yield(r5, r9)
                if (r5 != r0) goto L71
                return r0
            L71:
                int r5 = r10.end()
                int r1 = r1 + r4
                int r7 = r9.f69076m
                int r7 = r7 - r4
                if (r1 == r7) goto L81
                boolean r7 = r10.find()
                if (r7 != 0) goto L54
            L81:
                java.lang.CharSequence r10 = r9.f69075f
                int r1 = r10.length()
                java.lang.CharSequence r10 = r10.subSequence(r5, r1)
                java.lang.String r10 = r10.toString()
                r1 = 0
                r9.f69073d = r1
                r9.f69070a = r1
                r9.f69072c = r2
                java.lang.Object r10 = r6.yield(r10, r9)
                if (r10 != r0) goto L9d
                return r0
            L9d:
                bth r10 = p000.bth.f14751a
                return r10
            La0:
                java.lang.CharSequence r1 = r9.f69075f
                java.lang.String r1 = r1.toString()
                r9.f69072c = r4
                java.lang.Object r10 = r10.yield(r1, r9)
                if (r10 != r0) goto Laf
                return r0
            Laf:
                bth r10 = p000.bth.f14751a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.owd.C10685e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @yjd
    public owd(@yfb Pattern pattern) {
        md8.checkNotNullParameter(pattern, "nativePattern");
        this.f69063a = pattern;
    }

    public static /* synthetic */ wv9 find$default(owd owdVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return owdVar.find(charSequence, i);
    }

    public static /* synthetic */ vye findAll$default(owd owdVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return owdVar.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(owd owdVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return owdVar.split(charSequence, i);
    }

    public static /* synthetic */ vye splitToSequence$default(owd owdVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return owdVar.splitToSequence(charSequence, i);
    }

    private final Object writeReplace() {
        String strPattern = this.f69063a.pattern();
        md8.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return new C10682b(strPattern, this.f69063a.flags());
    }

    public final boolean containsMatchIn(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "input");
        return this.f69063a.matcher(charSequence).find();
    }

    @gib
    public final wv9 find(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "input");
        Matcher matcher = this.f69063a.matcher(charSequence);
        md8.checkNotNullExpressionValue(matcher, "matcher(...)");
        return twd.findNext(matcher, i, charSequence);
    }

    @yfb
    public final vye<wv9> findAll(@yfb final CharSequence charSequence, final int i) {
        md8.checkNotNullParameter(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return ize.generateSequence(new ny6() { // from class: nwd
                @Override // p000.ny6
                public final Object invoke() {
                    return this.f65912a.find(charSequence, i);
                }
            }, (qy6) C10683c.f69068a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    @yfb
    public final Set<uwd> getOptions() {
        Set set = this.f69064b;
        if (set != null) {
            return set;
        }
        int iFlags = this.f69063a.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(uwd.class);
        md8.checkNotNull(enumSetAllOf);
        q82.retainAll(enumSetAllOf, new C10684d(iFlags));
        Set<uwd> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        md8.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        this.f69064b = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @yfb
    public final String getPattern() {
        String strPattern = this.f69063a.pattern();
        md8.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return strPattern;
    }

    @gib
    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.7")
    public final wv9 matchAt(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "input");
        Matcher matcherRegion = this.f69063a.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        md8.checkNotNull(matcherRegion);
        return new aw9(matcherRegion, charSequence);
    }

    @gib
    public final wv9 matchEntire(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "input");
        Matcher matcher = this.f69063a.matcher(charSequence);
        md8.checkNotNullExpressionValue(matcher, "matcher(...)");
        return twd.matchEntire(matcher, charSequence);
    }

    public final boolean matches(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "input");
        return this.f69063a.matcher(charSequence).matches();
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.7")
    public final boolean matchesAt(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "input");
        return this.f69063a.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    @yfb
    public final String replace(@yfb CharSequence charSequence, @yfb String str) {
        md8.checkNotNullParameter(charSequence, "input");
        md8.checkNotNullParameter(str, "replacement");
        String strReplaceAll = this.f69063a.matcher(charSequence).replaceAll(str);
        md8.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @yfb
    public final String replaceFirst(@yfb CharSequence charSequence, @yfb String str) {
        md8.checkNotNullParameter(charSequence, "input");
        md8.checkNotNullParameter(str, "replacement");
        String strReplaceFirst = this.f69063a.matcher(charSequence).replaceFirst(str);
        md8.checkNotNullExpressionValue(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    @yfb
    public final List<String> split(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "input");
        m9g.requireNonNegativeLimit(i);
        Matcher matcher = this.f69063a.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return k82.listOf(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i > 0 ? kpd.coerceAtMost(i, 10) : 10);
        int i2 = i - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i2 >= 0 && arrayList.size() == i2) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.6")
    @yfb
    public final vye<String> splitToSequence(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "input");
        m9g.requireNonNegativeLimit(i);
        return bze.sequence(new C10685e(charSequence, i, null));
    }

    @yfb
    public final Pattern toPattern() {
        return this.f69063a;
    }

    @yfb
    public String toString() {
        String string = this.f69063a.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @yfb
    public final String replace(@yfb CharSequence charSequence, @yfb qy6<? super wv9, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "input");
        md8.checkNotNullParameter(qy6Var, "transform");
        int iIntValue = 0;
        wv9 wv9VarFind$default = find$default(this, charSequence, 0, 2, null);
        if (wv9VarFind$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, iIntValue, wv9VarFind$default.getRange().getStart().intValue());
            sb.append(qy6Var.invoke(wv9VarFind$default));
            iIntValue = wv9VarFind$default.getRange().getEndInclusive().intValue() + 1;
            wv9VarFind$default = wv9VarFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (wv9VarFind$default != null);
        if (iIntValue < length) {
            sb.append(charSequence, iIntValue, length);
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public owd(@yfb String str) {
        md8.checkNotNullParameter(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        md8.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public owd(@yfb String str, @yfb uwd uwdVar) {
        md8.checkNotNullParameter(str, "pattern");
        md8.checkNotNullParameter(uwdVar, "option");
        Pattern patternCompile = Pattern.compile(str, f69062c.ensureUnicodeCase(uwdVar.getValue()));
        md8.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public owd(@yfb String str, @yfb Set<? extends uwd> set) {
        md8.checkNotNullParameter(str, "pattern");
        md8.checkNotNullParameter(set, "options");
        Pattern patternCompile = Pattern.compile(str, f69062c.ensureUnicodeCase(twd.toInt(set)));
        md8.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
