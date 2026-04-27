package p000;

import com.google.auto.value.AutoValue;
import p000.qk0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class u55 {

    /* JADX INFO: renamed from: u55$a */
    @AutoValue.Builder
    public static abstract class AbstractC13366a {
        @efb
        public abstract u55 build();

        @efb
        public abstract AbstractC13366a setExperimentIdsClear(byte[] bArr);

        @efb
        public abstract AbstractC13366a setExperimentIdsEncrypted(byte[] bArr);

        @efb
        public abstract AbstractC13366a setPseudonymousId(String str);
    }

    public static AbstractC13366a builder() {
        return new qk0.C11519b();
    }

    @hib
    public abstract byte[] getExperimentIdsClear();

    @hib
    public abstract byte[] getExperimentIdsEncrypted();

    @hib
    public abstract String getPseudonymousId();
}
