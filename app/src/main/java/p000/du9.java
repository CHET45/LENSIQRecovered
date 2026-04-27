package p000;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public interface du9 extends Serializable {

    /* JADX INFO: renamed from: K */
    public static final String f30882K = "*";

    /* JADX INFO: renamed from: O */
    public static final String f30883O = "+";

    void add(du9 du9Var);

    boolean contains(du9 du9Var);

    boolean contains(String str);

    boolean equals(Object obj);

    String getName();

    boolean hasChildren();

    boolean hasReferences();

    int hashCode();

    Iterator<du9> iterator();

    boolean remove(du9 du9Var);
}
