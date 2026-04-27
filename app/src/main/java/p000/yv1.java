package p000;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@by4
public abstract class yv1 implements l8d<Character> {

    /* JADX INFO: renamed from: a */
    public static final int f103057a = 65536;

    /* JADX INFO: renamed from: yv1$a */
    public class C15819a extends C15845x {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f103058c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15819a(final yv1 this$0, yv1 original, final String val$description) {
            super(original);
            this.f103058c = val$description;
        }

        @Override // p000.yv1.C15844w, p000.yv1
        public String toString() {
            return this.f103058c;
        }
    }

    /* JADX INFO: renamed from: yv1$a0 */
    public static class C15820a0 extends yv1 {

        /* JADX INFO: renamed from: b */
        public final String f103059b;

        /* JADX INFO: renamed from: c */
        public final char[] f103060c;

        /* JADX INFO: renamed from: d */
        public final char[] f103061d;

        public C15820a0(String description, char[] rangeStarts, char[] rangeEnds) {
            this.f103059b = description;
            this.f103060c = rangeStarts;
            this.f103061d = rangeEnds;
            v7d.checkArgument(rangeStarts.length == rangeEnds.length);
            int i = 0;
            while (i < rangeStarts.length) {
                v7d.checkArgument(rangeStarts[i] <= rangeEnds[i]);
                int i2 = i + 1;
                if (i2 < rangeStarts.length) {
                    v7d.checkArgument(rangeEnds[i] < rangeStarts[i2]);
                }
                i = i2;
            }
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            int iBinarySearch = Arrays.binarySearch(this.f103060c, c);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i = (~iBinarySearch) - 1;
            return i >= 0 && c <= this.f103061d[i];
        }

        @Override // p000.yv1
        public String toString() {
            return this.f103059b;
        }
    }

    /* JADX INFO: renamed from: yv1$b */
    public static final class C15821b extends yv1 {

        /* JADX INFO: renamed from: b */
        public final yv1 f103062b;

        /* JADX INFO: renamed from: c */
        public final yv1 f103063c;

        public C15821b(yv1 a, yv1 b) {
            this.f103062b = (yv1) v7d.checkNotNull(a);
            this.f103063c = (yv1) v7d.checkNotNull(b);
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        @jd7
        @yg8
        /* JADX INFO: renamed from: c */
        public void mo22759c(BitSet table) {
            BitSet bitSet = new BitSet();
            this.f103062b.mo22759c(bitSet);
            BitSet bitSet2 = new BitSet();
            this.f103063c.mo22759c(bitSet2);
            bitSet.and(bitSet2);
            table.or(bitSet);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return this.f103062b.matches(c) && this.f103063c.matches(c);
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.and(" + this.f103062b + ", " + this.f103063c + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: yv1$b0 */
    public static final class C15822b0 extends C15820a0 {

        /* JADX INFO: renamed from: e */
        public static final C15822b0 f103064e = new C15822b0();

        private C15822b0() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    /* JADX INFO: renamed from: yv1$c */
    public static final class C15823c extends AbstractC15843v {

        /* JADX INFO: renamed from: c */
        public static final C15823c f103065c = new C15823c();

        private C15823c() {
            super("CharMatcher.any()");
        }

        @Override // p000.yv1
        public yv1 and(yv1 other) {
            return (yv1) v7d.checkNotNull(other);
        }

        @Override // p000.yv1
        public String collapseFrom(CharSequence sequence, char replacement) {
            return sequence.length() == 0 ? "" : String.valueOf(replacement);
        }

        @Override // p000.yv1
        public int countIn(CharSequence sequence) {
            return sequence.length();
        }

        @Override // p000.yv1
        public int indexIn(CharSequence sequence) {
            return sequence.length() == 0 ? -1 : 0;
        }

        @Override // p000.yv1
        public int lastIndexIn(CharSequence sequence) {
            return sequence.length() - 1;
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return true;
        }

        @Override // p000.yv1
        public boolean matchesAllOf(CharSequence sequence) {
            v7d.checkNotNull(sequence);
            return true;
        }

        @Override // p000.yv1
        public boolean matchesNoneOf(CharSequence sequence) {
            return sequence.length() == 0;
        }

        @Override // p000.yv1.AbstractC15830i, p000.yv1
        public yv1 negate() {
            return yv1.none();
        }

        @Override // p000.yv1
        /* JADX INFO: renamed from: or */
        public yv1 mo26362or(yv1 other) {
            v7d.checkNotNull(other);
            return this;
        }

        @Override // p000.yv1
        public String removeFrom(CharSequence sequence) {
            v7d.checkNotNull(sequence);
            return "";
        }

        @Override // p000.yv1
        public String replaceFrom(CharSequence sequence, char replacement) {
            char[] cArr = new char[sequence.length()];
            Arrays.fill(cArr, replacement);
            return new String(cArr);
        }

        @Override // p000.yv1
        public String trimFrom(CharSequence sequence) {
            v7d.checkNotNull(sequence);
            return "";
        }

        @Override // p000.yv1
        public int indexIn(CharSequence sequence, int start) {
            int length = sequence.length();
            v7d.checkPositionIndex(start, length);
            if (start == length) {
                return -1;
            }
            return start;
        }

        @Override // p000.yv1
        public String replaceFrom(CharSequence sequence, CharSequence replacement) {
            StringBuilder sb = new StringBuilder(sequence.length() * replacement.length());
            for (int i = 0; i < sequence.length(); i++) {
                sb.append(replacement);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: yv1$c0 */
    @gdi
    public static final class C15824c0 extends AbstractC15843v {

        /* JADX INFO: renamed from: c */
        public static final String f103066c = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";

        /* JADX INFO: renamed from: d */
        public static final int f103067d = 1682554634;

        /* JADX INFO: renamed from: e */
        public static final int f103068e = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: f */
        public static final C15824c0 f103069f = new C15824c0();

        public C15824c0() {
            super("CharMatcher.whitespace()");
        }

        @Override // p000.yv1
        @jd7
        @yg8
        /* JADX INFO: renamed from: c */
        public void mo22759c(BitSet table) {
            for (int i = 0; i < 32; i++) {
                table.set(f103066c.charAt(i));
            }
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return f103066c.charAt((f103067d * c) >>> f103068e) == c;
        }
    }

    /* JADX INFO: renamed from: yv1$d */
    public static final class C15825d extends yv1 {

        /* JADX INFO: renamed from: b */
        public final char[] f103070b;

        public C15825d(CharSequence chars) {
            char[] charArray = chars.toString().toCharArray();
            this.f103070b = charArray;
            Arrays.sort(charArray);
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        @jd7
        @yg8
        /* JADX INFO: renamed from: c */
        public void mo22759c(BitSet table) {
            for (char c : this.f103070b) {
                table.set(c);
            }
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return Arrays.binarySearch(this.f103070b, c) >= 0;
        }

        @Override // p000.yv1
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.f103070b) {
                sb.append(yv1.showCharacter(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: yv1$e */
    public static final class C15826e extends AbstractC15843v {

        /* JADX INFO: renamed from: c */
        public static final C15826e f103071c = new C15826e();

        public C15826e() {
            super("CharMatcher.ascii()");
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return c <= 127;
        }
    }

    /* JADX INFO: renamed from: yv1$f */
    @jd7
    @yg8
    public static final class C15827f extends AbstractC15843v {

        /* JADX INFO: renamed from: c */
        public final BitSet f103072c;

        public /* synthetic */ C15827f(BitSet bitSet, String str, C15819a c15819a) {
            this(bitSet, str);
        }

        @Override // p000.yv1
        /* JADX INFO: renamed from: c */
        public void mo22759c(BitSet bitSet) {
            bitSet.or(this.f103072c);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return this.f103072c.get(c);
        }

        private C15827f(BitSet table, String description) {
            super(description);
            this.f103072c = table.length() + 64 < table.size() ? (BitSet) table.clone() : table;
        }
    }

    /* JADX INFO: renamed from: yv1$g */
    public static final class C15828g extends yv1 {

        /* JADX INFO: renamed from: b */
        public static final yv1 f103073b = new C15828g();

        private C15828g() {
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c == 8199) {
                    return false;
                }
                if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            if (c < 8192 || c > 8202) {
                            }
                            break;
                    }
                    return false;
                }
            }
            return true;
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* JADX INFO: renamed from: yv1$h */
    public static final class C15829h extends C15820a0 {

        /* JADX INFO: renamed from: e */
        public static final String f103074e = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        /* JADX INFO: renamed from: f */
        public static final C15829h f103075f = new C15829h();

        private C15829h() {
            super("CharMatcher.digit()", zeroes(), nines());
        }

        private static char[] nines() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) (f103074e.charAt(i) + '\t');
            }
            return cArr;
        }

        private static char[] zeroes() {
            return f103074e.toCharArray();
        }
    }

    /* JADX INFO: renamed from: yv1$i */
    public static abstract class AbstractC15830i extends yv1 {
        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        public yv1 negate() {
            return new C15845x(this);
        }

        @Override // p000.yv1
        public final yv1 precomputed() {
            return this;
        }
    }

    /* JADX INFO: renamed from: yv1$j */
    public static final class C15831j extends yv1 {

        /* JADX INFO: renamed from: b */
        public final l8d<? super Character> f103076b;

        public C15831j(l8d<? super Character> predicate) {
            this.f103076b = (l8d) v7d.checkNotNull(predicate);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return this.f103076b.apply(Character.valueOf(c));
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f103076b + c0b.f15434d;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.yv1, p000.l8d
        public boolean apply(Character character) {
            return this.f103076b.apply(v7d.checkNotNull(character));
        }
    }

    /* JADX INFO: renamed from: yv1$k */
    public static final class C15832k extends AbstractC15830i {

        /* JADX INFO: renamed from: b */
        public final char f103077b;

        /* JADX INFO: renamed from: c */
        public final char f103078c;

        public C15832k(char startInclusive, char endInclusive) {
            v7d.checkArgument(endInclusive >= startInclusive);
            this.f103077b = startInclusive;
            this.f103078c = endInclusive;
        }

        @Override // p000.yv1
        @jd7
        @yg8
        /* JADX INFO: renamed from: c */
        public void mo22759c(BitSet table) {
            table.set(this.f103077b, this.f103078c + 1);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return this.f103077b <= c && c <= this.f103078c;
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.inRange('" + yv1.showCharacter(this.f103077b) + "', '" + yv1.showCharacter(this.f103078c) + "')";
        }
    }

    /* JADX INFO: renamed from: yv1$l */
    public static final class C15833l extends C15820a0 {

        /* JADX INFO: renamed from: e */
        public static final String f103079e = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        /* JADX INFO: renamed from: f */
        public static final String f103080f = "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";

        /* JADX INFO: renamed from: m */
        public static final C15833l f103081m = new C15833l();

        private C15833l() {
            super("CharMatcher.invisible()", f103079e.toCharArray(), f103080f.toCharArray());
        }
    }

    /* JADX INFO: renamed from: yv1$m */
    public static final class C15834m extends AbstractC15830i {

        /* JADX INFO: renamed from: b */
        public final char f103082b;

        public C15834m(char match) {
            this.f103082b = match;
        }

        @Override // p000.yv1
        public yv1 and(yv1 other) {
            return other.matches(this.f103082b) ? this : yv1.none();
        }

        @Override // p000.yv1
        @jd7
        @yg8
        /* JADX INFO: renamed from: c */
        public void mo22759c(BitSet table) {
            table.set(this.f103082b);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return c == this.f103082b;
        }

        @Override // p000.yv1.AbstractC15830i, p000.yv1
        public yv1 negate() {
            return yv1.isNot(this.f103082b);
        }

        @Override // p000.yv1
        /* JADX INFO: renamed from: or */
        public yv1 mo26362or(yv1 other) {
            return other.matches(this.f103082b) ? other : super.mo26362or(other);
        }

        @Override // p000.yv1
        public String replaceFrom(CharSequence sequence, char replacement) {
            return sequence.toString().replace(this.f103082b, replacement);
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.is('" + yv1.showCharacter(this.f103082b) + "')";
        }
    }

    /* JADX INFO: renamed from: yv1$n */
    public static final class C15835n extends AbstractC15830i {

        /* JADX INFO: renamed from: b */
        public final char f103083b;

        /* JADX INFO: renamed from: c */
        public final char f103084c;

        public C15835n(char match1, char match2) {
            this.f103083b = match1;
            this.f103084c = match2;
        }

        @Override // p000.yv1
        @jd7
        @yg8
        /* JADX INFO: renamed from: c */
        public void mo22759c(BitSet table) {
            table.set(this.f103083b);
            table.set(this.f103084c);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return c == this.f103083b || c == this.f103084c;
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.anyOf(\"" + yv1.showCharacter(this.f103083b) + yv1.showCharacter(this.f103084c) + "\")";
        }
    }

    /* JADX INFO: renamed from: yv1$o */
    public static final class C15836o extends AbstractC15830i {

        /* JADX INFO: renamed from: b */
        public final char f103085b;

        public C15836o(char match) {
            this.f103085b = match;
        }

        @Override // p000.yv1
        public yv1 and(yv1 other) {
            return other.matches(this.f103085b) ? super.and(other) : other;
        }

        @Override // p000.yv1
        @jd7
        @yg8
        /* JADX INFO: renamed from: c */
        public void mo22759c(BitSet table) {
            table.set(0, this.f103085b);
            table.set(this.f103085b + 1, 65536);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return c != this.f103085b;
        }

        @Override // p000.yv1.AbstractC15830i, p000.yv1
        public yv1 negate() {
            return yv1.m26360is(this.f103085b);
        }

        @Override // p000.yv1
        /* JADX INFO: renamed from: or */
        public yv1 mo26362or(yv1 other) {
            return other.matches(this.f103085b) ? yv1.any() : this;
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.isNot('" + yv1.showCharacter(this.f103085b) + "')";
        }
    }

    /* JADX INFO: renamed from: yv1$p */
    public static final class C15837p extends yv1 {

        /* JADX INFO: renamed from: b */
        public static final C15837p f103086b = new C15837p();

        private C15837p() {
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return Character.isDigit(c);
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* JADX INFO: renamed from: yv1$q */
    public static final class C15838q extends AbstractC15843v {

        /* JADX INFO: renamed from: c */
        public static final C15838q f103087c = new C15838q();

        private C15838q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return c <= 31 || (c >= 127 && c <= 159);
        }
    }

    /* JADX INFO: renamed from: yv1$r */
    public static final class C15839r extends yv1 {

        /* JADX INFO: renamed from: b */
        public static final C15839r f103088b = new C15839r();

        private C15839r() {
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return Character.isLetter(c);
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* JADX INFO: renamed from: yv1$s */
    public static final class C15840s extends yv1 {

        /* JADX INFO: renamed from: b */
        public static final C15840s f103089b = new C15840s();

        private C15840s() {
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return Character.isLetterOrDigit(c);
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* JADX INFO: renamed from: yv1$t */
    public static final class C15841t extends yv1 {

        /* JADX INFO: renamed from: b */
        public static final C15841t f103090b = new C15841t();

        private C15841t() {
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return Character.isLowerCase(c);
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* JADX INFO: renamed from: yv1$u */
    public static final class C15842u extends yv1 {

        /* JADX INFO: renamed from: b */
        public static final C15842u f103091b = new C15842u();

        private C15842u() {
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return Character.isUpperCase(c);
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* JADX INFO: renamed from: yv1$v */
    public static abstract class AbstractC15843v extends AbstractC15830i {

        /* JADX INFO: renamed from: b */
        public final String f103092b;

        public AbstractC15843v(String description) {
            this.f103092b = (String) v7d.checkNotNull(description);
        }

        @Override // p000.yv1
        public final String toString() {
            return this.f103092b;
        }
    }

    /* JADX INFO: renamed from: yv1$w */
    public static class C15844w extends yv1 {

        /* JADX INFO: renamed from: b */
        public final yv1 f103093b;

        public C15844w(yv1 original) {
            this.f103093b = (yv1) v7d.checkNotNull(original);
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        @jd7
        @yg8
        /* JADX INFO: renamed from: c */
        public void mo22759c(BitSet table) {
            BitSet bitSet = new BitSet();
            this.f103093b.mo22759c(bitSet);
            bitSet.flip(0, 65536);
            table.or(bitSet);
        }

        @Override // p000.yv1
        public int countIn(CharSequence sequence) {
            return sequence.length() - this.f103093b.countIn(sequence);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return !this.f103093b.matches(c);
        }

        @Override // p000.yv1
        public boolean matchesAllOf(CharSequence sequence) {
            return this.f103093b.matchesNoneOf(sequence);
        }

        @Override // p000.yv1
        public boolean matchesNoneOf(CharSequence sequence) {
            return this.f103093b.matchesAllOf(sequence);
        }

        @Override // p000.yv1
        public yv1 negate() {
            return this.f103093b;
        }

        @Override // p000.yv1
        public String toString() {
            return this.f103093b + ".negate()";
        }
    }

    /* JADX INFO: renamed from: yv1$x */
    public static class C15845x extends C15844w {
        public C15845x(yv1 original) {
            super(original);
        }

        @Override // p000.yv1
        public final yv1 precomputed() {
            return this;
        }
    }

    /* JADX INFO: renamed from: yv1$y */
    public static final class C15846y extends AbstractC15843v {

        /* JADX INFO: renamed from: c */
        public static final C15846y f103094c = new C15846y();

        private C15846y() {
            super("CharMatcher.none()");
        }

        @Override // p000.yv1
        public yv1 and(yv1 other) {
            v7d.checkNotNull(other);
            return this;
        }

        @Override // p000.yv1
        public String collapseFrom(CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // p000.yv1
        public int countIn(CharSequence sequence) {
            v7d.checkNotNull(sequence);
            return 0;
        }

        @Override // p000.yv1
        public int indexIn(CharSequence sequence) {
            v7d.checkNotNull(sequence);
            return -1;
        }

        @Override // p000.yv1
        public int lastIndexIn(CharSequence sequence) {
            v7d.checkNotNull(sequence);
            return -1;
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return false;
        }

        @Override // p000.yv1
        public boolean matchesAllOf(CharSequence sequence) {
            return sequence.length() == 0;
        }

        @Override // p000.yv1
        public boolean matchesNoneOf(CharSequence sequence) {
            v7d.checkNotNull(sequence);
            return true;
        }

        @Override // p000.yv1.AbstractC15830i, p000.yv1
        public yv1 negate() {
            return yv1.any();
        }

        @Override // p000.yv1
        /* JADX INFO: renamed from: or */
        public yv1 mo26362or(yv1 other) {
            return (yv1) v7d.checkNotNull(other);
        }

        @Override // p000.yv1
        public String removeFrom(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // p000.yv1
        public String replaceFrom(CharSequence sequence, char replacement) {
            return sequence.toString();
        }

        @Override // p000.yv1
        public String trimFrom(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // p000.yv1
        public String trimLeadingFrom(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // p000.yv1
        public String trimTrailingFrom(CharSequence sequence) {
            return sequence.toString();
        }

        @Override // p000.yv1
        public int indexIn(CharSequence sequence, int start) {
            v7d.checkPositionIndex(start, sequence.length());
            return -1;
        }

        @Override // p000.yv1
        public String replaceFrom(CharSequence sequence, CharSequence replacement) {
            v7d.checkNotNull(replacement);
            return sequence.toString();
        }
    }

    /* JADX INFO: renamed from: yv1$z */
    public static final class C15847z extends yv1 {

        /* JADX INFO: renamed from: b */
        public final yv1 f103095b;

        /* JADX INFO: renamed from: c */
        public final yv1 f103096c;

        public C15847z(yv1 a, yv1 b) {
            this.f103095b = (yv1) v7d.checkNotNull(a);
            this.f103096c = (yv1) v7d.checkNotNull(b);
        }

        @Override // p000.yv1, p000.l8d
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character character) {
            return super.apply(character);
        }

        @Override // p000.yv1
        @jd7
        @yg8
        /* JADX INFO: renamed from: c */
        public void mo22759c(BitSet table) {
            this.f103095b.mo22759c(table);
            this.f103096c.mo22759c(table);
        }

        @Override // p000.yv1
        public boolean matches(char c) {
            return this.f103095b.matches(c) || this.f103096c.matches(c);
        }

        @Override // p000.yv1
        public String toString() {
            return "CharMatcher.or(" + this.f103095b + ", " + this.f103096c + c0b.f15434d;
        }
    }

    public static yv1 any() {
        return C15823c.f103065c;
    }

    public static yv1 anyOf(final CharSequence sequence) {
        int length = sequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new C15825d(sequence) : isEither(sequence.charAt(0), sequence.charAt(1)) : m26360is(sequence.charAt(0)) : none();
    }

    public static yv1 ascii() {
        return C15826e.f103071c;
    }

    public static yv1 breakingWhitespace() {
        return C15828g.f103073b;
    }

    @Deprecated
    public static yv1 digit() {
        return C15829h.f103075f;
    }

    private String finishCollapseFrom(CharSequence sequence, int start, int end, char replacement, StringBuilder builder, boolean inMatchingGroup) {
        while (start < end) {
            char cCharAt = sequence.charAt(start);
            if (!matches(cCharAt)) {
                builder.append(cCharAt);
                inMatchingGroup = false;
            } else if (!inMatchingGroup) {
                builder.append(replacement);
                inMatchingGroup = true;
            }
            start++;
        }
        return builder.toString();
    }

    public static yv1 forPredicate(final l8d<? super Character> predicate) {
        return predicate instanceof yv1 ? (yv1) predicate : new C15831j(predicate);
    }

    public static yv1 inRange(final char startInclusive, final char endInclusive) {
        return new C15832k(startInclusive, endInclusive);
    }

    @Deprecated
    public static yv1 invisible() {
        return C15833l.f103081m;
    }

    /* JADX INFO: renamed from: is */
    public static yv1 m26360is(final char match) {
        return new C15834m(match);
    }

    private static C15835n isEither(char c1, char c2) {
        return new C15835n(c1, c2);
    }

    public static yv1 isNot(final char match) {
        return new C15836o(match);
    }

    @jd7
    @yg8
    private static boolean isSmall(int totalCharacters, int tableLength) {
        return totalCharacters <= 1023 && tableLength > totalCharacters * 64;
    }

    @Deprecated
    public static yv1 javaDigit() {
        return C15837p.f103086b;
    }

    public static yv1 javaIsoControl() {
        return C15838q.f103087c;
    }

    @Deprecated
    public static yv1 javaLetter() {
        return C15839r.f103088b;
    }

    @Deprecated
    public static yv1 javaLetterOrDigit() {
        return C15840s.f103089b;
    }

    @Deprecated
    public static yv1 javaLowerCase() {
        return C15841t.f103090b;
    }

    @Deprecated
    public static yv1 javaUpperCase() {
        return C15842u.f103091b;
    }

    public static yv1 none() {
        return C15846y.f103094c;
    }

    public static yv1 noneOf(CharSequence sequence) {
        return anyOf(sequence).negate();
    }

    @jd7
    @yg8
    private static yv1 precomputedPositive(int totalCharacters, BitSet table, String description) {
        if (totalCharacters == 0) {
            return none();
        }
        if (totalCharacters == 1) {
            return m26360is((char) table.nextSetBit(0));
        }
        if (totalCharacters != 2) {
            return isSmall(totalCharacters, table.length()) ? trf.m22757e(table, description) : new C15827f(table, description, null);
        }
        char cNextSetBit = (char) table.nextSetBit(0);
        return isEither(cNextSetBit, (char) table.nextSetBit(cNextSetBit + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = C4584d2.f28247p;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static yv1 singleWidth() {
        return C15822b0.f103064e;
    }

    public static yv1 whitespace() {
        return C15824c0.f103069f;
    }

    public yv1 and(yv1 other) {
        return new C15821b(this, other);
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: b */
    public yv1 m26361b() {
        String strSubstring;
        BitSet bitSet = new BitSet();
        mo22759c(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return precomputedPositive(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - iCardinality;
        String string = toString();
        if (string.endsWith(".negate()")) {
            strSubstring = string.substring(0, string.length() - 9);
        } else {
            strSubstring = string + ".negate()";
        }
        return new C15819a(this, precomputedPositive(i, bitSet, strSubstring), string);
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: c */
    public void mo22759c(BitSet table) {
        for (int i = 65535; i >= 0; i--) {
            if (matches((char) i)) {
                table.set(i);
            }
        }
    }

    public String collapseFrom(CharSequence sequence, char replacement) {
        int length = sequence.length();
        int i = 0;
        while (i < length) {
            char cCharAt = sequence.charAt(i);
            if (matches(cCharAt)) {
                if (cCharAt != replacement || (i != length - 1 && matches(sequence.charAt(i + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(sequence, 0, i);
                    sb.append(replacement);
                    return finishCollapseFrom(sequence, i + 1, length, replacement, sb, true);
                }
                i++;
            }
            i++;
        }
        return sequence.toString();
    }

    public int countIn(CharSequence sequence) {
        int i = 0;
        for (int i2 = 0; i2 < sequence.length(); i2++) {
            if (matches(sequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public int indexIn(CharSequence sequence) {
        return indexIn(sequence, 0);
    }

    public int lastIndexIn(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (matches(sequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c);

    public boolean matchesAllOf(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (!matches(sequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence sequence) {
        return !matchesNoneOf(sequence);
    }

    public boolean matchesNoneOf(CharSequence sequence) {
        return indexIn(sequence) == -1;
    }

    public yv1 negate() {
        return new C15844w(this);
    }

    /* JADX INFO: renamed from: or */
    public yv1 mo26362or(yv1 other) {
        return new C15847z(this, other);
    }

    public yv1 precomputed() {
        return rwc.m21594g(this);
    }

    public String removeFrom(CharSequence sequence) {
        String string = sequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    break;
                }
                charArray[iIndexIn - i] = charArray[iIndexIn];
                iIndexIn++;
            }
            return new String(charArray, 0, iIndexIn - i);
            i++;
        }
    }

    public String replaceFrom(CharSequence sequence, char replacement) {
        String string = sequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = replacement;
        while (true) {
            iIndexIn++;
            if (iIndexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[iIndexIn])) {
                charArray[iIndexIn] = replacement;
            }
        }
    }

    public String retainFrom(CharSequence sequence) {
        return negate().removeFrom(sequence);
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence sequence, char replacement) {
        int length = sequence.length();
        int i = length - 1;
        int i2 = 0;
        while (i2 < length && matches(sequence.charAt(i2))) {
            i2++;
        }
        int i3 = i;
        while (i3 > i2 && matches(sequence.charAt(i3))) {
            i3--;
        }
        if (i2 == 0 && i3 == i) {
            return collapseFrom(sequence, replacement);
        }
        int i4 = i3 + 1;
        return finishCollapseFrom(sequence, i2, i4, replacement, new StringBuilder(i4 - i2), false);
    }

    public String trimFrom(CharSequence sequence) {
        int length = sequence.length();
        int i = 0;
        while (i < length && matches(sequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        while (i2 > i && matches(sequence.charAt(i2))) {
            i2--;
        }
        return sequence.subSequence(i, i2 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence sequence) {
        int length = sequence.length();
        for (int i = 0; i < length; i++) {
            if (!matches(sequence.charAt(i))) {
                return sequence.subSequence(i, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence sequence) {
        for (int length = sequence.length() - 1; length >= 0; length--) {
            if (!matches(sequence.charAt(length))) {
                return sequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // p000.l8d
    @Deprecated
    public boolean apply(Character character) {
        return matches(character.charValue());
    }

    public int indexIn(CharSequence sequence, int start) {
        int length = sequence.length();
        v7d.checkPositionIndex(start, length);
        while (start < length) {
            if (matches(sequence.charAt(start))) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence sequence, CharSequence replacement) {
        int length = replacement.length();
        if (length == 0) {
            return removeFrom(sequence);
        }
        int i = 0;
        if (length == 1) {
            return replaceFrom(sequence, replacement.charAt(0));
        }
        String string = sequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((CharSequence) string, i, iIndexIn);
            sb.append(replacement);
            i = iIndexIn + 1;
            iIndexIn = indexIn(string, i);
        } while (iIndexIn != -1);
        sb.append((CharSequence) string, i, length2);
        return sb.toString();
    }
}
