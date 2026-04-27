package p000;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;
import p000.InterfaceC13109tn;

/* JADX INFO: loaded from: classes5.dex */
public final class n8j implements n4j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13109tn.b f63639a;

    /* JADX INFO: renamed from: b */
    public final AppMeasurementSdk f63640b;

    /* JADX INFO: renamed from: c */
    public final j8j f63641c;

    public n8j(AppMeasurementSdk appMeasurementSdk, InterfaceC13109tn.b bVar) {
        this.f63639a = bVar;
        this.f63640b = appMeasurementSdk;
        j8j j8jVar = new j8j(this);
        this.f63641c = j8jVar;
        appMeasurementSdk.registerOnMeasurementEventListener(j8jVar);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13109tn.b m17819a() {
        return this.f63639a;
    }

    @Override // p000.n4j
    public final InterfaceC13109tn.b zza() {
        return this.f63639a;
    }

    @Override // p000.n4j
    public final void zzb(Set set) {
    }

    @Override // p000.n4j
    public final void zzc() {
    }
}
