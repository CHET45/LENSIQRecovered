package p000;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000.ir5;
import p000.yie;

/* JADX INFO: loaded from: classes5.dex */
public final class eje implements kyd {

    /* JADX INFO: renamed from: e */
    @fdi
    public static final int f33212e = 9;

    /* JADX INFO: renamed from: a */
    public final yie f33213a;

    /* JADX INFO: renamed from: b */
    public final ud9 f33214b;

    /* JADX INFO: renamed from: c */
    public f08 f33215c;

    /* JADX INFO: renamed from: d */
    public final C5348c f33216d = new C5348c();

    /* JADX INFO: renamed from: eje$b */
    public enum EnumC5347b {
        NO_DOCUMENT(1),
        FOUND_DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        INVALID_DOCUMENT(4);


        /* JADX INFO: renamed from: a */
        public final int f33222a;

        EnumC5347b(int i) {
            this.f33222a = i;
        }

        /* JADX INFO: renamed from: a */
        public static EnumC5347b m10076a(t4b t4bVar) {
            if (t4bVar.isNoDocument()) {
                return NO_DOCUMENT;
            }
            if (t4bVar.isFoundDocument()) {
                return FOUND_DOCUMENT;
            }
            if (t4bVar.isUnknownDocument()) {
                return UNKNOWN_DOCUMENT;
            }
            r80.hardAssert(!t4bVar.isValidDocument(), "MutableDocument has an unknown type", new Object[0]);
            return INVALID_DOCUMENT;
        }
    }

    /* JADX INFO: renamed from: eje$c */
    public static class C5348c {

        /* JADX INFO: renamed from: a */
        public final ConcurrentHashMap<a, EnumC5347b> f33223a;

        /* JADX INFO: renamed from: eje$c$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final String f33224a;

            /* JADX INFO: renamed from: b */
            public final int f33225b;

            /* JADX INFO: renamed from: c */
            public final int f33226c;

            public a(String str, int i, int i2) {
                this.f33224a = str;
                this.f33225b = i;
                this.f33226c = i2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f33225b == aVar.f33225b && this.f33226c == aVar.f33226c && Objects.equals(this.f33224a, aVar.f33224a);
            }

            public int hashCode() {
                return Objects.hash(this.f33224a, Integer.valueOf(this.f33225b), Integer.valueOf(this.f33226c));
            }

            @efb
            public String toString() {
                return "DocumentTypeBackfiller.BackfillKey(path=" + this.f33224a + ", readTimeSeconds=" + this.f33225b + ", readTimeNanos=" + this.f33226c + c0b.f15434d;
            }
        }

        /* JADX INFO: renamed from: eje$c$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            public final String f33227a;

            /* JADX INFO: renamed from: b */
            public final Object[] f33228b;

            /* JADX INFO: renamed from: c */
            public final int f33229c;

            public b(String str, Object[] objArr, int i) {
                this.f33227a = str;
                this.f33228b = objArr;
                this.f33229c = i;
            }
        }

        private C5348c() {
            this.f33223a = new ConcurrentHashMap<>();
        }

        /* JADX INFO: renamed from: a */
        public void m10077a(yie yieVar) {
            while (true) {
                b bVarM10078b = m10078b();
                if (bVarM10078b == null) {
                    return;
                } else {
                    yieVar.m26109p(bVarM10078b.f33227a, bVarM10078b.f33228b);
                }
            }
        }

        @eib
        /* JADX INFO: renamed from: b */
        public b m10078b() {
            if (this.f33223a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Iterator<a> it = this.f33223a.keySet().iterator();
            int i = 0;
            while (it.hasNext() && arrayList.size() < 900) {
                a next = it.next();
                EnumC5347b enumC5347bRemove = this.f33223a.remove(next);
                if (enumC5347bRemove != null) {
                    i++;
                    arrayList.add(next.f33224a);
                    int size = arrayList.size();
                    arrayList.add(Integer.valueOf(next.f33225b));
                    int size2 = arrayList.size();
                    arrayList.add(Integer.valueOf(next.f33226c));
                    int size3 = arrayList.size();
                    arrayList.add(Integer.valueOf(enumC5347bRemove.f33222a));
                    int size4 = arrayList.size();
                    sb.append(" WHEN path=?");
                    sb.append(size);
                    sb.append(" AND read_time_seconds=?");
                    sb.append(size2);
                    sb.append(" AND read_time_nanos=?");
                    sb.append(size3);
                    sb.append(" THEN ?");
                    sb.append(size4);
                    if (sb2.length() > 0) {
                        sb2.append(" OR");
                    }
                    sb2.append(" (path=?");
                    sb2.append(size);
                    sb2.append(" AND read_time_seconds=?");
                    sb2.append(size2);
                    sb2.append(" AND read_time_nanos=?");
                    sb2.append(size3);
                    sb2.append(')');
                }
            }
            if (i == 0) {
                return null;
            }
            return new b("UPDATE remote_documents SET document_type = CASE" + ((Object) sb) + " ELSE NULL END WHERE" + ((Object) sb2), arrayList.toArray(), i);
        }

        /* JADX INFO: renamed from: c */
        public void m10079c(String str, int i, int i2, t4b t4bVar) {
            this.f33223a.putIfAbsent(new a(str, i, i2), EnumC5347b.m10076a(t4bVar));
        }
    }

    public eje(yie yieVar, ud9 ud9Var) {
        this.f33213a = yieVar;
        this.f33214b = ud9Var;
    }

    private t4b decodeMaybeDocument(byte[] bArr, int i, int i2) {
        try {
            return this.f33214b.m23250a(k6a.parseFrom(bArr)).setReadTime(new euf(new Timestamp(i, i2)));
        } catch (ce8 e) {
            throw r80.fail("MaybeDocument failed to parse: %s", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAll$0(fo0 fo0Var, Map map, Cursor cursor) {
        processRowInBackground(fo0Var, map, cursor, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAll$1(fo0 fo0Var, Map map, pz6 pz6Var, pld pldVar, Cursor cursor) {
        processRowInBackground(fo0Var, map, cursor, pz6Var);
        if (pldVar != null) {
            pldVar.incrementDocumentReadCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$getDocumentsMatchingQuery$3(nld nldVar, Set set, t4b t4bVar) {
        return Boolean.valueOf(nldVar.matches(t4bVar) || set.contains(t4bVar.getKey()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processRowInBackground$2(byte[] bArr, int i, int i2, boolean z, String str, pz6 pz6Var, Map map) {
        t4b t4bVarDecodeMaybeDocument = decodeMaybeDocument(bArr, i, i2);
        if (z) {
            this.f33216d.m10079c(str, i, i2, t4bVarDecodeMaybeDocument);
        }
        if (pz6Var == null || ((Boolean) pz6Var.apply(t4bVarDecodeMaybeDocument)).booleanValue()) {
            synchronized (map) {
                map.put(t4bVarDecodeMaybeDocument.getKey(), t4bVarDecodeMaybeDocument);
            }
        }
    }

    private void processRowInBackground(fo0 fo0Var, final Map<ci4, t4b> map, Cursor cursor, @eib final pz6<t4b, Boolean> pz6Var) {
        final byte[] blob = cursor.getBlob(0);
        final int i = cursor.getInt(1);
        final int i2 = cursor.getInt(2);
        final boolean zIsNull = cursor.isNull(3);
        final String string = cursor.getString(4);
        Runnable runnable = new Runnable() { // from class: aje
            @Override // java.lang.Runnable
            public final void run() {
                this.f1765a.lambda$processRowInBackground$2(blob, i, i2, zIsNull, string, pz6Var, map);
            }
        };
        if (cursor.isFirst() && cursor.isLast()) {
            runnable.run();
        } else {
            fo0Var.submit(runnable);
        }
    }

    @Override // p000.kyd
    public void add(t4b t4bVar, euf eufVar) {
        r80.hardAssert(!eufVar.equals(euf.f34067b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        ci4 key = t4bVar.getKey();
        Timestamp timestamp = eufVar.getTimestamp();
        this.f33213a.m26109p("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, document_type, contents) VALUES (?, ?, ?, ?, ?, ?)", j15.m13678c(key.getPath()), Integer.valueOf(key.getPath().length()), Long.valueOf(timestamp.getSeconds()), Integer.valueOf(timestamp.getNanoseconds()), Integer.valueOf(EnumC5347b.m10076a(t4bVar).f33222a), this.f33214b.m23253d(t4bVar).toByteArray());
        this.f33215c.addToCollectionParentIndex(t4bVar.getKey().getCollectionPath());
    }

    @Override // p000.kyd
    public t4b get(ci4 ci4Var) {
        return getAll(Collections.singletonList(ci4Var)).get(ci4Var);
    }

    @Override // p000.kyd
    public Map<ci4, t4b> getAll(Iterable<ci4> iterable) {
        final HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (ci4 ci4Var : iterable) {
            arrayList.add(j15.m13678c(ci4Var.getPath()));
            map.put(ci4Var, t4b.newInvalidDocument(ci4Var));
        }
        yie.C15683b c15683b = new yie.C15683b(this.f33213a, "SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        final fo0 fo0Var = new fo0();
        while (c15683b.m26116c()) {
            c15683b.m26117d().m26122e(new su2() { // from class: cje
                @Override // p000.su2
                public final void accept(Object obj) {
                    this.f16747a.lambda$getAll$0(fo0Var, map, (Cursor) obj);
                }
            });
        }
        fo0Var.drain();
        this.f33216d.m10077a(this.f33213a);
        synchronized (map) {
        }
        return map;
    }

    @Override // p000.kyd
    public Map<ci4, t4b> getDocumentsMatchingQuery(nld nldVar, ir5.AbstractC7571a abstractC7571a, @ofb Set<ci4> set) {
        return getDocumentsMatchingQuery(nldVar, abstractC7571a, set, null);
    }

    @Override // p000.kyd
    public void removeAll(Collection<ci4> collection) {
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ky7<ci4, ph4> ky7VarEmptyDocumentMap = uh4.emptyDocumentMap();
        for (ci4 ci4Var : collection) {
            arrayList.add(j15.m13678c(ci4Var.getPath()));
            ky7VarEmptyDocumentMap = ky7VarEmptyDocumentMap.insert(ci4Var, t4b.newNoDocument(ci4Var, euf.f34067b));
        }
        yie.C15683b c15683b = new yie.C15683b(this.f33213a, "DELETE FROM remote_documents WHERE path IN (", arrayList, c0b.f15434d);
        while (c15683b.m26116c()) {
            c15683b.m26114a();
        }
        this.f33215c.updateIndexEntries(ky7VarEmptyDocumentMap);
    }

    @Override // p000.kyd
    public void setIndexManager(f08 f08Var) {
        this.f33215c = f08Var;
    }

    @Override // p000.kyd
    public Map<ci4, t4b> getDocumentsMatchingQuery(final nld nldVar, ir5.AbstractC7571a abstractC7571a, @ofb final Set<ci4> set, @eib pld pldVar) {
        return getAll(Collections.singletonList(nldVar.getPath()), abstractC7571a, Integer.MAX_VALUE, EnumC5347b.FOUND_DOCUMENT, new pz6() { // from class: dje
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return eje.lambda$getDocumentsMatchingQuery$3(nldVar, set, (t4b) obj);
            }
        }, pldVar);
    }

    @Override // p000.kyd
    public Map<ci4, t4b> getAll(String str, ir5.AbstractC7571a abstractC7571a, int i) {
        List<s6e> collectionParents = this.f33215c.getCollectionParents(str);
        ArrayList arrayList = new ArrayList(collectionParents.size());
        Iterator<s6e> it = collectionParents.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().append(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return getAll(arrayList, abstractC7571a, i, null);
        }
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int i3 = i2 + 100;
            map.putAll(getAll(arrayList.subList(i2, Math.min(arrayList.size(), i3)), abstractC7571a, i, null));
            i2 = i3;
        }
        return r0i.firstNEntries(map, i, ir5.AbstractC7571a.f48035b);
    }

    private Map<ci4, t4b> getAll(List<s6e> list, ir5.AbstractC7571a abstractC7571a, int i, @eib EnumC5347b enumC5347b, @eib final pz6<t4b, Boolean> pz6Var, @eib final pld pldVar) {
        String str;
        Timestamp timestamp = abstractC7571a.getReadTime().getTimestamp();
        ci4 documentKey = abstractC7571a.getDocumentKey();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? ");
        if (enumC5347b == null) {
            str = "";
        } else {
            str = " AND (document_type IS NULL OR document_type = ?) ";
        }
        sb.append(str);
        sb.append("AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ");
        StringBuilder sbRepeatSequence = r0i.repeatSequence(sb.toString(), list.size(), " UNION ");
        sbRepeatSequence.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        int i2 = 0;
        Object[] objArr = new Object[(((enumC5347b != null ? 1 : 0) + 9) * list.size()) + 1];
        for (s6e s6eVar : list) {
            String strM13678c = j15.m13678c(s6eVar);
            objArr[i2] = strM13678c;
            objArr[i2 + 1] = j15.m13679d(strM13678c);
            int i3 = i2 + 3;
            objArr[i2 + 2] = Integer.valueOf(s6eVar.length() + 1);
            if (enumC5347b != null) {
                objArr[i3] = Integer.valueOf(enumC5347b.f33222a);
                i3 = i2 + 4;
            }
            objArr[i3] = Long.valueOf(timestamp.getSeconds());
            objArr[i3 + 1] = Long.valueOf(timestamp.getSeconds());
            objArr[i3 + 2] = Integer.valueOf(timestamp.getNanoseconds());
            objArr[i3 + 3] = Long.valueOf(timestamp.getSeconds());
            objArr[i3 + 4] = Integer.valueOf(timestamp.getNanoseconds());
            objArr[i3 + 5] = j15.m13678c(documentKey.getPath());
            i2 = i3 + 6;
        }
        objArr[i2] = Integer.valueOf(i);
        final fo0 fo0Var = new fo0();
        final HashMap map = new HashMap();
        this.f33213a.m26113t(sbRepeatSequence.toString()).m26119b(objArr).m26122e(new su2() { // from class: bje
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f13881a.lambda$getAll$1(fo0Var, map, pz6Var, pldVar, (Cursor) obj);
            }
        });
        fo0Var.drain();
        this.f33216d.m10077a(this.f33213a);
        synchronized (map) {
        }
        return map;
    }

    private Map<ci4, t4b> getAll(List<s6e> list, ir5.AbstractC7571a abstractC7571a, int i, @eib pz6<t4b, Boolean> pz6Var) {
        return getAll(list, abstractC7571a, i, null, pz6Var, null);
    }
}
