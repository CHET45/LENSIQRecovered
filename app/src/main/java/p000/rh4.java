package p000;

import com.google.firebase.firestore.C3612o;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.List;
import p000.cj4;

/* JADX INFO: loaded from: classes5.dex */
public class rh4 {

    /* JADX INFO: renamed from: a */
    public final EnumC12091b f78293a;

    /* JADX INFO: renamed from: b */
    public final C3612o f78294b;

    /* JADX INFO: renamed from: c */
    public final int f78295c;

    /* JADX INFO: renamed from: d */
    public final int f78296d;

    /* JADX INFO: renamed from: rh4$a */
    public static /* synthetic */ class C12090a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78297a;

        static {
            int[] iArr = new int[cj4.EnumC2330a.values().length];
            f78297a = iArr;
            try {
                iArr[cj4.EnumC2330a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78297a[cj4.EnumC2330a.METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78297a[cj4.EnumC2330a.MODIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78297a[cj4.EnumC2330a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: rh4$b */
    public enum EnumC12091b {
        ADDED,
        MODIFIED,
        REMOVED
    }

    @fdi
    public rh4(C3612o c3612o, EnumC12091b enumC12091b, int i, int i2) {
        this.f78293a = enumC12091b;
        this.f78294b = c3612o;
        this.f78295c = i;
        this.f78296d = i2;
    }

    /* JADX INFO: renamed from: a */
    public static List<rh4> m21359a(FirebaseFirestore firebaseFirestore, uta utaVar, lbi lbiVar) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList arrayList = new ArrayList();
        if (lbiVar.getOldDocuments().isEmpty()) {
            ph4 ph4Var = null;
            int i = 0;
            for (cj4 cj4Var : lbiVar.getChanges()) {
                ph4 document = cj4Var.getDocument();
                C3612o c3612oM6793d = C3612o.m6793d(firebaseFirestore, document, lbiVar.isFromCache(), lbiVar.getMutatedKeys().contains(document.getKey()));
                r80.hardAssert(cj4Var.getType() == cj4.EnumC2330a.ADDED, "Invalid added event for first snapshot", new Object[0]);
                r80.hardAssert(ph4Var == null || lbiVar.getQuery().comparator().compare(ph4Var, document) < 0, "Got added events in wrong order", new Object[0]);
                arrayList.add(new rh4(c3612oM6793d, EnumC12091b.ADDED, -1, i));
                ph4Var = document;
                i++;
            }
        } else {
            yi4 oldDocuments = lbiVar.getOldDocuments();
            for (cj4 cj4Var2 : lbiVar.getChanges()) {
                if (utaVar != uta.EXCLUDE || cj4Var2.getType() != cj4.EnumC2330a.METADATA) {
                    ph4 document2 = cj4Var2.getDocument();
                    C3612o c3612oM6793d2 = C3612o.m6793d(firebaseFirestore, document2, lbiVar.isFromCache(), lbiVar.getMutatedKeys().contains(document2.getKey()));
                    EnumC12091b type = getType(cj4Var2);
                    if (type != EnumC12091b.ADDED) {
                        iIndexOf = oldDocuments.indexOf(document2.getKey());
                        r80.hardAssert(iIndexOf >= 0, "Index for document not found", new Object[0]);
                        oldDocuments = oldDocuments.remove(document2.getKey());
                    } else {
                        iIndexOf = -1;
                    }
                    if (type != EnumC12091b.REMOVED) {
                        oldDocuments = oldDocuments.add(document2);
                        iIndexOf2 = oldDocuments.indexOf(document2.getKey());
                        r80.hardAssert(iIndexOf2 >= 0, "Index for document not found", new Object[0]);
                    } else {
                        iIndexOf2 = -1;
                    }
                    arrayList.add(new rh4(c3612oM6793d2, type, iIndexOf, iIndexOf2));
                }
            }
        }
        return arrayList;
    }

    public boolean equals(@hib Object obj) {
        if (!(obj instanceof rh4)) {
            return false;
        }
        rh4 rh4Var = (rh4) obj;
        return this.f78293a.equals(rh4Var.f78293a) && this.f78294b.equals(rh4Var.f78294b) && this.f78295c == rh4Var.f78295c && this.f78296d == rh4Var.f78296d;
    }

    @efb
    public C3612o getDocument() {
        return this.f78294b;
    }

    public int getNewIndex() {
        return this.f78296d;
    }

    public int getOldIndex() {
        return this.f78295c;
    }

    @efb
    public EnumC12091b getType() {
        return this.f78293a;
    }

    public int hashCode() {
        return (((((this.f78293a.hashCode() * 31) + this.f78294b.hashCode()) * 31) + this.f78295c) * 31) + this.f78296d;
    }

    private static EnumC12091b getType(cj4 cj4Var) {
        int i = C12090a.f78297a[cj4Var.getType().ordinal()];
        if (i == 1) {
            return EnumC12091b.ADDED;
        }
        if (i == 2 || i == 3) {
            return EnumC12091b.MODIFIED;
        }
        if (i == 4) {
            return EnumC12091b.REMOVED;
        }
        throw new IllegalArgumentException("Unknown view change type: " + cj4Var.getType());
    }
}
