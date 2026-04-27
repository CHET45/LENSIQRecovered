package p000;

import java.io.IOException;
import java.util.Objects;
import p000.j21;
import p000.w26;

/* JADX INFO: loaded from: classes3.dex */
public final class o26 extends j21 {

    /* JADX INFO: renamed from: o26$b */
    public static final class C10150b implements j21.InterfaceC7724f {

        /* JADX INFO: renamed from: a */
        public final e36 f66270a;

        /* JADX INFO: renamed from: b */
        public final int f66271b;

        /* JADX INFO: renamed from: c */
        public final w26.C14366a f66272c;

        private long findNextFrame(ak5 ak5Var) throws IOException {
            while (ak5Var.getPeekPosition() < ak5Var.getLength() - 6 && !w26.checkFrameHeaderFromPeek(ak5Var, this.f66270a, this.f66271b, this.f66272c)) {
                ak5Var.advancePeekPosition(1);
            }
            if (ak5Var.getPeekPosition() < ak5Var.getLength() - 6) {
                return this.f66272c.f93125a;
            }
            ak5Var.advancePeekPosition((int) (ak5Var.getLength() - ak5Var.getPeekPosition()));
            return this.f66270a.f31650j;
        }

        @Override // p000.j21.InterfaceC7724f
        public j21.C7723e searchForTimestamp(ak5 ak5Var, long j) throws IOException {
            long position = ak5Var.getPosition();
            long jFindNextFrame = findNextFrame(ak5Var);
            long peekPosition = ak5Var.getPeekPosition();
            ak5Var.advancePeekPosition(Math.max(6, this.f66270a.f31643c));
            long jFindNextFrame2 = findNextFrame(ak5Var);
            return (jFindNextFrame > j || jFindNextFrame2 <= j) ? jFindNextFrame2 <= j ? j21.C7723e.underestimatedResult(jFindNextFrame2, ak5Var.getPeekPosition()) : j21.C7723e.overestimatedResult(jFindNextFrame, position) : j21.C7723e.targetFoundResult(peekPosition);
        }

        private C10150b(e36 e36Var, int i) {
            this.f66270a = e36Var;
            this.f66271b = i;
            this.f66272c = new w26.C14366a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o26(final e36 e36Var, int i, long j, long j2) {
        super(new j21.InterfaceC7722d() { // from class: n26
            @Override // p000.j21.InterfaceC7722d
            public final long timeUsToTargetTime(long j3) {
                return e36Var.getSampleNumber(j3);
            }
        }, new C10150b(e36Var, i), e36Var.getDurationUs(), 0L, e36Var.f31650j, j, j2, e36Var.getApproxBytesPerFrame(), Math.max(6, e36Var.f31643c));
        Objects.requireNonNull(e36Var);
    }
}
