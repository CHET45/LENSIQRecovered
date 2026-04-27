package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.blankj.utilcode.util.C2481n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class brh implements Handler.Callback {

    /* JADX INFO: renamed from: f */
    public static final String f14628f = "UiMessageUtils";

    /* JADX INFO: renamed from: m */
    public static final boolean f14629m = C2481n.m4320p0();

    /* JADX INFO: renamed from: a */
    public final Handler f14630a;

    /* JADX INFO: renamed from: b */
    public final C2028c f14631b;

    /* JADX INFO: renamed from: c */
    public final SparseArray<List<InterfaceC2029d>> f14632c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC2029d> f14633d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC2029d> f14634e;

    /* JADX INFO: renamed from: brh$b */
    public static final class C2027b {

        /* JADX INFO: renamed from: a */
        public static final brh f14635a = new brh();

        private C2027b() {
        }
    }

    /* JADX INFO: renamed from: brh$c */
    public static final class C2028c {

        /* JADX INFO: renamed from: a */
        public Message f14636a;

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(Message message) {
            this.f14636a = message;
        }

        public int getId() {
            return this.f14636a.what;
        }

        public Object getObject() {
            return this.f14636a.obj;
        }

        public String toString() {
            return "{ id=" + getId() + ", obj=" + getObject() + " }";
        }

        private C2028c(Message message) {
            this.f14636a = message;
        }
    }

    /* JADX INFO: renamed from: brh$d */
    public interface InterfaceC2029d {
        void handleMessage(@efb C2028c c2028c);
    }

    public static brh getInstance() {
        return C2027b.f14635a;
    }

    private void logMessageHandling(@efb C2028c c2028c) {
        if (c2028c == null) {
            throw new NullPointerException("Argument 'msg' of type UiMessage (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        List<InterfaceC2029d> list = this.f14632c.get(c2028c.getId());
        if ((list == null || list.size() == 0) && this.f14633d.size() == 0) {
            Log.w(f14628f, "Delivering FAILED for message ID " + c2028c.getId() + ". No listeners. " + c2028c.toString());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Delivering message ID ");
        sb.append(c2028c.getId());
        sb.append(", Specific listeners: ");
        if (list == null || list.size() == 0) {
            sb.append(0);
        } else {
            sb.append(list.size());
            sb.append(" [");
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i).getClass().getSimpleName());
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
        }
        sb.append(", Universal listeners: ");
        synchronized (this.f14633d) {
            try {
                if (this.f14633d.size() == 0) {
                    sb.append(0);
                } else {
                    sb.append(this.f14633d.size());
                    sb.append(" [");
                    for (int i2 = 0; i2 < this.f14633d.size(); i2++) {
                        sb.append(this.f14633d.get(i2).getClass().getSimpleName());
                        if (i2 < this.f14633d.size() - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append("], Message: ");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sb.append(c2028c.toString());
    }

    public void addListener(int i, @efb InterfaceC2029d interfaceC2029d) {
        if (interfaceC2029d == null) {
            throw new NullPointerException("Argument 'listener' of type UiMessageCallback (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        synchronized (this.f14632c) {
            try {
                List<InterfaceC2029d> arrayList = this.f14632c.get(i);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f14632c.put(i, arrayList);
                }
                if (!arrayList.contains(interfaceC2029d)) {
                    arrayList.add(interfaceC2029d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        this.f14631b.setMessage(message);
        if (f14629m) {
            logMessageHandling(this.f14631b);
        }
        synchronized (this.f14632c) {
            try {
                List<InterfaceC2029d> list = this.f14632c.get(message.what);
                if (list != null) {
                    if (list.size() == 0) {
                        this.f14632c.remove(message.what);
                    } else {
                        this.f14634e.addAll(list);
                        Iterator<InterfaceC2029d> it = this.f14634e.iterator();
                        while (it.hasNext()) {
                            it.next().handleMessage(this.f14631b);
                        }
                        this.f14634e.clear();
                    }
                }
            } finally {
            }
        }
        synchronized (this.f14633d) {
            try {
                if (this.f14633d.size() > 0) {
                    this.f14634e.addAll(this.f14633d);
                    Iterator<InterfaceC2029d> it2 = this.f14634e.iterator();
                    while (it2.hasNext()) {
                        it2.next().handleMessage(this.f14631b);
                    }
                    this.f14634e.clear();
                }
            } finally {
            }
        }
        this.f14631b.setMessage(null);
        return true;
    }

    public void removeListener(@efb InterfaceC2029d interfaceC2029d) {
        if (interfaceC2029d == null) {
            throw new NullPointerException("Argument 'listener' of type UiMessageCallback (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        synchronized (this.f14633d) {
            try {
                if (f14629m && !this.f14633d.contains(interfaceC2029d)) {
                    Log.w(f14628f, "Trying to remove a listener that is not registered. " + interfaceC2029d.toString());
                }
                this.f14633d.remove(interfaceC2029d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeListeners(int i) {
        List<InterfaceC2029d> list;
        if (f14629m && ((list = this.f14632c.get(i)) == null || list.size() == 0)) {
            Log.w(f14628f, "Trying to remove specific listeners that are not registered. ID " + i);
        }
        synchronized (this.f14632c) {
            this.f14632c.delete(i);
        }
    }

    public final void send(int i) {
        this.f14630a.sendEmptyMessage(i);
    }

    private brh() {
        this.f14630a = new Handler(Looper.getMainLooper(), this);
        this.f14631b = new C2028c(null);
        this.f14632c = new SparseArray<>();
        this.f14633d = new ArrayList();
        this.f14634e = new ArrayList();
    }

    public final void send(int i, @efb Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument 'obj' of type Object (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        Handler handler = this.f14630a;
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    public void removeListener(int i, @efb InterfaceC2029d interfaceC2029d) {
        if (interfaceC2029d != null) {
            synchronized (this.f14632c) {
                try {
                    List<InterfaceC2029d> list = this.f14632c.get(i);
                    if (list != null && !list.isEmpty()) {
                        if (f14629m && !list.contains(interfaceC2029d)) {
                            Log.w(f14628f, "Trying to remove specific listener that is not registered. ID " + i + ", " + interfaceC2029d);
                            return;
                        }
                        list.remove(interfaceC2029d);
                    } else if (f14629m) {
                        Log.w(f14628f, "Trying to remove specific listener that is not registered. ID " + i + ", " + interfaceC2029d);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new NullPointerException("Argument 'listener' of type UiMessageCallback (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public void addListener(@efb InterfaceC2029d interfaceC2029d) {
        if (interfaceC2029d != null) {
            synchronized (this.f14633d) {
                try {
                    if (!this.f14633d.contains(interfaceC2029d)) {
                        this.f14633d.add(interfaceC2029d);
                    } else if (f14629m) {
                        Log.w(f14628f, "Listener is already added. " + interfaceC2029d.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new NullPointerException("Argument 'listener' of type UiMessageCallback (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
