package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class jo1<C, T, A> implements Cloneable {

    /* JADX INFO: renamed from: f */
    public static final String f51320f = "CallbackRegistry";

    /* JADX INFO: renamed from: a */
    public List<C> f51321a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public long f51322b = 0;

    /* JADX INFO: renamed from: c */
    public long[] f51323c;

    /* JADX INFO: renamed from: d */
    public int f51324d;

    /* JADX INFO: renamed from: e */
    public final AbstractC7989a<C, T, A> f51325e;

    /* JADX INFO: renamed from: jo1$a */
    public static abstract class AbstractC7989a<C, T, A> {
        public abstract void onNotifyCallback(C callback, T sender, int arg, A arg2);
    }

    public jo1(AbstractC7989a<C, T, A> notifier) {
        this.f51325e = notifier;
    }

    private boolean isRemoved(int index) {
        int i;
        if (index < 64) {
            return ((1 << index) & this.f51322b) != 0;
        }
        long[] jArr = this.f51323c;
        if (jArr != null && (i = (index / 64) - 1) < jArr.length) {
            return ((1 << (index % 64)) & jArr[i]) != 0;
        }
        return false;
    }

    private void notifyFirst64(T sender, int arg, A arg2) {
        notifyCallbacks(sender, arg, arg2, 0, Math.min(64, this.f51321a.size()), this.f51322b);
    }

    private void notifyRecurse(T sender, int arg, A arg2) {
        int size = this.f51321a.size();
        int length = this.f51323c == null ? -1 : r0.length - 1;
        notifyRemainder(sender, arg, arg2, length);
        notifyCallbacks(sender, arg, arg2, (length + 2) * 64, size, 0L);
    }

    private void notifyRemainder(T sender, int arg, A arg2, int remainderIndex) {
        if (remainderIndex < 0) {
            notifyFirst64(sender, arg, arg2);
            return;
        }
        long j = this.f51323c[remainderIndex];
        int i = (remainderIndex + 1) * 64;
        int iMin = Math.min(this.f51321a.size(), i + 64);
        notifyRemainder(sender, arg, arg2, remainderIndex - 1);
        notifyCallbacks(sender, arg, arg2, i, iMin, j);
    }

    private void removeRemovedCallbacks(int startIndex, long removed) {
        long j = Long.MIN_VALUE;
        for (int i = startIndex + 63; i >= startIndex; i--) {
            if ((removed & j) != 0) {
                this.f51321a.remove(i);
            }
            j >>>= 1;
        }
    }

    private void setRemovalBit(int index) {
        if (index < 64) {
            this.f51322b = (1 << index) | this.f51322b;
            return;
        }
        int i = (index / 64) - 1;
        long[] jArr = this.f51323c;
        if (jArr == null) {
            this.f51323c = new long[this.f51321a.size() / 64];
        } else if (jArr.length <= i) {
            long[] jArr2 = new long[this.f51321a.size() / 64];
            long[] jArr3 = this.f51323c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f51323c = jArr2;
        }
        long j = 1 << (index % 64);
        long[] jArr4 = this.f51323c;
        jArr4[i] = j | jArr4[i];
    }

    public synchronized void add(C callback) {
        try {
            if (callback == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f51321a.lastIndexOf(callback);
            if (iLastIndexOf < 0 || isRemoved(iLastIndexOf)) {
                this.f51321a.add(callback);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clear() {
        try {
            if (this.f51324d == 0) {
                this.f51321a.clear();
            } else if (!this.f51321a.isEmpty()) {
                for (int size = this.f51321a.size() - 1; size >= 0; size--) {
                    setRemovalBit(size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList<C> copyCallbacks() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.f51321a.size());
        int size = this.f51321a.size();
        for (int i = 0; i < size; i++) {
            if (!isRemoved(i)) {
                arrayList.add(this.f51321a.get(i));
            }
        }
        return arrayList;
    }

    public synchronized boolean isEmpty() {
        if (this.f51321a.isEmpty()) {
            return true;
        }
        if (this.f51324d == 0) {
            return false;
        }
        int size = this.f51321a.size();
        for (int i = 0; i < size; i++) {
            if (!isRemoved(i)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void notifyCallbacks(T sender, int arg, A arg2) {
        try {
            this.f51324d++;
            notifyRecurse(sender, arg, arg2);
            int i = this.f51324d - 1;
            this.f51324d = i;
            if (i == 0) {
                long[] jArr = this.f51323c;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j = this.f51323c[length];
                        if (j != 0) {
                            removeRemovedCallbacks((length + 1) * 64, j);
                            this.f51323c[length] = 0;
                        }
                    }
                }
                long j2 = this.f51322b;
                if (j2 != 0) {
                    removeRemovedCallbacks(0, j2);
                    this.f51322b = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(C callback) {
        try {
            if (this.f51324d == 0) {
                this.f51321a.remove(callback);
            } else {
                int iLastIndexOf = this.f51321a.lastIndexOf(callback);
                if (iLastIndexOf >= 0) {
                    setRemovalBit(iLastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized jo1<C, T, A> clone() {
        jo1<C, T, A> jo1Var;
        CloneNotSupportedException e;
        try {
            jo1Var = (jo1) super.clone();
            try {
                jo1Var.f51322b = 0L;
                jo1Var.f51323c = null;
                jo1Var.f51324d = 0;
                jo1Var.f51321a = new ArrayList();
                int size = this.f51321a.size();
                for (int i = 0; i < size; i++) {
                    if (!isRemoved(i)) {
                        jo1Var.f51321a.add(this.f51321a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (CloneNotSupportedException e3) {
            jo1Var = null;
            e = e3;
        }
        return jo1Var;
    }

    public synchronized void copyCallbacks(List<C> callbacks) {
        callbacks.clear();
        int size = this.f51321a.size();
        for (int i = 0; i < size; i++) {
            if (!isRemoved(i)) {
                callbacks.add(this.f51321a.get(i));
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void notifyCallbacks(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f51325e.onNotifyCallback(this.f51321a.get(i2), t, i, a);
            }
            j2 <<= 1;
            i2++;
        }
    }
}
