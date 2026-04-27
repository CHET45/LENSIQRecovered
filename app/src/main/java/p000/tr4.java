package p000;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;
import p000.dn7;
import p000.ju3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class tr4 {

    /* JADX INFO: renamed from: a */
    public static final int f85658a = 5;

    /* JADX INFO: renamed from: b */
    public static final int f85659b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f85660c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f85661d = 3;

    /* JADX INFO: renamed from: tr4$a */
    @c5e(23)
    public static final class C13173a {
        private C13173a() {
        }

        public static boolean isMediaDrmResetException(@hib Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* JADX INFO: renamed from: tr4$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13174b {
    }

    private tr4() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:11|22|12|(2:14|15)(2:27|17)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r1 = getRedirectUrl(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r8 = r8 + 1;
        r9 = r9.buildUpon().setUri(r1).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        p000.t0i.closeQuietly(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r8 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] executePost(p000.gh3 r8, java.lang.String r9, @p000.hib byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11) throws p000.afa {
        /*
            j4g r0 = new j4g
            r0.<init>(r8)
            xh3$b r8 = new xh3$b
            r8.<init>()
            xh3$b r8 = r8.setUri(r9)
            xh3$b r8 = r8.setHttpRequestHeaders(r11)
            r9 = 2
            xh3$b r8 = r8.setHttpMethod(r9)
            xh3$b r8 = r8.setHttpBody(r10)
            r9 = 1
            xh3$b r8 = r8.setFlags(r9)
            xh3 r2 = r8.build()
            r8 = 0
            r9 = r2
        L26:
            uh3 r10 = new uh3     // Catch: java.lang.Exception -> L33
            r10.<init>(r0, r9)     // Catch: java.lang.Exception -> L33
            byte[] r8 = p000.tj1.toByteArray(r10)     // Catch: java.lang.Throwable -> L36 p000.dn7.C4882f -> L38
            p000.t0i.closeQuietly(r10)     // Catch: java.lang.Exception -> L33
            return r8
        L33:
            r8 = move-exception
            r7 = r8
            goto L56
        L36:
            r8 = move-exception
            goto L52
        L38:
            r11 = move-exception
            java.lang.String r1 = getRedirectUrl(r11, r8)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L51
            int r8 = r8 + 1
            xh3$b r9 = r9.buildUpon()     // Catch: java.lang.Throwable -> L36
            xh3$b r9 = r9.setUri(r1)     // Catch: java.lang.Throwable -> L36
            xh3 r9 = r9.build()     // Catch: java.lang.Throwable -> L36
            p000.t0i.closeQuietly(r10)     // Catch: java.lang.Exception -> L33
            goto L26
        L51:
            throw r11     // Catch: java.lang.Throwable -> L36
        L52:
            p000.t0i.closeQuietly(r10)     // Catch: java.lang.Exception -> L33
            throw r8     // Catch: java.lang.Exception -> L33
        L56:
            afa r8 = new afa
            android.net.Uri r3 = r0.getLastOpenedUri()
            java.util.Map r4 = r0.getResponseHeaders()
            long r5 = r0.getBytesRead()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tr4.executePost(gh3, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public static int getErrorCodeForMediaDrmException(Throwable th, int i) {
        if (th instanceof MediaDrm.MediaDrmStateException) {
            return t0i.getErrorCodeForMediaDrmErrorCode(t0i.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
        if (C13173a.isMediaDrmResetException(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || isFailureToConstructNotProvisionedException(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof rvh) {
            return 6001;
        }
        if (th instanceof ju3.C8089e) {
            return 6003;
        }
        if (th instanceof qs8) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    @hib
    private static String getRedirectUrl(dn7.C4882f c4882f, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = c4882f.f30195C;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = c4882f.f30197H) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean isFailureToConstructNotProvisionedException(@hib Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean isFailureToConstructResourceBusyException(@hib Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
