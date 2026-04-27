package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class d69 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C4630a f28526b = new C4630a(null);

    /* JADX INFO: renamed from: c */
    public static final int f28527c;

    /* JADX INFO: renamed from: d */
    public static final int f28528d;

    /* JADX INFO: renamed from: e */
    public static final int f28529e;

    /* JADX INFO: renamed from: f */
    public static final int f28530f;

    /* JADX INFO: renamed from: a */
    public final int f28531a;

    /* JADX INFO: renamed from: d69$a */
    public static final class C4630a {
        public /* synthetic */ C4630a(jt3 jt3Var) {
            this();
        }

        @f0g
        /* JADX INFO: renamed from: getHeading-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m28583getHeadingrAG3T2k$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getParagraph-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m28584getParagraphrAG3T2k$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getSimple-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m28585getSimplerAG3T2k$annotations() {
        }

        @f0g
        /* JADX INFO: renamed from: getUnspecified-rAG3T2k$annotations, reason: not valid java name */
        public static /* synthetic */ void m28586getUnspecifiedrAG3T2k$annotations() {
        }

        /* JADX INFO: renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m28587getHeadingrAG3T2k() {
            return d69.f28528d;
        }

        /* JADX INFO: renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m28588getParagraphrAG3T2k() {
            return d69.f28529e;
        }

        /* JADX INFO: renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m28589getSimplerAG3T2k() {
            return d69.f28527c;
        }

        /* JADX INFO: renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m28590getUnspecifiedrAG3T2k() {
            return d69.f28530f;
        }

        private C4630a() {
        }
    }

    /* JADX INFO: renamed from: d69$b */
    @vn8
    public static final class C4631b {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f28532b = new a(null);

        /* JADX INFO: renamed from: c */
        public static final int f28533c = m28592constructorimpl(1);

        /* JADX INFO: renamed from: d */
        public static final int f28534d = m28592constructorimpl(2);

        /* JADX INFO: renamed from: e */
        public static final int f28535e = m28592constructorimpl(3);

        /* JADX INFO: renamed from: f */
        public static final int f28536f = m28592constructorimpl(0);

        /* JADX INFO: renamed from: a */
        public final int f28537a;

        /* JADX INFO: renamed from: d69$b$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            /* JADX INFO: renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m28598getBalancedfcGXIks() {
                return C4631b.f28535e;
            }

            /* JADX INFO: renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m28599getHighQualityfcGXIks() {
                return C4631b.f28534d;
            }

            /* JADX INFO: renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m28600getSimplefcGXIks() {
                return C4631b.f28533c;
            }

            /* JADX INFO: renamed from: getUnspecified-fcGXIks, reason: not valid java name */
            public final int m28601getUnspecifiedfcGXIks() {
                return C4631b.f28536f;
            }

            private a() {
            }
        }

        private /* synthetic */ C4631b(int i) {
            this.f28537a = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C4631b m28591boximpl(int i) {
            return new C4631b(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m28592constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m28593equalsimpl(int i, Object obj) {
            return (obj instanceof C4631b) && i == ((C4631b) obj).m28597unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m28594equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m28595hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        @yfb
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m28596toStringimpl(int i) {
            return m28594equalsimpl0(i, f28533c) ? "Strategy.Simple" : m28594equalsimpl0(i, f28534d) ? "Strategy.HighQuality" : m28594equalsimpl0(i, f28535e) ? "Strategy.Balanced" : m28594equalsimpl0(i, f28536f) ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m28593equalsimpl(this.f28537a, obj);
        }

        public int hashCode() {
            return m28595hashCodeimpl(this.f28537a);
        }

        @yfb
        public String toString() {
            return m28596toStringimpl(this.f28537a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m28597unboximpl() {
            return this.f28537a;
        }
    }

    /* JADX INFO: renamed from: d69$c */
    @vn8
    public static final class C4632c {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f28538b = new a(null);

        /* JADX INFO: renamed from: c */
        public static final int f28539c = m28603constructorimpl(1);

        /* JADX INFO: renamed from: d */
        public static final int f28540d = m28603constructorimpl(2);

        /* JADX INFO: renamed from: e */
        public static final int f28541e = m28603constructorimpl(3);

        /* JADX INFO: renamed from: f */
        public static final int f28542f = m28603constructorimpl(4);

        /* JADX INFO: renamed from: g */
        public static final int f28543g = m28603constructorimpl(0);

        /* JADX INFO: renamed from: a */
        public final int f28544a;

        /* JADX INFO: renamed from: d69$c$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            /* JADX INFO: renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m28609getDefaultusljTpc() {
                return C4632c.f28539c;
            }

            /* JADX INFO: renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m28610getLooseusljTpc() {
                return C4632c.f28540d;
            }

            /* JADX INFO: renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m28611getNormalusljTpc() {
                return C4632c.f28541e;
            }

            /* JADX INFO: renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m28612getStrictusljTpc() {
                return C4632c.f28542f;
            }

            /* JADX INFO: renamed from: getUnspecified-usljTpc, reason: not valid java name */
            public final int m28613getUnspecifiedusljTpc() {
                return C4632c.f28543g;
            }

            private a() {
            }
        }

        private /* synthetic */ C4632c(int i) {
            this.f28544a = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C4632c m28602boximpl(int i) {
            return new C4632c(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m28603constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m28604equalsimpl(int i, Object obj) {
            return (obj instanceof C4632c) && i == ((C4632c) obj).m28608unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m28605equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m28606hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        @yfb
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m28607toStringimpl(int i) {
            return m28605equalsimpl0(i, f28539c) ? "Strictness.None" : m28605equalsimpl0(i, f28540d) ? "Strictness.Loose" : m28605equalsimpl0(i, f28541e) ? "Strictness.Normal" : m28605equalsimpl0(i, f28542f) ? "Strictness.Strict" : m28605equalsimpl0(i, f28543g) ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m28604equalsimpl(this.f28544a, obj);
        }

        public int hashCode() {
            return m28606hashCodeimpl(this.f28544a);
        }

        @yfb
        public String toString() {
            return m28607toStringimpl(this.f28544a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m28608unboximpl() {
            return this.f28544a;
        }
    }

    /* JADX INFO: renamed from: d69$d */
    @vn8
    public static final class C4633d {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final a f28545b = new a(null);

        /* JADX INFO: renamed from: c */
        public static final int f28546c = m28615constructorimpl(1);

        /* JADX INFO: renamed from: d */
        public static final int f28547d = m28615constructorimpl(2);

        /* JADX INFO: renamed from: e */
        public static final int f28548e = m28615constructorimpl(0);

        /* JADX INFO: renamed from: a */
        public final int f28549a;

        /* JADX INFO: renamed from: d69$d$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            /* JADX INFO: renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m28621getDefaultjp8hJ3c() {
                return C4633d.f28546c;
            }

            /* JADX INFO: renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m28622getPhrasejp8hJ3c() {
                return C4633d.f28547d;
            }

            /* JADX INFO: renamed from: getUnspecified-jp8hJ3c, reason: not valid java name */
            public final int m28623getUnspecifiedjp8hJ3c() {
                return C4633d.f28548e;
            }

            private a() {
            }
        }

        private /* synthetic */ C4633d(int i) {
            this.f28549a = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C4633d m28614boximpl(int i) {
            return new C4633d(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m28615constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m28616equalsimpl(int i, Object obj) {
            return (obj instanceof C4633d) && i == ((C4633d) obj).m28620unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m28617equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m28618hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        @yfb
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m28619toStringimpl(int i) {
            return m28617equalsimpl0(i, f28546c) ? "WordBreak.None" : m28617equalsimpl0(i, f28547d) ? "WordBreak.Phrase" : m28617equalsimpl0(i, f28548e) ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m28616equalsimpl(this.f28549a, obj);
        }

        public int hashCode() {
            return m28618hashCodeimpl(this.f28549a);
        }

        @yfb
        public String toString() {
            return m28619toStringimpl(this.f28549a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m28620unboximpl() {
            return this.f28549a;
        }
    }

    static {
        C4631b.a aVar = C4631b.f28532b;
        int iM28600getSimplefcGXIks = aVar.m28600getSimplefcGXIks();
        C4632c.a aVar2 = C4632c.f28538b;
        int iM28611getNormalusljTpc = aVar2.m28611getNormalusljTpc();
        C4633d.a aVar3 = C4633d.f28545b;
        f28527c = m28571constructorimpl(e69.packBytes(iM28600getSimplefcGXIks, iM28611getNormalusljTpc, aVar3.m28621getDefaultjp8hJ3c()));
        f28528d = m28571constructorimpl(e69.packBytes(aVar.m28598getBalancedfcGXIks(), aVar2.m28610getLooseusljTpc(), aVar3.m28622getPhrasejp8hJ3c()));
        f28529e = m28571constructorimpl(e69.packBytes(aVar.m28599getHighQualityfcGXIks(), aVar2.m28612getStrictusljTpc(), aVar3.m28621getDefaultjp8hJ3c()));
        f28530f = m28571constructorimpl(0);
    }

    private /* synthetic */ d69(int i) {
        this.f28531a = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ d69 m28570boximpl(int i) {
        return new d69(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m28571constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m28573copygijOMQM(int i, int i2, int i3, int i4) {
        return m28572constructorimpl(i2, i3, i4);
    }

    /* JADX INFO: renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m28574copygijOMQM$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = m28577getStrategyfcGXIks(i);
        }
        if ((i5 & 2) != 0) {
            i3 = m28578getStrictnessusljTpc(i);
        }
        if ((i5 & 4) != 0) {
            i4 = m28579getWordBreakjp8hJ3c(i);
        }
        return m28573copygijOMQM(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m28575equalsimpl(int i, Object obj) {
        return (obj instanceof d69) && i == ((d69) obj).m28582unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28576equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m28577getStrategyfcGXIks(int i) {
        return C4631b.m28592constructorimpl(e69.unpackByte1(i));
    }

    /* JADX INFO: renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m28578getStrictnessusljTpc(int i) {
        return C4632c.m28603constructorimpl(e69.unpackByte2(i));
    }

    /* JADX INFO: renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m28579getWordBreakjp8hJ3c(int i) {
        return C4633d.m28615constructorimpl(e69.unpackByte3(i));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m28580hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m28581toStringimpl(int i) {
        return "LineBreak(strategy=" + ((Object) C4631b.m28596toStringimpl(m28577getStrategyfcGXIks(i))) + ", strictness=" + ((Object) C4632c.m28607toStringimpl(m28578getStrictnessusljTpc(i))) + ", wordBreak=" + ((Object) C4633d.m28619toStringimpl(m28579getWordBreakjp8hJ3c(i))) + ')';
    }

    public boolean equals(Object obj) {
        return m28575equalsimpl(this.f28531a, obj);
    }

    public int hashCode() {
        return m28580hashCodeimpl(this.f28531a);
    }

    @yfb
    public String toString() {
        return m28581toStringimpl(this.f28531a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28582unboximpl() {
        return this.f28531a;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m28572constructorimpl(int i, int i2, int i3) {
        return m28571constructorimpl(e69.packBytes(i, i2, i3));
    }
}
