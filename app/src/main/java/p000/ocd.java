package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ocd {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C10310a f67204c = new C10310a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f67205d = "package_name";

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String f67206e = "signatures";

    /* JADX INFO: renamed from: f */
    @yfb
    public static final String f67207f = "cert_fingerprint_sha256";

    /* JADX INFO: renamed from: g */
    @yfb
    public static final String f67208g = "build";

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f67209h = "userdebug";

    /* JADX INFO: renamed from: i */
    @yfb
    public static final String f67210i = "type";

    /* JADX INFO: renamed from: j */
    @yfb
    public static final String f67211j = "info";

    /* JADX INFO: renamed from: k */
    @yfb
    public static final String f67212k = "android";

    /* JADX INFO: renamed from: l */
    @yfb
    public static final String f67213l = "userdebug";

    /* JADX INFO: renamed from: m */
    @yfb
    public static final String f67214m = "apps";

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f67215a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Set<String> f67216b;

    /* JADX INFO: renamed from: ocd$a */
    public static final class C10310a {
        public /* synthetic */ C10310a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final ocd createFromJSONObject(@yfb JSONObject jSONObject, boolean z) throws JSONException {
            md8.checkNotNullParameter(jSONObject, "appInfoJsonObject");
            JSONArray jSONArray = jSONObject.getJSONArray(ocd.f67206e);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (!z || !md8.areEqual("userdebug", jSONArray.getJSONObject(i).optString(ocd.f67208g)) || md8.areEqual("userdebug", Build.TYPE)) {
                    String string = jSONArray.getJSONObject(i).getString(ocd.f67207f);
                    md8.checkNotNullExpressionValue(string, "signaturesJson.getJSONOb…etString(FINGERPRINT_KEY)");
                    linkedHashSet.add(string);
                }
            }
            String string2 = jSONObject.getString(ocd.f67205d);
            md8.checkNotNullExpressionValue(string2, "appInfoJsonObject.getString(PACKAGE_NAME_KEY)");
            return new ocd(string2, linkedHashSet);
        }

        @do8
        @yfb
        public final List<ocd> extractPrivilegedApps$credentials_release(@yfb JSONObject jSONObject) throws JSONException {
            md8.checkNotNullParameter(jSONObject, "jsonObject");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(ocd.f67214m);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (md8.areEqual(jSONObject2.getString("type"), "android")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(ocd.f67211j);
                    md8.checkNotNullExpressionValue(jSONObject3, "appJsonObject.getJSONObject(APP_INFO_KEY)");
                    arrayList.add(createFromJSONObject(jSONObject3, true));
                }
            }
            return arrayList;
        }

        private C10310a() {
        }
    }

    public ocd(@yfb String str, @yfb Set<String> set) {
        md8.checkNotNullParameter(str, "packageName");
        md8.checkNotNullParameter(set, "fingerprints");
        this.f67215a = str;
        this.f67216b = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ocd copy$default(ocd ocdVar, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ocdVar.f67215a;
        }
        if ((i & 2) != 0) {
            set = ocdVar.f67216b;
        }
        return ocdVar.copy(str, set);
    }

    @do8
    @yfb
    public static final ocd createFromJSONObject(@yfb JSONObject jSONObject, boolean z) {
        return f67204c.createFromJSONObject(jSONObject, z);
    }

    @yfb
    public final String component1() {
        return this.f67215a;
    }

    @yfb
    public final Set<String> component2() {
        return this.f67216b;
    }

    @yfb
    public final ocd copy(@yfb String str, @yfb Set<String> set) {
        md8.checkNotNullParameter(str, "packageName");
        md8.checkNotNullParameter(set, "fingerprints");
        return new ocd(str, set);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocd)) {
            return false;
        }
        ocd ocdVar = (ocd) obj;
        return md8.areEqual(this.f67215a, ocdVar.f67215a) && md8.areEqual(this.f67216b, ocdVar.f67216b);
    }

    @yfb
    public final Set<String> getFingerprints() {
        return this.f67216b;
    }

    @yfb
    public final String getPackageName() {
        return this.f67215a;
    }

    public int hashCode() {
        return (this.f67215a.hashCode() * 31) + this.f67216b.hashCode();
    }

    @yfb
    public String toString() {
        return "PrivilegedApp(packageName=" + this.f67215a + ", fingerprints=" + this.f67216b + ')';
    }
}
