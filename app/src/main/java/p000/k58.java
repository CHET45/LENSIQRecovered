package p000;

import com.google.auto.value.AutoValue;
import p000.el0;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class k58 {

    /* JADX INFO: renamed from: k58$a */
    @AutoValue.Builder
    public static abstract class AbstractC8200a {
        @efb
        public abstract k58 build();

        @efb
        public abstract AbstractC8200a setToken(@efb String str);

        @efb
        public abstract AbstractC8200a setTokenCreationTimestamp(long j);

        @efb
        public abstract AbstractC8200a setTokenExpirationTimestamp(long j);
    }

    @efb
    public static AbstractC8200a builder() {
        return new el0.C5364b();
    }

    @efb
    public abstract String getToken();

    @efb
    public abstract long getTokenCreationTimestamp();

    @efb
    public abstract long getTokenExpirationTimestamp();

    @efb
    public abstract AbstractC8200a toBuilder();
}
