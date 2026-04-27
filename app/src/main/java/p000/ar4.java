package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.UUID;
import p000.nr4;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface ar4 {

    /* JADX INFO: renamed from: a */
    public static final int f11646a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f11647b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f11648c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f11649d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f11650e = 4;

    /* JADX INFO: renamed from: ar4$a */
    public static class C1571a extends IOException {

        /* JADX INFO: renamed from: a */
        public final int f11651a;

        public C1571a(Throwable th, int i) {
            super(th);
            this.f11651a = i;
        }
    }

    /* JADX INFO: renamed from: ar4$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1572b {
    }

    static void replaceSession(@hib ar4 ar4Var, @hib ar4 ar4Var2) {
        if (ar4Var == ar4Var2) {
            return;
        }
        if (ar4Var2 != null) {
            ar4Var2.acquire(null);
        }
        if (ar4Var != null) {
            ar4Var.release(null);
        }
    }

    void acquire(@hib nr4.C10020a c10020a);

    @hib
    c93 getCryptoConfig();

    @hib
    C1571a getError();

    @hib
    byte[] getOfflineLicenseKeySetId();

    UUID getSchemeUuid();

    int getState();

    default boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @hib
    Map<String, String> queryKeyStatus();

    void release(@hib nr4.C10020a c10020a);

    boolean requiresSecureDecoder(String str);
}
