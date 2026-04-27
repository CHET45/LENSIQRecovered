package p000;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p000.j58;
import p000.v3h;
import p000.vy5;

/* JADX INFO: loaded from: classes5.dex */
public class ty5 implements uy5 {

    /* JADX INFO: renamed from: n */
    public static final String f86303n = "generatefid.lock";

    /* JADX INFO: renamed from: o */
    public static final String f86304o = "CHIME_ANDROID_SDK";

    /* JADX INFO: renamed from: p */
    public static final int f86305p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f86306q = 1;

    /* JADX INFO: renamed from: r */
    public static final long f86307r = 30;

    /* JADX INFO: renamed from: t */
    public static final String f86309t = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* JADX INFO: renamed from: u */
    public static final String f86310u = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* JADX INFO: renamed from: v */
    public static final String f86311v = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* JADX INFO: renamed from: w */
    public static final String f86312w = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";

    /* JADX INFO: renamed from: a */
    public final lw5 f86313a;

    /* JADX INFO: renamed from: b */
    public final ny5 f86314b;

    /* JADX INFO: renamed from: c */
    public final hqc f86315c;

    /* JADX INFO: renamed from: d */
    public final g1i f86316d;

    /* JADX INFO: renamed from: e */
    public final dx8<es7> f86317e;

    /* JADX INFO: renamed from: f */
    public final uod f86318f;

    /* JADX INFO: renamed from: g */
    public final Object f86319g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f86320h;

    /* JADX INFO: renamed from: i */
    public final Executor f86321i;

    /* JADX INFO: renamed from: j */
    @xc7("this")
    public String f86322j;

    /* JADX INFO: renamed from: k */
    @xc7("FirebaseInstallations.this")
    public Set<tq5> f86323k;

    /* JADX INFO: renamed from: l */
    @xc7("lock")
    public final List<s2g> f86324l;

    /* JADX INFO: renamed from: m */
    public static final Object f86302m = new Object();

    /* JADX INFO: renamed from: s */
    public static final ThreadFactory f86308s = new ThreadFactoryC13283a();

    /* JADX INFO: renamed from: ty5$a */
    public class ThreadFactoryC13283a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f86325a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @igg({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f86325a.getAndIncrement())));
        }
    }

    /* JADX INFO: renamed from: ty5$b */
    public class C13284b implements uq5 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ tq5 f86326a;

        public C13284b(tq5 tq5Var) {
            this.f86326a = tq5Var;
        }

        @Override // p000.uq5
        public void unregister() {
            synchronized (ty5.this) {
                ty5.this.f86323k.remove(this.f86326a);
            }
        }
    }

    /* JADX INFO: renamed from: ty5$c */
    public static /* synthetic */ class C13285c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f86328a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f86329b;

        static {
            int[] iArr = new int[v3h.EnumC13856b.values().length];
            f86329b = iArr;
            try {
                iArr[v3h.EnumC13856b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86329b[v3h.EnumC13856b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86329b[v3h.EnumC13856b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[j58.EnumC7741b.values().length];
            f86328a = iArr2;
            try {
                iArr2[j58.EnumC7741b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f86328a[j58.EnumC7741b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @igg({"ThreadPoolCreation"})
    public ty5(final lw5 lw5Var, @efb eid<wi7> eidVar, @efb ExecutorService executorService, @efb Executor executor) {
        this(executorService, executor, lw5Var, new ny5(lw5Var.getApplicationContext(), eidVar), new hqc(lw5Var), g1i.getInstance(), new dx8(new eid() { // from class: oy5
            @Override // p000.eid
            public final Object get() {
                return ty5.lambda$new$0(lw5Var);
            }
        }), new uod());
    }

    private Task<k58> addGetAuthTokenListener() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        addStateListeners(new q37(this.f86316d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> addGetIdListener() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        addStateListeners(new n47(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void addStateListeners(s2g s2gVar) {
        synchronized (this.f86319g) {
            this.f86324l.add(s2gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void deleteFirebaseInstallationId() throws vy5 {
        updateCacheFid(null);
        iqc multiProcessSafePrefs = getMultiProcessSafePrefs();
        if (multiProcessSafePrefs.isRegistered()) {
            this.f86314b.deleteFirebaseInstallation(m22913g(), multiProcessSafePrefs.getFirebaseInstallationId(), m22916j(), multiProcessSafePrefs.getRefreshToken());
        }
        insertOrUpdatePrefs(multiProcessSafePrefs.withNoGeneratedFid());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: doNetworkCallIfNecessary, reason: merged with bridge method [inline-methods] */
    public void lambda$doRegistrationOrRefresh$3(boolean z) {
        iqc iqcVarRegisterFidWithServer;
        iqc multiProcessSafePrefs = getMultiProcessSafePrefs();
        try {
            if (multiProcessSafePrefs.isErrored() || multiProcessSafePrefs.isUnregistered()) {
                iqcVarRegisterFidWithServer = registerFidWithServer(multiProcessSafePrefs);
            } else {
                if (!z && !this.f86316d.isAuthTokenExpired(multiProcessSafePrefs)) {
                    return;
                }
                iqcVarRegisterFidWithServer = fetchAuthTokenFromServer(multiProcessSafePrefs);
            }
            insertOrUpdatePrefs(iqcVarRegisterFidWithServer);
            updateFidListener(multiProcessSafePrefs, iqcVarRegisterFidWithServer);
            if (iqcVarRegisterFidWithServer.isRegistered()) {
                updateCacheFid(iqcVarRegisterFidWithServer.getFirebaseInstallationId());
            }
            if (iqcVarRegisterFidWithServer.isErrored()) {
                triggerOnException(new vy5(vy5.EnumC14299a.BAD_CONFIG));
            } else if (iqcVarRegisterFidWithServer.isNotGenerated()) {
                triggerOnException(new IOException(f86312w));
            } else {
                triggerOnStateReached(iqcVarRegisterFidWithServer);
            }
        } catch (vy5 e) {
            triggerOnException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: doRegistrationOrRefresh, reason: merged with bridge method [inline-methods] */
    public final void lambda$getToken$2(final boolean z) {
        iqc prefsWithGeneratedIdMultiProcessSafe = getPrefsWithGeneratedIdMultiProcessSafe();
        if (z) {
            prefsWithGeneratedIdMultiProcessSafe = prefsWithGeneratedIdMultiProcessSafe.withClearedAuthToken();
        }
        triggerOnStateReached(prefsWithGeneratedIdMultiProcessSafe);
        this.f86321i.execute(new Runnable() { // from class: py5
            @Override // java.lang.Runnable
            public final void run() {
                this.f72493a.lambda$doRegistrationOrRefresh$3(z);
            }
        });
    }

    private iqc fetchAuthTokenFromServer(@efb iqc iqcVar) throws vy5 {
        v3h v3hVarGenerateAuthToken = this.f86314b.generateAuthToken(m22913g(), iqcVar.getFirebaseInstallationId(), m22916j(), iqcVar.getRefreshToken());
        int i = C13285c.f86329b[v3hVarGenerateAuthToken.getResponseCode().ordinal()];
        if (i == 1) {
            return iqcVar.withAuthToken(v3hVarGenerateAuthToken.getToken(), v3hVarGenerateAuthToken.getTokenExpirationTimestamp(), this.f86316d.currentTimeInSecs());
        }
        if (i == 2) {
            return iqcVar.withFisError("BAD CONFIG");
        }
        if (i != 3) {
            throw new vy5("Firebase Installations Service is unavailable. Please try again later.", vy5.EnumC14299a.UNAVAILABLE);
        }
        updateCacheFid(null);
        return iqcVar.withNoGeneratedFid();
    }

    private synchronized String getCacheFid() {
        return this.f86322j;
    }

    private es7 getIidStore() {
        return this.f86317e.get();
    }

    @efb
    public static ty5 getInstance() {
        return getInstance(lw5.getInstance());
    }

    /* JADX WARN: Finally extract failed */
    private iqc getMultiProcessSafePrefs() {
        iqc persistedInstallationEntryValue;
        synchronized (f86302m) {
            try {
                y83 y83VarM25695a = y83.m25695a(this.f86313a.getApplicationContext(), f86303n);
                try {
                    persistedInstallationEntryValue = this.f86315c.readPersistedInstallationEntryValue();
                    if (y83VarM25695a != null) {
                        y83VarM25695a.m25696b();
                    }
                } catch (Throwable th) {
                    if (y83VarM25695a != null) {
                        y83VarM25695a.m25696b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return persistedInstallationEntryValue;
    }

    /* JADX WARN: Finally extract failed */
    private iqc getPrefsWithGeneratedIdMultiProcessSafe() {
        iqc persistedInstallationEntryValue;
        synchronized (f86302m) {
            try {
                y83 y83VarM25695a = y83.m25695a(this.f86313a.getApplicationContext(), f86303n);
                try {
                    persistedInstallationEntryValue = this.f86315c.readPersistedInstallationEntryValue();
                    if (persistedInstallationEntryValue.isNotGenerated()) {
                        persistedInstallationEntryValue = this.f86315c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntryValue.withUnregisteredFid(readExistingIidOrCreateFid(persistedInstallationEntryValue)));
                    }
                    if (y83VarM25695a != null) {
                        y83VarM25695a.m25696b();
                    }
                } catch (Throwable th) {
                    if (y83VarM25695a != null) {
                        y83VarM25695a.m25696b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return persistedInstallationEntryValue;
    }

    /* JADX WARN: Finally extract failed */
    private void insertOrUpdatePrefs(iqc iqcVar) {
        synchronized (f86302m) {
            try {
                y83 y83VarM25695a = y83.m25695a(this.f86313a.getApplicationContext(), f86303n);
                try {
                    this.f86315c.insertOrUpdatePersistedInstallationEntry(iqcVar);
                    if (y83VarM25695a != null) {
                        y83VarM25695a.m25696b();
                    }
                } catch (Throwable th) {
                    if (y83VarM25695a != null) {
                        y83VarM25695a.m25696b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getId$1() {
        lambda$getToken$2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ es7 lambda$new$0(lw5 lw5Var) {
        return new es7(lw5Var);
    }

    private void preConditionChecks() {
        Preconditions.checkNotEmpty(m22914h(), f86310u);
        Preconditions.checkNotEmpty(m22916j(), f86311v);
        Preconditions.checkNotEmpty(m22913g(), f86309t);
        Preconditions.checkArgument(g1i.m11317b(m22914h()), f86310u);
        Preconditions.checkArgument(g1i.m11316a(m22913g()), f86309t);
    }

    private String readExistingIidOrCreateFid(iqc iqcVar) {
        if ((!this.f86313a.getName().equals(f86304o) && !this.f86313a.isDefaultApp()) || !iqcVar.shouldAttemptMigration()) {
            return this.f86318f.createRandomFid();
        }
        String iid = getIidStore().readIid();
        return TextUtils.isEmpty(iid) ? this.f86318f.createRandomFid() : iid;
    }

    private iqc registerFidWithServer(iqc iqcVar) throws vy5 {
        j58 j58VarCreateFirebaseInstallation = this.f86314b.createFirebaseInstallation(m22913g(), iqcVar.getFirebaseInstallationId(), m22916j(), m22914h(), (iqcVar.getFirebaseInstallationId() == null || iqcVar.getFirebaseInstallationId().length() != 11) ? null : getIidStore().readToken());
        int i = C13285c.f86328a[j58VarCreateFirebaseInstallation.getResponseCode().ordinal()];
        if (i == 1) {
            return iqcVar.withRegisteredFid(j58VarCreateFirebaseInstallation.getFid(), j58VarCreateFirebaseInstallation.getRefreshToken(), this.f86316d.currentTimeInSecs(), j58VarCreateFirebaseInstallation.getAuthToken().getToken(), j58VarCreateFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
        }
        if (i == 2) {
            return iqcVar.withFisError("BAD CONFIG");
        }
        throw new vy5("Firebase Installations Service is unavailable. Please try again later.", vy5.EnumC14299a.UNAVAILABLE);
    }

    private void triggerOnException(Exception exc) {
        synchronized (this.f86319g) {
            try {
                Iterator<s2g> it = this.f86324l.iterator();
                while (it.hasNext()) {
                    if (it.next().onException(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void triggerOnStateReached(iqc iqcVar) {
        synchronized (this.f86319g) {
            try {
                Iterator<s2g> it = this.f86324l.iterator();
                while (it.hasNext()) {
                    if (it.next().onStateReached(iqcVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void updateCacheFid(String str) {
        this.f86322j = str;
    }

    private synchronized void updateFidListener(iqc iqcVar, iqc iqcVar2) {
        if (this.f86323k.size() != 0 && !TextUtils.equals(iqcVar.getFirebaseInstallationId(), iqcVar2.getFirebaseInstallationId())) {
            Iterator<tq5> it = this.f86323k.iterator();
            while (it.hasNext()) {
                it.next().onFidChanged(iqcVar2.getFirebaseInstallationId());
            }
        }
    }

    @Override // p000.uy5
    @efb
    public Task<Void> delete() {
        return Tasks.call(this.f86320h, new Callable() { // from class: ry5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f80098a.deleteFirebaseInstallationId();
            }
        });
    }

    @hib
    /* JADX INFO: renamed from: g */
    public String m22913g() {
        return this.f86313a.getOptions().getApiKey();
    }

    @Override // p000.uy5
    @efb
    public Task<String> getId() {
        preConditionChecks();
        String cacheFid = getCacheFid();
        if (cacheFid != null) {
            return Tasks.forResult(cacheFid);
        }
        Task<String> taskAddGetIdListener = addGetIdListener();
        this.f86320h.execute(new Runnable() { // from class: qy5
            @Override // java.lang.Runnable
            public final void run() {
                this.f76299a.lambda$getId$1();
            }
        });
        return taskAddGetIdListener;
    }

    @Override // p000.uy5
    @efb
    public Task<k58> getToken(final boolean z) {
        preConditionChecks();
        Task<k58> taskAddGetAuthTokenListener = addGetAuthTokenListener();
        this.f86320h.execute(new Runnable() { // from class: sy5
            @Override // java.lang.Runnable
            public final void run() {
                this.f83215a.lambda$getToken$2(z);
            }
        });
        return taskAddGetAuthTokenListener;
    }

    @fdi
    /* JADX INFO: renamed from: h */
    public String m22914h() {
        return this.f86313a.getOptions().getApplicationId();
    }

    @fdi
    /* JADX INFO: renamed from: i */
    public String m22915i() {
        return this.f86313a.getName();
    }

    @hib
    /* JADX INFO: renamed from: j */
    public String m22916j() {
        return this.f86313a.getOptions().getProjectId();
    }

    @Override // p000.uy5
    @efb
    public synchronized uq5 registerFidListener(@efb tq5 tq5Var) {
        this.f86323k.add(tq5Var);
        return new C13284b(tq5Var);
    }

    @efb
    public static ty5 getInstance(@efb lw5 lw5Var) {
        Preconditions.checkArgument(lw5Var != null, "Null is not a valid value of FirebaseApp.");
        return (ty5) lw5Var.get(uy5.class);
    }

    @igg({"ThreadPoolCreation"})
    public ty5(ExecutorService executorService, Executor executor, lw5 lw5Var, ny5 ny5Var, hqc hqcVar, g1i g1iVar, dx8<es7> dx8Var, uod uodVar) {
        this.f86319g = new Object();
        this.f86323k = new HashSet();
        this.f86324l = new ArrayList();
        this.f86313a = lw5Var;
        this.f86314b = ny5Var;
        this.f86315c = hqcVar;
        this.f86316d = g1iVar;
        this.f86317e = dx8Var;
        this.f86318f = uodVar;
        this.f86320h = executorService;
        this.f86321i = executor;
    }
}
