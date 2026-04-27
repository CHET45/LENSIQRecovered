package p000;

import com.jieli.jl_bt_ota.impl.AbstractC3831a;

/* JADX INFO: loaded from: classes6.dex */
public class jqd implements gq7 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3831a f51486a;

    /* JADX INFO: renamed from: jqd$a */
    public class C8022a implements xp7<cng> {
        public C8022a() {
        }

        @Override // p000.xp7
        public int hasResult(ob2 ob2Var) {
            return 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.xp7
        public cng handleResult(ob2 ob2Var) {
            if (ob2Var instanceof c57) {
                return (cng) ((c57) ob2Var).getResponse();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: jqd$b */
    public class C8023b implements xp7<String> {
        public C8023b() {
        }

        @Override // p000.xp7
        public int hasResult(ob2 ob2Var) {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.xp7
        public String handleResult(ob2 ob2Var) {
            return !(ob2Var instanceof e47) ? "" : ((g47) ((e47) ob2Var).getResponse()).getMd5();
        }
    }

    /* JADX INFO: renamed from: jqd$c */
    public class C8024c implements xp7<Integer> {
        public C8024c() {
        }

        @Override // p000.xp7
        public int hasResult(ob2 ob2Var) {
            return 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.xp7
        public Integer handleResult(ob2 ob2Var) {
            if (ob2Var instanceof qhb) {
                return Integer.valueOf(((thb) ((qhb) ob2Var).getResponse()).getFlag());
            }
            return 7;
        }
    }

    /* JADX INFO: renamed from: jqd$d */
    public class C8025d implements xp7<at5> {
        public C8025d() {
        }

        @Override // p000.xp7
        public int hasResult(ob2 ob2Var) {
            return 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.xp7
        public at5 handleResult(ob2 ob2Var) {
            if (!(ob2Var instanceof y57)) {
                return new at5(0, 0);
            }
            kwh kwhVar = (kwh) ((y57) ob2Var).getResponse();
            return new at5(kwhVar.getUpdateFileFlagOffset(), kwhVar.getUpdateFileFlagLen());
        }
    }

    /* JADX INFO: renamed from: jqd$e */
    public class C8026e implements xp7<Integer> {
        public C8026e() {
        }

        @Override // p000.xp7
        public int hasResult(ob2 ob2Var) {
            return 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.xp7
        public Integer handleResult(ob2 ob2Var) {
            if (ob2Var instanceof k48) {
                return Integer.valueOf(((m48) ((k48) ob2Var).getResponse()).getCanUpdateFlag());
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: jqd$f */
    public class C8027f implements xp7<Integer> {
        public C8027f() {
        }

        @Override // p000.xp7
        public int hasResult(ob2 ob2Var) {
            return 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.xp7
        public Integer handleResult(ob2 ob2Var) {
            if (ob2Var instanceof h35) {
                return Integer.valueOf(((i35) ((h35) ob2Var).getResponse()).getCanUpdateFlag());
            }
            return 7;
        }
    }

    /* JADX INFO: renamed from: jqd$g */
    public class C8028g implements xp7<Integer> {
        public C8028g() {
        }

        @Override // p000.xp7
        public int hasResult(ob2 ob2Var) {
            return 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.xp7
        public Integer handleResult(ob2 ob2Var) {
            if (ob2Var instanceof u95) {
                return Integer.valueOf(((v95) ((u95) ob2Var).getResponse()).getResult());
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: jqd$h */
    public class C8029h implements xp7<Integer> {
        public C8029h() {
        }

        @Override // p000.xp7
        public int hasResult(ob2 ob2Var) {
            return 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.xp7
        public Integer handleResult(ob2 ob2Var) {
            if (ob2Var instanceof j16) {
                return Integer.valueOf(((k16) ((j16) ob2Var).getResponse()).getResult());
            }
            return 1;
        }
    }

    public jqd(AbstractC3831a abstractC3831a) {
        if (abstractC3831a == null) {
            throw new NullPointerException("BluetoothOTAManager can not be null.");
        }
        this.f51486a = abstractC3831a;
    }

    @Override // p000.gq7
    public void changeCommunicationWay(int i, int i2, lp7<Integer> lp7Var) {
        this.f51486a.sendCommandAsync(new qhb(new shb(i, i2)), new o62("changeCommunicationWay", lp7Var, new C8024c()));
    }

    @Override // p000.gq7
    public void enterUpdateMode(lp7<Integer> lp7Var) {
        this.f51486a.sendCommandAsync(new h35(), new o62("enterUpdateMode", lp7Var, new C8027f()));
    }

    @Override // p000.gq7
    public void exitUpdateMode(lp7<Integer> lp7Var) {
        this.f51486a.sendCommandAsync(new u95(), new o62("exitUpdateMode", lp7Var, new C8028g()));
    }

    @Override // p000.gq7
    public void getDeviceInfo(lp7<cng> lp7Var) {
        this.f51486a.sendCommandAsync(pb2.buildGetTargetInfoCmdForAll(), new o62("getDeviceInfo", lp7Var, new C8022a()));
    }

    @Override // p000.gq7
    public void getMD5(lp7<String> lp7Var) {
        this.f51486a.sendCommandAsync(new e47(), new o62("getMD5", lp7Var, new C8023b()));
    }

    @Override // p000.gq7
    public void inquiryDeviceCanOTA(byte[] bArr, lp7<Integer> lp7Var) {
        this.f51486a.sendCommandAsync(new k48(new l48(bArr)), new o62("inquiryDeviceCanOTA", lp7Var, new C8026e()));
    }

    @Override // p000.gq7
    public void queryUpdateResult(lp7<Integer> lp7Var) {
        this.f51486a.sendCommandAsync(new j16(), new o62("queryUpdateResult", lp7Var, new C8029h()));
    }

    @Override // p000.gq7
    public void readUpgradeFileFlag(lp7<at5> lp7Var) {
        this.f51486a.sendCommandAsync(new y57(), new o62("readUpgradeFileFlag", lp7Var, new C8025d()));
    }

    @Override // p000.gq7
    public void rebootDevice(lp7<Boolean> lp7Var) {
        this.f51486a.sendCommandAsync(new dsd(new esd(0)), new n62("rebootDevice", lp7Var));
    }

    @Override // p000.gq7
    public void stopADVInfo(lp7<Boolean> lp7Var) {
        this.f51486a.sendCommandAsync(pb2.buildStopDeviceNotifyADVInfoCmd(), new n62("stopADVInfo", lp7Var));
    }
}
