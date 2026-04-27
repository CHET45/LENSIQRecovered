package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class j8j implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n8j f49941a;

    public j8j(n8j n8jVar) {
        Objects.requireNonNull(n8jVar);
        this.f49941a = n8jVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str == null || !m7j.zzc(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle(v23.f89724e, bundle);
        this.f49941a.m17819a().onMessageTriggered(3, bundle2);
    }
}
