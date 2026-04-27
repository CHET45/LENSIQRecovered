package p000;

import android.database.Cursor;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class o9i {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C10275a f66950c = new C10275a(null);

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final String f66951a;

    /* JADX INFO: renamed from: b */
    @gib
    @un8
    public final String f66952b;

    /* JADX INFO: renamed from: o9i$a */
    public static final class C10275a {
        public /* synthetic */ C10275a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final o9i read(@yfb wfg wfgVar, @yfb String str) {
            o9i o9iVar;
            md8.checkNotNullParameter(wfgVar, "database");
            md8.checkNotNullParameter(str, "viewName");
            Cursor cursorQuery = wfgVar.query("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + '\'');
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(0);
                    md8.checkNotNullExpressionValue(string, "cursor.getString(0)");
                    o9iVar = new o9i(string, cursorQuery.getString(1));
                } else {
                    o9iVar = new o9i(str, null);
                }
                u52.closeFinally(cursorQuery, null);
                return o9iVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u52.closeFinally(cursorQuery, th);
                    throw th2;
                }
            }
        }

        private C10275a() {
        }
    }

    public o9i(@yfb String str, @gib String str2) {
        md8.checkNotNullParameter(str, "name");
        this.f66951a = str;
        this.f66952b = str2;
    }

    @do8
    @yfb
    public static final o9i read(@yfb wfg wfgVar, @yfb String str) {
        return f66950c.read(wfgVar, str);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9i)) {
            return false;
        }
        o9i o9iVar = (o9i) obj;
        if (md8.areEqual(this.f66951a, o9iVar.f66951a)) {
            String str = this.f66952b;
            String str2 = o9iVar.f66952b;
            if (str != null ? md8.areEqual(str, str2) : str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f66951a.hashCode() * 31;
        String str = this.f66952b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "ViewInfo{name='" + this.f66951a + "', sql='" + this.f66952b + "'}";
    }
}
