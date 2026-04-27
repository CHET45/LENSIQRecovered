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

/* JADX INFO: loaded from: classes3.dex */
public class kyc extends Exception {

    /* JADX INFO: renamed from: A2 */
    public static final int f55642A2 = 6001;

    /* JADX INFO: renamed from: B2 */
    public static final int f55643B2 = 6002;

    /* JADX INFO: renamed from: C */
    public static final int f55644C = -100;

    /* JADX INFO: renamed from: C2 */
    public static final int f55645C2 = 6003;

    /* JADX INFO: renamed from: D2 */
    public static final int f55646D2 = 6004;

    /* JADX INFO: renamed from: E2 */
    public static final int f55647E2 = 6005;

    /* JADX INFO: renamed from: F */
    public static final int f55648F = -102;

    /* JADX INFO: renamed from: F2 */
    public static final int f55649F2 = 6006;

    /* JADX INFO: renamed from: G2 */
    public static final int f55650G2 = 6007;

    /* JADX INFO: renamed from: H */
    public static final int f55651H = -103;

    /* JADX INFO: renamed from: H2 */
    public static final int f55652H2 = 6008;

    /* JADX INFO: renamed from: I2 */
    @ovh
    public static final int f55653I2 = 7000;

    /* JADX INFO: renamed from: J2 */
    @ovh
    public static final int f55654J2 = 7001;

    /* JADX INFO: renamed from: K2 */
    public static final int f55655K2 = 1000000;

    /* JADX INFO: renamed from: L */
    public static final int f55656L = -104;

    /* JADX INFO: renamed from: M */
    public static final int f55658M = -105;

    /* JADX INFO: renamed from: M1 */
    public static final int f55659M1 = 1000;

    /* JADX INFO: renamed from: N */
    public static final int f55661N = -106;

    /* JADX INFO: renamed from: Q */
    public static final int f55665Q = -107;

    /* JADX INFO: renamed from: R2 */
    @ovh
    public static final int f55667R2 = 1000;

    /* JADX INFO: renamed from: V1 */
    public static final int f55668V1 = 1001;

    /* JADX INFO: renamed from: X */
    public static final int f55669X = -108;

    /* JADX INFO: renamed from: Y */
    public static final int f55670Y = -109;

    /* JADX INFO: renamed from: Z */
    public static final int f55671Z = -110;

    /* JADX INFO: renamed from: Z1 */
    public static final int f55672Z1 = 1002;

    /* JADX INFO: renamed from: a2 */
    public static final int f55673a2 = 1003;

    /* JADX INFO: renamed from: b2 */
    public static final int f55674b2 = 1004;

    /* JADX INFO: renamed from: c2 */
    public static final int f55675c2 = 2000;

    /* JADX INFO: renamed from: d */
    public static final int f55676d = -2;

    /* JADX INFO: renamed from: d2 */
    public static final int f55677d2 = 2001;

    /* JADX INFO: renamed from: e */
    public static final int f55678e = -3;

    /* JADX INFO: renamed from: e2 */
    public static final int f55679e2 = 2002;

    /* JADX INFO: renamed from: f */
    public static final int f55680f = -4;

    /* JADX INFO: renamed from: f2 */
    public static final int f55681f2 = 2003;

    /* JADX INFO: renamed from: g2 */
    public static final int f55682g2 = 2004;

    /* JADX INFO: renamed from: h2 */
    public static final int f55683h2 = 2005;

    /* JADX INFO: renamed from: i2 */
    public static final int f55684i2 = 2006;

    /* JADX INFO: renamed from: j2 */
    public static final int f55685j2 = 2007;

    /* JADX INFO: renamed from: k2 */
    public static final int f55686k2 = 2008;

    /* JADX INFO: renamed from: l2 */
    public static final int f55687l2 = 3001;

    /* JADX INFO: renamed from: m */
    public static final int f55688m = -6;

    /* JADX INFO: renamed from: m2 */
    public static final int f55689m2 = 3002;

    /* JADX INFO: renamed from: n2 */
    public static final int f55690n2 = 3003;

    /* JADX INFO: renamed from: o2 */
    public static final int f55691o2 = 3004;

    /* JADX INFO: renamed from: p2 */
    public static final int f55692p2 = 4001;

    /* JADX INFO: renamed from: q2 */
    public static final int f55693q2 = 4002;

    /* JADX INFO: renamed from: r2 */
    public static final int f55694r2 = 4003;

    /* JADX INFO: renamed from: s2 */
    public static final int f55695s2 = 4004;

    /* JADX INFO: renamed from: t2 */
    public static final int f55696t2 = 4005;

    /* JADX INFO: renamed from: u2 */
    public static final int f55697u2 = 4006;

    /* JADX INFO: renamed from: v2 */
    public static final int f55698v2 = 5001;

    /* JADX INFO: renamed from: w2 */
    public static final int f55699w2 = 5002;

    /* JADX INFO: renamed from: x2 */
    public static final int f55700x2 = 5003;

    /* JADX INFO: renamed from: y2 */
    public static final int f55701y2 = 5004;

    /* JADX INFO: renamed from: z2 */
    public static final int f55702z2 = 6000;

    /* JADX INFO: renamed from: a */
    public final int f55703a;

    /* JADX INFO: renamed from: b */
    public final long f55704b;

    /* JADX INFO: renamed from: c */
    @ovh
    public final Bundle f55705c;

    /* JADX INFO: renamed from: L2 */
    public static final String f55657L2 = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: M2 */
    public static final String f55660M2 = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: N2 */
    public static final String f55662N2 = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: O2 */
    public static final String f55663O2 = t0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: P2 */
    public static final String f55664P2 = t0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: Q2 */
    public static final String f55666Q2 = t0i.intToStringMaxRadix(5);

    /* JADX INFO: renamed from: kyc$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8558a {
    }

    @ovh
    public kyc(@hib String str, @hib Throwable th, int i) {
        this(str, th, i, Bundle.EMPTY, j52.f49539a.elapsedRealtime());
    }

    @ovh
    public static boolean areErrorInfosEqual(@hib kyc kycVar, @hib kyc kycVar2) {
        return kycVar != null ? kycVar.errorInfoEquals(kycVar2) : kycVar2 == null;
    }

    private static RemoteException createRemoteException(@hib String str) {
        return new RemoteException(str);
    }

    private static Throwable createThrowable(Class<?> cls, @hib String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    @ovh
    public static kyc fromBundle(Bundle bundle) {
        return new kyc(bundle);
    }

    @hib
    private static Throwable getCauseFromBundle(Bundle bundle) {
        String string = bundle.getString(f55663O2);
        String string2 = bundle.getString(f55664P2);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, kyc.class.getClassLoader());
            Throwable thCreateThrowable = Throwable.class.isAssignableFrom(cls) ? createThrowable(cls, string2) : null;
            if (thCreateThrowable != null) {
                return thCreateThrowable;
            }
        } catch (Throwable unused) {
        }
        return createRemoteException(string2);
    }

    public static String getErrorCodeName(int i) {
        if (i == -100) {
            return "ERROR_CODE_DISCONNECTED";
        }
        if (i == -6) {
            return "ERROR_CODE_NOT_SUPPORTED";
        }
        if (i == -4) {
            return "ERROR_CODE_PERMISSION_DENIED";
        }
        if (i == -3) {
            return "ERROR_CODE_BAD_VALUE";
        }
        if (i == -2) {
            return "ERROR_CODE_INVALID_STATE";
        }
        if (i == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i) {
            case -110:
                return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
            case f55670Y /* -109 */:
                return "ERROR_CODE_END_OF_PLAYLIST";
            case f55669X /* -108 */:
                return "ERROR_CODE_SETUP_REQUIRED";
            case f55665Q /* -107 */:
                return "ERROR_CODE_SKIP_LIMIT_REACHED";
            case f55661N /* -106 */:
                return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
            case f55658M /* -105 */:
                return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
            case f55656L /* -104 */:
                return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
            case f55651H /* -103 */:
                return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
            case f55648F /* -102 */:
                return "ERROR_CODE_AUTHENTICATION_EXPIRED";
            default:
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
                                            case f55697u2 /* 4006 */:
                                                return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                            default:
                                                switch (i) {
                                                    case 5001:
                                                        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                    case 5002:
                                                        return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                    case f55700x2 /* 5003 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                    case f55701y2 /* 5004 */:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
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
        }
    }

    private static Bundle getExtrasFromBundle(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f55666Q2);
        return bundle2 != null ? bundle2 : Bundle.EMPTY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r3 == null) goto L22;
     */
    @p000.un1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean errorInfoEquals(@p000.hib p000.kyc r7) {
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
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 != 0) goto L2d
            return r1
        L2d:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            return r1
        L3c:
            if (r2 != 0) goto L60
            if (r3 == 0) goto L41
            goto L60
        L41:
            int r2 = r6.f55703a
            int r3 = r7.f55703a
            if (r2 != r3) goto L5e
            java.lang.String r2 = r6.getMessage()
            java.lang.String r3 = r7.getMessage()
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L5e
            long r2 = r6.f55704b
            long r4 = r7.f55704b
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
        throw new UnsupportedOperationException("Method not decompiled: p000.kyc.errorInfoEquals(kyc):boolean");
    }

    @ovh
    @un1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f55657L2, this.f55703a);
        bundle.putLong(f55660M2, this.f55704b);
        bundle.putString(f55662N2, getMessage());
        bundle.putBundle(f55666Q2, this.f55705c);
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f55663O2, cause.getClass().getName());
            bundle.putString(f55664P2, cause.getMessage());
        }
        return bundle;
    }

    @ovh
    public kyc(@hib String str, @hib Throwable th, int i, Bundle bundle) {
        this(str, th, i, bundle, j52.f49539a.elapsedRealtime());
    }

    @ovh
    public kyc(Bundle bundle) {
        this(bundle.getString(f55662N2), getCauseFromBundle(bundle), bundle.getInt(f55657L2, 1000), getExtrasFromBundle(bundle), bundle.getLong(f55660M2, SystemClock.elapsedRealtime()));
    }

    @ovh
    public kyc(@hib String str, @hib Throwable th, int i, Bundle bundle, long j) {
        super(str, th);
        this.f55703a = i;
        this.f55705c = bundle;
        this.f55704b = j;
    }

    public final String getErrorCodeName() {
        return getErrorCodeName(this.f55703a);
    }
}
