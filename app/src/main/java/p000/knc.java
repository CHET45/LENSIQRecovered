package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.SigningInfo;
import android.credentials.CredentialOption;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.CreateCredentialRequest;
import android.service.credentials.GetCredentialRequest;
import android.util.Log;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p000.kid;
import p000.knc;
import p000.p53;
import p000.t63;

/* JADX INFO: loaded from: classes3.dex */
@c5e(34)
public final class knc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C8464a f54788a = new C8464a(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f54789b = "PendingIntentHandler";

    /* JADX INFO: renamed from: knc$a */
    @dwf({"SMAP\nPendingIntentHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PendingIntentHandler.kt\nandroidx/credentials/provider/PendingIntentHandler$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
    public static final class C8464a {

        /* JADX INFO: renamed from: knc$a$a */
        public static final class a extends tt8 implements qy6<CredentialOption, t63> {

            /* JADX INFO: renamed from: a */
            public static final a f54790a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ t63 invoke(CredentialOption credentialOption) {
                return invoke2(jnc.m14187a(credentialOption));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final t63 invoke2(CredentialOption credentialOption) {
                t63.C12921a c12921a = t63.f83775g;
                String type = credentialOption.getType();
                md8.checkNotNullExpressionValue(type, "option.type");
                Bundle credentialRetrievalData = credentialOption.getCredentialRetrievalData();
                md8.checkNotNullExpressionValue(credentialRetrievalData, "option.credentialRetrievalData");
                Bundle candidateQueryData = credentialOption.getCandidateQueryData();
                md8.checkNotNullExpressionValue(candidateQueryData, "option.candidateQueryData");
                boolean zIsSystemProviderRequired = credentialOption.isSystemProviderRequired();
                Set<ComponentName> allowedProviders = credentialOption.getAllowedProviders();
                md8.checkNotNullExpressionValue(allowedProviders, "option.allowedProviders");
                return c12921a.createFrom(type, credentialRetrievalData, candidateQueryData, zIsSystemProviderRequired, allowedProviders);
            }
        }

        public /* synthetic */ C8464a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t63 retrieveProviderGetCredentialRequest$lambda$1(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return (t63) qy6Var.invoke(obj);
        }

        @do8
        @gib
        public final qy0 retrieveBeginGetCredentialRequest(@yfb Intent intent) {
            md8.checkNotNullParameter(intent, "intent");
            BeginGetCredentialRequest beginGetCredentialRequestM3257a = bnc.m3257a(intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST", anc.m933a()));
            if (beginGetCredentialRequestM3257a != null) {
                return c01.f15399a.convertToJetpackRequest$credentials_release(beginGetCredentialRequestM3257a);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @do8
        @gib
        public final jid retrieveProviderCreateCredentialRequest(@yfb Intent intent) {
            md8.checkNotNullParameter(intent, "intent");
            CreateCredentialRequest createCredentialRequestM16236a = lmc.m16236a(intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", cnc.m4089a()));
            if (createCredentialRequestM16236a == 0) {
                Log.i(knc.f54789b, "Request not found in pendingIntent");
                return (jid) createCredentialRequestM16236a;
            }
            p53.C10797a c10797a = p53.f69703i;
            String type = createCredentialRequestM16236a.getType();
            md8.checkNotNullExpressionValue(type, "frameworkReq.type");
            Bundle data = createCredentialRequestM16236a.getData();
            md8.checkNotNullExpressionValue(data, "frameworkReq.data");
            Bundle data2 = createCredentialRequestM16236a.getData();
            md8.checkNotNullExpressionValue(data2, "frameworkReq.data");
            p53 p53VarCreateFrom = c10797a.createFrom(type, data, data2, false, createCredentialRequestM16236a.getCallingAppInfo().getOrigin());
            if (p53VarCreateFrom == null) {
                return null;
            }
            String packageName = createCredentialRequestM16236a.getCallingAppInfo().getPackageName();
            md8.checkNotNullExpressionValue(packageName, "frameworkReq.callingAppInfo.packageName");
            SigningInfo signingInfo = createCredentialRequestM16236a.getCallingAppInfo().getSigningInfo();
            md8.checkNotNullExpressionValue(signingInfo, "frameworkReq.callingAppInfo.signingInfo");
            return new jid(p53VarCreateFrom, new so1(packageName, signingInfo, createCredentialRequestM16236a.getCallingAppInfo().getOrigin()));
        }

        @do8
        @gib
        public final kid retrieveProviderGetCredentialRequest(@yfb Intent intent) {
            md8.checkNotNullParameter(intent, "intent");
            GetCredentialRequest getCredentialRequestM24073a = vmc.m24073a(intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", jmc.m14183a()));
            if (getCredentialRequestM24073a == null) {
                Log.i(knc.f54789b, "Get request from framework is null");
                return null;
            }
            kid.C8383a c8383a = kid.f54228c;
            Stream stream = getCredentialRequestM24073a.getCredentialOptions().stream();
            final a aVar = a.f54790a;
            Object objCollect = stream.map(new Function() { // from class: dnc
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return knc.C8464a.retrieveProviderGetCredentialRequest$lambda$1(aVar, obj);
                }
            }).collect(Collectors.toList());
            md8.checkNotNullExpressionValue(objCollect, "frameworkReq.credentialO…lect(Collectors.toList())");
            String packageName = getCredentialRequestM24073a.getCallingAppInfo().getPackageName();
            md8.checkNotNullExpressionValue(packageName, "frameworkReq.callingAppInfo.packageName");
            SigningInfo signingInfo = getCredentialRequestM24073a.getCallingAppInfo().getSigningInfo();
            md8.checkNotNullExpressionValue(signingInfo, "frameworkReq.callingAppInfo.signingInfo");
            return c8383a.createFrom$credentials_release((List) objCollect, new so1(packageName, signingInfo, getCredentialRequestM24073a.getCallingAppInfo().getOrigin()));
        }

        @do8
        public final void setBeginGetCredentialResponse(@yfb Intent intent, @yfb ry0 ry0Var) {
            md8.checkNotNullParameter(intent, "intent");
            md8.checkNotNullParameter(ry0Var, "response");
            intent.putExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", c01.f15399a.convertToFrameworkResponse(ry0Var));
        }

        @do8
        public final void setCreateCredentialException(@yfb Intent intent, @yfb l53 l53Var) {
            md8.checkNotNullParameter(intent, "intent");
            md8.checkNotNullParameter(l53Var, "exception");
            n83.m17804a();
            intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", m83.m17116a(l53Var.getType(), l53Var.getMessage()));
        }

        @do8
        public final void setCreateCredentialResponse(@yfb Intent intent, @yfb q53 q53Var) {
            md8.checkNotNullParameter(intent, "intent");
            md8.checkNotNullParameter(q53Var, "response");
            tmc.m22728a();
            intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", smc.m22094a(q53Var.getData()));
        }

        @do8
        public final void setGetCredentialException(@yfb Intent intent, @yfb w37 w37Var) {
            md8.checkNotNullParameter(intent, "intent");
            md8.checkNotNullParameter(w37Var, "exception");
            p83.m19329a();
            intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", o83.m18398a(w37Var.getType(), w37Var.getMessage()));
        }

        @do8
        public final void setGetCredentialResponse(@yfb Intent intent, @yfb a47 a47Var) {
            md8.checkNotNullParameter(intent, "intent");
            md8.checkNotNullParameter(a47Var, "response");
            qmc.m20440a();
            rmc.m21429a();
            intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", pmc.m19620a(omc.m18782a(a47Var.getCredential().getType(), a47Var.getCredential().getData())));
        }

        private C8464a() {
        }
    }

    @do8
    @gib
    public static final qy0 retrieveBeginGetCredentialRequest(@yfb Intent intent) {
        return f54788a.retrieveBeginGetCredentialRequest(intent);
    }

    @do8
    @gib
    public static final jid retrieveProviderCreateCredentialRequest(@yfb Intent intent) {
        return f54788a.retrieveProviderCreateCredentialRequest(intent);
    }

    @do8
    @gib
    public static final kid retrieveProviderGetCredentialRequest(@yfb Intent intent) {
        return f54788a.retrieveProviderGetCredentialRequest(intent);
    }

    @do8
    public static final void setBeginGetCredentialResponse(@yfb Intent intent, @yfb ry0 ry0Var) {
        f54788a.setBeginGetCredentialResponse(intent, ry0Var);
    }

    @do8
    public static final void setCreateCredentialException(@yfb Intent intent, @yfb l53 l53Var) {
        f54788a.setCreateCredentialException(intent, l53Var);
    }

    @do8
    public static final void setCreateCredentialResponse(@yfb Intent intent, @yfb q53 q53Var) {
        f54788a.setCreateCredentialResponse(intent, q53Var);
    }

    @do8
    public static final void setGetCredentialException(@yfb Intent intent, @yfb w37 w37Var) {
        f54788a.setGetCredentialException(intent, w37Var);
    }

    @do8
    public static final void setGetCredentialResponse(@yfb Intent intent, @yfb a47 a47Var) {
        f54788a.setGetCredentialResponse(intent, a47Var);
    }
}
