package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public interface ph4 {

    /* JADX INFO: renamed from: a */
    public static final Comparator<ph4> f70782a = new Comparator() { // from class: mh4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ph4.lambda$static$0((ph4) obj, (ph4) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(ph4 ph4Var, ph4 ph4Var2) {
        return ph4Var.getKey().compareTo(ph4Var2.getKey());
    }

    nkb getData();

    @hib
    b2i getField(wr5 wr5Var);

    ci4 getKey();

    euf getReadTime();

    euf getVersion();

    boolean hasCommittedMutations();

    boolean hasLocalMutations();

    boolean hasPendingWrites();

    boolean isFoundDocument();

    boolean isNoDocument();

    boolean isUnknownDocument();

    boolean isValidDocument();

    t4b mutableCopy();
}
