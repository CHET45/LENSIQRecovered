package p000;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class g1i {

    /* JADX INFO: renamed from: c */
    public static final String f38277c = ":";

    /* JADX INFO: renamed from: e */
    public static g1i f38279e;

    /* JADX INFO: renamed from: a */
    public final i52 f38280a;

    /* JADX INFO: renamed from: b */
    public static final long f38276b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: d */
    public static final Pattern f38278d = Pattern.compile("\\AA[\\w-]{38}\\z");

    private g1i(i52 i52Var) {
        this.f38280a = i52Var;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11316a(@hib String str) {
        return f38278d.matcher(str).matches();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11317b(@hib String str) {
        return str.contains(f38277c);
    }

    public static g1i getInstance() {
        return getInstance(ajg.getInstance());
    }

    public long currentTimeInMillis() {
        return this.f38280a.currentTimeMillis();
    }

    public long currentTimeInSecs() {
        return TimeUnit.MILLISECONDS.toSeconds(currentTimeInMillis());
    }

    public long getRandomDelayForSyncPrevention() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean isAuthTokenExpired(@efb iqc iqcVar) {
        return TextUtils.isEmpty(iqcVar.getAuthToken()) || iqcVar.getTokenCreationEpochInSecs() + iqcVar.getExpiresInSecs() < currentTimeInSecs() + f38276b;
    }

    public static g1i getInstance(i52 i52Var) {
        if (f38279e == null) {
            f38279e = new g1i(i52Var);
        }
        return f38279e;
    }
}
