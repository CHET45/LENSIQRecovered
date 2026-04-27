package p000;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public class gih<C extends Comparable<?>> extends AbstractC14889x3<C> implements Serializable {

    /* JADX INFO: renamed from: a */
    @gdi
    public final NavigableMap<ie3<C>, bpd<C>> f39884a;

    /* JADX INFO: renamed from: b */
    @wx1
    @ez8
    public transient Set<bpd<C>> f39885b;

    /* JADX INFO: renamed from: c */
    @wx1
    @ez8
    public transient Set<bpd<C>> f39886c;

    /* JADX INFO: renamed from: d */
    @wx1
    @ez8
    public transient gpd<C> f39887d;

    /* JADX INFO: renamed from: gih$b */
    public final class C6326b extends lr6<bpd<C>> implements Set<bpd<C>> {

        /* JADX INFO: renamed from: a */
        public final Collection<bpd<C>> f39888a;

        public C6326b(final gih this$0, Collection<bpd<C>> delegate) {
            this.f39888a = delegate;
        }

        @Override // p000.lr6, p000.zs6
        /* JADX INFO: renamed from: a */
        public Collection<bpd<C>> mo8967m() {
            return this.f39888a;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@wx1 Object o) {
            return t6f.m22396a(this, o);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return t6f.m22397b(this);
        }
    }

    /* JADX INFO: renamed from: gih$c */
    public final class C6327c extends gih<C> {
        public C6327c() {
            super(new C6328d(gih.this.f39884a));
        }

        @Override // p000.gih, p000.AbstractC14889x3, p000.gpd
        public void add(bpd<C> rangeToAdd) {
            gih.this.remove(rangeToAdd);
        }

        @Override // p000.gih, p000.gpd
        public gpd<C> complement() {
            return gih.this;
        }

        @Override // p000.gih, p000.AbstractC14889x3, p000.gpd
        public boolean contains(C value) {
            return !gih.this.contains(value);
        }

        @Override // p000.gih, p000.AbstractC14889x3, p000.gpd
        public void remove(bpd<C> rangeToRemove) {
            gih.this.add(rangeToRemove);
        }
    }

    /* JADX INFO: renamed from: gih$d */
    public static final class C6328d<C extends Comparable<?>> extends AbstractC7124i3<ie3<C>, bpd<C>> {

        /* JADX INFO: renamed from: a */
        public final NavigableMap<ie3<C>, bpd<C>> f39890a;

        /* JADX INFO: renamed from: b */
        public final NavigableMap<ie3<C>, bpd<C>> f39891b;

        /* JADX INFO: renamed from: c */
        public final bpd<ie3<C>> f39892c;

        /* JADX INFO: renamed from: gih$d$a */
        public class a extends AbstractC0012a2<Map.Entry<ie3<C>, bpd<C>>> {

            /* JADX INFO: renamed from: c */
            public ie3<C> f39893c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ie3 f39894d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ gmc f39895e;

            public a(final ie3 val$firstComplementRangeLowerBound, final gmc val$positiveItr) {
                this.f39894d = val$firstComplementRangeLowerBound;
                this.f39895e = val$positiveItr;
                this.f39893c = val$firstComplementRangeLowerBound;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ie3<C>, bpd<C>> computeNext() {
                bpd bpdVarM3329b;
                if (C6328d.this.f39892c.f14410b.mo12923j(this.f39893c) || this.f39893c == ie3.m12914a()) {
                    return (Map.Entry) m25a();
                }
                if (this.f39895e.hasNext()) {
                    bpd bpdVar = (bpd) this.f39895e.next();
                    bpdVarM3329b = bpd.m3329b(this.f39893c, bpdVar.f14409a);
                    this.f39893c = bpdVar.f14410b;
                } else {
                    bpdVarM3329b = bpd.m3329b(this.f39893c, ie3.m12914a());
                    this.f39893c = ie3.m12914a();
                }
                return tt9.immutableEntry(bpdVarM3329b.f14409a, bpdVarM3329b);
            }
        }

        /* JADX INFO: renamed from: gih$d$b */
        public class b extends AbstractC0012a2<Map.Entry<ie3<C>, bpd<C>>> {

            /* JADX INFO: renamed from: c */
            public ie3<C> f39897c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ie3 f39898d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ gmc f39899e;

            public b(final ie3 val$firstComplementRangeUpperBound, final gmc val$positiveItr) {
                this.f39898d = val$firstComplementRangeUpperBound;
                this.f39899e = val$positiveItr;
                this.f39897c = val$firstComplementRangeUpperBound;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ie3<C>, bpd<C>> computeNext() {
                if (this.f39897c == ie3.m12916c()) {
                    return (Map.Entry) m25a();
                }
                if (this.f39899e.hasNext()) {
                    bpd bpdVar = (bpd) this.f39899e.next();
                    bpd bpdVarM3329b = bpd.m3329b(bpdVar.f14410b, this.f39897c);
                    this.f39897c = bpdVar.f14409a;
                    if (C6328d.this.f39892c.f14409a.mo12923j(bpdVarM3329b.f14409a)) {
                        return tt9.immutableEntry(bpdVarM3329b.f14409a, bpdVarM3329b);
                    }
                } else if (C6328d.this.f39892c.f14409a.mo12923j(ie3.m12916c())) {
                    bpd bpdVarM3329b2 = bpd.m3329b(ie3.m12916c(), this.f39897c);
                    this.f39897c = ie3.m12916c();
                    return tt9.immutableEntry(ie3.m12916c(), bpdVarM3329b2);
                }
                return (Map.Entry) m25a();
            }
        }

        public C6328d(NavigableMap<ie3<C>, bpd<C>> positiveRangesByLowerBound) {
            this(positiveRangesByLowerBound, bpd.all());
        }

        @Override // p000.tt9.AbstractC13189a0
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<ie3<C>, bpd<C>>> mo10935a() {
            Collection<bpd<C>> collectionValues;
            ie3 ie3VarM12916c;
            if (this.f39892c.hasLowerBound()) {
                collectionValues = this.f39891b.tailMap((ie3) this.f39892c.lowerEndpoint(), this.f39892c.lowerBoundType() == hc1.CLOSED).values();
            } else {
                collectionValues = this.f39891b.values();
            }
            gmc gmcVarPeekingIterator = wg8.peekingIterator(collectionValues.iterator());
            if (this.f39892c.contains(ie3.m12916c()) && (!gmcVarPeekingIterator.hasNext() || ((bpd) gmcVarPeekingIterator.peek()).f14409a != ie3.m12916c())) {
                ie3VarM12916c = ie3.m12916c();
            } else {
                if (!gmcVarPeekingIterator.hasNext()) {
                    return wg8.m24511e();
                }
                ie3VarM12916c = ((bpd) gmcVarPeekingIterator.next()).f14410b;
            }
            return new a(ie3VarM12916c, gmcVarPeekingIterator);
        }

        @Override // p000.AbstractC7124i3
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<ie3<C>, bpd<C>>> mo11694b() {
            ie3<C> ie3VarHigherKey;
            gmc gmcVarPeekingIterator = wg8.peekingIterator(this.f39891b.headMap(this.f39892c.hasUpperBound() ? (ie3) this.f39892c.upperEndpoint() : ie3.m12914a(), this.f39892c.hasUpperBound() && this.f39892c.upperBoundType() == hc1.CLOSED).descendingMap().values().iterator());
            if (gmcVarPeekingIterator.hasNext()) {
                ie3VarHigherKey = ((bpd) gmcVarPeekingIterator.peek()).f14410b == ie3.m12914a() ? ((bpd) gmcVarPeekingIterator.next()).f14409a : this.f39890a.higherKey(((bpd) gmcVarPeekingIterator.peek()).f14410b);
            } else {
                if (!this.f39892c.contains(ie3.m12916c()) || this.f39890a.containsKey(ie3.m12916c())) {
                    return wg8.m24511e();
                }
                ie3VarHigherKey = this.f39890a.higherKey(ie3.m12916c());
            }
            return new b((ie3) yya.firstNonNull(ie3VarHigherKey, ie3.m12914a()), gmcVarPeekingIterator);
        }

        @Override // java.util.SortedMap
        public Comparator<? super ie3<C>> comparator() {
            return s7c.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return get(key) != null;
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return wg8.size(mo10935a());
        }

        private C6328d(NavigableMap<ie3<C>, bpd<C>> positiveRangesByLowerBound, bpd<ie3<C>> window) {
            this.f39890a = positiveRangesByLowerBound;
            this.f39891b = new C6329e(positiveRangesByLowerBound);
            this.f39892c = window;
        }

        private NavigableMap<ie3<C>, bpd<C>> subMap(bpd<ie3<C>> subWindow) {
            if (!this.f39892c.isConnected(subWindow)) {
                return iy7.m13547of();
            }
            return new C6328d(this.f39890a, subWindow.intersection(this.f39892c));
        }

        @Override // p000.AbstractC7124i3, java.util.AbstractMap, java.util.Map
        @wx1
        public bpd<C> get(@wx1 Object key) {
            if (key instanceof ie3) {
                try {
                    ie3<C> ie3Var = (ie3) key;
                    Map.Entry<ie3<C>, bpd<C>> entryFirstEntry = tailMap((ie3) ie3Var, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(ie3Var)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<ie3<C>, bpd<C>> headMap(ie3<C> toKey, boolean inclusive) {
            return subMap(bpd.upTo(toKey, hc1.m12308a(inclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<ie3<C>, bpd<C>> tailMap(ie3<C> fromKey, boolean inclusive) {
            return subMap(bpd.downTo(fromKey, hc1.m12308a(inclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<ie3<C>, bpd<C>> subMap(ie3<C> fromKey, boolean fromInclusive, ie3<C> toKey, boolean toInclusive) {
            return subMap(bpd.range(fromKey, hc1.m12308a(fromInclusive), toKey, hc1.m12308a(toInclusive)));
        }
    }

    /* JADX INFO: renamed from: gih$e */
    @gdi
    public static final class C6329e<C extends Comparable<?>> extends AbstractC7124i3<ie3<C>, bpd<C>> {

        /* JADX INFO: renamed from: a */
        public final NavigableMap<ie3<C>, bpd<C>> f39901a;

        /* JADX INFO: renamed from: b */
        public final bpd<ie3<C>> f39902b;

        /* JADX INFO: renamed from: gih$e$a */
        public class a extends AbstractC0012a2<Map.Entry<ie3<C>, bpd<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f39903c;

            public a(final Iterator val$backingItr) {
                this.f39903c = val$backingItr;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ie3<C>, bpd<C>> computeNext() {
                if (!this.f39903c.hasNext()) {
                    return (Map.Entry) m25a();
                }
                bpd bpdVar = (bpd) this.f39903c.next();
                return C6329e.this.f39902b.f14410b.mo12923j(bpdVar.f14410b) ? (Map.Entry) m25a() : tt9.immutableEntry(bpdVar.f14410b, bpdVar);
            }
        }

        /* JADX INFO: renamed from: gih$e$b */
        public class b extends AbstractC0012a2<Map.Entry<ie3<C>, bpd<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ gmc f39905c;

            public b(final gmc val$backingItr) {
                this.f39905c = val$backingItr;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ie3<C>, bpd<C>> computeNext() {
                if (!this.f39905c.hasNext()) {
                    return (Map.Entry) m25a();
                }
                bpd bpdVar = (bpd) this.f39905c.next();
                return C6329e.this.f39902b.f14409a.mo12923j(bpdVar.f14410b) ? tt9.immutableEntry(bpdVar.f14410b, bpdVar) : (Map.Entry) m25a();
            }
        }

        public C6329e(NavigableMap<ie3<C>, bpd<C>> rangesByLowerBound) {
            this.f39901a = rangesByLowerBound;
            this.f39902b = bpd.all();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.tt9.AbstractC13189a0
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<ie3<C>, bpd<C>>> mo10935a() {
            Map.Entry<ie3<C>, bpd<C>> entryLowerEntry;
            Iterator<bpd<C>> it = (this.f39902b.hasLowerBound() && (entryLowerEntry = this.f39901a.lowerEntry((ie3) this.f39902b.lowerEndpoint())) != null) ? this.f39902b.f14409a.mo12923j(entryLowerEntry.getValue().f14410b) ? this.f39901a.tailMap(entryLowerEntry.getKey(), true).values().iterator() : this.f39901a.tailMap((ie3) this.f39902b.lowerEndpoint(), true).values().iterator() : this.f39901a.values().iterator();
            return new a(it);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.AbstractC7124i3
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<ie3<C>, bpd<C>>> mo11694b() {
            gmc gmcVarPeekingIterator = wg8.peekingIterator((this.f39902b.hasUpperBound() ? this.f39901a.headMap((ie3) this.f39902b.upperEndpoint(), false).descendingMap().values() : this.f39901a.descendingMap().values()).iterator());
            if (gmcVarPeekingIterator.hasNext() && this.f39902b.f14410b.mo12923j(((bpd) gmcVarPeekingIterator.peek()).f14410b)) {
                gmcVarPeekingIterator.next();
            }
            return new b(gmcVarPeekingIterator);
        }

        @Override // java.util.SortedMap
        public Comparator<? super ie3<C>> comparator() {
            return s7c.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return get(key) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f39902b.equals(bpd.all()) ? this.f39901a.isEmpty() : !mo10935a().hasNext();
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f39902b.equals(bpd.all()) ? this.f39901a.size() : wg8.size(mo10935a());
        }

        private NavigableMap<ie3<C>, bpd<C>> subMap(bpd<ie3<C>> window) {
            return window.isConnected(this.f39902b) ? new C6329e(this.f39901a, window.intersection(this.f39902b)) : iy7.m13547of();
        }

        @Override // p000.AbstractC7124i3, java.util.AbstractMap, java.util.Map
        @wx1
        public bpd<C> get(@wx1 Object key) {
            Map.Entry<ie3<C>, bpd<C>> entryLowerEntry;
            if (key instanceof ie3) {
                try {
                    ie3<C> ie3Var = (ie3) key;
                    if (this.f39902b.contains(ie3Var) && (entryLowerEntry = this.f39901a.lowerEntry(ie3Var)) != null && entryLowerEntry.getValue().f14410b.equals(ie3Var)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<ie3<C>, bpd<C>> headMap(ie3<C> toKey, boolean inclusive) {
            return subMap(bpd.upTo(toKey, hc1.m12308a(inclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<ie3<C>, bpd<C>> tailMap(ie3<C> fromKey, boolean inclusive) {
            return subMap(bpd.downTo(fromKey, hc1.m12308a(inclusive)));
        }

        private C6329e(NavigableMap<ie3<C>, bpd<C>> rangesByLowerBound, bpd<ie3<C>> upperBoundWindow) {
            this.f39901a = rangesByLowerBound;
            this.f39902b = upperBoundWindow;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<ie3<C>, bpd<C>> subMap(ie3<C> fromKey, boolean fromInclusive, ie3<C> toKey, boolean toInclusive) {
            return subMap(bpd.range(fromKey, hc1.m12308a(fromInclusive), toKey, hc1.m12308a(toInclusive)));
        }
    }

    /* JADX INFO: renamed from: gih$f */
    public final class C6330f extends gih<C> {

        /* JADX INFO: renamed from: e */
        public final bpd<C> f39907e;

        /* JADX WARN: Illegal instructions before constructor call */
        public C6330f(bpd<C> restriction) {
            super(new C6331g(bpd.all(), restriction, gih.this.f39884a));
            this.f39907e = restriction;
        }

        @Override // p000.gih, p000.AbstractC14889x3, p000.gpd
        public void add(bpd<C> rangeToAdd) {
            v7d.checkArgument(this.f39907e.encloses(rangeToAdd), "Cannot add range %s to subRangeSet(%s)", rangeToAdd, this.f39907e);
            gih.this.add(rangeToAdd);
        }

        @Override // p000.gih, p000.AbstractC14889x3, p000.gpd
        public void clear() {
            gih.this.remove(this.f39907e);
        }

        @Override // p000.gih, p000.AbstractC14889x3, p000.gpd
        public boolean contains(C value) {
            return this.f39907e.contains(value) && gih.this.contains(value);
        }

        @Override // p000.gih, p000.AbstractC14889x3, p000.gpd
        public boolean encloses(bpd<C> range) {
            bpd bpdVarRangeEnclosing;
            return (this.f39907e.isEmpty() || !this.f39907e.encloses(range) || (bpdVarRangeEnclosing = gih.this.rangeEnclosing(range)) == null || bpdVarRangeEnclosing.intersection(this.f39907e).isEmpty()) ? false : true;
        }

        @Override // p000.gih, p000.AbstractC14889x3, p000.gpd
        @wx1
        public bpd<C> rangeContaining(C value) {
            bpd<C> bpdVarRangeContaining;
            if (this.f39907e.contains(value) && (bpdVarRangeContaining = gih.this.rangeContaining(value)) != null) {
                return bpdVarRangeContaining.intersection(this.f39907e);
            }
            return null;
        }

        @Override // p000.gih, p000.AbstractC14889x3, p000.gpd
        public void remove(bpd<C> rangeToRemove) {
            if (rangeToRemove.isConnected(this.f39907e)) {
                gih.this.remove(rangeToRemove.intersection(this.f39907e));
            }
        }

        @Override // p000.gih, p000.gpd
        public gpd<C> subRangeSet(bpd<C> view) {
            return view.encloses(this.f39907e) ? this : view.isConnected(this.f39907e) ? new C6330f(this.f39907e.intersection(view)) : cy7.m8780of();
        }
    }

    /* JADX INFO: renamed from: gih$g */
    public static final class C6331g<C extends Comparable<?>> extends AbstractC7124i3<ie3<C>, bpd<C>> {

        /* JADX INFO: renamed from: a */
        public final bpd<ie3<C>> f39909a;

        /* JADX INFO: renamed from: b */
        public final bpd<C> f39910b;

        /* JADX INFO: renamed from: c */
        public final NavigableMap<ie3<C>, bpd<C>> f39911c;

        /* JADX INFO: renamed from: d */
        public final NavigableMap<ie3<C>, bpd<C>> f39912d;

        /* JADX INFO: renamed from: gih$g$a */
        public class a extends AbstractC0012a2<Map.Entry<ie3<C>, bpd<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f39913c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ie3 f39914d;

            public a(final Iterator val$completeRangeItr, final ie3 val$upperBoundOnLowerBounds) {
                this.f39913c = val$completeRangeItr;
                this.f39914d = val$upperBoundOnLowerBounds;
            }

            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ie3<C>, bpd<C>> computeNext() {
                if (!this.f39913c.hasNext()) {
                    return (Map.Entry) m25a();
                }
                bpd bpdVar = (bpd) this.f39913c.next();
                if (this.f39914d.mo12923j(bpdVar.f14409a)) {
                    return (Map.Entry) m25a();
                }
                bpd bpdVarIntersection = bpdVar.intersection(C6331g.this.f39910b);
                return tt9.immutableEntry(bpdVarIntersection.f14409a, bpdVarIntersection);
            }
        }

        /* JADX INFO: renamed from: gih$g$b */
        public class b extends AbstractC0012a2<Map.Entry<ie3<C>, bpd<C>>> {

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Iterator f39916c;

            public b(final Iterator val$completeRangeItr) {
                this.f39916c = val$completeRangeItr;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p000.AbstractC0012a2
            @wx1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<ie3<C>, bpd<C>> computeNext() {
                if (!this.f39916c.hasNext()) {
                    return (Map.Entry) m25a();
                }
                bpd bpdVar = (bpd) this.f39916c.next();
                if (C6331g.this.f39910b.f14409a.compareTo((ie3) bpdVar.f14410b) >= 0) {
                    return (Map.Entry) m25a();
                }
                bpd bpdVarIntersection = bpdVar.intersection(C6331g.this.f39910b);
                return C6331g.this.f39909a.contains(bpdVarIntersection.f14409a) ? tt9.immutableEntry(bpdVarIntersection.f14409a, bpdVarIntersection) : (Map.Entry) m25a();
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.tt9.AbstractC13189a0
        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<ie3<C>, bpd<C>>> mo10935a() {
            Iterator<bpd<C>> it;
            if (!this.f39910b.isEmpty() && !this.f39909a.f14410b.mo12923j(this.f39910b.f14409a)) {
                if (this.f39909a.f14409a.mo12923j(this.f39910b.f14409a)) {
                    it = this.f39912d.tailMap(this.f39910b.f14409a, false).values().iterator();
                } else {
                    it = this.f39911c.tailMap((ie3) this.f39909a.f14409a.mo12921h(), this.f39909a.lowerBoundType() == hc1.CLOSED).values().iterator();
                }
                return new a(it, (ie3) s7c.natural().min(this.f39909a.f14410b, ie3.m12917d(this.f39910b.f14410b)));
            }
            return wg8.m24511e();
        }

        @Override // p000.AbstractC7124i3
        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<ie3<C>, bpd<C>>> mo11694b() {
            if (this.f39910b.isEmpty()) {
                return wg8.m24511e();
            }
            ie3 ie3Var = (ie3) s7c.natural().min(this.f39909a.f14410b, ie3.m12917d(this.f39910b.f14410b));
            return new b(this.f39911c.headMap((ie3) ie3Var.mo12921h(), ie3Var.mo12926m() == hc1.CLOSED).descendingMap().values().iterator());
        }

        @Override // java.util.SortedMap
        public Comparator<? super ie3<C>> comparator() {
            return s7c.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return get(key) != null;
        }

        @Override // p000.tt9.AbstractC13189a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return wg8.size(mo10935a());
        }

        private C6331g(bpd<ie3<C>> lowerBoundWindow, bpd<C> restriction, NavigableMap<ie3<C>, bpd<C>> rangesByLowerBound) {
            this.f39909a = (bpd) v7d.checkNotNull(lowerBoundWindow);
            this.f39910b = (bpd) v7d.checkNotNull(restriction);
            this.f39911c = (NavigableMap) v7d.checkNotNull(rangesByLowerBound);
            this.f39912d = new C6329e(rangesByLowerBound);
        }

        private NavigableMap<ie3<C>, bpd<C>> subMap(bpd<ie3<C>> window) {
            return !window.isConnected(this.f39909a) ? iy7.m13547of() : new C6331g(this.f39909a.intersection(window), this.f39910b, this.f39911c);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.AbstractC7124i3, java.util.AbstractMap, java.util.Map
        @wx1
        public bpd<C> get(@wx1 Object key) {
            if (key instanceof ie3) {
                try {
                    ie3<C> ie3Var = (ie3) key;
                    if (this.f39909a.contains(ie3Var) && ie3Var.compareTo((ie3) this.f39910b.f14409a) >= 0 && ie3Var.compareTo((ie3) this.f39910b.f14410b) < 0) {
                        if (ie3Var.equals(this.f39910b.f14409a)) {
                            bpd bpdVar = (bpd) tt9.m22778H(this.f39911c.floorEntry(ie3Var));
                            if (bpdVar != null && bpdVar.f14410b.compareTo((ie3) this.f39910b.f14409a) > 0) {
                                return bpdVar.intersection(this.f39910b);
                            }
                        } else {
                            bpd<C> bpdVar2 = this.f39911c.get(ie3Var);
                            if (bpdVar2 != null) {
                                return bpdVar2.intersection(this.f39910b);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<ie3<C>, bpd<C>> headMap(ie3<C> toKey, boolean inclusive) {
            return subMap(bpd.upTo(toKey, hc1.m12308a(inclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<ie3<C>, bpd<C>> tailMap(ie3<C> fromKey, boolean inclusive) {
            return subMap(bpd.downTo(fromKey, hc1.m12308a(inclusive)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<ie3<C>, bpd<C>> subMap(ie3<C> fromKey, boolean fromInclusive, ie3<C> toKey, boolean toInclusive) {
            return subMap(bpd.range(fromKey, hc1.m12308a(fromInclusive), toKey, hc1.m12308a(toInclusive)));
        }
    }

    public static <C extends Comparable<?>> gih<C> create() {
        return new gih<>(new TreeMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @wx1
    public bpd<C> rangeEnclosing(bpd<C> range) {
        v7d.checkNotNull(range);
        Map.Entry<ie3<C>, bpd<C>> entryFloorEntry = this.f39884a.floorEntry(range.f14409a);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().encloses(range)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    private void replaceRangeWithSameLowerBound(bpd<C> range) {
        if (range.isEmpty()) {
            this.f39884a.remove(range.f14409a);
        } else {
            this.f39884a.put(range.f14409a, range);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.AbstractC14889x3, p000.gpd
    public void add(bpd<C> bpdVar) {
        v7d.checkNotNull(bpdVar);
        if (bpdVar.isEmpty()) {
            return;
        }
        ie3<C> ie3Var = bpdVar.f14409a;
        ie3<C> ie3Var2 = bpdVar.f14410b;
        Map.Entry<ie3<C>, bpd<C>> entryLowerEntry = this.f39884a.lowerEntry(ie3Var);
        if (entryLowerEntry != null) {
            bpd<C> value = entryLowerEntry.getValue();
            if (value.f14410b.compareTo((ie3) ie3Var) >= 0) {
                if (value.f14410b.compareTo((ie3) ie3Var2) >= 0) {
                    ie3Var2 = value.f14410b;
                }
                ie3Var = value.f14409a;
            }
        }
        Map.Entry<ie3<C>, bpd<C>> entryFloorEntry = this.f39884a.floorEntry(ie3Var2);
        if (entryFloorEntry != null) {
            bpd<C> value2 = entryFloorEntry.getValue();
            if (value2.f14410b.compareTo((ie3) ie3Var2) >= 0) {
                ie3Var2 = value2.f14410b;
            }
        }
        this.f39884a.subMap(ie3Var, ie3Var2).clear();
        replaceRangeWithSameLowerBound(bpd.m3329b(ie3Var, ie3Var2));
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ void addAll(gpd other) {
        super.addAll(other);
    }

    @Override // p000.gpd
    public Set<bpd<C>> asDescendingSetOfRanges() {
        Set<bpd<C>> set = this.f39886c;
        if (set != null) {
            return set;
        }
        C6326b c6326b = new C6326b(this, this.f39884a.descendingMap().values());
        this.f39886c = c6326b;
        return c6326b;
    }

    @Override // p000.gpd
    public Set<bpd<C>> asRanges() {
        Set<bpd<C>> set = this.f39885b;
        if (set != null) {
            return set;
        }
        C6326b c6326b = new C6326b(this, this.f39884a.values());
        this.f39885b = c6326b;
        return c6326b;
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // p000.gpd
    public gpd<C> complement() {
        gpd<C> gpdVar = this.f39887d;
        if (gpdVar != null) {
            return gpdVar;
        }
        C6327c c6327c = new C6327c();
        this.f39887d = c6327c;
        return c6327c;
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ boolean contains(Comparable value) {
        return super.contains(value);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public boolean encloses(bpd<C> range) {
        v7d.checkNotNull(range);
        Map.Entry<ie3<C>, bpd<C>> entryFloorEntry = this.f39884a.floorEntry(range.f14409a);
        return entryFloorEntry != null && entryFloorEntry.getValue().encloses(range);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ boolean enclosesAll(gpd other) {
        return super.enclosesAll(other);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ boolean equals(@wx1 Object obj) {
        return super.equals(obj);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public boolean intersects(bpd<C> range) {
        v7d.checkNotNull(range);
        Map.Entry<ie3<C>, bpd<C>> entryCeilingEntry = this.f39884a.ceilingEntry(range.f14409a);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(range) && !entryCeilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<ie3<C>, bpd<C>> entryLowerEntry = this.f39884a.lowerEntry(range.f14409a);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().isConnected(range) || entryLowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    @wx1
    public bpd<C> rangeContaining(C value) {
        v7d.checkNotNull(value);
        Map.Entry<ie3<C>, bpd<C>> entryFloorEntry = this.f39884a.floorEntry(ie3.m12917d(value));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(value)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.AbstractC14889x3, p000.gpd
    public void remove(bpd<C> rangeToRemove) {
        v7d.checkNotNull(rangeToRemove);
        if (rangeToRemove.isEmpty()) {
            return;
        }
        Map.Entry<ie3<C>, bpd<C>> entryLowerEntry = this.f39884a.lowerEntry(rangeToRemove.f14409a);
        if (entryLowerEntry != null) {
            bpd<C> value = entryLowerEntry.getValue();
            if (value.f14410b.compareTo((ie3) rangeToRemove.f14409a) >= 0) {
                if (rangeToRemove.hasUpperBound() && value.f14410b.compareTo((ie3) rangeToRemove.f14410b) >= 0) {
                    replaceRangeWithSameLowerBound(bpd.m3329b(rangeToRemove.f14410b, value.f14410b));
                }
                replaceRangeWithSameLowerBound(bpd.m3329b(value.f14409a, rangeToRemove.f14409a));
            }
        }
        Map.Entry<ie3<C>, bpd<C>> entryFloorEntry = this.f39884a.floorEntry(rangeToRemove.f14410b);
        if (entryFloorEntry != null) {
            bpd<C> value2 = entryFloorEntry.getValue();
            if (rangeToRemove.hasUpperBound() && value2.f14410b.compareTo((ie3) rangeToRemove.f14410b) >= 0) {
                replaceRangeWithSameLowerBound(bpd.m3329b(rangeToRemove.f14410b, value2.f14410b));
            }
        }
        this.f39884a.subMap(rangeToRemove.f14409a, rangeToRemove.f14410b).clear();
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ void removeAll(gpd other) {
        super.removeAll(other);
    }

    @Override // p000.gpd
    public bpd<C> span() {
        Map.Entry<ie3<C>, bpd<C>> entryFirstEntry = this.f39884a.firstEntry();
        Map.Entry<ie3<C>, bpd<C>> entryLastEntry = this.f39884a.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return bpd.m3329b(entryFirstEntry.getValue().f14409a, entryLastEntry.getValue().f14410b);
    }

    @Override // p000.gpd
    public gpd<C> subRangeSet(bpd<C> view) {
        return view.equals(bpd.all()) ? this : new C6330f(view);
    }

    private gih(NavigableMap<ie3<C>, bpd<C>> rangesByLowerCut) {
        this.f39884a = rangesByLowerCut;
    }

    public static <C extends Comparable<?>> gih<C> create(gpd<C> rangeSet) {
        gih<C> gihVarCreate = create();
        gihVarCreate.addAll(rangeSet);
        return gihVarCreate;
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ void addAll(Iterable ranges) {
        super.addAll(ranges);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable ranges) {
        return super.enclosesAll(ranges);
    }

    @Override // p000.AbstractC14889x3, p000.gpd
    public /* bridge */ /* synthetic */ void removeAll(Iterable ranges) {
        super.removeAll(ranges);
    }

    public static <C extends Comparable<?>> gih<C> create(Iterable<bpd<C>> ranges) {
        gih<C> gihVarCreate = create();
        gihVarCreate.addAll(ranges);
        return gihVarCreate;
    }
}
