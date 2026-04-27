package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface wv9 {

    /* JADX INFO: renamed from: wv9$a */
    public static final class C14807a {
        @yfb
        public static C14808b getDestructured(@yfb wv9 wv9Var) {
            return new C14808b(wv9Var);
        }
    }

    /* JADX INFO: renamed from: wv9$b */
    public static final class C14808b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final wv9 f95555a;

        public C14808b(@yfb wv9 wv9Var) {
            md8.checkNotNullParameter(wv9Var, "match");
            this.f95555a = wv9Var;
        }

        @t28
        private final String component1() {
            return getMatch().getGroupValues().get(1);
        }

        @t28
        private final String component10() {
            return getMatch().getGroupValues().get(10);
        }

        @t28
        private final String component2() {
            return getMatch().getGroupValues().get(2);
        }

        @t28
        private final String component3() {
            return getMatch().getGroupValues().get(3);
        }

        @t28
        private final String component4() {
            return getMatch().getGroupValues().get(4);
        }

        @t28
        private final String component5() {
            return getMatch().getGroupValues().get(5);
        }

        @t28
        private final String component6() {
            return getMatch().getGroupValues().get(6);
        }

        @t28
        private final String component7() {
            return getMatch().getGroupValues().get(7);
        }

        @t28
        private final String component8() {
            return getMatch().getGroupValues().get(8);
        }

        @t28
        private final String component9() {
            return getMatch().getGroupValues().get(9);
        }

        @yfb
        public final wv9 getMatch() {
            return this.f95555a;
        }

        @yfb
        public final List<String> toList() {
            return this.f95555a.getGroupValues().subList(1, this.f95555a.getGroupValues().size());
        }
    }

    @yfb
    C14808b getDestructured();

    @yfb
    List<String> getGroupValues();

    @yfb
    uv9 getGroups();

    @yfb
    f78 getRange();

    @yfb
    String getValue();

    @gib
    wv9 next();
}
