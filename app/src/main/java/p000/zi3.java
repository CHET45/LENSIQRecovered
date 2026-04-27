package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.AbstractC3595a;
import com.google.firebase.firestore.C3603f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import p000.lhi;
import p000.mmg;
import p000.n4g;
import p000.nsi;
import p000.ow0;
import p000.tz5;
import p000.uce;
import p000.wb2;

/* JADX INFO: loaded from: classes5.dex */
public class zi3 {

    /* JADX INFO: renamed from: d */
    public static final String f105122d = "The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.";

    /* JADX INFO: renamed from: e */
    public static final Set<String> f105123e = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* JADX INFO: renamed from: a */
    public final nyd f105124a;

    /* JADX INFO: renamed from: b */
    public final ga0 f105125b;

    /* JADX INFO: renamed from: c */
    public final tz5 f105126c;

    /* JADX INFO: renamed from: zi3$a */
    public class C16145a extends tz5.AbstractC13296e<qw0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f105127a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f105128b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TaskCompletionSource f105129c;

        public C16145a(List list, List list2, TaskCompletionSource taskCompletionSource) {
            this.f105127a = list;
            this.f105128b = list2;
            this.f105129c = taskCompletionSource;
        }

        @Override // p000.tz5.AbstractC13296e
        public void onClose(n4g n4gVar) {
            if (n4gVar.isOk()) {
                this.f105129c.trySetResult(Collections.emptyList());
                return;
            }
            C3603f c3603fExceptionFromStatus = r0i.exceptionFromStatus(n4gVar);
            if (c3603fExceptionFromStatus.getCode() == C3603f.a.UNAUTHENTICATED) {
                zi3.this.f105126c.invalidateToken();
            }
            this.f105129c.trySetException(c3603fExceptionFromStatus);
        }

        @Override // p000.tz5.AbstractC13296e
        public void onMessage(qw0 qw0Var) {
            this.f105127a.add(qw0Var);
            if (this.f105127a.size() == this.f105128b.size()) {
                HashMap map = new HashMap();
                Iterator it = this.f105127a.iterator();
                while (it.hasNext()) {
                    t4b t4bVarDecodeMaybeDocument = zi3.this.f105124a.decodeMaybeDocument((qw0) it.next());
                    map.put(t4bVarDecodeMaybeDocument.getKey(), t4bVarDecodeMaybeDocument);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f105128b.iterator();
                while (it2.hasNext()) {
                    arrayList.add((t4b) map.get((ci4) it2.next()));
                }
                this.f105129c.trySetResult(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: zi3$b */
    public static /* synthetic */ class C16146b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105131a;

        static {
            int[] iArr = new int[C3603f.a.values().length];
            f105131a = iArr;
            try {
                iArr[C3603f.a.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105131a[C3603f.a.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105131a[C3603f.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105131a[C3603f.a.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105131a[C3603f.a.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105131a[C3603f.a.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105131a[C3603f.a.UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f105131a[C3603f.a.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f105131a[C3603f.a.INVALID_ARGUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f105131a[C3603f.a.NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f105131a[C3603f.a.ALREADY_EXISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f105131a[C3603f.a.PERMISSION_DENIED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f105131a[C3603f.a.FAILED_PRECONDITION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f105131a[C3603f.a.ABORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f105131a[C3603f.a.OUT_OF_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f105131a[C3603f.a.UNIMPLEMENTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f105131a[C3603f.a.DATA_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public zi3(ga0 ga0Var, nyd nydVar, tz5 tz5Var) {
        this.f105125b = ga0Var;
        this.f105124a = nydVar;
        this.f105126c = tz5Var;
    }

    public static boolean isMissingSslCiphers(n4g n4gVar) {
        n4gVar.getCode();
        Throwable cause = n4gVar.getCause();
        if (!(cause instanceof SSLHandshakeException)) {
            return false;
        }
        cause.getMessage().contains("no ciphers available");
        return false;
    }

    public static boolean isPermanentError(n4g n4gVar) {
        return isPermanentError(C3603f.a.fromValue(n4gVar.getCode().value()));
    }

    public static boolean isPermanentWriteError(n4g n4gVar) {
        return isPermanentError(n4gVar) && !n4gVar.getCode().equals(n4g.EnumC9694b.ABORTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$commit$0(Task task) throws Exception {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof C3603f) && ((C3603f) task.getException()).getCode() == C3603f.a.UNAUTHENTICATED) {
                this.f105126c.invalidateToken();
            }
            throw task.getException();
        }
        yb2 yb2Var = (yb2) task.getResult();
        euf eufVarDecodeVersion = this.f105124a.decodeVersion(yb2Var.getCommitTime());
        int writeResultsCount = yb2Var.getWriteResultsCount();
        ArrayList arrayList = new ArrayList(writeResultsCount);
        for (int i = 0; i < writeResultsCount; i++) {
            arrayList.add(this.f105124a.decodeMutationResult(yb2Var.getWriteResults(i), eufVarDecodeVersion));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$runAggregateQuery$1(HashMap map, Task task) throws Exception {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof C3603f) && ((C3603f) task.getException()).getCode() == C3603f.a.UNAUTHENTICATED) {
                this.f105126c.invalidateToken();
            }
            throw task.getException();
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, b2i> entry : ((wce) task.getResult()).getResult().getAggregateFieldsMap().entrySet()) {
            r80.hardAssert(map.containsKey(entry.getKey()), "%s not present in aliasMap", entry.getKey());
            map2.put((String) map.get(entry.getKey()), entry.getValue());
        }
        return map2;
    }

    public Task<List<u7b>> commit(List<m7b> list) {
        wb2.C14542b c14542bNewBuilder = wb2.newBuilder();
        c14542bNewBuilder.setDatabase(this.f105124a.databaseName());
        Iterator<m7b> it = list.iterator();
        while (it.hasNext()) {
            c14542bNewBuilder.addWrites(this.f105124a.encodeMutation(it.next()));
        }
        return this.f105126c.m22938g(x06.getCommitMethod(), c14542bNewBuilder.build()).continueWith(this.f105125b.getExecutor(), new Continuation() { // from class: yi3
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f101686a.lambda$commit$0(task);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public lhi m26811d(lhi.InterfaceC8819a interfaceC8819a) {
        return new lhi(this.f105126c, this.f105125b, this.f105124a, interfaceC8819a);
    }

    /* JADX INFO: renamed from: e */
    public nsi m26812e(nsi.InterfaceC10049a interfaceC10049a) {
        return new nsi(this.f105126c, this.f105125b, this.f105124a, interfaceC10049a);
    }

    @fdi(otherwise = 5)
    /* JADX INFO: renamed from: f */
    public ga0 m26813f() {
        return this.f105125b;
    }

    /* JADX INFO: renamed from: g */
    public void m26814g() {
        this.f105126c.shutdown();
    }

    public Task<List<t4b>> lookup(List<ci4> list) {
        ow0.C10673b c10673bNewBuilder = ow0.newBuilder();
        c10673bNewBuilder.setDatabase(this.f105124a.databaseName());
        Iterator<ci4> it = list.iterator();
        while (it.hasNext()) {
            c10673bNewBuilder.addDocuments(this.f105124a.encodeKey(it.next()));
        }
        ArrayList arrayList = new ArrayList();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f105126c.m22939h(x06.getBatchGetDocumentsMethod(), c10673bNewBuilder.build(), new C16145a(arrayList, list, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, b2i>> runAggregateQuery(nld nldVar, List<AbstractC3595a> list) {
        mmg.C9419e c9419eEncodeQueryTarget = this.f105124a.encodeQueryTarget(nldVar.toAggregateTarget());
        final HashMap<String, String> map = new HashMap<>();
        yag yagVarM18218h = this.f105124a.m18218h(c9419eEncodeQueryTarget, list, map);
        uce.C13498b c13498bNewBuilder = uce.newBuilder();
        c13498bNewBuilder.setParent(c9419eEncodeQueryTarget.getParent());
        c13498bNewBuilder.setStructuredAggregationQuery(yagVarM18218h);
        return this.f105126c.m22938g(x06.getRunAggregationQueryMethod(), c13498bNewBuilder.build()).continueWith(this.f105125b.getExecutor(), new Continuation() { // from class: xi3
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f98060a.lambda$runAggregateQuery$1(map, task);
            }
        });
    }

    public static boolean isPermanentError(C3603f.a aVar) {
        switch (C16146b.f105131a[aVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }
}
