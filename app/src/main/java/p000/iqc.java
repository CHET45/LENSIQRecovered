package p000;

import com.google.auto.value.AutoValue;
import p000.hqc;
import p000.ml0;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class iqc {

    /* JADX INFO: renamed from: a */
    @efb
    public static iqc f47972a = builder().build();

    /* JADX INFO: renamed from: iqc$a */
    @AutoValue.Builder
    public static abstract class AbstractC7565a {
        @efb
        public abstract iqc build();

        @efb
        public abstract AbstractC7565a setAuthToken(@hib String str);

        @efb
        public abstract AbstractC7565a setExpiresInSecs(long j);

        @efb
        public abstract AbstractC7565a setFirebaseInstallationId(@efb String str);

        @efb
        public abstract AbstractC7565a setFisError(@hib String str);

        @efb
        public abstract AbstractC7565a setRefreshToken(@hib String str);

        @efb
        public abstract AbstractC7565a setRegistrationStatus(@efb hqc.EnumC6973a enumC6973a);

        @efb
        public abstract AbstractC7565a setTokenCreationEpochInSecs(long j);
    }

    @efb
    public static AbstractC7565a builder() {
        return new ml0.C9391b().setTokenCreationEpochInSecs(0L).setRegistrationStatus(hqc.EnumC6973a.ATTEMPT_MIGRATION).setExpiresInSecs(0L);
    }

    @hib
    public abstract String getAuthToken();

    public abstract long getExpiresInSecs();

    @hib
    public abstract String getFirebaseInstallationId();

    @hib
    public abstract String getFisError();

    @hib
    public abstract String getRefreshToken();

    @efb
    public abstract hqc.EnumC6973a getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    public boolean isErrored() {
        return getRegistrationStatus() == hqc.EnumC6973a.REGISTER_ERROR;
    }

    public boolean isNotGenerated() {
        return getRegistrationStatus() == hqc.EnumC6973a.NOT_GENERATED || getRegistrationStatus() == hqc.EnumC6973a.ATTEMPT_MIGRATION;
    }

    public boolean isRegistered() {
        return getRegistrationStatus() == hqc.EnumC6973a.REGISTERED;
    }

    public boolean isUnregistered() {
        return getRegistrationStatus() == hqc.EnumC6973a.UNREGISTERED;
    }

    public boolean shouldAttemptMigration() {
        return getRegistrationStatus() == hqc.EnumC6973a.ATTEMPT_MIGRATION;
    }

    @efb
    public abstract AbstractC7565a toBuilder();

    @efb
    public iqc withAuthToken(@efb String str, long j, long j2) {
        return toBuilder().setAuthToken(str).setExpiresInSecs(j).setTokenCreationEpochInSecs(j2).build();
    }

    @efb
    public iqc withClearedAuthToken() {
        return toBuilder().setAuthToken(null).build();
    }

    @efb
    public iqc withFisError(@efb String str) {
        return toBuilder().setFisError(str).setRegistrationStatus(hqc.EnumC6973a.REGISTER_ERROR).build();
    }

    @efb
    public iqc withNoGeneratedFid() {
        return toBuilder().setRegistrationStatus(hqc.EnumC6973a.NOT_GENERATED).build();
    }

    @efb
    public iqc withRegisteredFid(@efb String str, @efb String str2, long j, @hib String str3, long j2) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(hqc.EnumC6973a.REGISTERED).setAuthToken(str3).setRefreshToken(str2).setExpiresInSecs(j2).setTokenCreationEpochInSecs(j).build();
    }

    @efb
    public iqc withUnregisteredFid(@efb String str) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(hqc.EnumC6973a.UNREGISTERED).build();
    }
}
