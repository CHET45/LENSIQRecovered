package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
public interface kyd {
    void add(t4b t4bVar, euf eufVar);

    t4b get(ci4 ci4Var);

    Map<ci4, t4b> getAll(Iterable<ci4> iterable);

    Map<ci4, t4b> getAll(String str, ir5.AbstractC7571a abstractC7571a, int i);

    Map<ci4, t4b> getDocumentsMatchingQuery(nld nldVar, ir5.AbstractC7571a abstractC7571a, @ofb Set<ci4> set);

    Map<ci4, t4b> getDocumentsMatchingQuery(nld nldVar, ir5.AbstractC7571a abstractC7571a, @ofb Set<ci4> set, @eib pld pldVar);

    void removeAll(Collection<ci4> collection);

    void setIndexManager(f08 f08Var);
}
