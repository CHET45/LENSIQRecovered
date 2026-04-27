package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p000.cj4;
import p000.lbi;
import p000.s59;

/* JADX INFO: loaded from: classes5.dex */
public class g8i {

    /* JADX INFO: renamed from: a */
    public final nld f39006a;

    /* JADX INFO: renamed from: c */
    public boolean f39008c;

    /* JADX INFO: renamed from: d */
    public yi4 f39009d;

    /* JADX INFO: renamed from: e */
    public qy7<ci4> f39010e;

    /* JADX INFO: renamed from: b */
    public lbi.EnumC8766a f39007b = lbi.EnumC8766a.NONE;

    /* JADX INFO: renamed from: f */
    public qy7<ci4> f39011f = ci4.emptyKeySet();

    /* JADX INFO: renamed from: g */
    public qy7<ci4> f39012g = ci4.emptyKeySet();

    /* JADX INFO: renamed from: g8i$a */
    public static /* synthetic */ class C6167a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39013a;

        static {
            int[] iArr = new int[cj4.EnumC2330a.values().length];
            f39013a = iArr;
            try {
                iArr[cj4.EnumC2330a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39013a[cj4.EnumC2330a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39013a[cj4.EnumC2330a.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39013a[cj4.EnumC2330a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: g8i$b */
    public static class C6168b {

        /* JADX INFO: renamed from: a */
        public final yi4 f39014a;

        /* JADX INFO: renamed from: b */
        public final dj4 f39015b;

        /* JADX INFO: renamed from: c */
        public final boolean f39016c;

        /* JADX INFO: renamed from: d */
        public final qy7<ci4> f39017d;

        public /* synthetic */ C6168b(yi4 yi4Var, dj4 dj4Var, qy7 qy7Var, boolean z, C6167a c6167a) {
            this(yi4Var, dj4Var, qy7Var, z);
        }

        public boolean needsRefill() {
            return this.f39016c;
        }

        private C6168b(yi4 yi4Var, dj4 dj4Var, qy7<ci4> qy7Var, boolean z) {
            this.f39014a = yi4Var;
            this.f39015b = dj4Var;
            this.f39017d = qy7Var;
            this.f39016c = z;
        }
    }

    public g8i(nld nldVar, qy7<ci4> qy7Var) {
        this.f39006a = nldVar;
        this.f39009d = yi4.emptySet(nldVar.comparator());
        this.f39010e = qy7Var;
    }

    private void applyTargetChange(tmg tmgVar) {
        if (tmgVar != null) {
            Iterator<ci4> it = tmgVar.getAddedDocuments().iterator();
            while (it.hasNext()) {
                this.f39010e = this.f39010e.insert(it.next());
            }
            for (ci4 ci4Var : tmgVar.getModifiedDocuments()) {
                r80.hardAssert(this.f39010e.contains(ci4Var), "Modified document %s not found in view.", ci4Var);
            }
            Iterator<ci4> it2 = tmgVar.getRemovedDocuments().iterator();
            while (it2.hasNext()) {
                this.f39010e = this.f39010e.remove(it2.next());
            }
            this.f39008c = tmgVar.isCurrent();
        }
    }

    private static int changeTypeOrder(cj4 cj4Var) {
        int i = C6167a.f39013a[cj4Var.getType().ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + cj4Var.getType());
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$applyChanges$0(Comparator comparator, cj4 cj4Var, cj4 cj4Var2) {
        int iCompare = Integer.compare(changeTypeOrder(cj4Var), changeTypeOrder(cj4Var2));
        return iCompare != 0 ? iCompare : comparator.compare(cj4Var.getDocument(), cj4Var2.getDocument());
    }

    private boolean shouldBeLimboDoc(ci4 ci4Var) {
        ph4 document;
        return (this.f39010e.contains(ci4Var) || (document = this.f39009d.getDocument(ci4Var)) == null || document.hasLocalMutations()) ? false : true;
    }

    private boolean shouldWaitForSyncedDocument(ph4 ph4Var, ph4 ph4Var2) {
        return ph4Var.hasLocalMutations() && ph4Var2.hasCommittedMutations() && !ph4Var2.hasLocalMutations();
    }

    private List<s59> updateLimboDocuments() {
        if (!this.f39008c) {
            return Collections.emptyList();
        }
        qy7<ci4> qy7Var = this.f39011f;
        this.f39011f = ci4.emptyKeySet();
        for (ph4 ph4Var : this.f39009d) {
            if (shouldBeLimboDoc(ph4Var.getKey())) {
                this.f39011f = this.f39011f.insert(ph4Var.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(qy7Var.size() + this.f39011f.size());
        for (ci4 ci4Var : qy7Var) {
            if (!this.f39011f.contains(ci4Var)) {
                arrayList.add(new s59(s59.EnumC12450a.REMOVED, ci4Var));
            }
        }
        for (ci4 ci4Var2 : this.f39011f) {
            if (!qy7Var.contains(ci4Var2)) {
                arrayList.add(new s59(s59.EnumC12450a.ADDED, ci4Var2));
            }
        }
        return arrayList;
    }

    public m8i applyChanges(C6168b c6168b) {
        return applyChanges(c6168b, null);
    }

    public m8i applyOnlineStateChange(h5c h5cVar) {
        if (!this.f39008c || h5cVar != h5c.OFFLINE) {
            return new m8i(null, Collections.emptyList());
        }
        this.f39008c = false;
        return applyChanges(new C6168b(this.f39009d, new dj4(), this.f39012g, false, null));
    }

    /* JADX INFO: renamed from: b */
    public qy7<ci4> m11438b() {
        return this.f39011f;
    }

    /* JADX INFO: renamed from: c */
    public qy7<ci4> m11439c() {
        return this.f39010e;
    }

    public C6168b computeDocChanges(ky7<ci4, ph4> ky7Var) {
        return computeDocChanges(ky7Var, null);
    }

    public lbi.EnumC8766a getSyncState() {
        return this.f39007b;
    }

    public m8i applyChanges(C6168b c6168b, tmg tmgVar) {
        return applyChanges(c6168b, tmgVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135 A[PHI: r17
  0x0135: PHI (r17v4 java.util.Iterator<java.util.Map$Entry<ci4, ph4>>) = 
  (r17v0 java.util.Iterator<java.util.Map$Entry<ci4, ph4>>)
  (r17v0 java.util.Iterator<java.util.Map$Entry<ci4, ph4>>)
  (r17v5 java.util.Iterator<java.util.Map$Entry<ci4, ph4>>)
  (r17v5 java.util.Iterator<java.util.Map$Entry<ci4, ph4>>)
 binds: [B:73:0x0131, B:74:0x0133, B:61:0x0104, B:58:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.g8i.C6168b computeDocChanges(p000.ky7<p000.ci4, p000.ph4> r19, @p000.hib p000.g8i.C6168b r20) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g8i.computeDocChanges(ky7, g8i$b):g8i$b");
    }

    public m8i applyChanges(C6168b c6168b, tmg tmgVar, boolean z) {
        lbi lbiVar;
        r80.hardAssert(!c6168b.f39016c, "Cannot apply changes that need a refill", new Object[0]);
        yi4 yi4Var = this.f39009d;
        this.f39009d = c6168b.f39014a;
        this.f39012g = c6168b.f39017d;
        List<cj4> listM9188a = c6168b.f39015b.m9188a();
        final Comparator<ph4> comparator = this.f39006a.comparator();
        Collections.sort(listM9188a, new Comparator() { // from class: f8i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g8i.lambda$applyChanges$0(comparator, (cj4) obj, (cj4) obj2);
            }
        });
        applyTargetChange(tmgVar);
        List<s59> listEmptyList = z ? Collections.emptyList() : updateLimboDocuments();
        lbi.EnumC8766a enumC8766a = (this.f39011f.size() == 0 && this.f39008c && !z) ? lbi.EnumC8766a.SYNCED : lbi.EnumC8766a.LOCAL;
        boolean z2 = enumC8766a != this.f39007b;
        this.f39007b = enumC8766a;
        if (listM9188a.size() != 0 || z2) {
            lbiVar = new lbi(this.f39006a, c6168b.f39014a, yi4Var, listM9188a, enumC8766a == lbi.EnumC8766a.LOCAL, c6168b.f39017d, z2, false, (tmgVar == null || tmgVar.getResumeToken().isEmpty()) ? false : true);
        } else {
            lbiVar = null;
        }
        return new m8i(lbiVar, listEmptyList);
    }
}
