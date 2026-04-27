package p000;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class b6j implements OnFailureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskCompletionSource f12824a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f12825b;

    public b6j(c6j c6jVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f12824a = taskCompletionSource;
        this.f12825b = context;
        Objects.requireNonNull(c6jVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f12824a.setException(exc);
        c6j.m3825a(this.f12825b);
    }
}
