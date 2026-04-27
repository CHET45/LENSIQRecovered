package p000;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@by4
public final class gj8 extends hc2 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final Pattern f39939a;

    /* JADX INFO: renamed from: gj8$a */
    public static final class C6337a extends gc2 {

        /* JADX INFO: renamed from: a */
        public final Matcher f39940a;

        public C6337a(Matcher matcher) {
            this.f39940a = (Matcher) v7d.checkNotNull(matcher);
        }

        @Override // p000.gc2
        public int end() {
            return this.f39940a.end();
        }

        @Override // p000.gc2
        public boolean find() {
            return this.f39940a.find();
        }

        @Override // p000.gc2
        public boolean matches() {
            return this.f39940a.matches();
        }

        @Override // p000.gc2
        public String replaceAll(String replacement) {
            return this.f39940a.replaceAll(replacement);
        }

        @Override // p000.gc2
        public int start() {
            return this.f39940a.start();
        }

        @Override // p000.gc2
        public boolean find(int index) {
            return this.f39940a.find(index);
        }
    }

    public gj8(Pattern pattern) {
        this.f39939a = (Pattern) v7d.checkNotNull(pattern);
    }

    @Override // p000.hc2
    public int flags() {
        return this.f39939a.flags();
    }

    @Override // p000.hc2
    public gc2 matcher(CharSequence t) {
        return new C6337a(this.f39939a.matcher(t));
    }

    @Override // p000.hc2
    public String pattern() {
        return this.f39939a.pattern();
    }

    @Override // p000.hc2
    public String toString() {
        return this.f39939a.toString();
    }
}
