package p000;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes5.dex */
public interface h58 {

    /* JADX INFO: renamed from: h58$a */
    @AutoValue
    public static abstract class AbstractC6712a {
        /* JADX INFO: renamed from: a */
        public static AbstractC6712a m12165a(String str, my5 my5Var) {
            return new cl0(str, my5Var.getFid(), my5Var.getAuthToken());
        }

        public static AbstractC6712a createWithoutFid(String str) {
            return new cl0(str, null, null);
        }

        @efb
        public abstract String getCrashlyticsInstallId();

        @hib
        public abstract String getFirebaseAuthenticationToken();

        @hib
        public abstract String getFirebaseInstallationId();
    }

    AbstractC6712a getInstallIds();
}
