package p000;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p024firebaseauthapi.zzal;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: r8 */
/* JADX INFO: loaded from: classes5.dex */
public class C11938r8 {

    /* JADX INFO: renamed from: g */
    public static final zzal<String, Integer> f77371g;

    /* JADX INFO: renamed from: a */
    public final String f77372a;

    /* JADX INFO: renamed from: b */
    public final String f77373b;

    /* JADX INFO: renamed from: c */
    public final String f77374c;

    /* JADX INFO: renamed from: d */
    @hib
    public final String f77375d;

    /* JADX INFO: renamed from: e */
    @hib
    public final String f77376e;

    /* JADX INFO: renamed from: f */
    @hib
    public final String f77377f;

    static {
        HashMap map = new HashMap();
        map.put("recoverEmail", 2);
        map.put("resetPassword", 0);
        map.put("signIn", 4);
        map.put("verifyEmail", 1);
        map.put("verifyBeforeChangeEmail", 5);
        map.put("revertSecondFactorAddition", 6);
        f77371g = zzal.zza(map);
    }

    private C11938r8(String str) {
        String strZza = zza(str, "apiKey");
        String strZza2 = zza(str, "oobCode");
        String strZza3 = zza(str, "mode");
        if (strZza == null || strZza2 == null || strZza3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f77372a = Preconditions.checkNotEmpty(strZza);
        this.f77373b = Preconditions.checkNotEmpty(strZza2);
        this.f77374c = Preconditions.checkNotEmpty(strZza3);
        this.f77375d = zza(str, "continueUrl");
        this.f77376e = zza(str, "lang");
        this.f77377f = zza(str, "tenantId");
    }

    @hib
    public static C11938r8 parseLink(@hib String str) {
        Preconditions.checkNotEmpty(str);
        try {
            return new C11938r8(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @efb
    public String getApiKey() {
        return this.f77372a;
    }

    @hib
    public String getCode() {
        return this.f77373b;
    }

    @hib
    public String getContinueUrl() {
        return this.f77375d;
    }

    @hib
    public String getLanguageCode() {
        return this.f77376e;
    }

    public int getOperation() {
        zzal<String, Integer> zzalVar = f77371g;
        if (zzalVar.containsKey(this.f77374c)) {
            return zzalVar.get(this.f77374c).intValue();
        }
        return 3;
    }

    @hib
    public final String zza() {
        return this.f77377f;
    }

    @hib
    private static String zza(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(Preconditions.checkNotEmpty(uri.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
