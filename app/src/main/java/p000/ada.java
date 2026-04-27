package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ada {

    /* JADX INFO: renamed from: a */
    public static final ada f1133a = new C0180a();

    /* JADX INFO: renamed from: ada$a */
    public class C0180a implements ada {
        @Override // p000.ada
        public long getChunkEndTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // p000.ada
        public long getChunkStartTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // p000.ada
        public yh3 getDataSpec() {
            throw new NoSuchElementException();
        }

        @Override // p000.ada
        public boolean isEnded() {
            return true;
        }

        @Override // p000.ada
        public boolean next() {
            return false;
        }

        @Override // p000.ada
        public void reset() {
        }
    }

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    yh3 getDataSpec();

    boolean isEnded();

    boolean next();

    void reset();
}
