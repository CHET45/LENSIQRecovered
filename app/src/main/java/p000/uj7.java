package p000;

import com.iflytek.aikit.core.AiHelper;
import p000.a77;

/* JADX INFO: loaded from: classes7.dex */
@rh5
@jjf(version = "1.9")
public final class uj7 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C13554c f88110d = new C13554c(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final uj7 f88111e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final uj7 f88112f;

    /* JADX INFO: renamed from: a */
    public final boolean f88113a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final C13553b f88114b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final C13555d f88115c;

    /* JADX INFO: renamed from: uj7$a */
    public static final class C13552a {

        /* JADX INFO: renamed from: a */
        public boolean f88116a = uj7.f88110d.getDefault().getUpperCase();

        /* JADX INFO: renamed from: b */
        @gib
        public C13553b.a f88117b;

        /* JADX INFO: renamed from: c */
        @gib
        public C13555d.a f88118c;

        @yjd
        public C13552a() {
        }

        @t28
        private final void bytes(qy6<? super C13553b.a, bth> qy6Var) {
            md8.checkNotNullParameter(qy6Var, "builderAction");
            qy6Var.invoke(getBytes());
        }

        @t28
        private final void number(qy6<? super C13555d.a, bth> qy6Var) {
            md8.checkNotNullParameter(qy6Var, "builderAction");
            qy6Var.invoke(getNumber());
        }

        @yfb
        @yjd
        public final uj7 build() {
            C13553b default$kotlin_stdlib;
            C13555d default$kotlin_stdlib2;
            boolean z = this.f88116a;
            C13553b.a aVar = this.f88117b;
            if (aVar == null || (default$kotlin_stdlib = aVar.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib = C13553b.f88119j.getDefault$kotlin_stdlib();
            }
            C13555d.a aVar2 = this.f88118c;
            if (aVar2 == null || (default$kotlin_stdlib2 = aVar2.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib2 = C13555d.f88136h.getDefault$kotlin_stdlib();
            }
            return new uj7(z, default$kotlin_stdlib, default$kotlin_stdlib2);
        }

        @yfb
        public final C13553b.a getBytes() {
            if (this.f88117b == null) {
                this.f88117b = new C13553b.a();
            }
            C13553b.a aVar = this.f88117b;
            md8.checkNotNull(aVar);
            return aVar;
        }

        @yfb
        public final C13555d.a getNumber() {
            if (this.f88118c == null) {
                this.f88118c = new C13555d.a();
            }
            C13555d.a aVar = this.f88118c;
            md8.checkNotNull(aVar);
            return aVar;
        }

        public final boolean getUpperCase() {
            return this.f88116a;
        }

        public final void setUpperCase(boolean z) {
            this.f88116a = z;
        }
    }

    /* JADX INFO: renamed from: uj7$b */
    public static final class C13553b {

        /* JADX INFO: renamed from: j */
        @yfb
        public static final b f88119j = new b(null);

        /* JADX INFO: renamed from: k */
        @yfb
        public static final C13553b f88120k = new C13553b(Integer.MAX_VALUE, Integer.MAX_VALUE, a77.C0077a.f542d, "", "", "");

        /* JADX INFO: renamed from: a */
        public final int f88121a;

        /* JADX INFO: renamed from: b */
        public final int f88122b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final String f88123c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final String f88124d;

        /* JADX INFO: renamed from: e */
        @yfb
        public final String f88125e;

        /* JADX INFO: renamed from: f */
        @yfb
        public final String f88126f;

        /* JADX INFO: renamed from: g */
        public final boolean f88127g;

        /* JADX INFO: renamed from: h */
        public final boolean f88128h;

        /* JADX INFO: renamed from: i */
        public final boolean f88129i;

        /* JADX INFO: renamed from: uj7$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public int f88130a;

            /* JADX INFO: renamed from: b */
            public int f88131b;

            /* JADX INFO: renamed from: c */
            @yfb
            public String f88132c;

            /* JADX INFO: renamed from: d */
            @yfb
            public String f88133d;

            /* JADX INFO: renamed from: e */
            @yfb
            public String f88134e;

            /* JADX INFO: renamed from: f */
            @yfb
            public String f88135f;

            public a() {
                b bVar = C13553b.f88119j;
                this.f88130a = bVar.getDefault$kotlin_stdlib().getBytesPerLine();
                this.f88131b = bVar.getDefault$kotlin_stdlib().getBytesPerGroup();
                this.f88132c = bVar.getDefault$kotlin_stdlib().getGroupSeparator();
                this.f88133d = bVar.getDefault$kotlin_stdlib().getByteSeparator();
                this.f88134e = bVar.getDefault$kotlin_stdlib().getBytePrefix();
                this.f88135f = bVar.getDefault$kotlin_stdlib().getByteSuffix();
            }

            @yfb
            public final C13553b build$kotlin_stdlib() {
                return new C13553b(this.f88130a, this.f88131b, this.f88132c, this.f88133d, this.f88134e, this.f88135f);
            }

            @yfb
            public final String getBytePrefix() {
                return this.f88134e;
            }

            @yfb
            public final String getByteSeparator() {
                return this.f88133d;
            }

            @yfb
            public final String getByteSuffix() {
                return this.f88135f;
            }

            public final int getBytesPerGroup() {
                return this.f88131b;
            }

            public final int getBytesPerLine() {
                return this.f88130a;
            }

            @yfb
            public final String getGroupSeparator() {
                return this.f88132c;
            }

            public final void setBytePrefix(@yfb String str) {
                md8.checkNotNullParameter(str, "value");
                if (!m9g.contains$default((CharSequence) str, '\n', false, 2, (Object) null) && !m9g.contains$default((CharSequence) str, '\r', false, 2, (Object) null)) {
                    this.f88134e = str;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + str);
            }

            public final void setByteSeparator(@yfb String str) {
                md8.checkNotNullParameter(str, "value");
                if (!m9g.contains$default((CharSequence) str, '\n', false, 2, (Object) null) && !m9g.contains$default((CharSequence) str, '\r', false, 2, (Object) null)) {
                    this.f88133d = str;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + str);
            }

            public final void setByteSuffix(@yfb String str) {
                md8.checkNotNullParameter(str, "value");
                if (!m9g.contains$default((CharSequence) str, '\n', false, 2, (Object) null) && !m9g.contains$default((CharSequence) str, '\r', false, 2, (Object) null)) {
                    this.f88135f = str;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + str);
            }

            public final void setBytesPerGroup(int i) {
                if (i > 0) {
                    this.f88131b = i;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + i);
            }

            public final void setBytesPerLine(int i) {
                if (i > 0) {
                    this.f88130a = i;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + i);
            }

            public final void setGroupSeparator(@yfb String str) {
                md8.checkNotNullParameter(str, "<set-?>");
                this.f88132c = str;
            }
        }

        /* JADX INFO: renamed from: uj7$b$b */
        public static final class b {
            public /* synthetic */ b(jt3 jt3Var) {
                this();
            }

            @yfb
            public final C13553b getDefault$kotlin_stdlib() {
                return C13553b.f88120k;
            }

            private b() {
            }
        }

        public C13553b(int i, int i2, @yfb String str, @yfb String str2, @yfb String str3, @yfb String str4) {
            md8.checkNotNullParameter(str, "groupSeparator");
            md8.checkNotNullParameter(str2, "byteSeparator");
            md8.checkNotNullParameter(str3, "bytePrefix");
            md8.checkNotNullParameter(str4, "byteSuffix");
            this.f88121a = i;
            this.f88122b = i2;
            this.f88123c = str;
            this.f88124d = str2;
            this.f88125e = str3;
            this.f88126f = str4;
            this.f88127g = i == Integer.MAX_VALUE && i2 == Integer.MAX_VALUE;
            this.f88128h = str3.length() == 0 && str4.length() == 0 && str2.length() <= 1;
            this.f88129i = vj7.isCaseSensitive(str) || vj7.isCaseSensitive(str2) || vj7.isCaseSensitive(str3) || vj7.isCaseSensitive(str4);
        }

        @yfb
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@yfb StringBuilder sb, @yfb String str) {
            md8.checkNotNullParameter(sb, "sb");
            md8.checkNotNullParameter(str, "indent");
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(this.f88121a);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(this.f88122b);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append(this.f88123c);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append(this.f88124d);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytePrefix = \"");
            sb.append(this.f88125e);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append(this.f88126f);
            sb.append("\"");
            return sb;
        }

        @yfb
        public final String getBytePrefix() {
            return this.f88125e;
        }

        @yfb
        public final String getByteSeparator() {
            return this.f88124d;
        }

        @yfb
        public final String getByteSuffix() {
            return this.f88126f;
        }

        public final int getBytesPerGroup() {
            return this.f88122b;
        }

        public final int getBytesPerLine() {
            return this.f88121a;
        }

        @yfb
        public final String getGroupSeparator() {
            return this.f88123c;
        }

        public final boolean getIgnoreCase$kotlin_stdlib() {
            return this.f88129i;
        }

        public final boolean getNoLineAndGroupSeparator$kotlin_stdlib() {
            return this.f88127g;
        }

        public final boolean getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() {
            return this.f88128h;
        }

        @yfb
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            sb.append('\n');
            appendOptionsTo$kotlin_stdlib(sb, pl8.f71328a).append('\n');
            sb.append(c0b.f15434d);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: uj7$c */
    public static final class C13554c {
        public /* synthetic */ C13554c(jt3 jt3Var) {
            this();
        }

        @yfb
        public final uj7 getDefault() {
            return uj7.f88111e;
        }

        @yfb
        public final uj7 getUpperCase() {
            return uj7.f88112f;
        }

        private C13554c() {
        }
    }

    /* JADX INFO: renamed from: uj7$d */
    public static final class C13555d {

        /* JADX INFO: renamed from: h */
        @yfb
        public static final b f88136h = new b(null);

        /* JADX INFO: renamed from: i */
        @yfb
        public static final C13555d f88137i = new C13555d("", "", false, 1);

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f88138a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final String f88139b;

        /* JADX INFO: renamed from: c */
        public final boolean f88140c;

        /* JADX INFO: renamed from: d */
        public final int f88141d;

        /* JADX INFO: renamed from: e */
        public final boolean f88142e;

        /* JADX INFO: renamed from: f */
        public final boolean f88143f;

        /* JADX INFO: renamed from: g */
        public final boolean f88144g;

        /* JADX INFO: renamed from: uj7$d$a */
        @dwf({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormat$NumberHexFormat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,844:1\n1#2:845\n*E\n"})
        public static final class a {

            /* JADX INFO: renamed from: a */
            @yfb
            public String f88145a;

            /* JADX INFO: renamed from: b */
            @yfb
            public String f88146b;

            /* JADX INFO: renamed from: c */
            public boolean f88147c;

            /* JADX INFO: renamed from: d */
            public int f88148d;

            public a() {
                b bVar = C13555d.f88136h;
                this.f88145a = bVar.getDefault$kotlin_stdlib().getPrefix();
                this.f88146b = bVar.getDefault$kotlin_stdlib().getSuffix();
                this.f88147c = bVar.getDefault$kotlin_stdlib().getRemoveLeadingZeros();
                this.f88148d = bVar.getDefault$kotlin_stdlib().getMinLength();
            }

            @jjf(version = AiHelper.f24011i)
            public static /* synthetic */ void getMinLength$annotations() {
            }

            @yfb
            public final C13555d build$kotlin_stdlib() {
                return new C13555d(this.f88145a, this.f88146b, this.f88147c, this.f88148d);
            }

            public final int getMinLength() {
                return this.f88148d;
            }

            @yfb
            public final String getPrefix() {
                return this.f88145a;
            }

            public final boolean getRemoveLeadingZeros() {
                return this.f88147c;
            }

            @yfb
            public final String getSuffix() {
                return this.f88146b;
            }

            public final void setMinLength(int i) {
                if (i > 0) {
                    this.f88148d = i;
                    return;
                }
                throw new IllegalArgumentException(("Non-positive values are prohibited for minLength, but was " + i).toString());
            }

            public final void setPrefix(@yfb String str) {
                md8.checkNotNullParameter(str, "value");
                if (!m9g.contains$default((CharSequence) str, '\n', false, 2, (Object) null) && !m9g.contains$default((CharSequence) str, '\r', false, 2, (Object) null)) {
                    this.f88145a = str;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + str);
            }

            public final void setRemoveLeadingZeros(boolean z) {
                this.f88147c = z;
            }

            public final void setSuffix(@yfb String str) {
                md8.checkNotNullParameter(str, "value");
                if (!m9g.contains$default((CharSequence) str, '\n', false, 2, (Object) null) && !m9g.contains$default((CharSequence) str, '\r', false, 2, (Object) null)) {
                    this.f88146b = str;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + str);
            }
        }

        /* JADX INFO: renamed from: uj7$d$b */
        public static final class b {
            public /* synthetic */ b(jt3 jt3Var) {
                this();
            }

            @yfb
            public final C13555d getDefault$kotlin_stdlib() {
                return C13555d.f88137i;
            }

            private b() {
            }
        }

        public C13555d(@yfb String str, @yfb String str2, boolean z, int i) {
            md8.checkNotNullParameter(str, "prefix");
            md8.checkNotNullParameter(str2, "suffix");
            this.f88138a = str;
            this.f88139b = str2;
            this.f88140c = z;
            this.f88141d = i;
            boolean z2 = str.length() == 0 && str2.length() == 0;
            this.f88142e = z2;
            this.f88143f = z2 && i == 1;
            this.f88144g = vj7.isCaseSensitive(str) || vj7.isCaseSensitive(str2);
        }

        @jjf(version = AiHelper.f24011i)
        public static /* synthetic */ void getMinLength$annotations() {
        }

        @yfb
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@yfb StringBuilder sb, @yfb String str) {
            md8.checkNotNullParameter(sb, "sb");
            md8.checkNotNullParameter(str, "indent");
            sb.append(str);
            sb.append("prefix = \"");
            sb.append(this.f88138a);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append(this.f88139b);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(this.f88140c);
            sb.append(C4584d2.f28238g);
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(this.f88141d);
            return sb;
        }

        public final boolean getIgnoreCase$kotlin_stdlib() {
            return this.f88144g;
        }

        public final int getMinLength() {
            return this.f88141d;
        }

        @yfb
        public final String getPrefix() {
            return this.f88138a;
        }

        public final boolean getRemoveLeadingZeros() {
            return this.f88140c;
        }

        @yfb
        public final String getSuffix() {
            return this.f88139b;
        }

        public final boolean isDigitsOnly$kotlin_stdlib() {
            return this.f88142e;
        }

        public final boolean isDigitsOnlyAndNoPadding$kotlin_stdlib() {
            return this.f88143f;
        }

        @yfb
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            sb.append('\n');
            appendOptionsTo$kotlin_stdlib(sb, pl8.f71328a).append('\n');
            sb.append(c0b.f15434d);
            return sb.toString();
        }
    }

    static {
        C13553b.b bVar = C13553b.f88119j;
        C13553b default$kotlin_stdlib = bVar.getDefault$kotlin_stdlib();
        C13555d.b bVar2 = C13555d.f88136h;
        f88111e = new uj7(false, default$kotlin_stdlib, bVar2.getDefault$kotlin_stdlib());
        f88112f = new uj7(true, bVar.getDefault$kotlin_stdlib(), bVar2.getDefault$kotlin_stdlib());
    }

    public uj7(boolean z, @yfb C13553b c13553b, @yfb C13555d c13555d) {
        md8.checkNotNullParameter(c13553b, "bytes");
        md8.checkNotNullParameter(c13555d, "number");
        this.f88113a = z;
        this.f88114b = c13553b;
        this.f88115c = c13555d;
    }

    @yfb
    public final C13553b getBytes() {
        return this.f88114b;
    }

    @yfb
    public final C13555d getNumber() {
        return this.f88115c;
    }

    public final boolean getUpperCase() {
        return this.f88113a;
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        sb.append('\n');
        sb.append("    upperCase = ");
        sb.append(this.f88113a);
        sb.append(",");
        sb.append('\n');
        sb.append("    bytes = BytesHexFormat(");
        sb.append('\n');
        this.f88114b.appendOptionsTo$kotlin_stdlib(sb, "        ").append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f88115c.appendOptionsTo$kotlin_stdlib(sb, "        ").append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(c0b.f15434d);
        return sb.toString();
    }
}
