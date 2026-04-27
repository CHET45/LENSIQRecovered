package p000;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import p000.jvd;

/* JADX INFO: loaded from: classes5.dex */
@qpf
public final class pyd implements r43 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C11185a f72505c = new C11185a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f72506d = "firebase-settings.crashlytics.com";

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String f72507e = "android";

    /* JADX INFO: renamed from: a */
    @yfb
    public final k40 f72508a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final e13 f72509b;

    /* JADX INFO: renamed from: pyd$a */
    public static final class C11185a {
        public /* synthetic */ C11185a(jt3 jt3Var) {
            this();
        }

        private C11185a() {
        }
    }

    /* JADX INFO: renamed from: pyd$b */
    @ck3(m4009c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", m4010f = "RemoteSettingsFetcher.kt", m4011i = {}, m4012l = {73, 75, 78}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    @dwf({"SMAP\nRemoteSettingsFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettingsFetcher.kt\ncom/google/firebase/sessions/settings/RemoteSettingsFetcher$doConfigFetch$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n216#2,2:106\n1#3:108\n*S KotlinDebug\n*F\n+ 1 RemoteSettingsFetcher.kt\ncom/google/firebase/sessions/settings/RemoteSettingsFetcher$doConfigFetch$2\n*L\n58#1:106,2\n*E\n"})
    public static final class C11186b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f72510a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map<String, String> f72512c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<JSONObject, zy2<? super bth>, Object> f72513d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gz6<String, zy2<? super bth>, Object> f72514e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11186b(Map<String, String> map, gz6<? super JSONObject, ? super zy2<? super bth>, ? extends Object> gz6Var, gz6<? super String, ? super zy2<? super bth>, ? extends Object> gz6Var2, zy2<? super C11186b> zy2Var) {
            super(2, zy2Var);
            this.f72512c = map;
            this.f72513d = gz6Var;
            this.f72514e = gz6Var2;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            return pyd.this.new C11186b(this.f72512c, this.f72513d, this.f72514e, zy2Var);
        }

        @Override // p000.gz6
        public final Object invoke(x13 x13Var, zy2<? super bth> zy2Var) {
            return ((C11186b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f72510a;
            try {
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    URLConnection uRLConnectionOpenConnection = pyd.this.settingsUrl().openConnection();
                    md8.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry<String, String> entry : this.f72512c.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        jvd.C8121h c8121h = new jvd.C8121h();
                        while (true) {
                            ?? line = bufferedReader.readLine();
                            c8121h.f52110a = line;
                            if (line == 0) {
                                break;
                            }
                            sb.append((String) line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        gz6<JSONObject, zy2<? super bth>, Object> gz6Var = this.f72513d;
                        this.f72510a = 1;
                        if (gz6Var.invoke(jSONObject, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        gz6<String, zy2<? super bth>, Object> gz6Var2 = this.f72514e;
                        String str = "Bad response code: " + responseCode;
                        this.f72510a = 2;
                        if (gz6Var2.invoke(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
            } catch (Exception e) {
                gz6<String, zy2<? super bth>, Object> gz6Var3 = this.f72514e;
                String message = e.getMessage();
                if (message == null) {
                    message = e.toString();
                }
                this.f72510a = 3;
                if (gz6Var3.invoke(message, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return bth.f14751a;
        }
    }

    @a28
    public pyd(@yfb k40 k40Var, @w61 @yfb e13 e13Var) {
        md8.checkNotNullParameter(k40Var, "appInfo");
        md8.checkNotNullParameter(e13Var, "blockingDispatcher");
        this.f72508a = k40Var;
        this.f72509b = e13Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL settingsUrl() {
        return new URL(new Uri.Builder().scheme("https").authority(f72506d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f72508a.getAppId()).appendPath("settings").appendQueryParameter(lz3.f59313l, this.f72508a.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter(lz3.f59314m, this.f72508a.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // p000.r43
    @gib
    public Object doConfigFetch(@yfb Map<String, String> map, @yfb gz6<? super JSONObject, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb gz6<? super String, ? super zy2<? super bth>, ? extends Object> gz6Var2, @yfb zy2<? super bth> zy2Var) {
        Object objWithContext = dg1.withContext(this.f72509b, new C11186b(map, gz6Var, gz6Var2, null), zy2Var);
        return objWithContext == pd8.getCOROUTINE_SUSPENDED() ? objWithContext : bth.f14751a;
    }
}
