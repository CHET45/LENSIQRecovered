package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.dm7;
import p000.eq5;
import p000.g89;
import p000.p61;
import p000.pi7;
import p000.qz7;
import p000.wwg;

/* JADX INFO: loaded from: classes8.dex */
public class hi4 implements zhc {

    /* JADX INFO: renamed from: p */
    public static final Set<Class<? extends b61>> f43696p = new LinkedHashSet(Arrays.asList(o61.class, ni7.class, dq5.class, cm7.class, vwg.class, f89.class, pz7.class));

    /* JADX INFO: renamed from: q */
    public static final Map<Class<? extends b61>, n61> f43697q;

    /* JADX INFO: renamed from: a */
    public CharSequence f43698a;

    /* JADX INFO: renamed from: d */
    public boolean f43701d;

    /* JADX INFO: renamed from: h */
    public boolean f43705h;

    /* JADX INFO: renamed from: i */
    public final List<n61> f43706i;

    /* JADX INFO: renamed from: j */
    public final x28 f43707j;

    /* JADX INFO: renamed from: k */
    public final List<x54> f43708k;

    /* JADX INFO: renamed from: l */
    public final qh4 f43709l;

    /* JADX INFO: renamed from: b */
    public int f43699b = 0;

    /* JADX INFO: renamed from: c */
    public int f43700c = 0;

    /* JADX INFO: renamed from: e */
    public int f43702e = 0;

    /* JADX INFO: renamed from: f */
    public int f43703f = 0;

    /* JADX INFO: renamed from: g */
    public int f43704g = 0;

    /* JADX INFO: renamed from: m */
    public final Map<String, g79> f43710m = new LinkedHashMap();

    /* JADX INFO: renamed from: n */
    public List<m61> f43711n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public Set<m61> f43712o = new LinkedHashSet();

    /* JADX INFO: renamed from: hi4$a */
    public static class C6857a implements xv9 {

        /* JADX INFO: renamed from: a */
        public final m61 f43713a;

        public C6857a(m61 m61Var) {
            this.f43713a = m61Var;
        }

        @Override // p000.xv9
        public m61 getMatchedBlockParser() {
            return this.f43713a;
        }

        @Override // p000.xv9
        public CharSequence getParagraphContent() {
            m61 m61Var = this.f43713a;
            if (!(m61Var instanceof jdc)) {
                return null;
            }
            CharSequence contentString = ((jdc) m61Var).getContentString();
            if (contentString.length() == 0) {
                return null;
            }
            return contentString;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(o61.class, new p61.C10804a());
        map.put(ni7.class, new pi7.C10968a());
        map.put(dq5.class, new eq5.C5438a());
        map.put(cm7.class, new dm7.C4861b());
        map.put(vwg.class, new wwg.C14818a());
        map.put(f89.class, new g89.C6164a());
        map.put(pz7.class, new qz7.C11770a());
        f43697q = Collections.unmodifiableMap(map);
    }

    public hi4(List<n61> list, x28 x28Var, List<x54> list2) {
        this.f43706i = list;
        this.f43707j = x28Var;
        this.f43708k = list2;
        qh4 qh4Var = new qh4();
        this.f43709l = qh4Var;
        activateBlockParser(qh4Var);
    }

    private void activateBlockParser(m61 m61Var) {
        this.f43711n.add(m61Var);
        this.f43712o.add(m61Var);
    }

    private <T extends m61> T addChild(T t) {
        while (!getActiveBlockParser().canContain(t.getBlock())) {
            finalize(getActiveBlockParser());
        }
        getActiveBlockParser().getBlock().appendChild(t.getBlock());
        activateBlockParser(t);
        return t;
    }

    private void addDefinitionsFrom(jdc jdcVar) {
        for (g79 g79Var : jdcVar.getDefinitions()) {
            jdcVar.getBlock().insertBefore(g79Var);
            String label = g79Var.getLabel();
            if (!this.f43710m.containsKey(label)) {
                this.f43710m.put(label, g79Var);
            }
        }
    }

    private void addLine() {
        CharSequence charSequenceSubSequence;
        if (this.f43701d) {
            int i = this.f43699b + 1;
            CharSequence charSequence = this.f43698a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int iColumnsToNextTabStop = bic.columnsToNextTabStop(this.f43700c);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + iColumnsToNextTabStop);
            for (int i2 = 0; i2 < iColumnsToNextTabStop; i2++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f43698a;
            charSequenceSubSequence = charSequence2.subSequence(this.f43699b, charSequence2.length());
        }
        getActiveBlockParser().addLine(charSequenceSubSequence);
    }

    private void advance() {
        if (this.f43698a.charAt(this.f43699b) != '\t') {
            this.f43699b++;
            this.f43700c++;
        } else {
            this.f43699b++;
            int i = this.f43700c;
            this.f43700c = i + bic.columnsToNextTabStop(i);
        }
    }

    public static List<n61> calculateBlockParserFactories(List<n61> list, Set<Class<? extends b61>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<Class<? extends b61>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f43697q.get(it.next()));
        }
        return arrayList;
    }

    private void deactivateBlockParser() {
        this.f43711n.remove(r0.size() - 1);
    }

    private void finalize(m61 m61Var) {
        if (getActiveBlockParser() == m61Var) {
            deactivateBlockParser();
        }
        if (m61Var instanceof jdc) {
            addDefinitionsFrom((jdc) m61Var);
        }
        m61Var.closeBlock();
    }

    private oh4 finalizeAndProcess() {
        finalizeBlocks(this.f43711n);
        processInlines();
        return this.f43709l.getBlock();
    }

    private void finalizeBlocks(List<m61> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            finalize(list.get(size));
        }
    }

    private u61 findBlockStart(m61 m61Var) {
        C6857a c6857a = new C6857a(m61Var);
        Iterator<n61> it = this.f43706i.iterator();
        while (it.hasNext()) {
            t61 t61VarTryStart = it.next().tryStart(this, c6857a);
            if (t61VarTryStart instanceof u61) {
                return (u61) t61VarTryStart;
            }
        }
        return null;
    }

    private void findNextNonSpace() {
        int i = this.f43699b;
        int i2 = this.f43700c;
        this.f43705h = true;
        int length = this.f43698a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = this.f43698a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.f43705h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f43702e = i;
        this.f43703f = i2;
        this.f43704g = i2 - this.f43700c;
    }

    public static Set<Class<? extends b61>> getDefaultBlockParserTypes() {
        return f43696p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        setNewIndex(r10.f43702e);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void incorporateLine(java.lang.CharSequence r11) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hi4.incorporateLine(java.lang.CharSequence):void");
    }

    private void prepareActiveBlockParserForReplacement() {
        m61 activeBlockParser = getActiveBlockParser();
        deactivateBlockParser();
        this.f43712o.remove(activeBlockParser);
        if (activeBlockParser instanceof jdc) {
            addDefinitionsFrom((jdc) activeBlockParser);
        }
        activeBlockParser.getBlock().unlink();
    }

    private void processInlines() {
        u28 u28VarCreate = this.f43707j.create(new w28(this.f43708k, this.f43710m));
        Iterator<m61> it = this.f43712o.iterator();
        while (it.hasNext()) {
            it.next().parseInlines(u28VarCreate);
        }
    }

    private void setNewColumn(int i) {
        int i2;
        int i3 = this.f43703f;
        if (i >= i3) {
            this.f43699b = this.f43702e;
            this.f43700c = i3;
        }
        int length = this.f43698a.length();
        while (true) {
            i2 = this.f43700c;
            if (i2 >= i || this.f43699b == length) {
                break;
            } else {
                advance();
            }
        }
        if (i2 <= i) {
            this.f43701d = false;
            return;
        }
        this.f43699b--;
        this.f43700c = i;
        this.f43701d = true;
    }

    private void setNewIndex(int i) {
        int i2 = this.f43702e;
        if (i >= i2) {
            this.f43699b = i2;
            this.f43700c = this.f43703f;
        }
        int length = this.f43698a.length();
        while (true) {
            int i3 = this.f43699b;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                advance();
            }
        }
        this.f43701d = false;
    }

    @Override // p000.zhc
    public m61 getActiveBlockParser() {
        return this.f43711n.get(r0.size() - 1);
    }

    @Override // p000.zhc
    public int getColumn() {
        return this.f43700c;
    }

    @Override // p000.zhc
    public int getIndent() {
        return this.f43704g;
    }

    @Override // p000.zhc
    public int getIndex() {
        return this.f43699b;
    }

    @Override // p000.zhc
    public CharSequence getLine() {
        return this.f43698a;
    }

    @Override // p000.zhc
    public int getNextNonSpaceIndex() {
        return this.f43702e;
    }

    @Override // p000.zhc
    public boolean isBlank() {
        return this.f43705h;
    }

    public oh4 parse(String str) {
        int i = 0;
        while (true) {
            int iFindLineBreak = bic.findLineBreak(str, i);
            if (iFindLineBreak == -1) {
                break;
            }
            incorporateLine(str.substring(i, iFindLineBreak));
            i = iFindLineBreak + 1;
            if (i < str.length() && str.charAt(iFindLineBreak) == '\r' && str.charAt(i) == '\n') {
                i = iFindLineBreak + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            incorporateLine(str.substring(i));
        }
        return finalizeAndProcess();
    }

    public oh4 parse(Reader reader) throws IOException {
        BufferedReader bufferedReader;
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                incorporateLine(line);
            } else {
                return finalizeAndProcess();
            }
        }
    }
}
