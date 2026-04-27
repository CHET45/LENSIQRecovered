package p000;

import androidx.media3.common.C1213a;
import java.util.Objects;
import p000.kx7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface peg {

    /* JADX INFO: renamed from: peg$a */
    public interface InterfaceC10936a {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC10936a f70575a = new a();

        /* JADX INFO: renamed from: peg$a$a */
        public class a implements InterfaceC10936a {
            @Override // p000.peg.InterfaceC10936a
            public peg create(C1213a c1213a) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // p000.peg.InterfaceC10936a
            public int getCueReplacementBehavior(C1213a c1213a) {
                return 1;
            }

            @Override // p000.peg.InterfaceC10936a
            public boolean supportsFormat(C1213a c1213a) {
                return false;
            }
        }

        peg create(C1213a c1213a);

        int getCueReplacementBehavior(C1213a c1213a);

        boolean supportsFormat(C1213a c1213a);
    }

    /* JADX INFO: renamed from: peg$b */
    public static class C10937b {

        /* JADX INFO: renamed from: c */
        public static final C10937b f70576c = new C10937b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a */
        public final long f70577a;

        /* JADX INFO: renamed from: b */
        public final boolean f70578b;

        private C10937b(long j, boolean z) {
            this.f70577a = j;
            this.f70578b = z;
        }

        public static C10937b allCues() {
            return f70576c;
        }

        public static C10937b cuesAfterThenRemainingCuesBefore(long j) {
            return new C10937b(j, true);
        }

        public static C10937b onlyCuesAfter(long j) {
            return new C10937b(j, false);
        }
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i, int i2, C10937b c10937b, qu2<ba3> qu2Var);

    default void parse(byte[] bArr, C10937b c10937b, qu2<ba3> qu2Var) {
        parse(bArr, 0, bArr.length, c10937b, qu2Var);
    }

    default ydg parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        final kx7.C8541a c8541aBuilder = kx7.builder();
        C10937b c10937b = C10937b.f70576c;
        Objects.requireNonNull(c8541aBuilder);
        parse(bArr, i, i2, c10937b, new qu2() { // from class: oeg
            @Override // p000.qu2
            public final void accept(Object obj) {
                c8541aBuilder.add((ba3) obj);
            }
        });
        return new da3(c8541aBuilder.build());
    }

    default void reset() {
    }
}
