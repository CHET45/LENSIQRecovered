package p000;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nCallingAppInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallingAppInfo.kt\nandroidx/credentials/provider/CallingAppInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class so1 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C12707a f82410d = new C12707a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String f82411e = "CallingAppInfo";

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f82412a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final SigningInfo f82413b;

    /* JADX INFO: renamed from: c */
    @gib
    public final String f82414c;

    /* JADX INFO: renamed from: so1$a */
    public static final class C12707a {
        public /* synthetic */ C12707a(jt3 jt3Var) {
            this();
        }

        private C12707a() {
        }
    }

    /* JADX INFO: renamed from: so1$b */
    @c5e(28)
    public static final class C12708b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final SigningInfo f82415a;

        /* JADX INFO: renamed from: so1$b$a */
        public static final class a extends tt8 implements qy6<Byte, CharSequence> {

            /* JADX INFO: renamed from: a */
            public static final a f82416a = new a();

            public a() {
                super(1);
            }

            @yfb
            public final CharSequence invoke(byte b) {
                String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                md8.checkNotNullExpressionValue(str, "format(this, *args)");
                return str;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }
        }

        public C12708b(@yfb SigningInfo signingInfo) {
            md8.checkNotNullParameter(signingInfo, "signingInfo");
            this.f82415a = signingInfo;
        }

        private final Set<String> convertToFingerprints(Signature[] signatureArr) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Signature signature : signatureArr) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(signature.toByteArray());
                md8.checkNotNullExpressionValue(bArrDigest, "digest");
                linkedHashSet.add(e80.joinToString$default(bArrDigest, (CharSequence) g1i.f38277c, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (qy6) a.f82416a, 30, (Object) null));
            }
            return linkedHashSet;
        }

        private final Set<String> getSignatureFingerprints() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (this.f82415a.hasMultipleSigners() && this.f82415a.getApkContentsSigners() != null) {
                Signature[] apkContentsSigners = this.f82415a.getApkContentsSigners();
                md8.checkNotNullExpressionValue(apkContentsSigners, "signingInfo.apkContentsSigners");
                linkedHashSet.addAll(convertToFingerprints(apkContentsSigners));
            } else if (this.f82415a.getSigningCertificateHistory() != null) {
                Signature signature = this.f82415a.getSigningCertificateHistory()[0];
                md8.checkNotNullExpressionValue(signature, "signingInfo.signingCertificateHistory[0]");
                linkedHashSet.addAll(convertToFingerprints(new Signature[]{signature}));
            }
            return linkedHashSet;
        }

        public final boolean verifySignatureFingerprints(@yfb Set<String> set) {
            md8.checkNotNullParameter(set, "candidateSigFingerprints");
            Set<String> signatureFingerprints = getSignatureFingerprints();
            return this.f82415a.hasMultipleSigners() ? set.containsAll(signatureFingerprints) : !v82.intersect(set, signatureFingerprints).isEmpty();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public so1(@yfb String str, @yfb SigningInfo signingInfo) {
        this(str, signingInfo, null, 4, null);
        md8.checkNotNullParameter(str, "packageName");
        md8.checkNotNullParameter(signingInfo, "signingInfo");
    }

    private final boolean isAppPrivileged(List<ocd> list) {
        for (ocd ocdVar : list) {
            if (md8.areEqual(ocdVar.getPackageName(), this.f82412a)) {
                return isAppPrivileged(ocdVar.getFingerprints());
            }
        }
        return false;
    }

    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    public final String getOrigin() {
        return this.f82414c;
    }

    @yfb
    public final String getPackageName() {
        return this.f82412a;
    }

    @yfb
    public final SigningInfo getSigningInfo() {
        return this.f82413b;
    }

    public final boolean isOriginPopulated() {
        return this.f82414c != null;
    }

    @yn8
    public so1(@yfb String str, @yfb SigningInfo signingInfo, @gib String str2) {
        md8.checkNotNullParameter(str, "packageName");
        md8.checkNotNullParameter(signingInfo, "signingInfo");
        this.f82412a = str;
        this.f82413b = signingInfo;
        this.f82414c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("packageName must not be empty");
        }
    }

    @gib
    public final String getOrigin(@yfb String str) {
        md8.checkNotNullParameter(str, "privilegedAllowlist");
        if (!q4e.f73193a.isValidJSON(str)) {
            throw new IllegalArgumentException("privilegedAllowlist must not be empty, and must be a valid JSON");
        }
        String str2 = this.f82414c;
        if (str2 == null) {
            return str2;
        }
        try {
            if (isAppPrivileged(ocd.f67204c.extractPrivilegedApps$credentials_release(new JSONObject(str)))) {
                return this.f82414c;
            }
            throw new IllegalStateException("Origin is not being returned as the calling app did notmatch the privileged allowlist");
        } catch (JSONException unused) {
            throw new IllegalArgumentException("privilegedAllowlist must be formatted properly");
        }
    }

    private final boolean isAppPrivileged(Set<String> set) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C12708b(this.f82413b).verifySignatureFingerprints(set);
        }
        return false;
    }

    public /* synthetic */ so1(String str, SigningInfo signingInfo, String str2, int i, jt3 jt3Var) {
        this(str, signingInfo, (i & 4) != 0 ? null : str2);
    }
}
