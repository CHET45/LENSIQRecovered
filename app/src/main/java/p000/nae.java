package p000;

import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;
import p000.ol0;

/* JADX INFO: loaded from: classes5.dex */
@c15
@AutoValue
public abstract class nae {

    /* JADX INFO: renamed from: a */
    public static final String f63811a = "rolloutId";

    /* JADX INFO: renamed from: b */
    public static final String f63812b = "variantId";

    /* JADX INFO: renamed from: c */
    public static final String f63813c = "parameterKey";

    /* JADX INFO: renamed from: d */
    public static final String f63814d = "parameterValue";

    /* JADX INFO: renamed from: e */
    public static final String f63815e = "templateVersion";

    /* JADX INFO: renamed from: f */
    public static final zf3 f63816f = new mk8().configureWith(cj0.f16675b).build();

    /* JADX INFO: renamed from: nae$a */
    @AutoValue.Builder
    public static abstract class AbstractC9767a {
        @efb
        public abstract nae build();

        @efb
        public abstract AbstractC9767a setParameterKey(@efb String str);

        @efb
        public abstract AbstractC9767a setParameterValue(@efb String str);

        @efb
        public abstract AbstractC9767a setRolloutId(@efb String str);

        @efb
        public abstract AbstractC9767a setTemplateVersion(long j);

        @efb
        public abstract AbstractC9767a setVariantId(@efb String str);
    }

    @efb
    public static AbstractC9767a builder() {
        return new ol0.C10446b();
    }

    @efb
    public static nae create(@efb JSONObject jSONObject) throws JSONException {
        return builder().setRolloutId(jSONObject.getString(f63811a)).setVariantId(jSONObject.getString(f63812b)).setParameterKey(jSONObject.getString(f63813c)).setParameterValue(jSONObject.getString(f63814d)).setTemplateVersion(jSONObject.getLong(f63815e)).build();
    }

    @efb
    public abstract String getParameterKey();

    @efb
    public abstract String getParameterValue();

    @efb
    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    @efb
    public abstract String getVariantId();

    @efb
    public static nae create(@efb String str) throws JSONException {
        return create(new JSONObject(str));
    }
}
