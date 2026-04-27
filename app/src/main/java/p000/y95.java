package p000;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import androidx.media3.common.DrmInitData;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface y95 {

    /* JADX INFO: renamed from: a */
    @ovh
    public static final int f100839a = 2;

    /* JADX INFO: renamed from: b */
    @ovh
    public static final int f100840b = 3;

    /* JADX INFO: renamed from: c */
    @ovh
    public static final int f100841c = 1;

    /* JADX INFO: renamed from: d */
    @ovh
    public static final int f100842d = 1;

    /* JADX INFO: renamed from: e */
    @ovh
    public static final int f100843e = 2;

    /* JADX INFO: renamed from: f */
    @ovh
    public static final int f100844f = 3;

    /* JADX INFO: renamed from: y95$a */
    public static final class C15569a implements InterfaceC15575g {

        /* JADX INFO: renamed from: a */
        public final y95 f100845a;

        public C15569a(y95 y95Var) {
            this.f100845a = y95Var;
        }

        @Override // p000.y95.InterfaceC15575g
        public y95 acquireExoMediaDrm(UUID uuid) {
            this.f100845a.acquire();
            return this.f100845a;
        }
    }

    /* JADX INFO: renamed from: y95$b */
    public static final class C15570b {

        /* JADX INFO: renamed from: d */
        public static final int f100846d = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: e */
        public static final int f100847e = 0;

        /* JADX INFO: renamed from: f */
        public static final int f100848f = 1;

        /* JADX INFO: renamed from: g */
        public static final int f100849g = 2;

        /* JADX INFO: renamed from: h */
        public static final int f100850h = 3;

        /* JADX INFO: renamed from: i */
        public static final int f100851i = 4;

        /* JADX INFO: renamed from: a */
        public final byte[] f100852a;

        /* JADX INFO: renamed from: b */
        public final String f100853b;

        /* JADX INFO: renamed from: c */
        public final int f100854c;

        /* JADX INFO: renamed from: y95$b$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public C15570b(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }

        public byte[] getData() {
            return this.f100852a;
        }

        public String getLicenseServerUrl() {
            return this.f100853b;
        }

        public int getRequestType() {
            return this.f100854c;
        }

        public C15570b(byte[] bArr, String str, int i) {
            this.f100852a = bArr;
            this.f100853b = str;
            this.f100854c = i;
        }
    }

    /* JADX INFO: renamed from: y95$c */
    public static final class C15571c {

        /* JADX INFO: renamed from: a */
        public final int f100855a;

        /* JADX INFO: renamed from: b */
        public final byte[] f100856b;

        public C15571c(int i, byte[] bArr) {
            this.f100855a = i;
            this.f100856b = bArr;
        }

        public byte[] getKeyId() {
            return this.f100856b;
        }

        public int getStatusCode() {
            return this.f100855a;
        }
    }

    /* JADX INFO: renamed from: y95$d */
    public interface InterfaceC15572d {
        void onEvent(y95 y95Var, @hib byte[] bArr, int i, int i2, @hib byte[] bArr2);
    }

    /* JADX INFO: renamed from: y95$e */
    public interface InterfaceC15573e {
        void onExpirationUpdate(y95 y95Var, byte[] bArr, long j);
    }

    /* JADX INFO: renamed from: y95$f */
    public interface InterfaceC15574f {
        void onKeyStatusChange(y95 y95Var, byte[] bArr, List<C15571c> list, boolean z);
    }

    /* JADX INFO: renamed from: y95$g */
    public interface InterfaceC15575g {
        y95 acquireExoMediaDrm(UUID uuid);
    }

    /* JADX INFO: renamed from: y95$h */
    public static final class C15576h {

        /* JADX INFO: renamed from: a */
        public final byte[] f100857a;

        /* JADX INFO: renamed from: b */
        public final String f100858b;

        public C15576h(byte[] bArr, String str) {
            this.f100857a = bArr;
            this.f100858b = str;
        }

        public byte[] getData() {
            return this.f100857a;
        }

        public String getDefaultUrl() {
            return this.f100858b;
        }
    }

    void acquire();

    void closeSession(byte[] bArr);

    c93 createCryptoConfig(byte[] bArr) throws MediaCryptoException;

    int getCryptoType();

    C15570b getKeyRequest(byte[] bArr, @hib List<DrmInitData.SchemeData> list, int i, @hib HashMap<String, String> map) throws NotProvisionedException;

    @hib
    PersistableBundle getMetrics();

    default List<byte[]> getOfflineLicenseKeySetIds() {
        throw new UnsupportedOperationException();
    }

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    C15576h getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    @hib
    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    default void removeOfflineLicense(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    boolean requiresSecureDecoder(byte[] bArr, String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(@hib InterfaceC15572d interfaceC15572d);

    void setOnExpirationUpdateListener(@hib InterfaceC15573e interfaceC15573e);

    void setOnKeyStatusChangeListener(@hib InterfaceC15574f interfaceC15574f);

    default void setPlayerIdForSession(byte[] bArr, j0d j0dVar) {
    }

    void setPropertyByteArray(String str, byte[] bArr);

    void setPropertyString(String str, String str2);
}
