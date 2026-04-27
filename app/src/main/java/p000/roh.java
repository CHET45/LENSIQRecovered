package p000;

import com.arthenica.ffmpegkit.MediaInformation;

/* JADX INFO: loaded from: classes7.dex */
public final class roh {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ byte m21455a(String str, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return goh.m29786constructorimpl(tj7.hexToByte(str, uj7Var));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ byte[] m21456b(String str, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return hoh.m30083constructorimpl(tj7.hexToByteArray(str, uj7Var));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m21457c(String str, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return woh.m33004constructorimpl(tj7.hexToInt(str, uj7Var));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m21458d(String str, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return oph.m31533constructorimpl(tj7.hexToLong(str, uj7Var));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ short m21459e(String str, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return iqh.m30324constructorimpl(tj7.hexToShort(str, uj7Var));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m21460f(int i, uj7 uj7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(i, uj7Var);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m21461g(long j, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(j, uj7Var);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m21462h(byte b, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(b, uj7Var);
    }

    @rh5
    @jjf(version = "1.9")
    @t28
    private static final byte hexToUByte(String str, uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return goh.m29786constructorimpl(tj7.hexToByte(str, uj7Var));
    }

    @jjf(version = "1.9")
    @t28
    @rh5
    @yh5
    private static final byte[] hexToUByteArray(String str, uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return hoh.m30083constructorimpl(tj7.hexToByteArray(str, uj7Var));
    }

    @rh5
    @jjf(version = "1.9")
    @t28
    private static final int hexToUInt(String str, uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return woh.m33004constructorimpl(tj7.hexToInt(str, uj7Var));
    }

    @rh5
    @jjf(version = "1.9")
    @t28
    private static final long hexToULong(String str, uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return oph.m31533constructorimpl(tj7.hexToLong(str, uj7Var));
    }

    @rh5
    @jjf(version = "1.9")
    @t28
    private static final short hexToUShort(String str, uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return iqh.m30324constructorimpl(tj7.hexToShort(str, uj7Var));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m21463i(byte[] bArr, int i, int i2, uj7 uj7Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = hoh.m30089getSizeimpl(bArr);
        }
        if ((i3 & 4) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(bArr, "$this$toHexString");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(bArr, i, i2, uj7Var);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m21464j(short s, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(s, uj7Var);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m21465k(byte[] bArr, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        md8.checkNotNullParameter(bArr, "$this$toHexString");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(bArr, uj7Var);
    }

    @rh5
    @jjf(version = "1.9")
    @t28
    /* JADX INFO: renamed from: toHexString-8M7LxHw, reason: not valid java name */
    private static final String m32155toHexString8M7LxHw(int i, uj7 uj7Var) {
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(i, uj7Var);
    }

    @rh5
    @jjf(version = "1.9")
    @t28
    /* JADX INFO: renamed from: toHexString-8UJCm-I, reason: not valid java name */
    private static final String m32156toHexString8UJCmI(long j, uj7 uj7Var) {
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(j, uj7Var);
    }

    @rh5
    @jjf(version = "1.9")
    @t28
    /* JADX INFO: renamed from: toHexString-ZQbaR00, reason: not valid java name */
    private static final String m32157toHexStringZQbaR00(byte b, uj7 uj7Var) {
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(b, uj7Var);
    }

    @jjf(version = "1.9")
    @t28
    @rh5
    @yh5
    /* JADX INFO: renamed from: toHexString-lZCiFrA, reason: not valid java name */
    private static final String m32158toHexStringlZCiFrA(byte[] bArr, int i, int i2, uj7 uj7Var) {
        md8.checkNotNullParameter(bArr, "$this$toHexString");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(bArr, i, i2, uj7Var);
    }

    @rh5
    @jjf(version = "1.9")
    @t28
    /* JADX INFO: renamed from: toHexString-r3ox_E0, reason: not valid java name */
    private static final String m32159toHexStringr3ox_E0(short s, uj7 uj7Var) {
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(s, uj7Var);
    }

    @jjf(version = "1.9")
    @t28
    @rh5
    @yh5
    /* JADX INFO: renamed from: toHexString-zHuV2wU, reason: not valid java name */
    private static final String m32160toHexStringzHuV2wU(byte[] bArr, uj7 uj7Var) {
        md8.checkNotNullParameter(bArr, "$this$toHexString");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return tj7.toHexString(bArr, uj7Var);
    }
}
