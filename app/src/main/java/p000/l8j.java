package p000;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class l8j implements OnSuccessListener<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskCompletionSource f56856a;

    public l8j(j6j j6jVar, TaskCompletionSource taskCompletionSource) {
        this.f56856a = taskCompletionSource;
        Objects.requireNonNull(j6jVar);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(String str) {
        this.f56856a.setResult(new h9j().zzb(str).zza());
    }
}
