package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.jieli.jl_bt_ota.impl.AbstractC3831a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class ig3 implements tp7 {

    /* JADX INFO: renamed from: e */
    public static final String f46750e = "DataHandler";

    /* JADX INFO: renamed from: a */
    public final AbstractC3831a f46751a;

    /* JADX INFO: renamed from: b */
    public final Handler f46752b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public HandlerThreadC7272d f46753c;

    /* JADX INFO: renamed from: d */
    public C7269a f46754d;

    /* JADX INFO: renamed from: ig3$a */
    public class C7269a extends Thread {

        /* JADX INFO: renamed from: a */
        public volatile boolean f46756a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f46757b;

        /* JADX INFO: renamed from: c */
        public ArrayList<xs0> f46758c;

        /* JADX INFO: renamed from: d */
        public final LinkedBlockingQueue<qg3> f46759d;

        /* JADX INFO: renamed from: e */
        public final List<qg3> f46760e;

        /* JADX INFO: renamed from: f */
        public final List<qg3> f46761f;

        /* JADX INFO: renamed from: m */
        public C7271c f46762m;

        /* JADX INFO: renamed from: ig3$a$a */
        public class a implements InterfaceC7270b {
            public a() {
            }

            @Override // p000.ig3.InterfaceC7270b
            public void onFinish(long j) {
                if (C7269a.this.f46762m == null || C7269a.this.f46762m.getId() != j) {
                    return;
                }
                C7269a.this.f46762m = null;
            }

            @Override // p000.ig3.InterfaceC7270b
            public void onStart(long j) {
            }
        }

        public C7269a() {
            super("DataHandlerThread");
            this.f46759d = new LinkedBlockingQueue<>();
            this.f46760e = Collections.synchronizedList(new ArrayList());
            this.f46761f = Collections.synchronizedList(new ArrayList());
        }

        /* JADX INFO: renamed from: b */
        private int m13029b(BluetoothDevice bluetoothDevice) {
            return ig3.this.f46751a.getReceiveMtu(bluetoothDevice);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (this.f46759d) {
                while (this.f46756a) {
                    if (this.f46759d.isEmpty()) {
                        this.f46757b = true;
                        m13033c();
                        dh8.m9151d(ig3.f46750e, "DataHandlerThread is waiting...");
                        try {
                            this.f46759d.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        this.f46757b = false;
                        m13034c(this.f46759d.poll());
                        m13033c();
                    }
                }
            }
            dh8.m9154e(ig3.f46750e, "-DataHandlerThread- exit...");
            this.f46760e.clear();
            this.f46761f.clear();
            this.f46759d.clear();
            this.f46756a = false;
            m13039e();
            ig3.this.f46754d = null;
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.f46756a = true;
            super.start();
            dh8.m9156i(ig3.f46750e, "DataHandlerThread start....");
        }

        public void stopThread() {
            dh8.m9160w(ig3.f46750e, "-stopThread-");
            this.f46756a = false;
            m13043f();
        }

        public void tryToAddRecvData(qg3 qg3Var) {
            dh8.m9151d(ig3.f46750e, "-tryToAddRecvData-  ret : " + m13028a(qg3Var) + ",isWaiting = " + this.f46757b);
        }

        public void tryToAddSendData(qg3 qg3Var) {
            dh8.m9151d(ig3.f46750e, "-tryToAddSendData-  ret : " + m13028a(qg3Var) + ",isWaiting = " + this.f46757b);
        }

        /* JADX INFO: renamed from: a */
        private void m13022a(int i) {
            C7271c c7271c = this.f46762m;
            if (c7271c == null) {
                C7271c c7271c2 = ig3.this.new C7271c(i, new a());
                this.f46762m = c7271c2;
                c7271c2.start();
            } else {
                if (c7271c.f46765b) {
                    return;
                }
                this.f46762m.f46765b = true;
            }
        }

        /* JADX INFO: renamed from: c */
        private void m13033c() {
            m13021a();
            qg3 qg3VarM13036d = m13036d();
            if (qg3VarM13036d != null) {
                m13041e(qg3VarM13036d);
                return;
            }
            if (this.f46761f.size() > 0) {
                m13022a(500);
            } else if (this.f46760e.size() > 0) {
                m13022a(500);
            } else {
                m13039e();
            }
        }

        /* JADX INFO: renamed from: d */
        private void m13038d(qg3 qg3Var) {
            final xs0 basePacket = qg3Var.getBasePacket();
            if (basePacket == null) {
                return;
            }
            if (basePacket.getHasResponse() == 1) {
                this.f46761f.remove(qg3Var);
            } else {
                this.f46760e.remove(qg3Var);
            }
            final rb2 callback = qg3Var.getCallback();
            ig3.this.f46752b.post(new Runnable() { // from class: hg3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43407a.m13027a(basePacket, callback);
                }
            });
        }

        /* JADX INFO: renamed from: e */
        private void m13039e() {
            C7271c c7271c = this.f46762m;
            if (c7271c == null || !c7271c.f46765b) {
                return;
            }
            dh8.m9156i(ig3.f46750e, "-stopTimer- >>> ");
            this.f46762m.m13048a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public void m13043f() {
            if (this.f46757b) {
                synchronized (this.f46759d) {
                    try {
                        if (this.f46757b) {
                            dh8.m9156i(ig3.f46750e, "wakeUpThread:: notifyAll");
                            this.f46759d.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private ArrayList<qg3> m13030b() {
            if (this.f46761f.size() <= 0) {
                return null;
            }
            ArrayList<qg3> arrayList = new ArrayList<>();
            for (qg3 qg3Var : this.f46761f) {
                if (qg3Var.isSend()) {
                    arrayList.add(qg3Var);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: e */
        private void m13041e(qg3 qg3Var) {
            byte[] bArrPackSendBasePacket = qhc.packSendBasePacket(qg3Var.getBasePacket());
            if (bArrPackSendBasePacket == null) {
                dh8.m9156i(ig3.f46750e, "send data :: pack data error.");
                m13038d(qg3Var);
                return;
            }
            int iM13020a = m13020a(qg3Var.getDevice());
            dh8.m9156i(ig3.f46750e, "send data : [" + pk1.byte2HexStr(bArrPackSendBasePacket) + "], sendMtu = " + iM13020a);
            if (bArrPackSendBasePacket.length > iM13020a + 8) {
                dh8.m9154e(ig3.f46750e, "send data over communication mtu [" + iM13020a + "] limit.");
                m13038d(qg3Var);
                return;
            }
            boolean zSendDataToDevice = false;
            for (int i = 0; i < 3; i++) {
                if (ig3.this.f46751a != null) {
                    zSendDataToDevice = ig3.this.f46751a.sendDataToDevice(ig3.this.f46751a.getConnectedDevice(), bArrPackSendBasePacket);
                }
                if (zSendDataToDevice) {
                    break;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            dh8.m9156i(ig3.f46750e, "send ret : " + zSendDataToDevice);
            if (!zSendDataToDevice) {
                m13038d(qg3Var);
                return;
            }
            if (qg3Var.getBasePacket().getHasResponse() == 1) {
                qg3Var.setSend(true);
                qg3Var.setSendTime(Calendar.getInstance().getTimeInMillis());
            } else {
                final rb2 callback = qg3Var.getCallback();
                if (callback != null) {
                    ig3.this.f46752b.post(new Runnable() { // from class: fg3
                        @Override // java.lang.Runnable
                        public final void run() {
                            callback.onCommandResponse(null);
                        }
                    });
                }
                this.f46760e.remove(qg3Var);
            }
        }

        /* JADX INFO: renamed from: a */
        private int m13020a(BluetoothDevice bluetoothDevice) {
            return ig3.this.f46751a.getCommunicationMtu(bluetoothDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m13027a(xs0 xs0Var, rb2 rb2Var) {
            cr0 cr0VarBuildError = mjb.buildError(u45.f86787k);
            cr0VarBuildError.setOpCode(xs0Var.getOpCode());
            if (rb2Var != null) {
                rb2Var.onErrCode(cr0VarBuildError);
            }
            ig3.this.f46751a.errorEventCallback(cr0VarBuildError);
        }

        /* JADX INFO: renamed from: b */
        private void m13031b(qg3 qg3Var) {
            final rb2 callback = qg3Var.getCallback();
            ig3.this.f46751a.removeCacheCommand(qg3Var.getDevice(), qg3Var.getBasePacket());
            ig3.this.f46752b.post(new Runnable() { // from class: gg3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39756a.m13025a(callback);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        private qg3 m13036d() {
            int i = 0;
            if (this.f46760e.size() > 0) {
                while (i < this.f46760e.size()) {
                    qg3 qg3Var = this.f46760e.get(i);
                    if (!qg3Var.isSend()) {
                        return qg3Var;
                    }
                    i++;
                }
                return null;
            }
            if (this.f46761f.size() <= 0) {
                return null;
            }
            while (i < this.f46761f.size()) {
                qg3 qg3Var2 = this.f46761f.get(i);
                if (!qg3Var2.isSend()) {
                    return qg3Var2;
                }
                i++;
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        private void m13034c(qg3 qg3Var) {
            if (qg3Var != null) {
                if (qg3Var.getType() == 1) {
                    ArrayList<xs0> arrayListFindPacketData = qhc.findPacketData(qg3Var.getDevice(), m13029b(qg3Var.getDevice()), qg3Var.getRecvData());
                    if (arrayListFindPacketData != null) {
                        ArrayList<xs0> arrayList = this.f46758c;
                        if (arrayList != null && arrayList.size() != 0) {
                            this.f46758c.addAll(arrayListFindPacketData);
                        } else {
                            this.f46758c = arrayListFindPacketData;
                        }
                        int size = arrayListFindPacketData.size();
                        int i = 0;
                        while (i < size) {
                            xs0 xs0Var = arrayListFindPacketData.get(i);
                            i++;
                            dh8.m9151d(ig3.f46750e, "-handlerQueue- opCode : " + xs0Var.getOpCode());
                        }
                        m13043f();
                        return;
                    }
                    dh8.m9154e(ig3.f46750e, "-handlerQueue- findPacketData not found. ");
                    return;
                }
                if (qg3Var.getBasePacket() != null) {
                    if (qg3Var.getBasePacket().getHasResponse() == 1) {
                        if (this.f46761f.size() < 30) {
                            this.f46761f.add(qg3Var);
                            return;
                        } else {
                            dh8.m9156i(ig3.f46750e, "-handlerQueue- haveResponseDataList is busy. ");
                            ig3.this.f46751a.errorEventCallback(mjb.buildError(u45.f86788l));
                            return;
                        }
                    }
                    if (this.f46760e.size() < 60) {
                        this.f46760e.add(qg3Var);
                    } else {
                        dh8.m9156i(ig3.f46750e, "-handlerQueue- noResponseDataList is busy. ");
                        ig3.this.f46751a.errorEventCallback(mjb.buildError(u45.f86788l));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private boolean m13028a(qg3 qg3Var) {
            boolean zOffer;
            if (qg3Var != null) {
                try {
                    zOffer = this.f46759d.offer(qg3Var, 3L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    zOffer = false;
                }
            } else {
                zOffer = false;
            }
            if (zOffer) {
                m13043f();
            }
            return zOffer;
        }

        /* JADX INFO: renamed from: a */
        private void m13021a() {
            ArrayList<xs0> arrayList = new ArrayList<>();
            ArrayList<xs0> arrayList2 = this.f46758c;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList(this.f46758c);
                int size = arrayList5.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList5.get(i);
                    i++;
                    xs0 xs0Var = (xs0) obj;
                    byte[] bArrPackSendBasePacket = qhc.packSendBasePacket(xs0Var);
                    if (bArrPackSendBasePacket != null) {
                        if (ig3.this.f46751a != null) {
                            ig3.this.f46751a.receiveDataFromDevice(ig3.this.f46751a.getConnectedDevice(), bArrPackSendBasePacket);
                        }
                        if (xs0Var.getType() == 1) {
                            arrayList3.add(xs0Var);
                        } else {
                            arrayList.add(xs0Var);
                        }
                    } else {
                        arrayList4.add(xs0Var);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    this.f46758c.removeAll(arrayList3);
                }
                if (arrayList4.size() > 0) {
                    this.f46758c.removeAll(arrayList4);
                }
                m13024a(arrayList);
                return;
            }
            m13024a((ArrayList<xs0>) null);
        }

        /* JADX INFO: renamed from: a */
        private void m13024a(ArrayList<xs0> arrayList) {
            ArrayList<qg3> arrayList2;
            int i;
            String str;
            ArrayList<qg3> arrayListM13030b;
            ArrayList arrayList3;
            int i2;
            ArrayList<qg3> arrayList4;
            String str2;
            ArrayList<xs0> arrayList5 = arrayList;
            int size = this.f46761f.size();
            String str3 = ig3.f46750e;
            if (size > 0) {
                ArrayList<qg3> arrayListM13030b2 = m13030b();
                StringBuilder sb = new StringBuilder();
                sb.append("-checkHaveResponseList- waitList size : ");
                sb.append(arrayListM13030b2 == null ? 0 : arrayListM13030b2.size());
                dh8.m9160w(ig3.f46750e, sb.toString());
                if (arrayListM13030b2 == null || arrayListM13030b2.size() <= 0) {
                    return;
                }
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                String str4 = ", data : ";
                if (arrayList5 != null && arrayList.size() > 0) {
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        int i4 = i3 + 1;
                        final xs0 xs0Var = arrayList5.get(i3);
                        dh8.m9160w(str3, "-checkHaveResponseList- opCode : " + xs0Var.getOpCode() + ", sn : " + xs0Var.getOpCodeSn());
                        int size3 = arrayListM13030b2.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                i2 = size2;
                                arrayList4 = arrayListM13030b2;
                                str2 = str3;
                                break;
                            }
                            qg3 qg3Var = arrayListM13030b2.get(i5);
                            i5++;
                            final qg3 qg3Var2 = qg3Var;
                            final xs0 basePacket = qg3Var2.getBasePacket();
                            if (basePacket != null) {
                                dh8.m9160w(str3, "-checkHaveResponseList- packet opCode : " + basePacket.getOpCode() + ", packet sn : " + basePacket.getOpCodeSn());
                            }
                            if (basePacket != null && basePacket.getOpCode() == xs0Var.getOpCode() && basePacket.getOpCodeSn() == xs0Var.getOpCodeSn()) {
                                dh8.m9160w(str3, "-checkHaveResponseList- callback");
                                final rb2 callback = qg3Var2.getCallback();
                                arrayList4 = arrayListM13030b2;
                                i2 = size2;
                                ig3.this.f46752b.post(new Runnable() { // from class: eg3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f32927a.m13026a(callback, xs0Var, qg3Var2, basePacket);
                                    }
                                });
                                arrayList6.add(xs0Var);
                                arrayList7.add(qg3Var2);
                                str2 = str3;
                                str4 = str4;
                                break;
                            }
                            int i6 = size2;
                            String str5 = str4;
                            ArrayList<qg3> arrayList8 = arrayListM13030b2;
                            if (qg3Var2.getTimeoutMs() < 500) {
                                qg3Var2.setTimeoutMs(500);
                            }
                            String str6 = str3;
                            if (timeInMillis - qg3Var2.getSendTime() > qg3Var2.getTimeoutMs()) {
                                int reSendCount = qg3Var2.getReSendCount();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("wait for response timeout !!! reSend count : ");
                                sb2.append(reSendCount);
                                str4 = str5;
                                sb2.append(str4);
                                sb2.append(qg3Var2);
                                dh8.m9154e(str6, sb2.toString());
                                if (reSendCount >= 3) {
                                    dh8.m9154e(str6, "retry count over time, callbackTimeOutError.");
                                    m13031b(qg3Var2);
                                    arrayList6.add(xs0Var);
                                    arrayList7.add(qg3Var2);
                                } else {
                                    qg3Var2.setReSendCount(reSendCount + 1);
                                    qg3Var2.setSend(false);
                                }
                            } else {
                                str4 = str5;
                            }
                            str3 = str6;
                            arrayListM13030b2 = arrayList8;
                            size2 = i6;
                        }
                        arrayList5 = arrayList;
                        str3 = str2;
                        i3 = i4;
                        arrayListM13030b2 = arrayList4;
                        size2 = i2;
                    }
                    arrayList2 = arrayListM13030b2;
                    str = str3;
                    if (arrayList6.size() <= 0 || this.f46758c == null) {
                        arrayList3 = arrayList;
                        i = 500;
                    } else {
                        arrayList3 = arrayList;
                        i = 500;
                        arrayList3.removeAll(arrayList6);
                        this.f46758c.removeAll(arrayList6);
                    }
                    if (arrayList.size() > 0 && this.f46758c != null) {
                        dh8.m9154e(str, "-checkHaveResponseList- remove unused response.");
                        this.f46758c.removeAll(arrayList3);
                    }
                    if (arrayList7.size() > 0) {
                        this.f46761f.removeAll(arrayList7);
                        arrayList7.clear();
                        arrayListM13030b = m13030b();
                    }
                    if (arrayListM13030b != null || arrayListM13030b.size() <= 0) {
                        return;
                    }
                    int size4 = arrayListM13030b.size();
                    int i7 = 0;
                    while (i7 < size4) {
                        qg3 qg3Var3 = arrayListM13030b.get(i7);
                        i7++;
                        qg3 qg3Var4 = qg3Var3;
                        if (qg3Var4.getTimeoutMs() < i) {
                            qg3Var4.setTimeoutMs(i);
                        }
                        if (timeInMillis - qg3Var4.getSendTime() > qg3Var4.getTimeoutMs()) {
                            int reSendCount2 = qg3Var4.getReSendCount();
                            dh8.m9154e(str, "wait for response timeout 222222 !!! reSend count : " + reSendCount2 + str4 + qg3Var4);
                            if (reSendCount2 >= 3) {
                                dh8.m9154e(str, "retry count over time 222222, callbackTimeOutError.");
                                m13031b(qg3Var4);
                                arrayList7.add(qg3Var4);
                            } else {
                                qg3Var4.setReSendCount(reSendCount2 + 1);
                                qg3Var4.setSend(false);
                            }
                        }
                    }
                    if (arrayList7.size() > 0) {
                        this.f46761f.removeAll(arrayList7);
                        return;
                    }
                    return;
                }
                arrayList2 = arrayListM13030b2;
                i = 500;
                str = ig3.f46750e;
                arrayListM13030b = arrayList2;
                if (arrayListM13030b != null) {
                    return;
                } else {
                    return;
                }
            }
            if (arrayList5 == null || arrayList.size() <= 0 || this.f46758c == null) {
                return;
            }
            dh8.m9154e(ig3.f46750e, "-checkHaveResponseList- 22222 remove unused response.");
            this.f46758c.removeAll(arrayList5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m13026a(rb2 rb2Var, xs0 xs0Var, qg3 qg3Var, xs0 xs0Var2) {
            if (rb2Var != null) {
                ob2 ob2VarConvert2Command = qhc.convert2Command(xs0Var, ig3.this.f46751a.getCacheCommand(qg3Var.getDevice(), xs0Var));
                if (ob2VarConvert2Command == null) {
                    rb2Var.onErrCode(mjb.buildError(u45.f86790n));
                } else {
                    rb2Var.onCommandResponse(ob2VarConvert2Command);
                }
            }
            ig3.this.f46751a.removeCacheCommand(qg3Var.getDevice(), xs0Var2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m13025a(rb2 rb2Var) {
            cr0 cr0VarBuildError = mjb.buildError(u45.f86791o);
            if (rb2Var != null) {
                rb2Var.onErrCode(cr0VarBuildError);
            }
            ig3.this.f46751a.errorEventCallback(cr0VarBuildError);
        }
    }

    /* JADX INFO: renamed from: ig3$b */
    public interface InterfaceC7270b {
        void onFinish(long j);

        void onStart(long j);
    }

    /* JADX INFO: renamed from: ig3$c */
    public class C7271c extends Thread {

        /* JADX INFO: renamed from: a */
        public final long f46764a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f46765b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7270b f46766c;

        public C7271c(long j, InterfaceC7270b interfaceC7270b) {
            super("TimerThread");
            this.f46764a = j;
            this.f46766c = interfaceC7270b;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m13048a() {
            this.f46765b = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.f46765b) {
                try {
                    Thread.sleep(this.f46764a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ig3.this.f46754d == null) {
                    break;
                } else {
                    ig3.this.f46754d.m13043f();
                }
            }
            this.f46765b = false;
            dh8.m9160w(ig3.f46750e, "TimerThread is end....name : " + getName());
            InterfaceC7270b interfaceC7270b = this.f46766c;
            if (interfaceC7270b != null) {
                interfaceC7270b.onFinish(getId());
            }
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.f46765b = true;
            super.start();
            dh8.m9160w(ig3.f46750e, "TimerThread is start....name : " + getName());
            InterfaceC7270b interfaceC7270b = this.f46766c;
            if (interfaceC7270b != null) {
                interfaceC7270b.onStart(getId());
            }
        }
    }

    /* JADX INFO: renamed from: ig3$d */
    public class HandlerThreadC7272d extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: c */
        public static final int f46768c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f46769d = 2;

        /* JADX INFO: renamed from: a */
        public Handler f46770a;

        public HandlerThreadC7272d(String str) {
            super(str, 10);
        }

        public Handler getWorkHandler() {
            if (this.f46770a == null) {
                this.f46770a = new Handler(getLooper(), this);
            }
            return this.f46770a;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@efb Message message) {
            int i = message.what;
            if (i == 1) {
                qg3 qg3Var = (qg3) message.obj;
                if (ig3.this.f46754d == null) {
                    return false;
                }
                ig3.this.f46754d.tryToAddSendData(qg3Var);
                return false;
            }
            if (i != 2) {
                return false;
            }
            qg3 qg3Var2 = (qg3) message.obj;
            if (ig3.this.f46754d == null || qg3Var2 == null) {
                return false;
            }
            ig3.this.f46754d.tryToAddRecvData(qg3Var2);
            return false;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.f46770a = new Handler(getLooper(), this);
        }

        public void tryToAddRecvData(qg3 qg3Var) {
            if (this.f46770a == null) {
                this.f46770a = new Handler(getLooper(), this);
            }
            Message messageObtainMessage = this.f46770a.obtainMessage();
            messageObtainMessage.what = 2;
            messageObtainMessage.obj = qg3Var;
            this.f46770a.sendMessage(messageObtainMessage);
        }

        public void tryToAddSendData(qg3 qg3Var) {
            if (this.f46770a == null) {
                this.f46770a = new Handler(getLooper(), this);
            }
            Message messageObtainMessage = this.f46770a.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = qg3Var;
            this.f46770a.sendMessage(messageObtainMessage);
        }
    }

    public ig3(AbstractC3831a abstractC3831a) {
        this.f46751a = abstractC3831a;
        m13013a();
    }

    @Override // p000.tp7
    public void addRecvData(qg3 qg3Var) {
        if (this.f46753c == null) {
            m13013a();
        }
        this.f46753c.tryToAddRecvData(qg3Var);
    }

    @Override // p000.tp7
    public void addSendData(qg3 qg3Var) {
        if (this.f46753c == null) {
            m13013a();
        }
        this.f46753c.tryToAddSendData(qg3Var);
    }

    @Override // p000.tp7
    public void release() {
        dh8.m9154e(f46750e, "-release-");
        m13017c();
    }

    /* JADX INFO: renamed from: a */
    private void m13013a() {
        if (this.f46754d == null) {
            C7269a c7269a = new C7269a();
            this.f46754d = c7269a;
            c7269a.start();
            m13015b();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m13015b() {
        if (this.f46753c == null) {
            this.f46753c = new HandlerThreadC7272d("Work_Thread");
        }
        this.f46753c.start();
    }

    /* JADX INFO: renamed from: c */
    private void m13017c() {
        C7269a c7269a = this.f46754d;
        if (c7269a != null) {
            c7269a.stopThread();
        }
        m13019d();
    }

    /* JADX INFO: renamed from: d */
    private void m13019d() {
        HandlerThreadC7272d handlerThreadC7272d = this.f46753c;
        if (handlerThreadC7272d != null) {
            handlerThreadC7272d.quitSafely();
            this.f46753c = null;
        }
    }
}
