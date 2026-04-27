package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import java.io.IOException;
import p000.ymh;
import p000.z33;

/* JADX INFO: loaded from: classes5.dex */
public final class xi0 implements tq2 {

    /* JADX INFO: renamed from: a */
    public static final int f97909a = 2;

    /* JADX INFO: renamed from: b */
    public static final tq2 f97910b = new xi0();

    /* JADX INFO: renamed from: xi0$a */
    public static final class C15112a implements tjb<z33.AbstractC15960a.a> {

        /* JADX INFO: renamed from: a */
        public static final C15112a f97911a = new C15112a();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97912b = ar5.m2545of("arch");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97913c = ar5.m2545of("libraryName");

        /* JADX INFO: renamed from: d */
        public static final ar5 f97914d = ar5.m2545of("buildId");

        private C15112a() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15960a.a aVar, ujb ujbVar) throws IOException {
            ujbVar.add(f97912b, aVar.getArch());
            ujbVar.add(f97913c, aVar.getLibraryName());
            ujbVar.add(f97914d, aVar.getBuildId());
        }
    }

    /* JADX INFO: renamed from: xi0$b */
    public static final class C15113b implements tjb<z33.AbstractC15960a> {

        /* JADX INFO: renamed from: a */
        public static final C15113b f97915a = new C15113b();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97916b = ar5.m2545of("pid");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97917c = ar5.m2545of("processName");

        /* JADX INFO: renamed from: d */
        public static final ar5 f97918d = ar5.m2545of("reasonCode");

        /* JADX INFO: renamed from: e */
        public static final ar5 f97919e = ar5.m2545of("importance");

        /* JADX INFO: renamed from: f */
        public static final ar5 f97920f = ar5.m2545of("pss");

        /* JADX INFO: renamed from: g */
        public static final ar5 f97921g = ar5.m2545of("rss");

        /* JADX INFO: renamed from: h */
        public static final ar5 f97922h = ar5.m2545of("timestamp");

        /* JADX INFO: renamed from: i */
        public static final ar5 f97923i = ar5.m2545of("traceFile");

        /* JADX INFO: renamed from: j */
        public static final ar5 f97924j = ar5.m2545of("buildIdMappingForArch");

        private C15113b() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15960a abstractC15960a, ujb ujbVar) throws IOException {
            ujbVar.add(f97916b, abstractC15960a.getPid());
            ujbVar.add(f97917c, abstractC15960a.getProcessName());
            ujbVar.add(f97918d, abstractC15960a.getReasonCode());
            ujbVar.add(f97919e, abstractC15960a.getImportance());
            ujbVar.add(f97920f, abstractC15960a.getPss());
            ujbVar.add(f97921g, abstractC15960a.getRss());
            ujbVar.add(f97922h, abstractC15960a.getTimestamp());
            ujbVar.add(f97923i, abstractC15960a.getTraceFile());
            ujbVar.add(f97924j, abstractC15960a.getBuildIdMappingForArch());
        }
    }

    /* JADX INFO: renamed from: xi0$c */
    public static final class C15114c implements tjb<z33.AbstractC15963d> {

        /* JADX INFO: renamed from: a */
        public static final C15114c f97925a = new C15114c();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97926b = ar5.m2545of("key");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97927c = ar5.m2545of("value");

        private C15114c() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15963d abstractC15963d, ujb ujbVar) throws IOException {
            ujbVar.add(f97926b, abstractC15963d.getKey());
            ujbVar.add(f97927c, abstractC15963d.getValue());
        }
    }

    /* JADX INFO: renamed from: xi0$d */
    public static final class C15115d implements tjb<z33> {

        /* JADX INFO: renamed from: a */
        public static final C15115d f97928a = new C15115d();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97929b = ar5.m2545of("sdkVersion");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97930c = ar5.m2545of("gmpAppId");

        /* JADX INFO: renamed from: d */
        public static final ar5 f97931d = ar5.m2545of("platform");

        /* JADX INFO: renamed from: e */
        public static final ar5 f97932e = ar5.m2545of("installationUuid");

        /* JADX INFO: renamed from: f */
        public static final ar5 f97933f = ar5.m2545of("firebaseInstallationId");

        /* JADX INFO: renamed from: g */
        public static final ar5 f97934g = ar5.m2545of("firebaseAuthenticationToken");

        /* JADX INFO: renamed from: h */
        public static final ar5 f97935h = ar5.m2545of("appQualitySessionId");

        /* JADX INFO: renamed from: i */
        public static final ar5 f97936i = ar5.m2545of("buildVersion");

        /* JADX INFO: renamed from: j */
        public static final ar5 f97937j = ar5.m2545of("displayVersion");

        /* JADX INFO: renamed from: k */
        public static final ar5 f97938k = ar5.m2545of(i7f.f45937b);

        /* JADX INFO: renamed from: l */
        public static final ar5 f97939l = ar5.m2545of("ndkPayload");

        /* JADX INFO: renamed from: m */
        public static final ar5 f97940m = ar5.m2545of("appExitInfo");

        private C15115d() {
        }

        @Override // p000.l15
        public void encode(z33 z33Var, ujb ujbVar) throws IOException {
            ujbVar.add(f97929b, z33Var.getSdkVersion());
            ujbVar.add(f97930c, z33Var.getGmpAppId());
            ujbVar.add(f97931d, z33Var.getPlatform());
            ujbVar.add(f97932e, z33Var.getInstallationUuid());
            ujbVar.add(f97933f, z33Var.getFirebaseInstallationId());
            ujbVar.add(f97934g, z33Var.getFirebaseAuthenticationToken());
            ujbVar.add(f97935h, z33Var.getAppQualitySessionId());
            ujbVar.add(f97936i, z33Var.getBuildVersion());
            ujbVar.add(f97937j, z33Var.getDisplayVersion());
            ujbVar.add(f97938k, z33Var.getSession());
            ujbVar.add(f97939l, z33Var.getNdkPayload());
            ujbVar.add(f97940m, z33Var.getAppExitInfo());
        }
    }

    /* JADX INFO: renamed from: xi0$e */
    public static final class C15116e implements tjb<z33.AbstractC15964e> {

        /* JADX INFO: renamed from: a */
        public static final C15116e f97941a = new C15116e();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97942b = ar5.m2545of("files");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97943c = ar5.m2545of("orgId");

        private C15116e() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15964e abstractC15964e, ujb ujbVar) throws IOException {
            ujbVar.add(f97942b, abstractC15964e.getFiles());
            ujbVar.add(f97943c, abstractC15964e.getOrgId());
        }
    }

    /* JADX INFO: renamed from: xi0$f */
    public static final class C15117f implements tjb<z33.AbstractC15964e.b> {

        /* JADX INFO: renamed from: a */
        public static final C15117f f97944a = new C15117f();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97945b = ar5.m2545of(MediaInformation.KEY_FILENAME);

        /* JADX INFO: renamed from: c */
        public static final ar5 f97946c = ar5.m2545of("contents");

        private C15117f() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15964e.b bVar, ujb ujbVar) throws IOException {
            ujbVar.add(f97945b, bVar.getFilename());
            ujbVar.add(f97946c, bVar.getContents());
        }
    }

    /* JADX INFO: renamed from: xi0$g */
    public static final class C15118g implements tjb<z33.AbstractC15965f.a> {

        /* JADX INFO: renamed from: a */
        public static final C15118g f97947a = new C15118g();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97948b = ar5.m2545of("identifier");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97949c = ar5.m2545of("version");

        /* JADX INFO: renamed from: d */
        public static final ar5 f97950d = ar5.m2545of("displayVersion");

        /* JADX INFO: renamed from: e */
        public static final ar5 f97951e = ar5.m2545of("organization");

        /* JADX INFO: renamed from: f */
        public static final ar5 f97952f = ar5.m2545of("installationUuid");

        /* JADX INFO: renamed from: g */
        public static final ar5 f97953g = ar5.m2545of("developmentPlatform");

        /* JADX INFO: renamed from: h */
        public static final ar5 f97954h = ar5.m2545of("developmentPlatformVersion");

        private C15118g() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.a aVar, ujb ujbVar) throws IOException {
            ujbVar.add(f97948b, aVar.getIdentifier());
            ujbVar.add(f97949c, aVar.getVersion());
            ujbVar.add(f97950d, aVar.getDisplayVersion());
            ujbVar.add(f97951e, aVar.getOrganization());
            ujbVar.add(f97952f, aVar.getInstallationUuid());
            ujbVar.add(f97953g, aVar.getDevelopmentPlatform());
            ujbVar.add(f97954h, aVar.getDevelopmentPlatformVersion());
        }
    }

    /* JADX INFO: renamed from: xi0$h */
    public static final class C15119h implements tjb<z33.AbstractC15965f.a.b> {

        /* JADX INFO: renamed from: a */
        public static final C15119h f97955a = new C15119h();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97956b = ar5.m2545of("clsId");

        private C15119h() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.a.b bVar, ujb ujbVar) throws IOException {
            ujbVar.add(f97956b, bVar.getClsId());
        }
    }

    /* JADX INFO: renamed from: xi0$i */
    public static final class C15120i implements tjb<z33.AbstractC15965f.c> {

        /* JADX INFO: renamed from: a */
        public static final C15120i f97957a = new C15120i();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97958b = ar5.m2545of("arch");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97959c = ar5.m2545of("model");

        /* JADX INFO: renamed from: d */
        public static final ar5 f97960d = ar5.m2545of("cores");

        /* JADX INFO: renamed from: e */
        public static final ar5 f97961e = ar5.m2545of("ram");

        /* JADX INFO: renamed from: f */
        public static final ar5 f97962f = ar5.m2545of("diskSpace");

        /* JADX INFO: renamed from: g */
        public static final ar5 f97963g = ar5.m2545of("simulator");

        /* JADX INFO: renamed from: h */
        public static final ar5 f97964h = ar5.m2545of("state");

        /* JADX INFO: renamed from: i */
        public static final ar5 f97965i = ar5.m2545of(xs1.f99121z);

        /* JADX INFO: renamed from: j */
        public static final ar5 f97966j = ar5.m2545of("modelClass");

        private C15120i() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.c cVar, ujb ujbVar) throws IOException {
            ujbVar.add(f97958b, cVar.getArch());
            ujbVar.add(f97959c, cVar.getModel());
            ujbVar.add(f97960d, cVar.getCores());
            ujbVar.add(f97961e, cVar.getRam());
            ujbVar.add(f97962f, cVar.getDiskSpace());
            ujbVar.add(f97963g, cVar.isSimulator());
            ujbVar.add(f97964h, cVar.getState());
            ujbVar.add(f97965i, cVar.getManufacturer());
            ujbVar.add(f97966j, cVar.getModelClass());
        }
    }

    /* JADX INFO: renamed from: xi0$j */
    public static final class C15121j implements tjb<z33.AbstractC15965f> {

        /* JADX INFO: renamed from: a */
        public static final C15121j f97967a = new C15121j();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97968b = ar5.m2545of("generator");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97969c = ar5.m2545of("identifier");

        /* JADX INFO: renamed from: d */
        public static final ar5 f97970d = ar5.m2545of("appQualitySessionId");

        /* JADX INFO: renamed from: e */
        public static final ar5 f97971e = ar5.m2545of("startedAt");

        /* JADX INFO: renamed from: f */
        public static final ar5 f97972f = ar5.m2545of("endedAt");

        /* JADX INFO: renamed from: g */
        public static final ar5 f97973g = ar5.m2545of("crashed");

        /* JADX INFO: renamed from: h */
        public static final ar5 f97974h = ar5.m2545of("app");

        /* JADX INFO: renamed from: i */
        public static final ar5 f97975i = ar5.m2545of("user");

        /* JADX INFO: renamed from: j */
        public static final ar5 f97976j = ar5.m2545of("os");

        /* JADX INFO: renamed from: k */
        public static final ar5 f97977k = ar5.m2545of(xs1.f99118w);

        /* JADX INFO: renamed from: l */
        public static final ar5 f97978l = ar5.m2545of("events");

        /* JADX INFO: renamed from: m */
        public static final ar5 f97979m = ar5.m2545of("generatorType");

        private C15121j() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f abstractC15965f, ujb ujbVar) throws IOException {
            ujbVar.add(f97968b, abstractC15965f.getGenerator());
            ujbVar.add(f97969c, abstractC15965f.getIdentifierUtf8Bytes());
            ujbVar.add(f97970d, abstractC15965f.getAppQualitySessionId());
            ujbVar.add(f97971e, abstractC15965f.getStartedAt());
            ujbVar.add(f97972f, abstractC15965f.getEndedAt());
            ujbVar.add(f97973g, abstractC15965f.isCrashed());
            ujbVar.add(f97974h, abstractC15965f.getApp());
            ujbVar.add(f97975i, abstractC15965f.getUser());
            ujbVar.add(f97976j, abstractC15965f.getOs());
            ujbVar.add(f97977k, abstractC15965f.getDevice());
            ujbVar.add(f97978l, abstractC15965f.getEvents());
            ujbVar.add(f97979m, abstractC15965f.getGeneratorType());
        }
    }

    /* JADX INFO: renamed from: xi0$k */
    public static final class C15122k implements tjb<z33.AbstractC15965f.d.a> {

        /* JADX INFO: renamed from: a */
        public static final C15122k f97980a = new C15122k();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97981b = ar5.m2545of("execution");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97982c = ar5.m2545of("customAttributes");

        /* JADX INFO: renamed from: d */
        public static final ar5 f97983d = ar5.m2545of("internalKeys");

        /* JADX INFO: renamed from: e */
        public static final ar5 f97984e = ar5.m2545of("background");

        /* JADX INFO: renamed from: f */
        public static final ar5 f97985f = ar5.m2545of("currentProcessDetails");

        /* JADX INFO: renamed from: g */
        public static final ar5 f97986g = ar5.m2545of("appProcessDetails");

        /* JADX INFO: renamed from: h */
        public static final ar5 f97987h = ar5.m2545of("uiOrientation");

        private C15122k() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.a aVar, ujb ujbVar) throws IOException {
            ujbVar.add(f97981b, aVar.getExecution());
            ujbVar.add(f97982c, aVar.getCustomAttributes());
            ujbVar.add(f97983d, aVar.getInternalKeys());
            ujbVar.add(f97984e, aVar.getBackground());
            ujbVar.add(f97985f, aVar.getCurrentProcessDetails());
            ujbVar.add(f97986g, aVar.getAppProcessDetails());
            ujbVar.add(f97987h, aVar.getUiOrientation());
        }
    }

    /* JADX INFO: renamed from: xi0$l */
    public static final class C15123l implements tjb<z33.AbstractC15965f.d.a.b.AbstractC16569a> {

        /* JADX INFO: renamed from: a */
        public static final C15123l f97988a = new C15123l();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97989b = ar5.m2545of("baseAddress");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97990c = ar5.m2545of(MediaInformation.KEY_SIZE);

        /* JADX INFO: renamed from: d */
        public static final ar5 f97991d = ar5.m2545of("name");

        /* JADX INFO: renamed from: e */
        public static final ar5 f97992e = ar5.m2545of("uuid");

        private C15123l() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.a.b.AbstractC16569a abstractC16569a, ujb ujbVar) throws IOException {
            ujbVar.add(f97989b, abstractC16569a.getBaseAddress());
            ujbVar.add(f97990c, abstractC16569a.getSize());
            ujbVar.add(f97991d, abstractC16569a.getName());
            ujbVar.add(f97992e, abstractC16569a.getUuidUtf8Bytes());
        }
    }

    /* JADX INFO: renamed from: xi0$m */
    public static final class C15124m implements tjb<z33.AbstractC15965f.d.a.b> {

        /* JADX INFO: renamed from: a */
        public static final C15124m f97993a = new C15124m();

        /* JADX INFO: renamed from: b */
        public static final ar5 f97994b = ar5.m2545of("threads");

        /* JADX INFO: renamed from: c */
        public static final ar5 f97995c = ar5.m2545of("exception");

        /* JADX INFO: renamed from: d */
        public static final ar5 f97996d = ar5.m2545of("appExitInfo");

        /* JADX INFO: renamed from: e */
        public static final ar5 f97997e = ar5.m2545of("signal");

        /* JADX INFO: renamed from: f */
        public static final ar5 f97998f = ar5.m2545of("binaries");

        private C15124m() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.a.b bVar, ujb ujbVar) throws IOException {
            ujbVar.add(f97994b, bVar.getThreads());
            ujbVar.add(f97995c, bVar.getException());
            ujbVar.add(f97996d, bVar.getAppExitInfo());
            ujbVar.add(f97997e, bVar.getSignal());
            ujbVar.add(f97998f, bVar.getBinaries());
        }
    }

    /* JADX INFO: renamed from: xi0$n */
    public static final class C15125n implements tjb<z33.AbstractC15965f.d.a.b.c> {

        /* JADX INFO: renamed from: a */
        public static final C15125n f97999a = new C15125n();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98000b = ar5.m2545of("type");

        /* JADX INFO: renamed from: c */
        public static final ar5 f98001c = ar5.m2545of("reason");

        /* JADX INFO: renamed from: d */
        public static final ar5 f98002d = ar5.m2545of("frames");

        /* JADX INFO: renamed from: e */
        public static final ar5 f98003e = ar5.m2545of("causedBy");

        /* JADX INFO: renamed from: f */
        public static final ar5 f98004f = ar5.m2545of("overflowCount");

        private C15125n() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.a.b.c cVar, ujb ujbVar) throws IOException {
            ujbVar.add(f98000b, cVar.getType());
            ujbVar.add(f98001c, cVar.getReason());
            ujbVar.add(f98002d, cVar.getFrames());
            ujbVar.add(f98003e, cVar.getCausedBy());
            ujbVar.add(f98004f, cVar.getOverflowCount());
        }
    }

    /* JADX INFO: renamed from: xi0$o */
    public static final class C15126o implements tjb<z33.AbstractC15965f.d.a.b.AbstractC16573d> {

        /* JADX INFO: renamed from: a */
        public static final C15126o f98005a = new C15126o();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98006b = ar5.m2545of("name");

        /* JADX INFO: renamed from: c */
        public static final ar5 f98007c = ar5.m2545of(g55.f38796e);

        /* JADX INFO: renamed from: d */
        public static final ar5 f98008d = ar5.m2545of("address");

        private C15126o() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.a.b.AbstractC16573d abstractC16573d, ujb ujbVar) throws IOException {
            ujbVar.add(f98006b, abstractC16573d.getName());
            ujbVar.add(f98007c, abstractC16573d.getCode());
            ujbVar.add(f98008d, abstractC16573d.getAddress());
        }
    }

    /* JADX INFO: renamed from: xi0$p */
    public static final class C15127p implements tjb<z33.AbstractC15965f.d.a.b.e> {

        /* JADX INFO: renamed from: a */
        public static final C15127p f98009a = new C15127p();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98010b = ar5.m2545of("name");

        /* JADX INFO: renamed from: c */
        public static final ar5 f98011c = ar5.m2545of("importance");

        /* JADX INFO: renamed from: d */
        public static final ar5 f98012d = ar5.m2545of("frames");

        private C15127p() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.a.b.e eVar, ujb ujbVar) throws IOException {
            ujbVar.add(f98010b, eVar.getName());
            ujbVar.add(f98011c, eVar.getImportance());
            ujbVar.add(f98012d, eVar.getFrames());
        }
    }

    /* JADX INFO: renamed from: xi0$q */
    public static final class C15128q implements tjb<z33.AbstractC15965f.d.a.b.e.AbstractC16576b> {

        /* JADX INFO: renamed from: a */
        public static final C15128q f98013a = new C15128q();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98014b = ar5.m2545of("pc");

        /* JADX INFO: renamed from: c */
        public static final ar5 f98015c = ar5.m2545of("symbol");

        /* JADX INFO: renamed from: d */
        public static final ar5 f98016d = ar5.m2545of("file");

        /* JADX INFO: renamed from: e */
        public static final ar5 f98017e = ar5.m2545of(ymh.InterfaceC15724c.f102156R);

        /* JADX INFO: renamed from: f */
        public static final ar5 f98018f = ar5.m2545of("importance");

        private C15128q() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.a.b.e.AbstractC16576b abstractC16576b, ujb ujbVar) throws IOException {
            ujbVar.add(f98014b, abstractC16576b.getPc());
            ujbVar.add(f98015c, abstractC16576b.getSymbol());
            ujbVar.add(f98016d, abstractC16576b.getFile());
            ujbVar.add(f98017e, abstractC16576b.getOffset());
            ujbVar.add(f98018f, abstractC16576b.getImportance());
        }
    }

    /* JADX INFO: renamed from: xi0$r */
    public static final class C15129r implements tjb<z33.AbstractC15965f.d.a.c> {

        /* JADX INFO: renamed from: a */
        public static final C15129r f98019a = new C15129r();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98020b = ar5.m2545of("processName");

        /* JADX INFO: renamed from: c */
        public static final ar5 f98021c = ar5.m2545of("pid");

        /* JADX INFO: renamed from: d */
        public static final ar5 f98022d = ar5.m2545of("importance");

        /* JADX INFO: renamed from: e */
        public static final ar5 f98023e = ar5.m2545of("defaultProcess");

        private C15129r() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.a.c cVar, ujb ujbVar) throws IOException {
            ujbVar.add(f98020b, cVar.getProcessName());
            ujbVar.add(f98021c, cVar.getPid());
            ujbVar.add(f98022d, cVar.getImportance());
            ujbVar.add(f98023e, cVar.isDefaultProcess());
        }
    }

    /* JADX INFO: renamed from: xi0$s */
    public static final class C15130s implements tjb<z33.AbstractC15965f.d.c> {

        /* JADX INFO: renamed from: a */
        public static final C15130s f98024a = new C15130s();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98025b = ar5.m2545of("batteryLevel");

        /* JADX INFO: renamed from: c */
        public static final ar5 f98026c = ar5.m2545of("batteryVelocity");

        /* JADX INFO: renamed from: d */
        public static final ar5 f98027d = ar5.m2545of("proximityOn");

        /* JADX INFO: renamed from: e */
        public static final ar5 f98028e = ar5.m2545of("orientation");

        /* JADX INFO: renamed from: f */
        public static final ar5 f98029f = ar5.m2545of("ramUsed");

        /* JADX INFO: renamed from: g */
        public static final ar5 f98030g = ar5.m2545of("diskUsed");

        private C15130s() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.c cVar, ujb ujbVar) throws IOException {
            ujbVar.add(f98025b, cVar.getBatteryLevel());
            ujbVar.add(f98026c, cVar.getBatteryVelocity());
            ujbVar.add(f98027d, cVar.isProximityOn());
            ujbVar.add(f98028e, cVar.getOrientation());
            ujbVar.add(f98029f, cVar.getRamUsed());
            ujbVar.add(f98030g, cVar.getDiskUsed());
        }
    }

    /* JADX INFO: renamed from: xi0$t */
    public static final class C15131t implements tjb<z33.AbstractC15965f.d> {

        /* JADX INFO: renamed from: a */
        public static final C15131t f98031a = new C15131t();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98032b = ar5.m2545of("timestamp");

        /* JADX INFO: renamed from: c */
        public static final ar5 f98033c = ar5.m2545of("type");

        /* JADX INFO: renamed from: d */
        public static final ar5 f98034d = ar5.m2545of("app");

        /* JADX INFO: renamed from: e */
        public static final ar5 f98035e = ar5.m2545of(xs1.f99118w);

        /* JADX INFO: renamed from: f */
        public static final ar5 f98036f = ar5.m2545of("log");

        /* JADX INFO: renamed from: g */
        public static final ar5 f98037g = ar5.m2545of("rollouts");

        private C15131t() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d dVar, ujb ujbVar) throws IOException {
            ujbVar.add(f98032b, dVar.getTimestamp());
            ujbVar.add(f98033c, dVar.getType());
            ujbVar.add(f98034d, dVar.getApp());
            ujbVar.add(f98035e, dVar.getDevice());
            ujbVar.add(f98036f, dVar.getLog());
            ujbVar.add(f98037g, dVar.getRollouts());
        }
    }

    /* JADX INFO: renamed from: xi0$u */
    public static final class C15132u implements tjb<z33.AbstractC15965f.d.AbstractC16579d> {

        /* JADX INFO: renamed from: a */
        public static final C15132u f98038a = new C15132u();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98039b = ar5.m2545of("content");

        private C15132u() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.AbstractC16579d abstractC16579d, ujb ujbVar) throws IOException {
            ujbVar.add(f98039b, abstractC16579d.getContent());
        }
    }

    /* JADX INFO: renamed from: xi0$v */
    public static final class C15133v implements tjb<z33.AbstractC15965f.d.e> {

        /* JADX INFO: renamed from: a */
        public static final C15133v f98040a = new C15133v();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98041b = ar5.m2545of("rolloutVariant");

        /* JADX INFO: renamed from: c */
        public static final ar5 f98042c = ar5.m2545of(nae.f63813c);

        /* JADX INFO: renamed from: d */
        public static final ar5 f98043d = ar5.m2545of(nae.f63814d);

        /* JADX INFO: renamed from: e */
        public static final ar5 f98044e = ar5.m2545of(nae.f63815e);

        private C15133v() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.e eVar, ujb ujbVar) throws IOException {
            ujbVar.add(f98041b, eVar.getRolloutVariant());
            ujbVar.add(f98042c, eVar.getParameterKey());
            ujbVar.add(f98043d, eVar.getParameterValue());
            ujbVar.add(f98044e, eVar.getTemplateVersion());
        }
    }

    /* JADX INFO: renamed from: xi0$w */
    public static final class C15134w implements tjb<z33.AbstractC15965f.d.e.b> {

        /* JADX INFO: renamed from: a */
        public static final C15134w f98045a = new C15134w();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98046b = ar5.m2545of(nae.f63811a);

        /* JADX INFO: renamed from: c */
        public static final ar5 f98047c = ar5.m2545of(nae.f63812b);

        private C15134w() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.e.b bVar, ujb ujbVar) throws IOException {
            ujbVar.add(f98046b, bVar.getRolloutId());
            ujbVar.add(f98047c, bVar.getVariantId());
        }
    }

    /* JADX INFO: renamed from: xi0$x */
    public static final class C15135x implements tjb<z33.AbstractC15965f.d.f> {

        /* JADX INFO: renamed from: a */
        public static final C15135x f98048a = new C15135x();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98049b = ar5.m2545of("assignments");

        private C15135x() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.d.f fVar, ujb ujbVar) throws IOException {
            ujbVar.add(f98049b, fVar.getRolloutAssignments());
        }
    }

    /* JADX INFO: renamed from: xi0$y */
    public static final class C15136y implements tjb<z33.AbstractC15965f.e> {

        /* JADX INFO: renamed from: a */
        public static final C15136y f98050a = new C15136y();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98051b = ar5.m2545of("platform");

        /* JADX INFO: renamed from: c */
        public static final ar5 f98052c = ar5.m2545of("version");

        /* JADX INFO: renamed from: d */
        public static final ar5 f98053d = ar5.m2545of("buildVersion");

        /* JADX INFO: renamed from: e */
        public static final ar5 f98054e = ar5.m2545of("jailbroken");

        private C15136y() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.e eVar, ujb ujbVar) throws IOException {
            ujbVar.add(f98051b, eVar.getPlatform());
            ujbVar.add(f98052c, eVar.getVersion());
            ujbVar.add(f98053d, eVar.getBuildVersion());
            ujbVar.add(f98054e, eVar.isJailbroken());
        }
    }

    /* JADX INFO: renamed from: xi0$z */
    public static final class C15137z implements tjb<z33.AbstractC15965f.f> {

        /* JADX INFO: renamed from: a */
        public static final C15137z f98055a = new C15137z();

        /* JADX INFO: renamed from: b */
        public static final ar5 f98056b = ar5.m2545of("identifier");

        private C15137z() {
        }

        @Override // p000.l15
        public void encode(z33.AbstractC15965f.f fVar, ujb ujbVar) throws IOException {
            ujbVar.add(f98056b, fVar.getIdentifier());
        }
    }

    private xi0() {
    }

    @Override // p000.tq2
    public void configure(o15<?> o15Var) {
        C15115d c15115d = C15115d.f97928a;
        o15Var.registerEncoder(z33.class, c15115d);
        o15Var.registerEncoder(nj0.class, c15115d);
        C15121j c15121j = C15121j.f97967a;
        o15Var.registerEncoder(z33.AbstractC15965f.class, c15121j);
        o15Var.registerEncoder(uj0.class, c15121j);
        C15118g c15118g = C15118g.f97947a;
        o15Var.registerEncoder(z33.AbstractC15965f.a.class, c15118g);
        o15Var.registerEncoder(vj0.class, c15118g);
        C15119h c15119h = C15119h.f97955a;
        o15Var.registerEncoder(z33.AbstractC15965f.a.b.class, c15119h);
        o15Var.registerEncoder(wj0.class, c15119h);
        C15137z c15137z = C15137z.f98055a;
        o15Var.registerEncoder(z33.AbstractC15965f.f.class, c15137z);
        o15Var.registerEncoder(nk0.class, c15137z);
        C15136y c15136y = C15136y.f98050a;
        o15Var.registerEncoder(z33.AbstractC15965f.e.class, c15136y);
        o15Var.registerEncoder(mk0.class, c15136y);
        C15120i c15120i = C15120i.f97957a;
        o15Var.registerEncoder(z33.AbstractC15965f.c.class, c15120i);
        o15Var.registerEncoder(xj0.class, c15120i);
        C15131t c15131t = C15131t.f98031a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.class, c15131t);
        o15Var.registerEncoder(yj0.class, c15131t);
        C15122k c15122k = C15122k.f97980a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.a.class, c15122k);
        o15Var.registerEncoder(zj0.class, c15122k);
        C15124m c15124m = C15124m.f97993a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.a.b.class, c15124m);
        o15Var.registerEncoder(ak0.class, c15124m);
        C15127p c15127p = C15127p.f98009a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.a.b.e.class, c15127p);
        o15Var.registerEncoder(ek0.class, c15127p);
        C15128q c15128q = C15128q.f98013a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.a.b.e.AbstractC16576b.class, c15128q);
        o15Var.registerEncoder(fk0.class, c15128q);
        C15125n c15125n = C15125n.f97999a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.a.b.c.class, c15125n);
        o15Var.registerEncoder(ck0.class, c15125n);
        C15113b c15113b = C15113b.f97915a;
        o15Var.registerEncoder(z33.AbstractC15960a.class, c15113b);
        o15Var.registerEncoder(pj0.class, c15113b);
        C15112a c15112a = C15112a.f97911a;
        o15Var.registerEncoder(z33.AbstractC15960a.a.class, c15112a);
        o15Var.registerEncoder(qj0.class, c15112a);
        C15126o c15126o = C15126o.f98005a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.a.b.AbstractC16573d.class, c15126o);
        o15Var.registerEncoder(dk0.class, c15126o);
        C15123l c15123l = C15123l.f97988a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.a.b.AbstractC16569a.class, c15123l);
        o15Var.registerEncoder(bk0.class, c15123l);
        C15114c c15114c = C15114c.f97925a;
        o15Var.registerEncoder(z33.AbstractC15963d.class, c15114c);
        o15Var.registerEncoder(rj0.class, c15114c);
        C15129r c15129r = C15129r.f98019a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.a.c.class, c15129r);
        o15Var.registerEncoder(gk0.class, c15129r);
        C15130s c15130s = C15130s.f98024a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.c.class, c15130s);
        o15Var.registerEncoder(hk0.class, c15130s);
        C15132u c15132u = C15132u.f98038a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.AbstractC16579d.class, c15132u);
        o15Var.registerEncoder(ik0.class, c15132u);
        C15135x c15135x = C15135x.f98048a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.f.class, c15135x);
        o15Var.registerEncoder(lk0.class, c15135x);
        C15133v c15133v = C15133v.f98040a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.e.class, c15133v);
        o15Var.registerEncoder(jk0.class, c15133v);
        C15134w c15134w = C15134w.f98045a;
        o15Var.registerEncoder(z33.AbstractC15965f.d.e.b.class, c15134w);
        o15Var.registerEncoder(kk0.class, c15134w);
        C15116e c15116e = C15116e.f97941a;
        o15Var.registerEncoder(z33.AbstractC15964e.class, c15116e);
        o15Var.registerEncoder(sj0.class, c15116e);
        C15117f c15117f = C15117f.f97944a;
        o15Var.registerEncoder(z33.AbstractC15964e.b.class, c15117f);
        o15Var.registerEncoder(tj0.class, c15117f);
    }
}
