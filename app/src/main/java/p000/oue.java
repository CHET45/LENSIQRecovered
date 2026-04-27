package p000;

import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface oue extends hue {

    /* JADX INFO: renamed from: oue$a */
    public static class C10660a extends hue.C7024b implements oue {
        public C10660a() {
            super(-9223372036854775807L);
        }

        @Override // p000.oue
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // p000.oue
        public long getTimeUs(long j) {
            return 0L;
        }
    }

    long getDataEndPosition();

    long getTimeUs(long j);
}
