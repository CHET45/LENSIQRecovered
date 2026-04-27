package p000;

import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.service.credentials.BeginGetCredentialResponse;

/* JADX INFO: loaded from: classes3.dex */
@igg({"ClassVerificationFailure"})
@xn8(name = "IntentHandlerConverters")
public final class n88 {
    @c5e(34)
    @gib
    public static final ry0 getBeginGetResponse(@yfb Intent intent) {
        BeginGetCredentialResponse beginGetCredentialResponseM13841a;
        md8.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE") && (beginGetCredentialResponseM13841a = j88.m13841a(intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", i88.m12853a()))) != null) {
            return c01.f15399a.convertToJetpackResponse(beginGetCredentialResponseM13841a);
        }
        return null;
    }

    @c5e(34)
    @gib
    public static final CreateCredentialResponse getCreateCredentialCredentialResponse(@yfb Intent intent) {
        md8.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE")) {
            return g83.m11431a(intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", m88.m17129a()));
        }
        return null;
    }

    @c5e(34)
    @gib
    public static final CreateCredentialException getCreateCredentialException(@yfb Intent intent) {
        md8.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION")) {
            return e83.m9801a(intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", k88.m14571a()));
        }
        return null;
    }

    @c5e(34)
    @gib
    public static final GetCredentialException getGetCredentialException(@yfb Intent intent) {
        md8.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION")) {
            return i83.m12852a(intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", l88.m15965a()));
        }
        return null;
    }

    @c5e(34)
    @gib
    public static final GetCredentialResponse getGetCredentialResponse(@yfb Intent intent) {
        md8.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE")) {
            return h83.m12274a(intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", g88.m11434a()));
        }
        return null;
    }
}
