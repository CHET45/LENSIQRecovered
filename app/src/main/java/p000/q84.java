package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class q84 extends RecyclerView.Adapter<C11345b> {

    /* JADX INFO: renamed from: d */
    public static final String f73471d = "DeviceListAdapter";

    /* JADX INFO: renamed from: a */
    public final Context f73472a;

    /* JADX INFO: renamed from: b */
    public InterfaceC11346c f73473b;

    /* JADX INFO: renamed from: c */
    public List<BluetoothDevice> f73474c = new ArrayList();

    /* JADX INFO: renamed from: q84$a */
    public class ViewOnClickListenerC11344a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11345b f73475a;

        public ViewOnClickListenerC11344a(final C11345b val$holder) {
            this.f73475a = val$holder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            q84 q84Var = q84.this;
            InterfaceC11346c interfaceC11346c = q84Var.f73473b;
            if (interfaceC11346c != null) {
                interfaceC11346c.click((BluetoothDevice) q84Var.f73474c.get(this.f73475a.getLayoutPosition()));
            }
        }
    }

    /* JADX INFO: renamed from: q84$b */
    public static class C11345b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public xf8 f73477a;

        public C11345b(xf8 binding) {
            super(binding.getRoot());
            this.f73477a = binding;
        }
    }

    /* JADX INFO: renamed from: q84$c */
    public interface InterfaceC11346c {
        void click(BluetoothDevice bluetoothDevice);
    }

    public q84(Context context) {
        this.f73472a = context;
    }

    public void addData(BluetoothDevice device) {
        this.f73474c.add(device);
        notifyDataSetChanged();
    }

    public void clear() {
        this.f73474c.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<BluetoothDevice> list = this.f73474c;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f73474c.size();
    }

    public void setOnItemClickListener(InterfaceC11346c onItemClickListener) {
        this.f73473b = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@efb C11345b holder, int position) {
        try {
            xf8 xf8Var = holder.f73477a;
            if (!TextUtils.isEmpty(this.f73474c.get(holder.getLayoutPosition()).getName())) {
                xf8Var.f97636c.setText(this.f73474c.get(holder.getLayoutPosition()).getName());
            }
            holder.itemView.setOnClickListener(new ViewOnClickListenerC11344a(holder));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public C11345b onCreateViewHolder(@efb ViewGroup parent, int viewType) {
        return new C11345b(xf8.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }
}
