package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p000.h58;

/* JADX INFO: loaded from: classes5.dex */
public class jr7 implements h58 {

    /* JADX INFO: renamed from: g */
    public static final int f51588g = 10000;

    /* JADX INFO: renamed from: h */
    public static final String f51589h = "0.0";

    /* JADX INFO: renamed from: i */
    public static final String f51590i = "crashlytics.advertising.id";

    /* JADX INFO: renamed from: j */
    public static final String f51591j = "crashlytics.installation.id";

    /* JADX INFO: renamed from: k */
    public static final String f51592k = "firebase.installation.id";

    /* JADX INFO: renamed from: l */
    public static final String f51593l = "crashlytics.installation.id";

    /* JADX INFO: renamed from: n */
    public static final String f51595n = "SYN_";

    /* JADX INFO: renamed from: a */
    public final m58 f51597a;

    /* JADX INFO: renamed from: b */
    public final Context f51598b;

    /* JADX INFO: renamed from: c */
    public final String f51599c;

    /* JADX INFO: renamed from: d */
    public final uy5 f51600d;

    /* JADX INFO: renamed from: e */
    public final tf3 f51601e;

    /* JADX INFO: renamed from: f */
    public h58.AbstractC6712a f51602f;

    /* JADX INFO: renamed from: m */
    public static final Pattern f51594m = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: o */
    public static final String f51596o = Pattern.quote(pj4.f71071b);

    public jr7(Context context, String str, uy5 uy5Var, tf3 tf3Var) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f51598b = context;
        this.f51599c = str;
        this.f51600d = uy5Var;
        this.f51601e = tf3Var;
        this.f51597a = new m58();
    }

    /* JADX INFO: renamed from: a */
    public static String m14255a() {
        return f51595n + UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14256b(String str) {
        return str != null && str.startsWith(f51595n);
    }

    @efb
    private synchronized String createAndCacheCrashlyticsInstallId(String str, SharedPreferences sharedPreferences) {
        String id;
        id = formatId(UUID.randomUUID().toString());
        ej9.getLogger().m10067v("Created new Crashlytics installation ID: " + id + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", id).putString(f51592k, str).apply();
        return id;
    }

    @efb
    private static String formatId(@efb String str) {
        return f51594m.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    private String readCachedCrashlyticsInstallId(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String removeForwardSlashesIn(String str) {
        return str.replaceAll(f51596o, "");
    }

    private boolean shouldRefresh() {
        h58.AbstractC6712a abstractC6712a = this.f51602f;
        return abstractC6712a == null || (abstractC6712a.getFirebaseInstallationId() == null && this.f51601e.isAutomaticDataCollectionEnabled());
    }

    @efb
    public my5 fetchTrueFid(boolean z) {
        String token;
        g53.checkNotMainThread();
        String str = null;
        if (z) {
            try {
                token = ((k58) Tasks.await(this.f51600d.getToken(false), 10000L, TimeUnit.MILLISECONDS)).getToken();
            } catch (Exception e) {
                ej9.getLogger().m10070w("Error getting Firebase authentication token.", e);
                token = null;
            }
        } else {
            token = null;
        }
        try {
            str = (String) Tasks.await(this.f51600d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            ej9.getLogger().m10070w("Error getting Firebase installation id.", e2);
        }
        return new my5(str, token);
    }

    public String getAppIdentifier() {
        return this.f51599c;
    }

    @Override // p000.h58
    @efb
    public synchronized h58.AbstractC6712a getInstallIds() {
        if (!shouldRefresh()) {
            return this.f51602f;
        }
        ej9.getLogger().m10067v("Determining Crashlytics installation ID...");
        SharedPreferences sharedPrefs = lc2.getSharedPrefs(this.f51598b);
        String string = sharedPrefs.getString(f51592k, null);
        ej9.getLogger().m10067v("Cached Firebase Installation ID: " + string);
        if (this.f51601e.isAutomaticDataCollectionEnabled()) {
            my5 my5VarFetchTrueFid = fetchTrueFid(false);
            ej9.getLogger().m10067v("Fetched Firebase Installation ID: " + my5VarFetchTrueFid.getFid());
            if (my5VarFetchTrueFid.getFid() == null) {
                my5VarFetchTrueFid = new my5(string == null ? m14255a() : string, null);
            }
            if (Objects.equals(my5VarFetchTrueFid.getFid(), string)) {
                this.f51602f = h58.AbstractC6712a.m12165a(readCachedCrashlyticsInstallId(sharedPrefs), my5VarFetchTrueFid);
            } else {
                this.f51602f = h58.AbstractC6712a.m12165a(createAndCacheCrashlyticsInstallId(my5VarFetchTrueFid.getFid(), sharedPrefs), my5VarFetchTrueFid);
            }
        } else if (m14256b(string)) {
            this.f51602f = h58.AbstractC6712a.createWithoutFid(readCachedCrashlyticsInstallId(sharedPrefs));
        } else {
            this.f51602f = h58.AbstractC6712a.createWithoutFid(createAndCacheCrashlyticsInstallId(m14255a(), sharedPrefs));
        }
        ej9.getLogger().m10067v("Install IDs: " + this.f51602f);
        return this.f51602f;
    }

    public String getInstallerPackageName() {
        return this.f51597a.m16628a(this.f51598b);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", removeForwardSlashesIn(Build.MANUFACTURER), removeForwardSlashesIn(Build.MODEL));
    }

    public String getOsBuildVersionString() {
        return removeForwardSlashesIn(Build.VERSION.INCREMENTAL);
    }

    public String getOsDisplayVersionString() {
        return removeForwardSlashesIn(Build.VERSION.RELEASE);
    }
}
