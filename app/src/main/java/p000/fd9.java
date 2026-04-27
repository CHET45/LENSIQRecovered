package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class fd9 {

    /* JADX INFO: renamed from: f */
    public static final String f36190f = "LocalBroadcastManager";

    /* JADX INFO: renamed from: g */
    public static final boolean f36191g = false;

    /* JADX INFO: renamed from: h */
    public static final int f36192h = 1;

    /* JADX INFO: renamed from: i */
    public static final Object f36193i = new Object();

    /* JADX INFO: renamed from: j */
    public static fd9 f36194j;

    /* JADX INFO: renamed from: a */
    public final Context f36195a;

    /* JADX INFO: renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<C5729c>> f36196b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, ArrayList<C5729c>> f36197c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<C5728b> f36198d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final Handler f36199e;

    /* JADX INFO: renamed from: fd9$a */
    public class HandlerC5727a extends Handler {
        public HandlerC5727a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                fd9.this.m10813a();
            }
        }
    }

    /* JADX INFO: renamed from: fd9$b */
    public static final class C5728b {

        /* JADX INFO: renamed from: a */
        public final Intent f36201a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<C5729c> f36202b;

        public C5728b(Intent intent, ArrayList<C5729c> arrayList) {
            this.f36201a = intent;
            this.f36202b = arrayList;
        }
    }

    /* JADX INFO: renamed from: fd9$c */
    public static final class C5729c {

        /* JADX INFO: renamed from: a */
        public final IntentFilter f36203a;

        /* JADX INFO: renamed from: b */
        public final BroadcastReceiver f36204b;

        /* JADX INFO: renamed from: c */
        public boolean f36205c;

        /* JADX INFO: renamed from: d */
        public boolean f36206d;

        public C5729c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f36203a = intentFilter;
            this.f36204b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f36204b);
            sb.append(" filter=");
            sb.append(this.f36203a);
            if (this.f36206d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private fd9(Context context) {
        this.f36195a = context;
        this.f36199e = new HandlerC5727a(context.getMainLooper());
    }

    @efb
    public static fd9 getInstance(@efb Context context) {
        fd9 fd9Var;
        synchronized (f36193i) {
            try {
                if (f36194j == null) {
                    f36194j = new fd9(context.getApplicationContext());
                }
                fd9Var = f36194j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fd9Var;
    }

    /* JADX INFO: renamed from: a */
    public void m10813a() {
        int size;
        C5728b[] c5728bArr;
        while (true) {
            synchronized (this.f36196b) {
                try {
                    size = this.f36198d.size();
                    if (size <= 0) {
                        return;
                    }
                    c5728bArr = new C5728b[size];
                    this.f36198d.toArray(c5728bArr);
                    this.f36198d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                C5728b c5728b = c5728bArr[i];
                int size2 = c5728b.f36202b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C5729c c5729c = c5728b.f36202b.get(i2);
                    if (!c5729c.f36206d) {
                        c5729c.f36204b.onReceive(this.f36195a, c5728b.f36201a);
                    }
                }
            }
        }
    }

    public void registerReceiver(@efb BroadcastReceiver broadcastReceiver, @efb IntentFilter intentFilter) {
        synchronized (this.f36196b) {
            try {
                C5729c c5729c = new C5729c(intentFilter, broadcastReceiver);
                ArrayList<C5729c> arrayList = this.f36196b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f36196b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c5729c);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<C5729c> arrayList2 = this.f36197c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f36197c.put(action, arrayList2);
                    }
                    arrayList2.add(c5729c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean sendBroadcast(@efb Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<C5729c> arrayList2;
        String str2;
        boolean z;
        synchronized (this.f36196b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f36195a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = true;
                boolean z3 = (intent.getFlags() & 8) != 0;
                if (z3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Resolving type ");
                    sb.append(strResolveTypeIfNeeded);
                    sb.append(" scheme ");
                    sb.append(scheme);
                    sb.append(" of intent ");
                    sb.append(intent);
                }
                ArrayList<C5729c> arrayList3 = this.f36197c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Action list: ");
                        sb2.append(arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i2 = 0;
                    while (i2 < arrayList3.size()) {
                        C5729c c5729c = arrayList3.get(i2);
                        if (z3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Matching against filter ");
                            sb3.append(c5729c.f36203a);
                        }
                        if (c5729c.f36205c) {
                            i = i2;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                            z = z2;
                        } else {
                            IntentFilter intentFilter = c5729c.f36203a;
                            String str3 = action;
                            String str4 = strResolveTypeIfNeeded;
                            i = i2;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            z = z2;
                            int iMatch = intentFilter.match(str3, str4, scheme, data, categories, f36190f);
                            if (iMatch >= 0) {
                                if (z3) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("  Filter matched!  match=0x");
                                    sb4.append(Integer.toHexString(iMatch));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(c5729c);
                                c5729c.f36205c = z;
                                i2 = i + 1;
                                z2 = z;
                                action = str;
                                arrayList3 = arrayList2;
                                strResolveTypeIfNeeded = str2;
                            } else if (z3) {
                                String str5 = iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category";
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("  Filter did not match: ");
                                sb5.append(str5);
                            }
                        }
                        arrayList4 = arrayList;
                        i2 = i + 1;
                        z2 = z;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    boolean z4 = z2;
                    if (arrayList5 != null) {
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            ((C5729c) arrayList5.get(i3)).f36205c = false;
                        }
                        this.f36198d.add(new C5728b(intent, arrayList5));
                        if (!this.f36199e.hasMessages(z4 ? 1 : 0)) {
                            this.f36199e.sendEmptyMessage(z4 ? 1 : 0);
                        }
                        return z4;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sendBroadcastSync(@efb Intent intent) {
        if (sendBroadcast(intent)) {
            m10813a();
        }
    }

    public void unregisterReceiver(@efb BroadcastReceiver broadcastReceiver) {
        synchronized (this.f36196b) {
            try {
                ArrayList<C5729c> arrayListRemove = this.f36196b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    C5729c c5729c = arrayListRemove.get(size);
                    c5729c.f36206d = true;
                    for (int i = 0; i < c5729c.f36203a.countActions(); i++) {
                        String action = c5729c.f36203a.getAction(i);
                        ArrayList<C5729c> arrayList = this.f36197c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C5729c c5729c2 = arrayList.get(size2);
                                if (c5729c2.f36204b == broadcastReceiver) {
                                    c5729c2.f36206d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f36197c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
