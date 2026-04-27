package p000;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p024firebaseauthapi.zzba;
import com.google.android.gms.internal.p024firebaseauthapi.zzcl;
import com.google.android.gms.internal.p024firebaseauthapi.zzco;
import com.google.android.gms.internal.p024firebaseauthapi.zzcv;
import com.google.android.gms.internal.p024firebaseauthapi.zzmy;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class i7j {

    /* JADX INFO: renamed from: c */
    @hib
    public static i7j f45964c;

    /* JADX INFO: renamed from: a */
    public final String f45965a;

    /* JADX INFO: renamed from: b */
    @hib
    public final zzmy f45966b;

    private i7j(String str, @hib zzmy zzmyVar) {
        this.f45965a = str;
        this.f45966b = zzmyVar;
    }

    public static i7j zza(Context context, String str) {
        i7j i7jVar = f45964c;
        if (i7jVar == null || !Objects.equals(i7jVar.f45965a, str)) {
            f45964c = new i7j(str, zzc(context, str));
        }
        return f45964c;
    }

    private static zzmy zzb(Context context, String str) throws GeneralSecurityException, IOException {
        return new zzmy.zza().zza(context, "StorageCryptoKeyset", zzc(str)).zza(zzcv.zzb).zza(String.format("android-keystore://firebear_main_key_id_for_storage_crypto.%s", str)).zza();
    }

    @hib
    private static zzmy zzc(Context context, String str) {
        try {
            zzcl.zza();
            return zzb(context, str);
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e.getMessage());
            if (e instanceof GeneralSecurityException) {
                context.getSharedPreferences(zzc(str), 0).edit().remove("StorageCryptoKeyset").apply();
                try {
                    return zzb(context, str);
                } catch (IOException | GeneralSecurityException e2) {
                    Log.e("FirebearStorageCryptoHelper", "Exception encountered during second attempt to crypto setup:\n" + e2.getMessage());
                    return null;
                }
            }
            return null;
        }
    }

    @hib
    public final String zza(@efb String str) {
        String str2;
        Preconditions.checkNotNull(str);
        zzmy zzmyVar = this.f45966b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzba) this.f45966b.zza().zza(zzco.zza(), zzba.class)).zza(Base64.decode(str, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e.getMessage());
            return null;
        }
    }

    @hib
    public final String zzb(@efb String str) {
        String strEncodeToString;
        Preconditions.checkNotNull(str);
        zzmy zzmyVar = this.f45966b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                strEncodeToString = Base64.encodeToString(((zzba) this.f45966b.zza().zza(zzco.zza(), zzba.class)).zzb(str.getBytes(StandardCharsets.UTF_8), null), 2);
            }
            return strEncodeToString;
        } catch (GeneralSecurityException e) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e.getMessage());
            return null;
        }
    }

    private static String zzc(String str) {
        return String.format("com.google.firebase.auth.api.crypto.%s", str);
    }
}
