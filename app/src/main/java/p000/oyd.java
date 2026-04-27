package p000;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bt4;

/* JADX INFO: loaded from: classes5.dex */
@qpf
@dwf({"SMAP\nRemoteSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,159:1\n116#2,11:160\n*S KotlinDebug\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n*L\n70#1:160,11\n*E\n"})
public final class oyd implements p7f {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C10716a f69207g = new C10716a(null);

    /* JADX INFO: renamed from: h */
    public static final int f69208h;

    /* JADX INFO: renamed from: i */
    @yfb
    public static final owd f69209i;

    /* JADX INFO: renamed from: a */
    @yfb
    public final r0h f69210a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final uy5 f69211b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final k40 f69212c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final r43 f69213d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final c7f f69214e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final y7b f69215f;

    /* JADX INFO: renamed from: oyd$a */
    public static final class C10716a {
        public /* synthetic */ C10716a(jt3 jt3Var) {
            this();
        }

        public final int getDefaultCacheDuration() {
            return oyd.f69208h;
        }

        @yfb
        public final owd getSanitizeRegex() {
            return oyd.f69209i;
        }

        private C10716a() {
        }
    }

    /* JADX INFO: renamed from: oyd$b */
    @ck3(m4009c = "com.google.firebase.sessions.settings.RemoteSettings", m4010f = "RemoteSettings.kt", m4011i = {0, 0, 1, 1, 2}, m4012l = {165, 78, 95}, m4013m = "updateSettings", m4014n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m4015s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class C10717b extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f69216a;

        /* JADX INFO: renamed from: b */
        public Object f69217b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f69218c;

        /* JADX INFO: renamed from: e */
        public int f69220e;

        public C10717b(zy2<? super C10717b> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f69218c = obj;
            this.f69220e |= Integer.MIN_VALUE;
            return oyd.this.updateSettings(this);
        }
    }

    /* JADX INFO: renamed from: oyd$c */
    @ck3(m4009c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m4010f = "RemoteSettings.kt", m4011i = {}, m4012l = {126}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C10718c extends ugg implements gz6<JSONObject, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f69221a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f69222b;

        public C10718c(zy2<? super C10718c> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C10718c c10718c = oyd.this.new C10718c(zy2Var);
            c10718c.f69222b = obj;
            return c10718c;
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) throws JSONException {
            Boolean bool;
            Double d;
            Integer num;
            JSONException jSONException;
            Integer num2;
            Integer num3;
            Double d2;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f69221a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                JSONObject jSONObject = (JSONObject) this.f69222b;
                StringBuilder sb = new StringBuilder();
                sb.append("Fetched settings: ");
                sb.append(jSONObject);
                Integer num4 = null;
                num4 = null;
                Boolean bool2 = null;
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    md8.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num3 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                try {
                                    num4 = jSONObject2.has(i7f.f45940e) ? (Integer) jSONObject2.get(i7f.f45940e) : null;
                                    bth bthVar = bth.f14751a;
                                    num = num3;
                                    d = d2;
                                    bool = bool3;
                                } catch (JSONException e) {
                                    Boolean bool4 = bool3;
                                    jSONException = e;
                                    num2 = num4;
                                    bool2 = bool4;
                                    wc1.boxInt(Log.e(dz5.f31354d, "Error parsing the configs remotely fetched: ", jSONException));
                                    num = num3;
                                    d = d2;
                                    bool = bool2;
                                    num4 = num2;
                                }
                            } catch (JSONException e2) {
                                num3 = null;
                                bool2 = bool3;
                                jSONException = e2;
                                num2 = null;
                            }
                        } catch (JSONException e3) {
                            num3 = null;
                            d2 = null;
                            bool2 = bool3;
                            jSONException = e3;
                            num2 = null;
                        }
                    } catch (JSONException e4) {
                        jSONException = e4;
                        num2 = null;
                        num3 = null;
                        d2 = null;
                    }
                } else {
                    bool = null;
                    d = null;
                    num = null;
                }
                c7f c7fVar = oyd.this.f69214e;
                y4f y4fVar = new y4f(bool, d, num, wc1.boxInt(num4 != null ? num4.intValue() : oyd.f69207g.getDefaultCacheDuration()), wc1.boxLong(oyd.this.f69210a.currentTime().getSeconds()));
                this.f69221a = 1;
                if (c7fVar.updateConfigs(y4fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }

        @Override // p000.gz6
        public final Object invoke(JSONObject jSONObject, zy2<? super bth> zy2Var) {
            return ((C10718c) create(jSONObject, zy2Var)).invokeSuspend(bth.f14751a);
        }
    }

    /* JADX INFO: renamed from: oyd$d */
    @ck3(m4009c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m4010f = "RemoteSettings.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C10719d extends ugg implements gz6<String, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f69224a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f69225b;

        public C10719d(zy2<? super C10719d> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C10719d c10719d = new C10719d(zy2Var);
            c10719d.f69225b = obj;
            return c10719d;
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f69224a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            Log.e(dz5.f31354d, "Error failed to fetch the remote configs: " + ((String) this.f69225b));
            return bth.f14751a;
        }

        @Override // p000.gz6
        public final Object invoke(String str, zy2<? super bth> zy2Var) {
            return ((C10719d) create(str, zy2Var)).invokeSuspend(bth.f14751a);
        }
    }

    static {
        bt4.C2044a c2044a = bt4.f14711b;
        f69208h = (int) bt4.m28073getInWholeSecondsimpl(ft4.toDuration(24, lt4.f58686m));
        f69209i = new owd(pj4.f71071b);
    }

    @a28
    public oyd(@yfb r0h r0hVar, @yfb uy5 uy5Var, @yfb k40 k40Var, @yfb r43 r43Var, @yfb c7f c7fVar) {
        md8.checkNotNullParameter(r0hVar, "timeProvider");
        md8.checkNotNullParameter(uy5Var, "firebaseInstallationsApi");
        md8.checkNotNullParameter(k40Var, "appInfo");
        md8.checkNotNullParameter(r43Var, "configsFetcher");
        md8.checkNotNullParameter(c7fVar, "settingsCache");
        this.f69210a = r0hVar;
        this.f69211b = uy5Var;
        this.f69212c = k40Var;
        this.f69213d = r43Var;
        this.f69214e = c7fVar;
        this.f69215f = e8b.Mutex$default(false, 1, null);
    }

    private final String sanitize(String str) {
        return f69209i.replace(str, "");
    }

    @gib
    @fdi
    public final Object clearCachedSettings$com_google_firebase_firebase_sessions(@yfb zy2<? super bth> zy2Var) {
        Object objUpdateConfigs = this.f69214e.updateConfigs(z4f.f104155a.getDefaultValue(), zy2Var);
        return objUpdateConfigs == pd8.getCOROUTINE_SUSPENDED() ? objUpdateConfigs : bth.f14751a;
    }

    @Override // p000.p7f
    @gib
    public Double getSamplingRate() {
        return this.f69214e.sessionSamplingRate();
    }

    @Override // p000.p7f
    @gib
    public Boolean getSessionEnabled() {
        return this.f69214e.sessionsEnabled();
    }

    @Override // p000.p7f
    @gib
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774, reason: not valid java name */
    public bt4 mo31700getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = this.f69214e.sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        bt4.C2044a c2044a = bt4.f14711b;
        return bt4.m28057boximpl(ft4.toDuration(numSessionRestartTimeout.intValue(), lt4.f58684e));
    }

    @Override // p000.p7f
    public boolean isSettingsStale() {
        return this.f69214e.hasCacheExpired();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:21:0x0048, B:47:0x00ad, B:49:0x00bb, B:52:0x00c8), top: B:64:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:21:0x0048, B:47:0x00ad, B:49:0x00bb, B:52:0x00c8), top: B:64:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.p7f
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object updateSettings(@p000.yfb p000.zy2<? super p000.bth> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oyd.updateSettings(zy2):java.lang.Object");
    }
}
