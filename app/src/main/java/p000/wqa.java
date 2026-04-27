package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public final class wqa implements kyd {

    /* JADX INFO: renamed from: a */
    public ky7<ci4, ph4> f95155a = uh4.emptyDocumentMap();

    /* JADX INFO: renamed from: b */
    public f08 f95156b;

    /* JADX INFO: renamed from: wqa$b */
    public class C14749b implements Iterable<ph4> {

        /* JADX INFO: renamed from: wqa$b$a */
        public class a implements Iterator<ph4> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator f95158a;

            public a(Iterator it) {
                this.f95158a = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f95158a.hasNext();
            }

            @Override // java.util.Iterator
            public ph4 next() {
                return (ph4) ((Map.Entry) this.f95158a.next()).getValue();
            }
        }

        private C14749b() {
        }

        @Override // java.lang.Iterable
        @efb
        public Iterator<ph4> iterator() {
            return new a(wqa.this.f95155a.iterator());
        }
    }

    @Override // p000.kyd
    public void add(t4b t4bVar, euf eufVar) {
        r80.hardAssert(this.f95156b != null, "setIndexManager() not called", new Object[0]);
        r80.hardAssert(!eufVar.equals(euf.f34067b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f95155a = this.f95155a.insert(t4bVar.getKey(), t4bVar.mutableCopy().setReadTime(eufVar));
        this.f95156b.addToCollectionParentIndex(t4bVar.getKey().getCollectionPath());
    }

    /* JADX INFO: renamed from: b */
    public long m24750b(ud9 ud9Var) {
        Iterator<ph4> it = new C14749b().iterator();
        long serializedSize = 0;
        while (it.hasNext()) {
            serializedSize += (long) ud9Var.m23253d(it.next()).getSerializedSize();
        }
        return serializedSize;
    }

    /* JADX INFO: renamed from: c */
    public Iterable<ph4> m24751c() {
        return new C14749b();
    }

    @Override // p000.kyd
    public t4b get(ci4 ci4Var) {
        ph4 ph4Var = this.f95155a.get(ci4Var);
        return ph4Var != null ? ph4Var.mutableCopy() : t4b.newInvalidDocument(ci4Var);
    }

    @Override // p000.kyd
    public Map<ci4, t4b> getAll(Iterable<ci4> iterable) {
        HashMap map = new HashMap();
        for (ci4 ci4Var : iterable) {
            map.put(ci4Var, get(ci4Var));
        }
        return map;
    }

    @Override // p000.kyd
    public Map<ci4, t4b> getDocumentsMatchingQuery(nld nldVar, ir5.AbstractC7571a abstractC7571a, @efb Set<ci4> set, @hib pld pldVar) {
        HashMap map = new HashMap();
        Iterator<Map.Entry<ci4, ph4>> itIteratorFrom = this.f95155a.iteratorFrom(ci4.fromPath(nldVar.getPath().append("")));
        while (itIteratorFrom.hasNext()) {
            Map.Entry<ci4, ph4> next = itIteratorFrom.next();
            ph4 value = next.getValue();
            ci4 key = next.getKey();
            if (!nldVar.getPath().isPrefixOf(key.getPath())) {
                break;
            }
            if (key.getPath().length() <= nldVar.getPath().length() + 1 && ir5.AbstractC7571a.fromDocument(value).compareTo(abstractC7571a) > 0 && (set.contains(value.getKey()) || nldVar.matches(value))) {
                map.put(value.getKey(), value.mutableCopy());
            }
        }
        return map;
    }

    @Override // p000.kyd
    public void removeAll(Collection<ci4> collection) {
        r80.hardAssert(this.f95156b != null, "setIndexManager() not called", new Object[0]);
        ky7<ci4, ph4> ky7VarEmptyDocumentMap = uh4.emptyDocumentMap();
        for (ci4 ci4Var : collection) {
            this.f95155a = this.f95155a.remove(ci4Var);
            ky7VarEmptyDocumentMap = ky7VarEmptyDocumentMap.insert(ci4Var, t4b.newNoDocument(ci4Var, euf.f34067b));
        }
        this.f95156b.updateIndexEntries(ky7VarEmptyDocumentMap);
    }

    @Override // p000.kyd
    public void setIndexManager(f08 f08Var) {
        this.f95156b = f08Var;
    }

    @Override // p000.kyd
    public Map<ci4, t4b> getAll(String str, ir5.AbstractC7571a abstractC7571a, int i) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    @Override // p000.kyd
    public Map<ci4, t4b> getDocumentsMatchingQuery(nld nldVar, ir5.AbstractC7571a abstractC7571a, @efb Set<ci4> set) {
        return getDocumentsMatchingQuery(nldVar, abstractC7571a, set, null);
    }
}
