package p000;

import android.app.Dialog;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C2468a;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2475h;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.SupportDeviceBean;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.bluetooth.BluetoothUtil;
import com.eyevue.glassapp.bluetooth.manager.BluetoothCore;
import com.eyevue.glassapp.bluetooth.manager.ModUtils;
import com.eyevue.glassapp.utils.PermissionUtil;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import p000.dr2;
import p000.q84;
import p000.td9;

/* JADX INFO: loaded from: classes4.dex */
public class dr2 extends Dialog {

    /* JADX INFO: renamed from: o2 */
    public static final String f30427o2 = "support_device_list";

    /* JADX INFO: renamed from: p2 */
    public static final int f30428p2 = 0;

    /* JADX INFO: renamed from: q2 */
    public static final int f30429q2 = 1;

    /* JADX INFO: renamed from: r2 */
    public static final int f30430r2 = 2;

    /* JADX INFO: renamed from: s2 */
    public static final int f30431s2 = 3;

    /* JADX INFO: renamed from: t2 */
    public static final int f30432t2 = 4;

    /* JADX INFO: renamed from: u2 */
    public static final int f30433u2 = 5;

    /* JADX INFO: renamed from: v2 */
    public static final int f30434v2 = 6;

    /* JADX INFO: renamed from: w2 */
    public static final int f30435w2 = 7;

    /* JADX INFO: renamed from: x2 */
    public static final /* synthetic */ boolean f30436x2 = false;

    /* JADX INFO: renamed from: C */
    public TextView f30437C;

    /* JADX INFO: renamed from: F */
    public TextView f30438F;

    /* JADX INFO: renamed from: H */
    public ImageView f30439H;

    /* JADX INFO: renamed from: L */
    public ImageView f30440L;

    /* JADX INFO: renamed from: M */
    public CardView f30441M;

    /* JADX INFO: renamed from: M1 */
    public q84 f30442M1;

    /* JADX INFO: renamed from: N */
    public LinearLayout f30443N;

    /* JADX INFO: renamed from: Q */
    public ImageView f30444Q;

    /* JADX INFO: renamed from: V1 */
    public LinearLayout f30445V1;

    /* JADX INFO: renamed from: X */
    public ConstraintLayout f30446X;

    /* JADX INFO: renamed from: Y */
    public ConstraintLayout f30447Y;

    /* JADX INFO: renamed from: Z */
    public RecyclerView f30448Z;

    /* JADX INFO: renamed from: Z1 */
    public LinearLayout f30449Z1;

    /* JADX INFO: renamed from: a */
    public final String f30450a;

    /* JADX INFO: renamed from: a2 */
    public RelativeLayout f30451a2;

    /* JADX INFO: renamed from: b */
    public final String f30452b;

    /* JADX INFO: renamed from: b2 */
    public RelativeLayout f30453b2;

    /* JADX INFO: renamed from: c */
    public Context f30454c;

    /* JADX INFO: renamed from: c2 */
    public ImageView f30455c2;

    /* JADX INFO: renamed from: d */
    public InterfaceC4923l f30456d;

    /* JADX INFO: renamed from: d2 */
    public TextView f30457d2;

    /* JADX INFO: renamed from: e */
    public TextView f30458e;

    /* JADX INFO: renamed from: e2 */
    public TextView f30459e2;

    /* JADX INFO: renamed from: f */
    public ImageView f30460f;

    /* JADX INFO: renamed from: f2 */
    public TextView f30461f2;

    /* JADX INFO: renamed from: g2 */
    public TextView f30462g2;

    /* JADX INFO: renamed from: h2 */
    public String f30463h2;

    /* JADX INFO: renamed from: i2 */
    public int f30464i2;

    /* JADX INFO: renamed from: j2 */
    public HashSet<String> f30465j2;

    /* JADX INFO: renamed from: k2 */
    public td9 f30466k2;

    /* JADX INFO: renamed from: l2 */
    public boolean f30467l2;

    /* JADX INFO: renamed from: m */
    public VideoView f30468m;

    /* JADX INFO: renamed from: m2 */
    public ImageView f30469m2;

    /* JADX INFO: renamed from: n2 */
    public TextView f30470n2;

    /* JADX INFO: renamed from: dr2$a */
    public class C4912a implements td9.InterfaceC12994a {
        public C4912a() {
        }

        @Override // p000.td9.InterfaceC12994a
        public void onOk() {
        }
    }

    /* JADX INFO: renamed from: dr2$b */
    public class C4913b implements C2475h.f {
        public C4913b() {
        }

        @Override // com.blankj.utilcode.util.C2475h.f
        public void onDenied() {
            dr2.this.dismissLocationDialog();
        }

        @Override // com.blankj.utilcode.util.C2475h.f
        public void onGranted() {
            dr2.this.dismissLocationDialog();
            dr2.this.showSearchDeviceView();
        }
    }

    /* JADX INFO: renamed from: dr2$c */
    public class ViewOnClickListenerC4914c implements View.OnClickListener {
        public ViewOnClickListenerC4914c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dr2.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: dr2$d */
    public class ViewOnClickListenerC4915d implements View.OnClickListener {
        public ViewOnClickListenerC4915d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
            intent.addFlags(268435456);
            dr2.this.f30454c.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: dr2$e */
    public class ViewOnClickListenerC4916e implements View.OnClickListener {
        public ViewOnClickListenerC4916e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dr2.this.showSearchDeviceView();
        }
    }

    /* JADX INFO: renamed from: dr2$f */
    public class ViewOnClickListenerC4917f implements View.OnClickListener {
        public ViewOnClickListenerC4917f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dr2.this.showIgnoreView();
        }
    }

    /* JADX INFO: renamed from: dr2$g */
    public class ViewOnClickListenerC4918g implements View.OnClickListener {
        public ViewOnClickListenerC4918g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dr2.this.showConnectFail();
        }
    }

    /* JADX INFO: renamed from: dr2$h */
    public class C4919h implements BluetoothCore.ConnectionCallback {
        public C4919h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConnected$0() {
            dr2.this.showConnectSuccess();
            dr2.this.f30467l2 = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDisconnected$1() {
            dr2.this.f30467l2 = false;
            dr2.this.showConnectFail();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$2() {
            dr2.this.f30467l2 = false;
            dr2.this.showConnectFail();
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore.ConnectionCallback
        public void onConnected(BluetoothDevice device) {
            C2478k.runOnUiThread(new Runnable() { // from class: fr2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37531a.lambda$onConnected$0();
                }
            });
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore.ConnectionCallback
        public void onDisconnected() {
            C2478k.runOnUiThread(new Runnable() { // from class: gr2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40813a.lambda$onDisconnected$1();
                }
            });
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore.ConnectionCallback
        public void onError(String error) {
            C2478k.runOnUiThread(new Runnable() { // from class: er2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33877a.lambda$onError$2();
                }
            });
        }
    }

    /* JADX INFO: renamed from: dr2$i */
    public class ViewOnClickListenerC4920i implements View.OnClickListener {
        public ViewOnClickListenerC4920i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            dr2.this.f30440L.setVisibility(8);
            dr2.this.f30468m.seekTo(0);
            dr2.this.f30468m.start();
        }
    }

    /* JADX INFO: renamed from: dr2$j */
    public class C4921j implements BluetoothCore.ScanDeviceCallback {

        /* JADX INFO: renamed from: dr2$j$a */
        public class a extends nmh<List<SupportDeviceBean>> {
            public a() {
            }
        }

        public C4921j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onDeviceFound$0(String str, SupportDeviceBean supportDeviceBean) {
            return str.contains(supportDeviceBean.getBtName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onScanTimeout$1() {
            if (dr2.this.f30467l2) {
                return;
            }
            if (dr2.this.f30442M1 == null || dr2.this.f30442M1.getItemCount() == 0) {
                dr2.this.showSearchNoneDeviceView();
            }
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore.ScanDeviceCallback
        public void onDeviceFound(BluetoothDevice device, ScanRecord scanRecord) {
            if (device == null || TextUtils.isEmpty(device.getName())) {
                return;
            }
            final String name = device.getName();
            try {
                List list = (List) sc7.fromJson(vfe.getInstance().getString(dr2.f30427o2, "[{\"btName\":\"GlassS2\"},{\"btName\":\"AG66\"},{\"btName\":\"G600S\"},{\"btName\":\"SG-02\"}]"), new a().getType());
                if (list != null && !list.isEmpty()) {
                    boolean zAnyMatch = list.stream().anyMatch(new Predicate() { // from class: hr2
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return dr2.C4921j.lambda$onDeviceFound$0(name, (SupportDeviceBean) obj);
                        }
                    });
                    if (!dr2.this.f30465j2.contains(device.getAddress()) && zAnyMatch) {
                        dr2.this.f30465j2.add(device.getAddress());
                        dr2.this.showDeviceListView();
                        if (dr2.this.f30442M1 != null) {
                            dr2.this.f30442M1.addData(device);
                        }
                    }
                } else if (!dr2.this.f30465j2.contains(device.getAddress()) && (name.contains("GlassS2") || name.contains("SG-02") || name.contains("AG66"))) {
                    dr2.this.f30465j2.add(device.getAddress());
                    dr2.this.showDeviceListView();
                    if (dr2.this.f30442M1 != null) {
                        dr2.this.f30442M1.addData(device);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore.ScanDeviceCallback
        public void onScanTimeout() {
            C2478k.runOnUiThread(new Runnable() { // from class: ir2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48021a.lambda$onScanTimeout$1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: dr2$k */
    public class C4922k implements q84.InterfaceC11346c {
        public C4922k() {
        }

        @Override // p000.q84.InterfaceC11346c
        public void click(BluetoothDevice bluetoothDevice) {
            if (BluetoothUtil.isBluetoothEnable()) {
                dr2.this.connectDevice(bluetoothDevice.getName(), bluetoothDevice.getAddress());
            } else {
                ToastUtils.showShort(dr2.this.f30454c.getString(C2531R.string.eyevue_bluetooth_is_close));
            }
        }
    }

    /* JADX INFO: renamed from: dr2$l */
    public interface InterfaceC4923l {
        void onFinish();
    }

    public dr2(@efb Context context, int curType, InterfaceC4923l listener) {
        super(context, C2531R.style.custom_dialog);
        this.f30450a = "ConnectGuidDialog";
        this.f30452b = "[{\"btName\":\"GlassS2\"},{\"btName\":\"AG66\"},{\"btName\":\"G600S\"},{\"btName\":\"SG-02\"}]";
        this.f30464i2 = 0;
        this.f30465j2 = new HashSet<>();
        this.f30456d = listener;
        this.f30464i2 = curType;
        this.f30454c = context;
        initView();
    }

    public static String addColonsWithRegex(String input) {
        return (input == null || input.length() % 2 != 0) ? input : input.replaceAll("(.{2})(?!$)", "$1:");
    }

    private void adjustWindow() {
        Window window = getWindow();
        window.setGravity(80);
        window.getDecorView().setSystemUiVisibility(260);
        window.getAttributes().width = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectDevice(String name, String address) {
        zi9.m26852e("ConnectGuidDialog", "连接::" + address + "::" + name);
        this.f30467l2 = true;
        ModUtils.bleCore.disconnect();
        ModUtils.bleCore.connect(address);
        ModUtils.bleCore.stopScan();
        C2478k.runOnUiThreadDelayed(new Runnable() { // from class: cr2
            @Override // java.lang.Runnable
            public final void run() {
                this.f27122a.showConnectingView();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissLocationDialog() {
        td9 td9Var = this.f30466k2;
        if (td9Var != null) {
            if (td9Var.isShowing()) {
                this.f30466k2.dismiss();
            }
            this.f30466k2 = null;
        }
    }

    @igg({"MissingInflatedId"})
    private void initView() {
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(C2531R.style.BottomToTopAnim);
        window.getDecorView().setPadding(0, 0, 0, 0);
        setCanceledOnTouchOutside(false);
        setContentView(C2558R.layout.dialog_connect_guide);
        this.f30463h2 = this.f30454c.getResources().getConfiguration().locale.toString();
        this.f30458e = (TextView) findViewById(C2558R.id.tv_title);
        this.f30460f = (ImageView) findViewById(C2558R.id.iv_close);
        this.f30439H = (ImageView) findViewById(C2558R.id.iv_guide_img);
        this.f30440L = (ImageView) findViewById(C2558R.id.video_start);
        this.f30468m = (VideoView) findViewById(C2558R.id.video_view);
        this.f30437C = (TextView) findViewById(C2558R.id.tv_guide_desc);
        this.f30438F = (TextView) findViewById(C2558R.id.btn_next);
        this.f30441M = (CardView) findViewById(C2558R.id.rl_guide_video);
        this.f30443N = (LinearLayout) findViewById(C2558R.id.ll_search);
        this.f30444Q = (ImageView) findViewById(C2558R.id.iv_search_anim);
        this.f30446X = (ConstraintLayout) findViewById(C2558R.id.cl_no_find);
        this.f30447Y = (ConstraintLayout) findViewById(C2558R.id.cl_guide);
        this.f30448Z = (RecyclerView) findViewById(C2558R.id.rv_device_list);
        this.f30445V1 = (LinearLayout) findViewById(C2558R.id.ll_connecting);
        this.f30449Z1 = (LinearLayout) findViewById(C2558R.id.ll_connect_success);
        this.f30451a2 = (RelativeLayout) findViewById(C2558R.id.rl_connect_fail);
        this.f30453b2 = (RelativeLayout) findViewById(C2558R.id.rl_ignore);
        this.f30455c2 = (ImageView) findViewById(C2558R.id.iv_ignore);
        this.f30470n2 = (TextView) findViewById(C2558R.id.tv_ignore);
        this.f30457d2 = (TextView) findViewById(C2558R.id.tv_tosetting);
        this.f30459e2 = (TextView) findViewById(C2558R.id.tv_cancel);
        this.f30461f2 = (TextView) findViewById(C2558R.id.tv_retry);
        this.f30462g2 = (TextView) findViewById(C2558R.id.tv_fail_solution);
        this.f30469m2 = (ImageView) findViewById(C2558R.id.iv_connect_anim);
        int i = this.f30464i2;
        if (i == 0) {
            showGuideView();
        } else if (i == 1) {
            showSearchDeviceView();
        } else if (i == 2) {
            showSearchNoneDeviceView();
        }
        this.f30460f.setOnClickListener(new View.OnClickListener() { // from class: ar2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11643a.lambda$initView$0(view);
            }
        });
        this.f30438F.setOnClickListener(new View.OnClickListener() { // from class: br2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14571a.lambda$initView$1(view);
            }
        });
        this.f30459e2.setOnClickListener(new ViewOnClickListenerC4914c());
        this.f30457d2.setOnClickListener(new ViewOnClickListenerC4915d());
        this.f30461f2.setOnClickListener(new ViewOnClickListenerC4916e());
        this.f30462g2.setOnClickListener(new ViewOnClickListenerC4917f());
        this.f30470n2.setOnClickListener(new ViewOnClickListenerC4918g());
        ModUtils.bleCore.setConnectionCallback(new C4919h());
        playVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        if (!BluetoothUtil.isBluetoothEnable()) {
            ToastUtils.showShort(this.f30454c.getString(C2531R.string.eyevue_bluetooth_is_close));
            return;
        }
        int i = this.f30464i2;
        if (i == 0) {
            showSearchDeviceView();
            return;
        }
        if (i == 1) {
            dismiss();
            return;
        }
        if (i == 2) {
            showSearchDeviceView();
            return;
        }
        if (i == 5) {
            dismiss();
            InterfaceC4923l interfaceC4923l = this.f30456d;
            if (interfaceC4923l != null) {
                interfaceC4923l.onFinish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playVideo$2(MediaPlayer mediaPlayer) {
        this.f30468m.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playVideo$3(MediaPlayer mediaPlayer) {
        C2473f.m4167d("CommonFragment", "Video completed");
        this.f30440L.setVisibility(0);
    }

    private void playVideo() {
        int identifier = this.f30454c.getResources().getIdentifier("glasses_pair_guide", "raw", this.f30454c.getPackageName());
        if (identifier == 0) {
            C2473f.m4168e("CommonFragment", "Resource not found for video: connect_guide");
            return;
        }
        this.f30468m.setVisibility(0);
        this.f30468m.setVideoURI(Uri.parse("android.resource://" + this.f30454c.getPackageName() + pj4.f71071b + identifier));
        this.f30468m.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: yq2
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                this.f102630a.lambda$playVideo$2(mediaPlayer);
            }
        });
        this.f30468m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: zq2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                this.f105738a.lambda$playVideo$3(mediaPlayer);
            }
        });
        this.f30440L.setOnClickListener(new ViewOnClickListenerC4920i());
    }

    private void requestLocationPermission() {
        C2475h.permission(xnc.f98583H, xnc.f98584I).callback(new C4913b()).request();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showConnectFail() {
        this.f30464i2 = 6;
        this.f30458e.setText("");
        this.f30446X.setVisibility(8);
        this.f30443N.setVisibility(8);
        this.f30447Y.setVisibility(8);
        this.f30448Z.setVisibility(8);
        this.f30445V1.setVisibility(8);
        this.f30438F.setVisibility(8);
        this.f30449Z1.setVisibility(8);
        this.f30453b2.setVisibility(8);
        this.f30451a2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showConnectSuccess() {
        this.f30464i2 = 5;
        this.f30458e.setText("");
        this.f30446X.setVisibility(8);
        this.f30443N.setVisibility(8);
        this.f30447Y.setVisibility(8);
        this.f30448Z.setVisibility(8);
        this.f30445V1.setVisibility(8);
        this.f30438F.setVisibility(0);
        this.f30438F.setText(this.f30454c.getString(C2531R.string.string_start_journey));
        this.f30449Z1.setVisibility(0);
        this.f30451a2.setVisibility(8);
        this.f30453b2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showConnectingView() {
        this.f30464i2 = 4;
        this.f30458e.setText("");
        this.f30446X.setVisibility(8);
        this.f30443N.setVisibility(8);
        this.f30447Y.setVisibility(8);
        this.f30448Z.setVisibility(8);
        this.f30438F.setVisibility(8);
        this.f30445V1.setVisibility(0);
        this.f30449Z1.setVisibility(8);
        this.f30451a2.setVisibility(8);
        this.f30453b2.setVisibility(8);
        ComponentCallbacks2C2485a.with(this.f30454c).asGif().load(Integer.valueOf(C2531R.drawable.gif_binding)).diskCacheStrategy(ne4.f64120d).into(this.f30469m2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDeviceListView() {
        if (this.f30464i2 == 3) {
            return;
        }
        this.f30464i2 = 3;
        this.f30458e.setText(this.f30454c.getString(C2531R.string.string_device_select_connect));
        this.f30446X.setVisibility(8);
        this.f30443N.setVisibility(8);
        this.f30447Y.setVisibility(8);
        this.f30448Z.setVisibility(0);
        this.f30438F.setVisibility(8);
        this.f30445V1.setVisibility(8);
        this.f30449Z1.setVisibility(8);
        this.f30451a2.setVisibility(8);
        this.f30453b2.setVisibility(8);
        if (this.f30442M1 == null) {
            q84 q84Var = new q84(this.f30454c);
            this.f30442M1 = q84Var;
            this.f30448Z.setAdapter(q84Var);
            this.f30448Z.setLayoutManager(new LinearLayoutManager(this.f30454c, 1, false));
            this.f30442M1.setOnItemClickListener(new C4922k());
        }
    }

    private void showGPSLocationDialog() {
        requestLocationPermission();
        td9 td9Var = new td9(C2468a.getTopActivity(), new C4912a());
        this.f30466k2 = td9Var;
        td9Var.show();
    }

    private void showGuideView() {
        this.f30464i2 = 0;
        String string = this.f30454c.getString(C2531R.string.string_pair_prepare_desc0);
        String string2 = this.f30454c.getString(C2531R.string.string_pair_prepare_desc1);
        String string3 = this.f30454c.getString(C2531R.string.string_pair_prepare_desc2);
        String string4 = this.f30454c.getString(C2531R.string.string_pair_prepare_desc3);
        String string5 = this.f30454c.getString(C2531R.string.string_pair_prepare_desc4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.append((CharSequence) string3);
        spannableStringBuilder.append((CharSequence) string4);
        spannableStringBuilder.append((CharSequence) string5);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f30454c.getColor(C2531R.color.base_blue)), string.length(), string.length() + string2.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f30454c.getColor(C2531R.color.base_blue)), string.length() + string2.length() + string3.length(), string.length() + string2.length() + string3.length() + string4.length(), 33);
        this.f30437C.setText(spannableStringBuilder);
        this.f30458e.setText(this.f30454c.getString(C2531R.string.string_pair_prepare_title));
        this.f30438F.setText(this.f30454c.getString(C2531R.string.string_pair_bluelight_desc));
        this.f30447Y.setVisibility(0);
        this.f30446X.setVisibility(8);
        this.f30443N.setVisibility(8);
        this.f30448Z.setVisibility(8);
        this.f30445V1.setVisibility(8);
        this.f30449Z1.setVisibility(8);
        this.f30451a2.setVisibility(8);
        this.f30453b2.setVisibility(8);
        this.f30438F.setVisibility(0);
        playVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showIgnoreView() {
        this.f30464i2 = 7;
        if (this.f30463h2.contains("zh")) {
            this.f30455c2.setImageResource(C2531R.drawable.img_ignore_zh);
        } else {
            this.f30455c2.setImageResource(C2531R.drawable.img_ignore_en);
        }
        this.f30458e.setText(this.f30454c.getString(C2531R.string.string_please_ignore));
        this.f30446X.setVisibility(8);
        this.f30443N.setVisibility(8);
        this.f30447Y.setVisibility(8);
        this.f30448Z.setVisibility(8);
        this.f30445V1.setVisibility(8);
        this.f30438F.setVisibility(8);
        this.f30449Z1.setVisibility(8);
        this.f30451a2.setVisibility(8);
        this.f30453b2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSearchDeviceView() {
        this.f30464i2 = 1;
        this.f30468m.pause();
        this.f30468m.setVisibility(8);
        this.f30440L.setVisibility(8);
        this.f30441M.setCardBackgroundColor(this.f30454c.getColor(C2531R.color.color_dialog_bg));
        this.f30446X.setVisibility(8);
        this.f30443N.setVisibility(0);
        this.f30447Y.setVisibility(8);
        this.f30448Z.setVisibility(8);
        this.f30445V1.setVisibility(8);
        this.f30438F.setVisibility(0);
        this.f30449Z1.setVisibility(8);
        this.f30451a2.setVisibility(8);
        this.f30453b2.setVisibility(8);
        this.f30458e.setText(this.f30454c.getString(C2531R.string.string_device_connecting));
        this.f30438F.setText(this.f30454c.getString(C2531R.string.cancel));
        ComponentCallbacks2C2485a.with(this.f30454c).asGif().load(Integer.valueOf(C2531R.drawable.img_glasses_find)).diskCacheStrategy(ne4.f64120d).into(this.f30444Q);
        if (!PermissionUtil.isHasLocationPermission(this.f30454c)) {
            showGPSLocationDialog();
            return;
        }
        this.f30465j2.clear();
        q84 q84Var = this.f30442M1;
        if (q84Var != null) {
            q84Var.clear();
        }
        ModUtils.bleCore.startScan(new C4921j(), 20000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSearchNoneDeviceView() {
        this.f30464i2 = 2;
        this.f30458e.setText("");
        this.f30438F.setVisibility(0);
        this.f30438F.setText(this.f30454c.getString(C2531R.string.eyevue_re_search));
        this.f30446X.setVisibility(0);
        this.f30443N.setVisibility(8);
        this.f30447Y.setVisibility(8);
        this.f30448Z.setVisibility(8);
        this.f30445V1.setVisibility(8);
        this.f30449Z1.setVisibility(8);
        this.f30451a2.setVisibility(8);
        this.f30453b2.setVisibility(8);
    }

    public boolean canShowFailView() {
        return this.f30464i2 != 3;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        ModUtils.bleCore.stopScan();
        if (this.f30464i2 == 4) {
            ModUtils.bleCore.disconnect();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adjustWindow();
    }

    public void setCurType(int curType) {
        this.f30464i2 = curType;
        if (curType == 0) {
            showGuideView();
            return;
        }
        if (curType == 1) {
            showSearchDeviceView();
        } else if (curType == 2) {
            showSearchNoneDeviceView();
        } else if (curType == 4) {
            showConnectingView();
        }
    }
}
