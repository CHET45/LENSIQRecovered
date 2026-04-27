package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public interface aa8 extends yb8 {
    @b34
    @KeepForSdk
    void addIdTokenListener(@efb lr7 lr7Var);

    @Override // p000.yb8
    @efb
    @KeepForSdk
    Task<f57> getAccessToken(boolean z);

    @Override // p000.yb8
    @hib
    String getUid();

    @KeepForSdk
    void removeIdTokenListener(@efb lr7 lr7Var);
}
