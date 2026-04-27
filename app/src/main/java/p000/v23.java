package p000;

import android.os.Bundle;
import java.util.Locale;
import p000.InterfaceC13109tn;

/* JADX INFO: loaded from: classes5.dex */
public class v23 implements InterfaceC13109tn.b {

    /* JADX INFO: renamed from: c */
    public static final String f89722c = "_o";

    /* JADX INFO: renamed from: d */
    public static final String f89723d = "name";

    /* JADX INFO: renamed from: e */
    public static final String f89724e = "params";

    /* JADX INFO: renamed from: f */
    public static final String f89725f = "clx";

    /* JADX INFO: renamed from: a */
    public InterfaceC1524ao f89726a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1524ao f89727b;

    private static void notifyEventReceiver(@hib InterfaceC1524ao interfaceC1524ao, @efb String str, @efb Bundle bundle) {
        if (interfaceC1524ao == null) {
            return;
        }
        interfaceC1524ao.onEvent(str, bundle);
    }

    private void notifyEventReceivers(@efb String str, @efb Bundle bundle) {
        notifyEventReceiver("clx".equals(bundle.getString(f89722c)) ? this.f89726a : this.f89727b, str, bundle);
    }

    @Override // p000.InterfaceC13109tn.b
    public void onMessageTriggered(int i, @hib Bundle bundle) {
        String string;
        ej9.getLogger().m10067v(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle(f89724e);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        notifyEventReceivers(string, bundle2);
    }

    public void setBreadcrumbEventReceiver(@hib InterfaceC1524ao interfaceC1524ao) {
        this.f89727b = interfaceC1524ao;
    }

    public void setCrashlyticsOriginEventReceiver(@hib InterfaceC1524ao interfaceC1524ao) {
        this.f89726a = interfaceC1524ao;
    }
}
