package p000;

import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class hd1 implements an4 {

    /* JADX INFO: renamed from: g */
    public static final int f43176g = 1;

    /* JADX INFO: renamed from: a */
    public final SparseArray<bd1> f43177a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, String> f43178b;

    /* JADX INFO: renamed from: c */
    @efb
    public final lr8 f43179c;

    /* JADX INFO: renamed from: d */
    public final SparseArray<mr7> f43180d;

    /* JADX INFO: renamed from: e */
    public final List<Integer> f43181e;

    /* JADX INFO: renamed from: f */
    public final List<Integer> f43182f;

    public hd1() {
        this(new SparseArray(), new ArrayList(), new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m12318a() {
        int iIntValue;
        int i = 0;
        int size = 0;
        int i2 = 0;
        while (true) {
            try {
                iIntValue = 1;
                if (size >= this.f43181e.size()) {
                    size = 0;
                    break;
                }
                Integer num = this.f43181e.get(size);
                if (num == null) {
                    i = i2 + 1;
                    break;
                }
                int iIntValue2 = num.intValue();
                if (i2 != 0) {
                    int i3 = i2 + 1;
                    if (iIntValue2 != i3) {
                        i = i3;
                        break;
                    }
                    size++;
                    i2 = iIntValue2;
                } else {
                    if (iIntValue2 != 1) {
                        size = 0;
                        i = 1;
                        break;
                    }
                    size++;
                    i2 = iIntValue2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i != 0) {
            iIntValue = i;
        } else if (!this.f43181e.isEmpty()) {
            List<Integer> list = this.f43181e;
            iIntValue = 1 + list.get(list.size() - 1).intValue();
            size = this.f43181e.size();
        }
        this.f43181e.add(size, Integer.valueOf(iIntValue));
        return iIntValue;
    }

    @Override // p000.gd1
    @efb
    public bd1 createAndInsert(@efb cn4 cn4Var) {
        int id = cn4Var.getId();
        bd1 bd1Var = new bd1(id, cn4Var.getUrl(), cn4Var.getParentFile(), cn4Var.getFilename());
        synchronized (this) {
            this.f43177a.put(id, bd1Var);
            this.f43180d.remove(id);
        }
        return bd1Var;
    }

    @Override // p000.gd1
    public bd1 findAnotherInfoFromCompare(@efb cn4 cn4Var, @efb bd1 bd1Var) {
        SparseArray<bd1> sparseArrayClone;
        synchronized (this) {
            sparseArrayClone = this.f43177a.clone();
        }
        int size = sparseArrayClone.size();
        for (int i = 0; i < size; i++) {
            bd1 bd1VarValueAt = sparseArrayClone.valueAt(i);
            if (bd1VarValueAt != bd1Var && bd1VarValueAt.isSameFrom(cn4Var)) {
                return bd1VarValueAt;
            }
        }
        return null;
    }

    @Override // p000.gd1
    public synchronized int findOrCreateId(@efb cn4 cn4Var) {
        Integer num = this.f43179c.get(cn4Var);
        if (num != null) {
            return num.intValue();
        }
        int size = this.f43177a.size();
        for (int i = 0; i < size; i++) {
            bd1 bd1VarValueAt = this.f43177a.valueAt(i);
            if (bd1VarValueAt != null && bd1VarValueAt.isSameFrom(cn4Var)) {
                return bd1VarValueAt.f13378a;
            }
        }
        int size2 = this.f43180d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mr7 mr7VarValueAt = this.f43180d.valueAt(i2);
            if (mr7VarValueAt != null && mr7VarValueAt.compareIgnoreId(cn4Var)) {
                return mr7VarValueAt.getId();
            }
        }
        int iM12318a = m12318a();
        this.f43180d.put(iM12318a, cn4Var.mock(iM12318a));
        this.f43179c.add(cn4Var, iM12318a);
        return iM12318a;
    }

    @Override // p000.gd1
    public bd1 get(int i) {
        return this.f43177a.get(i);
    }

    @Override // p000.an4
    @hib
    public bd1 getAfterCompleted(int i) {
        return null;
    }

    @Override // p000.gd1
    @hib
    public String getResponseFilename(String str) {
        return this.f43178b.get(str);
    }

    @Override // p000.gd1
    public boolean isFileDirty(int i) {
        return this.f43182f.contains(Integer.valueOf(i));
    }

    @Override // p000.gd1
    public boolean isOnlyMemoryCache() {
        return true;
    }

    @Override // p000.an4
    public boolean markFileClear(int i) {
        boolean zRemove;
        synchronized (this.f43182f) {
            zRemove = this.f43182f.remove(Integer.valueOf(i));
        }
        return zRemove;
    }

    @Override // p000.an4
    public boolean markFileDirty(int i) {
        if (this.f43182f.contains(Integer.valueOf(i))) {
            return false;
        }
        synchronized (this.f43182f) {
            try {
                if (this.f43182f.contains(Integer.valueOf(i))) {
                    return false;
                }
                this.f43182f.add(Integer.valueOf(i));
                return true;
            } finally {
            }
        }
    }

    @Override // p000.an4
    public void onSyncToFilesystemSuccess(@efb bd1 bd1Var, int i, long j) throws IOException {
        bd1 bd1Var2 = this.f43177a.get(bd1Var.f13378a);
        if (bd1Var != bd1Var2) {
            throw new IOException("Info not on store!");
        }
        bd1Var2.getBlock(i).increaseCurrentOffset(j);
    }

    @Override // p000.an4
    public void onTaskEnd(int i, @efb x15 x15Var, @hib Exception exc) {
        if (x15Var == x15.COMPLETED) {
            remove(i);
        }
    }

    @Override // p000.an4
    public void onTaskStart(int i) {
    }

    @Override // p000.gd1
    public synchronized void remove(int i) {
        try {
            this.f43177a.remove(i);
            if (this.f43180d.get(i) == null) {
                this.f43181e.remove(Integer.valueOf(i));
            }
            this.f43179c.remove(i);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.gd1
    public boolean update(@efb bd1 bd1Var) {
        String filename = bd1Var.getFilename();
        if (bd1Var.m3043a() && filename != null) {
            this.f43178b.put(bd1Var.getUrl(), filename);
        }
        bd1 bd1Var2 = this.f43177a.get(bd1Var.f13378a);
        if (bd1Var2 == null) {
            return false;
        }
        if (bd1Var2 == bd1Var) {
            return true;
        }
        synchronized (this) {
            this.f43177a.put(bd1Var.f13378a, bd1Var.copy());
        }
        return true;
    }

    public hd1(SparseArray<bd1> sparseArray, List<Integer> list, HashMap<String, String> map, SparseArray<mr7> sparseArray2, List<Integer> list2, lr8 lr8Var) {
        this.f43180d = sparseArray2;
        this.f43182f = list;
        this.f43177a = sparseArray;
        this.f43178b = map;
        this.f43181e = list2;
        this.f43179c = lr8Var;
    }

    public hd1(SparseArray<bd1> sparseArray, List<Integer> list, HashMap<String, String> map) {
        this.f43180d = new SparseArray<>();
        this.f43177a = sparseArray;
        this.f43182f = list;
        this.f43178b = map;
        this.f43179c = new lr8();
        int size = sparseArray.size();
        this.f43181e = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.f43181e.add(Integer.valueOf(sparseArray.valueAt(i).f13378a));
        }
        Collections.sort(this.f43181e);
    }
}
