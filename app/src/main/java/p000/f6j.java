package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class f6j implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseAnalytics f35547a;

    public f6j(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.f35547a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @hib
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.f35547a.m6692a().zzG();
    }
}
