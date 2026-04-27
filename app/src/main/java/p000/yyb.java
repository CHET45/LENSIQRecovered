package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class yyb {

    /* JADX INFO: renamed from: c */
    public static final String f103352c = "download_length_";

    /* JADX INFO: renamed from: d */
    public static final String f103353d = "download_status_";

    /* JADX INFO: renamed from: e */
    public static final String f103354e = "download_task_list";

    /* JADX INFO: renamed from: f */
    public static final String f103355f = "SPUtils";

    /* JADX INFO: renamed from: a */
    public SharedPreferences f103356a;

    /* JADX INFO: renamed from: b */
    public SharedPreferences.Editor f103357b;

    /* JADX INFO: renamed from: yyb$b */
    public static class C15891b {

        /* JADX INFO: renamed from: A */
        public static final String f103358A = "SP_SLEEP_REQUEST_INTERVAL";

        /* JADX INFO: renamed from: A0 */
        public static final String f103359A0 = "SP_KEY_SHOW_CUSTOM_EQ";

        /* JADX INFO: renamed from: B */
        public static final String f103360B = "SP_HOME_REQUEST_INTERVAL";

        /* JADX INFO: renamed from: B0 */
        public static final String f103361B0 = "SP_KEY_EXCEPTION_CODE";

        /* JADX INFO: renamed from: C */
        public static final String f103362C = "SP_TOOL_REQUEST_INTERVAL";

        /* JADX INFO: renamed from: C0 */
        public static final String f103363C0 = "SP_KEY_EXCEPTION_MSG";

        /* JADX INFO: renamed from: D */
        public static final String f103364D = "SP_PRODUCT_REQUEST_INTERVAL";

        /* JADX INFO: renamed from: D0 */
        public static final String f103365D0 = "KEY_LOGIN_EMAIL";

        /* JADX INFO: renamed from: E */
        public static final String f103366E = "SP_MINE_REQUEST_INTERVAL";

        /* JADX INFO: renamed from: E0 */
        public static final String f103367E0 = "SP_KEY_REGISTER_EMAIL";

        /* JADX INFO: renamed from: F */
        public static final String f103368F = "iat_vadbos_preference";

        /* JADX INFO: renamed from: F0 */
        public static final String f103369F0 = "SP_KEY_LOGIN_SKIP";

        /* JADX INFO: renamed from: G */
        public static final String f103370G = "iat_vadeos_preference";

        /* JADX INFO: renamed from: G0 */
        public static final String f103371G0 = "SP_KEY_TRANS_LOGIN_SKIP";

        /* JADX INFO: renamed from: H */
        public static final String f103372H = "iat_punc_preference";

        /* JADX INFO: renamed from: H0 */
        public static final String f103373H0 = "SP_KEY_REFRESH_TOKEN";

        /* JADX INFO: renamed from: I */
        public static final String f103374I = "iat_language_preference";

        /* JADX INFO: renamed from: I0 */
        public static final String f103375I0 = "KEY_LOGIN_STATE";

        /* JADX INFO: renamed from: J */
        public static final String f103376J = "speed_preference";

        /* JADX INFO: renamed from: J0 */
        public static final String f103377J0 = "KEY_LOGIN_MOBILE";

        /* JADX INFO: renamed from: K */
        public static final String f103378K = "pitch_preference";

        /* JADX INFO: renamed from: K0 */
        public static final String f103379K0 = "SP_KEY_LEFT_ONE_FUNCTION";

        /* JADX INFO: renamed from: L */
        public static final String f103380L = "volume_preference";

        /* JADX INFO: renamed from: L0 */
        public static final String f103381L0 = "SP_KEY_RIGHT_ONE_FUNCTION";

        /* JADX INFO: renamed from: M */
        public static final String f103382M = "stream_preference";

        /* JADX INFO: renamed from: M0 */
        public static final String f103383M0 = "SP_KEY_LX_LEFT_ONE_FUNCTION";

        /* JADX INFO: renamed from: N */
        public static final String f103384N = "language_to_new";

        /* JADX INFO: renamed from: N0 */
        public static final String f103385N0 = "SP_KEY_LX_RIGHT_ONE_FUNCTION";

        /* JADX INFO: renamed from: O */
        public static final String f103386O = "language_from_new";

        /* JADX INFO: renamed from: O0 */
        public static final String f103387O0 = "SP_KEY_GET_LX_KEY_FIRST";

        /* JADX INFO: renamed from: P */
        public static final String f103388P = "language_to_two_ear_news";

        /* JADX INFO: renamed from: P0 */
        public static final String f103389P0 = "SP_KEY_GET_LX_EQ_VALUE";

        /* JADX INFO: renamed from: Q */
        public static final String f103390Q = "language_from_two_ear_news";

        /* JADX INFO: renamed from: Q0 */
        public static final String f103391Q0 = "SP_KEY_GET_BOX_DEFAULT_MAC";

        /* JADX INFO: renamed from: R */
        public static final String f103392R = "language_to_free_news";

        /* JADX INFO: renamed from: R0 */
        public static final String f103393R0 = "SP_KEY_GET_BOX_DEFAULT_MAC_ADDRESS";

        /* JADX INFO: renamed from: S */
        public static final String f103394S = "language_from_free_news";

        /* JADX INFO: renamed from: S0 */
        public static final String f103395S0 = "SP_KEY_SUPPORT_TRANS_STATUS";

        /* JADX INFO: renamed from: T */
        public static final String f103396T = "language_to_freedom_talk_news";

        /* JADX INFO: renamed from: T0 */
        public static final String f103397T0 = "SP_KEY_LOCATION_LATITUDE";

        /* JADX INFO: renamed from: U */
        public static final String f103398U = "language_from_freedom_talk_news";

        /* JADX INFO: renamed from: U0 */
        public static final String f103399U0 = "SP_KEY_LOCATION_LONGITUDE";

        /* JADX INFO: renamed from: V */
        public static final String f103400V = "language_to_face_to_face_talk_news";

        /* JADX INFO: renamed from: V0 */
        public static final String f103401V0 = "language_voice_notes";

        /* JADX INFO: renamed from: W */
        public static final String f103402W = "language_from_face_to_face_talk_news";

        /* JADX INFO: renamed from: W0 */
        public static final String f103403W0 = "SP_KEY_DEVICE_MANAGE_CLICK_DISCONNECT";

        /* JADX INFO: renamed from: X */
        public static final String f103404X = "language_from_text_mode";

        /* JADX INFO: renamed from: X0 */
        public static final String f103405X0 = "SP_KEY_CLASSIC_ADDRESS";

        /* JADX INFO: renamed from: Y */
        public static final String f103406Y = "language_to_text_mode";

        /* JADX INFO: renamed from: Y0 */
        public static final String f103407Y0 = "SP_KEY_CLASSIC_NAME";

        /* JADX INFO: renamed from: Z */
        public static final String f103408Z = "language_from_chatgptnew";

        /* JADX INFO: renamed from: Z0 */
        public static final String f103409Z0 = "SP_KEY_SPP_SCAN_TIME";

        /* JADX INFO: renamed from: a */
        public static final String f103410a = "api_host";

        /* JADX INFO: renamed from: a0 */
        public static final String f103411a0 = "language_photo";

        /* JADX INFO: renamed from: a1 */
        public static final String f103412a1 = "SP_KEY_SLEEP_TIME_CHECK";

        /* JADX INFO: renamed from: b */
        public static final String f103413b = "KEY_POP_SWITCH";

        /* JADX INFO: renamed from: b0 */
        public static final String f103414b0 = "language_photo_from";

        /* JADX INFO: renamed from: b1 */
        public static final String f103415b1 = "SP_KEY_QR_CODE";

        /* JADX INFO: renamed from: c */
        public static final String f103416c = "KEY_POP_SWITCH_TIME";

        /* JADX INFO: renamed from: c0 */
        public static final String f103417c0 = "SP_UPDATE_TIME";

        /* JADX INFO: renamed from: c1 */
        public static final String f103418c1 = "SP_KEY_SHOW_GUIDE_FIRST";

        /* JADX INFO: renamed from: d */
        public static final String f103419d = "KEY_DEVICE_LOCATION";

        /* JADX INFO: renamed from: d0 */
        public static final String f103420d0 = "SP_UPDATE_DATA";

        /* JADX INFO: renamed from: d1 */
        public static final String f103421d1 = "SP_KEY_SHOW_GUIDE_DIALOG";

        /* JADX INFO: renamed from: e */
        public static final String f103422e = "KEY_DEVICE_PRIVACY_POLICY";

        /* JADX INFO: renamed from: e0 */
        public static final String f103423e0 = "SP_KEY_REGISTER_TOURIST";

        /* JADX INFO: renamed from: e1 */
        public static final String f103424e1 = "SP_KEY_AI_CHAT_ONLINE_SEARCH";

        /* JADX INFO: renamed from: f */
        public static final String f103425f = "KEY_RETRY_CONNECT_FIRST";

        /* JADX INFO: renamed from: f0 */
        public static final String f103426f0 = "SP_UPDATE_GET";

        /* JADX INFO: renamed from: f1 */
        public static final String f103427f1 = "SP_KEY_AI_CHAT_AI_MODEL";

        /* JADX INFO: renamed from: g */
        public static final String f103428g = "CURRENT_LANGUAGE";

        /* JADX INFO: renamed from: g0 */
        public static final String f103429g0 = "SP_KEY_IS_FIRST";

        /* JADX INFO: renamed from: g1 */
        public static final String f103430g1 = "SP_KEY_AI_CHAT_AI_MODEL_NAME";

        /* JADX INFO: renamed from: h */
        public static final String f103431h = "CURRENT_COUNTRY";

        /* JADX INFO: renamed from: h0 */
        public static final String f103432h0 = "KEY_TOKEN";

        /* JADX INFO: renamed from: h1 */
        public static final String f103433h1 = "SP_KEY_SUPPORT_VOICE_NOTES";

        /* JADX INFO: renamed from: i */
        public static final String f103434i = "IS_FOLLOW_SYSTEM";

        /* JADX INFO: renamed from: i0 */
        public static final String f103435i0 = "SP_KEY_SUPPORT_DOUBLE_HEADSET";

        /* JADX INFO: renamed from: i1 */
        public static final String f103436i1 = "SP_KEY_PRODUCT_STATUS";

        /* JADX INFO: renamed from: j */
        public static final String f103437j = "THEMES";

        /* JADX INFO: renamed from: j0 */
        public static final String f103438j0 = "SP_KEY_SUPPORT_TRANSLATION";

        /* JADX INFO: renamed from: k */
        public static final String f103439k = "THEME_DARK";

        /* JADX INFO: renamed from: k0 */
        public static final String f103440k0 = "SP_KEY_SUPPORT_AI";

        /* JADX INFO: renamed from: l */
        public static final String f103441l = "KEY_DEVICE_PROJECT";

        /* JADX INFO: renamed from: l0 */
        public static final String f103442l0 = "SP_KEY_SUPPORT_HEADSET_MOBILE";

        /* JADX INFO: renamed from: m */
        public static final String f103443m = "KEY_UID";

        /* JADX INFO: renamed from: m0 */
        public static final String f103444m0 = "SP_KEY_IS_SHOW_AI_FIRST";

        /* JADX INFO: renamed from: n */
        public static final String f103445n = "KEY_MAC_ADDRESS";

        /* JADX INFO: renamed from: n0 */
        public static final String f103446n0 = "SP_KEY_SUPPORT_SIMULTANEOUS_INTERPRETATION";

        /* JADX INFO: renamed from: o */
        public static final String f103447o = "SP_USER_ID";

        /* JADX INFO: renamed from: o0 */
        public static final String f103448o0 = "SP_KEY_PHONE_MODEL_TIP";

        /* JADX INFO: renamed from: p */
        public static final String f103449p = "SP_KEY_INTERSTITIAL_CONFIG";

        /* JADX INFO: renamed from: p0 */
        public static final String f103450p0 = "SP_KEY_TWO_EAR_TIP";

        /* JADX INFO: renamed from: q */
        public static final String f103451q = "SP_SLEEP_CLICK_COUNT";

        /* JADX INFO: renamed from: q0 */
        public static final String f103452q0 = "SP_KEY_FREEDOM_TALK_TIP";

        /* JADX INFO: renamed from: r */
        public static final String f103453r = "SP_HOME_CLICK_COUNT";

        /* JADX INFO: renamed from: r0 */
        public static final String f103454r0 = "SP_KEY_FACE_TO_FACE_TALK_TIP";

        /* JADX INFO: renamed from: s */
        public static final String f103455s = "SP_TOOL_CLICK_COUNT";

        /* JADX INFO: renamed from: s0 */
        public static final String f103456s0 = "SP_KEY_PHONE_EAR_MODEL_TIP";

        /* JADX INFO: renamed from: t */
        public static final String f103457t = "SP_PRODUCT_CLICK_COUNT";

        /* JADX INFO: renamed from: t0 */
        public static final String f103458t0 = "SP_KEY_PHONE_EAR_FACE_TO_FACE_MODEL_TIP";

        /* JADX INFO: renamed from: u */
        public static final String f103459u = "SP_MINE_CLICK_COUNT";

        /* JADX INFO: renamed from: u0 */
        public static final String f103460u0 = "SP_KEY_PHONE_GLASSES_MODEL_TIP";

        /* JADX INFO: renamed from: v */
        public static final String f103461v = "SP_SLEEP_TIME";

        /* JADX INFO: renamed from: v0 */
        public static final String f103462v0 = "SP_KEY_PHONE_GLASSES_FACE_TO_FACE_MODEL_TIP";

        /* JADX INFO: renamed from: w */
        public static final String f103463w = "SP_HOME_TIME";

        /* JADX INFO: renamed from: w0 */
        public static final String f103464w0 = "SP_KEY_PROJECT_TYPE";

        /* JADX INFO: renamed from: x */
        public static final String f103465x = "SP_TOOL_TIME";

        /* JADX INFO: renamed from: x0 */
        public static final String f103466x0 = "SP_KEY_PERMISSIONSGRANTED";

        /* JADX INFO: renamed from: y */
        public static final String f103467y = "SP_PRODUCT_TIME";

        /* JADX INFO: renamed from: y0 */
        public static final String f103468y0 = "SP_KEY_USE_DEVICE_EQ";

        /* JADX INFO: renamed from: z */
        public static final String f103469z = "SP_PRODUCT_TIME";

        /* JADX INFO: renamed from: z0 */
        public static final String f103470z0 = "SP_KEY_EQUALIZER_MODEL_NUM";
    }

    /* JADX INFO: renamed from: yyb$c */
    public static class C15892c {

        /* JADX INFO: renamed from: a */
        public static final yyb f103471a = new yyb();

        private C15892c() {
        }
    }

    public static yyb getInstance() {
        return C15892c.f103471a;
    }

    public void clear() {
        this.f103357b.clear();
        this.f103357b.commit();
    }

    public boolean contains(String str) {
        return this.f103356a.contains(str);
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f103356a.getBoolean(str, z);
    }

    public float getFloat(String str, long j) {
        return this.f103356a.getFloat(str, j);
    }

    public int getInt(String str, int i) {
        return this.f103356a.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.f103356a.getLong(str, j);
    }

    public String getString(String str, String str2) {
        return this.f103356a.getString(str, str2);
    }

    public void init(Context context) {
        if (context == null) {
            Log.e(f103355f, "init error, context is null");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sp_offline", 0);
        this.f103356a = sharedPreferences;
        this.f103357b = sharedPreferences.edit();
    }

    public void putBoolean(String str, boolean z) {
        this.f103357b.putBoolean(str, z);
        this.f103357b.commit();
    }

    public void putFloat(String str, float f) {
        this.f103357b.putFloat(str, f);
        this.f103357b.commit();
    }

    public void putInt(String str, int i) {
        this.f103357b.putInt(str, i);
        this.f103357b.commit();
    }

    public void putLong(String str, long j) {
        this.f103357b.putLong(str, j);
        this.f103357b.commit();
    }

    public void putString(String str, String str2) {
        this.f103357b.putString(str, str2);
        this.f103357b.commit();
    }

    public void remove(String str) {
        this.f103357b.remove(str);
        this.f103357b.commit();
    }

    private yyb() {
    }

    public String getString(String str) {
        return this.f103356a.getString(str, "");
    }
}
