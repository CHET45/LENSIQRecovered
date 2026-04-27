package p000;

import android.content.Context;
import com.eyevue.common.C2531R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class bu8 {

    /* JADX INFO: renamed from: C */
    public static final bu8 f14774C;

    /* JADX INFO: renamed from: F */
    public static final bu8 f14775F;

    /* JADX INFO: renamed from: H */
    public static final bu8 f14776H;

    /* JADX INFO: renamed from: L */
    public static final bu8 f14777L;

    /* JADX INFO: renamed from: M */
    public static final bu8 f14778M;

    /* JADX INFO: renamed from: M1 */
    public static final bu8 f14779M1;

    /* JADX INFO: renamed from: N */
    public static final bu8 f14780N;

    /* JADX INFO: renamed from: Q */
    public static final bu8 f14781Q;

    /* JADX INFO: renamed from: V1 */
    public static final bu8 f14782V1;

    /* JADX INFO: renamed from: X */
    public static final bu8 f14783X;

    /* JADX INFO: renamed from: Y */
    public static final bu8 f14784Y;

    /* JADX INFO: renamed from: Z */
    public static final bu8 f14785Z;

    /* JADX INFO: renamed from: Z1 */
    public static final bu8 f14786Z1;

    /* JADX INFO: renamed from: a2 */
    public static final /* synthetic */ bu8[] f14787a2;

    /* JADX INFO: renamed from: d */
    public static final bu8 f14788d;

    /* JADX INFO: renamed from: e */
    public static final bu8 f14789e;

    /* JADX INFO: renamed from: f */
    public static final bu8 f14790f;

    /* JADX INFO: renamed from: m */
    public static final bu8 f14791m;

    /* JADX INFO: renamed from: a */
    public final String f14792a;

    /* JADX INFO: renamed from: b */
    public final int f14793b;

    /* JADX INFO: renamed from: c */
    public final int f14794c;

    private static /* synthetic */ bu8[] $values() {
        return new bu8[]{f14788d, f14789e, f14790f, f14791m, f14774C, f14775F, f14776H, f14777L, f14778M, f14780N, f14781Q, f14783X, f14784Y, f14785Z, f14779M1, f14782V1, f14786Z1};
    }

    static {
        int i = C2531R.string.is_follow_system;
        f14788d = new bu8("DEFAULT", 0, "default", i, i);
        f14789e = new bu8("EN", 1, ufh.f87916c, C2531R.string.eyevue_language_english, C2531R.string.language_default_english);
        f14790f = new bu8("ZH", 2, "zh", C2531R.string.eyevue_language_chinese, C2531R.string.language_default_chinese);
        f14791m = new bu8("JA", 3, ufh.f87917d, C2531R.string.ai_trans_ja, C2531R.string.ai_trans_default_ja);
        f14774C = new bu8("KO", 4, ufh.f87918e, C2531R.string.ai_trans_kr, C2531R.string.ai_trans_default_kr);
        f14775F = new bu8("ES", 5, ufh.f87920g, C2531R.string.ai_trans_es, C2531R.string.ai_trans_default_es);
        f14776H = new bu8("PT", 6, ufh.f87925l, C2531R.string.ai_trans_pt, C2531R.string.ai_trans_default_pt);
        f14777L = new bu8("FR", 7, ufh.f87919f, C2531R.string.ai_trans_fr, C2531R.string.ai_trans_default_fr);
        f14778M = new bu8("ZH_TW", 8, "zh_TW", C2531R.string.eyevue_language_traditional, C2531R.string.language_default_traditional);
        f14780N = new bu8("AR", 9, "ar", C2531R.string.ai_trans_ar, C2531R.string.ai_trans_default_ar);
        f14781Q = new bu8("DE", 10, ufh.f87922i, C2531R.string.ai_trans_de, C2531R.string.ai_trans_default_de);
        f14783X = new bu8("IT", 11, "it", C2531R.string.ai_trans_it, C2531R.string.ai_trans_default_it);
        f14784Y = new bu8("RU", 12, ufh.f87921h, C2531R.string.ai_trans_ru, C2531R.string.ai_trans_default_ru);
        f14785Z = new bu8("TH", 13, ufh.f87924k, C2531R.string.ai_trans_ti, C2531R.string.ai_trans_default_ti);
        f14779M1 = new bu8("VI", 14, ufh.f87923j, C2531R.string.ai_vi, C2531R.string.ai_default_vi);
        f14782V1 = new bu8("IN", 15, "in", C2531R.string.ai_in, C2531R.string.ai_default_in);
        f14786Z1 = new bu8("MN", 16, "mn", C2531R.string.mn_name, C2531R.string.ai_default_mn);
        f14787a2 = $values();
    }

    private bu8(String $enum$name, int $enum$ordinal, String code, int stringResId, int stringDefaultResId) {
        this.f14792a = code;
        this.f14793b = stringResId;
        this.f14794c = stringDefaultResId;
    }

    public static String getLanguageString(String langCode, Context context) {
        for (bu8 bu8Var : values()) {
            if (bu8Var.getCode().equals(langCode)) {
                return context.getString(bu8Var.getStringResId());
            }
        }
        return langCode;
    }

    public static bu8 valueOf(String name) {
        return (bu8) Enum.valueOf(bu8.class, name);
    }

    public static bu8[] values() {
        return (bu8[]) f14787a2.clone();
    }

    public String getCode() {
        return this.f14792a;
    }

    public int getStringDefaultResId() {
        return this.f14794c;
    }

    public int getStringResId() {
        return this.f14793b;
    }
}
