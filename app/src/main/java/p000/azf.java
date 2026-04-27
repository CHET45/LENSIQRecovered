package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@by4
public final class azf {

    /* JADX INFO: renamed from: a */
    public final yv1 f12289a;

    /* JADX INFO: renamed from: b */
    public final boolean f12290b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1689h f12291c;

    /* JADX INFO: renamed from: d */
    public final int f12292d;

    /* JADX INFO: renamed from: azf$a */
    public class C1682a implements InterfaceC1689h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yv1 f12293a;

        /* JADX INFO: renamed from: azf$a$a */
        public class a extends AbstractC1688g {
            public a(azf splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // p000.azf.AbstractC1688g
            public int separatorEnd(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // p000.azf.AbstractC1688g
            public int separatorStart(int start) {
                return C1682a.this.f12293a.indexIn(this.f12306c, start);
            }
        }

        public C1682a(final yv1 val$separatorMatcher) {
            this.f12293a = val$separatorMatcher;
        }

        @Override // p000.azf.InterfaceC1689h
        public AbstractC1688g iterator(azf splitter, final CharSequence toSplit) {
            return new a(splitter, toSplit);
        }
    }

    /* JADX INFO: renamed from: azf$b */
    public class C1683b implements InterfaceC1689h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f12295a;

        /* JADX INFO: renamed from: azf$b$a */
        public class a extends AbstractC1688g {
            public a(azf splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // p000.azf.AbstractC1688g
            public int separatorEnd(int separatorPosition) {
                return separatorPosition + C1683b.this.f12295a.length();
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
            
                r6 = r6 + 1;
             */
            @Override // p000.azf.AbstractC1688g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int separatorStart(int r6) {
                /*
                    r5 = this;
                    azf$b r0 = p000.azf.C1683b.this
                    java.lang.String r0 = r0.f12295a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f12306c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f12306c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    azf$b r4 = p000.azf.C1683b.this
                    java.lang.String r4 = r4.f12295a
                    char r4 = r4.charAt(r2)
                    if (r3 == r4) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r6 = -1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.azf.C1683b.a.separatorStart(int):int");
            }
        }

        public C1683b(final String val$separator) {
            this.f12295a = val$separator;
        }

        @Override // p000.azf.InterfaceC1689h
        public AbstractC1688g iterator(azf splitter, CharSequence toSplit) {
            return new a(splitter, toSplit);
        }
    }

    /* JADX INFO: renamed from: azf$c */
    public class C1684c implements InterfaceC1689h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hc2 f12297a;

        /* JADX INFO: renamed from: azf$c$a */
        public class a extends AbstractC1688g {

            /* JADX INFO: renamed from: C */
            public final /* synthetic */ gc2 f12298C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(final C1684c this$0, azf splitter, CharSequence toSplit, final gc2 val$matcher) {
                super(splitter, toSplit);
                this.f12298C = val$matcher;
            }

            @Override // p000.azf.AbstractC1688g
            public int separatorEnd(int separatorPosition) {
                return this.f12298C.end();
            }

            @Override // p000.azf.AbstractC1688g
            public int separatorStart(int start) {
                if (this.f12298C.find(start)) {
                    return this.f12298C.start();
                }
                return -1;
            }
        }

        public C1684c(final hc2 val$separatorPattern) {
            this.f12297a = val$separatorPattern;
        }

        @Override // p000.azf.InterfaceC1689h
        public AbstractC1688g iterator(final azf splitter, CharSequence toSplit) {
            return new a(this, splitter, toSplit, this.f12297a.matcher(toSplit));
        }
    }

    /* JADX INFO: renamed from: azf$d */
    public class C1685d implements InterfaceC1689h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f12299a;

        /* JADX INFO: renamed from: azf$d$a */
        public class a extends AbstractC1688g {
            public a(azf splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // p000.azf.AbstractC1688g
            public int separatorEnd(int separatorPosition) {
                return separatorPosition;
            }

            @Override // p000.azf.AbstractC1688g
            public int separatorStart(int start) {
                int i = start + C1685d.this.f12299a;
                if (i < this.f12306c.length()) {
                    return i;
                }
                return -1;
            }
        }

        public C1685d(final int val$length) {
            this.f12299a = val$length;
        }

        @Override // p000.azf.InterfaceC1689h
        public AbstractC1688g iterator(final azf splitter, CharSequence toSplit) {
            return new a(splitter, toSplit);
        }
    }

    /* JADX INFO: renamed from: azf$e */
    public class C1686e implements Iterable<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f12301a;

        public C1686e(final CharSequence val$sequence) {
            this.f12301a = val$sequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return azf.this.splittingIterator(this.f12301a);
        }

        public String toString() {
            xj8 xj8VarM25235on = xj8.m25235on(", ");
            StringBuilder sb = new StringBuilder();
            sb.append(C4584d2.f28242k);
            StringBuilder sbAppendTo = xj8VarM25235on.appendTo(sb, (Iterable<? extends Object>) this);
            sbAppendTo.append(C4584d2.f28243l);
            return sbAppendTo.toString();
        }
    }

    /* JADX INFO: renamed from: azf$f */
    public static final class C1687f {

        /* JADX INFO: renamed from: c */
        public static final String f12303c = "Chunk [%s] is not a valid entry";

        /* JADX INFO: renamed from: a */
        public final azf f12304a;

        /* JADX INFO: renamed from: b */
        public final azf f12305b;

        public /* synthetic */ C1687f(azf azfVar, azf azfVar2, C1682a c1682a) {
            this(azfVar, azfVar2);
        }

        public Map<String, String> split(CharSequence sequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f12304a.split(sequence)) {
                Iterator itSplittingIterator = this.f12305b.splittingIterator(str);
                v7d.checkArgument(itSplittingIterator.hasNext(), f12303c, str);
                String str2 = (String) itSplittingIterator.next();
                v7d.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                v7d.checkArgument(itSplittingIterator.hasNext(), f12303c, str);
                linkedHashMap.put(str2, (String) itSplittingIterator.next());
                v7d.checkArgument(!itSplittingIterator.hasNext(), f12303c, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private C1687f(azf outerSplitter, azf entrySplitter) {
            this.f12304a = outerSplitter;
            this.f12305b = (azf) v7d.checkNotNull(entrySplitter);
        }
    }

    /* JADX INFO: renamed from: azf$g */
    public static abstract class AbstractC1688g extends AbstractC15914z1<String> {

        /* JADX INFO: renamed from: c */
        public final CharSequence f12306c;

        /* JADX INFO: renamed from: d */
        public final yv1 f12307d;

        /* JADX INFO: renamed from: e */
        public final boolean f12308e;

        /* JADX INFO: renamed from: f */
        public int f12309f = 0;

        /* JADX INFO: renamed from: m */
        public int f12310m;

        public AbstractC1688g(azf splitter, CharSequence toSplit) {
            this.f12307d = splitter.f12289a;
            this.f12308e = splitter.f12290b;
            this.f12310m = splitter.f12292d;
            this.f12306c = toSplit;
        }

        @Override // p000.AbstractC15914z1
        @wx1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String mo2779a() {
            int iSeparatorStart;
            int i = this.f12309f;
            while (true) {
                int i2 = this.f12309f;
                if (i2 == -1) {
                    return m26470b();
                }
                iSeparatorStart = separatorStart(i2);
                if (iSeparatorStart == -1) {
                    iSeparatorStart = this.f12306c.length();
                    this.f12309f = -1;
                } else {
                    this.f12309f = separatorEnd(iSeparatorStart);
                }
                int i3 = this.f12309f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f12309f = i4;
                    if (i4 > this.f12306c.length()) {
                        this.f12309f = -1;
                    }
                } else {
                    while (i < iSeparatorStart && this.f12307d.matches(this.f12306c.charAt(i))) {
                        i++;
                    }
                    while (iSeparatorStart > i && this.f12307d.matches(this.f12306c.charAt(iSeparatorStart - 1))) {
                        iSeparatorStart--;
                    }
                    if (!this.f12308e || i != iSeparatorStart) {
                        break;
                    }
                    i = this.f12309f;
                }
            }
            int i5 = this.f12310m;
            if (i5 == 1) {
                iSeparatorStart = this.f12306c.length();
                this.f12309f = -1;
                while (iSeparatorStart > i && this.f12307d.matches(this.f12306c.charAt(iSeparatorStart - 1))) {
                    iSeparatorStart--;
                }
            } else {
                this.f12310m = i5 - 1;
            }
            return this.f12306c.subSequence(i, iSeparatorStart).toString();
        }

        public abstract int separatorEnd(int separatorPosition);

        public abstract int separatorStart(int start);
    }

    /* JADX INFO: renamed from: azf$h */
    public interface InterfaceC1689h {
        Iterator<String> iterator(azf splitter, CharSequence toSplit);
    }

    private azf(InterfaceC1689h strategy) {
        this(strategy, false, yv1.none(), Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: e */
    public static azf m2774e(final hc2 separatorPattern) {
        v7d.checkArgument(!separatorPattern.matcher("").matches(), "The pattern may not match the empty string: %s", separatorPattern);
        return new azf(new C1684c(separatorPattern));
    }

    public static azf fixedLength(final int length) {
        v7d.checkArgument(length > 0, "The length may not be less than 1");
        return new azf(new C1685d(length));
    }

    /* JADX INFO: renamed from: on */
    public static azf m2775on(char separator) {
        return m2778on(yv1.m26360is(separator));
    }

    @jd7
    @yg8
    public static azf onPattern(String separatorPattern) {
        return m2774e(rwc.m21588a(separatorPattern));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> splittingIterator(CharSequence sequence) {
        return this.f12291c.iterator(this, sequence);
    }

    public azf limit(int maxItems) {
        v7d.checkArgument(maxItems > 0, "must be greater than zero: %s", maxItems);
        return new azf(this.f12291c, this.f12290b, this.f12289a, maxItems);
    }

    public azf omitEmptyStrings() {
        return new azf(this.f12291c, true, this.f12289a, this.f12292d);
    }

    public Iterable<String> split(final CharSequence sequence) {
        v7d.checkNotNull(sequence);
        return new C1686e(sequence);
    }

    public List<String> splitToList(CharSequence sequence) {
        v7d.checkNotNull(sequence);
        Iterator<String> itSplittingIterator = splittingIterator(sequence);
        ArrayList arrayList = new ArrayList();
        while (itSplittingIterator.hasNext()) {
            arrayList.add(itSplittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public azf trimResults() {
        return trimResults(yv1.whitespace());
    }

    public C1687f withKeyValueSeparator(String separator) {
        return withKeyValueSeparator(m2776on(separator));
    }

    private azf(InterfaceC1689h strategy, boolean omitEmptyStrings, yv1 trimmer, int limit) {
        this.f12291c = strategy;
        this.f12290b = omitEmptyStrings;
        this.f12289a = trimmer;
        this.f12292d = limit;
    }

    /* JADX INFO: renamed from: on */
    public static azf m2778on(final yv1 separatorMatcher) {
        v7d.checkNotNull(separatorMatcher);
        return new azf(new C1682a(separatorMatcher));
    }

    public azf trimResults(yv1 trimmer) {
        v7d.checkNotNull(trimmer);
        return new azf(this.f12291c, this.f12290b, trimmer, this.f12292d);
    }

    public C1687f withKeyValueSeparator(char separator) {
        return withKeyValueSeparator(m2775on(separator));
    }

    public C1687f withKeyValueSeparator(azf keyValueSplitter) {
        return new C1687f(this, keyValueSplitter, null);
    }

    /* JADX INFO: renamed from: on */
    public static azf m2776on(final String separator) {
        v7d.checkArgument(separator.length() != 0, "The separator may not be the empty string.");
        if (separator.length() == 1) {
            return m2775on(separator.charAt(0));
        }
        return new azf(new C1683b(separator));
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: on */
    public static azf m2777on(Pattern separatorPattern) {
        return m2774e(new gj8(separatorPattern));
    }
}
