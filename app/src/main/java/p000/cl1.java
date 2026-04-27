package p000;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface cl1 {

    /* JADX INFO: renamed from: a */
    public static final long f16864a = -1;

    /* JADX INFO: renamed from: cl1$a */
    public static class C2374a extends IOException {
        public C2374a(String str) {
            super(str);
        }

        public C2374a(Throwable th) {
            super(th);
        }

        public C2374a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: cl1$b */
    public interface InterfaceC2375b {
        void onSpanAdded(cl1 cl1Var, nm1 nm1Var);

        void onSpanRemoved(cl1 cl1Var, nm1 nm1Var);

        void onSpanTouched(cl1 cl1Var, nm1 nm1Var, nm1 nm1Var2);
    }

    NavigableSet<nm1> addListener(String str, InterfaceC2375b interfaceC2375b);

    @xqi
    void applyContentMetadataMutations(String str, rw2 rw2Var) throws C2374a;

    @xqi
    void commitFile(File file, long j) throws C2374a;

    long getCacheSpace();

    long getCachedBytes(String str, long j, long j2);

    long getCachedLength(String str, long j, long j2);

    NavigableSet<nm1> getCachedSpans(String str);

    pw2 getContentMetadata(String str);

    Set<String> getKeys();

    long getUid();

    boolean isCached(String str, long j, long j2);

    @xqi
    void release();

    void releaseHoleSpan(nm1 nm1Var);

    void removeListener(String str, InterfaceC2375b interfaceC2375b);

    @xqi
    void removeResource(String str);

    @xqi
    void removeSpan(nm1 nm1Var);

    @xqi
    File startFile(String str, long j, long j2) throws C2374a;

    @xqi
    nm1 startReadWrite(String str, long j, long j2) throws C2374a, InterruptedException;

    @xqi
    @hib
    nm1 startReadWriteNonBlocking(String str, long j, long j2) throws C2374a;
}
