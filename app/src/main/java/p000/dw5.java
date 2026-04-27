package p000;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@p7e({p7e.EnumC10826a.f69936c})
public class dw5 {

    /* JADX INFO: renamed from: a */
    public final Context f31159a;

    /* JADX INFO: renamed from: dw5$a */
    public class C4983a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC4985c f31160a;

        public C4983a(AbstractC4985c abstractC4985c) {
            this.f31160a = abstractC4985c;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f31160a.onAuthenticationError(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f31160a.onAuthenticationFailed();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f31160a.onAuthenticationHelp(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f31160a.onAuthenticationSucceeded(new C4986d(dw5.m9498a(C4984b.m9500b(authenticationResult))));
        }
    }

    /* JADX INFO: renamed from: dw5$b */
    @c5e(23)
    public static class C4984b {
        private C4984b() {
        }

        @ih4
        @j5e("android.permission.USE_FINGERPRINT")
        /* JADX INFO: renamed from: a */
        public static void m9499a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static FingerprintManager.CryptoObject m9500b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @ih4
        @j5e("android.permission.USE_FINGERPRINT")
        /* JADX INFO: renamed from: c */
        public static boolean m9501c(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @ih4
        @j5e("android.permission.USE_FINGERPRINT")
        /* JADX INFO: renamed from: d */
        public static boolean m9502d(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @ih4
        public static FingerprintManager getFingerprintManagerOrNull(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @ih4
        public static C4987e unwrapCryptoObject(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new C4987e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new C4987e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new C4987e(cryptoObject.getMac());
            }
            return null;
        }

        @ih4
        public static FingerprintManager.CryptoObject wrapCryptoObject(C4987e c4987e) {
            if (c4987e == null) {
                return null;
            }
            if (c4987e.getCipher() != null) {
                return new FingerprintManager.CryptoObject(c4987e.getCipher());
            }
            if (c4987e.getSignature() != null) {
                return new FingerprintManager.CryptoObject(c4987e.getSignature());
            }
            if (c4987e.getMac() != null) {
                return new FingerprintManager.CryptoObject(c4987e.getMac());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: dw5$c */
    public static abstract class AbstractC4985c {
        public void onAuthenticationError(int i, @efb CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i, @efb CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(@efb C4986d c4986d) {
        }
    }

    /* JADX INFO: renamed from: dw5$d */
    public static final class C4986d {

        /* JADX INFO: renamed from: a */
        public final C4987e f31161a;

        public C4986d(@efb C4987e c4987e) {
            this.f31161a = c4987e;
        }

        @efb
        public C4987e getCryptoObject() {
            return this.f31161a;
        }
    }

    private dw5(Context context) {
        this.f31159a = context;
    }

    @c5e(23)
    /* JADX INFO: renamed from: a */
    public static C4987e m9498a(FingerprintManager.CryptoObject cryptoObject) {
        return C4984b.unwrapCryptoObject(cryptoObject);
    }

    @efb
    public static dw5 from(@efb Context context) {
        return new dw5(context);
    }

    @c5e(23)
    @hib
    private static FingerprintManager getFingerprintManagerOrNull(@efb Context context) {
        return C4984b.getFingerprintManagerOrNull(context);
    }

    @c5e(23)
    private static FingerprintManager.AuthenticationCallback wrapCallback(AbstractC4985c abstractC4985c) {
        return new C4983a(abstractC4985c);
    }

    @c5e(23)
    private static FingerprintManager.CryptoObject wrapCryptoObject(C4987e c4987e) {
        return C4984b.wrapCryptoObject(c4987e);
    }

    @j5e("android.permission.USE_FINGERPRINT")
    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public void authenticate(@hib C4987e c4987e, int i, @hib pq1 pq1Var, @efb AbstractC4985c abstractC4985c, @hib Handler handler) {
        authenticate(c4987e, i, pq1Var != null ? (CancellationSignal) pq1Var.getCancellationSignalObject() : null, abstractC4985c, handler);
    }

    @j5e("android.permission.USE_FINGERPRINT")
    public boolean hasEnrolledFingerprints() {
        FingerprintManager fingerprintManagerOrNull = getFingerprintManagerOrNull(this.f31159a);
        return fingerprintManagerOrNull != null && C4984b.m9501c(fingerprintManagerOrNull);
    }

    @j5e("android.permission.USE_FINGERPRINT")
    public boolean isHardwareDetected() {
        FingerprintManager fingerprintManagerOrNull = getFingerprintManagerOrNull(this.f31159a);
        return fingerprintManagerOrNull != null && C4984b.m9502d(fingerprintManagerOrNull);
    }

    @j5e("android.permission.USE_FINGERPRINT")
    public void authenticate(@hib C4987e c4987e, int i, @hib CancellationSignal cancellationSignal, @efb AbstractC4985c abstractC4985c, @hib Handler handler) {
        FingerprintManager fingerprintManagerOrNull = getFingerprintManagerOrNull(this.f31159a);
        if (fingerprintManagerOrNull != null) {
            C4984b.m9499a(fingerprintManagerOrNull, wrapCryptoObject(c4987e), cancellationSignal, i, wrapCallback(abstractC4985c), handler);
        }
    }

    /* JADX INFO: renamed from: dw5$e */
    public static class C4987e {

        /* JADX INFO: renamed from: a */
        public final Signature f31162a;

        /* JADX INFO: renamed from: b */
        public final Cipher f31163b;

        /* JADX INFO: renamed from: c */
        public final Mac f31164c;

        public C4987e(@efb Signature signature) {
            this.f31162a = signature;
            this.f31163b = null;
            this.f31164c = null;
        }

        @hib
        public Cipher getCipher() {
            return this.f31163b;
        }

        @hib
        public Mac getMac() {
            return this.f31164c;
        }

        @hib
        public Signature getSignature() {
            return this.f31162a;
        }

        public C4987e(@efb Cipher cipher) {
            this.f31163b = cipher;
            this.f31162a = null;
            this.f31164c = null;
        }

        public C4987e(@efb Mac mac) {
            this.f31164c = mac;
            this.f31163b = null;
            this.f31162a = null;
        }
    }
}
