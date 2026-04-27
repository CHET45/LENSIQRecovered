package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p000.g1c;
import p000.j58;
import p000.v3h;
import p000.vy5;

/* JADX INFO: loaded from: classes5.dex */
public class ny5 {

    /* JADX INFO: renamed from: A */
    public static final String f66004A = "x-goog-api-key";

    /* JADX INFO: renamed from: B */
    public static final int f66005B = 10000;

    /* JADX INFO: renamed from: D */
    public static final int f66007D = 1;

    /* JADX INFO: renamed from: F */
    public static final String f66009F = "a:";

    /* JADX INFO: renamed from: G */
    public static final String f66010G = "Firebase-Installations";

    /* JADX INFO: renamed from: H */
    @fdi
    public static final String f66011H = "Invalid Expiration Timestamp.";

    /* JADX INFO: renamed from: e */
    public static final int f66012e = 32768;

    /* JADX INFO: renamed from: f */
    public static final int f66013f = 32769;

    /* JADX INFO: renamed from: g */
    public static final int f66014g = 32770;

    /* JADX INFO: renamed from: h */
    public static final int f66015h = 32771;

    /* JADX INFO: renamed from: i */
    public static final String f66016i = "firebaseinstallations.googleapis.com";

    /* JADX INFO: renamed from: j */
    public static final String f66017j = "projects/%s/installations";

    /* JADX INFO: renamed from: k */
    public static final String f66018k = "projects/%s/installations/%s/authTokens:generate";

    /* JADX INFO: renamed from: l */
    public static final String f66019l = "projects/%s/installations/%s";

    /* JADX INFO: renamed from: m */
    public static final String f66020m = "v1";

    /* JADX INFO: renamed from: n */
    public static final String f66021n = "FIS_v2";

    /* JADX INFO: renamed from: o */
    public static final String f66022o = "Content-Type";

    /* JADX INFO: renamed from: p */
    public static final String f66023p = "Accept";

    /* JADX INFO: renamed from: q */
    public static final String f66024q = "application/json";

    /* JADX INFO: renamed from: r */
    public static final String f66025r = "Content-Encoding";

    /* JADX INFO: renamed from: s */
    public static final String f66026s = "gzip";

    /* JADX INFO: renamed from: t */
    public static final String f66027t = "Cache-Control";

    /* JADX INFO: renamed from: u */
    public static final String f66028u = "no-cache";

    /* JADX INFO: renamed from: v */
    public static final String f66029v = "fire-installations-id";

    /* JADX INFO: renamed from: w */
    public static final String f66030w = "x-firebase-client";

    /* JADX INFO: renamed from: x */
    public static final String f66031x = "X-Android-Package";

    /* JADX INFO: renamed from: y */
    public static final String f66032y = "X-Android-Cert";

    /* JADX INFO: renamed from: z */
    public static final String f66033z = "x-goog-fis-android-iid-migration-auth";

    /* JADX INFO: renamed from: a */
    public boolean f66034a;

    /* JADX INFO: renamed from: b */
    public final Context f66035b;

    /* JADX INFO: renamed from: c */
    public final eid<wi7> f66036c;

    /* JADX INFO: renamed from: d */
    public final d4e f66037d = new d4e();

    /* JADX INFO: renamed from: C */
    public static final Pattern f66006C = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: E */
    public static final Charset f66008E = Charset.forName("UTF-8");

    public ny5(@efb Context context, @efb eid<wi7> eidVar) {
        this.f66035b = context;
        this.f66036c = eidVar;
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public static long m18202a(String str) {
        Preconditions.checkArgument(f66006C.matcher(str).matches(), f66011H);
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static String availableFirebaseOptions(@hib String str, @efb String str2, @efb String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static JSONObject buildCreateFirebaseInstallationRequestBody(@hib String str, @efb String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", f66021n);
            jSONObject.put("sdkVersion", "a:19.0.1");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private static JSONObject buildGenerateAuthTokenRequestBody() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private String getFingerprintHashForPackage() {
        try {
            Context context = this.f66035b;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f66035b.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f66035b.getPackageName(), e);
            return null;
        }
    }

    private URL getFullyQualifiedRequestUri(String str) throws vy5 {
        try {
            return new URL(String.format("https://%s/%s/%s", f66016i, f66020m, str));
        } catch (MalformedURLException e) {
            throw new vy5(e.getMessage(), vy5.EnumC14299a.UNAVAILABLE);
        }
    }

    private static byte[] getJsonBytes(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean isSuccessfulResponseCode(int i) {
        return i >= 200 && i < 300;
    }

    private static void logBadConfigError() {
        Log.e(f66010G, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void logFisCommunicationError(HttpURLConnection httpURLConnection, @hib String str, @efb String str2, @efb String str3) {
        String errorResponse = readErrorResponse(httpURLConnection);
        if (TextUtils.isEmpty(errorResponse)) {
            return;
        }
        Log.w(f66010G, errorResponse);
        Log.w(f66010G, availableFirebaseOptions(str, str2, str3));
    }

    private HttpURLConnection openHttpURLConnection(URL url, String str) throws vy5 {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", f66028u);
            httpURLConnection.addRequestProperty(f66031x, this.f66035b.getPackageName());
            wi7 wi7Var = this.f66036c.get();
            if (wi7Var != null) {
                try {
                    httpURLConnection.addRequestProperty(f66030w, (String) Tasks.await(wi7Var.getHeartBeatsHeader()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            httpURLConnection.addRequestProperty(f66032y, getFingerprintHashForPackage());
            httpURLConnection.addRequestProperty(f66004A, str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new vy5("Firebase Installations Service is unavailable. Please try again later.", vy5.EnumC14299a.UNAVAILABLE);
        }
    }

    private j58 readCreateResponse(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f66008E));
        v3h.AbstractC13855a abstractC13855aBuilder = v3h.builder();
        j58.AbstractC7740a abstractC7740aBuilder = j58.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                abstractC7740aBuilder.setUri(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                abstractC7740aBuilder.setFid(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                abstractC7740aBuilder.setRefreshToken(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals(es7.f33959h)) {
                        abstractC13855aBuilder.setToken(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        abstractC13855aBuilder.setTokenExpirationTimestamp(m18202a(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                abstractC7740aBuilder.setAuthToken(abstractC13855aBuilder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return abstractC7740aBuilder.setResponseCode(j58.EnumC7741b.OK).build();
    }

    @hib
    private static String readErrorResponse(HttpURLConnection httpURLConnection) {
        StringBuilder sb;
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f66008E));
        try {
            try {
                sb = new StringBuilder();
            } catch (IOException unused) {
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (IOException unused3) {
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append('\n');
            return null;
        }
        String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        return str;
    }

    private v3h readGenerateAuthTokenResponse(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f66008E));
        v3h.AbstractC13855a abstractC13855aBuilder = v3h.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(es7.f33959h)) {
                abstractC13855aBuilder.setToken(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                abstractC13855aBuilder.setTokenExpirationTimestamp(m18202a(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return abstractC13855aBuilder.setResponseCode(v3h.EnumC13856b.OK).build();
    }

    private void writeFIDCreateRequestBodyToOutputStream(HttpURLConnection httpURLConnection, @hib String str, @efb String str2) throws IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(HttpURLConnection httpURLConnection) throws IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
    }

    private static void writeRequestBodyToOutputStream(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @efb
    public j58 createFirebaseInstallation(@efb String str, @hib String str2, @efb String str3, @efb String str4, @hib String str5) throws vy5 {
        int responseCode;
        j58 createResponse;
        if (!this.f66037d.isRequestAllowed()) {
            throw new vy5("Firebase Installations Service is unavailable. Please try again later.", vy5.EnumC14299a.UNAVAILABLE);
        }
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(f66017j, str3));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(f66013f);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                try {
                    httpURLConnectionOpenHttpURLConnection.setRequestMethod("POST");
                    httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionOpenHttpURLConnection.addRequestProperty(f66033z, str5);
                    }
                    writeFIDCreateRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection, str2, str4);
                    responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
                    this.f66037d.setNextRequestTime(responseCode);
                } catch (Throwable th) {
                    httpURLConnectionOpenHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (isSuccessfulResponseCode(responseCode)) {
                createResponse = readCreateResponse(httpURLConnectionOpenHttpURLConnection);
            } else {
                logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, str4, str, str3);
                if (responseCode == 429) {
                    throw new vy5("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", vy5.EnumC14299a.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    logBadConfigError();
                    createResponse = j58.builder().setResponseCode(j58.EnumC7741b.BAD_CONFIG).build();
                }
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            httpURLConnectionOpenHttpURLConnection.disconnect();
            TrafficStats.clearThreadStatsTag();
            return createResponse;
        }
        throw new vy5("Firebase Installations Service is unavailable. Please try again later.", vy5.EnumC14299a.UNAVAILABLE);
    }

    @efb
    public void deleteFirebaseInstallation(@efb String str, @efb String str2, @efb String str3, @efb String str4) throws vy5 {
        int responseCode;
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(f66019l, str3, str2));
        int i = 0;
        while (i <= 1) {
            TrafficStats.setThreadStatsTag(f66014g);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                httpURLConnectionOpenHttpURLConnection.setRequestMethod(g1c.C6087d.f38269b);
                httpURLConnectionOpenHttpURLConnection.addRequestProperty(go7.f40559n, "FIS_v2 " + str4);
                responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    logBadConfigError();
                    throw new vy5("Bad config while trying to delete FID", vy5.EnumC14299a.BAD_CONFIG);
                }
                i++;
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            httpURLConnectionOpenHttpURLConnection.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new vy5("Firebase Installations Service is unavailable. Please try again later.", vy5.EnumC14299a.UNAVAILABLE);
    }

    @efb
    public v3h generateAuthToken(@efb String str, @efb String str2, @efb String str3, @efb String str4) throws vy5 {
        int responseCode;
        v3h generateAuthTokenResponse;
        if (!this.f66037d.isRequestAllowed()) {
            throw new vy5("Firebase Installations Service is unavailable. Please try again later.", vy5.EnumC14299a.UNAVAILABLE);
        }
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(f66018k, str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                try {
                    httpURLConnectionOpenHttpURLConnection.setRequestMethod("POST");
                    httpURLConnectionOpenHttpURLConnection.addRequestProperty(go7.f40559n, "FIS_v2 " + str4);
                    httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
                    writeGenerateAuthTokenRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection);
                    responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
                    this.f66037d.setNextRequestTime(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (isSuccessfulResponseCode(responseCode)) {
                    generateAuthTokenResponse = readGenerateAuthTokenResponse(httpURLConnectionOpenHttpURLConnection);
                } else {
                    logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        generateAuthTokenResponse = v3h.builder().setResponseCode(v3h.EnumC13856b.AUTH_ERROR).build();
                    } else {
                        if (responseCode == 429) {
                            throw new vy5("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", vy5.EnumC14299a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            logBadConfigError();
                            generateAuthTokenResponse = v3h.builder().setResponseCode(v3h.EnumC13856b.BAD_CONFIG).build();
                        }
                    }
                }
                return generateAuthTokenResponse;
            } finally {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new vy5("Firebase Installations Service is unavailable. Please try again later.", vy5.EnumC14299a.UNAVAILABLE);
    }
}
