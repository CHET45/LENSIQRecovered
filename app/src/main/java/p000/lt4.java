package p000;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {uh5.class})
@jjf(version = "1.6")
public final class lt4 {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ lt4[] f58679F;

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ v35 f58680H;

    /* JADX INFO: renamed from: a */
    @yfb
    public final TimeUnit f58687a;

    /* JADX INFO: renamed from: b */
    public static final lt4 f58681b = new lt4("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: c */
    public static final lt4 f58682c = new lt4("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: d */
    public static final lt4 f58683d = new lt4("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: e */
    public static final lt4 f58684e = new lt4("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: f */
    public static final lt4 f58685f = new lt4("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: m */
    public static final lt4 f58686m = new lt4("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: C */
    public static final lt4 f58678C = new lt4("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ lt4[] $values() {
        return new lt4[]{f58681b, f58682c, f58683d, f58684e, f58685f, f58686m, f58678C};
    }

    static {
        lt4[] lt4VarArr$values = $values();
        f58679F = lt4VarArr$values;
        f58680H = x35.enumEntries(lt4VarArr$values);
    }

    private lt4(String str, int i, TimeUnit timeUnit) {
        this.f58687a = timeUnit;
    }

    @yfb
    public static v35<lt4> getEntries() {
        return f58680H;
    }

    public static lt4 valueOf(String str) {
        return (lt4) Enum.valueOf(lt4.class, str);
    }

    public static lt4[] values() {
        return (lt4[]) f58679F.clone();
    }

    @yfb
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.f58687a;
    }
}
