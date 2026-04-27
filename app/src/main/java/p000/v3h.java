package p000;

import com.google.auto.value.AutoValue;
import p000.cm0;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class v3h {

    /* JADX INFO: renamed from: v3h$a */
    @AutoValue.Builder
    public static abstract class AbstractC13855a {
        @efb
        public abstract v3h build();

        @efb
        public abstract AbstractC13855a setResponseCode(@efb EnumC13856b enumC13856b);

        @efb
        public abstract AbstractC13855a setToken(@efb String str);

        @efb
        public abstract AbstractC13855a setTokenExpirationTimestamp(long j);
    }

    /* JADX INFO: renamed from: v3h$b */
    public enum EnumC13856b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @efb
    public static AbstractC13855a builder() {
        return new cm0.C2385b().setTokenExpirationTimestamp(0L);
    }

    @hib
    public abstract EnumC13856b getResponseCode();

    @hib
    public abstract String getToken();

    @efb
    public abstract long getTokenExpirationTimestamp();

    @efb
    public abstract AbstractC13855a toBuilder();
}
