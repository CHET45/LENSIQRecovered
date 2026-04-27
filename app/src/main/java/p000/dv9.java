package p000;

import p000.dv9;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface dv9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C4966a f30987a = C4966a.f30988a;

    /* JADX INFO: renamed from: dv9$a */
    public static final class C4966a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C4966a f30988a = new C4966a();

        private C4966a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int fractionOfContainer$lambda$0(float f, c64 c64Var, int i, int i2) {
            return p3a.roundToInt(f * i2);
        }

        @yfb
        public final dv9 fractionOfContainer(final float f) {
            return new dv9() { // from class: cv9
                @Override // p000.dv9
                public final int calculateSpacing(c64 c64Var, int i, int i2) {
                    return dv9.C4966a.fractionOfContainer$lambda$0(f, c64Var, i, i2);
                }
            };
        }
    }

    int calculateSpacing(@yfb c64 c64Var, int i, int i2);
}
