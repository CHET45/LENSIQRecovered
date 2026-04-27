package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzlt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p000.InterfaceC13109tn;

/* JADX INFO: renamed from: un */
/* JADX INFO: loaded from: classes5.dex */
public class C13605un implements InterfaceC13109tn {

    /* JADX INFO: renamed from: c */
    public static volatile InterfaceC13109tn f88535c;

    /* JADX INFO: renamed from: a */
    @fdi
    public final AppMeasurementSdk f88536a;

    /* JADX INFO: renamed from: b */
    @fdi
    public final Map f88537b;

    /* JADX INFO: renamed from: un$a */
    public class a implements InterfaceC13109tn.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f88538a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C13605un f88539b;

        public a(C13605un c13605un, String str) {
            this.f88538a = str;
            Objects.requireNonNull(c13605un);
            this.f88539b = c13605un;
        }

        @Override // p000.InterfaceC13109tn.a
        @KeepForSdk
        public void registerEventNames(Set<String> set) {
            C13605un c13605un = this.f88539b;
            String str = this.f88538a;
            if (!c13605un.m23448b(str) || !str.equals(AppMeasurement.FIAM_ORIGIN) || set == null || set.isEmpty()) {
                return;
            }
            ((n4j) c13605un.f88537b.get(str)).zzb(set);
        }

        @Override // p000.InterfaceC13109tn.a
        public final void unregister() {
            C13605un c13605un = this.f88539b;
            String str = this.f88538a;
            if (c13605un.m23448b(str)) {
                Map map = c13605un.f88537b;
                InterfaceC13109tn.b bVarZza = ((n4j) map.get(str)).zza();
                if (bVarZza != null) {
                    bVarZza.onMessageTriggered(0, null);
                }
                map.remove(str);
            }
        }

        @Override // p000.InterfaceC13109tn.a
        @KeepForSdk
        public void unregisterEventNames() {
            C13605un c13605un = this.f88539b;
            String str = this.f88538a;
            if (c13605un.m23448b(str) && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                ((n4j) c13605un.f88537b.get(str)).zzc();
            }
        }
    }

    public C13605un(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f88536a = appMeasurementSdk;
        this.f88537b = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23447a(o55 o55Var) {
        boolean z = ((vf3) o55Var.getPayload()).f90854a;
        synchronized (C13605un.class) {
            ((C13605un) Preconditions.checkNotNull(f88535c)).f88536a.zza(z);
        }
    }

    @efb
    @KeepForSdk
    public static InterfaceC13109tn getInstance() {
        return getInstance(lw5.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final boolean m23448b(@efb String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.f88537b;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // p000.InterfaceC13109tn
    @KeepForSdk
    public void clearConditionalUserProperty(@efb @zpf(max = 24, min = 1) String str, @efb String str2, @efb Bundle bundle) {
        if (str2 == null || m7j.zzb(str2, bundle)) {
            this.f88536a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // p000.InterfaceC13109tn
    @efb
    @xqi
    @KeepForSdk
    public List<InterfaceC13109tn.c> getConditionalUserProperties(@efb String str, @efb @zpf(max = 23, min = 1) String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f88536a.getConditionalUserProperties(str, str2)) {
            int i = m7j.f60174g;
            Preconditions.checkNotNull(bundle);
            InterfaceC13109tn.c cVar = new InterfaceC13109tn.c();
            cVar.f85338a = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "origin", String.class, null));
            cVar.f85339b = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "name", String.class, null));
            cVar.f85340c = zzjh.zzb(bundle, "value", Object.class, null);
            cVar.f85341d = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            cVar.f85342e = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            cVar.f85343f = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            cVar.f85344g = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            cVar.f85345h = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            cVar.f85346i = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            cVar.f85347j = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            cVar.f85348k = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            cVar.f85349l = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            cVar.f85351n = ((Boolean) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f85350m = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            cVar.f85352o = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // p000.InterfaceC13109tn
    @xqi
    @KeepForSdk
    public int getMaxUserProperties(@efb @zpf(min = 1) String str) {
        return this.f88536a.getMaxUserProperties(str);
    }

    @Override // p000.InterfaceC13109tn
    @efb
    @xqi
    @KeepForSdk
    public Map<String, Object> getUserProperties(boolean z) {
        return this.f88536a.getUserProperties(null, null, z);
    }

    @Override // p000.InterfaceC13109tn
    @KeepForSdk
    public void logEvent(@efb String str, @efb String str2, @efb Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (m7j.zza(str) && m7j.zzb(str2, bundle) && m7j.zze(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f88536a.logEvent(str, str2, bundle);
        }
    }

    @Override // p000.InterfaceC13109tn
    @efb
    @xqi
    @KeepForSdk
    public InterfaceC13109tn.a registerAnalyticsConnectorListener(@efb String str, @efb InterfaceC13109tn.b bVar) {
        Preconditions.checkNotNull(bVar);
        if (m7j.zza(str) && !m23448b(str)) {
            AppMeasurementSdk appMeasurementSdk = this.f88536a;
            n4j b8jVar = AppMeasurement.FIAM_ORIGIN.equals(str) ? new b8j(appMeasurementSdk, bVar) : "clx".equals(str) ? new n8j(appMeasurementSdk, bVar) : null;
            if (b8jVar != null) {
                this.f88537b.put(str, b8jVar);
                return new a(this, str);
            }
        }
        return null;
    }

    @Override // p000.InterfaceC13109tn
    @KeepForSdk
    public void setConditionalUserProperty(@efb InterfaceC13109tn.c cVar) {
        String str;
        int i = m7j.f60174g;
        if (cVar == null || (str = cVar.f85338a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f85340c;
        if ((obj == null || zzlt.zzb(obj) != null) && m7j.zza(str) && m7j.zzd(str, cVar.f85339b)) {
            String str2 = cVar.f85348k;
            if (str2 == null || (m7j.zzb(str2, cVar.f85349l) && m7j.zze(str, cVar.f85348k, cVar.f85349l))) {
                String str3 = cVar.f85345h;
                if (str3 == null || (m7j.zzb(str3, cVar.f85346i) && m7j.zze(str, cVar.f85345h, cVar.f85346i))) {
                    String str4 = cVar.f85343f;
                    if (str4 == null || (m7j.zzb(str4, cVar.f85344g) && m7j.zze(str, cVar.f85343f, cVar.f85344g))) {
                        AppMeasurementSdk appMeasurementSdk = this.f88536a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f85338a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.f85339b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = cVar.f85340c;
                        if (obj2 != null) {
                            zzjh.zza(bundle, obj2);
                        }
                        String str7 = cVar.f85341d;
                        if (str7 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cVar.f85342e);
                        String str8 = cVar.f85343f;
                        if (str8 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
                        }
                        Bundle bundle2 = cVar.f85344g;
                        if (bundle2 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                        }
                        String str9 = cVar.f85345h;
                        if (str9 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
                        }
                        Bundle bundle3 = cVar.f85346i;
                        if (bundle3 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cVar.f85347j);
                        String str10 = cVar.f85348k;
                        if (str10 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
                        }
                        Bundle bundle4 = cVar.f85349l;
                        if (bundle4 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cVar.f85350m);
                        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, cVar.f85351n);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cVar.f85352o);
                        appMeasurementSdk.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC13109tn
    @KeepForSdk
    public void setUserProperty(@efb String str, @efb String str2, @efb Object obj) {
        if (m7j.zza(str) && m7j.zzd(str, str2)) {
            this.f88536a.setUserProperty(str, str2, obj);
        }
    }

    @efb
    @KeepForSdk
    public static InterfaceC13109tn getInstance(@efb lw5 lw5Var) {
        return (InterfaceC13109tn) lw5Var.get(InterfaceC13109tn.class);
    }

    @efb
    @KeepForSdk
    @j5e(allOf = {"android.permission.INTERNET", it3.f48185b, "android.permission.WAKE_LOCK"})
    public static InterfaceC13109tn getInstance(@efb lw5 lw5Var, @efb Context context, @efb wcg wcgVar) {
        Preconditions.checkNotNull(lw5Var);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(wcgVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f88535c == null) {
            synchronized (C13605un.class) {
                try {
                    if (f88535c == null) {
                        Bundle bundle = new Bundle(1);
                        if (lw5Var.isDefaultApp()) {
                            wcgVar.subscribe(vf3.class, new Executor() { // from class: g6j
                                @Override // java.util.concurrent.Executor
                                public final /* synthetic */ void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new z55() { // from class: m4j
                                @Override // p000.z55
                                public final /* synthetic */ void handle(o55 o55Var) {
                                    C13605un.m23447a(o55Var);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", lw5Var.isDataCollectionDefaultEnabled());
                        }
                        f88535c = new C13605un(zzfb.zza(context, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return f88535c;
    }
}
