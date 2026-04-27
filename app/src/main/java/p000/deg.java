package p000;

import androidx.media3.common.C1213a;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface deg {

    /* JADX INFO: renamed from: a */
    public static final deg f29540a = new C4773a();

    /* JADX INFO: renamed from: deg$a */
    public class C4773a implements deg {

        /* JADX INFO: renamed from: b */
        public final oz3 f29541b = new oz3();

        @Override // p000.deg
        public aeg createDecoder(C1213a c1213a) {
            String str = c1213a.f8291o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new ys1(str, c1213a.f8271L, 16000L);
                    case "application/cea-708":
                        return new ct1(c1213a.f8271L, c1213a.f8294r);
                }
            }
            if (!this.f29541b.supportsFormat(c1213a)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            peg pegVarCreate = this.f29541b.create(c1213a);
            return new u44(pegVarCreate.getClass().getSimpleName() + "Decoder", pegVarCreate);
        }

        @Override // p000.deg
        public boolean supportsFormat(C1213a c1213a) {
            String str = c1213a.f8291o;
            return this.f29541b.supportsFormat(c1213a) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }
    }

    aeg createDecoder(C1213a c1213a);

    boolean supportsFormat(C1213a c1213a);
}
