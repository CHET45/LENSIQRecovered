package p000;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CreateEntry;
import android.service.credentials.RemoteEntry;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p000.ly0;
import p000.lyd;
import p000.ny0;
import p000.oy0;
import p000.x53;

/* JADX INFO: loaded from: classes3.dex */
@c5e(34)
public final class ly0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C9036a f59191a = new C9036a(null);

    /* JADX INFO: renamed from: ly0$a */
    @dwf({"SMAP\nBeginCreateCredentialUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginCreateCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginCreateCredentialUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1855#2,2:166\n1#3:168\n*S KotlinDebug\n*F\n+ 1 BeginCreateCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginCreateCredentialUtil$Companion\n*L\n123#1:166,2\n*E\n"})
    public static final class C9036a {

        /* JADX INFO: renamed from: ly0$a$a */
        public static final class a extends tt8 implements qy6<CreateEntry, x53> {

            /* JADX INFO: renamed from: a */
            public static final a f59192a = new a();

            public a() {
                super(1);
            }

            @gib
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final x53 invoke2(CreateEntry createEntry) {
                x53.C14921c c14921c = x53.f96733h;
                Slice slice = createEntry.getSlice();
                md8.checkNotNullExpressionValue(slice, "entry.slice");
                return c14921c.fromSlice(slice);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ x53 invoke(CreateEntry createEntry) {
                return invoke2(ky0.m15137a(createEntry));
            }
        }

        /* JADX INFO: renamed from: ly0$a$b */
        public static final class b extends tt8 implements qy6<x53, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final b f59193a = new b();

            public b() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@gib x53 x53Var) {
                return Boolean.valueOf(x53Var != null);
            }
        }

        /* JADX INFO: renamed from: ly0$a$c */
        public static final class c extends tt8 implements qy6<x53, x53> {

            /* JADX INFO: renamed from: a */
            public static final c f59194a = new c();

            public c() {
                super(1);
            }

            @Override // p000.qy6
            public final x53 invoke(@gib x53 x53Var) {
                md8.checkNotNull(x53Var);
                return x53Var;
            }
        }

        public /* synthetic */ C9036a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x53 convertToJetpackResponse$lambda$5(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return (x53) qy6Var.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$6(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return ((Boolean) qy6Var.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x53 convertToJetpackResponse$lambda$7(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return (x53) qy6Var.invoke(obj);
        }

        private final void populateCreateEntries(BeginCreateCredentialResponse.Builder builder, List<x53> list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Slice slice = x53.f96733h.toSlice((x53) it.next());
                if (slice != null) {
                    builder.addCreateEntry(vx0.m24215a(slice));
                }
            }
        }

        @igg({"MissingPermission"})
        private final void populateRemoteEntry(BeginCreateCredentialResponse.Builder builder, lyd lydVar) {
            if (lydVar == null) {
                return;
            }
            qx0.m20702a();
            builder.setRemoteCreateEntry(fy0.m11232a(lyd.f59259b.toSlice(lydVar)));
        }

        @yfb
        public final BeginCreateCredentialRequest convertToFrameworkRequest(@yfb nx0 nx0Var) {
            CallingAppInfo callingAppInfoM21596a;
            md8.checkNotNullParameter(nx0Var, "request");
            if (nx0Var.getCallingAppInfo() != null) {
                tx0.m22900a();
                callingAppInfoM21596a = rx0.m21596a(nx0Var.getCallingAppInfo().getPackageName(), nx0Var.getCallingAppInfo().getSigningInfo(), nx0Var.getCallingAppInfo().getOrigin());
            } else {
                callingAppInfoM21596a = null;
            }
            ux0.m23620a();
            return sx0.m22281a(nx0Var.getType(), nx0Var.getCandidateQueryData(), callingAppInfoM21596a);
        }

        @yfb
        public final BeginCreateCredentialResponse convertToFrameworkResponse(@yfb ox0 ox0Var) {
            md8.checkNotNullParameter(ox0Var, "response");
            BeginCreateCredentialResponse.Builder builderM24851a = wx0.m24851a();
            populateCreateEntries(builderM24851a, ox0Var.getCreateEntries());
            populateRemoteEntry(builderM24851a, ox0Var.getRemoteEntry());
            BeginCreateCredentialResponse beginCreateCredentialResponseBuild = builderM24851a.build();
            md8.checkNotNullExpressionValue(beginCreateCredentialResponseBuild, "frameworkBuilder.build()");
            return beginCreateCredentialResponseBuild;
        }

        @do8
        @yfb
        public final nx0 convertToJetpackRequest$credentials_release(@yfb BeginCreateCredentialRequest beginCreateCredentialRequest) {
            so1 so1Var;
            so1 so1Var2;
            so1 so1Var3;
            md8.checkNotNullParameter(beginCreateCredentialRequest, "request");
            so1 so1Var4 = null;
            try {
                String type = beginCreateCredentialRequest.getType();
                int iHashCode = type.hashCode();
                if (iHashCode != -543568185) {
                    if (iHashCode == -95037569 && type.equals(jjd.f50722f)) {
                        oy0.C10715a c10715a = oy0.f69193g;
                        Bundle data = beginCreateCredentialRequest.getData();
                        md8.checkNotNullExpressionValue(data, "request.data");
                        CallingAppInfo callingAppInfo = beginCreateCredentialRequest.getCallingAppInfo();
                        if (callingAppInfo != null) {
                            String packageName = callingAppInfo.getPackageName();
                            md8.checkNotNullExpressionValue(packageName, "it.packageName");
                            SigningInfo signingInfo = callingAppInfo.getSigningInfo();
                            md8.checkNotNullExpressionValue(signingInfo, "it.signingInfo");
                            so1Var3 = new so1(packageName, signingInfo, callingAppInfo.getOrigin());
                        } else {
                            so1Var3 = null;
                        }
                        return c10715a.createFrom$credentials_release(data, so1Var3);
                    }
                } else if (type.equals(oic.f67748g)) {
                    ny0.C10114a c10114a = ny0.f65995e;
                    Bundle data2 = beginCreateCredentialRequest.getData();
                    md8.checkNotNullExpressionValue(data2, "request.data");
                    CallingAppInfo callingAppInfo2 = beginCreateCredentialRequest.getCallingAppInfo();
                    if (callingAppInfo2 != null) {
                        String packageName2 = callingAppInfo2.getPackageName();
                        md8.checkNotNullExpressionValue(packageName2, "it.packageName");
                        SigningInfo signingInfo2 = callingAppInfo2.getSigningInfo();
                        md8.checkNotNullExpressionValue(signingInfo2, "it.signingInfo");
                        so1Var = new so1(packageName2, signingInfo2, callingAppInfo2.getOrigin());
                    } else {
                        so1Var = null;
                    }
                    return c10114a.createFrom$credentials_release(data2, so1Var);
                }
                String type2 = beginCreateCredentialRequest.getType();
                md8.checkNotNullExpressionValue(type2, "request.type");
                Bundle data3 = beginCreateCredentialRequest.getData();
                md8.checkNotNullExpressionValue(data3, "request.data");
                CallingAppInfo callingAppInfo3 = beginCreateCredentialRequest.getCallingAppInfo();
                if (callingAppInfo3 != null) {
                    String packageName3 = callingAppInfo3.getPackageName();
                    md8.checkNotNullExpressionValue(packageName3, "it.packageName");
                    SigningInfo signingInfo3 = callingAppInfo3.getSigningInfo();
                    md8.checkNotNullExpressionValue(signingInfo3, "it.signingInfo");
                    so1Var2 = new so1(packageName3, signingInfo3, callingAppInfo3.getOrigin());
                } else {
                    so1Var2 = null;
                }
                return new my0(type2, data3, so1Var2);
            } catch (qv6 unused) {
                String type3 = beginCreateCredentialRequest.getType();
                md8.checkNotNullExpressionValue(type3, "request.type");
                Bundle data4 = beginCreateCredentialRequest.getData();
                md8.checkNotNullExpressionValue(data4, "request.data");
                CallingAppInfo callingAppInfo4 = beginCreateCredentialRequest.getCallingAppInfo();
                if (callingAppInfo4 != null) {
                    String packageName4 = callingAppInfo4.getPackageName();
                    md8.checkNotNullExpressionValue(packageName4, "it.packageName");
                    SigningInfo signingInfo4 = callingAppInfo4.getSigningInfo();
                    md8.checkNotNullExpressionValue(signingInfo4, "it.signingInfo");
                    so1Var4 = new so1(packageName4, signingInfo4, callingAppInfo4.getOrigin());
                }
                return new my0(type3, data4, so1Var4);
            }
        }

        @yfb
        public final ox0 convertToJetpackResponse(@yfb BeginCreateCredentialResponse beginCreateCredentialResponse) {
            lyd lydVarFromSlice;
            md8.checkNotNullParameter(beginCreateCredentialResponse, "frameworkResponse");
            Stream stream = beginCreateCredentialResponse.getCreateEntries().stream();
            final a aVar = a.f59192a;
            Stream map = stream.map(new Function() { // from class: gy0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ly0.C9036a.convertToJetpackResponse$lambda$5(aVar, obj);
                }
            });
            final b bVar = b.f59193a;
            Stream streamFilter = map.filter(new Predicate() { // from class: hy0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ly0.C9036a.convertToJetpackResponse$lambda$6(bVar, obj);
                }
            });
            final c cVar = c.f59194a;
            Object objCollect = streamFilter.map(new Function() { // from class: iy0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ly0.C9036a.convertToJetpackResponse$lambda$7(cVar, obj);
                }
            }).collect(Collectors.toList());
            md8.checkNotNullExpressionValue(objCollect, "frameworkResponse.create…lect(Collectors.toList())");
            List list = (List) objCollect;
            RemoteEntry remoteCreateEntry = beginCreateCredentialResponse.getRemoteCreateEntry();
            if (remoteCreateEntry != null) {
                lyd.C9039b c9039b = lyd.f59259b;
                Slice slice = remoteCreateEntry.getSlice();
                md8.checkNotNullExpressionValue(slice, "it.slice");
                lydVarFromSlice = c9039b.fromSlice(slice);
            } else {
                lydVarFromSlice = null;
            }
            return new ox0(list, lydVarFromSlice);
        }

        private C9036a() {
        }
    }
}
