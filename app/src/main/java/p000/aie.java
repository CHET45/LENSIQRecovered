package p000;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import p000.f08;
import p000.fr5;
import p000.ir5;
import p000.n7c;
import p000.qqa;
import p000.rm2;
import p000.yie;

/* JADX INFO: loaded from: classes5.dex */
public final class aie implements f08 {

    /* JADX INFO: renamed from: k */
    public static final String f1662k = "aie";

    /* JADX INFO: renamed from: l */
    public static final byte[] f1663l = new byte[0];

    /* JADX INFO: renamed from: a */
    public final yie f1664a;

    /* JADX INFO: renamed from: b */
    public final ud9 f1665b;

    /* JADX INFO: renamed from: c */
    public final String f1666c;

    /* JADX INFO: renamed from: d */
    public final Map<kmg, List<kmg>> f1667d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final qqa.C11585a f1668e = new qqa.C11585a();

    /* JADX INFO: renamed from: f */
    public final Map<String, Map<Integer, ir5>> f1669f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Queue<ir5> f1670g = new PriorityQueue(10, new Comparator() { // from class: uhe
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return aie.lambda$new$0((ir5) obj, (ir5) obj2);
        }
    });

    /* JADX INFO: renamed from: h */
    public boolean f1671h = false;

    /* JADX INFO: renamed from: i */
    public int f1672i = -1;

    /* JADX INFO: renamed from: j */
    public long f1673j = -1;

    public aie(yie yieVar, ud9 ud9Var, syh syhVar) {
        this.f1664a = yieVar;
        this.f1665b = ud9Var;
        this.f1666c = syhVar.isAuthenticated() ? syhVar.getUid() : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addIndexEntry, reason: merged with bridge method [inline-methods] */
    public void lambda$updateEntries$4(ph4 ph4Var, d08 d08Var) {
        this.f1664a.m26109p("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(d08Var.getIndexId()), this.f1666c, d08Var.getArrayValue(), d08Var.getDirectionalValue(), ph4Var.getKey().toString());
    }

    private SortedSet<d08> computeIndexEntries(ph4 ph4Var, ir5 ir5Var) {
        TreeSet treeSet = new TreeSet();
        byte[] bArrEncodeDirectionalElements = encodeDirectionalElements(ir5Var, ph4Var);
        if (bArrEncodeDirectionalElements == null) {
            return treeSet;
        }
        ir5.AbstractC7573c arraySegment = ir5Var.getArraySegment();
        if (arraySegment != null) {
            b2i field = ph4Var.getField(arraySegment.getFieldPath());
            if (s2i.isArray(field)) {
                Iterator<b2i> it = field.getArrayValue().getValuesList().iterator();
                while (it.hasNext()) {
                    treeSet.add(d08.create(ir5Var.getIndexId(), ph4Var.getKey(), encodeSingleElement(it.next()), bArrEncodeDirectionalElements));
                }
            }
        } else {
            treeSet.add(d08.create(ir5Var.getIndexId(), ph4Var.getKey(), new byte[0], bArrEncodeDirectionalElements));
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: deleteIndexEntry, reason: merged with bridge method [inline-methods] */
    public void lambda$updateEntries$5(ph4 ph4Var, d08 d08Var) {
        this.f1664a.m26109p("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(d08Var.getIndexId()), this.f1666c, d08Var.getArrayValue(), d08Var.getDirectionalValue(), ph4Var.getKey().toString());
    }

    private Object[] encodeBound(ir5 ir5Var, kmg kmgVar, gc1 gc1Var) {
        return encodeValues(ir5Var, kmgVar, gc1Var.getPosition());
    }

    @hib
    private byte[] encodeDirectionalElements(ir5 ir5Var, ph4 ph4Var) {
        c08 c08Var = new c08();
        for (ir5.AbstractC7573c abstractC7573c : ir5Var.getDirectionalSegments()) {
            b2i field = ph4Var.getField(abstractC7573c.getFieldPath());
            if (field == null) {
                return null;
            }
            y06.f99828p.writeIndexValue(field, c08Var.forKind(abstractC7573c.getKind()));
        }
        return c08Var.getEncodedBytes();
    }

    private byte[] encodeSegments(ir5 ir5Var) {
        return this.f1665b.encodeFieldIndexSegments(ir5Var.getSegments()).toByteArray();
    }

    private byte[] encodeSingleElement(b2i b2iVar) {
        c08 c08Var = new c08();
        y06.f99828p.writeIndexValue(b2iVar, c08Var.forKind(ir5.AbstractC7573c.a.ASCENDING));
        return c08Var.getEncodedBytes();
    }

    @hib
    private Object[] encodeValues(ir5 ir5Var, kmg kmgVar, @hib Collection<b2i> collection) {
        if (collection == null) {
            return null;
        }
        List<c08> arrayList = new ArrayList<>();
        arrayList.add(new c08());
        Iterator<b2i> it = collection.iterator();
        for (ir5.AbstractC7573c abstractC7573c : ir5Var.getDirectionalSegments()) {
            b2i next = it.next();
            for (c08 c08Var : arrayList) {
                if (isInFilter(kmgVar, abstractC7573c.getFieldPath()) && s2i.isArray(next)) {
                    arrayList = expandIndexValues(arrayList, abstractC7573c, next);
                } else {
                    y06.f99828p.writeIndexValue(next, c08Var.forKind(abstractC7573c.getKind()));
                }
            }
        }
        return getEncodedBytes(arrayList);
    }

    private List<c08> expandIndexValues(List<c08> list, ir5.AbstractC7573c abstractC7573c, b2i b2iVar) {
        ArrayList<c08> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (b2i b2iVar2 : b2iVar.getArrayValue().getValuesList()) {
            for (c08 c08Var : arrayList) {
                c08 c08Var2 = new c08();
                c08Var2.seed(c08Var.getEncodedBytes());
                y06.f99828p.writeIndexValue(b2iVar2, c08Var2.forKind(abstractC7573c.getKind()));
                arrayList2.add(c08Var2);
            }
        }
        return arrayList2;
    }

    private Object[] fillBounds(int i, int i2, @hib List<b2i> list, Object[] objArr, Object[] objArr2, @hib Object[] objArr3) {
        int size = i / (list != null ? list.size() : 1);
        int i3 = 0;
        Object[] objArr4 = new Object[(i * 5) + (objArr3 != null ? objArr3.length : 0)];
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            objArr4[i4] = Integer.valueOf(i2);
            int i6 = i4 + 2;
            objArr4[i4 + 1] = this.f1666c;
            int i7 = i4 + 3;
            objArr4[i6] = list != null ? encodeSingleElement(list.get(i5 / size)) : f1663l;
            int i8 = i4 + 4;
            int i9 = i5 % size;
            objArr4[i7] = objArr[i9];
            i4 += 5;
            objArr4[i8] = objArr2[i9];
        }
        if (objArr3 != null) {
            int length = objArr3.length;
            while (i3 < length) {
                objArr4[i4] = objArr3[i3];
                i3++;
                i4++;
            }
        }
        return objArr4;
    }

    private Object[] generateQueryAndBindings(kmg kmgVar, int i, @hib List<b2i> list, Object[] objArr, String str, Object[] objArr2, String str2, @hib Object[] objArr3) {
        StringBuilder sb;
        int iMax = Math.max(objArr.length, objArr2.length) * (list != null ? list.size() : 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT document_key, directional_value FROM index_entries ");
        sb2.append("WHERE index_id = ? AND uid = ? ");
        sb2.append("AND array_value = ? ");
        sb2.append("AND directional_value ");
        sb2.append(str);
        sb2.append(" ? ");
        sb2.append("AND directional_value ");
        sb2.append(str2);
        sb2.append(" ? ");
        CharSequence charSequenceRepeatSequence = r0i.repeatSequence(sb2, iMax, " UNION ");
        if (objArr3 != null) {
            StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
            sb3.append(charSequenceRepeatSequence);
            sb3.append(") WHERE directional_value NOT IN (");
            sb3.append((CharSequence) r0i.repeatSequence("?", objArr3.length, ", "));
            sb3.append(c0b.f15434d);
            sb = sb3;
        } else {
            sb = charSequenceRepeatSequence;
        }
        Object[] objArrFillBounds = fillBounds(iMax, i, list, objArr, objArr2, objArr3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb.toString());
        arrayList.addAll(Arrays.asList(objArrFillBounds));
        return arrayList.toArray();
    }

    private Object[] getEncodedBytes(List<c08> list) {
        Object[] objArr = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            objArr[i] = list.get(i).getEncodedBytes();
        }
        return objArr;
    }

    private SortedSet<d08> getExistingIndexEntries(final ci4 ci4Var, final ir5 ir5Var) {
        final TreeSet treeSet = new TreeSet();
        this.f1664a.m26113t("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?").m26119b(Integer.valueOf(ir5Var.getIndexId()), ci4Var.toString(), this.f1666c).m26122e(new su2() { // from class: xhe
            @Override // p000.su2
            public final void accept(Object obj) {
                aie.lambda$getExistingIndexEntries$6(treeSet, ir5Var, ci4Var, (Cursor) obj);
            }
        });
        return treeSet;
    }

    @hib
    private ir5 getFieldIndex(kmg kmgVar) {
        r80.hardAssert(this.f1671h, "IndexManager not started", new Object[0]);
        bng bngVar = new bng(kmgVar);
        Collection<ir5> fieldIndexes = getFieldIndexes(kmgVar.getCollectionGroup() != null ? kmgVar.getCollectionGroup() : kmgVar.getPath().getLastSegment());
        ir5 ir5Var = null;
        if (fieldIndexes.isEmpty()) {
            return null;
        }
        for (ir5 ir5Var2 : fieldIndexes) {
            if (bngVar.servedByIndex(ir5Var2) && (ir5Var == null || ir5Var2.getSegments().size() > ir5Var.getSegments().size())) {
                ir5Var = ir5Var2;
            }
        }
        return ir5Var;
    }

    private ir5.AbstractC7571a getMinOffset(Collection<ir5> collection) {
        r80.hardAssert(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator<ir5> it = collection.iterator();
        ir5.AbstractC7571a offset = it.next().getIndexState().getOffset();
        int largestBatchId = offset.getLargestBatchId();
        while (it.hasNext()) {
            ir5.AbstractC7571a offset2 = it.next().getIndexState().getOffset();
            if (offset2.compareTo(offset) < 0) {
                offset = offset2;
            }
            largestBatchId = Math.max(offset2.getLargestBatchId(), largestBatchId);
        }
        return ir5.AbstractC7571a.create(offset.getReadTime(), offset.getDocumentKey(), largestBatchId);
    }

    private List<kmg> getSubTargets(kmg kmgVar) {
        if (this.f1667d.containsKey(kmgVar)) {
            return this.f1667d.get(kmgVar);
        }
        ArrayList arrayList = new ArrayList();
        if (kmgVar.getFilters().isEmpty()) {
            arrayList.add(kmgVar);
        } else {
            Iterator<su5> it = zj9.getDnfTerms(new rm2(kmgVar.getFilters(), rm2.EnumC12152a.AND)).iterator();
            while (it.hasNext()) {
                arrayList.add(new kmg(kmgVar.getPath(), kmgVar.getCollectionGroup(), it.next().getFilters(), kmgVar.getOrderBy(), kmgVar.getLimit(), kmgVar.getStartAt(), kmgVar.getEndAt()));
            }
        }
        this.f1667d.put(kmgVar, arrayList);
        return arrayList;
    }

    private boolean isInFilter(kmg kmgVar, wr5 wr5Var) {
        for (su5 su5Var : kmgVar.getFilters()) {
            if (su5Var instanceof fr5) {
                fr5 fr5Var = (fr5) su5Var;
                if (fr5Var.getField().equals(wr5Var)) {
                    fr5.EnumC5939b operator = fr5Var.getOperator();
                    if (operator.equals(fr5.EnumC5939b.IN) || operator.equals(fr5.EnumC5939b.NOT_IN)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCollectionParents$3(ArrayList arrayList, Cursor cursor) {
        arrayList.add(j15.m13677b(cursor.getString(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getDocumentsMatchingTarget$7(List list, Cursor cursor) {
        list.add(ci4.fromPath(s6e.fromString(cursor.getString(0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getExistingIndexEntries$6(SortedSet sortedSet, ir5 ir5Var, ci4 ci4Var, Cursor cursor) {
        sortedSet.add(d08.create(ir5Var.getIndexId(), ci4Var, cursor.getBlob(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(ir5 ir5Var, ir5 ir5Var2) {
        int iCompare = Long.compare(ir5Var.getIndexState().getSequenceNumber(), ir5Var2.getIndexState().getSequenceNumber());
        return iCompare == 0 ? ir5Var.getCollectionGroup().compareTo(ir5Var2.getCollectionGroup()) : iCompare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$start$1(Map map, Cursor cursor) {
        map.put(Integer.valueOf(cursor.getInt(0)), ir5.AbstractC7572b.create(cursor.getLong(1), new euf(new Timestamp(cursor.getLong(2), cursor.getInt(3))), ci4.fromPath(j15.m13677b(cursor.getString(4))), cursor.getInt(5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$2(Map map, Cursor cursor) {
        try {
            int i = cursor.getInt(0);
            memoizeIndex(ir5.create(i, cursor.getString(1), this.f1665b.decodeFieldIndexSegments(vz7.parseFrom(cursor.getBlob(2))), map.containsKey(Integer.valueOf(i)) ? (ir5.AbstractC7572b) map.get(Integer.valueOf(i)) : ir5.f48032d));
        } catch (ce8 e) {
            throw r80.fail("Failed to decode index: " + e, new Object[0]);
        }
    }

    private void memoizeIndex(ir5 ir5Var) {
        Map<Integer, ir5> map = this.f1669f.get(ir5Var.getCollectionGroup());
        if (map == null) {
            map = new HashMap<>();
            this.f1669f.put(ir5Var.getCollectionGroup(), map);
        }
        ir5 ir5Var2 = map.get(Integer.valueOf(ir5Var.getIndexId()));
        if (ir5Var2 != null) {
            this.f1670g.remove(ir5Var2);
        }
        map.put(Integer.valueOf(ir5Var.getIndexId()), ir5Var);
        this.f1670g.add(ir5Var);
        this.f1672i = Math.max(this.f1672i, ir5Var.getIndexId());
        this.f1673j = Math.max(this.f1673j, ir5Var.getIndexState().getSequenceNumber());
    }

    private void updateEntries(final ph4 ph4Var, SortedSet<d08> sortedSet, SortedSet<d08> sortedSet2) {
        fj9.debug(f1662k, "Updating index entries for document '%s'", ph4Var.getKey());
        r0i.diffCollections(sortedSet, sortedSet2, new su2() { // from class: she
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f81847a.lambda$updateEntries$4(ph4Var, (d08) obj);
            }
        }, new su2() { // from class: the
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f84743a.lambda$updateEntries$5(ph4Var, (d08) obj);
            }
        });
    }

    @Override // p000.f08
    public void addFieldIndex(ir5 ir5Var) {
        r80.hardAssert(this.f1671h, "IndexManager not started", new Object[0]);
        int i = this.f1672i + 1;
        ir5 ir5VarCreate = ir5.create(i, ir5Var.getCollectionGroup(), ir5Var.getSegments(), ir5Var.getIndexState());
        this.f1664a.m26109p("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", Integer.valueOf(i), ir5VarCreate.getCollectionGroup(), encodeSegments(ir5VarCreate));
        memoizeIndex(ir5VarCreate);
    }

    @Override // p000.f08
    public void addToCollectionParentIndex(s6e s6eVar) {
        r80.hardAssert(this.f1671h, "IndexManager not started", new Object[0]);
        r80.hardAssert(s6eVar.length() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f1668e.m20511a(s6eVar)) {
            this.f1664a.m26109p("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", s6eVar.getLastSegment(), j15.m13678c(s6eVar.popLast()));
        }
    }

    @Override // p000.f08
    public void createTargetIndexes(kmg kmgVar) {
        r80.hardAssert(this.f1671h, "IndexManager not started", new Object[0]);
        for (kmg kmgVar2 : getSubTargets(kmgVar)) {
            f08.EnumC5538a indexType = getIndexType(kmgVar2);
            if (indexType == f08.EnumC5538a.NONE || indexType == f08.EnumC5538a.PARTIAL) {
                ir5 ir5VarBuildTargetIndex = new bng(kmgVar2).buildTargetIndex();
                if (ir5VarBuildTargetIndex != null) {
                    addFieldIndex(ir5VarBuildTargetIndex);
                }
            }
        }
    }

    @Override // p000.f08
    public void deleteAllFieldIndexes() {
        this.f1664a.m26109p("DELETE FROM index_configuration", new Object[0]);
        this.f1664a.m26109p("DELETE FROM index_entries", new Object[0]);
        this.f1664a.m26109p("DELETE FROM index_state", new Object[0]);
        this.f1670g.clear();
        this.f1669f.clear();
    }

    @Override // p000.f08
    public void deleteFieldIndex(ir5 ir5Var) {
        this.f1664a.m26109p("DELETE FROM index_configuration WHERE index_id = ?", Integer.valueOf(ir5Var.getIndexId()));
        this.f1664a.m26109p("DELETE FROM index_entries WHERE index_id = ?", Integer.valueOf(ir5Var.getIndexId()));
        this.f1664a.m26109p("DELETE FROM index_state WHERE index_id = ?", Integer.valueOf(ir5Var.getIndexId()));
        this.f1670g.remove(ir5Var);
        Map<Integer, ir5> map = this.f1669f.get(ir5Var.getCollectionGroup());
        if (map != null) {
            map.remove(Integer.valueOf(ir5Var.getIndexId()));
        }
    }

    @Override // p000.f08
    public List<s6e> getCollectionParents(String str) {
        r80.hardAssert(this.f1671h, "IndexManager not started", new Object[0]);
        final ArrayList arrayList = new ArrayList();
        this.f1664a.m26113t("SELECT parent FROM collection_parents WHERE collection_id = ?").m26119b(str).m26122e(new su2() { // from class: vhe
            @Override // p000.su2
            public final void accept(Object obj) {
                aie.lambda$getCollectionParents$3(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // p000.f08
    public List<ci4> getDocumentsMatchingTarget(kmg kmgVar) {
        r80.hardAssert(this.f1671h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (kmg kmgVar2 : getSubTargets(kmgVar)) {
            ir5 fieldIndex = getFieldIndex(kmgVar2);
            if (fieldIndex == null) {
                return null;
            }
            arrayList3.add(Pair.create(kmgVar2, fieldIndex));
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            kmg kmgVar3 = (kmg) pair.first;
            ir5 ir5Var = (ir5) pair.second;
            List<b2i> arrayValues = kmgVar3.getArrayValues(ir5Var);
            Collection<b2i> notInValues = kmgVar3.getNotInValues(ir5Var);
            gc1 lowerBound = kmgVar3.getLowerBound(ir5Var);
            gc1 upperBound = kmgVar3.getUpperBound(ir5Var);
            if (fj9.isDebugEnabled()) {
                fj9.debug(f1662k, "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", ir5Var, kmgVar3, arrayValues, lowerBound, upperBound);
            }
            Object[] objArrGenerateQueryAndBindings = generateQueryAndBindings(kmgVar3, ir5Var.getIndexId(), arrayValues, encodeBound(ir5Var, kmgVar3, lowerBound), lowerBound.isInclusive() ? ">=" : ">", encodeBound(ir5Var, kmgVar3, upperBound), upperBound.isInclusive() ? "<=" : "<", encodeValues(ir5Var, kmgVar3, notInValues));
            arrayList.add(String.valueOf(objArrGenerateQueryAndBindings[0]));
            arrayList2.addAll(Arrays.asList(objArrGenerateQueryAndBindings).subList(1, objArrGenerateQueryAndBindings.length));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join(" UNION ", arrayList));
        sb.append("ORDER BY directional_value, document_key ");
        sb.append(kmgVar.getKeyOrder().equals(n7c.EnumC9722a.ASCENDING) ? "asc " : "desc ");
        String str = "SELECT DISTINCT document_key FROM (" + sb.toString() + c0b.f15434d;
        if (kmgVar.hasLimit()) {
            str = str + " LIMIT " + kmgVar.getLimit();
        }
        r80.hardAssert(arrayList2.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
        yie.C15685d c15685dM26119b = this.f1664a.m26113t(str).m26119b(arrayList2.toArray());
        final ArrayList arrayList4 = new ArrayList();
        c15685dM26119b.m26122e(new su2() { // from class: whe
            @Override // p000.su2
            public final void accept(Object obj) {
                aie.lambda$getDocumentsMatchingTarget$7(arrayList4, (Cursor) obj);
            }
        });
        fj9.debug(f1662k, "Index scan returned %s documents", Integer.valueOf(arrayList4.size()));
        return arrayList4;
    }

    @Override // p000.f08
    public Collection<ir5> getFieldIndexes(String str) {
        r80.hardAssert(this.f1671h, "IndexManager not started", new Object[0]);
        Map<Integer, ir5> map = this.f1669f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    @Override // p000.f08
    public f08.EnumC5538a getIndexType(kmg kmgVar) {
        f08.EnumC5538a enumC5538a = f08.EnumC5538a.FULL;
        List<kmg> subTargets = getSubTargets(kmgVar);
        Iterator<kmg> it = subTargets.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            kmg next = it.next();
            ir5 fieldIndex = getFieldIndex(next);
            if (fieldIndex == null) {
                enumC5538a = f08.EnumC5538a.NONE;
                break;
            }
            if (fieldIndex.getSegments().size() < next.getSegmentCount()) {
                enumC5538a = f08.EnumC5538a.PARTIAL;
            }
        }
        return (kmgVar.hasLimit() && subTargets.size() > 1 && enumC5538a == f08.EnumC5538a.FULL) ? f08.EnumC5538a.PARTIAL : enumC5538a;
    }

    @Override // p000.f08
    @hib
    public String getNextCollectionGroupToUpdate() {
        r80.hardAssert(this.f1671h, "IndexManager not started", new Object[0]);
        ir5 ir5VarPeek = this.f1670g.peek();
        if (ir5VarPeek != null) {
            return ir5VarPeek.getCollectionGroup();
        }
        return null;
    }

    @Override // p000.f08
    public void start() {
        final HashMap map = new HashMap();
        this.f1664a.m26113t("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?").m26119b(this.f1666c).m26122e(new su2() { // from class: yhe
            @Override // p000.su2
            public final void accept(Object obj) {
                aie.lambda$start$1(map, (Cursor) obj);
            }
        });
        this.f1664a.m26113t("SELECT index_id, collection_group, index_proto FROM index_configuration").m26122e(new su2() { // from class: zhe
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f105100a.lambda$start$2(map, (Cursor) obj);
            }
        });
        this.f1671h = true;
    }

    @Override // p000.f08
    public void updateCollectionGroup(String str, ir5.AbstractC7571a abstractC7571a) {
        r80.hardAssert(this.f1671h, "IndexManager not started", new Object[0]);
        this.f1673j++;
        for (ir5 ir5Var : getFieldIndexes(str)) {
            ir5 ir5VarCreate = ir5.create(ir5Var.getIndexId(), ir5Var.getCollectionGroup(), ir5Var.getSegments(), ir5.AbstractC7572b.create(this.f1673j, abstractC7571a));
            this.f1664a.m26109p("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(ir5Var.getIndexId()), this.f1666c, Long.valueOf(this.f1673j), Long.valueOf(abstractC7571a.getReadTime().getTimestamp().getSeconds()), Integer.valueOf(abstractC7571a.getReadTime().getTimestamp().getNanoseconds()), j15.m13678c(abstractC7571a.getDocumentKey().getPath()), Integer.valueOf(abstractC7571a.getLargestBatchId()));
            memoizeIndex(ir5VarCreate);
        }
    }

    @Override // p000.f08
    public void updateIndexEntries(ky7<ci4, ph4> ky7Var) {
        r80.hardAssert(this.f1671h, "IndexManager not started", new Object[0]);
        for (Map.Entry<ci4, ph4> entry : ky7Var) {
            for (ir5 ir5Var : getFieldIndexes(entry.getKey().getCollectionGroup())) {
                SortedSet<d08> existingIndexEntries = getExistingIndexEntries(entry.getKey(), ir5Var);
                SortedSet<d08> sortedSetComputeIndexEntries = computeIndexEntries(entry.getValue(), ir5Var);
                if (!existingIndexEntries.equals(sortedSetComputeIndexEntries)) {
                    updateEntries(entry.getValue(), existingIndexEntries, sortedSetComputeIndexEntries);
                }
            }
        }
    }

    @Override // p000.f08
    public Collection<ir5> getFieldIndexes() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<Integer, ir5>> it = this.f1669f.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().values());
        }
        return arrayList;
    }

    @Override // p000.f08
    public ir5.AbstractC7571a getMinOffset(String str) {
        Collection<ir5> fieldIndexes = getFieldIndexes(str);
        r80.hardAssert(!fieldIndexes.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return getMinOffset(fieldIndexes);
    }

    @Override // p000.f08
    public ir5.AbstractC7571a getMinOffset(kmg kmgVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<kmg> it = getSubTargets(kmgVar).iterator();
        while (it.hasNext()) {
            ir5 fieldIndex = getFieldIndex(it.next());
            if (fieldIndex != null) {
                arrayList.add(fieldIndex);
            }
        }
        return getMinOffset(arrayList);
    }
}
