package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class bvi {

    /* JADX INFO: renamed from: o */
    public static final Map f14966o = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f14967a;

    /* JADX INFO: renamed from: b */
    public final c4j f14968b;

    /* JADX INFO: renamed from: c */
    public final String f14969c;

    /* JADX INFO: renamed from: g */
    public boolean f14973g;

    /* JADX INFO: renamed from: h */
    public final Intent f14974h;

    /* JADX INFO: renamed from: i */
    public final k4j f14975i;

    /* JADX INFO: renamed from: m */
    @hib
    public ServiceConnection f14979m;

    /* JADX INFO: renamed from: n */
    @hib
    public IInterface f14980n;

    /* JADX INFO: renamed from: d */
    public final List f14970d = new ArrayList();

    /* JADX INFO: renamed from: e */
    @xc7("attachedRemoteTasksLock")
    public final Set f14971e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f14972f = new Object();

    /* JADX INFO: renamed from: k */
    public final IBinder.DeathRecipient f14977k = new IBinder.DeathRecipient() { // from class: f4j
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            bvi.m3445k(this.f35333a);
        }
    };

    /* JADX INFO: renamed from: l */
    @xc7("attachedRemoteTasksLock")
    public final AtomicInteger f14978l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j */
    public final WeakReference f14976j = new WeakReference(null);

    public bvi(Context context, c4j c4jVar, String str, Intent intent, k4j k4jVar, @hib j4j j4jVar) {
        this.f14967a = context;
        this.f14968b = c4jVar;
        this.f14969c = str;
        this.f14974h = intent;
        this.f14975i = k4jVar;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m3445k(bvi bviVar) {
        bviVar.f14968b.m3767d("reportBinderDeath", new Object[0]);
        j4j j4jVar = (j4j) bviVar.f14976j.get();
        if (j4jVar != null) {
            bviVar.f14968b.m3767d("calling onBinderDied", new Object[0]);
            j4jVar.m13730a();
        } else {
            bviVar.f14968b.m3767d("%s : Binder has died.", bviVar.f14969c);
            Iterator it = bviVar.f14970d.iterator();
            while (it.hasNext()) {
                ((e4j) it.next()).mo6635a(bviVar.m3454w());
            }
            bviVar.f14970d.clear();
        }
        synchronized (bviVar.f14972f) {
            bviVar.m3455x();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m3449o(final bvi bviVar, final TaskCompletionSource taskCompletionSource) {
        bviVar.f14971e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: g4j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f38783a.m3459u(taskCompletionSource, task);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m3451q(bvi bviVar, e4j e4jVar) {
        if (bviVar.f14980n != null || bviVar.f14973g) {
            if (!bviVar.f14973g) {
                e4jVar.run();
                return;
            } else {
                bviVar.f14968b.m3767d("Waiting to bind to the service.", new Object[0]);
                bviVar.f14970d.add(e4jVar);
                return;
            }
        }
        bviVar.f14968b.m3767d("Initiate binding to the service.", new Object[0]);
        bviVar.f14970d.add(e4jVar);
        avi aviVar = new avi(bviVar, null);
        bviVar.f14979m = aviVar;
        bviVar.f14973g = true;
        if (bviVar.f14967a.bindService(bviVar.f14974h, aviVar, 1)) {
            return;
        }
        bviVar.f14968b.m3767d("Failed to bind to the service.", new Object[0]);
        bviVar.f14973g = false;
        Iterator it = bviVar.f14970d.iterator();
        while (it.hasNext()) {
            ((e4j) it.next()).mo6635a(new cvi());
        }
        bviVar.f14970d.clear();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m3452r(bvi bviVar) {
        bviVar.f14968b.m3767d("linkToDeath", new Object[0]);
        try {
            bviVar.f14980n.asBinder().linkToDeath(bviVar.f14977k, 0);
        } catch (RemoteException e) {
            bviVar.f14968b.m3766c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m3453s(bvi bviVar) {
        bviVar.f14968b.m3767d("unlinkToDeath", new Object[0]);
        bviVar.f14980n.asBinder().unlinkToDeath(bviVar.f14977k, 0);
    }

    /* JADX INFO: renamed from: w */
    private final RemoteException m3454w() {
        return new RemoteException(String.valueOf(this.f14969c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @xc7("attachedRemoteTasksLock")
    /* JADX INFO: renamed from: x */
    public final void m3455x() {
        Iterator it = this.f14971e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m3454w());
        }
        this.f14971e.clear();
    }

    /* JADX INFO: renamed from: c */
    public final Handler m3456c() {
        Handler handler;
        Map map = f14966o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f14969c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f14969c, 10);
                    handlerThread.start();
                    map.put(this.f14969c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f14969c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    @hib
    /* JADX INFO: renamed from: e */
    public final IInterface m3457e() {
        return this.f14980n;
    }

    /* JADX INFO: renamed from: t */
    public final void m3458t(e4j e4jVar, @hib TaskCompletionSource taskCompletionSource) {
        m3456c().post(new h4j(this, e4jVar.m9678c(), taskCompletionSource, e4jVar));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m3459u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f14972f) {
            this.f14971e.remove(taskCompletionSource);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3460v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f14972f) {
            this.f14971e.remove(taskCompletionSource);
        }
        m3456c().post(new i4j(this));
    }
}
