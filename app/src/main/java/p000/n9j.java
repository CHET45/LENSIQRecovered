package p000;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p024firebaseauthapi.zzbc;
import com.google.android.gms.internal.p024firebaseauthapi.zzbd;
import com.google.android.gms.internal.p024firebaseauthapi.zzby;
import com.google.android.gms.internal.p024firebaseauthapi.zzks;
import com.google.android.gms.internal.p024firebaseauthapi.zzkt;
import com.google.android.gms.internal.p024firebaseauthapi.zzlh;
import com.google.android.gms.internal.p024firebaseauthapi.zzmy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class n9j {

    /* JADX INFO: renamed from: c */
    public static n9j f63766c;

    /* JADX INFO: renamed from: a */
    public final String f63767a;

    /* JADX INFO: renamed from: b */
    @hib
    public final zzmy f63768b;

    private n9j(Context context, String str, boolean z) {
        zzmy zzmyVarZza;
        this.f63767a = str;
        try {
            zzkt.zza();
            zzmy.zza zzaVarZza = new zzmy.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzlh.zza);
            zzaVarZza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmyVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e.getMessage());
            zzmyVarZza = null;
        }
        this.f63768b = zzmyVarZza;
    }

    public static n9j zza(Context context, String str) {
        n9j n9jVar = f63766c;
        if (n9jVar == null || !Objects.equals(n9jVar.f63767a, str)) {
            f63766c = new n9j(context, str, true);
        }
        return f63766c;
    }

    @hib
    public final String zza(String str) {
        String str2;
        zzmy zzmyVar = this.f63768b;
        if (zzmyVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbd) this.f63768b.zza().zza(zzks.zza(), zzbd.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e.getMessage());
            return null;
        }
    }

    @hib
    public final String zza() {
        if (this.f63768b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzby zzbyVarZza = zzbc.zza(byteArrayOutputStream);
        try {
            synchronized (this.f63768b) {
                this.f63768b.zza().zzb().zza(zzbyVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e.getMessage());
            return null;
        }
    }
}
