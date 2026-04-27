package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4151:1\n1#2:4152\n831#3,8:4153\n821#3,7:4161\n93#4,2:4168\n33#4,4:4170\n95#4,2:4174\n38#4:4176\n97#4:4177\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n*L\n766#1:4153,8\n783#1:4161,7\n793#1:4168,2\n793#1:4170,4\n793#1:4174,2\n793#1:4176\n793#1:4177\n*E\n"})
@e0g(parameters = 0)
public final class qb7 {

    /* JADX INFO: renamed from: g */
    public static final int f73814g = 8;

    /* JADX INFO: renamed from: a */
    public final int f73815a;

    /* JADX INFO: renamed from: b */
    @gib
    public String f73816b;

    /* JADX INFO: renamed from: c */
    public final int f73817c;

    /* JADX INFO: renamed from: d */
    @gib
    public ArrayList<Object> f73818d;

    /* JADX INFO: renamed from: e */
    public boolean f73819e;

    /* JADX INFO: renamed from: f */
    public int f73820f;

    public qb7(int i, @gib String str, int i2) {
        this.f73815a = i;
        this.f73816b = str;
        this.f73817c = i2;
    }

    private final void add(Object obj) {
        ArrayList<Object> arrayList = this.f73818d;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f73818d = arrayList;
        arrayList.add(obj);
    }

    private final boolean hasAnchor(C5897fo c5897fo) {
        ArrayList<Object> arrayList = this.f73818d;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (md8.areEqual(obj, c5897fo) || ((obj instanceof qb7) && ((qb7) obj).hasAnchor(c5897fo))) {
                return true;
            }
        }
        return false;
    }

    private final qb7 openInformation() {
        Object obj;
        qb7 qb7VarOpenInformation;
        ArrayList<Object> arrayList = this.f73818d;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof qb7) && !((qb7) obj).f73819e) {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        qb7 qb7Var = obj instanceof qb7 ? (qb7) obj : null;
        return (qb7Var == null || (qb7VarOpenInformation = qb7Var.openInformation()) == null) ? this : qb7VarOpenInformation;
    }

    public final void addGroupAfter(@yfb prf prfVar, int i, int i2) {
        C5897fo c5897foTryAnchor$runtime_release;
        ArrayList<Object> arrayList = this.f73818d;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f73818d = arrayList;
        }
        int i3 = 0;
        if (i >= 0 && (c5897foTryAnchor$runtime_release = prfVar.tryAnchor$runtime_release(i)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                Object obj = arrayList.get(i3);
                if (md8.areEqual(obj, c5897foTryAnchor$runtime_release) || ((obj instanceof qb7) && ((qb7) obj).hasAnchor(c5897foTryAnchor$runtime_release))) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        arrayList.add(i3, prfVar.anchor(i2));
    }

    public final void close(int i) {
        this.f73819e = true;
        this.f73820f = i;
    }

    public final void endGrouplessCall(int i) {
        openInformation().close(i);
    }

    public final boolean getClosed() {
        return this.f73819e;
    }

    public final int getDataEndOffset() {
        return this.f73820f;
    }

    public final int getDataStartOffset() {
        return this.f73817c;
    }

    @gib
    public final ArrayList<Object> getGroups() {
        return this.f73818d;
    }

    public final int getKey() {
        return this.f73815a;
    }

    @gib
    public final String getSourceInformation() {
        return this.f73816b;
    }

    public final boolean removeAnchor(@yfb C5897fo c5897fo) {
        ArrayList<Object> arrayList = this.f73818d;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof C5897fo) {
                    if (md8.areEqual(obj, c5897fo)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof qb7) && !((qb7) obj).removeAnchor(c5897fo)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f73818d = null;
                return false;
            }
        }
        return true;
    }

    public final void reportGroup(@yfb prf prfVar, int i) {
        openInformation().add(prfVar.anchor(i));
    }

    public final void setClosed(boolean z) {
        this.f73819e = z;
    }

    public final void setDataEndOffset(int i) {
        this.f73820f = i;
    }

    public final void setGroups(@gib ArrayList<Object> arrayList) {
        this.f73818d = arrayList;
    }

    public final void setSourceInformation(@gib String str) {
        this.f73816b = str;
    }

    public final void startGrouplessCall(int i, @yfb String str, int i2) {
        openInformation().add(new qb7(i, str, i2));
    }

    public final void reportGroup(@yfb mrf mrfVar, int i) {
        openInformation().add(mrfVar.anchor(i));
    }
}
