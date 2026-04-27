package p000;

import org.json.JSONObject;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class q4e {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C11307a f73193a = new C11307a(null);

    /* JADX INFO: renamed from: q4e$a */
    public static final class C11307a {
        public /* synthetic */ C11307a(jt3 jt3Var) {
            this();
        }

        @do8
        @p7e({p7e.EnumC10826a.f69934a})
        public final boolean isValidJSON(@yfb String str) {
            md8.checkNotNullParameter(str, "jsonString");
            if (str.length() == 0) {
                return false;
            }
            try {
                new JSONObject(str);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        private C11307a() {
        }
    }

    @do8
    @p7e({p7e.EnumC10826a.f69934a})
    public static final boolean isValidJSON(@yfb String str) {
        return f73193a.isValidJSON(str);
    }
}
