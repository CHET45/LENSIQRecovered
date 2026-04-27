package p000;

import p000.mtg;

/* JADX INFO: loaded from: classes.dex */
public interface mtg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C9522a f62116a = C9522a.f62117a;

    /* JADX INFO: renamed from: mtg$a */
    public static final class C9522a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C9522a f62117a = new C9522a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final mtg f62118b = new mtg() { // from class: jtg
            @Override // p000.mtg
            public final boolean isIncluded(rud rudVar, rud rudVar2) {
                return rudVar.overlaps(rudVar2);
            }
        };

        /* JADX INFO: renamed from: c */
        @yfb
        public static final mtg f62119c = new mtg() { // from class: ktg
            @Override // p000.mtg
            public final boolean isIncluded(rud rudVar, rud rudVar2) {
                return mtg.C9522a.ContainsAll$lambda$1(rudVar, rudVar2);
            }
        };

        /* JADX INFO: renamed from: d */
        @yfb
        public static final mtg f62120d = new mtg() { // from class: ltg
            @Override // p000.mtg
            public final boolean isIncluded(rud rudVar, rud rudVar2) {
                return mtg.C9522a.ContainsCenter$lambda$2(rudVar, rudVar2);
            }
        };

        private C9522a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ContainsAll$lambda$1(rud rudVar, rud rudVar2) {
            return !rudVar2.isEmpty() && rudVar.getLeft() >= rudVar2.getLeft() && rudVar.getRight() <= rudVar2.getRight() && rudVar.getTop() >= rudVar2.getTop() && rudVar.getBottom() <= rudVar2.getBottom();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ContainsCenter$lambda$2(rud rudVar, rud rudVar2) {
            return rudVar2.m32199containsk4lQ0M(rudVar.m32203getCenterF1C5BW0());
        }

        @yfb
        public final mtg getAnyOverlap() {
            return f62118b;
        }

        @yfb
        public final mtg getContainsAll() {
            return f62119c;
        }

        @yfb
        public final mtg getContainsCenter() {
            return f62120d;
        }
    }

    boolean isIncluded(@yfb rud rudVar, @yfb rud rudVar2);
}
