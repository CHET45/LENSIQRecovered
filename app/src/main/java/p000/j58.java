package p000;

import com.google.auto.value.AutoValue;
import p000.dl0;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class j58 {

    /* JADX INFO: renamed from: j58$a */
    @AutoValue.Builder
    public static abstract class AbstractC7740a {
        @efb
        public abstract j58 build();

        @efb
        public abstract AbstractC7740a setAuthToken(@efb v3h v3hVar);

        @efb
        public abstract AbstractC7740a setFid(@efb String str);

        @efb
        public abstract AbstractC7740a setRefreshToken(@efb String str);

        @efb
        public abstract AbstractC7740a setResponseCode(@efb EnumC7741b enumC7741b);

        @efb
        public abstract AbstractC7740a setUri(@efb String str);
    }

    /* JADX INFO: renamed from: j58$b */
    public enum EnumC7741b {
        OK,
        BAD_CONFIG
    }

    @efb
    public static AbstractC7740a builder() {
        return new dl0.C4841b();
    }

    @hib
    public abstract v3h getAuthToken();

    @hib
    public abstract String getFid();

    @hib
    public abstract String getRefreshToken();

    @hib
    public abstract EnumC7741b getResponseCode();

    @hib
    public abstract String getUri();

    @efb
    public abstract AbstractC7740a toBuilder();
}
