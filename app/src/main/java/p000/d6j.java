package p000;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class d6j implements OnFailureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskCompletionSource f28596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f28597b;

    public d6j(c6j c6jVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f28596a = taskCompletionSource;
        this.f28597b = context;
        Objects.requireNonNull(c6jVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f28596a.setException(exc);
        c6j.m3825a(this.f28597b);
    }
}
