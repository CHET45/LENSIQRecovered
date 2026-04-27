package p000;

import com.google.auto.value.AutoValue;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p000.ir5;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class ir5 {

    /* JADX INFO: renamed from: a */
    public static final int f48029a = -1;

    /* JADX INFO: renamed from: b */
    public static final int f48030b = -1;

    /* JADX INFO: renamed from: c */
    public static final int f48031c = 0;

    /* JADX INFO: renamed from: d */
    public static AbstractC7572b f48032d = AbstractC7572b.create(0, AbstractC7571a.f48034a);

    /* JADX INFO: renamed from: e */
    public static final Comparator<ir5> f48033e = new Comparator() { // from class: gr5
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ir5.lambda$static$0((ir5) obj, (ir5) obj2);
        }
    };

    /* JADX INFO: renamed from: ir5$a */
    @AutoValue
    public static abstract class AbstractC7571a implements Comparable<AbstractC7571a> {

        /* JADX INFO: renamed from: a */
        public static final AbstractC7571a f48034a = create(euf.f34067b, ci4.empty(), -1);

        /* JADX INFO: renamed from: b */
        public static final Comparator<t4b> f48035b = new Comparator() { // from class: hr5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ir5.AbstractC7571a.lambda$static$0((t4b) obj, (t4b) obj2);
            }
        };

        public static AbstractC7571a create(euf eufVar, ci4 ci4Var, int i) {
            return new xk0(eufVar, ci4Var, i);
        }

        public static AbstractC7571a createSuccessor(euf eufVar, int i) {
            long seconds = eufVar.getTimestamp().getSeconds();
            int nanoseconds = eufVar.getTimestamp().getNanoseconds() + 1;
            return create(new euf(((double) nanoseconds) == 1.0E9d ? new Timestamp(seconds + 1, 0) : new Timestamp(seconds, nanoseconds)), ci4.empty(), i);
        }

        public static AbstractC7571a fromDocument(ph4 ph4Var) {
            return create(ph4Var.getReadTime(), ph4Var.getKey(), -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(t4b t4bVar, t4b t4bVar2) {
            return fromDocument(t4bVar).compareTo(fromDocument(t4bVar2));
        }

        public abstract ci4 getDocumentKey();

        public abstract int getLargestBatchId();

        public abstract euf getReadTime();

        @Override // java.lang.Comparable
        public int compareTo(AbstractC7571a abstractC7571a) {
            int iCompareTo = getReadTime().compareTo(abstractC7571a.getReadTime());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = getDocumentKey().compareTo(abstractC7571a.getDocumentKey());
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(getLargestBatchId(), abstractC7571a.getLargestBatchId());
        }
    }

    /* JADX INFO: renamed from: ir5$b */
    @AutoValue
    public static abstract class AbstractC7572b {
        public static AbstractC7572b create(long j, AbstractC7571a abstractC7571a) {
            return new yk0(j, abstractC7571a);
        }

        public abstract AbstractC7571a getOffset();

        public abstract long getSequenceNumber();

        public static AbstractC7572b create(long j, euf eufVar, ci4 ci4Var, int i) {
            return create(j, AbstractC7571a.create(eufVar, ci4Var, i));
        }
    }

    /* JADX INFO: renamed from: ir5$c */
    @AutoValue
    public static abstract class AbstractC7573c implements Comparable<AbstractC7573c> {

        /* JADX INFO: renamed from: ir5$c$a */
        public enum a {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        public static AbstractC7573c create(wr5 wr5Var, a aVar) {
            return new zk0(wr5Var, aVar);
        }

        public abstract wr5 getFieldPath();

        public abstract a getKind();

        @Override // java.lang.Comparable
        public int compareTo(AbstractC7573c abstractC7573c) {
            int iCompareTo = getFieldPath().compareTo(abstractC7573c.getFieldPath());
            return iCompareTo != 0 ? iCompareTo : getKind().compareTo(abstractC7573c.getKind());
        }
    }

    public static ir5 create(int i, String str, List<AbstractC7573c> list, AbstractC7572b abstractC7572b) {
        return new wk0(i, str, list, abstractC7572b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(ir5 ir5Var, ir5 ir5Var2) {
        int iCompareTo = ir5Var.getCollectionGroup().compareTo(ir5Var2.getCollectionGroup());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Iterator<AbstractC7573c> it = ir5Var.getSegments().iterator();
        Iterator<AbstractC7573c> it2 = ir5Var2.getSegments().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo2 = it.next().compareTo(it2.next());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    @hib
    public AbstractC7573c getArraySegment() {
        for (AbstractC7573c abstractC7573c : getSegments()) {
            if (abstractC7573c.getKind().equals(AbstractC7573c.a.CONTAINS)) {
                return abstractC7573c;
            }
        }
        return null;
    }

    public abstract String getCollectionGroup();

    public List<AbstractC7573c> getDirectionalSegments() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC7573c abstractC7573c : getSegments()) {
            if (!abstractC7573c.getKind().equals(AbstractC7573c.a.CONTAINS)) {
                arrayList.add(abstractC7573c);
            }
        }
        return arrayList;
    }

    public abstract int getIndexId();

    public abstract AbstractC7572b getIndexState();

    public abstract List<AbstractC7573c> getSegments();
}
