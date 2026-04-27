package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class dre {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final dre f30493a = new dre();

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public static final owd f30494b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f30494b = new owd("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private dre() {
    }
}
