package p000;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p000.wv9;

/* JADX INFO: loaded from: classes7.dex */
public final class aw9 implements wv9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Matcher f12017a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final CharSequence f12018b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final uv9 f12019c;

    /* JADX INFO: renamed from: d */
    @gib
    public List<String> f12020d;

    /* JADX INFO: renamed from: aw9$a */
    public static final class C1630a extends AbstractC7110i2<String> {
        public C1630a() {
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
        public int getSize() {
            return aw9.this.getMatchResult().groupCount() + 1;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return indexOf((String) obj);
            }
            return -1;
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return lastIndexOf((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains(str);
        }

        @Override // p000.AbstractC7110i2, java.util.List
        public String get(int i) {
            String strGroup = aw9.this.getMatchResult().group(i);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int indexOf(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int lastIndexOf(String str) {
            return super.lastIndexOf(str);
        }
    }

    /* JADX INFO: renamed from: aw9$b */
    public static final class C1631b extends AbstractC10126o0<tv9> implements vv9 {
        public C1631b() {
        }

        public /* bridge */ boolean contains(tv9 tv9Var) {
            return super.contains(tv9Var);
        }

        @Override // p000.uv9
        public tv9 get(int i) {
            f78 f78VarRange = twd.range(aw9.this.getMatchResult(), i);
            if (f78VarRange.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = aw9.this.getMatchResult().group(i);
            md8.checkNotNullExpressionValue(strGroup, "group(...)");
            return new tv9(strGroup, f78VarRange);
        }

        @Override // p000.AbstractC10126o0
        public int getSize() {
            return aw9.this.getMatchResult().groupCount() + 1;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<tv9> iterator() {
            return vze.map(v82.asSequence(l82.getIndices(this)), new qy6() { // from class: bw9
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return this.f15096a.get(((Integer) obj).intValue());
                }
            }).iterator();
        }

        @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof tv9) {
                return contains((tv9) obj);
            }
            return false;
        }

        @Override // p000.vv9
        public tv9 get(String str) {
            md8.checkNotNullParameter(str, "name");
            return dxc.f31254a.getMatchResultNamedGroup(aw9.this.getMatchResult(), str);
        }
    }

    public aw9(@yfb Matcher matcher, @yfb CharSequence charSequence) {
        md8.checkNotNullParameter(matcher, "matcher");
        md8.checkNotNullParameter(charSequence, "input");
        this.f12017a = matcher;
        this.f12018b = charSequence;
        this.f12019c = new C1631b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult getMatchResult() {
        return this.f12017a;
    }

    @Override // p000.wv9
    @yfb
    public wv9.C14808b getDestructured() {
        return wv9.C14807a.getDestructured(this);
    }

    @Override // p000.wv9
    @yfb
    public List<String> getGroupValues() {
        if (this.f12020d == null) {
            this.f12020d = new C1630a();
        }
        List<String> list = this.f12020d;
        md8.checkNotNull(list);
        return list;
    }

    @Override // p000.wv9
    @yfb
    public uv9 getGroups() {
        return this.f12019c;
    }

    @Override // p000.wv9
    @yfb
    public f78 getRange() {
        return twd.range(getMatchResult());
    }

    @Override // p000.wv9
    @yfb
    public String getValue() {
        String strGroup = getMatchResult().group();
        md8.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // p000.wv9
    @gib
    public wv9 next() {
        int iEnd = getMatchResult().end() + (getMatchResult().end() == getMatchResult().start() ? 1 : 0);
        if (iEnd > this.f12018b.length()) {
            return null;
        }
        Matcher matcher = this.f12017a.pattern().matcher(this.f12018b);
        md8.checkNotNullExpressionValue(matcher, "matcher(...)");
        return twd.findNext(matcher, iEnd, this.f12018b);
    }
}
