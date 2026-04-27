package p000;

import java.util.Collection;
import java.util.List;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public interface f08 {

    /* JADX INFO: renamed from: f08$a */
    public enum EnumC5538a {
        NONE,
        PARTIAL,
        FULL
    }

    void addFieldIndex(ir5 ir5Var);

    void addToCollectionParentIndex(s6e s6eVar);

    void createTargetIndexes(kmg kmgVar);

    void deleteAllFieldIndexes();

    void deleteFieldIndex(ir5 ir5Var);

    List<s6e> getCollectionParents(String str);

    List<ci4> getDocumentsMatchingTarget(kmg kmgVar);

    Collection<ir5> getFieldIndexes();

    Collection<ir5> getFieldIndexes(String str);

    EnumC5538a getIndexType(kmg kmgVar);

    ir5.AbstractC7571a getMinOffset(String str);

    ir5.AbstractC7571a getMinOffset(kmg kmgVar);

    @hib
    String getNextCollectionGroupToUpdate();

    void start();

    void updateCollectionGroup(String str, ir5.AbstractC7571a abstractC7571a);

    void updateIndexEntries(ky7<ci4, ph4> ky7Var);
}
