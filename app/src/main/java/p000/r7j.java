package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: loaded from: classes5.dex */
public final class r7j implements k5h {

    /* JADX INFO: renamed from: a */
    public final String f77364a;

    /* JADX INFO: renamed from: b */
    public final String f77365b;

    /* JADX INFO: renamed from: c */
    public final int f77366c;

    /* JADX INFO: renamed from: d */
    public final int f77367d;

    /* JADX INFO: renamed from: e */
    public final long f77368e;

    /* JADX INFO: renamed from: f */
    public String f77369f;

    /* JADX INFO: renamed from: g */
    public FirebaseAuth f77370g;

    public r7j(String str, String str2, int i, int i2, long j, String str3, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotEmpty(str3, "sessionInfo cannot be empty.");
        Preconditions.checkNotNull(firebaseAuth, "firebaseAuth cannot be null.");
        this.f77364a = Preconditions.checkNotEmpty(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f77365b = Preconditions.checkNotEmpty(str2, "hashAlgorithm cannot be empty.");
        this.f77366c = i;
        this.f77367d = i2;
        this.f77368e = j;
        this.f77369f = str3;
        this.f77370g = firebaseAuth;
    }

    private final void zza(String str) {
        this.f77370g.getApp().getApplicationContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    @Override // p000.k5h
    public final String generateQrCodeUrl() {
        return generateQrCodeUrl(Preconditions.checkNotEmpty(((FirebaseUser) Preconditions.checkNotNull(this.f77370g.getCurrentUser(), "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.")).getEmail(), "Email cannot be empty, since verified email is required to use MFA."), this.f77370g.getApp().getName());
    }

    @Override // p000.k5h
    public final int getCodeIntervalSeconds() {
        return this.f77367d;
    }

    @Override // p000.k5h
    public final int getCodeLength() {
        return this.f77366c;
    }

    @Override // p000.k5h
    public final long getEnrollmentCompletionDeadline() {
        return this.f77368e;
    }

    @Override // p000.k5h
    public final String getHashAlgorithm() {
        return this.f77365b;
    }

    @Override // p000.k5h
    public final String getSessionInfo() {
        return this.f77369f;
    }

    @Override // p000.k5h
    public final String getSharedSecretKey() {
        return this.f77364a;
    }

    @Override // p000.k5h
    public final void openInOtpApp(String str) {
        Preconditions.checkNotEmpty(str, "qrCodeUrl cannot be empty.");
        try {
            zza(str);
        } catch (ActivityNotFoundException unused) {
            zza("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }

    @Override // p000.k5h
    public final void openInOtpApp(String str, String str2, Activity activity) {
        Preconditions.checkNotEmpty(str, "QrCodeUrl cannot be empty.");
        Preconditions.checkNotEmpty(str2, "FallbackUrl cannot be empty.");
        Preconditions.checkNotNull(activity, "Activity cannot be null.");
        try {
            zza(str, activity);
        } catch (ActivityNotFoundException unused) {
            zza(str2, activity);
        }
    }

    private static void zza(String str, Activity activity) {
        Preconditions.checkNotNull(activity, "Activity cannot be null.");
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    @Override // p000.k5h
    public final String generateQrCodeUrl(String str, String str2) {
        Preconditions.checkNotEmpty(str, "accountName cannot be empty.");
        Preconditions.checkNotEmpty(str2, "issuer cannot be empty.");
        return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", str2, str, this.f77364a, str2, this.f77365b, Integer.valueOf(this.f77366c));
    }
}
