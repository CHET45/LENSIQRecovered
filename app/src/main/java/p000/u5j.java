package p000;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class u5j implements OnFailureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w5j f86857a;

    public u5j(w5j w5jVar) {
        Objects.requireNonNull(w5jVar);
        this.f86857a = w5jVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (exc instanceof yy5) {
            q5j.f73296h.m5799v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f86857a.f93389b.m20077b();
        }
    }
}
