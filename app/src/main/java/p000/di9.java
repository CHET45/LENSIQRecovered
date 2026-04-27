package p000;

import com.google.auto.value.AutoValue;
import p000.gl0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class di9 {

    /* JADX INFO: renamed from: di9$a */
    @AutoValue.Builder
    public static abstract class AbstractC4796a {
        @efb
        /* JADX INFO: renamed from: a */
        public abstract AbstractC4796a mo9177a(@hib byte[] bArr);

        @efb
        /* JADX INFO: renamed from: b */
        public abstract AbstractC4796a mo9178b(@hib String str);

        @efb
        public abstract di9 build();

        @efb
        public abstract AbstractC4796a setComplianceData(@hib wi2 wi2Var);

        @efb
        public abstract AbstractC4796a setEventCode(@hib Integer num);

        @efb
        public abstract AbstractC4796a setEventTimeMs(long j);

        @efb
        public abstract AbstractC4796a setEventUptimeMs(long j);

        @efb
        public abstract AbstractC4796a setExperimentIds(@hib cg5 cg5Var);

        @efb
        public abstract AbstractC4796a setNetworkConnectionInfo(@hib gbb gbbVar);

        @efb
        public abstract AbstractC4796a setTimezoneOffsetSeconds(long j);
    }

    private static AbstractC4796a builder() {
        return new gl0.C6367b();
    }

    @efb
    public static AbstractC4796a jsonBuilder(@efb String str) {
        return builder().mo9178b(str);
    }

    @efb
    public static AbstractC4796a protoBuilder(@efb byte[] bArr) {
        return builder().mo9177a(bArr);
    }

    @hib
    public abstract wi2 getComplianceData();

    @hib
    public abstract Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    @hib
    public abstract cg5 getExperimentIds();

    @hib
    public abstract gbb getNetworkConnectionInfo();

    @hib
    public abstract byte[] getSourceExtension();

    @hib
    public abstract String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();
}
