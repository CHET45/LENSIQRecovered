package p000;

import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.util.List;
import p000.ak0;
import p000.bk0;
import p000.c15;
import p000.ck0;
import p000.dk0;
import p000.ek0;
import p000.fk0;
import p000.gk0;
import p000.hk0;
import p000.ik0;
import p000.jk0;
import p000.kk0;
import p000.lk0;
import p000.mk0;
import p000.nj0;
import p000.nk0;
import p000.pj0;
import p000.qj0;
import p000.rj0;
import p000.sj0;
import p000.tj0;
import p000.uj0;
import p000.vj0;
import p000.wj0;
import p000.xj0;
import p000.yj0;
import p000.zj0;

/* JADX INFO: loaded from: classes5.dex */
@c15
@AutoValue
public abstract class z33 {

    /* JADX INFO: renamed from: a */
    public static final Charset f103951a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: z33$a */
    @AutoValue
    public static abstract class AbstractC15960a {

        /* JADX INFO: renamed from: z33$a$a */
        @AutoValue
        public static abstract class a {

            /* JADX INFO: renamed from: z33$a$a$a, reason: collision with other inner class name */
            @AutoValue.Builder
            public static abstract class AbstractC16565a {
                @efb
                public abstract a build();

                @efb
                public abstract AbstractC16565a setArch(@efb String str);

                @efb
                public abstract AbstractC16565a setBuildId(@efb String str);

                @efb
                public abstract AbstractC16565a setLibraryName(@efb String str);
            }

            @efb
            public static AbstractC16565a builder() {
                return new qj0.C11489b();
            }

            @efb
            public abstract String getArch();

            @efb
            public abstract String getBuildId();

            @efb
            public abstract String getLibraryName();
        }

        /* JADX INFO: renamed from: z33$a$b */
        @AutoValue.Builder
        public static abstract class b {
            @efb
            public abstract AbstractC15960a build();

            @efb
            public abstract b setBuildIdMappingForArch(@hib List<a> list);

            @efb
            public abstract b setImportance(@efb int i);

            @efb
            public abstract b setPid(@efb int i);

            @efb
            public abstract b setProcessName(@efb String str);

            @efb
            public abstract b setPss(@efb long j);

            @efb
            public abstract b setReasonCode(@efb int i);

            @efb
            public abstract b setRss(@efb long j);

            @efb
            public abstract b setTimestamp(@efb long j);

            @efb
            public abstract b setTraceFile(@hib String str);
        }

        @efb
        public static b builder() {
            return new pj0.C10980b();
        }

        @hib
        public abstract List<a> getBuildIdMappingForArch();

        @efb
        public abstract int getImportance();

        @efb
        public abstract int getPid();

        @efb
        public abstract String getProcessName();

        @efb
        public abstract long getPss();

        @efb
        public abstract int getReasonCode();

        @efb
        public abstract long getRss();

        @efb
        public abstract long getTimestamp();

        @hib
        public abstract String getTraceFile();
    }

    /* JADX INFO: renamed from: z33$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15961b {

        /* JADX INFO: renamed from: q */
        public static final int f103952q = 5;

        /* JADX INFO: renamed from: r */
        public static final int f103953r = 6;

        /* JADX INFO: renamed from: s */
        public static final int f103954s = 9;

        /* JADX INFO: renamed from: t */
        public static final int f103955t = 0;

        /* JADX INFO: renamed from: u */
        public static final int f103956u = 1;

        /* JADX INFO: renamed from: v */
        public static final int f103957v = 7;
    }

    /* JADX INFO: renamed from: z33$c */
    @AutoValue.Builder
    public static abstract class AbstractC15962c {
        @efb
        public abstract z33 build();

        @efb
        public abstract AbstractC15962c setAppExitInfo(AbstractC15960a abstractC15960a);

        @efb
        public abstract AbstractC15962c setAppQualitySessionId(@hib String str);

        @efb
        public abstract AbstractC15962c setBuildVersion(@efb String str);

        @efb
        public abstract AbstractC15962c setDisplayVersion(@efb String str);

        @efb
        public abstract AbstractC15962c setFirebaseAuthenticationToken(@hib String str);

        @efb
        public abstract AbstractC15962c setFirebaseInstallationId(@hib String str);

        @efb
        public abstract AbstractC15962c setGmpAppId(@efb String str);

        @efb
        public abstract AbstractC15962c setInstallationUuid(@efb String str);

        @efb
        public abstract AbstractC15962c setNdkPayload(AbstractC15964e abstractC15964e);

        @efb
        public abstract AbstractC15962c setPlatform(int i);

        @efb
        public abstract AbstractC15962c setSdkVersion(@efb String str);

        @efb
        public abstract AbstractC15962c setSession(@efb AbstractC15965f abstractC15965f);
    }

    /* JADX INFO: renamed from: z33$d */
    @AutoValue
    public static abstract class AbstractC15963d {

        /* JADX INFO: renamed from: z33$d$a */
        @AutoValue.Builder
        public static abstract class a {
            @efb
            public abstract AbstractC15963d build();

            @efb
            public abstract a setKey(@efb String str);

            @efb
            public abstract a setValue(@efb String str);
        }

        @efb
        public static a builder() {
            return new rj0.C12110b();
        }

        @efb
        public abstract String getKey();

        @efb
        public abstract String getValue();
    }

    /* JADX INFO: renamed from: z33$e */
    @AutoValue
    public static abstract class AbstractC15964e {

        /* JADX INFO: renamed from: z33$e$a */
        @AutoValue.Builder
        public static abstract class a {
            public abstract AbstractC15964e build();

            public abstract a setFiles(List<b> list);

            public abstract a setOrgId(String str);
        }

        /* JADX INFO: renamed from: z33$e$b */
        @AutoValue
        public static abstract class b {

            /* JADX INFO: renamed from: z33$e$b$a */
            @AutoValue.Builder
            public static abstract class a {
                public abstract b build();

                public abstract a setContents(byte[] bArr);

                public abstract a setFilename(String str);
            }

            @efb
            public static a builder() {
                return new tj0.C13068b();
            }

            @efb
            public abstract byte[] getContents();

            @efb
            public abstract String getFilename();
        }

        @efb
        public static a builder() {
            return new sj0.C12609b();
        }

        /* JADX INFO: renamed from: a */
        public abstract a mo22023a();

        @efb
        public abstract List<b> getFiles();

        @hib
        public abstract String getOrgId();
    }

    /* JADX INFO: renamed from: z33$f */
    @AutoValue
    public static abstract class AbstractC15965f {

        /* JADX INFO: renamed from: z33$f$a */
        @AutoValue
        public static abstract class a {

            /* JADX INFO: renamed from: z33$f$a$a, reason: collision with other inner class name */
            @AutoValue.Builder
            public static abstract class AbstractC16566a {
                @efb
                public abstract a build();

                @efb
                public abstract AbstractC16566a setDevelopmentPlatform(@hib String str);

                @efb
                public abstract AbstractC16566a setDevelopmentPlatformVersion(@hib String str);

                @efb
                public abstract AbstractC16566a setDisplayVersion(@efb String str);

                @efb
                public abstract AbstractC16566a setIdentifier(@efb String str);

                @efb
                public abstract AbstractC16566a setInstallationUuid(@efb String str);

                @efb
                public abstract AbstractC16566a setOrganization(@efb b bVar);

                @efb
                public abstract AbstractC16566a setVersion(@efb String str);
            }

            /* JADX INFO: renamed from: z33$f$a$b */
            @AutoValue
            public static abstract class b {

                /* JADX INFO: renamed from: z33$f$a$b$a, reason: collision with other inner class name */
                @AutoValue.Builder
                public static abstract class AbstractC16567a {
                    @efb
                    public abstract b build();

                    @efb
                    public abstract AbstractC16567a setClsId(@efb String str);
                }

                @efb
                public static AbstractC16567a builder() {
                    return new wj0.C14632b();
                }

                @efb
                /* JADX INFO: renamed from: a */
                public abstract AbstractC16567a mo24588a();

                @efb
                public abstract String getClsId();
            }

            @efb
            public static AbstractC16566a builder() {
                return new vj0.C14102b();
            }

            @efb
            /* JADX INFO: renamed from: a */
            public abstract AbstractC16566a mo24012a();

            @efb
            /* JADX INFO: renamed from: b */
            public a m26553b(@efb String str) {
                b organization = getOrganization();
                return mo24012a().setOrganization((organization != null ? organization.mo24588a() : b.builder()).setClsId(str).build()).build();
            }

            @hib
            public abstract String getDevelopmentPlatform();

            @hib
            public abstract String getDevelopmentPlatformVersion();

            @hib
            public abstract String getDisplayVersion();

            @efb
            public abstract String getIdentifier();

            @hib
            public abstract String getInstallationUuid();

            @hib
            public abstract b getOrganization();

            @efb
            public abstract String getVersion();
        }

        /* JADX INFO: renamed from: z33$f$b */
        @AutoValue.Builder
        public static abstract class b {
            @efb
            public abstract AbstractC15965f build();

            @efb
            public abstract b setApp(@efb a aVar);

            @efb
            public abstract b setAppQualitySessionId(@hib String str);

            @efb
            public abstract b setCrashed(boolean z);

            @efb
            public abstract b setDevice(@efb c cVar);

            @efb
            public abstract b setEndedAt(@efb Long l);

            @efb
            public abstract b setEvents(@efb List<d> list);

            @efb
            public abstract b setGenerator(@efb String str);

            @efb
            public abstract b setGeneratorType(int i);

            @efb
            public abstract b setIdentifier(@efb String str);

            @efb
            public b setIdentifierFromUtf8Bytes(@efb byte[] bArr) {
                return setIdentifier(new String(bArr, z33.f103951a));
            }

            @efb
            public abstract b setOs(@efb e eVar);

            @efb
            public abstract b setStartedAt(long j);

            @efb
            public abstract b setUser(@efb f fVar);
        }

        /* JADX INFO: renamed from: z33$f$c */
        @AutoValue
        public static abstract class c {

            /* JADX INFO: renamed from: z33$f$c$a */
            @AutoValue.Builder
            public static abstract class a {
                @efb
                public abstract c build();

                @efb
                public abstract a setArch(int i);

                @efb
                public abstract a setCores(int i);

                @efb
                public abstract a setDiskSpace(long j);

                @efb
                public abstract a setManufacturer(@efb String str);

                @efb
                public abstract a setModel(@efb String str);

                @efb
                public abstract a setModelClass(@efb String str);

                @efb
                public abstract a setRam(long j);

                @efb
                public abstract a setSimulator(boolean z);

                @efb
                public abstract a setState(int i);
            }

            @efb
            public static a builder() {
                return new xj0.C15147b();
            }

            @efb
            public abstract int getArch();

            public abstract int getCores();

            public abstract long getDiskSpace();

            @efb
            public abstract String getManufacturer();

            @efb
            public abstract String getModel();

            @efb
            public abstract String getModelClass();

            public abstract long getRam();

            public abstract int getState();

            public abstract boolean isSimulator();
        }

        /* JADX INFO: renamed from: z33$f$d */
        @AutoValue
        public static abstract class d {

            /* JADX INFO: renamed from: z33$f$d$a */
            @AutoValue
            public static abstract class a {

                /* JADX INFO: renamed from: z33$f$d$a$a, reason: collision with other inner class name */
                @AutoValue.Builder
                public static abstract class AbstractC16568a {
                    @efb
                    public abstract a build();

                    @efb
                    public abstract AbstractC16568a setAppProcessDetails(@hib List<c> list);

                    @efb
                    public abstract AbstractC16568a setBackground(@hib Boolean bool);

                    @efb
                    public abstract AbstractC16568a setCurrentProcessDetails(@hib c cVar);

                    @efb
                    public abstract AbstractC16568a setCustomAttributes(@efb List<AbstractC15963d> list);

                    @efb
                    public abstract AbstractC16568a setExecution(@efb b bVar);

                    @efb
                    public abstract AbstractC16568a setInternalKeys(@efb List<AbstractC15963d> list);

                    @efb
                    public abstract AbstractC16568a setUiOrientation(int i);
                }

                /* JADX INFO: renamed from: z33$f$d$a$b */
                @AutoValue
                public static abstract class b {

                    /* JADX INFO: renamed from: z33$f$d$a$b$a, reason: collision with other inner class name */
                    @AutoValue
                    public static abstract class AbstractC16569a {

                        /* JADX INFO: renamed from: z33$f$d$a$b$a$a, reason: collision with other inner class name */
                        @AutoValue.Builder
                        public static abstract class AbstractC16570a {
                            @efb
                            public abstract AbstractC16569a build();

                            @efb
                            public abstract AbstractC16570a setBaseAddress(long j);

                            @efb
                            public abstract AbstractC16570a setName(@efb String str);

                            @efb
                            public abstract AbstractC16570a setSize(long j);

                            @efb
                            public abstract AbstractC16570a setUuid(@hib String str);

                            @efb
                            public AbstractC16570a setUuidFromUtf8Bytes(@efb byte[] bArr) {
                                return setUuid(new String(bArr, z33.f103951a));
                            }
                        }

                        @efb
                        public static AbstractC16570a builder() {
                            return new bk0.C1924b();
                        }

                        @efb
                        public abstract long getBaseAddress();

                        @efb
                        public abstract String getName();

                        public abstract long getSize();

                        @hib
                        @c15.InterfaceC2148b
                        public abstract String getUuid();

                        @hib
                        @c15.InterfaceC2147a(name = "uuid")
                        public byte[] getUuidUtf8Bytes() {
                            String uuid = getUuid();
                            if (uuid != null) {
                                return uuid.getBytes(z33.f103951a);
                            }
                            return null;
                        }
                    }

                    /* JADX INFO: renamed from: z33$f$d$a$b$b, reason: collision with other inner class name */
                    @AutoValue.Builder
                    public static abstract class AbstractC16571b {
                        @efb
                        public abstract b build();

                        @efb
                        public abstract AbstractC16571b setAppExitInfo(@efb AbstractC15960a abstractC15960a);

                        @efb
                        public abstract AbstractC16571b setBinaries(@efb List<AbstractC16569a> list);

                        @efb
                        public abstract AbstractC16571b setException(@efb c cVar);

                        @efb
                        public abstract AbstractC16571b setSignal(@efb AbstractC16573d abstractC16573d);

                        @efb
                        public abstract AbstractC16571b setThreads(@efb List<e> list);
                    }

                    /* JADX INFO: renamed from: z33$f$d$a$b$c */
                    @AutoValue
                    public static abstract class c {

                        /* JADX INFO: renamed from: z33$f$d$a$b$c$a, reason: collision with other inner class name */
                        @AutoValue.Builder
                        public static abstract class AbstractC16572a {
                            @efb
                            public abstract c build();

                            @efb
                            public abstract AbstractC16572a setCausedBy(@efb c cVar);

                            @efb
                            public abstract AbstractC16572a setFrames(@efb List<e.AbstractC16576b> list);

                            @efb
                            public abstract AbstractC16572a setOverflowCount(int i);

                            @efb
                            public abstract AbstractC16572a setReason(@efb String str);

                            @efb
                            public abstract AbstractC16572a setType(@efb String str);
                        }

                        @efb
                        public static AbstractC16572a builder() {
                            return new ck0.C2339b();
                        }

                        @hib
                        public abstract c getCausedBy();

                        @efb
                        public abstract List<e.AbstractC16576b> getFrames();

                        public abstract int getOverflowCount();

                        @hib
                        public abstract String getReason();

                        @efb
                        public abstract String getType();
                    }

                    /* JADX INFO: renamed from: z33$f$d$a$b$d, reason: collision with other inner class name */
                    @AutoValue
                    public static abstract class AbstractC16573d {

                        /* JADX INFO: renamed from: z33$f$d$a$b$d$a, reason: collision with other inner class name */
                        @AutoValue.Builder
                        public static abstract class AbstractC16574a {
                            @efb
                            public abstract AbstractC16573d build();

                            @efb
                            public abstract AbstractC16574a setAddress(long j);

                            @efb
                            public abstract AbstractC16574a setCode(@efb String str);

                            @efb
                            public abstract AbstractC16574a setName(@efb String str);
                        }

                        @efb
                        public static AbstractC16574a builder() {
                            return new dk0.C4828b();
                        }

                        @efb
                        public abstract long getAddress();

                        @efb
                        public abstract String getCode();

                        @efb
                        public abstract String getName();
                    }

                    /* JADX INFO: renamed from: z33$f$d$a$b$e */
                    @AutoValue
                    public static abstract class e {

                        /* JADX INFO: renamed from: z33$f$d$a$b$e$a, reason: collision with other inner class name */
                        @AutoValue.Builder
                        public static abstract class AbstractC16575a {
                            @efb
                            public abstract e build();

                            @efb
                            public abstract AbstractC16575a setFrames(@efb List<AbstractC16576b> list);

                            @efb
                            public abstract AbstractC16575a setImportance(int i);

                            @efb
                            public abstract AbstractC16575a setName(@efb String str);
                        }

                        /* JADX INFO: renamed from: z33$f$d$a$b$e$b, reason: collision with other inner class name */
                        @AutoValue
                        public static abstract class AbstractC16576b {

                            /* JADX INFO: renamed from: z33$f$d$a$b$e$b$a, reason: collision with other inner class name */
                            @AutoValue.Builder
                            public static abstract class AbstractC16577a {
                                @efb
                                public abstract AbstractC16576b build();

                                @efb
                                public abstract AbstractC16577a setFile(@efb String str);

                                @efb
                                public abstract AbstractC16577a setImportance(int i);

                                @efb
                                public abstract AbstractC16577a setOffset(long j);

                                @efb
                                public abstract AbstractC16577a setPc(long j);

                                @efb
                                public abstract AbstractC16577a setSymbol(@efb String str);
                            }

                            @efb
                            public static AbstractC16577a builder() {
                                return new fk0.C5860b();
                            }

                            @hib
                            public abstract String getFile();

                            public abstract int getImportance();

                            public abstract long getOffset();

                            public abstract long getPc();

                            @efb
                            public abstract String getSymbol();
                        }

                        @efb
                        public static AbstractC16575a builder() {
                            return new ek0.C5352b();
                        }

                        @efb
                        public abstract List<AbstractC16576b> getFrames();

                        public abstract int getImportance();

                        @efb
                        public abstract String getName();
                    }

                    @efb
                    public static AbstractC16571b builder() {
                        return new ak0.C0296b();
                    }

                    @hib
                    public abstract AbstractC15960a getAppExitInfo();

                    @efb
                    public abstract List<AbstractC16569a> getBinaries();

                    @hib
                    public abstract c getException();

                    @efb
                    public abstract AbstractC16573d getSignal();

                    @hib
                    public abstract List<e> getThreads();
                }

                /* JADX INFO: renamed from: z33$f$d$a$c */
                @AutoValue
                public static abstract class c {

                    /* JADX INFO: renamed from: z33$f$d$a$c$a, reason: collision with other inner class name */
                    @AutoValue.Builder
                    public static abstract class AbstractC16578a {
                        @efb
                        public abstract c build();

                        @efb
                        public abstract AbstractC16578a setDefaultProcess(boolean z);

                        @efb
                        public abstract AbstractC16578a setImportance(int i);

                        @efb
                        public abstract AbstractC16578a setPid(int i);

                        @efb
                        public abstract AbstractC16578a setProcessName(@efb String str);
                    }

                    @efb
                    public static AbstractC16578a builder() {
                        return new gk0.C6347b();
                    }

                    public abstract int getImportance();

                    public abstract int getPid();

                    @efb
                    public abstract String getProcessName();

                    public abstract boolean isDefaultProcess();
                }

                @efb
                public static AbstractC16568a builder() {
                    return new zj0.C16157b();
                }

                @hib
                public abstract List<c> getAppProcessDetails();

                @hib
                public abstract Boolean getBackground();

                @hib
                public abstract c getCurrentProcessDetails();

                @hib
                public abstract List<AbstractC15963d> getCustomAttributes();

                @efb
                public abstract b getExecution();

                @hib
                public abstract List<AbstractC15963d> getInternalKeys();

                public abstract int getUiOrientation();

                @efb
                public abstract AbstractC16568a toBuilder();
            }

            /* JADX INFO: renamed from: z33$f$d$b */
            @AutoValue.Builder
            public static abstract class b {
                @efb
                public abstract d build();

                @efb
                public abstract b setApp(@efb a aVar);

                @efb
                public abstract b setDevice(@efb c cVar);

                @efb
                public abstract b setLog(@efb AbstractC16579d abstractC16579d);

                @efb
                public abstract b setRollouts(@efb f fVar);

                @efb
                public abstract b setTimestamp(long j);

                @efb
                public abstract b setType(@efb String str);
            }

            /* JADX INFO: renamed from: z33$f$d$c */
            @AutoValue
            public static abstract class c {

                /* JADX INFO: renamed from: z33$f$d$c$a */
                @AutoValue.Builder
                public static abstract class a {
                    @efb
                    public abstract c build();

                    @efb
                    public abstract a setBatteryLevel(Double d);

                    @efb
                    public abstract a setBatteryVelocity(int i);

                    @efb
                    public abstract a setDiskUsed(long j);

                    @efb
                    public abstract a setOrientation(int i);

                    @efb
                    public abstract a setProximityOn(boolean z);

                    @efb
                    public abstract a setRamUsed(long j);
                }

                @efb
                public static a builder() {
                    return new hk0.C6877b();
                }

                @hib
                public abstract Double getBatteryLevel();

                public abstract int getBatteryVelocity();

                public abstract long getDiskUsed();

                public abstract int getOrientation();

                public abstract long getRamUsed();

                public abstract boolean isProximityOn();
            }

            /* JADX INFO: renamed from: z33$f$d$d, reason: collision with other inner class name */
            @AutoValue
            public static abstract class AbstractC16579d {

                /* JADX INFO: renamed from: z33$f$d$d$a */
                @AutoValue.Builder
                public static abstract class a {
                    @efb
                    public abstract AbstractC16579d build();

                    @efb
                    public abstract a setContent(@efb String str);
                }

                @efb
                public static a builder() {
                    return new ik0.C7325b();
                }

                @efb
                public abstract String getContent();
            }

            /* JADX INFO: renamed from: z33$f$d$e */
            @AutoValue
            public static abstract class e {

                /* JADX INFO: renamed from: z33$f$d$e$a */
                @AutoValue.Builder
                public static abstract class a {
                    @efb
                    public abstract e build();

                    @efb
                    public abstract a setParameterKey(@efb String str);

                    @efb
                    public abstract a setParameterValue(@efb String str);

                    @efb
                    public abstract a setRolloutVariant(@efb b bVar);

                    @efb
                    public abstract a setTemplateVersion(@efb long j);
                }

                /* JADX INFO: renamed from: z33$f$d$e$b */
                @AutoValue
                public static abstract class b {

                    /* JADX INFO: renamed from: z33$f$d$e$b$a */
                    @AutoValue.Builder
                    public static abstract class a {
                        @efb
                        public abstract b build();

                        @efb
                        public abstract a setRolloutId(@efb String str);

                        @efb
                        public abstract a setVariantId(@efb String str);
                    }

                    public static a builder() {
                        return new kk0.C8401b();
                    }

                    @efb
                    public abstract String getRolloutId();

                    @efb
                    public abstract String getVariantId();
                }

                @efb
                public static a builder() {
                    return new jk0.C7925b();
                }

                @efb
                public abstract String getParameterKey();

                @efb
                public abstract String getParameterValue();

                @efb
                public abstract b getRolloutVariant();

                @efb
                public abstract long getTemplateVersion();
            }

            /* JADX INFO: renamed from: z33$f$d$f */
            @AutoValue
            public static abstract class f {

                /* JADX INFO: renamed from: z33$f$d$f$a */
                @AutoValue.Builder
                public static abstract class a {
                    @efb
                    public abstract f build();

                    @efb
                    public abstract a setRolloutAssignments(@efb List<e> list);
                }

                @efb
                public static a builder() {
                    return new lk0.C8842b();
                }

                @efb
                @c15.InterfaceC2147a(name = "assignments")
                public abstract List<e> getRolloutAssignments();
            }

            @efb
            public static b builder() {
                return new yj0.C15689b();
            }

            @efb
            public abstract a getApp();

            @efb
            public abstract c getDevice();

            @hib
            public abstract AbstractC16579d getLog();

            @hib
            public abstract f getRollouts();

            public abstract long getTimestamp();

            @efb
            public abstract String getType();

            @efb
            public abstract b toBuilder();
        }

        /* JADX INFO: renamed from: z33$f$e */
        @AutoValue
        public static abstract class e {

            /* JADX INFO: renamed from: z33$f$e$a */
            @AutoValue.Builder
            public static abstract class a {
                @efb
                public abstract e build();

                @efb
                public abstract a setBuildVersion(@efb String str);

                @efb
                public abstract a setJailbroken(boolean z);

                @efb
                public abstract a setPlatform(int i);

                @efb
                public abstract a setVersion(@efb String str);
            }

            @efb
            public static a builder() {
                return new mk0.C9377b();
            }

            @efb
            public abstract String getBuildVersion();

            public abstract int getPlatform();

            @efb
            public abstract String getVersion();

            public abstract boolean isJailbroken();
        }

        /* JADX INFO: renamed from: z33$f$f */
        @AutoValue
        public static abstract class f {

            /* JADX INFO: renamed from: z33$f$f$a */
            @AutoValue.Builder
            public static abstract class a {
                @efb
                public abstract f build();

                @efb
                public abstract a setIdentifier(@efb String str);
            }

            @efb
            public static a builder() {
                return new nk0.C9912b();
            }

            @efb
            public abstract String getIdentifier();
        }

        @efb
        public static b builder() {
            return new uj0.C13548b().setCrashed(false);
        }

        @efb
        /* JADX INFO: renamed from: a */
        public AbstractC15965f m26549a(@hib String str) {
            return toBuilder().setAppQualitySessionId(str).build();
        }

        @efb
        /* JADX INFO: renamed from: b */
        public AbstractC15965f m26550b(@efb List<d> list) {
            return toBuilder().setEvents(list).build();
        }

        @efb
        /* JADX INFO: renamed from: c */
        public AbstractC15965f m26551c(@efb String str) {
            return toBuilder().setApp(getApp().m26553b(str)).build();
        }

        @efb
        /* JADX INFO: renamed from: d */
        public AbstractC15965f m26552d(long j, boolean z, @hib String str) {
            b builder = toBuilder();
            builder.setEndedAt(Long.valueOf(j));
            builder.setCrashed(z);
            if (str != null) {
                builder.setUser(f.builder().setIdentifier(str).build());
            }
            return builder.build();
        }

        @efb
        public abstract a getApp();

        @hib
        public abstract String getAppQualitySessionId();

        @hib
        public abstract c getDevice();

        @hib
        public abstract Long getEndedAt();

        @hib
        public abstract List<d> getEvents();

        @efb
        public abstract String getGenerator();

        public abstract int getGeneratorType();

        @efb
        @c15.InterfaceC2148b
        public abstract String getIdentifier();

        @efb
        @c15.InterfaceC2147a(name = "identifier")
        public byte[] getIdentifierUtf8Bytes() {
            return getIdentifier().getBytes(z33.f103951a);
        }

        @hib
        public abstract e getOs();

        public abstract long getStartedAt();

        @hib
        public abstract f getUser();

        public abstract boolean isCrashed();

        @efb
        public abstract b toBuilder();
    }

    /* JADX INFO: renamed from: z33$g */
    public enum EnumC15966g {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    @efb
    public static AbstractC15962c builder() {
        return new nj0.C9901b();
    }

    @efb
    /* JADX INFO: renamed from: b */
    public abstract AbstractC15962c mo17972b();

    @hib
    public abstract AbstractC15960a getAppExitInfo();

    @hib
    public abstract String getAppQualitySessionId();

    @efb
    public abstract String getBuildVersion();

    @efb
    public abstract String getDisplayVersion();

    @hib
    public abstract String getFirebaseAuthenticationToken();

    @hib
    public abstract String getFirebaseInstallationId();

    @efb
    public abstract String getGmpAppId();

    @efb
    public abstract String getInstallationUuid();

    @hib
    public abstract AbstractC15964e getNdkPayload();

    public abstract int getPlatform();

    @efb
    public abstract String getSdkVersion();

    @hib
    public abstract AbstractC15965f getSession();

    @c15.InterfaceC2148b
    public EnumC15966g getType() {
        return getSession() != null ? EnumC15966g.JAVA : getNdkPayload() != null ? EnumC15966g.NATIVE : EnumC15966g.INCOMPLETE;
    }

    @efb
    public z33 withAppQualitySessionId(@hib String str) {
        AbstractC15962c appQualitySessionId = mo17972b().setAppQualitySessionId(str);
        if (getSession() != null) {
            appQualitySessionId.setSession(getSession().m26549a(str));
        }
        return appQualitySessionId.build();
    }

    @efb
    public z33 withApplicationExitInfo(AbstractC15960a abstractC15960a) {
        return abstractC15960a == null ? this : mo17972b().setAppExitInfo(abstractC15960a).build();
    }

    @efb
    public z33 withEvents(@efb List<AbstractC15965f.d> list) {
        if (getSession() != null) {
            return mo17972b().setSession(getSession().m26550b(list)).build();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @efb
    public z33 withFirebaseAuthenticationToken(@hib String str) {
        return mo17972b().setFirebaseAuthenticationToken(str).build();
    }

    @efb
    public z33 withFirebaseInstallationId(@hib String str) {
        return mo17972b().setFirebaseInstallationId(str).build();
    }

    @efb
    public z33 withNdkPayload(@efb AbstractC15964e abstractC15964e) {
        return mo17972b().setSession(null).setNdkPayload(abstractC15964e).build();
    }

    @efb
    public z33 withOrganizationId(@efb String str) {
        AbstractC15962c abstractC15962cMo17972b = mo17972b();
        AbstractC15964e ndkPayload = getNdkPayload();
        if (ndkPayload != null) {
            abstractC15962cMo17972b.setNdkPayload(ndkPayload.mo22023a().setOrgId(str).build());
        }
        AbstractC15965f session = getSession();
        if (session != null) {
            abstractC15962cMo17972b.setSession(session.m26551c(str));
        }
        return abstractC15962cMo17972b.build();
    }

    @efb
    public z33 withSessionEndFields(long j, boolean z, @hib String str) {
        AbstractC15962c abstractC15962cMo17972b = mo17972b();
        if (getSession() != null) {
            abstractC15962cMo17972b.setSession(getSession().m26552d(j, z, str));
        }
        return abstractC15962cMo17972b.build();
    }
}
