package p000;

/* JADX INFO: loaded from: classes5.dex */
public interface r33 {
    @efb
    r9b getSessionFileProvider(@efb String str);

    boolean hasCrashDataForCurrentSession();

    boolean hasCrashDataForSession(@efb String str);

    void prepareNativeSession(@efb String str, @efb String str2, long j, @efb z3g z3gVar);
}
