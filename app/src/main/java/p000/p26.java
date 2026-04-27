package p000;

import java.io.IOException;
import java.util.Objects;
import p000.k21;
import p000.x26;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p26 extends k21 {

    /* JADX INFO: renamed from: p26$b */
    public static final class C10763b implements k21.InterfaceC8173f {

        /* JADX INFO: renamed from: a */
        public final f36 f69469a;

        /* JADX INFO: renamed from: b */
        public final int f69470b;

        /* JADX INFO: renamed from: c */
        public final x26.C14885a f69471c;

        private long findNextFrame(zj5 zj5Var) throws IOException {
            while (zj5Var.getPeekPosition() < zj5Var.getLength() - 6 && !x26.checkFrameHeaderFromPeek(zj5Var, this.f69469a, this.f69470b, this.f69471c)) {
                zj5Var.advancePeekPosition(1);
            }
            if (zj5Var.getPeekPosition() < zj5Var.getLength() - 6) {
                return this.f69471c.f96092a;
            }
            zj5Var.advancePeekPosition((int) (zj5Var.getLength() - zj5Var.getPeekPosition()));
            return this.f69469a.f34989j;
        }

        @Override // p000.k21.InterfaceC8173f
        public k21.C8172e searchForTimestamp(zj5 zj5Var, long j) throws IOException {
            long position = zj5Var.getPosition();
            long jFindNextFrame = findNextFrame(zj5Var);
            long peekPosition = zj5Var.getPeekPosition();
            zj5Var.advancePeekPosition(Math.max(6, this.f69469a.f34982c));
            long jFindNextFrame2 = findNextFrame(zj5Var);
            return (jFindNextFrame > j || jFindNextFrame2 <= j) ? jFindNextFrame2 <= j ? k21.C8172e.underestimatedResult(jFindNextFrame2, zj5Var.getPeekPosition()) : k21.C8172e.overestimatedResult(jFindNextFrame, position) : k21.C8172e.targetFoundResult(peekPosition);
        }

        private C10763b(f36 f36Var, int i) {
            this.f69469a = f36Var;
            this.f69470b = i;
            this.f69471c = new x26.C14885a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p26(final f36 f36Var, int i, long j, long j2) {
        super(new k21.InterfaceC8171d() { // from class: m26
            @Override // p000.k21.InterfaceC8171d
            public final long timeUsToTargetTime(long j3) {
                return f36Var.getSampleNumber(j3);
            }
        }, new C10763b(f36Var, i), f36Var.getDurationUs(), 0L, f36Var.f34989j, j, j2, f36Var.getApproxBytesPerFrame(), Math.max(6, f36Var.f34982c));
        Objects.requireNonNull(f36Var);
    }
}
