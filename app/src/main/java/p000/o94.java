package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.common.C2531R;
import com.eyevue.common.bean.DeviceSettingBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class o94 extends RecyclerView.Adapter<C10266b> {

    /* JADX INFO: renamed from: e */
    public static final String f66898e = "DeviceListAdapter";

    /* JADX INFO: renamed from: a */
    public Context f66899a;

    /* JADX INFO: renamed from: b */
    public InterfaceC10267c f66900b;

    /* JADX INFO: renamed from: c */
    public List<DeviceSettingBean> f66901c;

    /* JADX INFO: renamed from: d */
    public int f66902d;

    /* JADX INFO: renamed from: o94$a */
    public class ViewOnClickListenerC10265a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f66903a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f66904b;

        public ViewOnClickListenerC10265a(final int val$position, final int val$value) {
            this.f66903a = val$position;
            this.f66904b = val$value;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            o94 o94Var = o94.this;
            InterfaceC10267c interfaceC10267c = o94Var.f66900b;
            if (interfaceC10267c != null) {
                interfaceC10267c.click(((DeviceSettingBean) o94Var.f66901c.get(this.f66903a)).getSettingValue());
            }
            o94.this.f66902d = this.f66904b;
            o94.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o94$b */
    public static class C10266b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public yf8 f66906a;

        public C10266b(yf8 binding) {
            super(binding.getRoot());
            this.f66906a = binding;
        }
    }

    /* JADX INFO: renamed from: o94$c */
    public interface InterfaceC10267c {
        void click(int value);
    }

    public o94(Context context, List<DeviceSettingBean> list, int intValue) {
        this.f66901c = list;
        this.f66899a = context;
        this.f66902d = intValue;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<DeviceSettingBean> list = this.f66901c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void setOnItemClickListener(InterfaceC10267c onItemClickListener) {
        this.f66900b = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C10266b holder, int position) {
        try {
            yf8 yf8Var = holder.f66906a;
            yf8Var.f101404d.setText(this.f66901c.get(position).getSettingName());
            int intValue = this.f66901c.get(position).getIntValue();
            C2473f.m4167d("DeviceListAdapter", "intValue: " + this.f66902d + "  getIntValue(): " + intValue);
            if (this.f66902d == intValue) {
                yf8Var.f101402b.setBackgroundResource(C2531R.drawable.ic_device_setting_select);
            } else {
                yf8Var.f101402b.setBackgroundColor(this.f66899a.getColor(C2531R.color.transparent));
            }
            if (intValue == 600 || intValue == 420) {
                yf8Var.f101403c.setVisibility(0);
            } else {
                yf8Var.f101403c.setVisibility(8);
            }
            holder.itemView.setOnClickListener(new ViewOnClickListenerC10265a(position, intValue));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C10266b onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new C10266b(yf8.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
