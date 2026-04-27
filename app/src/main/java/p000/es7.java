package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class es7 {

    /* JADX INFO: renamed from: c */
    public static final String f33954c = "com.google.android.gms.appid";

    /* JADX INFO: renamed from: d */
    public static final String f33955d = "|S||P|";

    /* JADX INFO: renamed from: e */
    public static final String f33956e = "|S|id";

    /* JADX INFO: renamed from: f */
    public static final String f33957f = "|T|";

    /* JADX INFO: renamed from: g */
    public static final String f33958g = "|";

    /* JADX INFO: renamed from: h */
    public static final String f33959h = "token";

    /* JADX INFO: renamed from: i */
    public static final String f33960i = "{";

    /* JADX INFO: renamed from: j */
    public static final String[] f33961j = {"*", "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: a */
    @xc7("iidPrefs")
    public final SharedPreferences f33962a;

    /* JADX INFO: renamed from: b */
    public final String f33963b;

    public es7(@efb lw5 lw5Var) {
        this.f33962a = lw5Var.getApplicationContext().getSharedPreferences(f33954c, 0);
        this.f33963b = getDefaultSenderId(lw5Var);
    }

    private String createTokenKey(@efb String str, @efb String str2) {
        return f33957f + str + f33958g + str2;
    }

    private static String getDefaultSenderId(lw5 lw5Var) {
        String gcmSenderId = lw5Var.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = lw5Var.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(g1i.f38277c);
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @hib
    private static String getIdFromPublicKey(@efb PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String parseIidTokenFromJson(String str) {
        try {
            return new JSONObject(str).getString(f33959h);
        } catch (JSONException unused) {
            return null;
        }
    }

    @hib
    private PublicKey parseKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    @hib
    private String readInstanceIdFromLocalStorage() {
        String string;
        synchronized (this.f33962a) {
            string = this.f33962a.getString(f33956e, null);
        }
        return string;
    }

    @hib
    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        synchronized (this.f33962a) {
            try {
                String string = this.f33962a.getString(f33955d, null);
                if (string == null) {
                    return null;
                }
                PublicKey key = parseKey(string);
                if (key == null) {
                    return null;
                }
                return getIdFromPublicKey(key);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @hib
    public String readIid() {
        synchronized (this.f33962a) {
            try {
                String instanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
                if (instanceIdFromLocalStorage != null) {
                    return instanceIdFromLocalStorage;
                }
                return readPublicKeyFromLocalStorageAndCalculateInstanceId();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @hib
    public String readToken() {
        synchronized (this.f33962a) {
            try {
                for (String str : f33961j) {
                    String string = this.f33962a.getString(createTokenKey(this.f33963b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = parseIidTokenFromJson(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @fdi
    public es7(@efb SharedPreferences sharedPreferences, @hib String str) {
        this.f33962a = sharedPreferences;
        this.f33963b = str;
    }
}
