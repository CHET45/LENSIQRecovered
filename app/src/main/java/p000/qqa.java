package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000.f08;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public class qqa implements f08 {

    /* JADX INFO: renamed from: a */
    public final C11585a f75124a = new C11585a();

    /* JADX INFO: renamed from: qqa$a */
    public static class C11585a {

        /* JADX INFO: renamed from: a */
        public final HashMap<String, HashSet<s6e>> f75125a = new HashMap<>();

        /* JADX INFO: renamed from: a */
        public boolean m20511a(s6e s6eVar) {
            r80.hardAssert(s6eVar.length() % 2 == 1, "Expected a collection path.", new Object[0]);
            String lastSegment = s6eVar.getLastSegment();
            s6e s6eVarPopLast = s6eVar.popLast();
            HashSet<s6e> hashSet = this.f75125a.get(lastSegment);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f75125a.put(lastSegment, hashSet);
            }
            return hashSet.add(s6eVarPopLast);
        }

        /* JADX INFO: renamed from: b */
        public List<s6e> m20512b(String str) {
            HashSet<s6e> hashSet = this.f75125a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
        }
    }

    @Override // p000.f08
    public void addFieldIndex(ir5 ir5Var) {
    }

    @Override // p000.f08
    public void addToCollectionParentIndex(s6e s6eVar) {
        this.f75124a.m20511a(s6eVar);
    }

    @Override // p000.f08
    public void createTargetIndexes(kmg kmgVar) {
    }

    @Override // p000.f08
    public void deleteAllFieldIndexes() {
    }

    @Override // p000.f08
    public void deleteFieldIndex(ir5 ir5Var) {
    }

    @Override // p000.f08
    public List<s6e> getCollectionParents(String str) {
        return this.f75124a.m20512b(str);
    }

    @Override // p000.f08
    @hib
    public List<ci4> getDocumentsMatchingTarget(kmg kmgVar) {
        return null;
    }

    @Override // p000.f08
    public Collection<ir5> getFieldIndexes(String str) {
        return Collections.emptyList();
    }

    @Override // p000.f08
    public f08.EnumC5538a getIndexType(kmg kmgVar) {
        return f08.EnumC5538a.NONE;
    }

    @Override // p000.f08
    public ir5.AbstractC7571a getMinOffset(kmg kmgVar) {
        return ir5.AbstractC7571a.f48034a;
    }

    @Override // p000.f08
    @hib
    public String getNextCollectionGroupToUpdate() {
        return null;
    }

    @Override // p000.f08
    public void start() {
    }

    @Override // p000.f08
    public void updateCollectionGroup(String str, ir5.AbstractC7571a abstractC7571a) {
    }

    @Override // p000.f08
    public void updateIndexEntries(ky7<ci4, ph4> ky7Var) {
    }

    @Override // p000.f08
    public Collection<ir5> getFieldIndexes() {
        return Collections.emptyList();
    }

    @Override // p000.f08
    public ir5.AbstractC7571a getMinOffset(String str) {
        return ir5.AbstractC7571a.f48034a;
    }
}
