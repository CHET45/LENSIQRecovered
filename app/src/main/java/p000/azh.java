package p000;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public interface azh {
    @hib
    String getDisplayName();

    @hib
    String getEmail();

    @hib
    String getPhoneNumber();

    @hib
    Uri getPhotoUrl();

    @efb
    String getProviderId();

    @efb
    String getUid();

    boolean isEmailVerified();
}
