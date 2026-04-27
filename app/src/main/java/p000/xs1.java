package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p000.c42;
import p000.cg5;
import p000.di9;
import p000.gbb;
import p000.ni9;
import p000.wi2;
import p000.xs1;

/* JADX INFO: loaded from: classes4.dex */
public final class xs1 implements bhh {

    /* JADX INFO: renamed from: A */
    public static final String f99097A = "fingerprint";

    /* JADX INFO: renamed from: B */
    public static final String f99098B = "locale";

    /* JADX INFO: renamed from: C */
    public static final String f99099C = "country";

    /* JADX INFO: renamed from: D */
    public static final String f99100D = "mcc_mnc";

    /* JADX INFO: renamed from: E */
    public static final String f99101E = "tz-offset";

    /* JADX INFO: renamed from: F */
    public static final String f99102F = "application_build";

    /* JADX INFO: renamed from: h */
    public static final String f99103h = "CctTransportBackend";

    /* JADX INFO: renamed from: i */
    public static final int f99104i = 30000;

    /* JADX INFO: renamed from: j */
    public static final int f99105j = 130000;

    /* JADX INFO: renamed from: k */
    public static final int f99106k = -1;

    /* JADX INFO: renamed from: l */
    public static final String f99107l = "Accept-Encoding";

    /* JADX INFO: renamed from: m */
    public static final String f99108m = "Content-Encoding";

    /* JADX INFO: renamed from: n */
    public static final String f99109n = "gzip";

    /* JADX INFO: renamed from: o */
    public static final String f99110o = "Content-Type";

    /* JADX INFO: renamed from: p */
    public static final String f99111p = "X-Goog-Api-Key";

    /* JADX INFO: renamed from: q */
    public static final String f99112q = "application/json";

    /* JADX INFO: renamed from: r */
    @fdi
    public static final String f99113r = "net-type";

    /* JADX INFO: renamed from: s */
    @fdi
    public static final String f99114s = "mobile-subtype";

    /* JADX INFO: renamed from: t */
    public static final String f99115t = "sdk-version";

    /* JADX INFO: renamed from: u */
    public static final String f99116u = "model";

    /* JADX INFO: renamed from: v */
    public static final String f99117v = "hardware";

    /* JADX INFO: renamed from: w */
    public static final String f99118w = "device";

    /* JADX INFO: renamed from: x */
    public static final String f99119x = "product";

    /* JADX INFO: renamed from: y */
    public static final String f99120y = "os-uild";

    /* JADX INFO: renamed from: z */
    public static final String f99121z = "manufacturer";

    /* JADX INFO: renamed from: a */
    public final zf3 f99122a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f99123b;

    /* JADX INFO: renamed from: c */
    public final Context f99124c;

    /* JADX INFO: renamed from: d */
    public final URL f99125d;

    /* JADX INFO: renamed from: e */
    public final g52 f99126e;

    /* JADX INFO: renamed from: f */
    public final g52 f99127f;

    /* JADX INFO: renamed from: g */
    public final int f99128g;

    /* JADX INFO: renamed from: xs1$a */
    public static final class C15266a {

        /* JADX INFO: renamed from: a */
        public final URL f99129a;

        /* JADX INFO: renamed from: b */
        public final ax0 f99130b;

        /* JADX INFO: renamed from: c */
        @hib
        public final String f99131c;

        public C15266a(URL url, ax0 ax0Var, @hib String str) {
            this.f99129a = url;
            this.f99130b = ax0Var;
            this.f99131c = str;
        }

        /* JADX INFO: renamed from: a */
        public C15266a m25429a(URL url) {
            return new C15266a(url, this.f99130b, this.f99131c);
        }
    }

    /* JADX INFO: renamed from: xs1$b */
    public static final class C15267b {

        /* JADX INFO: renamed from: a */
        public final int f99132a;

        /* JADX INFO: renamed from: b */
        @hib
        public final URL f99133b;

        /* JADX INFO: renamed from: c */
        public final long f99134c;

        public C15267b(int i, @hib URL url, long j) {
            this.f99132a = i;
            this.f99133b = url;
            this.f99134c = j;
        }
    }

    public xs1(Context context, g52 g52Var, g52 g52Var2, int i) {
        this.f99122a = ax0.createDataEncoder();
        this.f99124c = context;
        this.f99123b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f99125d = parseUrlOrThrow(nk1.f64792d);
        this.f99126e = g52Var2;
        this.f99127f = g52Var;
        this.f99128g = i;
    }

    @fdi
    /* JADX INFO: renamed from: c */
    public static long m25428c() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C15267b doSend(C15266a c15266a) throws IOException {
        tj9.m22697i(f99103h, "Making request to: %s", c15266a.f99129a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) c15266a.f99129a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f99128g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c15266a.f99131c;
        if (str != null) {
            httpURLConnection.setRequestProperty(f99111p, str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f99122a.encode(c15266a.f99130b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    tj9.m22697i(f99103h, "Status Code: %d", Integer.valueOf(responseCode));
                    tj9.m22693d(f99103h, "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    tj9.m22693d(f99103h, "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C15267b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C15267b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamMaybeUnGzip = maybeUnGzip(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            C15267b c15267b = new C15267b(responseCode, null, oi9.fromJson(new BufferedReader(new InputStreamReader(inputStreamMaybeUnGzip))).getNextRequestWaitMillis());
                            if (inputStreamMaybeUnGzip != null) {
                                inputStreamMaybeUnGzip.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c15267b;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e) {
            e = e;
            tj9.m22696e(f99103h, "Couldn't open connection, returning with 500", e);
            return new C15267b(500, null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            tj9.m22696e(f99103h, "Couldn't open connection, returning with 500", e);
            return new C15267b(500, null, 0L);
        } catch (IOException e3) {
            e = e3;
            tj9.m22696e(f99103h, "Couldn't encode request, returning with 400", e);
            return new C15267b(400, null, 0L);
        } catch (t15 e4) {
            e = e4;
            tj9.m22696e(f99103h, "Couldn't encode request, returning with 400", e);
            return new C15267b(400, null, 0L);
        }
    }

    private static String getMccMncOrEmpty(Context context) {
        String simOperator = getTelephonyManager(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int getNetSubtypeValue(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return gbb.EnumC6201b.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return gbb.EnumC6201b.COMBINED.getValue();
        }
        if (gbb.EnumC6201b.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int getNetTypeValue(NetworkInfo networkInfo) {
        return networkInfo == null ? gbb.EnumC6202c.NONE.getValue() : networkInfo.getType();
    }

    private static int getPackageVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            tj9.m22696e(f99103h, "Unable to find version code for package", e);
            return -1;
        }
    }

    private ax0 getRequestBody(wn0 wn0Var) {
        di9.AbstractC4796a abstractC4796aProtoBuilder;
        HashMap map = new HashMap();
        for (a65 a65Var : wn0Var.getEvents()) {
            String transportName = a65Var.getTransportName();
            if (map.containsKey(transportName)) {
                ((List) map.get(transportName)).add(a65Var);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a65Var);
                map.put(transportName, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            a65 a65Var2 = (a65) ((List) entry.getValue()).get(0);
            ni9.AbstractC9892a clientInfo = ni9.builder().setQosTier(lkd.DEFAULT).setRequestTimeMs(this.f99127f.getTime()).setRequestUptimeMs(this.f99126e.getTime()).setClientInfo(c42.builder().setClientType(c42.EnumC2200b.ANDROID_FIREBASE).setAndroidClientInfo(AbstractC6463gq.builder().setSdkVersion(Integer.valueOf(a65Var2.getInteger(f99115t))).setModel(a65Var2.get("model")).setHardware(a65Var2.get(f99117v)).setDevice(a65Var2.get(f99118w)).setProduct(a65Var2.get(f99119x)).setOsBuild(a65Var2.get(f99120y)).setManufacturer(a65Var2.get(f99121z)).setFingerprint(a65Var2.get(f99097A)).setCountry(a65Var2.get(f99099C)).setLocale(a65Var2.get(f99098B)).setMccMnc(a65Var2.get(f99100D)).setApplicationBuild(a65Var2.get(f99102F)).build()).build());
            try {
                clientInfo.setSource(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                clientInfo.setSource((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (a65 a65Var3 : (List) entry.getValue()) {
                k15 encodedPayload = a65Var3.getEncodedPayload();
                q15 encoding = encodedPayload.getEncoding();
                if (encoding.equals(q15.m19986of("proto"))) {
                    abstractC4796aProtoBuilder = di9.protoBuilder(encodedPayload.getBytes());
                } else if (encoding.equals(q15.m19986of("json"))) {
                    abstractC4796aProtoBuilder = di9.jsonBuilder(new String(encodedPayload.getBytes(), Charset.forName("UTF-8")));
                } else {
                    tj9.m22698w(f99103h, "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                abstractC4796aProtoBuilder.setEventTimeMs(a65Var3.getEventMillis()).setEventUptimeMs(a65Var3.getUptimeMillis()).setTimezoneOffsetSeconds(a65Var3.getLong(f99101E)).setNetworkConnectionInfo(gbb.builder().setNetworkType(gbb.EnumC6202c.forNumber(a65Var3.getInteger(f99113r))).setMobileSubtype(gbb.EnumC6201b.forNumber(a65Var3.getInteger(f99114s))).build());
                if (a65Var3.getCode() != null) {
                    abstractC4796aProtoBuilder.setEventCode(a65Var3.getCode());
                }
                if (a65Var3.getProductId() != null) {
                    abstractC4796aProtoBuilder.setComplianceData(wi2.builder().setPrivacyContext(mj5.builder().setPrequest(kj5.builder().setOriginAssociatedProductId(a65Var3.getProductId()).build()).build()).setProductIdOrigin(wi2.EnumC14614b.EVENT_OVERRIDE).build());
                }
                if (a65Var3.getExperimentIdsClear() != null || a65Var3.getExperimentIdsEncrypted() != null) {
                    cg5.AbstractC2303a abstractC2303aBuilder = cg5.builder();
                    if (a65Var3.getExperimentIdsClear() != null) {
                        abstractC2303aBuilder.setClearBlob(a65Var3.getExperimentIdsClear());
                    }
                    if (a65Var3.getExperimentIdsEncrypted() != null) {
                        abstractC2303aBuilder.setEncryptedBlob(a65Var3.getExperimentIdsEncrypted());
                    }
                    abstractC4796aProtoBuilder.setExperimentIds(abstractC2303aBuilder.build());
                }
                arrayList3.add(abstractC4796aProtoBuilder.build());
            }
            clientInfo.setLogEvents(arrayList3);
            arrayList2.add(clientInfo.build());
        }
        return ax0.create(arrayList2);
    }

    private static TelephonyManager getTelephonyManager(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C15266a lambda$send$0(C15266a c15266a, C15267b c15267b) {
        URL url = c15267b.f99133b;
        if (url == null) {
            return null;
        }
        tj9.m22693d(f99103h, "Following redirect to: %s", url);
        return c15266a.m25429a(c15267b.f99133b);
    }

    private static InputStream maybeUnGzip(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL parseUrlOrThrow(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // p000.bhh
    public a65 decorate(a65 a65Var) {
        NetworkInfo activeNetworkInfo = this.f99123b.getActiveNetworkInfo();
        return a65Var.toBuilder().addMetadata(f99115t, Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata(f99117v, Build.HARDWARE).addMetadata(f99118w, Build.DEVICE).addMetadata(f99119x, Build.PRODUCT).addMetadata(f99120y, Build.ID).addMetadata(f99121z, Build.MANUFACTURER).addMetadata(f99097A, Build.FINGERPRINT).addMetadata(f99101E, m25428c()).addMetadata(f99113r, getNetTypeValue(activeNetworkInfo)).addMetadata(f99114s, getNetSubtypeValue(activeNetworkInfo)).addMetadata(f99099C, Locale.getDefault().getCountry()).addMetadata(f99098B, Locale.getDefault().getLanguage()).addMetadata(f99100D, getMccMncOrEmpty(this.f99124c)).addMetadata(f99102F, Integer.toString(getPackageVersionCode(this.f99124c))).build();
    }

    @Override // p000.bhh
    public xn0 send(wn0 wn0Var) {
        ax0 requestBody = getRequestBody(wn0Var);
        URL urlOrThrow = this.f99125d;
        if (wn0Var.getExtras() != null) {
            try {
                nk1 nk1VarFromByteArray = nk1.fromByteArray(wn0Var.getExtras());
                aPIKey = nk1VarFromByteArray.getAPIKey() != null ? nk1VarFromByteArray.getAPIKey() : null;
                if (nk1VarFromByteArray.getEndPoint() != null) {
                    urlOrThrow = parseUrlOrThrow(nk1VarFromByteArray.getEndPoint());
                }
            } catch (IllegalArgumentException unused) {
                return xn0.fatalError();
            }
        }
        try {
            C15267b c15267b = (C15267b) k8e.retry(5, new C15266a(urlOrThrow, requestBody, aPIKey), new hz6() { // from class: vs1
                @Override // p000.hz6
                public final Object apply(Object obj) {
                    return this.f92114a.doSend((xs1.C15266a) obj);
                }
            }, new w8e() { // from class: ws1
                @Override // p000.w8e
                public final Object shouldRetry(Object obj, Object obj2) {
                    return xs1.lambda$send$0((xs1.C15266a) obj, (xs1.C15267b) obj2);
                }
            });
            int i = c15267b.f99132a;
            if (i == 200) {
                return xn0.m25330ok(c15267b.f99134c);
            }
            if (i < 500 && i != 404) {
                return i == 400 ? xn0.invalidPayload() : xn0.fatalError();
            }
            return xn0.transientError();
        } catch (IOException e) {
            tj9.m22696e(f99103h, "Could not make request to the backend", e);
            return xn0.transientError();
        }
    }

    public xs1(Context context, g52 g52Var, g52 g52Var2) {
        this(context, g52Var, g52Var2, f99105j);
    }
}
