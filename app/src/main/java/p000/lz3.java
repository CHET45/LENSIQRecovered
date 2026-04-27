package p000;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class lz3 implements s7f {

    /* JADX INFO: renamed from: d */
    public static final String f59305d = "X-CRASHLYTICS-GOOGLE-APP-ID";

    /* JADX INFO: renamed from: e */
    public static final String f59306e = "X-CRASHLYTICS-API-CLIENT-TYPE";

    /* JADX INFO: renamed from: f */
    public static final String f59307f = "X-CRASHLYTICS-API-CLIENT-VERSION";

    /* JADX INFO: renamed from: g */
    public static final String f59308g = "User-Agent";

    /* JADX INFO: renamed from: h */
    public static final String f59309h = "Accept";

    /* JADX INFO: renamed from: i */
    public static final String f59310i = "Crashlytics Android SDK/";

    /* JADX INFO: renamed from: j */
    public static final String f59311j = "application/json";

    /* JADX INFO: renamed from: k */
    public static final String f59312k = "android";

    /* JADX INFO: renamed from: l */
    public static final String f59313l = "build_version";

    /* JADX INFO: renamed from: m */
    public static final String f59314m = "display_version";

    /* JADX INFO: renamed from: n */
    public static final String f59315n = "instance";

    /* JADX INFO: renamed from: o */
    public static final String f59316o = "source";

    /* JADX INFO: renamed from: p */
    public static final String f59317p = "X-CRASHLYTICS-DEVICE-MODEL";

    /* JADX INFO: renamed from: q */
    public static final String f59318q = "X-CRASHLYTICS-OS-BUILD-VERSION";

    /* JADX INFO: renamed from: r */
    public static final String f59319r = "X-CRASHLYTICS-OS-DISPLAY-VERSION";

    /* JADX INFO: renamed from: s */
    public static final String f59320s = "X-CRASHLYTICS-INSTALLATION-ID";

    /* JADX INFO: renamed from: a */
    public final String f59321a;

    /* JADX INFO: renamed from: b */
    public final lo7 f59322b;

    /* JADX INFO: renamed from: c */
    public final ej9 f59323c;

    public lz3(String str, lo7 lo7Var) {
        this(str, lo7Var, ej9.getLogger());
    }

    private eo7 applyHeadersTo(eo7 eo7Var, r7f r7fVar) {
        applyNonNullHeader(eo7Var, f59305d, r7fVar.f77347a);
        applyNonNullHeader(eo7Var, f59306e, "android");
        applyNonNullHeader(eo7Var, f59307f, p33.getVersion());
        applyNonNullHeader(eo7Var, "Accept", "application/json");
        applyNonNullHeader(eo7Var, f59317p, r7fVar.f77348b);
        applyNonNullHeader(eo7Var, f59318q, r7fVar.f77349c);
        applyNonNullHeader(eo7Var, f59319r, r7fVar.f77350d);
        applyNonNullHeader(eo7Var, f59320s, r7fVar.f77351e.getInstallIds().getCrashlyticsInstallId());
        return eo7Var;
    }

    private void applyNonNullHeader(eo7 eo7Var, String str, String str2) {
        if (str2 != null) {
            eo7Var.header(str, str2);
        }
    }

    private JSONObject getJsonObjectFrom(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            this.f59323c.m10070w("Failed to parse settings JSON from " + this.f59321a, e);
            this.f59323c.m10069w("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> getQueryParamsFor(r7f r7fVar) {
        HashMap map = new HashMap();
        map.put(f59313l, r7fVar.f77354h);
        map.put(f59314m, r7fVar.f77353g);
        map.put("source", Integer.toString(r7fVar.f77355i));
        String str = r7fVar.f77352f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public eo7 m16476a(Map<String, String> map) {
        return this.f59322b.buildHttpGetRequest(this.f59321a, map).header("User-Agent", f59310i + p33.getVersion()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m16477b(oo7 oo7Var) {
        int iCode = oo7Var.code();
        this.f59323c.m10067v("Settings response code was: " + iCode);
        if (m16478c(iCode)) {
            return getJsonObjectFrom(oo7Var.body());
        }
        this.f59323c.m10063e("Settings request failed; (status: " + iCode + ") from " + this.f59321a);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m16478c(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    @Override // p000.s7f
    public JSONObject invoke(r7f r7fVar, boolean z) {
        g53.checkBlockingThread();
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> queryParamsFor = getQueryParamsFor(r7fVar);
            eo7 eo7VarApplyHeadersTo = applyHeadersTo(m16476a(queryParamsFor), r7fVar);
            this.f59323c.m10061d("Requesting settings from " + this.f59321a);
            this.f59323c.m10067v("Settings query params were: " + queryParamsFor);
            return m16477b(eo7VarApplyHeadersTo.execute());
        } catch (IOException e) {
            this.f59323c.m10064e("Settings request failed.", e);
            return null;
        }
    }

    public lz3(String str, lo7 lo7Var, ej9 ej9Var) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f59323c = ej9Var;
        this.f59322b = lo7Var;
        this.f59321a = str;
    }
}
