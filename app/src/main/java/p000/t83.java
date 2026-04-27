package p000;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t83<T> {
    public abstract Task<String> getToken();

    public abstract void invalidateToken();

    public abstract void removeChangeListener();

    public abstract void setChangeListener(pa9<T> pa9Var);
}
