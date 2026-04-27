package p000;

import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
@c15
@AutoValue
public abstract class oae {

    /* JADX INFO: renamed from: a */
    public static final int f67005a = 256;

    /* JADX INFO: renamed from: b */
    public static final zf3 f67006b = new mk8().configureWith(bj0.f13846b).build();

    /* JADX INFO: renamed from: a */
    public static oae m18546a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return create(jSONObject.getString(nae.f63811a), jSONObject.getString(nae.f63813c), jSONObject.getString(nae.f63814d), jSONObject.getString(nae.f63812b), jSONObject.getLong(nae.f63815e));
    }

    public static oae create(String str, String str2, String str3, String str4, long j) {
        return new pl0(str, str2, validate(str3), str4, j);
    }

    private static String validate(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();

    public z33.AbstractC15965f.d.e toReportProto() {
        return z33.AbstractC15965f.d.e.builder().setRolloutVariant(z33.AbstractC15965f.d.e.b.builder().setVariantId(getVariantId()).setRolloutId(getRolloutId()).build()).setParameterKey(getParameterKey()).setParameterValue(getParameterValue()).setTemplateVersion(getTemplateVersion()).build();
    }
}
