package p000;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class lcd extends cr7 {

    /* JADX INFO: renamed from: d */
    public static final String f57194d = "PRIV";

    /* JADX INFO: renamed from: b */
    public final String f57195b;

    /* JADX INFO: renamed from: c */
    public final byte[] f57196c;

    public lcd(String str, byte[] bArr) {
        super("PRIV");
        this.f57195b = str;
        this.f57196c = bArr;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lcd.class != obj.getClass()) {
            return false;
        }
        lcd lcdVar = (lcd) obj;
        return Objects.equals(this.f57195b, lcdVar.f57195b) && Arrays.equals(this.f57196c, lcdVar.f57196c);
    }

    public int hashCode() {
        String str = this.f57195b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f57196c);
    }

    @Override // p000.cr7
    public String toString() {
        return this.f27130a + ": owner=" + this.f57195b;
    }
}
