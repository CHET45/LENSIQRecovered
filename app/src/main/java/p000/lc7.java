package p000;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p000.ga0;
import p000.x06;

/* JADX INFO: loaded from: classes5.dex */
public class lc7 {

    /* JADX INFO: renamed from: h */
    public static final String f57184h = "GrpcCallProvider";

    /* JADX INFO: renamed from: i */
    public static mfg<pr9<?>> f57185i = null;

    /* JADX INFO: renamed from: j */
    public static final int f57186j = 15000;

    /* JADX INFO: renamed from: a */
    public Task<or9> f57187a;

    /* JADX INFO: renamed from: b */
    public final ga0 f57188b;

    /* JADX INFO: renamed from: c */
    public rn1 f57189c;

    /* JADX INFO: renamed from: d */
    public ga0.C6179b f57190d;

    /* JADX INFO: renamed from: e */
    public final Context f57191e;

    /* JADX INFO: renamed from: f */
    public final ri3 f57192f;

    /* JADX INFO: renamed from: g */
    public final pn1 f57193g;

    public lc7(ga0 ga0Var, Context context, ri3 ri3Var, pn1 pn1Var) {
        this.f57188b = ga0Var;
        this.f57191e = context;
        this.f57192f = ri3Var;
        this.f57193g = pn1Var;
        initChannelTask();
    }

    private void clearConnectivityAttemptTimer() {
        if (this.f57190d != null) {
            fj9.debug(f57184h, "Clearing the connectivityAttemptTimer", new Object[0]);
            this.f57190d.cancel();
            this.f57190d = null;
        }
    }

    private or9 initChannel(Context context, ri3 ri3Var) {
        pr9<?> pr9Var;
        try {
            ProviderInstaller.installIfNeeded(context);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IllegalStateException e) {
            fj9.warn(f57184h, "Failed to update ssl context: %s", e);
        }
        mfg<pr9<?>> mfgVar = f57185i;
        if (mfgVar != null) {
            pr9Var = mfgVar.get();
        } else {
            pr9<?> pr9VarForTarget = pr9.forTarget(ri3Var.getHost());
            if (!ri3Var.isSslEnabled()) {
                pr9VarForTarget.usePlaintext();
            }
            pr9Var = pr9VarForTarget;
        }
        pr9Var.keepAliveTime(30L, TimeUnit.SECONDS);
        return C5923fq.usingBuilder(pr9Var).context(context).build();
    }

    private void initChannelTask() {
        this.f57187a = Tasks.call(z85.f104373d, new Callable() { // from class: ic7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f46485a.lambda$initChannelTask$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$createClientCall$0(rua ruaVar, Task task) throws Exception {
        return Tasks.forResult(((or9) task.getResult()).newCall(ruaVar, this.f57189c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ or9 lambda$initChannelTask$6() throws Exception {
        final or9 or9VarInitChannel = initChannel(this.f57191e, this.f57192f);
        this.f57188b.enqueueAndForget(new Runnable() { // from class: kc7
            @Override // java.lang.Runnable
            public final void run() {
                this.f53581a.lambda$initChannelTask$5(or9VarInitChannel);
            }
        });
        this.f57189c = ((x06.C14862h) ((x06.C14862h) x06.newStub(or9VarInitChannel).withCallCredentials(this.f57193g)).withExecutor(this.f57188b.getExecutor())).getCallOptions();
        fj9.debug(f57184h, "Channel successfully reset.", new Object[0]);
        return or9VarInitChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectivityStateChange$1(or9 or9Var) {
        fj9.debug(f57184h, "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        clearConnectivityAttemptTimer();
        resetChannel(or9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectivityStateChange$3(final or9 or9Var) {
        this.f57188b.enqueueAndForget(new Runnable() { // from class: gc7
            @Override // java.lang.Runnable
            public final void run() {
                this.f39353a.lambda$onConnectivityStateChange$2(or9Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetChannel$4(or9 or9Var) {
        or9Var.shutdownNow();
        initChannelTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onConnectivityStateChange, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$onConnectivityStateChange$2(final or9 or9Var) {
        ws2 state = or9Var.getState(true);
        fj9.debug(f57184h, "Current gRPC connectivity state: " + state, new Object[0]);
        clearConnectivityAttemptTimer();
        if (state == ws2.CONNECTING) {
            fj9.debug(f57184h, "Setting the connectivityAttemptTimer", new Object[0]);
            this.f57190d = this.f57188b.enqueueAfterDelay(ga0.EnumC6181d.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new Runnable() { // from class: ec7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32614a.lambda$onConnectivityStateChange$1(or9Var);
                }
            });
        }
        or9Var.notifyWhenStateChanged(state, new Runnable() { // from class: fc7
            @Override // java.lang.Runnable
            public final void run() {
                this.f36092a.lambda$onConnectivityStateChange$3(or9Var);
            }
        });
    }

    private void resetChannel(final or9 or9Var) {
        this.f57188b.enqueueAndForget(new Runnable() { // from class: jc7
            @Override // java.lang.Runnable
            public final void run() {
                this.f50291a.lambda$resetChannel$4(or9Var);
            }
        });
    }

    public <ReqT, RespT> Task<w22<ReqT, RespT>> createClientCall(final rua<ReqT, RespT> ruaVar) {
        return (Task<w22<ReqT, RespT>>) this.f57187a.continueWithTask(this.f57188b.getExecutor(), new Continuation() { // from class: hc7
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f43129a.lambda$createClientCall$0(ruaVar, task);
            }
        });
    }

    public void shutdown() {
        try {
            or9 or9Var = (or9) Tasks.await(this.f57187a);
            or9Var.shutdown();
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (or9Var.awaitTermination(1L, timeUnit)) {
                    return;
                }
                fj9.debug(tz5.class.getSimpleName(), "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown.", new Object[0]);
                or9Var.shutdownNow();
                if (or9Var.awaitTermination(60L, timeUnit)) {
                    return;
                }
                fj9.warn(tz5.class.getSimpleName(), "Unable to forcefully shutdown the gRPC ManagedChannel.", new Object[0]);
            } catch (InterruptedException unused) {
                or9Var.shutdownNow();
                fj9.warn(tz5.class.getSimpleName(), "Interrupted while shutting down the gRPC Managed Channel", new Object[0]);
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException unused2) {
            fj9.warn(tz5.class.getSimpleName(), "Interrupted while retrieving the gRPC Managed Channel", new Object[0]);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            fj9.warn(tz5.class.getSimpleName(), "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s", e);
        }
    }
}
