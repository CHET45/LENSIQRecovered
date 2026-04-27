package p000;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class agg {

    /* JADX INFO: renamed from: j */
    @yfb
    public static final C0245a f1587j = new C0245a(null);

    /* JADX INFO: renamed from: k */
    public static final Pattern f1588k = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f1589a;

    /* JADX INFO: renamed from: b */
    public boolean f1590b;

    /* JADX INFO: renamed from: c */
    @gib
    public String[] f1591c;

    /* JADX INFO: renamed from: d */
    @gib
    public String f1592d;

    /* JADX INFO: renamed from: e */
    @gib
    public Object[] f1593e;

    /* JADX INFO: renamed from: f */
    @gib
    public String f1594f;

    /* JADX INFO: renamed from: g */
    @gib
    public String f1595g;

    /* JADX INFO: renamed from: h */
    @gib
    public String f1596h;

    /* JADX INFO: renamed from: i */
    @gib
    public String f1597i;

    /* JADX INFO: renamed from: agg$a */
    public static final class C0245a {
        public /* synthetic */ C0245a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final agg builder(@yfb String str) {
            md8.checkNotNullParameter(str, "tableName");
            return new agg(str, null);
        }

        private C0245a() {
        }
    }

    public /* synthetic */ agg(String str, jt3 jt3Var) {
        this(str);
    }

    private final void appendClause(StringBuilder sb, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb.append(str);
        sb.append(str2);
    }

    private final void appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    @do8
    @yfb
    public static final agg builder(@yfb String str) {
        return f1587j.builder(str);
    }

    @yfb
    public final agg columns(@gib String[] strArr) {
        this.f1591c = strArr;
        return this;
    }

    @yfb
    public final zfg create() {
        String str;
        String str2 = this.f1594f;
        if ((str2 == null || str2.length() == 0) && (str = this.f1595g) != null && str.length() != 0) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (this.f1590b) {
            sb.append("DISTINCT ");
        }
        String[] strArr = this.f1591c;
        if (strArr == null || strArr.length == 0) {
            sb.append("* ");
        } else {
            md8.checkNotNull(strArr);
            appendColumns(sb, strArr);
        }
        sb.append("FROM ");
        sb.append(this.f1589a);
        appendClause(sb, " WHERE ", this.f1592d);
        appendClause(sb, " GROUP BY ", this.f1594f);
        appendClause(sb, " HAVING ", this.f1595g);
        appendClause(sb, " ORDER BY ", this.f1596h);
        appendClause(sb, " LIMIT ", this.f1597i);
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return new cjf(string, this.f1593e);
    }

    @yfb
    public final agg distinct() {
        this.f1590b = true;
        return this;
    }

    @yfb
    public final agg groupBy(@gib String str) {
        this.f1594f = str;
        return this;
    }

    @yfb
    public final agg having(@gib String str) {
        this.f1595g = str;
        return this;
    }

    @yfb
    public final agg limit(@yfb String str) {
        md8.checkNotNullParameter(str, "limit");
        boolean zMatches = f1588k.matcher(str).matches();
        if (str.length() == 0 || zMatches) {
            this.f1597i = str;
            return this;
        }
        throw new IllegalArgumentException(("invalid LIMIT clauses:" + str).toString());
    }

    @yfb
    public final agg orderBy(@gib String str) {
        this.f1596h = str;
        return this;
    }

    @yfb
    public final agg selection(@gib String str, @gib Object[] objArr) {
        this.f1592d = str;
        this.f1593e = objArr;
        return this;
    }

    private agg(String str) {
        this.f1589a = str;
    }
}
