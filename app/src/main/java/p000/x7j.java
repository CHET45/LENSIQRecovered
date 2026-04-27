package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class x7j implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b8j f97124a;

    public x7j(b8j b8jVar) {
        Objects.requireNonNull(b8jVar);
        this.f97124a = b8jVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        b8j b8jVar = this.f97124a;
        if (b8jVar.f13001a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i = m7j.f60174g;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            b8jVar.m3000a().onMessageTriggered(2, bundle2);
        }
    }
}
