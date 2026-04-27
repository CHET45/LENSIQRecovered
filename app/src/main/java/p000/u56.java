package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.eyevue.glassapp.floatwindow.service.DaemonService;
import p000.kpc;

/* JADX INFO: loaded from: classes4.dex */
public class u56 {

    /* JADX INFO: renamed from: d */
    public static u56 f86829d;

    /* JADX INFO: renamed from: a */
    public t56 f86830a;

    /* JADX INFO: renamed from: b */
    public s56 f86831b = s56.getInstance();

    /* JADX INFO: renamed from: c */
    public v2c f86832c;

    /* JADX INFO: renamed from: u56$a */
    public class C13367a implements kpc.InterfaceC8483a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f86833a;

        public C13367a(final Activity val$activity) {
            this.f86833a = val$activity;
        }

        @Override // p000.kpc.InterfaceC8483a
        public void onDismiss() {
            if (u56.this.f86832c != null) {
                u56.this.f86832c.onResult(true, 2);
            }
        }

        @Override // p000.kpc.InterfaceC8483a
        public void onOk() {
            u56.this.requestFloatWindowPermission(this.f86833a);
        }
    }

    /* JADX INFO: renamed from: u56$b */
    public class C13368b implements c4c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f86835a;

        public C13368b(final Activity val$activity) {
            this.f86835a = val$activity;
        }

        @Override // p000.c4c
        public void permissionResult(boolean isOpen) {
            if (isOpen) {
                u56.this.createFloatingView(this.f86835a);
            } else if (u56.this.f86832c != null) {
                u56.this.f86832c.onResult(true, 1);
            }
        }
    }

    /* JADX INFO: renamed from: u56$c */
    public class C13369c implements c4c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f86837a;

        public C13369c(final Activity val$activity) {
            this.f86837a = val$activity;
        }

        @Override // p000.c4c
        public void permissionResult(boolean isOpen) {
            if (isOpen) {
                u56.this.createFloatingView(this.f86837a);
            } else if (u56.this.f86832c != null) {
                u56.this.f86832c.onResult(true, 2);
            }
        }
    }

    private u56(Context context) {
        this.f86830a = t56.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createFloatingView(Activity activity) {
        try {
            if (!jhb.checkPermission(activity)) {
                requestNotificationPermission(activity);
                return;
            }
            startDaemonService(activity);
            v2c v2cVar = this.f86832c;
            if (v2cVar != null) {
                v2cVar.onResult(true, 0);
            }
        } catch (Exception unused) {
            v2c v2cVar2 = this.f86832c;
            if (v2cVar2 != null) {
                v2cVar2.onResult(true, 3);
            }
        }
    }

    public static synchronized u56 getInstance(Context context) {
        try {
            if (f86829d == null) {
                f86829d = new u56(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f86829d;
    }

    private void goSystemOpenFloatWindow(Activity activity) {
        kpc kpcVar = new kpc(activity, new C13367a(activity));
        if (kpcVar.isShowing()) {
            return;
        }
        kpcVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestFloatWindowPermission(Activity activity) {
        tpc.requestPermission(activity, new C13369c(activity));
    }

    private void stopDaemonService(Activity activity) {
        activity.stopService(new Intent(activity, (Class<?>) DaemonService.class));
    }

    public void close() {
        this.f86830a.close();
        f86829d = null;
    }

    public void create(Activity activity) {
        createFloatingView(activity);
    }

    public void hideFloatingView() {
        this.f86831b.setVisible(Boolean.FALSE);
        this.f86830a.setFloatingViewVisibility();
    }

    public void removeFloatingView() {
        this.f86830a.removeFloatingView();
    }

    public void requestNotificationPermission(Activity activity) {
        jhb.requestPermission(activity, new C13368b(activity));
    }

    public void setDraggable(boolean isDrag) {
        this.f86831b.setDrag(Boolean.valueOf(isDrag));
        this.f86830a.setDraggable();
    }

    public void showFloatingView() {
        this.f86831b.setVisible(Boolean.TRUE);
        this.f86830a.setFloatingViewVisibility();
    }

    public void startDaemonService(Activity activity) {
        activity.startForegroundService(new Intent(activity, (Class<?>) DaemonService.class));
    }

    public void updateFloatingViewConfig() {
        this.f86830a.updateFloatingViewPosition();
        this.f86830a.setDraggable();
        this.f86830a.setFloatingViewVisibility();
    }

    public void updateFloatingViewPosition(int x, int y) {
        this.f86831b.setxPosition(x);
        this.f86831b.setyPosition(y);
        this.f86830a.updateFloatingViewPosition();
    }

    public void create(Activity activity, v2c callback) {
        this.f86832c = callback;
        createFloatingView(activity);
    }
}
