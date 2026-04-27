package p000;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class o6j implements OnSuccessListener<AuthResult> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskCompletionSource f66573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f66574b;

    public o6j(c6j c6jVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f66573a = taskCompletionSource;
        this.f66574b = context;
        Objects.requireNonNull(c6jVar);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(AuthResult authResult) {
        this.f66573a.setResult(authResult);
        c6j.m3825a(this.f66574b);
    }
}
