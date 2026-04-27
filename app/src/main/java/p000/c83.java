package p000;

import android.content.Context;
import android.credentials.ClearCredentialStateException;
import android.credentials.ClearCredentialStateRequest;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.p001os.OutcomeReceiver;
import android.util.Log;
import java.util.concurrent.Executor;
import p000.c63;
import p000.kad;
import p000.l63;
import p000.q53;
import p000.v47;

/* JADX INFO: loaded from: classes3.dex */
@c5e(34)
@dwf({"SMAP\nCredentialProviderFrameworkImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialProviderFrameworkImpl.kt\nandroidx/credentials/CredentialProviderFrameworkImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1855#2,2:398\n*S KotlinDebug\n*F\n+ 1 CredentialProviderFrameworkImpl.kt\nandroidx/credentials/CredentialProviderFrameworkImpl\n*L\n243#1:398,2\n*E\n"})
public final class c83 implements u63 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C2221a f15931b = new C2221a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f15932c = "CredManProvService";

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f15933d = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String f15934e = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";

    /* JADX INFO: renamed from: a */
    @gib
    public final CredentialManager f15935a;

    /* JADX INFO: renamed from: c83$a */
    public static final class C2221a {
        public /* synthetic */ C2221a(jt3 jt3Var) {
            this();
        }

        private C2221a() {
        }
    }

    /* JADX INFO: renamed from: c83$b */
    public static final class C2222b extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r63<Void, y12> f15936a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2222b(r63<Void, y12> r63Var) {
            super(0);
            this.f15936a = r63Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f15936a.onError(new d22("Your device doesn't support credential manager"));
        }
    }

    /* JADX INFO: renamed from: c83$c */
    public static final class C2223c implements OutcomeReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r63<Void, y12> f15937a;

        public C2223c(r63<Void, y12> r63Var) {
            this.f15937a = r63Var;
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            onError(d83.m8974a(th));
        }

        public void onError(@yfb ClearCredentialStateException clearCredentialStateException) {
            md8.checkNotNullParameter(clearCredentialStateException, "error");
            Log.i(c83.f15932c, "ClearCredentialStateException error returned from framework");
            this.f15937a.onError(new c22(null, 1, null));
        }

        public void onResult(@yfb Void r3) {
            md8.checkNotNullParameter(r3, "response");
            Log.i(c83.f15932c, "Clear result returned from framework: ");
            this.f15937a.onResult(r3);
        }
    }

    /* JADX INFO: renamed from: c83$d */
    public static final class C2224d extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r63<q53, l53> f15938a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2224d(r63<q53, l53> r63Var) {
            super(0);
            this.f15938a = r63Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f15938a.onError(new s53("Your device doesn't support credential manager"));
        }
    }

    /* JADX INFO: renamed from: c83$e */
    public static final class C2225e implements OutcomeReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r63<q53, l53> f15939a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ p53 f15940b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ c83 f15941c;

        public C2225e(r63<q53, l53> r63Var, p53 p53Var, c83 c83Var) {
            this.f15939a = r63Var;
            this.f15940b = p53Var;
            this.f15941c = c83Var;
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            onError(e83.m9801a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            onResult(g83.m11431a(obj));
        }

        public void onError(@yfb CreateCredentialException createCredentialException) {
            md8.checkNotNullParameter(createCredentialException, "error");
            Log.i(c83.f15932c, "CreateCredentialResponse error returned from framework");
            this.f15939a.onError(this.f15941c.convertToJetpackCreateException$credentials_release(createCredentialException));
        }

        public void onResult(@yfb CreateCredentialResponse createCredentialResponse) {
            md8.checkNotNullParameter(createCredentialResponse, "response");
            Log.i(c83.f15932c, "Create Result returned from framework: ");
            r63<q53, l53> r63Var = this.f15939a;
            q53.C11310a c11310a = q53.f73260c;
            String type = this.f15940b.getType();
            Bundle data = createCredentialResponse.getData();
            md8.checkNotNullExpressionValue(data, "response.data");
            r63Var.onResult(c11310a.createFrom(type, data));
        }
    }

    /* JADX INFO: renamed from: c83$f */
    public static final class C2226f extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r63<a47, w37> f15942a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2226f(r63<a47, w37> r63Var) {
            super(0);
            this.f15942a = r63Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f15942a.onError(new c47("Your device doesn't support credential manager"));
        }
    }

    /* JADX INFO: renamed from: c83$g */
    public static final class C2227g extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r63<a47, w37> f15943a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2227g(r63<a47, w37> r63Var) {
            super(0);
            this.f15943a = r63Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f15943a.onError(new c47("Your device doesn't support credential manager"));
        }
    }

    /* JADX INFO: renamed from: c83$h */
    public static final class C2228h implements OutcomeReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r63<a47, w37> f15944a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c83 f15945b;

        public C2228h(r63<a47, w37> r63Var, c83 c83Var) {
            this.f15944a = r63Var;
            this.f15945b = c83Var;
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            onError(i83.m12852a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            onResult(h83.m12274a(obj));
        }

        public void onError(@yfb GetCredentialException getCredentialException) {
            md8.checkNotNullParameter(getCredentialException, "error");
            this.f15944a.onError(this.f15945b.convertToJetpackGetException$credentials_release(getCredentialException));
        }

        public void onResult(@yfb GetCredentialResponse getCredentialResponse) {
            md8.checkNotNullParameter(getCredentialResponse, "response");
            this.f15944a.onResult(this.f15945b.convertGetResponseToJetpackClass$credentials_release(getCredentialResponse));
        }
    }

    /* JADX INFO: renamed from: c83$i */
    public static final class C2229i implements OutcomeReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r63<a47, w37> f15946a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c83 f15947b;

        public C2229i(r63<a47, w37> r63Var, c83 c83Var) {
            this.f15946a = r63Var;
            this.f15947b = c83Var;
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            onError(i83.m12852a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            onResult(h83.m12274a(obj));
        }

        public void onError(@yfb GetCredentialException getCredentialException) {
            md8.checkNotNullParameter(getCredentialException, "error");
            Log.i(c83.f15932c, "GetCredentialResponse error returned from framework");
            this.f15946a.onError(this.f15947b.convertToJetpackGetException$credentials_release(getCredentialException));
        }

        public void onResult(@yfb GetCredentialResponse getCredentialResponse) {
            md8.checkNotNullParameter(getCredentialResponse, "response");
            Log.i(c83.f15932c, "GetCredentialResponse returned from framework");
            this.f15946a.onResult(this.f15947b.convertGetResponseToJetpackClass$credentials_release(getCredentialResponse));
        }
    }

    /* JADX INFO: renamed from: c83$j */
    public static final class C2230j extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r63<kad, w37> f15948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2230j(r63<kad, w37> r63Var) {
            super(0);
            this.f15948a = r63Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f15948a.onError(new c47("Your device doesn't support credential manager"));
        }
    }

    /* JADX INFO: renamed from: c83$k */
    public static final class C2231k implements OutcomeReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r63<kad, w37> f15949a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c83 f15950b;

        public C2231k(r63<kad, w37> r63Var, c83 c83Var) {
            this.f15949a = r63Var;
            this.f15950b = c83Var;
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            onError(i83.m12852a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            onResult(j83.m13839a(obj));
        }

        public void onError(@yfb GetCredentialException getCredentialException) {
            md8.checkNotNullParameter(getCredentialException, "error");
            this.f15949a.onError(this.f15950b.convertToJetpackGetException$credentials_release(getCredentialException));
        }

        public void onResult(@yfb PrepareGetCredentialResponse prepareGetCredentialResponse) {
            md8.checkNotNullParameter(prepareGetCredentialResponse, "response");
            this.f15949a.onResult(this.f15950b.convertPrepareGetResponseToJetpackClass$credentials_release(prepareGetCredentialResponse));
        }
    }

    public c83(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        this.f15935a = f73.m10694a(context.getSystemService("credential"));
    }

    private final CreateCredentialRequest convertCreateRequestToFrameworkClass(p53 p53Var, Context context) {
        u73.m23118a();
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = t73.m22414a(p53Var.getType(), uv6.f89228a.getFinalCreateCredentialData(p53Var, context), p53Var.getCandidateQueryData()).setIsSystemProviderRequired(p53Var.isSystemProviderRequired()).setAlwaysSendAppInfoToProvider(true);
        md8.checkNotNullExpressionValue(alwaysSendAppInfoToProvider, "Builder(request.type,\n  …ndAppInfoToProvider(true)");
        setOriginForCreateRequest(p53Var, alwaysSendAppInfoToProvider);
        CreateCredentialRequest createCredentialRequestBuild = alwaysSendAppInfoToProvider.build();
        md8.checkNotNullExpressionValue(createCredentialRequestBuild, "createCredentialRequestBuilder.build()");
        return createCredentialRequestBuild;
    }

    private final GetCredentialRequest convertGetRequestToFrameworkClass(z37 z37Var) {
        q73.m20103a();
        GetCredentialRequest.Builder builderM18392a = o73.m18392a(z37.f103968f.toRequestDataBundle(z37Var));
        for (t63 t63Var : z37Var.getCredentialOptions()) {
            r73.m21078a();
            builderM18392a.addCredentialOption(p73.m19287a(t63Var.getType(), t63Var.getRequestData(), t63Var.getCandidateQueryData()).setIsSystemProviderRequired(t63Var.isSystemProviderRequired()).setAllowedProviders(t63Var.getAllowedProviders()).build());
        }
        setOriginForGetRequest(z37Var, builderM18392a);
        GetCredentialRequest getCredentialRequestBuild = builderM18392a.build();
        md8.checkNotNullExpressionValue(getCredentialRequestBuild, "builder.build()");
        return getCredentialRequestBuild;
    }

    private final ClearCredentialStateRequest createFrameworkClearCredentialRequest() {
        n73.m17801a();
        return m73.m16651a(new Bundle());
    }

    private final boolean isCredmanDisabled(ny6<bth> ny6Var) {
        if (this.f15935a != null) {
            return false;
        }
        ny6Var.invoke();
        return true;
    }

    @igg({"MissingPermission"})
    private final void setOriginForCreateRequest(p53 p53Var, CreateCredentialRequest.Builder builder) {
        if (p53Var.getOrigin() != null) {
            builder.setOrigin(p53Var.getOrigin());
        }
    }

    @igg({"MissingPermission"})
    private final void setOriginForGetRequest(z37 z37Var, GetCredentialRequest.Builder builder) {
        if (z37Var.getOrigin() != null) {
            builder.setOrigin(z37Var.getOrigin());
        }
    }

    @yfb
    public final a47 convertGetResponseToJetpackClass$credentials_release(@yfb GetCredentialResponse getCredentialResponse) {
        md8.checkNotNullParameter(getCredentialResponse, "response");
        Credential credential = getCredentialResponse.getCredential();
        md8.checkNotNullExpressionValue(credential, "response.credential");
        l63.C8639a c8639a = l63.f56329c;
        String type = credential.getType();
        md8.checkNotNullExpressionValue(type, "credential.type");
        Bundle data = credential.getData();
        md8.checkNotNullExpressionValue(data, "credential.data");
        return new a47(c8639a.createFrom(type, data));
    }

    @yfb
    public final kad convertPrepareGetResponseToJetpackClass$credentials_release(@yfb PrepareGetCredentialResponse prepareGetCredentialResponse) {
        md8.checkNotNullParameter(prepareGetCredentialResponse, "response");
        return new kad.C8268a().setFrameworkResponse(prepareGetCredentialResponse).setPendingGetCredentialHandle(new kad.C8269b(prepareGetCredentialResponse.getPendingGetCredentialHandle())).build();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @yfb
    public final l53 convertToJetpackCreateException$credentials_release(@yfb CreateCredentialException createCredentialException) {
        md8.checkNotNullParameter(createCredentialException, "error");
        String type = createCredentialException.getType();
        switch (type.hashCode()) {
            case -2055374133:
                if (type.equals(j53.f49541d)) {
                    return new j53(createCredentialException.getMessage());
                }
                break;
            case 1316905704:
                if (type.equals(r53.f77068d)) {
                    return new r53(createCredentialException.getMessage());
                }
                break;
            case 2092588512:
                if (type.equals(m53.f59922d)) {
                    return new m53(createCredentialException.getMessage());
                }
                break;
            case 2131915191:
                if (type.equals(n53.f63329d)) {
                    return new n53(createCredentialException.getMessage());
                }
                break;
        }
        String type2 = createCredentialException.getType();
        md8.checkNotNullExpressionValue(type2, "error.type");
        if (!h9g.startsWith$default(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            String type3 = createCredentialException.getType();
            md8.checkNotNullExpressionValue(type3, "error.type");
            return new k53(type3, createCredentialException.getMessage());
        }
        c63.C2210a c2210a = c63.f15826d;
        String type4 = createCredentialException.getType();
        md8.checkNotNullExpressionValue(type4, "error.type");
        return c2210a.createFrom(type4, createCredentialException.getMessage());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @yfb
    public final w37 convertToJetpackGetException$credentials_release(@yfb GetCredentialException getCredentialException) {
        md8.checkNotNullParameter(getCredentialException, "error");
        String type = getCredentialException.getType();
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals(b47.f12671d)) {
                    return new b47(getCredentialException.getMessage());
                }
                break;
            case -45448328:
                if (type.equals(x37.f96117d)) {
                    return new x37(getCredentialException.getMessage());
                }
                break;
            case 580557411:
                if (type.equals(u37.f86723d)) {
                    return new u37(getCredentialException.getMessage());
                }
                break;
            case 627896683:
                if (type.equals(ddb.f29428d)) {
                    return new ddb(getCredentialException.getMessage());
                }
                break;
        }
        String type2 = getCredentialException.getType();
        md8.checkNotNullExpressionValue(type2, "error.type");
        if (!h9g.startsWith$default(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, null)) {
            String type3 = getCredentialException.getType();
            md8.checkNotNullExpressionValue(type3, "error.type");
            return new v37(type3, getCredentialException.getMessage());
        }
        v47.C13859a c13859a = v47.f89901d;
        String type4 = getCredentialException.getType();
        md8.checkNotNullExpressionValue(type4, "error.type");
        return c13859a.createFrom(type4, getCredentialException.getMessage());
    }

    @Override // p000.u63
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @Override // p000.u63
    public void onClearCredential(@yfb b22 b22Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<Void, y12> r63Var) {
        md8.checkNotNullParameter(b22Var, "request");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
        Log.i(f15932c, "In CredentialProviderFrameworkImpl onClearCredential");
        if (isCredmanDisabled(new C2222b(r63Var))) {
            return;
        }
        C2223c c2223c = new C2223c(r63Var);
        CredentialManager credentialManager = this.f15935a;
        md8.checkNotNull(credentialManager);
        credentialManager.clearCredentialState(createFrameworkClearCredentialRequest(), cancellationSignal, executor, j8c.m13842a(c2223c));
    }

    @Override // p000.u63
    public void onCreateCredential(@yfb Context context, @yfb p53 p53Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<q53, l53> r63Var) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(p53Var, "request");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
        if (isCredmanDisabled(new C2224d(r63Var))) {
            return;
        }
        C2225e c2225e = new C2225e(r63Var, p53Var, this);
        CredentialManager credentialManager = this.f15935a;
        md8.checkNotNull(credentialManager);
        credentialManager.createCredential(context, convertCreateRequestToFrameworkClass(p53Var, context), cancellationSignal, executor, j8c.m13842a(c2225e));
    }

    @Override // p000.u63
    public void onGetCredential(@yfb Context context, @yfb kad.C8269b c8269b, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<a47, w37> r63Var) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(c8269b, "pendingGetCredentialHandle");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
        if (isCredmanDisabled(new C2226f(r63Var))) {
            return;
        }
        C2228h c2228h = new C2228h(r63Var, this);
        CredentialManager credentialManager = this.f15935a;
        md8.checkNotNull(credentialManager);
        PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle = c8269b.getFrameworkHandle();
        md8.checkNotNull(frameworkHandle);
        credentialManager.getCredential(context, frameworkHandle, cancellationSignal, executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) j8c.m13842a(c2228h));
    }

    @Override // p000.u63
    public void onPrepareCredential(@yfb z37 z37Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<kad, w37> r63Var) {
        md8.checkNotNullParameter(z37Var, "request");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
        if (isCredmanDisabled(new C2230j(r63Var))) {
            return;
        }
        C2231k c2231k = new C2231k(r63Var, this);
        CredentialManager credentialManager = this.f15935a;
        md8.checkNotNull(credentialManager);
        credentialManager.prepareGetCredential(convertGetRequestToFrameworkClass(z37Var), cancellationSignal, executor, j8c.m13842a(c2231k));
    }

    @Override // p000.u63
    public void onGetCredential(@yfb Context context, @yfb z37 z37Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<a47, w37> r63Var) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(z37Var, "request");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
        if (isCredmanDisabled(new C2227g(r63Var))) {
            return;
        }
        C2229i c2229i = new C2229i(r63Var, this);
        CredentialManager credentialManager = this.f15935a;
        md8.checkNotNull(credentialManager);
        credentialManager.getCredential(context, convertGetRequestToFrameworkClass(z37Var), cancellationSignal, executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) j8c.m13842a(c2229i));
    }
}
