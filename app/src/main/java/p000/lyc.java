package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class lyc extends Exception implements gh1 {

    /* JADX INFO: renamed from: C */
    public static final int f59213C = 2000;

    /* JADX INFO: renamed from: F */
    public static final int f59214F = 2001;

    /* JADX INFO: renamed from: H */
    public static final int f59215H = 2002;

    /* JADX INFO: renamed from: L */
    public static final int f59216L = 2003;

    /* JADX INFO: renamed from: M */
    public static final int f59217M = 2004;

    /* JADX INFO: renamed from: M1 */
    public static final int f59218M1 = 3002;

    /* JADX INFO: renamed from: N */
    public static final int f59219N = 2005;

    /* JADX INFO: renamed from: Q */
    public static final int f59220Q = 2006;

    /* JADX INFO: renamed from: V1 */
    public static final int f59221V1 = 3003;

    /* JADX INFO: renamed from: X */
    public static final int f59222X = 2007;

    /* JADX INFO: renamed from: Y */
    public static final int f59223Y = 2008;

    /* JADX INFO: renamed from: Z */
    public static final int f59224Z = 3001;

    /* JADX INFO: renamed from: Z1 */
    public static final int f59225Z1 = 3004;

    /* JADX INFO: renamed from: a2 */
    public static final int f59226a2 = 4001;

    /* JADX INFO: renamed from: b2 */
    public static final int f59227b2 = 4002;

    /* JADX INFO: renamed from: c */
    public static final int f59228c = 1000;

    /* JADX INFO: renamed from: c2 */
    public static final int f59229c2 = 4003;

    /* JADX INFO: renamed from: d */
    public static final int f59230d = 1001;

    /* JADX INFO: renamed from: d2 */
    public static final int f59231d2 = 4004;

    /* JADX INFO: renamed from: e */
    public static final int f59232e = 1002;

    /* JADX INFO: renamed from: e2 */
    public static final int f59233e2 = 4005;

    /* JADX INFO: renamed from: f */
    public static final int f59234f = 1003;

    /* JADX INFO: renamed from: f2 */
    public static final int f59235f2 = 5001;

    /* JADX INFO: renamed from: g2 */
    public static final int f59236g2 = 5002;

    /* JADX INFO: renamed from: h2 */
    public static final int f59237h2 = 6000;

    /* JADX INFO: renamed from: i2 */
    public static final int f59238i2 = 6001;

    /* JADX INFO: renamed from: j2 */
    public static final int f59239j2 = 6002;

    /* JADX INFO: renamed from: k2 */
    public static final int f59240k2 = 6003;

    /* JADX INFO: renamed from: l2 */
    public static final int f59241l2 = 6004;

    /* JADX INFO: renamed from: m */
    public static final int f59242m = 1004;

    /* JADX INFO: renamed from: m2 */
    public static final int f59243m2 = 6005;

    /* JADX INFO: renamed from: n2 */
    public static final int f59244n2 = 6006;

    /* JADX INFO: renamed from: o2 */
    public static final int f59245o2 = 6007;

    /* JADX INFO: renamed from: p2 */
    public static final int f59246p2 = 6008;

    /* JADX INFO: renamed from: q2 */
    public static final int f59247q2 = 7000;

    /* JADX INFO: renamed from: r2 */
    public static final int f59248r2 = 7001;

    /* JADX INFO: renamed from: s2 */
    public static final int f59249s2 = 1000000;

    /* JADX INFO: renamed from: y2 */
    public static final int f59255y2 = 1000;

    /* JADX INFO: renamed from: a */
    public final int f59257a;

    /* JADX INFO: renamed from: b */
    public final long f59258b;

    /* JADX INFO: renamed from: t2 */
    public static final String f59250t2 = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: u2 */
    public static final String f59251u2 = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: v2 */
    public static final String f59252v2 = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: w2 */
    public static final String f59253w2 = x0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: x2 */
    public static final String f59254x2 = x0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: z2 */
    public static final gh1.InterfaceC6311a<lyc> f59256z2 = new gh1.InterfaceC6311a() { // from class: jyc
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return new lyc(bundle);
        }
    };

    /* JADX INFO: renamed from: lyc$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9037a {
    }

    public lyc(@hib String str, @hib Throwable th, int i) {
        this(str, th, i, h52.f42390a.elapsedRealtime());
    }

    private static RemoteException createRemoteException(@hib String str) {
        return new RemoteException(str);
    }

    private static Throwable createThrowable(Class<?> cls, @hib String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    @hib
    private static Throwable getCauseFromBundle(Bundle bundle) {
        String string = bundle.getString(f59253w2);
        String string2 = bundle.getString(f59254x2);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, lyc.class.getClassLoader());
            Throwable thCreateThrowable = Throwable.class.isAssignableFrom(cls) ? createThrowable(cls, string2) : null;
            if (thCreateThrowable != null) {
                return thCreateThrowable;
            }
        } catch (Throwable unused) {
        }
        return createRemoteException(string2);
    }

    public static String getErrorCodeName(int i) {
        if (i == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        if (i == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case 1001:
                return "ERROR_CODE_REMOTE_ERROR";
            case 1002:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case 1003:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i) {
                    case 2000:
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    case 2001:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    case 2002:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    case 2003:
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    case 2004:
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    case 2005:
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    case 2006:
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    case 2007:
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    case 2008:
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    default:
                        switch (i) {
                            case 3001:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case 3003:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case 3004:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i) {
                                    case 4001:
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    case 4002:
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    case 4003:
                                        return "ERROR_CODE_DECODING_FAILED";
                                    case 4004:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case 4005:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    default:
                                        switch (i) {
                                            case 6000:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case 6001:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case 6002:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case 6003:
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            case 6004:
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            case 6005:
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            case 6006:
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            case 6007:
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            case 6008:
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            default:
                                                return i >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r3 == null) goto L22;
     */
    @p000.un1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean errorInfoEquals(@p000.hib p000.lyc r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L60
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L60
        L12:
            java.lang.Throwable r2 = r6.getCause()
            java.lang.Throwable r3 = r7.getCause()
            if (r2 == 0) goto L3c
            if (r3 == 0) goto L3c
            java.lang.String r4 = r2.getMessage()
            java.lang.String r5 = r3.getMessage()
            boolean r4 = p000.x0i.areEqual(r4, r5)
            if (r4 != 0) goto L2d
            return r1
        L2d:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            boolean r2 = p000.x0i.areEqual(r2, r3)
            if (r2 != 0) goto L41
            return r1
        L3c:
            if (r2 != 0) goto L60
            if (r3 == 0) goto L41
            goto L60
        L41:
            int r2 = r6.f59257a
            int r3 = r7.f59257a
            if (r2 != r3) goto L5e
            java.lang.String r2 = r6.getMessage()
            java.lang.String r3 = r7.getMessage()
            boolean r2 = p000.x0i.areEqual(r2, r3)
            if (r2 == 0) goto L5e
            long r2 = r6.f59258b
            long r4 = r7.f59258b
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L5e
            goto L5f
        L5e:
            r0 = r1
        L5f:
            return r0
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lyc.errorInfoEquals(lyc):boolean");
    }

    @un1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f59250t2, this.f59257a);
        bundle.putLong(f59251u2, this.f59258b);
        bundle.putString(f59252v2, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f59253w2, cause.getClass().getName());
            bundle.putString(f59254x2, cause.getMessage());
        }
        return bundle;
    }

    public lyc(Bundle bundle) {
        this(bundle.getString(f59252v2), getCauseFromBundle(bundle), bundle.getInt(f59250t2, 1000), bundle.getLong(f59251u2, SystemClock.elapsedRealtime()));
    }

    public lyc(@hib String str, @hib Throwable th, int i, long j) {
        super(str, th);
        this.f59257a = i;
        this.f59258b = j;
    }

    public final String getErrorCodeName() {
        return getErrorCodeName(this.f59257a);
    }
}
