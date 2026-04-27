package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public class gzh {

    /* JADX INFO: renamed from: h */
    public static final String f41892h = "user-data";

    /* JADX INFO: renamed from: i */
    public static final String f41893i = "keys";

    /* JADX INFO: renamed from: j */
    public static final String f41894j = "internal-keys";

    /* JADX INFO: renamed from: k */
    public static final String f41895k = "rollouts-state";

    /* JADX INFO: renamed from: l */
    @fdi
    public static final int f41896l = 64;

    /* JADX INFO: renamed from: m */
    @fdi
    public static final int f41897m = 1024;

    /* JADX INFO: renamed from: n */
    @fdi
    public static final int f41898n = 8192;

    /* JADX INFO: renamed from: o */
    @fdi
    public static final int f41899o = 128;

    /* JADX INFO: renamed from: a */
    public final bta f41900a;

    /* JADX INFO: renamed from: b */
    public final g53 f41901b;

    /* JADX INFO: renamed from: c */
    public String f41902c;

    /* JADX INFO: renamed from: d */
    public final C6665a f41903d = new C6665a(false);

    /* JADX INFO: renamed from: e */
    public final C6665a f41904e = new C6665a(true);

    /* JADX INFO: renamed from: f */
    public final pae f41905f = new pae(128);

    /* JADX INFO: renamed from: g */
    public final AtomicMarkableReference<String> f41906g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: renamed from: gzh$a */
    public class C6665a {

        /* JADX INFO: renamed from: a */
        public final AtomicMarkableReference<rs8> f41907a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<Runnable> f41908b = new AtomicReference<>(null);

        /* JADX INFO: renamed from: c */
        public final boolean f41909c;

        public C6665a(boolean z) {
            this.f41909c = z;
            this.f41907a = new AtomicMarkableReference<>(new rs8(64, z ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$scheduleSerializationTaskIfNeeded$0() throws Throwable {
            this.f41908b.set(null);
            serializeIfMarked();
        }

        private void scheduleSerializationTaskIfNeeded() {
            Runnable runnable = new Runnable() { // from class: fzh
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f38088a.lambda$scheduleSerializationTaskIfNeeded$0();
                }
            };
            if (v7b.m23844a(this.f41908b, null, runnable)) {
                gzh.this.f41901b.f38790b.submit(runnable);
            }
        }

        private void serializeIfMarked() throws Throwable {
            Map<String, String> keys;
            synchronized (this) {
                try {
                    if (this.f41907a.isMarked()) {
                        keys = this.f41907a.getReference().getKeys();
                        AtomicMarkableReference<rs8> atomicMarkableReference = this.f41907a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        keys = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (keys != null) {
                gzh.this.f41900a.writeKeyData(gzh.this.f41902c, keys, this.f41909c);
            }
        }

        public Map<String, String> getKeys() {
            return this.f41907a.getReference().getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f41907a.getReference().setKey(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<rs8> atomicMarkableReference = this.f41907a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    scheduleSerializationTaskIfNeeded();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setKeys(Map<String, String> map) {
            synchronized (this) {
                this.f41907a.getReference().setKeys(map);
                AtomicMarkableReference<rs8> atomicMarkableReference = this.f41907a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            scheduleSerializationTaskIfNeeded();
        }
    }

    public gzh(String str, kt5 kt5Var, g53 g53Var) {
        this.f41902c = str;
        this.f41900a = new bta(kt5Var);
        this.f41901b = g53Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setNewSession$0(String str, Map map, List list) throws Throwable {
        if (getUserId() != null) {
            this.f41900a.writeUserData(str, getUserId());
        }
        if (!map.isEmpty()) {
            this.f41900a.writeKeyData(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.f41900a.writeRolloutState(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateRolloutsState$1(List list) throws Throwable {
        this.f41900a.writeRolloutState(this.f41902c, list);
    }

    public static gzh loadFromExistingSession(String str, kt5 kt5Var, g53 g53Var) {
        bta btaVar = new bta(kt5Var);
        gzh gzhVar = new gzh(str, kt5Var, g53Var);
        gzhVar.f41903d.f41907a.getReference().setKeys(btaVar.m3402a(str, false));
        gzhVar.f41904e.f41907a.getReference().setKeys(btaVar.m3402a(str, true));
        gzhVar.f41906g.set(btaVar.readUserId(str), false);
        gzhVar.f41905f.updateRolloutAssignmentList(btaVar.readRolloutsState(str));
        return gzhVar;
    }

    @hib
    public static String readUserId(String str, kt5 kt5Var) {
        return new bta(kt5Var).readUserId(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializeUserDataIfNeeded() throws Throwable {
        boolean z;
        String userId;
        synchronized (this.f41906g) {
            try {
                z = false;
                if (this.f41906g.isMarked()) {
                    userId = getUserId();
                    this.f41906g.set(userId, false);
                    z = true;
                } else {
                    userId = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.f41900a.writeUserData(this.f41902c, userId);
        }
    }

    public Map<String, String> getCustomKeys(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f41903d.getKeys();
        }
        HashMap map2 = new HashMap(this.f41903d.getKeys());
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strSanitizeString = rs8.sanitizeString(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strSanitizeString)) {
                map2.put(strSanitizeString, rs8.sanitizeString(entry.getValue(), 1024));
            } else {
                i++;
            }
        }
        if (i > 0) {
            ej9.getLogger().m10069w("Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map<String, String> getInternalKeys() {
        return this.f41904e.getKeys();
    }

    public List<z33.AbstractC15965f.d.e> getRolloutsState() {
        return this.f41905f.getReportRolloutsState();
    }

    @hib
    public String getUserId() {
        return this.f41906g.getReference();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.f41903d.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.f41903d.setKeys(map);
    }

    public boolean setInternalKey(String str, String str2) {
        return this.f41904e.setKey(str, str2);
    }

    public void setNewSession(final String str) {
        synchronized (this.f41902c) {
            this.f41902c = str;
            final Map<String, String> keys = this.f41903d.getKeys();
            final List<oae> rolloutAssignmentList = this.f41905f.getRolloutAssignmentList();
            this.f41901b.f38790b.submit(new Runnable() { // from class: dzh
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f31393a.lambda$setNewSession$0(str, keys, rolloutAssignmentList);
                }
            });
        }
    }

    public void setUserId(String str) {
        String strSanitizeString = rs8.sanitizeString(str, 1024);
        synchronized (this.f41906g) {
            try {
                if (lc2.nullSafeEquals(strSanitizeString, this.f41906g.getReference())) {
                    return;
                }
                this.f41906g.set(strSanitizeString, true);
                this.f41901b.f38790b.submit(new Runnable() { // from class: ezh
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f34617a.serializeUserDataIfNeeded();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @op1
    public boolean updateRolloutsState(List<oae> list) {
        synchronized (this.f41905f) {
            try {
                if (!this.f41905f.updateRolloutAssignmentList(list)) {
                    return false;
                }
                final List<oae> rolloutAssignmentList = this.f41905f.getRolloutAssignmentList();
                this.f41901b.f38790b.submit(new Runnable() { // from class: czh
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f28122a.lambda$updateRolloutsState$1(rolloutAssignmentList);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map<String, String> getCustomKeys() {
        return this.f41903d.getKeys();
    }
}
