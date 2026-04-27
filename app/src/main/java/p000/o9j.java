package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class o9j extends y6j<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f66953a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionCodeSettings f66954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FirebaseAuth f66955c;

    public o9j(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings) {
        this.f66953a = str;
        this.f66954b = actionCodeSettings;
        Objects.requireNonNull(firebaseAuth);
        this.f66955c = firebaseAuth;
    }

    @Override // p000.y6j
    public final Task<Void> zza(@hib String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Password reset request " + this.f66953a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + this.f66953a);
        }
        FirebaseAuth firebaseAuth = this.f66955c;
        return firebaseAuth.f23272e.zza(firebaseAuth.f23268a, this.f66953a, this.f66954b, this.f66955c.f23278k, str);
    }
}
