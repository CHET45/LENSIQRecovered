package p000;

import p000.emc;
import p000.fmc;

/* JADX INFO: loaded from: classes6.dex */
public class iud implements yja {

    /* JADX INFO: renamed from: a */
    public emc f48511a = null;

    /* JADX INFO: renamed from: iud$a */
    public static class C7627a implements ovi {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fmc.InterfaceC5891a f48512a;

        public C7627a(fmc.InterfaceC5891a interfaceC5891a) {
            this.f48512a = interfaceC5891a;
        }

        @Override // p000.ovi
        public void onBuffer(byte[] bArr, int i, int i2) {
            this.f48512a.onRecordBuffer(bArr, i, i2);
        }

        @Override // p000.ovi
        public void onDecibel(int i) {
            this.f48512a.onDecibel(i);
        }

        @Override // p000.ovi
        public void onError(vxf vxfVar) {
            this.f48512a.onError((wxf) vxfVar);
        }

        @Override // p000.ovi
        public void onRelease() {
            this.f48512a.onRecordReleased();
        }

        @Override // p000.ovi
        public void onStart(boolean z) {
            this.f48512a.onRecordStarted(z);
        }
    }

    /* JADX INFO: renamed from: iud$b */
    public static class C7628b {

        /* JADX INFO: renamed from: a */
        public int f48513a = 1;

        /* JADX INFO: renamed from: b */
        public int f48514b = 16000;

        /* JADX INFO: renamed from: c */
        public short f48515c = 1;

        /* JADX INFO: renamed from: d */
        public int f48516d = 2;

        /* JADX INFO: renamed from: e */
        public int f48517e = 0;

        /* JADX INFO: renamed from: f */
        public zk3 f48518f;
    }

    /* JADX INFO: renamed from: iud$c */
    public static class C7629c {

        /* JADX INFO: renamed from: a */
        public static iud f48519a = new iud();

        private C7629c() {
        }
    }

    /* JADX INFO: renamed from: iud$d */
    public static class C7630d extends C7628b {

        /* JADX INFO: renamed from: iud$d$a */
        public static class a extends C7628b {
            public C7630d build() {
                return new C7630d(this, null);
            }

            public a channel(short s) {
                this.f48515c = s;
                return this;
            }

            public a format(int i) {
                this.f48516d = i;
                return this;
            }

            public a listener(zk3 zk3Var) {
                this.f48518f = zk3Var;
                return this;
            }

            public a rate(int i) {
                this.f48514b = i;
                return this;
            }

            public a size(int i) {
                this.f48517e = i;
                return this;
            }

            public a source(int i) {
                this.f48513a = i;
                return this;
            }
        }

        private C7630d(a aVar) {
            this.f48513a = aVar.f48513a;
            this.f48514b = aVar.f48514b;
            this.f48515c = aVar.f48515c;
            this.f48516d = aVar.f48516d;
            this.f48517e = aVar.f48517e;
            this.f48518f = aVar.f48518f;
        }

        public static a builder() {
            return new a();
        }

        public short getChannel() {
            return this.f48515c;
        }

        public int getFormat() {
            return this.f48516d;
        }

        public zk3 getListener() {
            return this.f48518f;
        }

        public int getRate() {
            return this.f48514b;
        }

        public int getSize() {
            return this.f48517e;
        }

        public int getSource() {
            return this.f48513a;
        }

        public /* synthetic */ C7630d(a aVar, C7627a c7627a) {
            this(aVar);
        }
    }

    public static C7630d genFrom(emc.C5394d c5394d) {
        return C7630d.builder().source(c5394d.getAudioSource()).rate(c5394d.getRate()).channel(c5394d.getChannel()).format(c5394d.getAudioFormat()).size(c5394d.getBufferSize()).listener(c5394d.getDecibelListener()).build();
    }

    public static iud getInst() {
        return C7629c.f48519a;
    }

    private void release() {
        emc emcVar = this.f48511a;
        if (emcVar != null) {
            emcVar.stopRecord(true);
            this.f48511a.releaseRecord();
            this.f48511a = null;
        }
    }

    public void init(C7630d c7630d, ovi oviVar) {
        if (this.f48511a == null) {
            this.f48511a = new emc(c7630d, oviVar);
        }
    }

    public void stop() {
        release();
    }

    public static ovi genFrom(fmc.InterfaceC5891a interfaceC5891a) {
        return new C7627a(interfaceC5891a);
    }
}
