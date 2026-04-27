package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class l9j extends y6j<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f56927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionCodeSettings f56928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FirebaseAuth f56929c;

    public l9j(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings) {
        this.f56927a = str;
        this.f56928b = actionCodeSettings;
        Objects.requireNonNull(firebaseAuth);
        this.f56929c = firebaseAuth;
    }

    @Override // p000.y6j
    public final Task<Void> zza(@hib String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link sign in for " + this.f56927a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for " + this.f56927a);
        }
        FirebaseAuth firebaseAuth = this.f56929c;
        return firebaseAuth.f23272e.zzb(firebaseAuth.f23268a, this.f56927a, this.f56928b, this.f56929c.f23278k, str);
    }
}
