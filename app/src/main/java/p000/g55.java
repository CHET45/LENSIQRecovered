package p000;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class g55 {

    /* JADX INFO: renamed from: e */
    public static final String f38796e = "code";

    /* JADX INFO: renamed from: f */
    public static final String f38797f = "sub_code";

    /* JADX INFO: renamed from: g */
    public static final String f38798g = "desc";

    /* JADX INFO: renamed from: h */
    public static final String f38799h = "message";

    /* JADX INFO: renamed from: a */
    public final int f38800a;

    /* JADX INFO: renamed from: b */
    public final String f38801b;

    /* JADX INFO: renamed from: c */
    public final int f38802c;

    /* JADX INFO: renamed from: d */
    public String f38803d;

    public g55(int i, String str, int i2, String str2) {
        this.f38800a = i;
        this.f38801b = str;
        this.f38802c = i2;
        this.f38803d = str2;
    }

    public static g55 parseJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(f38796e) && jSONObject.has(f38797f)) {
                return new g55(jSONObject.getInt(f38796e), jSONObject.has(f38798g) ? jSONObject.getString(f38798g) : null, jSONObject.getInt(f38797f), jSONObject.has(f38799h) ? jSONObject.getString(f38799h) : null);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String toJsonString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"");
        sb.append(f38796e);
        sb.append("\":");
        sb.append(this.f38800a);
        if (!TextUtils.isEmpty(this.f38801b)) {
            sb.append(", \"");
            sb.append(f38798g);
            sb.append("\":\"");
            sb.append(this.f38801b);
            sb.append("\"");
        }
        sb.append(", \"");
        sb.append(f38797f);
        sb.append("\":");
        sb.append(this.f38802c);
        if (!TextUtils.isEmpty(this.f38803d)) {
            sb.append(", \"");
            sb.append(f38799h);
            sb.append("\":\"");
            sb.append(this.f38803d);
            sb.append("\"");
        }
        sb.append("}");
        return sb.toString();
    }

    public Integer getCode() {
        return Integer.valueOf(this.f38800a);
    }

    public String getCodeDesc() {
        return this.f38801b;
    }

    public int getSubCode() {
        return this.f38802c;
    }

    public String getSubMessage() {
        return this.f38803d;
    }

    public void setSubMessage(String str) {
        this.f38803d = str;
    }

    public String toString() {
        return toJsonString();
    }
}
