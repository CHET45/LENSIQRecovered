package p000;

import android.database.Cursor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class yx6 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C15866a f103240d = new C15866a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String[] f103241e = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final String f103242a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public final Set<String> f103243b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public final Set<String> f103244c;

    /* JADX INFO: renamed from: yx6$a */
    public static final class C15866a {
        public /* synthetic */ C15866a(jt3 jt3Var) {
            this();
        }

        private final Set<String> readColumns(wfg wfgVar, String str) {
            Set setCreateSetBuilder = v6f.createSetBuilder();
            Cursor cursorQuery = wfgVar.query("PRAGMA table_info(`" + str + "`)");
            try {
                if (cursorQuery.getColumnCount() > 0) {
                    int columnIndex = cursorQuery.getColumnIndex("name");
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        md8.checkNotNullExpressionValue(string, "cursor.getString(nameIndex)");
                        setCreateSetBuilder.add(string);
                    }
                }
                bth bthVar = bth.f14751a;
                u52.closeFinally(cursorQuery, null);
                return v6f.build(setCreateSetBuilder);
            } finally {
            }
        }

        private final Set<String> readOptions(wfg wfgVar, String str) {
            Cursor cursorQuery = wfgVar.query("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("sql")) : "";
                u52.closeFinally(cursorQuery, null);
                md8.checkNotNullExpressionValue(string, "sql");
                return parseOptions(string);
            } finally {
            }
        }

        @do8
        @yfb
        @fdi
        public final Set<String> parseOptions(@yfb String str) {
            Character ch;
            md8.checkNotNullParameter(str, "createStatement");
            if (str.length() == 0) {
                return w6f.emptySet();
            }
            String strSubstring = str.substring(m9g.indexOf$default((CharSequence) str, '(', 0, false, 6, (Object) null) + 1, m9g.lastIndexOf$default((CharSequence) str, ')', 0, false, 6, (Object) null));
            md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (i2 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(i2);
                int i4 = i3 + 1;
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '`') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    } else {
                        Character ch2 = (Character) arrayDeque.peek();
                        if (ch2 != null && ch2.charValue() == cCharAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (cCharAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    }
                } else if (cCharAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (cCharAt == ',' && arrayDeque.isEmpty()) {
                    String strSubstring2 = strSubstring.substring(i + 1, i3);
                    md8.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = strSubstring2.length() - 1;
                    int i5 = 0;
                    boolean z = false;
                    while (i5 <= length) {
                        boolean z2 = md8.compare((int) strSubstring2.charAt(!z ? i5 : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i5++;
                        } else {
                            z = true;
                        }
                    }
                    arrayList.add(strSubstring2.subSequence(i5, length + 1).toString());
                    i = i3;
                }
                i2++;
                i3 = i4;
            }
            String strSubstring3 = strSubstring.substring(i + 1);
            md8.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(m9g.trim((CharSequence) strSubstring3).toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str2 = (String) obj;
                String[] strArr = yx6.f103241e;
                int length2 = strArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        break;
                    }
                    if (h9g.startsWith$default(str2, strArr[i6], false, 2, null)) {
                        arrayList2.add(obj);
                        break;
                    }
                    i6++;
                }
            }
            return v82.toSet(arrayList2);
        }

        @do8
        @yfb
        @igg({"SyntheticAccessor"})
        public final yx6 read(@yfb wfg wfgVar, @yfb String str) {
            md8.checkNotNullParameter(wfgVar, "database");
            md8.checkNotNullParameter(str, "tableName");
            return new yx6(str, readColumns(wfgVar, str), readOptions(wfgVar, str));
        }

        private C15866a() {
        }
    }

    public yx6(@yfb String str, @yfb Set<String> set, @yfb Set<String> set2) {
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(set, "columns");
        md8.checkNotNullParameter(set2, "options");
        this.f103242a = str;
        this.f103243b = set;
        this.f103244c = set2;
    }

    @do8
    @yfb
    @fdi
    public static final Set<String> parseOptions(@yfb String str) {
        return f103240d.parseOptions(str);
    }

    @do8
    @yfb
    @igg({"SyntheticAccessor"})
    public static final yx6 read(@yfb wfg wfgVar, @yfb String str) {
        return f103240d.read(wfgVar, str);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx6)) {
            return false;
        }
        yx6 yx6Var = (yx6) obj;
        if (md8.areEqual(this.f103242a, yx6Var.f103242a) && md8.areEqual(this.f103243b, yx6Var.f103243b)) {
            return md8.areEqual(this.f103244c, yx6Var.f103244c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f103242a.hashCode() * 31) + this.f103243b.hashCode()) * 31) + this.f103244c.hashCode();
    }

    @yfb
    public String toString() {
        return "FtsTableInfo{name='" + this.f103242a + "', columns=" + this.f103243b + ", options=" + this.f103244c + "'}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yx6(@yfb String str, @yfb Set<String> set, @yfb String str2) {
        this(str, set, f103240d.parseOptions(str2));
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(set, "columns");
        md8.checkNotNullParameter(str2, "createSql");
    }
}
