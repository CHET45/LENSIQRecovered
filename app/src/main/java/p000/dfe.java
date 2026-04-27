package p000;

import java.util.Map;
import p000.d84;

/* JADX INFO: loaded from: classes6.dex */
@l42
public class dfe {

    /* JADX INFO: renamed from: a */
    public final Map<String, d84> f29571a;

    /* JADX INFO: renamed from: b */
    public final hid<d84.InterfaceC4665a> f29572b;

    @b28
    public dfe(e84 e84Var, hid<d84.InterfaceC4665a> hidVar) {
        this.f29571a = e84Var;
        this.f29572b = hidVar;
    }

    public yee getBleDevice(String str) {
        d84 d84Var = this.f29571a.get(str);
        if (d84Var != null) {
            return d84Var.provideDevice();
        }
        synchronized (this.f29571a) {
            try {
                d84 d84Var2 = this.f29571a.get(str);
                if (d84Var2 != null) {
                    return d84Var2.provideDevice();
                }
                d84 d84VarBuild = this.f29572b.get().macAddress(str).build();
                yee yeeVarProvideDevice = d84VarBuild.provideDevice();
                this.f29571a.put(str, d84VarBuild);
                return yeeVarProvideDevice;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
