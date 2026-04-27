package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface zca {

    /* JADX INFO: renamed from: a */
    public static final zca f104788a = new C16089a();

    /* JADX INFO: renamed from: zca$a */
    public class C16089a implements zca {
        @Override // p000.zca
        public long getChunkEndTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // p000.zca
        public long getChunkStartTimeUs() {
            throw new NoSuchElementException();
        }

        @Override // p000.zca
        public xh3 getDataSpec() {
            throw new NoSuchElementException();
        }

        @Override // p000.zca
        public boolean isEnded() {
            return true;
        }

        @Override // p000.zca
        public boolean next() {
            return false;
        }

        @Override // p000.zca
        public void reset() {
        }
    }

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    xh3 getDataSpec();

    boolean isEnded();

    boolean next();

    void reset();
}
