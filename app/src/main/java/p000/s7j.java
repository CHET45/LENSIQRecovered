package p000;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class s7j implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ p7j f80927a;

    public s7j(p7j p7jVar) {
        Objects.requireNonNull(p7jVar);
        this.f80927a = p7jVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        if (z) {
            this.f80927a.f69948c = true;
            this.f80927a.zza();
        } else {
            this.f80927a.f69948c = false;
            if (this.f80927a.zzb()) {
                this.f80927a.f69947b.zzc();
            }
        }
    }
}
