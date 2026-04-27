package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface d6i {

    /* JADX INFO: renamed from: a */
    public static final d6i f28594a = new C4639a();

    /* JADX INFO: renamed from: d6i$a */
    public class C4639a implements d6i {

        /* JADX INFO: renamed from: d6i$a$a */
        public class a implements p9c {
            public a() {
            }
        }

        @Override // p000.d6i
        public xpf getOutputSize(List<xpf> list) {
            return list.get(0);
        }

        @Override // p000.d6i
        public p9c getOverlaySettings(int i, long j) {
            return new a();
        }
    }

    xpf getOutputSize(List<xpf> list);

    p9c getOverlaySettings(int i, long j);
}
