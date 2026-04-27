package p000;

import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class yqg {

    /* JADX INFO: renamed from: a */
    public static final xqg f102667a = new C15768e(null, false);

    /* JADX INFO: renamed from: b */
    public static final xqg f102668b = new C15768e(null, true);

    /* JADX INFO: renamed from: c */
    public static final xqg f102669c;

    /* JADX INFO: renamed from: d */
    public static final xqg f102670d;

    /* JADX INFO: renamed from: e */
    public static final xqg f102671e;

    /* JADX INFO: renamed from: f */
    public static final xqg f102672f;

    /* JADX INFO: renamed from: g */
    public static final int f102673g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f102674h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f102675i = 2;

    /* JADX INFO: renamed from: yqg$a */
    public static class C15764a implements InterfaceC15766c {

        /* JADX INFO: renamed from: b */
        public static final C15764a f102676b = new C15764a(true);

        /* JADX INFO: renamed from: a */
        public final boolean f102677a;

        private C15764a(boolean z) {
            this.f102677a = z;
        }

        @Override // p000.yqg.InterfaceC15766c
        public int checkRtl(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iM26300a = yqg.m26300a(Character.getDirectionality(charSequence.charAt(i)));
                if (iM26300a != 0) {
                    if (iM26300a != 1) {
                        continue;
                        i++;
                        z = z;
                    } else if (!this.f102677a) {
                        return 1;
                    }
                } else if (this.f102677a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f102677a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: renamed from: yqg$b */
    public static class C15765b implements InterfaceC15766c {

        /* JADX INFO: renamed from: a */
        public static final C15765b f102678a = new C15765b();

        private C15765b() {
        }

        @Override // p000.yqg.InterfaceC15766c
        public int checkRtl(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iM26301b = 2;
            while (i < i3 && iM26301b == 2) {
                iM26301b = yqg.m26301b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iM26301b;
        }
    }

    /* JADX INFO: renamed from: yqg$c */
    public interface InterfaceC15766c {
        int checkRtl(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: renamed from: yqg$d */
    public static abstract class AbstractC15767d implements xqg {

        /* JADX INFO: renamed from: a */
        public final InterfaceC15766c f102679a;

        public AbstractC15767d(InterfaceC15766c interfaceC15766c) {
            this.f102679a = interfaceC15766c;
        }

        private boolean doCheck(CharSequence charSequence, int i, int i2) {
            int iCheckRtl = this.f102679a.checkRtl(charSequence, i, i2);
            if (iCheckRtl == 0) {
                return true;
            }
            if (iCheckRtl != 1) {
                return mo26302a();
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo26302a();

        @Override // p000.xqg
        public boolean isRtl(char[] cArr, int i, int i2) {
            return isRtl(CharBuffer.wrap(cArr), i, i2);
        }

        @Override // p000.xqg
        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f102679a == null ? mo26302a() : doCheck(charSequence, i, i2);
        }
    }

    /* JADX INFO: renamed from: yqg$e */
    public static class C15768e extends AbstractC15767d {

        /* JADX INFO: renamed from: b */
        public final boolean f102680b;

        public C15768e(InterfaceC15766c interfaceC15766c, boolean z) {
            super(interfaceC15766c);
            this.f102680b = z;
        }

        @Override // p000.yqg.AbstractC15767d
        /* JADX INFO: renamed from: a */
        public boolean mo26302a() {
            return this.f102680b;
        }
    }

    /* JADX INFO: renamed from: yqg$f */
    public static class C15769f extends AbstractC15767d {

        /* JADX INFO: renamed from: b */
        public static final C15769f f102681b = new C15769f();

        public C15769f() {
            super(null);
        }

        @Override // p000.yqg.AbstractC15767d
        /* JADX INFO: renamed from: a */
        public boolean mo26302a() {
            return nwg.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        C15765b c15765b = C15765b.f102678a;
        f102669c = new C15768e(c15765b, false);
        f102670d = new C15768e(c15765b, true);
        f102671e = new C15768e(C15764a.f102676b, false);
        f102672f = C15769f.f102681b;
    }

    private yqg() {
    }

    /* JADX INFO: renamed from: a */
    public static int m26300a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m26301b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
