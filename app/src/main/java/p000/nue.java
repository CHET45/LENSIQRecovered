package p000;

import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
public interface nue extends gue {

    /* JADX INFO: renamed from: nue$a */
    public static class C10066a extends gue.C6549b implements nue {
        public C10066a() {
            super(-9223372036854775807L);
        }

        @Override // p000.nue
        public int getAverageBitrate() {
            return -2147483647;
        }

        @Override // p000.nue
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // p000.nue
        public long getDataStartPosition() {
            return 0L;
        }

        @Override // p000.nue
        public long getTimeUs(long j) {
            return 0L;
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getDataStartPosition();

    long getTimeUs(long j);
}
