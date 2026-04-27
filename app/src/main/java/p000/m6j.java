package p000;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class m6j implements OnSuccessListener<AuthResult> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskCompletionSource f60038a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f60039b;

    public m6j(c6j c6jVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f60038a = taskCompletionSource;
        this.f60039b = context;
        Objects.requireNonNull(c6jVar);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(AuthResult authResult) {
        this.f60038a.setResult(authResult);
        c6j.m3825a(this.f60039b);
    }
}
