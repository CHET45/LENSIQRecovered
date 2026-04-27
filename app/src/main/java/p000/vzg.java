package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class vzg {

    /* JADX INFO: renamed from: a */
    public static InterfaceC14334c f93030a;

    /* JADX INFO: renamed from: vzg$a */
    @c5e(24)
    public static class C14332a {
        private C14332a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m24297a(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    /* JADX INFO: renamed from: vzg$b */
    @c5e(34)
    public static class C14333b {
        private C14333b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m24298a(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    /* JADX INFO: renamed from: vzg$c */
    public interface InterfaceC14334c {
        void startActivityAndCollapse(PendingIntent pendingIntent);

        void startActivityAndCollapse(Intent intent);
    }

    private vzg() {
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public static void clearTileServiceWrapper() {
        f93030a = null;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public static void setTileServiceWrapper(@efb InterfaceC14334c interfaceC14334c) {
        f93030a = interfaceC14334c;
    }

    public static void startActivityAndCollapse(@efb TileService tileService, @efb imc imcVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            InterfaceC14334c interfaceC14334c = f93030a;
            if (interfaceC14334c != null) {
                interfaceC14334c.startActivityAndCollapse(imcVar.getPendingIntent());
                return;
            } else {
                C14333b.m24298a(tileService, imcVar.getPendingIntent());
                return;
            }
        }
        InterfaceC14334c interfaceC14334c2 = f93030a;
        if (interfaceC14334c2 != null) {
            interfaceC14334c2.startActivityAndCollapse(imcVar.getIntent());
        } else {
            C14332a.m24297a(tileService, imcVar.getIntent());
        }
    }
}
