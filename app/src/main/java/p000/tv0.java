package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class tv0 implements qt8 {

    /* JADX INFO: renamed from: e */
    public static final long f86029e = 1000000000000L;

    /* JADX INFO: renamed from: f */
    public static final int f86030f = 1000000000;

    /* JADX INFO: renamed from: g */
    public static final int f86031g = 1000000;

    /* JADX INFO: renamed from: h */
    public static final int f86032h = 1000;

    @Override // p000.qt8
    @efb
    public String getFormattedValue(float f) {
        return f >= 1.0E12f ? String.format(Locale.US, "%.1fT", Float.valueOf(f / 1.0E12f)) : f >= 1.0E9f ? String.format(Locale.US, "%.1fB", Float.valueOf(f / 1.0E9f)) : f >= 1000000.0f ? String.format(Locale.US, "%.1fM", Float.valueOf(f / 1000000.0f)) : f >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f));
    }
}
