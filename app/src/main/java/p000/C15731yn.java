package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.InterfaceC13109tn;
import p000.z24;

/* JADX INFO: renamed from: yn */
/* JADX INFO: loaded from: classes5.dex */
public class C15731yn {

    /* JADX INFO: renamed from: a */
    public final z24<InterfaceC13109tn> f102305a;

    /* JADX INFO: renamed from: b */
    public volatile InterfaceC16189zn f102306b;

    /* JADX INFO: renamed from: c */
    public volatile ad1 f102307c;

    /* JADX INFO: renamed from: d */
    @xc7("this")
    public final List<zc1> f102308d;

    public C15731yn(z24<InterfaceC13109tn> z24Var) {
        this(z24Var, new wd4(), new grh());
    }

    private void init() {
        this.f102305a.whenAvailable(new z24.InterfaceC15937a() { // from class: xn
            @Override // p000.z24.InterfaceC15937a
            public final void handle(eid eidVar) {
                this.f98551a.lambda$init$2(eidVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAnalyticsEventLogger$1(String str, Bundle bundle) {
        this.f102306b.logEvent(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getDeferredBreadcrumbSource$0(zc1 zc1Var) {
        synchronized (this) {
            try {
                if (this.f102307c instanceof wd4) {
                    this.f102308d.add(zc1Var);
                }
                this.f102307c.registerBreadcrumbHandler(zc1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(eid eidVar) {
        ej9.getLogger().m10061d("AnalyticsConnector now available.");
        InterfaceC13109tn interfaceC13109tn = (InterfaceC13109tn) eidVar.get();
        w33 w33Var = new w33(interfaceC13109tn);
        v23 v23Var = new v23();
        if (subscribeToAnalyticsEvents(interfaceC13109tn, v23Var) == null) {
            ej9.getLogger().m10069w("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        ej9.getLogger().m10061d("Registered Firebase Analytics listener.");
        yc1 yc1Var = new yc1();
        x61 x61Var = new x61(w33Var, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator<zc1> it = this.f102308d.iterator();
                while (it.hasNext()) {
                    yc1Var.registerBreadcrumbHandler(it.next());
                }
                v23Var.setBreadcrumbEventReceiver(yc1Var);
                v23Var.setCrashlyticsOriginEventReceiver(x61Var);
                this.f102307c = yc1Var;
                this.f102306b = x61Var;
            } finally {
            }
        }
    }

    @b34
    private static InterfaceC13109tn.a subscribeToAnalyticsEvents(@efb InterfaceC13109tn interfaceC13109tn, @efb v23 v23Var) {
        InterfaceC13109tn.a aVarRegisterAnalyticsConnectorListener = interfaceC13109tn.registerAnalyticsConnectorListener("clx", v23Var);
        if (aVarRegisterAnalyticsConnectorListener == null) {
            ej9.getLogger().m10061d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            aVarRegisterAnalyticsConnectorListener = interfaceC13109tn.registerAnalyticsConnectorListener("crash", v23Var);
            if (aVarRegisterAnalyticsConnectorListener != null) {
                ej9.getLogger().m10069w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return aVarRegisterAnalyticsConnectorListener;
    }

    public InterfaceC16189zn getAnalyticsEventLogger() {
        return new InterfaceC16189zn() { // from class: wn
            @Override // p000.InterfaceC16189zn
            public final void logEvent(String str, Bundle bundle) {
                this.f94794a.lambda$getAnalyticsEventLogger$1(str, bundle);
            }
        };
    }

    public ad1 getDeferredBreadcrumbSource() {
        return new ad1() { // from class: vn
            @Override // p000.ad1
            public final void registerBreadcrumbHandler(zc1 zc1Var) {
                this.f91762a.lambda$getDeferredBreadcrumbSource$0(zc1Var);
            }
        };
    }

    public C15731yn(z24<InterfaceC13109tn> z24Var, @efb ad1 ad1Var, @efb InterfaceC16189zn interfaceC16189zn) {
        this.f102305a = z24Var;
        this.f102307c = ad1Var;
        this.f102308d = new ArrayList();
        this.f102306b = interfaceC16189zn;
        init();
    }
}
