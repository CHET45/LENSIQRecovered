package p000;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class r8j implements OnFailureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskCompletionSource f77409a;

    public r8j(j6j j6jVar, TaskCompletionSource taskCompletionSource) {
        this.f77409a = taskCompletionSource;
        Objects.requireNonNull(j6jVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@efb Exception exc) {
        Log.e(j6j.f49656b, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        if ((exc instanceof xw5) && ((xw5) exc).getErrorCode().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f77409a.setException(exc);
        } else {
            this.f77409a.setResult(new h9j().zza());
        }
    }
}
