package p000;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.fk2;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public class lw5 {

    /* JADX INFO: renamed from: k */
    public static final String f58986k = "FirebaseApp";

    /* JADX INFO: renamed from: l */
    @efb
    public static final String f58987l = "[DEFAULT]";

    /* JADX INFO: renamed from: m */
    public static final Object f58988m = new Object();

    /* JADX INFO: renamed from: n */
    @xc7("LOCK")
    public static final Map<String, lw5> f58989n = new x60();

    /* JADX INFO: renamed from: a */
    public final Context f58990a;

    /* JADX INFO: renamed from: b */
    public final String f58991b;

    /* JADX INFO: renamed from: c */
    public final az5 f58992c;

    /* JADX INFO: renamed from: d */
    public final fk2 f58993d;

    /* JADX INFO: renamed from: g */
    public final dx8<uf3> f58996g;

    /* JADX INFO: renamed from: h */
    public final eid<uv3> f58997h;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f58994e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f58995f = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC8996a> f58998i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    public final List<qw5> f58999j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: lw5$a */
    @KeepForSdk
    public interface InterfaceC8996a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    /* JADX INFO: renamed from: lw5$b */
    @omg(14)
    public static class C8997b implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a */
        public static AtomicReference<C8997b> f59000a = new AtomicReference<>();

        private C8997b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureBackgroundStateListenerRegistered(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f59000a.get() == null) {
                    C8997b c8997b = new C8997b();
                    if (v7b.m23844a(f59000a, null, c8997b)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(c8997b);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (lw5.f58988m) {
                try {
                    for (lw5 lw5Var : new ArrayList(lw5.f58989n.values())) {
                        if (lw5Var.f58994e.get()) {
                            lw5Var.notifyBackgroundStateChangeListeners(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: lw5$c */
    @omg(24)
    public static class C8998c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b */
        public static AtomicReference<C8998c> f59001b = new AtomicReference<>();

        /* JADX INFO: renamed from: a */
        public final Context f59002a;

        public C8998c(Context context) {
            this.f59002a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureReceiverRegistered(Context context) {
            if (f59001b.get() == null) {
                C8998c c8998c = new C8998c(context);
                if (v7b.m23844a(f59001b, null, c8998c)) {
                    context.registerReceiver(c8998c, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (lw5.f58988m) {
                try {
                    Iterator<lw5> it = lw5.f58989n.values().iterator();
                    while (it.hasNext()) {
                        it.next().initializeAllApis();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            unregister();
        }

        public void unregister() {
            this.f59002a.unregisterReceiver(this);
        }
    }

    public lw5(final Context context, String str, az5 az5Var) {
        this.f58990a = (Context) Preconditions.checkNotNull(context);
        this.f58991b = Preconditions.checkNotEmpty(str);
        this.f58992c = (az5) Preconditions.checkNotNull(az5Var);
        e2g startupTime = FirebaseInitProvider.getStartupTime();
        nz5.pushTrace("Firebase");
        nz5.pushTrace(sj2.f81948c);
        List<eid<ComponentRegistrar>> listDiscoverLazy = sj2.forContext(context, ComponentDiscoveryService.class).discoverLazy();
        nz5.popTrace();
        nz5.pushTrace("Runtime");
        fk2.C5864b processor = fk2.builder(arh.INSTANCE).addLazyComponentRegistrars(listDiscoverLazy).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponentRegistrar(new ExecutorsRegistrar()).addComponent(ej2.m10036of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(ej2.m10036of(this, (Class<lw5>) lw5.class, (Class<? super lw5>[]) new Class[0])).addComponent(ej2.m10036of(az5Var, (Class<az5>) az5.class, (Class<? super az5>[]) new Class[0])).setProcessor(new wj2());
        if (bzh.isUserUnlocked(context) && FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(ej2.m10036of(startupTime, (Class<e2g>) e2g.class, (Class<? super e2g>[]) new Class[0]));
        }
        fk2 fk2VarBuild = processor.build();
        this.f58993d = fk2VarBuild;
        nz5.popTrace();
        this.f58996g = new dx8<>(new eid() { // from class: jw5
            @Override // p000.eid
            public final Object get() {
                return this.f52129a.lambda$new$0(context);
            }
        });
        this.f58997h = fk2VarBuild.getProvider(uv3.class);
        addBackgroundStateChangeListener(new InterfaceC8996a() { // from class: kw5
            @Override // p000.lw5.InterfaceC8996a
            public final void onBackgroundStateChanged(boolean z) {
                this.f55482a.lambda$new$1(z);
            }
        });
        nz5.popTrace();
    }

    private void checkNotDeleted() {
        Preconditions.checkState(!this.f58995f.get(), "FirebaseApp was deleted");
    }

    @fdi
    public static void clearInstancesForTest() {
        synchronized (f58988m) {
            f58989n.clear();
        }
    }

    private static List<String> getAllAppNames() {
        ArrayList arrayList = new ArrayList();
        synchronized (f58988m) {
            try {
                Iterator<lw5> it = f58989n.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getName());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @efb
    public static List<lw5> getApps(@efb Context context) {
        ArrayList arrayList;
        synchronized (f58988m) {
            arrayList = new ArrayList(f58989n.values());
        }
        return arrayList;
    }

    @efb
    public static lw5 getInstance() {
        lw5 lw5Var;
        synchronized (f58988m) {
            try {
                lw5Var = f58989n.get(f58987l);
                if (lw5Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                lw5Var.f58997h.get().registerHeartBeat();
            } catch (Throwable th) {
                throw th;
            }
        }
        return lw5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeAllApis() {
        if (!bzh.isUserUnlocked(this.f58990a)) {
            Log.i(f58986k, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + getName());
            C8998c.ensureReceiverRegistered(this.f58990a);
            return;
        }
        Log.i(f58986k, "Device unlocked: initializing all Firebase APIs for app " + getName());
        this.f58993d.initializeEagerComponents(isDefaultApp());
        this.f58997h.get().registerHeartBeat();
    }

    @hib
    public static lw5 initializeApp(@efb Context context) {
        synchronized (f58988m) {
            try {
                if (f58989n.containsKey(f58987l)) {
                    return getInstance();
                }
                az5 az5VarFromResource = az5.fromResource(context);
                if (az5VarFromResource == null) {
                    Log.w(f58986k, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return initializeApp(context, az5VarFromResource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ uf3 lambda$new$0(Context context) {
        return new uf3(context, getPersistenceKey(), (akd) this.f58993d.get(akd.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(boolean z) {
        if (z) {
            return;
        }
        this.f58997h.get().registerHeartBeat();
    }

    private static String normalize(@efb String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBackgroundStateChangeListeners(boolean z) {
        Iterator<InterfaceC8996a> it = this.f58998i.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z);
        }
    }

    private void notifyOnAppDeleted() {
        Iterator<qw5> it = this.f58999j.iterator();
        while (it.hasNext()) {
            it.next().onDeleted(this.f58991b, this.f58992c);
        }
    }

    @KeepForSdk
    public void addBackgroundStateChangeListener(InterfaceC8996a interfaceC8996a) {
        checkNotDeleted();
        if (this.f58994e.get() && BackgroundDetector.getInstance().isInBackground()) {
            interfaceC8996a.onBackgroundStateChanged(true);
        }
        this.f58998i.add(interfaceC8996a);
    }

    @KeepForSdk
    public void addLifecycleEventListener(@efb qw5 qw5Var) {
        checkNotDeleted();
        Preconditions.checkNotNull(qw5Var);
        this.f58999j.add(qw5Var);
    }

    public void delete() {
        if (this.f58995f.compareAndSet(false, true)) {
            synchronized (f58988m) {
                f58989n.remove(this.f58991b);
            }
            notifyOnAppDeleted();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof lw5) {
            return this.f58991b.equals(((lw5) obj).getName());
        }
        return false;
    }

    @fdi
    @p7e({p7e.EnumC10826a.f69938e})
    /* JADX INFO: renamed from: g */
    public void m16419g() {
        this.f58993d.initializeAllComponentsForTests();
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
        checkNotDeleted();
        return (T) this.f58993d.get(cls);
    }

    @efb
    public Context getApplicationContext() {
        checkNotDeleted();
        return this.f58990a;
    }

    @efb
    public String getName() {
        checkNotDeleted();
        return this.f58991b;
    }

    @efb
    public az5 getOptions() {
        checkNotDeleted();
        return this.f58992c;
    }

    @KeepForSdk
    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public int hashCode() {
        return this.f58991b.hashCode();
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        checkNotDeleted();
        return this.f58996g.get().isEnabled();
    }

    @KeepForSdk
    @fdi
    public boolean isDefaultApp() {
        return f58987l.equals(getName());
    }

    @KeepForSdk
    public void removeBackgroundStateChangeListener(InterfaceC8996a interfaceC8996a) {
        checkNotDeleted();
        this.f58998i.remove(interfaceC8996a);
    }

    @KeepForSdk
    public void removeLifecycleEventListener(@efb qw5 qw5Var) {
        checkNotDeleted();
        Preconditions.checkNotNull(qw5Var);
        this.f58999j.remove(qw5Var);
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        checkNotDeleted();
        if (this.f58994e.compareAndSet(!z, z)) {
            boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z && zIsInBackground) {
                notifyBackgroundStateChangeListeners(true);
            } else {
                if (z || !zIsInBackground) {
                    return;
                }
                notifyBackgroundStateChangeListeners(false);
            }
        }
    }

    @KeepForSdk
    public void setDataCollectionDefaultEnabled(Boolean bool) {
        checkNotDeleted();
        this.f58996g.get().setEnabled(bool);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f58991b).add("options", this.f58992c).toString();
    }

    @KeepForSdk
    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z));
    }

    @KeepForSdk
    public static String getPersistenceKey(String str, az5 az5Var) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(az5Var.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    @efb
    public static lw5 getInstance(@efb String str) {
        lw5 lw5Var;
        String str2;
        synchronized (f58988m) {
            try {
                lw5Var = f58989n.get(normalize(str));
                if (lw5Var != null) {
                    lw5Var.f58997h.get().registerHeartBeat();
                } else {
                    List<String> allAppNames = getAllAppNames();
                    if (allAppNames.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", allAppNames);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
            } finally {
            }
        }
        return lw5Var;
    }

    @efb
    public static lw5 initializeApp(@efb Context context, @efb az5 az5Var) {
        return initializeApp(context, az5Var, f58987l);
    }

    @efb
    public static lw5 initializeApp(@efb Context context, @efb az5 az5Var, @efb String str) {
        lw5 lw5Var;
        C8997b.ensureBackgroundStateListenerRegistered(context);
        String strNormalize = normalize(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f58988m) {
            Map<String, lw5> map = f58989n;
            Preconditions.checkState(!map.containsKey(strNormalize), "FirebaseApp name " + strNormalize + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            lw5Var = new lw5(context, strNormalize, az5Var);
            map.put(strNormalize, lw5Var);
        }
        lw5Var.initializeAllApis();
        return lw5Var;
    }
}
