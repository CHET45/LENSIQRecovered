package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ox4
public final class shc {

    /* JADX INFO: renamed from: a */
    public final String f81841a;

    /* JADX INFO: renamed from: b */
    public final int f81842b;

    private shc(String rawValue, int radix) {
        this.f81841a = rawValue;
        this.f81842b = radix;
    }

    /* JADX INFO: renamed from: a */
    public static shc m22003a(String stringValue) {
        if (stringValue.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char cCharAt = stringValue.charAt(0);
        int i = 16;
        if (stringValue.startsWith("0x") || stringValue.startsWith("0X")) {
            stringValue = stringValue.substring(2);
        } else if (cCharAt == '#') {
            stringValue = stringValue.substring(1);
        } else if (cCharAt != '0' || stringValue.length() <= 1) {
            i = 10;
        } else {
            stringValue = stringValue.substring(1);
            i = 8;
        }
        return new shc(stringValue, i);
    }
}
