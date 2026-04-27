package p000;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface dl1 {

    /* JADX INFO: renamed from: a */
    public static final long f29935a = -1;

    /* JADX INFO: renamed from: dl1$a */
    public static class C4842a extends IOException {
        public C4842a(String str) {
            super(str);
        }

        public C4842a(Throwable th) {
            super(th);
        }

        public C4842a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: dl1$b */
    public interface InterfaceC4843b {
        void onSpanAdded(dl1 dl1Var, mm1 mm1Var);

        void onSpanRemoved(dl1 dl1Var, mm1 mm1Var);

        void onSpanTouched(dl1 dl1Var, mm1 mm1Var, mm1 mm1Var2);
    }

    NavigableSet<mm1> addListener(String str, InterfaceC4843b interfaceC4843b);

    @xqi
    void applyContentMetadataMutations(String str, qw2 qw2Var) throws C4842a;

    @xqi
    void commitFile(File file, long j) throws C4842a;

    long getCacheSpace();

    long getCachedBytes(String str, long j, long j2);

    long getCachedLength(String str, long j, long j2);

    NavigableSet<mm1> getCachedSpans(String str);

    ow2 getContentMetadata(String str);

    Set<String> getKeys();

    long getUid();

    boolean isCached(String str, long j, long j2);

    @xqi
    void release();

    void releaseHoleSpan(mm1 mm1Var);

    void removeListener(String str, InterfaceC4843b interfaceC4843b);

    @xqi
    void removeResource(String str);

    @xqi
    void removeSpan(mm1 mm1Var);

    @xqi
    File startFile(String str, long j, long j2) throws C4842a;

    @xqi
    mm1 startReadWrite(String str, long j, long j2) throws InterruptedException, C4842a;

    @xqi
    @hib
    mm1 startReadWriteNonBlocking(String str, long j, long j2) throws C4842a;
}
