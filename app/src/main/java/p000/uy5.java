package p000;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
public interface uy5 {
    @efb
    Task<Void> delete();

    @efb
    Task<String> getId();

    @efb
    Task<k58> getToken(boolean z);

    @b34
    uq5 registerFidListener(@efb tq5 tq5Var);
}
