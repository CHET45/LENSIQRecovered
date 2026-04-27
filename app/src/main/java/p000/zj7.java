package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zj7 {

    /* JADX INFO: renamed from: A */
    public static final String f105236A = "phoneNumber";

    /* JADX INFO: renamed from: B */
    public static final String f105237B = "phoneNumberDevice";

    /* JADX INFO: renamed from: C */
    public static final String f105238C = "phoneCountryCode";

    /* JADX INFO: renamed from: D */
    public static final String f105239D = "phoneNational";

    /* JADX INFO: renamed from: E */
    public static final String f105240E = "newUsername";

    /* JADX INFO: renamed from: F */
    public static final String f105241F = "newPassword";

    /* JADX INFO: renamed from: G */
    public static final String f105242G = "gender";

    /* JADX INFO: renamed from: H */
    public static final String f105243H = "birthDateFull";

    /* JADX INFO: renamed from: I */
    public static final String f105244I = "birthDateDay";

    /* JADX INFO: renamed from: J */
    public static final String f105245J = "birthDateMonth";

    /* JADX INFO: renamed from: K */
    public static final String f105246K = "birthDateYear";

    /* JADX INFO: renamed from: L */
    public static final String f105247L = "smsOTPCode";

    /* JADX INFO: renamed from: a */
    public static final String f105248a = "emailAddress";

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final String f105249b = "name";

    /* JADX INFO: renamed from: c */
    public static final String f105250c = "username";

    /* JADX INFO: renamed from: d */
    public static final String f105251d = "password";

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final String f105252e = "phone";

    /* JADX INFO: renamed from: f */
    public static final String f105253f = "postalAddress";

    /* JADX INFO: renamed from: g */
    public static final String f105254g = "postalCode";

    /* JADX INFO: renamed from: h */
    public static final String f105255h = "creditCardNumber";

    /* JADX INFO: renamed from: i */
    public static final String f105256i = "creditCardSecurityCode";

    /* JADX INFO: renamed from: j */
    public static final String f105257j = "creditCardExpirationDate";

    /* JADX INFO: renamed from: k */
    public static final String f105258k = "creditCardExpirationMonth";

    /* JADX INFO: renamed from: l */
    public static final String f105259l = "creditCardExpirationYear";

    /* JADX INFO: renamed from: m */
    public static final String f105260m = "creditCardExpirationDay";

    /* JADX INFO: renamed from: n */
    public static final String f105261n = "addressCountry";

    /* JADX INFO: renamed from: o */
    public static final String f105262o = "addressRegion";

    /* JADX INFO: renamed from: p */
    public static final String f105263p = "addressLocality";

    /* JADX INFO: renamed from: q */
    public static final String f105264q = "streetAddress";

    /* JADX INFO: renamed from: r */
    public static final String f105265r = "extendedAddress";

    /* JADX INFO: renamed from: s */
    public static final String f105266s = "extendedPostalCode";

    /* JADX INFO: renamed from: t */
    public static final String f105267t = "personName";

    /* JADX INFO: renamed from: u */
    public static final String f105268u = "personGivenName";

    /* JADX INFO: renamed from: v */
    public static final String f105269v = "personFamilyName";

    /* JADX INFO: renamed from: w */
    public static final String f105270w = "personMiddleName";

    /* JADX INFO: renamed from: x */
    public static final String f105271x = "personMiddleInitial";

    /* JADX INFO: renamed from: y */
    public static final String f105272y = "personNamePrefix";

    /* JADX INFO: renamed from: z */
    public static final String f105273z = "personNameSuffix";

    private zj7() {
    }

    @efb
    public static String generateSmsOtpHintForCharacterPosition(int i) {
        z7d.checkArgumentInRange(i, 1, 8, "characterPosition");
        return (f105247L + i).intern();
    }
}
