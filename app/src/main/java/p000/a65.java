package p000;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.rk0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class a65 {

    /* JADX INFO: renamed from: a65$a */
    @AutoValue.Builder
    public static abstract class AbstractC0073a {
        /* JADX INFO: renamed from: a */
        public abstract Map<String, String> mo164a();

        public final AbstractC0073a addMetadata(String str, String str2) {
            mo164a().put(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public abstract AbstractC0073a mo165b(Map<String, String> map);

        public abstract a65 build();

        public abstract AbstractC0073a setCode(Integer num);

        public abstract AbstractC0073a setEncodedPayload(k15 k15Var);

        public abstract AbstractC0073a setEventMillis(long j);

        public abstract AbstractC0073a setExperimentIdsClear(byte[] bArr);

        public abstract AbstractC0073a setExperimentIdsEncrypted(byte[] bArr);

        public abstract AbstractC0073a setProductId(Integer num);

        public abstract AbstractC0073a setPseudonymousId(String str);

        public abstract AbstractC0073a setTransportName(String str);

        public abstract AbstractC0073a setUptimeMillis(long j);

        public final AbstractC0073a addMetadata(String str, long j) {
            mo164a().put(str, String.valueOf(j));
            return this;
        }

        public final AbstractC0073a addMetadata(String str, int i) {
            mo164a().put(str, String.valueOf(i));
            return this;
        }
    }

    public static AbstractC0073a builder() {
        return new rk0.C12126b().mo165b(new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public abstract Map<String, String> mo163a();

    public final String get(String str) {
        String str2 = mo163a().get(str);
        return str2 == null ? "" : str2;
    }

    @hib
    public abstract Integer getCode();

    public abstract k15 getEncodedPayload();

    public abstract long getEventMillis();

    @hib
    public abstract byte[] getExperimentIdsClear();

    @hib
    public abstract byte[] getExperimentIdsEncrypted();

    public final int getInteger(String str) {
        String str2 = mo163a().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long getLong(String str) {
        String str2 = mo163a().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(mo163a());
    }

    public final String getOrDefault(String str, String str2) {
        String str3 = mo163a().get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    public byte[] getPayload() {
        return getEncodedPayload().getBytes();
    }

    @hib
    public abstract Integer getProductId();

    @hib
    public abstract String getPseudonymousId();

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public AbstractC0073a toBuilder() {
        return new rk0.C12126b().setTransportName(getTransportName()).setCode(getCode()).setProductId(getProductId()).setPseudonymousId(getPseudonymousId()).setExperimentIdsClear(getExperimentIdsClear()).setExperimentIdsEncrypted(getExperimentIdsEncrypted()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).mo165b(new HashMap(mo163a()));
    }
}
