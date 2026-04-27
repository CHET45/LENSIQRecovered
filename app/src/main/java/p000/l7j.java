package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class l7j implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FirebaseAnalytics f56717a;

    public l7j(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.f56717a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @hib
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.f56717a.m6692a().zzH();
    }
}
