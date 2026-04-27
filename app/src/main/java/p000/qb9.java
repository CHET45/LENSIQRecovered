package p000;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.AbstractC1158q;
import androidx.lifecycle.C1133e;
import com.arthenica.ffmpegkit.MediaInformation;
import com.jeremyliao.liveeventbus.ipc.receiver.LebIpcReceiver;
import com.jeremyliao.liveeventbus.utils.AppUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes6.dex */
public final class qb9 {

    /* JADX INFO: renamed from: a */
    public final Map<String, C11408c<Object>> f73821a;

    /* JADX INFO: renamed from: b */
    public final dq2 f73822b;

    /* JADX INFO: renamed from: c */
    public boolean f73823c;

    /* JADX INFO: renamed from: d */
    public boolean f73824d;

    /* JADX INFO: renamed from: e */
    public nj9 f73825e;

    /* JADX INFO: renamed from: f */
    public final Map<String, wmb> f73826f;

    /* JADX INFO: renamed from: g */
    public LebIpcReceiver f73827g;

    /* JADX INFO: renamed from: h */
    public boolean f73828h;

    /* JADX INFO: renamed from: i */
    public final C11407b f73829i;

    /* JADX INFO: renamed from: qb9$b */
    public class C11407b {
        public C11407b() {
        }

        private int getActiveCount(AbstractC1158q abstractC1158q) {
            try {
                Field declaredField = AbstractC1158q.class.getDeclaredField("c");
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(abstractC1158q)).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private int getObserverCount(AbstractC1158q abstractC1158q) {
            try {
                Field declaredField = AbstractC1158q.class.getDeclaredField("b");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(abstractC1158q);
                Method declaredMethod = obj.getClass().getDeclaredMethod(MediaInformation.KEY_SIZE, null);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(obj, null)).intValue();
            } catch (Exception unused) {
                return -1;
            }
        }

        private String getObserverInfo(AbstractC1158q abstractC1158q) {
            try {
                Field declaredField = AbstractC1158q.class.getDeclaredField("b");
                declaredField.setAccessible(true);
                return declaredField.get(abstractC1158q).toString();
            } catch (Exception unused) {
                return "";
            }
        }

        /* JADX INFO: renamed from: a */
        public String m20199a() {
            return "lifecycleObserverAlwaysActive: " + qb9.this.f73823c + "\nautoClear: " + qb9.this.f73824d + "\nlogger enable: " + qb9.this.f73825e.isEnable() + "\nlogger: " + qb9.this.f73825e.getLogger() + "\nReceiver register: " + qb9.this.f73828h + "\nApplication: " + AppUtils.getApp() + "\n";
        }

        /* JADX INFO: renamed from: b */
        public String m20200b() {
            StringBuilder sb = new StringBuilder();
            for (String str : qb9.this.f73821a.keySet()) {
                sb.append("Event name: " + str);
                sb.append("\n");
                C11408c.g gVar = ((C11408c) qb9.this.f73821a.get(str)).f73832b;
                sb.append("\tversion: " + gVar.getVersion());
                sb.append("\n");
                sb.append("\thasActiveObservers: " + gVar.hasActiveObservers());
                sb.append("\n");
                sb.append("\thasObservers: " + gVar.hasObservers());
                sb.append("\n");
                sb.append("\tActiveCount: " + getActiveCount(gVar));
                sb.append("\n");
                sb.append("\tObserverCount: " + getObserverCount(gVar));
                sb.append("\n");
                sb.append("\tObservers: ");
                sb.append("\n");
                sb.append("\t\t" + getObserverInfo(gVar));
                sb.append("\n");
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: c */
        public String m20201c() {
            return "*********Base info*********\n" + m20199a() + "*********Event info*********\n" + m20200b();
        }
    }

    /* JADX INFO: renamed from: qb9$c */
    public class C11408c<T> implements ukb<T> {

        /* JADX INFO: renamed from: a */
        @efb
        public final String f73831a;

        /* JADX INFO: renamed from: b */
        public final C11408c<T>.g<T> f73832b;

        /* JADX INFO: renamed from: c */
        public final Map<qxb, C11409d<T>> f73833c = new HashMap();

        /* JADX INFO: renamed from: d */
        public final Handler f73834d = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: qb9$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f73836a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f73837b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f73838c;

            public a(Object obj, boolean z, boolean z2) {
                this.f73836a = obj;
                this.f73837b = z;
                this.f73838c = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11408c.this.broadcastInternal(this.f73836a, this.f73837b, this.f73838c);
            }
        }

        /* JADX INFO: renamed from: qb9$c$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ g59 f73840a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qxb f73841b;

            public b(g59 g59Var, qxb qxbVar) {
                this.f73840a = g59Var;
                this.f73841b = qxbVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11408c.this.observeInternal(this.f73840a, this.f73841b);
            }
        }

        /* JADX INFO: renamed from: qb9$c$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ g59 f73843a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qxb f73844b;

            public c(g59 g59Var, qxb qxbVar) {
                this.f73843a = g59Var;
                this.f73844b = qxbVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11408c.this.observeStickyInternal(this.f73843a, this.f73844b);
            }
        }

        /* JADX INFO: renamed from: qb9$c$d */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ qxb f73846a;

            public d(qxb qxbVar) {
                this.f73846a = qxbVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11408c.this.observeForeverInternal(this.f73846a);
            }
        }

        /* JADX INFO: renamed from: qb9$c$e */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ qxb f73848a;

            public e(qxb qxbVar) {
                this.f73848a = qxbVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11408c.this.observeStickyForeverInternal(this.f73848a);
            }
        }

        /* JADX INFO: renamed from: qb9$c$f */
        public class f implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ qxb f73850a;

            public f(qxb qxbVar) {
                this.f73850a = qxbVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11408c.this.removeObserverInternal(this.f73850a);
            }
        }

        /* JADX INFO: renamed from: qb9$c$g */
        public class g<T> extends C1133e<T> {

            /* JADX INFO: renamed from: n */
            public final String f73852n;

            public g(String str) {
                this.f73852n = str;
            }

            private boolean autoClear() {
                Boolean bool;
                return (!qb9.this.f73826f.containsKey(this.f73852n) || (bool = ((wmb) qb9.this.f73826f.get(this.f73852n)).f94761b) == null) ? qb9.this.f73824d : bool.booleanValue();
            }

            private boolean lifecycleObserverAlwaysActive() {
                Boolean bool;
                return (!qb9.this.f73826f.containsKey(this.f73852n) || (bool = ((wmb) qb9.this.f73826f.get(this.f73852n)).f94760a) == null) ? qb9.this.f73823c : bool.booleanValue();
            }

            @Override // androidx.lifecycle.C1133e
            /* JADX INFO: renamed from: f */
            public AbstractC1143j.b mo1618f() {
                return lifecycleObserverAlwaysActive() ? AbstractC1143j.b.CREATED : AbstractC1143j.b.STARTED;
            }

            @Override // androidx.lifecycle.AbstractC1158q
            public void removeObserver(@efb qxb<? super T> qxbVar) {
                super.removeObserver(qxbVar);
                if (autoClear() && !C11408c.this.f73832b.hasObservers()) {
                    qb9.get().f73821a.remove(this.f73852n);
                }
                qb9.this.f73825e.log(Level.INFO, "observer removed: " + qxbVar);
            }
        }

        /* JADX INFO: renamed from: qb9$c$h */
        public class h implements Runnable {

            /* JADX INFO: renamed from: a */
            public Object f73854a;

            /* JADX INFO: renamed from: b */
            public g59 f73855b;

            public h(@efb Object obj, @hib g59 g59Var) {
                this.f73854a = obj;
                this.f73855b = g59Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                g59 g59Var = this.f73855b;
                if (g59Var == null || !g59Var.getLifecycle().getCurrentState().isAtLeast(AbstractC1143j.b.STARTED)) {
                    return;
                }
                C11408c.this.postInternal(this.f73854a);
            }
        }

        /* JADX INFO: renamed from: qb9$c$i */
        public class i implements Runnable {

            /* JADX INFO: renamed from: a */
            public Object f73857a;

            public i(@efb Object obj) {
                this.f73857a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11408c.this.postInternal(this.f73857a);
            }
        }

        public C11408c(@efb String str) {
            this.f73831a = str;
            this.f73832b = new g<>(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ir9
        public void broadcastInternal(T t, boolean z, boolean z2) {
            qb9.this.f73825e.log(Level.INFO, "broadcast: " + t + " foreground: " + z + " with key: " + this.f73831a);
            Application app = AppUtils.getApp();
            if (app == null) {
                qb9.this.f73825e.log(Level.WARNING, "application is null, you can try setContext() when config");
                return;
            }
            Intent intent = new Intent(cf8.f16412a);
            if (z) {
                intent.addFlags(268435456);
            }
            if (z2) {
                intent.setPackage(app.getPackageName());
            }
            intent.putExtra(cf8.f16413b, this.f73831a);
            if (odd.getManager().writeTo(intent, t)) {
                try {
                    app.sendBroadcast(intent);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ir9
        public void observeForeverInternal(@efb qxb<T> qxbVar) {
            C11409d<T> c11409d = qb9.this.new C11409d<>(qxbVar);
            c11409d.f73860b = this.f73832b.getVersion() > -1;
            this.f73833c.put(qxbVar, c11409d);
            this.f73832b.observeForever(c11409d);
            qb9.this.f73825e.log(Level.INFO, "observe forever observer: " + c11409d + c0b.f15433c + qxbVar + ") with key: " + this.f73831a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ir9
        public void observeInternal(@efb g59 g59Var, @efb qxb<T> qxbVar) {
            C11409d c11409d = qb9.this.new C11409d(qxbVar);
            c11409d.f73860b = this.f73832b.getVersion() > -1;
            this.f73832b.observe(g59Var, c11409d);
            qb9.this.f73825e.log(Level.INFO, "observe observer: " + c11409d + c0b.f15433c + qxbVar + ") on owner: " + g59Var + " with key: " + this.f73831a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ir9
        public void observeStickyForeverInternal(@efb qxb<T> qxbVar) {
            C11409d<T> c11409d = qb9.this.new C11409d<>(qxbVar);
            this.f73833c.put(qxbVar, c11409d);
            this.f73832b.observeForever(c11409d);
            qb9.this.f73825e.log(Level.INFO, "observe sticky forever observer: " + c11409d + c0b.f15433c + qxbVar + ") with key: " + this.f73831a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ir9
        public void observeStickyInternal(@efb g59 g59Var, @efb qxb<T> qxbVar) {
            C11409d c11409d = qb9.this.new C11409d(qxbVar);
            this.f73832b.observe(g59Var, c11409d);
            qb9.this.f73825e.log(Level.INFO, "observe sticky observer: " + c11409d + c0b.f15433c + qxbVar + ") on owner: " + g59Var + " with key: " + this.f73831a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ir9
        public void postInternal(T t) {
            qb9.this.f73825e.log(Level.INFO, "post: " + t + " with key: " + this.f73831a);
            this.f73832b.setValue(t);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ir9
        public void removeObserverInternal(@efb qxb<T> qxbVar) {
            if (this.f73833c.containsKey(qxbVar)) {
                qxbVar = this.f73833c.remove(qxbVar);
            }
            this.f73832b.removeObserver(qxbVar);
        }

        @Override // p000.ukb
        @Deprecated
        public void broadcast(T t) {
            broadcast(t, false, false);
        }

        @Override // p000.ukb
        public void observe(@efb g59 g59Var, @efb qxb<T> qxbVar) {
            if (syg.isMainThread()) {
                observeInternal(g59Var, qxbVar);
            } else {
                this.f73834d.post(new b(g59Var, qxbVar));
            }
        }

        @Override // p000.ukb
        public void observeForever(@efb qxb<T> qxbVar) {
            if (syg.isMainThread()) {
                observeForeverInternal(qxbVar);
            } else {
                this.f73834d.post(new d(qxbVar));
            }
        }

        @Override // p000.ukb
        public void observeSticky(@efb g59 g59Var, @efb qxb<T> qxbVar) {
            if (syg.isMainThread()) {
                observeStickyInternal(g59Var, qxbVar);
            } else {
                this.f73834d.post(new c(g59Var, qxbVar));
            }
        }

        @Override // p000.ukb
        public void observeStickyForever(@efb qxb<T> qxbVar) {
            if (syg.isMainThread()) {
                observeStickyForeverInternal(qxbVar);
            } else {
                this.f73834d.post(new e(qxbVar));
            }
        }

        @Override // p000.ukb
        public void post(T t) {
            if (syg.isMainThread()) {
                postInternal(t);
            } else {
                this.f73834d.post(new i(t));
            }
        }

        @Override // p000.ukb
        public void postAcrossApp(T t) {
            broadcast(t, false, false);
        }

        @Override // p000.ukb
        public void postAcrossProcess(T t) {
            broadcast(t, false, true);
        }

        @Override // p000.ukb
        public void postDelay(T t, long j) {
            this.f73834d.postDelayed(new i(t), j);
        }

        @Override // p000.ukb
        public void postOrderly(T t) {
            this.f73834d.post(new i(t));
        }

        @Override // p000.ukb
        public void removeObserver(@efb qxb<T> qxbVar) {
            if (syg.isMainThread()) {
                removeObserverInternal(qxbVar);
            } else {
                this.f73834d.post(new f(qxbVar));
            }
        }

        @Override // p000.ukb
        public void broadcast(T t, boolean z, boolean z2) {
            if (AppUtils.getApp() == null) {
                post(t);
            } else if (syg.isMainThread()) {
                broadcastInternal(t, z, z2);
            } else {
                this.f73834d.post(new a(t, z, z2));
            }
        }

        @Override // p000.ukb
        public void postDelay(g59 g59Var, T t, long j) {
            this.f73834d.postDelayed(new h(t, g59Var), j);
        }
    }

    /* JADX INFO: renamed from: qb9$d */
    public class C11409d<T> implements qxb<T> {

        /* JADX INFO: renamed from: a */
        @efb
        public final qxb<T> f73859a;

        /* JADX INFO: renamed from: b */
        public boolean f73860b = false;

        public C11409d(@efb qxb<T> qxbVar) {
            this.f73859a = qxbVar;
        }

        @Override // p000.qxb
        public void onChanged(@hib T t) {
            if (this.f73860b) {
                this.f73860b = false;
                return;
            }
            qb9.this.f73825e.log(Level.INFO, "message received: " + t);
            try {
                this.f73859a.onChanged(t);
            } catch (ClassCastException e) {
                qb9.this.f73825e.log(Level.WARNING, "class cast error on message received: " + t, e);
            } catch (Exception e2) {
                qb9.this.f73825e.log(Level.WARNING, "error on message received: " + t, e2);
            }
        }
    }

    /* JADX INFO: renamed from: qb9$e */
    public static class C11410e {

        /* JADX INFO: renamed from: a */
        public static final qb9 f73862a = new qb9();

        private C11410e() {
        }
    }

    public static qb9 get() {
        return C11410e.f73862a;
    }

    public dq2 config() {
        return this.f73822b;
    }

    /* JADX INFO: renamed from: g */
    public void m20194g(boolean z) {
        this.f73825e.setEnable(z);
    }

    /* JADX INFO: renamed from: h */
    public void m20195h() {
        Application app;
        if (this.f73828h || (app = AppUtils.getApp()) == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(cf8.f16412a);
        app.registerReceiver(this.f73827g, intentFilter, 2);
        this.f73828h = true;
    }

    /* JADX INFO: renamed from: i */
    public void m20196i(boolean z) {
        this.f73824d = z;
    }

    /* JADX INFO: renamed from: j */
    public void m20197j(boolean z) {
        this.f73823c = z;
    }

    /* JADX INFO: renamed from: k */
    public void m20198k(@efb hj9 hj9Var) {
        this.f73825e.setLogger(hj9Var);
    }

    public synchronized <T> ukb<T> with(String str, Class<T> cls) {
        try {
            if (!this.f73821a.containsKey(str)) {
                this.f73821a.put(str, new C11408c<>(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f73821a.get(str);
    }

    private qb9() {
        this.f73822b = new dq2();
        this.f73828h = false;
        this.f73829i = new C11407b();
        this.f73821a = new HashMap();
        this.f73826f = new HashMap();
        this.f73823c = true;
        this.f73824d = false;
        this.f73825e = new nj9(new pw3());
        this.f73827g = new LebIpcReceiver();
        m20195h();
    }

    public wmb config(String str) {
        if (!this.f73826f.containsKey(str)) {
            this.f73826f.put(str, new wmb());
        }
        return this.f73826f.get(str);
    }
}
