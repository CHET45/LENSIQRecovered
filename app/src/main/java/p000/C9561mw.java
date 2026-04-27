package p000;

import android.app.Application;

/* JADX INFO: renamed from: mw */
/* JADX INFO: loaded from: classes3.dex */
public class C9561mw extends cai {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Application f62463a;

    public C9561mw(@yfb Application application) {
        md8.checkNotNullParameter(application, "application");
        this.f62463a = application;
    }

    @yfb
    public <T extends Application> T getApplication() {
        T t = (T) this.f62463a;
        md8.checkNotNull(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
