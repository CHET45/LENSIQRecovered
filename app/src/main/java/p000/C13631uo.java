package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: uo */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidAutofillType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillType.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillType_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
public final class C13631uo {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final HashMap<nm0, String> f88659a = xt9.hashMapOf(vkh.m24050to(nm0.EmailAddress, zj7.f105248a), vkh.m24050to(nm0.Username, zj7.f105250c), vkh.m24050to(nm0.Password, "password"), vkh.m24050to(nm0.NewUsername, zj7.f105240E), vkh.m24050to(nm0.NewPassword, zj7.f105241F), vkh.m24050to(nm0.PostalAddress, zj7.f105253f), vkh.m24050to(nm0.PostalCode, zj7.f105254g), vkh.m24050to(nm0.CreditCardNumber, zj7.f105255h), vkh.m24050to(nm0.CreditCardSecurityCode, zj7.f105256i), vkh.m24050to(nm0.CreditCardExpirationDate, zj7.f105257j), vkh.m24050to(nm0.CreditCardExpirationMonth, zj7.f105258k), vkh.m24050to(nm0.CreditCardExpirationYear, zj7.f105259l), vkh.m24050to(nm0.CreditCardExpirationDay, zj7.f105260m), vkh.m24050to(nm0.AddressCountry, zj7.f105261n), vkh.m24050to(nm0.AddressRegion, zj7.f105262o), vkh.m24050to(nm0.AddressLocality, zj7.f105263p), vkh.m24050to(nm0.AddressStreet, zj7.f105264q), vkh.m24050to(nm0.AddressAuxiliaryDetails, zj7.f105265r), vkh.m24050to(nm0.PostalCodeExtended, zj7.f105266s), vkh.m24050to(nm0.PersonFullName, zj7.f105267t), vkh.m24050to(nm0.PersonFirstName, zj7.f105268u), vkh.m24050to(nm0.PersonLastName, zj7.f105269v), vkh.m24050to(nm0.PersonMiddleName, zj7.f105270w), vkh.m24050to(nm0.PersonMiddleInitial, zj7.f105271x), vkh.m24050to(nm0.PersonNamePrefix, zj7.f105272y), vkh.m24050to(nm0.PersonNameSuffix, zj7.f105273z), vkh.m24050to(nm0.PhoneNumber, zj7.f105236A), vkh.m24050to(nm0.PhoneNumberDevice, zj7.f105237B), vkh.m24050to(nm0.PhoneCountryCode, zj7.f105238C), vkh.m24050to(nm0.PhoneNumberNational, zj7.f105239D), vkh.m24050to(nm0.Gender, zj7.f105242G), vkh.m24050to(nm0.BirthDateFull, zj7.f105243H), vkh.m24050to(nm0.BirthDateDay, zj7.f105244I), vkh.m24050to(nm0.BirthDateMonth, zj7.f105245J), vkh.m24050to(nm0.BirthDateYear, zj7.f105246K), vkh.m24050to(nm0.SmsOtpCode, zj7.f105247L));

    @ug5
    private static /* synthetic */ void getAndroidAutofillTypes$annotations() {
    }

    @yfb
    public static final String getAndroidType(@yfb nm0 nm0Var) {
        String str = f88659a.get(nm0Var);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }

    @ug5
    public static /* synthetic */ void getAndroidType$annotations(nm0 nm0Var) {
    }
}
