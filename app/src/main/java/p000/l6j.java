package p000;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class l6j implements OnFailureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskCompletionSource f56354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f56355b;

    public l6j(c6j c6jVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f56354a = taskCompletionSource;
        this.f56355b = context;
        Objects.requireNonNull(c6jVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f56354a.setException(exc);
        c6j.m3825a(this.f56355b);
    }
}
