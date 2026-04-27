package p000;

import org.json.JSONObject;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class p4e {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C10794a f69642a = new C10794a(null);

    /* JADX INFO: renamed from: p4e$a */
    public static final class C10794a {
        public /* synthetic */ C10794a(jt3 jt3Var) {
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

        private C10794a() {
        }
    }

    @do8
    @p7e({p7e.EnumC10826a.f69934a})
    public static final boolean isValidJSON(@yfb String str) {
        return f69642a.isValidJSON(str);
    }
}
