package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p000.ab2;
import p000.p7e;
import p000.tz7;
import p000.ymh;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class flg {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C5881b f37060e = new C5881b(null);

    /* JADX INFO: renamed from: f */
    public static final int f37061f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f37062g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f37063h = 2;

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final String f37064a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public final Map<String, C5880a> f37065b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public final Set<C5883d> f37066c;

    /* JADX INFO: renamed from: d */
    @gib
    @un8
    public final Set<C5885f> f37067d;

    /* JADX INFO: renamed from: flg$b */
    public static final class C5881b {
        public /* synthetic */ C5881b(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final flg read(@yfb wfg wfgVar, @yfb String str) {
            md8.checkNotNullParameter(wfgVar, "database");
            md8.checkNotNullParameter(str, "tableName");
            return glg.readTableInfo(wfgVar, str);
        }

        private C5881b() {
        }
    }

    /* JADX INFO: renamed from: flg$c */
    @i8e(EnumC11189pz.f72536a)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5882c {
    }

    /* JADX INFO: renamed from: flg$d */
    @p7e({p7e.EnumC10826a.f69936c})
    public static final class C5883d {

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final String f37076a;

        /* JADX INFO: renamed from: b */
        @un8
        @yfb
        public final String f37077b;

        /* JADX INFO: renamed from: c */
        @un8
        @yfb
        public final String f37078c;

        /* JADX INFO: renamed from: d */
        @un8
        @yfb
        public final List<String> f37079d;

        /* JADX INFO: renamed from: e */
        @un8
        @yfb
        public final List<String> f37080e;

        public C5883d(@yfb String str, @yfb String str2, @yfb String str3, @yfb List<String> list, @yfb List<String> list2) {
            md8.checkNotNullParameter(str, "referenceTable");
            md8.checkNotNullParameter(str2, "onDelete");
            md8.checkNotNullParameter(str3, "onUpdate");
            md8.checkNotNullParameter(list, "columnNames");
            md8.checkNotNullParameter(list2, "referenceColumnNames");
            this.f37076a = str;
            this.f37077b = str2;
            this.f37078c = str3;
            this.f37079d = list;
            this.f37080e = list2;
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5883d)) {
                return false;
            }
            C5883d c5883d = (C5883d) obj;
            if (md8.areEqual(this.f37076a, c5883d.f37076a) && md8.areEqual(this.f37077b, c5883d.f37077b) && md8.areEqual(this.f37078c, c5883d.f37078c) && md8.areEqual(this.f37079d, c5883d.f37079d)) {
                return md8.areEqual(this.f37080e, c5883d.f37080e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f37076a.hashCode() * 31) + this.f37077b.hashCode()) * 31) + this.f37078c.hashCode()) * 31) + this.f37079d.hashCode()) * 31) + this.f37080e.hashCode();
        }

        @yfb
        public String toString() {
            return "ForeignKey{referenceTable='" + this.f37076a + "', onDelete='" + this.f37077b + " +', onUpdate='" + this.f37078c + "', columnNames=" + this.f37079d + ", referenceColumnNames=" + this.f37080e + '}';
        }
    }

    /* JADX INFO: renamed from: flg$e */
    public static final class C5884e implements Comparable<C5884e> {

        /* JADX INFO: renamed from: a */
        public final int f37081a;

        /* JADX INFO: renamed from: b */
        public final int f37082b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final String f37083c;

        /* JADX INFO: renamed from: d */
        @yfb
        public final String f37084d;

        public C5884e(int i, int i2, @yfb String str, @yfb String str2) {
            md8.checkNotNullParameter(str, ymh.InterfaceC15729h.f102263c);
            md8.checkNotNullParameter(str2, "to");
            this.f37081a = i;
            this.f37082b = i2;
            this.f37083c = str;
            this.f37084d = str2;
        }

        @yfb
        public final String getFrom() {
            return this.f37083c;
        }

        public final int getId() {
            return this.f37081a;
        }

        public final int getSequence() {
            return this.f37082b;
        }

        @yfb
        public final String getTo() {
            return this.f37084d;
        }

        @Override // java.lang.Comparable
        public int compareTo(@yfb C5884e c5884e) {
            md8.checkNotNullParameter(c5884e, "other");
            int i = this.f37081a - c5884e.f37081a;
            return i == 0 ? this.f37082b - c5884e.f37082b : i;
        }
    }

    public flg(@yfb String str, @yfb Map<String, C5880a> map, @yfb Set<C5883d> set, @gib Set<C5885f> set2) {
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(map, "columns");
        md8.checkNotNullParameter(set, "foreignKeys");
        this.f37064a = str;
        this.f37065b = map;
        this.f37066c = set;
        this.f37067d = set2;
    }

    @do8
    @yfb
    public static final flg read(@yfb wfg wfgVar, @yfb String str) {
        return f37060e.read(wfgVar, str);
    }

    public boolean equals(@gib Object obj) {
        Set<C5885f> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flg)) {
            return false;
        }
        flg flgVar = (flg) obj;
        if (!md8.areEqual(this.f37064a, flgVar.f37064a) || !md8.areEqual(this.f37065b, flgVar.f37065b) || !md8.areEqual(this.f37066c, flgVar.f37066c)) {
            return false;
        }
        Set<C5885f> set2 = this.f37067d;
        if (set2 == null || (set = flgVar.f37067d) == null) {
            return true;
        }
        return md8.areEqual(set2, set);
    }

    public int hashCode() {
        return (((this.f37064a.hashCode() * 31) + this.f37065b.hashCode()) * 31) + this.f37066c.hashCode();
    }

    @yfb
    public String toString() {
        return "TableInfo{name='" + this.f37064a + "', columns=" + this.f37065b + ", foreignKeys=" + this.f37066c + ", indices=" + this.f37067d + '}';
    }

    public /* synthetic */ flg(String str, Map map, Set set, Set set2, int i, jt3 jt3Var) {
        this(str, map, set, (i & 8) != 0 ? null : set2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public flg(@yfb String str, @yfb Map<String, C5880a> map, @yfb Set<C5883d> set) {
        this(str, map, set, w6f.emptySet());
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(map, "columns");
        md8.checkNotNullParameter(set, "foreignKeys");
    }

    /* JADX INFO: renamed from: flg$a */
    public static final class C5880a {

        /* JADX INFO: renamed from: h */
        @yfb
        public static final a f37068h = new a(null);

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final String f37069a;

        /* JADX INFO: renamed from: b */
        @un8
        @yfb
        public final String f37070b;

        /* JADX INFO: renamed from: c */
        @un8
        public final boolean f37071c;

        /* JADX INFO: renamed from: d */
        @un8
        public final int f37072d;

        /* JADX INFO: renamed from: e */
        @gib
        @un8
        public final String f37073e;

        /* JADX INFO: renamed from: f */
        @un8
        public final int f37074f;

        /* JADX INFO: renamed from: g */
        @un8
        public final int f37075g;

        /* JADX INFO: renamed from: flg$a$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            private final boolean containsSurroundingParenthesis(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                return i2 == 0;
            }

            @do8
            @fdi
            @igg({"SyntheticAccessor"})
            public final boolean defaultValueEquals(@yfb String str, @gib String str2) {
                md8.checkNotNullParameter(str, "current");
                if (md8.areEqual(str, str2)) {
                    return true;
                }
                if (!containsSurroundingParenthesis(str)) {
                    return false;
                }
                String strSubstring = str.substring(1, str.length() - 1);
                md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return md8.areEqual(m9g.trim((CharSequence) strSubstring).toString(), str2);
            }

            private a() {
            }
        }

        public C5880a(@yfb String str, @yfb String str2, boolean z, int i, @gib String str3, int i2) {
            md8.checkNotNullParameter(str, "name");
            md8.checkNotNullParameter(str2, "type");
            this.f37069a = str;
            this.f37070b = str2;
            this.f37071c = z;
            this.f37072d = i;
            this.f37073e = str3;
            this.f37074f = i2;
            this.f37075g = findAffinity(str2);
        }

        @do8
        @fdi
        @igg({"SyntheticAccessor"})
        public static final boolean defaultValueEquals(@yfb String str, @gib String str2) {
            return f37068h.defaultValueEquals(str, str2);
        }

        @ab2.InterfaceC0141c
        private final int findAffinity(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            md8.checkNotNullExpressionValue(locale, "US");
            String upperCase = str.toUpperCase(locale);
            md8.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (m9g.contains$default((CharSequence) upperCase, (CharSequence) "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (m9g.contains$default((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null) || m9g.contains$default((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null) || m9g.contains$default((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (m9g.contains$default((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            return (m9g.contains$default((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null) || m9g.contains$default((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null) || m9g.contains$default((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null)) ? 4 : 1;
        }

        @ab2.InterfaceC0141c
        public static /* synthetic */ void getAffinity$annotations() {
        }

        public boolean equals(@gib Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5880a) || this.f37072d != ((C5880a) obj).f37072d) {
                return false;
            }
            C5880a c5880a = (C5880a) obj;
            if (!md8.areEqual(this.f37069a, c5880a.f37069a) || this.f37071c != c5880a.f37071c) {
                return false;
            }
            if (this.f37074f == 1 && c5880a.f37074f == 2 && (str3 = this.f37073e) != null && !f37068h.defaultValueEquals(str3, c5880a.f37073e)) {
                return false;
            }
            if (this.f37074f == 2 && c5880a.f37074f == 1 && (str2 = c5880a.f37073e) != null && !f37068h.defaultValueEquals(str2, this.f37073e)) {
                return false;
            }
            int i = this.f37074f;
            return (i == 0 || i != c5880a.f37074f || ((str = this.f37073e) == null ? c5880a.f37073e == null : f37068h.defaultValueEquals(str, c5880a.f37073e))) && this.f37075g == c5880a.f37075g;
        }

        public int hashCode() {
            return (((((this.f37069a.hashCode() * 31) + this.f37075g) * 31) + (this.f37071c ? 1231 : 1237)) * 31) + this.f37072d;
        }

        public final boolean isPrimaryKey() {
            return this.f37072d > 0;
        }

        @yfb
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f37069a);
            sb.append("', type='");
            sb.append(this.f37070b);
            sb.append("', affinity='");
            sb.append(this.f37075g);
            sb.append("', notNull=");
            sb.append(this.f37071c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f37072d);
            sb.append(", defaultValue='");
            String str = this.f37073e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @q64(message = "Use {@link Column#Column(String, String, boolean, int, String, int)} instead.")
        public C5880a(@yfb String str, @yfb String str2, boolean z, int i) {
            this(str, str2, z, i, null, 0);
            md8.checkNotNullParameter(str, "name");
            md8.checkNotNullParameter(str2, "type");
        }
    }

    /* JADX INFO: renamed from: flg$f */
    @p7e({p7e.EnumC10826a.f69936c})
    public static final class C5885f {

        /* JADX INFO: renamed from: e */
        @yfb
        public static final a f37085e = new a(null);

        /* JADX INFO: renamed from: f */
        @yfb
        public static final String f37086f = "index_";

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final String f37087a;

        /* JADX INFO: renamed from: b */
        @un8
        public final boolean f37088b;

        /* JADX INFO: renamed from: c */
        @un8
        @yfb
        public final List<String> f37089c;

        /* JADX INFO: renamed from: d */
        @un8
        @yfb
        public List<String> f37090d;

        /* JADX INFO: renamed from: flg$f$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public C5885f(@yfb String str, boolean z, @yfb List<String> list, @yfb List<String> list2) {
            md8.checkNotNullParameter(str, "name");
            md8.checkNotNullParameter(list, "columns");
            md8.checkNotNullParameter(list2, "orders");
            this.f37087a = str;
            this.f37088b = z;
            this.f37089c = list;
            this.f37090d = list2;
            List<String> arrayList = list2;
            if (arrayList.isEmpty()) {
                int size = list.size();
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(tz7.EnumC13297a.ASC.name());
                }
            }
            this.f37090d = (List) arrayList;
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5885f)) {
                return false;
            }
            C5885f c5885f = (C5885f) obj;
            if (this.f37088b == c5885f.f37088b && md8.areEqual(this.f37089c, c5885f.f37089c) && md8.areEqual(this.f37090d, c5885f.f37090d)) {
                return h9g.startsWith$default(this.f37087a, f37086f, false, 2, null) ? h9g.startsWith$default(c5885f.f37087a, f37086f, false, 2, null) : md8.areEqual(this.f37087a, c5885f.f37087a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((h9g.startsWith$default(this.f37087a, f37086f, false, 2, null) ? -1184239155 : this.f37087a.hashCode()) * 31) + (this.f37088b ? 1 : 0)) * 31) + this.f37089c.hashCode()) * 31) + this.f37090d.hashCode();
        }

        @yfb
        public String toString() {
            return "Index{name='" + this.f37087a + "', unique=" + this.f37088b + ", columns=" + this.f37089c + ", orders=" + this.f37090d + "'}";
        }

        @q64(message = "Use {@link #Index(String, boolean, List, List)}")
        public C5885f(@yfb String str, boolean z, @yfb List<String> list) {
            md8.checkNotNullParameter(str, "name");
            md8.checkNotNullParameter(list, "columns");
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(tz7.EnumC13297a.ASC.name());
            }
            this(str, z, list, arrayList);
        }
    }
}
