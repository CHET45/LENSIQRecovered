package p000;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
public interface gc8 {
    void addAppCheckTokenListener(@efb w10 w10Var);

    @efb
    Task<x10> getToken(boolean z);

    void removeAppCheckTokenListener(@efb w10 w10Var);
}
