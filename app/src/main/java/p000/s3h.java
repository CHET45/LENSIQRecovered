package p000;

import android.content.pm.PackageManager;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s3h {

    /* JADX INFO: renamed from: b */
    public static final String f80586b = "Token";

    /* JADX INFO: renamed from: a */
    @efb
    public final u3h f80587a;

    private s3h(@efb u3h u3hVar) {
        this.f80587a = u3hVar;
    }

    @hib
    public static s3h create(@efb String str, @efb PackageManager packageManager) {
        List<byte[]> listM14633b = kac.m14633b(str, packageManager);
        if (listM14633b == null) {
            return null;
        }
        try {
            return new s3h(u3h.m23091b(str, listM14633b));
        } catch (IOException e) {
            Log.e(f80586b, "Exception when creating token.", e);
            return null;
        }
    }

    @efb
    public static s3h deserialize(@efb byte[] bArr) {
        return new s3h(u3h.m23092c(bArr));
    }

    public boolean matches(@efb String str, @efb PackageManager packageManager) {
        return kac.m14634c(str, packageManager, this.f80587a);
    }

    @efb
    public byte[] serialize() {
        return this.f80587a.serialize();
    }
}
