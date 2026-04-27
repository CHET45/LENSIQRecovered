package p000;

/* JADX INFO: loaded from: classes3.dex */
public enum a2f {
    QuoteFieldNames,
    UseSingleQuotes,
    WriteMapNullValue,
    WriteEnumUsingToString,
    UseISO8601DateFormat,
    WriteNullListAsEmpty,
    WriteNullStringAsEmpty,
    WriteNullNumberAsZero,
    WriteNullBooleanAsFalse,
    SkipTransientField,
    SortField,
    WriteTabAsSpecial,
    PrettyFormat,
    WriteClassName,
    DisableCircularReferenceDetect,
    WriteSlashAsSpecial,
    BrowserCompatible,
    WriteDateUseDateFormat,
    NotWriteRootClassName,
    DisableCheckSpecialChar,
    BeanToArray,
    WriteNonStringKeyAsString,
    NotWriteDefaultValue;


    /* JADX INFO: renamed from: e2 */
    public static final a2f[] f212e2 = new a2f[0];

    /* JADX INFO: renamed from: a */
    public final int f216a = 1 << ordinal();

    a2f() {
    }

    /* JADX INFO: renamed from: of */
    public static int m60of(a2f[] a2fVarArr) {
        if (a2fVarArr == null) {
            return 0;
        }
        int i = 0;
        for (a2f a2fVar : a2fVarArr) {
            i |= a2fVar.f216a;
        }
        return i;
    }
}
