package p000;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.Action;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CredentialEntry;
import android.service.credentials.RemoteEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p000.C12942t7;
import p000.bi0;
import p000.c01;
import p000.lyd;
import p000.o63;
import p000.p7e;
import p000.py0;

/* JADX INFO: loaded from: classes3.dex */
@c5e(34)
@p7e({p7e.EnumC10826a.f69935b})
public final class c01 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C2135a f15399a = new C2135a(null);

    /* JADX INFO: renamed from: c01$a */
    @dwf({"SMAP\nBeginGetCredentialUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginGetCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginGetCredentialUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1855#2,2:179\n1855#2,2:181\n1855#2,2:183\n1855#2,2:185\n1#3:187\n*S KotlinDebug\n*F\n+ 1 BeginGetCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginGetCredentialUtil$Companion\n*L\n43#1:179,2\n86#1:181,2\n99#1:183,2\n112#1:185,2\n*E\n"})
    public static final class C2135a {

        /* JADX INFO: renamed from: c01$a$a */
        public static final class a extends tt8 implements qy6<py0, BeginGetCredentialOption> {

            /* JADX INFO: renamed from: a */
            public static final a f15400a = new a();

            public a() {
                super(1);
            }

            @Override // p000.qy6
            public final BeginGetCredentialOption invoke(py0 py0Var) {
                C2135a c2135a = c01.f15399a;
                md8.checkNotNullExpressionValue(py0Var, "option");
                return c2135a.convertToJetpackBeginOption(py0Var);
            }
        }

        /* JADX INFO: renamed from: c01$a$b */
        public static final class b extends tt8 implements qy6<CredentialEntry, o63> {

            /* JADX INFO: renamed from: a */
            public static final b f15401a = new b();

            public b() {
                super(1);
            }

            @gib
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final o63 invoke2(CredentialEntry credentialEntry) {
                o63.C10204a c10204a = o63.f66532c;
                Slice slice = credentialEntry.getSlice();
                md8.checkNotNullExpressionValue(slice, "entry.slice");
                return c10204a.createFrom$credentials_release(slice);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ o63 invoke(CredentialEntry credentialEntry) {
                return invoke2(d01.m8805a(credentialEntry));
            }
        }

        /* JADX INFO: renamed from: c01$a$c */
        public static final class c extends tt8 implements qy6<o63, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final c f15402a = new c();

            public c() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@gib o63 o63Var) {
                return Boolean.valueOf(o63Var != null);
            }
        }

        /* JADX INFO: renamed from: c01$a$d */
        public static final class d extends tt8 implements qy6<o63, o63> {

            /* JADX INFO: renamed from: a */
            public static final d f15403a = new d();

            public d() {
                super(1);
            }

            @Override // p000.qy6
            public final o63 invoke(@gib o63 o63Var) {
                md8.checkNotNull(o63Var);
                return o63Var;
            }
        }

        /* JADX INFO: renamed from: c01$a$e */
        public static final class e extends tt8 implements qy6<Action, C12942t7> {

            /* JADX INFO: renamed from: a */
            public static final e f15404a = new e();

            public e() {
                super(1);
            }

            @gib
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final C12942t7 invoke2(Action action) {
                C12942t7.b bVar = C12942t7.f83906d;
                Slice slice = action.getSlice();
                md8.checkNotNullExpressionValue(slice, "entry.slice");
                return bVar.fromSlice(slice);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ C12942t7 invoke(Action action) {
                return invoke2(g01.m11280a(action));
            }
        }

        /* JADX INFO: renamed from: c01$a$f */
        public static final class f extends tt8 implements qy6<C12942t7, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final f f15405a = new f();

            public f() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@gib C12942t7 c12942t7) {
                return Boolean.valueOf(c12942t7 != null);
            }
        }

        /* JADX INFO: renamed from: c01$a$g */
        public static final class g extends tt8 implements qy6<C12942t7, C12942t7> {

            /* JADX INFO: renamed from: a */
            public static final g f15406a = new g();

            public g() {
                super(1);
            }

            @Override // p000.qy6
            public final C12942t7 invoke(@gib C12942t7 c12942t7) {
                md8.checkNotNull(c12942t7);
                return c12942t7;
            }
        }

        /* JADX INFO: renamed from: c01$a$h */
        public static final class h extends tt8 implements qy6<Action, bi0> {

            /* JADX INFO: renamed from: a */
            public static final h f15407a = new h();

            public h() {
                super(1);
            }

            @gib
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final bi0 invoke2(Action action) {
                bi0.C1907b c1907b = bi0.f13770c;
                Slice slice = action.getSlice();
                md8.checkNotNullExpressionValue(slice, "entry.slice");
                return c1907b.fromSlice(slice);
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bi0 invoke(Action action) {
                return invoke2(g01.m11280a(action));
            }
        }

        /* JADX INFO: renamed from: c01$a$i */
        public static final class i extends tt8 implements qy6<bi0, Boolean> {

            /* JADX INFO: renamed from: a */
            public static final i f15408a = new i();

            public i() {
                super(1);
            }

            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@gib bi0 bi0Var) {
                return Boolean.valueOf(bi0Var != null);
            }
        }

        /* JADX INFO: renamed from: c01$a$j */
        public static final class j extends tt8 implements qy6<bi0, bi0> {

            /* JADX INFO: renamed from: a */
            public static final j f15409a = new j();

            public j() {
                super(1);
            }

            @Override // p000.qy6
            public final bi0 invoke(@gib bi0 bi0Var) {
                md8.checkNotNull(bi0Var);
                return bi0Var;
            }
        }

        public /* synthetic */ C2135a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BeginGetCredentialOption convertToFrameworkRequest$lambda$5(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return mz0.m17671a(qy6Var.invoke(obj));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BeginGetCredentialOption convertToJetpackBeginOption(py0 py0Var) {
            hz0.m12666a();
            return ez0.m10378a(py0Var.getId(), py0Var.getType(), py0Var.getCandidateQueryData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$10(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return ((Boolean) qy6Var.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C12942t7 convertToJetpackResponse$lambda$11(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return (C12942t7) qy6Var.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bi0 convertToJetpackResponse$lambda$12(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return (bi0) qy6Var.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$13(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return ((Boolean) qy6Var.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bi0 convertToJetpackResponse$lambda$14(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return (bi0) qy6Var.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o63 convertToJetpackResponse$lambda$6(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return (o63) qy6Var.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convertToJetpackResponse$lambda$7(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return ((Boolean) qy6Var.invoke(obj)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o63 convertToJetpackResponse$lambda$8(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return (o63) qy6Var.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C12942t7 convertToJetpackResponse$lambda$9(qy6 qy6Var, Object obj) {
            md8.checkNotNullParameter(qy6Var, "$tmp0");
            return (C12942t7) qy6Var.invoke(obj);
        }

        private final void populateActionEntries(BeginGetCredentialResponse.Builder builder, List<C12942t7> list) {
            for (C12942t7 c12942t7 : list) {
                cz0.m8795a();
                builder.addAction(bz0.m3496a(C12942t7.f83906d.toSlice(c12942t7)));
            }
        }

        private final void populateAuthenticationEntries(BeginGetCredentialResponse.Builder builder, List<bi0> list) {
            for (bi0 bi0Var : list) {
                cz0.m8795a();
                builder.addAuthenticationAction(bz0.m3496a(bi0.f13770c.toSlice(bi0Var)));
            }
        }

        private final void populateCredentialEntries(BeginGetCredentialResponse.Builder builder, List<? extends o63> list) {
            for (o63 o63Var : list) {
                Slice slice$credentials_release = o63.f66532c.toSlice$credentials_release(o63Var);
                if (slice$credentials_release != null) {
                    gz0.m12043a();
                    hz0.m12666a();
                    builder.addCredentialEntry(fz0.m11235a(ez0.m10378a(o63Var.getBeginGetCredentialOption().getId(), o63Var.getType(), Bundle.EMPTY), slice$credentials_release));
                }
            }
        }

        @igg({"MissingPermission"})
        private final void populateRemoteEntry(BeginGetCredentialResponse.Builder builder, lyd lydVar) {
            if (lydVar == null) {
                return;
            }
            qx0.m20702a();
            builder.setRemoteCredentialEntry(fy0.m11232a(lyd.f59259b.toSlice(lydVar)));
        }

        @yfb
        public final BeginGetCredentialRequest convertToFrameworkRequest(@yfb qy0 qy0Var) {
            md8.checkNotNullParameter(qy0Var, "request");
            BeginGetCredentialRequest.Builder builderM14387a = jz0.m14387a();
            if (qy0Var.getCallingAppInfo() != null) {
                tx0.m22900a();
                builderM14387a.setCallingAppInfo(rx0.m21596a(qy0Var.getCallingAppInfo().getPackageName(), qy0Var.getCallingAppInfo().getSigningInfo(), qy0Var.getCallingAppInfo().getOrigin()));
            }
            Stream<py0> stream = qy0Var.getBeginGetCredentialOptions().stream();
            final a aVar = a.f15400a;
            BeginGetCredentialRequest beginGetCredentialRequestBuild = builderM14387a.setBeginGetCredentialOptions((List) stream.map(new Function() { // from class: b01
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c01.C2135a.convertToFrameworkRequest$lambda$5(aVar, obj);
                }
            }).collect(Collectors.toList())).build();
            md8.checkNotNullExpressionValue(beginGetCredentialRequestBuild, "builder.setBeginGetCrede…\n                .build()");
            return beginGetCredentialRequestBuild;
        }

        @yfb
        public final BeginGetCredentialResponse convertToFrameworkResponse(@yfb ry0 ry0Var) {
            md8.checkNotNullParameter(ry0Var, "response");
            BeginGetCredentialResponse.Builder builderM13567a = iz0.m13567a();
            populateCredentialEntries(builderM13567a, ry0Var.getCredentialEntries());
            populateActionEntries(builderM13567a, ry0Var.getActions());
            populateAuthenticationEntries(builderM13567a, ry0Var.getAuthenticationActions());
            populateRemoteEntry(builderM13567a, ry0Var.getRemoteEntry());
            BeginGetCredentialResponse beginGetCredentialResponseBuild = builderM13567a.build();
            md8.checkNotNullExpressionValue(beginGetCredentialResponseBuild, "frameworkBuilder.build()");
            return beginGetCredentialResponseBuild;
        }

        @do8
        @yfb
        public final qy0 convertToJetpackRequest$credentials_release(@yfb BeginGetCredentialRequest beginGetCredentialRequest) {
            so1 so1Var;
            md8.checkNotNullParameter(beginGetCredentialRequest, "request");
            ArrayList arrayList = new ArrayList();
            List beginGetCredentialOptions = beginGetCredentialRequest.getBeginGetCredentialOptions();
            md8.checkNotNullExpressionValue(beginGetCredentialOptions, "request.beginGetCredentialOptions");
            Iterator it = beginGetCredentialOptions.iterator();
            while (it.hasNext()) {
                BeginGetCredentialOption beginGetCredentialOptionM17671a = mz0.m17671a(it.next());
                py0.C11179a c11179a = py0.f72475d;
                String id = beginGetCredentialOptionM17671a.getId();
                md8.checkNotNullExpressionValue(id, "it.id");
                String type = beginGetCredentialOptionM17671a.getType();
                md8.checkNotNullExpressionValue(type, "it.type");
                Bundle candidateQueryData = beginGetCredentialOptionM17671a.getCandidateQueryData();
                md8.checkNotNullExpressionValue(candidateQueryData, "it.candidateQueryData");
                arrayList.add(c11179a.createFrom$credentials_release(id, type, candidateQueryData));
            }
            CallingAppInfo callingAppInfo = beginGetCredentialRequest.getCallingAppInfo();
            if (callingAppInfo != null) {
                String packageName = callingAppInfo.getPackageName();
                md8.checkNotNullExpressionValue(packageName, "it.packageName");
                SigningInfo signingInfo = callingAppInfo.getSigningInfo();
                md8.checkNotNullExpressionValue(signingInfo, "it.signingInfo");
                so1Var = new so1(packageName, signingInfo, callingAppInfo.getOrigin());
            } else {
                so1Var = null;
            }
            return new qy0(arrayList, so1Var);
        }

        @yfb
        public final ry0 convertToJetpackResponse(@yfb BeginGetCredentialResponse beginGetCredentialResponse) {
            lyd lydVarFromSlice;
            md8.checkNotNullParameter(beginGetCredentialResponse, "response");
            Stream stream = beginGetCredentialResponse.getCredentialEntries().stream();
            final b bVar = b.f15401a;
            Stream map = stream.map(new Function() { // from class: uz0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c01.C2135a.convertToJetpackResponse$lambda$6(bVar, obj);
                }
            });
            final c cVar = c.f15402a;
            Stream streamFilter = map.filter(new Predicate() { // from class: vz0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return c01.C2135a.convertToJetpackResponse$lambda$7(cVar, obj);
                }
            });
            final d dVar = d.f15403a;
            Object objCollect = streamFilter.map(new Function() { // from class: wz0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c01.C2135a.convertToJetpackResponse$lambda$8(dVar, obj);
                }
            }).collect(Collectors.toList());
            md8.checkNotNullExpressionValue(objCollect, "response.credentialEntri…lect(Collectors.toList())");
            List list = (List) objCollect;
            Stream stream2 = beginGetCredentialResponse.getActions().stream();
            final e eVar = e.f15404a;
            Stream map2 = stream2.map(new Function() { // from class: xz0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c01.C2135a.convertToJetpackResponse$lambda$9(eVar, obj);
                }
            });
            final f fVar = f.f15405a;
            Stream streamFilter2 = map2.filter(new Predicate() { // from class: yz0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return c01.C2135a.convertToJetpackResponse$lambda$10(fVar, obj);
                }
            });
            final g gVar = g.f15406a;
            Object objCollect2 = streamFilter2.map(new Function() { // from class: zz0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c01.C2135a.convertToJetpackResponse$lambda$11(gVar, obj);
                }
            }).collect(Collectors.toList());
            md8.checkNotNullExpressionValue(objCollect2, "response.actions.stream(…lect(Collectors.toList())");
            List list2 = (List) objCollect2;
            Stream stream3 = beginGetCredentialResponse.getAuthenticationActions().stream();
            final h hVar = h.f15407a;
            Stream map3 = stream3.map(new Function() { // from class: a01
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c01.C2135a.convertToJetpackResponse$lambda$12(hVar, obj);
                }
            });
            final i iVar = i.f15408a;
            Stream streamFilter3 = map3.filter(new Predicate() { // from class: sz0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return c01.C2135a.convertToJetpackResponse$lambda$13(iVar, obj);
                }
            });
            final j jVar = j.f15409a;
            Object objCollect3 = streamFilter3.map(new Function() { // from class: tz0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c01.C2135a.convertToJetpackResponse$lambda$14(jVar, obj);
                }
            }).collect(Collectors.toList());
            md8.checkNotNullExpressionValue(objCollect3, "response.authenticationA…lect(Collectors.toList())");
            List list3 = (List) objCollect3;
            RemoteEntry remoteCredentialEntry = beginGetCredentialResponse.getRemoteCredentialEntry();
            if (remoteCredentialEntry != null) {
                lyd.C9039b c9039b = lyd.f59259b;
                Slice slice = remoteCredentialEntry.getSlice();
                md8.checkNotNullExpressionValue(slice, "it.slice");
                lydVarFromSlice = c9039b.fromSlice(slice);
            } else {
                lydVarFromSlice = null;
            }
            return new ry0(list, list2, list3, lydVarFromSlice);
        }

        private C2135a() {
        }
    }
}
