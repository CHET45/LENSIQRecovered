package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.database.device.DeviceInfoBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class k84 extends RecyclerView.Adapter<C8228c> {

    /* JADX INFO: renamed from: e */
    public static final String f52755e = "DeviceHistoryListAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f52756a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8229d f52757b;

    /* JADX INFO: renamed from: c */
    public List<DeviceInfoBean> f52758c;

    /* JADX INFO: renamed from: d */
    public String f52759d;

    /* JADX INFO: renamed from: k84$a */
    public class ViewOnClickListenerC8226a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DeviceInfoBean f52760a;

        public ViewOnClickListenerC8226a(final DeviceInfoBean val$deviceInfoBean) {
            this.f52760a = val$deviceInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            InterfaceC8229d interfaceC8229d = k84.this.f52757b;
            if (interfaceC8229d != null) {
                interfaceC8229d.click(this.f52760a);
            }
        }
    }

    /* JADX INFO: renamed from: k84$b */
    public class ViewOnLongClickListenerC8227b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DeviceInfoBean f52762a;

        public ViewOnLongClickListenerC8227b(final DeviceInfoBean val$deviceInfoBean) {
            this.f52762a = val$deviceInfoBean;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v) {
            InterfaceC8229d interfaceC8229d = k84.this.f52757b;
            if (interfaceC8229d == null) {
                return false;
            }
            interfaceC8229d.onLongClick(this.f52762a);
            return false;
        }
    }

    /* JADX INFO: renamed from: k84$c */
    public static class C8228c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public wf8 f52764a;

        public C8228c(wf8 binding) {
            super(binding.getRoot());
            this.f52764a = binding;
        }
    }

    /* JADX INFO: renamed from: k84$d */
    public interface InterfaceC8229d {
        void click(DeviceInfoBean deviceInfoBean);

        void onLongClick(DeviceInfoBean deviceInfoBean);
    }

    public k84(Context context, List<DeviceInfoBean> deviceList) {
        new ArrayList();
        this.f52759d = "";
        this.f52756a = context;
        this.f52758c = deviceList;
    }

    public void clear() {
        this.f52758c.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<DeviceInfoBean> list = this.f52758c;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f52758c.size();
    }

    public void setConnectingAddress(String connectingAddress) {
        this.f52759d = connectingAddress;
        notifyDataSetChanged();
    }

    public void setDeviceList(List<DeviceInfoBean> deviceList) {
        this.f52758c = deviceList;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(InterfaceC8229d onItemClickListener) {
        this.f52757b = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C8228c holder, int position) {
        try {
            wf8 wf8Var = holder.f52764a;
            DeviceInfoBean deviceInfoBean = this.f52758c.get(holder.getLayoutPosition());
            if (!TextUtils.isEmpty(deviceInfoBean.getName())) {
                wf8Var.f94096m.setText(deviceInfoBean.getName());
            }
            if (this.f52759d.equals(deviceInfoBean.getMac())) {
                wf8Var.f94093d.setVisibility(0);
                ComponentCallbacks2C2485a.with(this.f52756a).asGif().load(Integer.valueOf(C2531R.drawable.gif_reconnect)).diskCacheStrategy(ne4.f64120d).into(wf8Var.f94093d);
            } else {
                wf8Var.f94093d.setVisibility(8);
            }
            if (t77.f83923b.equals(deviceInfoBean.getMac())) {
                wf8Var.f94092c.setBackgroundResource(C2531R.drawable.bg_card_base_green_shape);
                wf8Var.f94095f.setText(this.f52756a.getString(C2531R.string.eyevue_status_connected));
                wf8Var.f94091b.setVisibility(8);
            } else {
                wf8Var.f94092c.setBackgroundResource(C2531R.drawable.bg_card_base_red_shape);
                wf8Var.f94095f.setText(this.f52756a.getString(C2531R.string.eyevue_status_disconnect));
                wf8Var.f94091b.setVisibility(0);
            }
            holder.itemView.setOnClickListener(new ViewOnClickListenerC8226a(deviceInfoBean));
            holder.itemView.setOnLongClickListener(new ViewOnLongClickListenerC8227b(deviceInfoBean));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C8228c onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new C8228c(wf8.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
