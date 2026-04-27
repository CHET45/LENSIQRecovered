package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class f57 {

    /* JADX INFO: renamed from: a */
    @hib
    public String f35363a;

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f35364b;

    @KeepForSdk
    public f57(@hib String str, @efb Map<String, Object> map) {
        this.f35363a = str;
        this.f35364b = map;
    }

    private final long zza(String str) {
        Integer num = (Integer) this.f35364b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public long getAuthTimestamp() {
        return zza("auth_time");
    }

    @efb
    public Map<String, Object> getClaims() {
        return this.f35364b;
    }

    public long getExpirationTimestamp() {
        return zza("exp");
    }

    public long getIssuedAtTimestamp() {
        return zza("iat");
    }

    @hib
    public String getSignInProvider() {
        Map map = (Map) this.f35364b.get(cx5.f27983a);
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    @hib
    @KeepForSdk
    public String getSignInSecondFactor() {
        Map map = (Map) this.f35364b.get(cx5.f27983a);
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    @hib
    public String getToken() {
        return this.f35363a;
    }
}
