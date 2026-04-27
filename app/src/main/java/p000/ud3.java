package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public abstract class ud3 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    @hib
    public Context f87608a;

    /* JADX INFO: renamed from: ud3$a */
    public class C13505a extends rd3 {
        public C13505a(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
            super(iCustomTabsService, componentName, context);
        }
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    /* JADX INFO: renamed from: a */
    public Context m23248a() {
        return this.f87608a;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    /* JADX INFO: renamed from: b */
    public void m23249b(@efb Context context) {
        this.f87608a = context;
    }

    public abstract void onCustomTabsServiceConnected(@efb ComponentName componentName, @efb rd3 rd3Var);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@efb ComponentName componentName, @efb IBinder iBinder) {
        if (this.f87608a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new C13505a(ICustomTabsService.Stub.asInterface(iBinder), componentName, this.f87608a));
    }
}
