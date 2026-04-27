package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.bq7;
import p000.cq7;
import p000.ke8;
import p000.o2b;

/* JADX INFO: loaded from: classes3.dex */
public final class o2b {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f66299a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ke8 f66300b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Executor f66301c;

    /* JADX INFO: renamed from: d */
    public final Context f66302d;

    /* JADX INFO: renamed from: e */
    public int f66303e;

    /* JADX INFO: renamed from: f */
    public ke8.AbstractC8318c f66304f;

    /* JADX INFO: renamed from: g */
    @gib
    public cq7 f66305g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final bq7 f66306h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final AtomicBoolean f66307i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final ServiceConnection f66308j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final Runnable f66309k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final Runnable f66310l;

    /* JADX INFO: renamed from: o2b$a */
    public static final class C10151a extends ke8.AbstractC8318c {
        public C10151a(String[] strArr) {
            super(strArr);
        }

        @Override // p000.ke8.AbstractC8318c
        public boolean isRemote$room_runtime_release() {
            return true;
        }

        @Override // p000.ke8.AbstractC8318c
        public void onInvalidated(@yfb Set<String> set) {
            md8.checkNotNullParameter(set, "tables");
            if (o2b.this.getStopped().get()) {
                return;
            }
            try {
                cq7 service = o2b.this.getService();
                if (service != null) {
                    int clientId = o2b.this.getClientId();
                    Object[] array = set.toArray(new String[0]);
                    md8.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    service.broadcastInvalidation(clientId, (String[]) array);
                }
            } catch (RemoteException e) {
                Log.w(tae.f84090b, "Cannot broadcast invalidation", e);
            }
        }
    }

    /* JADX INFO: renamed from: o2b$b */
    public static final class BinderC10152b extends bq7.AbstractBinderC2000b {
        public BinderC10152b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onInvalidation$lambda$0(o2b o2bVar, String[] strArr) {
            md8.checkNotNullParameter(o2bVar, "this$0");
            md8.checkNotNullParameter(strArr, "$tables");
            o2bVar.getInvalidationTracker().notifyObserversByTableNames((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Override // p000.bq7
        public void onInvalidation(@yfb final String[] strArr) {
            md8.checkNotNullParameter(strArr, "tables");
            Executor executor = o2b.this.getExecutor();
            final o2b o2bVar = o2b.this;
            executor.execute(new Runnable() { // from class: p2b
                @Override // java.lang.Runnable
                public final void run() {
                    o2b.BinderC10152b.onInvalidation$lambda$0(o2bVar, strArr);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o2b$c */
    public static final class ServiceConnectionC10153c implements ServiceConnection {
        public ServiceConnectionC10153c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@yfb ComponentName componentName, @yfb IBinder iBinder) {
            md8.checkNotNullParameter(componentName, "name");
            md8.checkNotNullParameter(iBinder, "service");
            o2b.this.setService(cq7.AbstractBinderC4461b.asInterface(iBinder));
            o2b.this.getExecutor().execute(o2b.this.getSetUpRunnable());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@yfb ComponentName componentName) {
            md8.checkNotNullParameter(componentName, "name");
            o2b.this.getExecutor().execute(o2b.this.getRemoveObserverRunnable());
            o2b.this.setService(null);
        }
    }

    public o2b(@yfb Context context, @yfb String str, @yfb Intent intent, @yfb ke8 ke8Var, @yfb Executor executor) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(intent, "serviceIntent");
        md8.checkNotNullParameter(ke8Var, "invalidationTracker");
        md8.checkNotNullParameter(executor, "executor");
        this.f66299a = str;
        this.f66300b = ke8Var;
        this.f66301c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f66302d = applicationContext;
        this.f66306h = new BinderC10152b();
        this.f66307i = new AtomicBoolean(false);
        ServiceConnectionC10153c serviceConnectionC10153c = new ServiceConnectionC10153c();
        this.f66308j = serviceConnectionC10153c;
        this.f66309k = new Runnable() { // from class: m2b
            @Override // java.lang.Runnable
            public final void run() {
                o2b.setUpRunnable$lambda$1(this.f59744a);
            }
        };
        this.f66310l = new Runnable() { // from class: n2b
            @Override // java.lang.Runnable
            public final void run() {
                o2b.removeObserverRunnable$lambda$2(this.f63061a);
            }
        };
        Object[] array = ke8Var.getTableIdLookup$room_runtime_release().keySet().toArray(new String[0]);
        md8.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        setObserver(new C10151a((String[]) array));
        applicationContext.bindService(intent, serviceConnectionC10153c, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeObserverRunnable$lambda$2(o2b o2bVar) {
        md8.checkNotNullParameter(o2bVar, "this$0");
        o2bVar.f66300b.removeObserver(o2bVar.getObserver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpRunnable$lambda$1(o2b o2bVar) {
        md8.checkNotNullParameter(o2bVar, "this$0");
        try {
            cq7 cq7Var = o2bVar.f66305g;
            if (cq7Var != null) {
                o2bVar.f66303e = cq7Var.registerCallback(o2bVar.f66306h, o2bVar.f66299a);
                o2bVar.f66300b.addObserver(o2bVar.getObserver());
            }
        } catch (RemoteException e) {
            Log.w(tae.f84090b, "Cannot register multi-instance invalidation callback", e);
        }
    }

    @yfb
    public final bq7 getCallback() {
        return this.f66306h;
    }

    public final int getClientId() {
        return this.f66303e;
    }

    @yfb
    public final Executor getExecutor() {
        return this.f66301c;
    }

    @yfb
    public final ke8 getInvalidationTracker() {
        return this.f66300b;
    }

    @yfb
    public final String getName() {
        return this.f66299a;
    }

    @yfb
    public final ke8.AbstractC8318c getObserver() {
        ke8.AbstractC8318c abstractC8318c = this.f66304f;
        if (abstractC8318c != null) {
            return abstractC8318c;
        }
        md8.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    @yfb
    public final Runnable getRemoveObserverRunnable() {
        return this.f66310l;
    }

    @gib
    public final cq7 getService() {
        return this.f66305g;
    }

    @yfb
    public final ServiceConnection getServiceConnection() {
        return this.f66308j;
    }

    @yfb
    public final Runnable getSetUpRunnable() {
        return this.f66309k;
    }

    @yfb
    public final AtomicBoolean getStopped() {
        return this.f66307i;
    }

    public final void setClientId(int i) {
        this.f66303e = i;
    }

    public final void setObserver(@yfb ke8.AbstractC8318c abstractC8318c) {
        md8.checkNotNullParameter(abstractC8318c, "<set-?>");
        this.f66304f = abstractC8318c;
    }

    public final void setService(@gib cq7 cq7Var) {
        this.f66305g = cq7Var;
    }

    public final void stop() {
        if (this.f66307i.compareAndSet(false, true)) {
            this.f66300b.removeObserver(getObserver());
            try {
                cq7 cq7Var = this.f66305g;
                if (cq7Var != null) {
                    cq7Var.unregisterCallback(this.f66306h, this.f66303e);
                }
            } catch (RemoteException e) {
                Log.w(tae.f84090b, "Cannot unregister multi-instance invalidation callback", e);
            }
            this.f66302d.unbindService(this.f66308j);
        }
    }
}
