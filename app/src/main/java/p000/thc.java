package p000;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class thc {

    /* JADX INFO: renamed from: a */
    public final List<n61> f84730a;

    /* JADX INFO: renamed from: b */
    public final List<x54> f84731b;

    /* JADX INFO: renamed from: c */
    public final x28 f84732c;

    /* JADX INFO: renamed from: d */
    public final List<o5d> f84733d;

    /* JADX INFO: renamed from: thc$a */
    public static class C13039a {

        /* JADX INFO: renamed from: a */
        public final List<n61> f84734a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<x54> f84735b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final List<o5d> f84736c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public Set<Class<? extends b61>> f84737d = hi4.getDefaultBlockParserTypes();

        /* JADX INFO: renamed from: e */
        public x28 f84738e;

        /* JADX INFO: renamed from: thc$a$a */
        public class a implements x28 {
            public a() {
            }

            @Override // p000.x28
            public u28 create(v28 v28Var) {
                return new y28(v28Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public x28 getInlineParserFactory() {
            x28 x28Var = this.f84738e;
            return x28Var != null ? x28Var : new a();
        }

        public thc build() {
            return new thc(this);
        }

        public C13039a customBlockParserFactory(n61 n61Var) {
            if (n61Var == null) {
                throw new NullPointerException("blockParserFactory must not be null");
            }
            this.f84734a.add(n61Var);
            return this;
        }

        public C13039a customDelimiterProcessor(x54 x54Var) {
            if (x54Var == null) {
                throw new NullPointerException("delimiterProcessor must not be null");
            }
            this.f84735b.add(x54Var);
            return this;
        }

        public C13039a enabledBlockTypes(Set<Class<? extends b61>> set) {
            if (set == null) {
                throw new NullPointerException("enabledBlockTypes must not be null");
            }
            this.f84737d = set;
            return this;
        }

        public C13039a extensions(Iterable<? extends si5> iterable) {
            if (iterable == null) {
                throw new NullPointerException("extensions must not be null");
            }
            for (si5 si5Var : iterable) {
                if (si5Var instanceof InterfaceC13041c) {
                    ((InterfaceC13041c) si5Var).extend(this);
                }
            }
            return this;
        }

        public C13039a inlineParserFactory(x28 x28Var) {
            this.f84738e = x28Var;
            return this;
        }

        public C13039a postProcessor(o5d o5dVar) {
            if (o5dVar == null) {
                throw new NullPointerException("postProcessor must not be null");
            }
            this.f84736c.add(o5dVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: thc$c */
    public interface InterfaceC13041c extends si5 {
        void extend(C13039a c13039a);
    }

    public static C13039a builder() {
        return new C13039a();
    }

    private hi4 createDocumentParser() {
        return new hi4(this.f84730a, this.f84732c, this.f84731b);
    }

    private deb postProcess(deb debVar) {
        Iterator<o5d> it = this.f84733d.iterator();
        while (it.hasNext()) {
            debVar = it.next().process(debVar);
        }
        return debVar;
    }

    public deb parse(String str) {
        if (str != null) {
            return postProcess(createDocumentParser().parse(str));
        }
        throw new NullPointerException("input must not be null");
    }

    public deb parseReader(Reader reader) throws IOException {
        if (reader != null) {
            return postProcess(createDocumentParser().parse(reader));
        }
        throw new NullPointerException("input must not be null");
    }

    private thc(C13039a c13039a) {
        this.f84730a = hi4.calculateBlockParserFactories(c13039a.f84734a, c13039a.f84737d);
        x28 inlineParserFactory = c13039a.getInlineParserFactory();
        this.f84732c = inlineParserFactory;
        this.f84733d = c13039a.f84736c;
        List<x54> list = c13039a.f84735b;
        this.f84731b = list;
        inlineParserFactory.create(new w28(list, Collections.emptyMap()));
    }
}
