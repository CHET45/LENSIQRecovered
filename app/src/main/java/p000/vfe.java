package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public class vfe {

    /* JADX INFO: renamed from: c */
    public static Context f90886c;

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f90887a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences.Editor f90888b;

    /* JADX INFO: renamed from: vfe$b */
    public static class C14037b {

        /* JADX INFO: renamed from: A */
        public static final String f90889A = "SP_PRODUCT_TIME";

        /* JADX INFO: renamed from: A0 */
        public static final String f90890A0 = "SP_KEY_EQUALIZER_MODEL_NUM";

        /* JADX INFO: renamed from: B */
        public static final String f90891B = "SP_SLEEP_REQUEST_INTERVAL";

        /* JADX INFO: renamed from: B0 */
        public static final String f90892B0 = "SP_KEY_SHOW_CUSTOM_EQ";

        /* JADX INFO: renamed from: C */
        public static final String f90893C = "SP_HOME_REQUEST_INTERVAL";

        /* JADX INFO: renamed from: C0 */
        public static final String f90894C0 = "SP_KEY_EXCEPTION_CODE";

        /* JADX INFO: renamed from: D */
        public static final String f90895D = "SP_TOOL_REQUEST_INTERVAL";

        /* JADX INFO: renamed from: D0 */
        public static final String f90896D0 = "SP_KEY_EXCEPTION_MSG";

        /* JADX INFO: renamed from: E */
        public static final String f90897E = "SP_PRODUCT_REQUEST_INTERVAL";

        /* JADX INFO: renamed from: E0 */
        public static final String f90898E0 = "KEY_LOGIN_EMAIL";

        /* JADX INFO: renamed from: F */
        public static final String f90899F = "SP_MINE_REQUEST_INTERVAL";

        /* JADX INFO: renamed from: F0 */
        public static final String f90900F0 = "SP_KEY_REGISTER_EMAIL";

        /* JADX INFO: renamed from: G */
        public static final String f90901G = "iat_vadbos_preference";

        /* JADX INFO: renamed from: G0 */
        public static final String f90902G0 = "SP_KEY_LOGIN_SKIP";

        /* JADX INFO: renamed from: H */
        public static final String f90903H = "iat_vadeos_preference";

        /* JADX INFO: renamed from: H0 */
        public static final String f90904H0 = "SP_KEY_TRANS_LOGIN_SKIP";

        /* JADX INFO: renamed from: I */
        public static final String f90905I = "iat_punc_preference";

        /* JADX INFO: renamed from: I0 */
        public static final String f90906I0 = "SP_KEY_REFRESH_TOKEN";

        /* JADX INFO: renamed from: J */
        public static final String f90907J = "iat_language_preference";

        /* JADX INFO: renamed from: J0 */
        public static final String f90908J0 = "KEY_LOGIN_STATE";

        /* JADX INFO: renamed from: K */
        public static final String f90909K = "speed_preference";

        /* JADX INFO: renamed from: K0 */
        public static final String f90910K0 = "KEY_LOGIN_MOBILE";

        /* JADX INFO: renamed from: L */
        public static final String f90911L = "pitch_preference";

        /* JADX INFO: renamed from: L0 */
        public static final String f90912L0 = "SP_KEY_LEFT_ONE_FUNCTION";

        /* JADX INFO: renamed from: M */
        public static final String f90913M = "volume_preference";

        /* JADX INFO: renamed from: M0 */
        public static final String f90914M0 = "SP_KEY_RIGHT_ONE_FUNCTION";

        /* JADX INFO: renamed from: N */
        public static final String f90915N = "stream_preference";

        /* JADX INFO: renamed from: N0 */
        public static final String f90916N0 = "SP_KEY_LX_LEFT_ONE_FUNCTION";

        /* JADX INFO: renamed from: O */
        public static final String f90917O = "woke_language_to_new";

        /* JADX INFO: renamed from: O0 */
        public static final String f90918O0 = "SP_KEY_LX_RIGHT_ONE_FUNCTION";

        /* JADX INFO: renamed from: P */
        public static final String f90919P = "woke_language_from_new";

        /* JADX INFO: renamed from: P0 */
        public static final String f90920P0 = "SP_KEY_GET_LX_KEY_FIRST";

        /* JADX INFO: renamed from: Q */
        public static final String f90921Q = "woke_language_to_two_ear_news";

        /* JADX INFO: renamed from: Q0 */
        public static final String f90922Q0 = "SP_KEY_GET_LX_EQ_VALUE";

        /* JADX INFO: renamed from: R */
        public static final String f90923R = "woke_language_from_two_ear_news";

        /* JADX INFO: renamed from: R0 */
        public static final String f90924R0 = "SP_KEY_GET_BOX_DEFAULT_MAC";

        /* JADX INFO: renamed from: S */
        public static final String f90925S = "woke_language_to_free_news";

        /* JADX INFO: renamed from: S0 */
        public static final String f90926S0 = "SP_KEY_GET_BOX_DEFAULT_MAC_ADDRESS";

        /* JADX INFO: renamed from: T */
        public static final String f90927T = "woke_language_from_free_news";

        /* JADX INFO: renamed from: T0 */
        public static final String f90928T0 = "SP_KEY_SUPPORT_TRANS_STATUS";

        /* JADX INFO: renamed from: U */
        public static final String f90929U = "language_to_mahine_new";

        /* JADX INFO: renamed from: U0 */
        public static final String f90930U0 = "SP_KEY_LOCATION_LATITUDE";

        /* JADX INFO: renamed from: V */
        public static final String f90931V = "language_from_mahine_new";

        /* JADX INFO: renamed from: V0 */
        public static final String f90932V0 = "SP_KEY_LOCATION_LONGITUDE";

        /* JADX INFO: renamed from: W */
        public static final String f90933W = "woke_language_to_freedom_talk_news";

        /* JADX INFO: renamed from: W0 */
        public static final String f90934W0 = "language_voice_notes";

        /* JADX INFO: renamed from: X */
        public static final String f90935X = "woke_language_from_freedom_talk_news";

        /* JADX INFO: renamed from: X0 */
        public static final String f90936X0 = "SP_KEY_DEVICE_MANAGE_CLICK_DISCONNECT";

        /* JADX INFO: renamed from: Y */
        public static final String f90937Y = "woke_language_to_face_to_face_talk_news";

        /* JADX INFO: renamed from: Y0 */
        public static final String f90938Y0 = "SP_KEY_CLASSIC_ADDRESS";

        /* JADX INFO: renamed from: Z */
        public static final String f90939Z = "language_from_face_to_face_talk_news";

        /* JADX INFO: renamed from: Z0 */
        public static final String f90940Z0 = "SP_KEY_CLASSIC_NAME";

        /* JADX INFO: renamed from: a */
        public static final String f90941a = "api_host";

        /* JADX INFO: renamed from: a0 */
        public static final String f90942a0 = "woke_language_from_chatgptnew";

        /* JADX INFO: renamed from: a1 */
        public static final String f90943a1 = "SP_KEY_SPP_SCAN_TIME";

        /* JADX INFO: renamed from: b */
        public static final String f90944b = "KEY_POP_SWITCH";

        /* JADX INFO: renamed from: b0 */
        public static final String f90945b0 = "SP_UPDATE_TIME";

        /* JADX INFO: renamed from: b1 */
        public static final String f90946b1 = "SP_KEY_SLEEP_TIME_CHECK";

        /* JADX INFO: renamed from: c */
        public static final String f90947c = "KEY_POP_SWITCH_TIME";

        /* JADX INFO: renamed from: c0 */
        public static final String f90948c0 = "SP_UPDATE_DATA";

        /* JADX INFO: renamed from: c1 */
        public static final String f90949c1 = "SP_KEY_QR_CODE";

        /* JADX INFO: renamed from: d */
        public static final String f90950d = "KEY_DEVICE_LOCATION";

        /* JADX INFO: renamed from: d0 */
        public static final String f90951d0 = "SP_KEY_REGISTER_TOURIST";

        /* JADX INFO: renamed from: d1 */
        public static final String f90952d1 = "SP_KEY_SHOW_GUIDE_FIRST";

        /* JADX INFO: renamed from: e */
        public static final String f90953e = "KEY_DEVICE_PRIVACY_POLICY";

        /* JADX INFO: renamed from: e0 */
        public static final String f90954e0 = "SP_UPDATE_GET";

        /* JADX INFO: renamed from: e1 */
        public static final String f90955e1 = "SP_KEY_SHOW_GUIDE_DIALOG";

        /* JADX INFO: renamed from: f */
        public static final String f90956f = "KEY_RETRY_CONNECT_FIRST";

        /* JADX INFO: renamed from: f0 */
        public static final String f90957f0 = "SP_KEY_IS_FIRST";

        /* JADX INFO: renamed from: f1 */
        public static final String f90958f1 = "language_photo_from";

        /* JADX INFO: renamed from: g */
        public static final String f90959g = "CURRENT_LANGUAGE";

        /* JADX INFO: renamed from: g0 */
        public static final String f90960g0 = "KEY_TOKEN";

        /* JADX INFO: renamed from: g1 */
        public static final String f90961g1 = "language_photo";

        /* JADX INFO: renamed from: h */
        public static final String f90962h = "CURRENT_COUNTRY";

        /* JADX INFO: renamed from: h0 */
        public static final String f90963h0 = "SP_KEY_SUPPORT_DOUBLE_HEADSET";

        /* JADX INFO: renamed from: h1 */
        public static final String f90964h1 = "SP_KEY_AI_CHAT_ONLINE_SEARCH";

        /* JADX INFO: renamed from: i */
        public static final String f90965i = "IS_FOLLOW_SYSTEM";

        /* JADX INFO: renamed from: i0 */
        public static final String f90966i0 = "SP_KEY_SUPPORT_TRANSLATION";

        /* JADX INFO: renamed from: i1 */
        public static final String f90967i1 = "SP_KEY_AI_CHAT_AI_MODEL";

        /* JADX INFO: renamed from: j */
        public static final String f90968j = "THEMES";

        /* JADX INFO: renamed from: j0 */
        public static final String f90969j0 = "SP_KEY_SUPPORT_FREEDOM_TALK";

        /* JADX INFO: renamed from: j1 */
        public static final String f90970j1 = "SP_KEY_AI_CHAT_AI_MODEL_NAME";

        /* JADX INFO: renamed from: k */
        public static final String f90971k = "THEME_DARK";

        /* JADX INFO: renamed from: k0 */
        public static final String f90972k0 = "SP_KEY_SUPPORT_VOICE_NOTES";

        /* JADX INFO: renamed from: k1 */
        public static final String f90973k1 = "language_from_video_audio";

        /* JADX INFO: renamed from: l */
        public static final String f90974l = "KEY_DEVICE_PROJECT";

        /* JADX INFO: renamed from: l0 */
        public static final String f90975l0 = "SP_KEY_SUPPORT_AI";

        /* JADX INFO: renamed from: l1 */
        public static final String f90976l1 = "language_to_video_audio";

        /* JADX INFO: renamed from: m */
        public static final String f90977m = "KEY_UID";

        /* JADX INFO: renamed from: m0 */
        public static final String f90978m0 = "SP_KEY_SUPPORT_HEADSET_MOBILE";

        /* JADX INFO: renamed from: m1 */
        public static final String f90979m1 = "language_from_offline";

        /* JADX INFO: renamed from: n */
        public static final String f90980n = "KEY_MAC_ADDRESS";

        /* JADX INFO: renamed from: n0 */
        public static final String f90981n0 = "SP_KEY_IS_SHOW_AI_FIRST";

        /* JADX INFO: renamed from: n1 */
        public static final String f90982n1 = "language_to_offline";

        /* JADX INFO: renamed from: o */
        public static final String f90983o = "SP_USER_ID";

        /* JADX INFO: renamed from: o0 */
        public static final String f90984o0 = "SP_KEY_SUPPORT_SIMULTANEOUS_INTERPRETATION";

        /* JADX INFO: renamed from: o1 */
        public static final String f90985o1 = "current_theme";

        /* JADX INFO: renamed from: p */
        public static final String f90986p = "SP_LANGUAGE";

        /* JADX INFO: renamed from: p0 */
        public static final String f90987p0 = "SP_KEY_PHONE_MODEL_TIP";

        /* JADX INFO: renamed from: p1 */
        public static final String f90988p1 = "SP_KEY_AI_CHAT_SAVE_DATA";

        /* JADX INFO: renamed from: q */
        public static final String f90989q = "SP_KEY_INTERSTITIAL_CONFIG";

        /* JADX INFO: renamed from: q0 */
        public static final String f90990q0 = "SP_KEY_TWO_EAR_TIP";

        /* JADX INFO: renamed from: q1 */
        public static final String f90991q1 = "sp_key_offline_switch";

        /* JADX INFO: renamed from: r */
        public static final String f90992r = "SP_SLEEP_CLICK_COUNT";

        /* JADX INFO: renamed from: r0 */
        public static final String f90993r0 = "SP_KEY_FREEDOM_TALK_TIP";

        /* JADX INFO: renamed from: r1 */
        public static final String f90994r1 = "language_voice_note_is_default";

        /* JADX INFO: renamed from: s */
        public static final String f90995s = "SP_HOME_CLICK_COUNT";

        /* JADX INFO: renamed from: s0 */
        public static final String f90996s0 = "SP_KEY_FACE_TO_FACE_TALK_TIP";

        /* JADX INFO: renamed from: t */
        public static final String f90997t = "SP_TOOL_CLICK_COUNT";

        /* JADX INFO: renamed from: t0 */
        public static final String f90998t0 = "SP_KEY_PHONE_EAR_MODEL_TIP";

        /* JADX INFO: renamed from: u */
        public static final String f90999u = "SP_PRODUCT_CLICK_COUNT";

        /* JADX INFO: renamed from: u0 */
        public static final String f91000u0 = "SP_KEY_PHONE_EAR_FACE_TO_FACE_MODEL_TIP";

        /* JADX INFO: renamed from: v */
        public static final String f91001v = "SP_MINE_CLICK_COUNT";

        /* JADX INFO: renamed from: v0 */
        public static final String f91002v0 = "SP_KEY_PHONE_GLASSES_MODEL_TIP";

        /* JADX INFO: renamed from: w */
        public static final String f91003w = "SP_SLEEP_TIME";

        /* JADX INFO: renamed from: w0 */
        public static final String f91004w0 = "SP_KEY_PHONE_GLASSES_FACE_TO_FACE_MODEL_TIP";

        /* JADX INFO: renamed from: x */
        public static final String f91005x = "SP_HOME_TIME";

        /* JADX INFO: renamed from: x0 */
        public static final String f91006x0 = "SP_KEY_PROJECT_TYPE";

        /* JADX INFO: renamed from: y */
        public static final String f91007y = "SP_TOOL_TIME";

        /* JADX INFO: renamed from: y0 */
        public static final String f91008y0 = "SP_KEY_PERMISSIONSGRANTED";

        /* JADX INFO: renamed from: z */
        public static final String f91009z = "SP_PRODUCT_TIME";

        /* JADX INFO: renamed from: z0 */
        public static final String f91010z0 = "SP_KEY_USE_DEVICE_EQ";
    }

    /* JADX INFO: renamed from: vfe$c */
    public static class C14038c {

        /* JADX INFO: renamed from: a */
        public static final vfe f91011a = new vfe();

        private C14038c() {
        }
    }

    public static vfe getInstance() {
        return C14038c.f91011a;
    }

    public void clear() {
        this.f90888b.clear();
        this.f90888b.commit();
    }

    public boolean contains(String str) {
        return this.f90887a.contains(str);
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f90887a.getBoolean(str, z);
    }

    public float getFloat(String str, long j) {
        return this.f90887a.getFloat(str, j);
    }

    public int getInt(String str, int i) {
        return this.f90887a.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.f90887a.getLong(str, j);
    }

    public String getString(String str, String str2) {
        return this.f90887a.getString(str, str2);
    }

    public void putBoolean(String str, boolean z) {
        this.f90888b.putBoolean(str, z);
        this.f90888b.commit();
    }

    public void putFloat(String str, float f) {
        this.f90888b.putFloat(str, f);
        this.f90888b.commit();
    }

    public void putInt(String str, int i) {
        this.f90888b.putInt(str, i);
        this.f90888b.commit();
    }

    public void putLong(String str, long j) {
        this.f90888b.putLong(str, j);
        this.f90888b.commit();
    }

    public void putString(String str, String str2) {
        this.f90888b.putString(str, str2);
        this.f90888b.commit();
    }

    public void remove(String str) {
        this.f90888b.remove(str);
        this.f90888b.commit();
    }

    private vfe() {
        SharedPreferences sharedPreferences = iy2.getAppContext().getSharedPreferences("sp_wq", 0);
        this.f90887a = sharedPreferences;
        this.f90888b = sharedPreferences.edit();
    }

    public String getString(String str) {
        return this.f90887a.getString(str, "");
    }
}
