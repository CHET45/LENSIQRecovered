package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.sessions.BuildConfig;
import java.util.Map;
import p000.c6f;

/* JADX INFO: loaded from: classes5.dex */
public final class f5f {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final f5f f35386a = new f5f();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final zf3 f35387b;

    static {
        zf3 zf3VarBuild = new mk8().configureWith(ej0.f33131b).ignoreNullValues(true).build();
        md8.checkNotNullExpressionValue(zf3VarBuild, "build(...)");
        f35387b = zf3VarBuild;
    }

    private f5f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e5f buildSession$default(f5f f5fVar, lw5 lw5Var, d5f d5fVar, f6f f6fVar, Map map, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            map = xt9.emptyMap();
        }
        return f5fVar.buildSession(lw5Var, d5fVar, f6fVar, map, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? "" : str2);
    }

    private final wf3 toDataCollectionState(c6f c6fVar) {
        return c6fVar == null ? wf3.f94068c : c6fVar.isDataCollectionEnabled() ? wf3.f94069d : wf3.f94070e;
    }

    @yfb
    public final e5f buildSession(@yfb lw5 lw5Var, @yfb d5f d5fVar, @yfb f6f f6fVar, @yfb Map<c6f.EnumC2215a, ? extends c6f> map, @yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(lw5Var, "firebaseApp");
        md8.checkNotNullParameter(d5fVar, "sessionDetails");
        md8.checkNotNullParameter(f6fVar, "sessionsSettings");
        md8.checkNotNullParameter(map, "subscribers");
        md8.checkNotNullParameter(str, "firebaseInstallationId");
        md8.checkNotNullParameter(str2, "firebaseAuthenticationToken");
        return new e5f(b75.f12839c, new n5f(d5fVar.getSessionId(), d5fVar.getFirstSessionId(), d5fVar.getSessionIndex(), d5fVar.getSessionStartTimestampUs(), new xf3(toDataCollectionState(map.get(c6f.EnumC2215a.f15861b)), toDataCollectionState(map.get(c6f.EnumC2215a.f15860a)), f6fVar.getSamplingRate()), str, str2), getApplicationInfo(lw5Var));
    }

    @yfb
    public final k40 getApplicationInfo(@yfb lw5 lw5Var) throws PackageManager.NameNotFoundException {
        md8.checkNotNullParameter(lw5Var, "firebaseApp");
        Context applicationContext = lw5Var.getApplicationContext();
        md8.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String applicationId = lw5Var.getOptions().getApplicationId();
        md8.checkNotNullExpressionValue(applicationId, "getApplicationId(...)");
        String str = Build.MODEL;
        md8.checkNotNullExpressionValue(str, "MODEL");
        String str2 = Build.VERSION.RELEASE;
        md8.checkNotNullExpressionValue(str2, "RELEASE");
        ci9 ci9Var = ci9.f16633e;
        md8.checkNotNull(packageName);
        String str3 = packageInfo.versionName;
        String str4 = str3 == null ? strValueOf : str3;
        String str5 = Build.MANUFACTURER;
        md8.checkNotNullExpressionValue(str5, "MANUFACTURER");
        add addVar = add.f1167a;
        Context applicationContext2 = lw5Var.getApplicationContext();
        md8.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        ycd myProcessDetails = addVar.getMyProcessDetails(applicationContext2);
        Context applicationContext3 = lw5Var.getApplicationContext();
        md8.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
        return new k40(applicationId, str, BuildConfig.VERSION_NAME, str2, ci9Var, new C12176ro(packageName, str4, strValueOf, str5, myProcessDetails, addVar.getAppProcessDetails(applicationContext3)));
    }

    @yfb
    public final zf3 getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return f35387b;
    }
}
