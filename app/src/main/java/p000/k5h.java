package p000;

import android.app.Activity;

/* JADX INFO: loaded from: classes5.dex */
public interface k5h {
    @efb
    String generateQrCodeUrl();

    @efb
    String generateQrCodeUrl(@efb String str, @efb String str2);

    int getCodeIntervalSeconds();

    int getCodeLength();

    long getEnrollmentCompletionDeadline();

    @efb
    String getHashAlgorithm();

    @efb
    String getSessionInfo();

    @efb
    String getSharedSecretKey();

    void openInOtpApp(@efb String str);

    void openInOtpApp(@efb String str, @efb String str2, @efb Activity activity);
}
